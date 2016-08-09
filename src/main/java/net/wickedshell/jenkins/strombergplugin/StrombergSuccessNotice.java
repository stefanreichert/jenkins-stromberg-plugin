package net.wickedshell.jenkins.strombergplugin;

import hudson.model.Action;

/**
 * Created by stefan on 06/08/16.
 */
public class StrombergSuccessNotice implements Action {

    private final int ordinalOfNotice;

    public StrombergSuccessNotice(String displayName, int number) {
        ordinalOfNotice = (displayName.hashCode() + number) % SuccessNotice.values().length;
    }

    @Override
    public String getIconFileName() {
        return null;
    }

    @Override
    public String getDisplayName() {
        return "Bernd Stromberg, Leiter Schadensabteilung";
    }

    @Override
    public String getUrlName() {
        return null;
    }

    public String getNotice(){
        return SuccessNotice.values()[ordinalOfNotice].getMessage();
    }
}
