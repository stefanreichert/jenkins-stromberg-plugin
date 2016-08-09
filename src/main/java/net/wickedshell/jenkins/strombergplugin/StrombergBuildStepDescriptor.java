package net.wickedshell.jenkins.strombergplugin;

import hudson.Extension;
import hudson.model.AbstractProject;
import hudson.tasks.BuildStepDescriptor;
import hudson.tasks.Publisher;

@Extension
public class StrombergBuildStepDescriptor extends BuildStepDescriptor<Publisher> {

    public StrombergBuildStepDescriptor() {
        super(DamageRecorder.class);
    }

    @Override
    public final String getDisplayName() {
        return "Kommentar vom Leiter der Abteilung Schadensregulierung";
    }

    @Override
    public final boolean isApplicable(
            final Class<? extends AbstractProject> clazz) {
        return true;
    }
}