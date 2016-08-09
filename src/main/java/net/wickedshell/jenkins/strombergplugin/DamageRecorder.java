package net.wickedshell.jenkins.strombergplugin;

import hudson.Launcher;
import hudson.model.AbstractBuild;
import hudson.model.BuildListener;
import hudson.model.Result;
import hudson.tasks.BuildStepMonitor;
import hudson.tasks.Recorder;
import org.kohsuke.stapler.DataBoundConstructor;

import java.io.IOException;

public class DamageRecorder extends Recorder {

    @DataBoundConstructor
    public DamageRecorder() {
    }

    @Override
    public boolean perform(AbstractBuild<?, ?> build, Launcher launcher, BuildListener listener) throws InterruptedException, IOException {
        if(Result.SUCCESS.equals(build.getResult())){
            build.addAction(new StrombergSuccessNotice(build.getDisplayName(), build.getNumber()));
        }
        else {
            build.addAction(new StrombergFailNotice(build.getDisplayName(), build.getNumber()));
        }
        return true;
    }

    @Override
    public BuildStepMonitor getRequiredMonitorService() {
        return BuildStepMonitor.NONE;
    }
}
