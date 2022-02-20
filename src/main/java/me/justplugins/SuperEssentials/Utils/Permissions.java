package me.justplugins.SuperEssentials.Utils;

public enum Permissions {

    GAMEMODE_CREATIVE("gamemode.creative"),
    GAMEMODE_SURVIVAL("gamemode.survival"),
    GAMEMODE_ADVANTURE("gamemode.adventure"),
    GAMEMODE_SPECTATOR("gamemode.spectator"),

    TELEPORT_REQUEST_SEND("tp.request.send"),
    TELEPORT_REQUEST_ACCEPT("tp.request.accept"),
    TELEPORT_TO("tp"),
    TELEPORT_HERE("tp.here"),
    TELEPORT_HERE_ALL("tp.allhere"),

    WARP_TELEPORT("warp.teleport"),
    WARP_CREATE("warp.create"),
    WARP_REMOVE("warp.remove"),
    WARP_RENAME("warp.rename"),
    WARP_LIMIT(""), //todo: warp limit

    FLY("fly"),
    FLY_OTHER("fly.other"),

    //End
    END("end");



    private final String perm;

    Permissions(String perm) {
        this.perm = perm;
    }

    public final String getPermission() {
        return "SuperEssentials." + this.perm;
    }
}