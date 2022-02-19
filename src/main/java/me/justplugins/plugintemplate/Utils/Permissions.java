package me.justplugins.plugintemplate.Utils;

public enum Permissions {


    //End
    END("end");



    private final String perm;

    Permissions(String perm) {
        this.perm = perm;
    }

    public final String getPermission() {
        return "ultimateserverutils." + this.perm;
    }
}