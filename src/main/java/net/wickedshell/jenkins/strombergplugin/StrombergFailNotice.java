package net.wickedshell.jenkins.strombergplugin;

import hudson.model.Action;

/**
 * Created by stefan on 06/08/16.
 */
public class StrombergFailNotice implements Action {

    private final int ordinalOfNotice;

    public StrombergFailNotice(String displayName, int number) {
        ordinalOfNotice = (displayName.hashCode() + number) % FailNotice.values().length;
    }

    @Override
    public String getIconFileName() {
        return null;
    }

    @Override
    public String getDisplayName() {
        return "Bernd Stromberg, Leiter Schadensregulierung";
    }

    @Override
    public String getUrlName() {
        return null;
    }

    public String getNotice(){
        return FailNotice.values()[ordinalOfNotice].getMessage();
    }
}
