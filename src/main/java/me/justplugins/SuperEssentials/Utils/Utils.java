package me.justplugins.SuperEssentials.Utils;

import org.bukkit.ChatColor;

public class Utils {

    /**
     * @param text add the string you want to colorize
     * @return the text with colours
     */
    public static String Color(String text) {
        return ChatColor.translateAlternateColorCodes('&', text);
    }

    /**
     * @param usage add the usage
     * @return the usage within a nice message
     */
    public static String Usage(String usage) {
        return Color(Prefix() + "&fUse " + usage + "");
    }

    /**
     * @param successes add the usage
     * @return the usage within a nice message
     */
    public static String Successes(String successes) {
        return Color(Prefix() + "&aSuccessfully " + successes + "");
    }

    /**
     * @param whatdoesntexist enter a subject that doesn't exist
     * @return the subject within a nice message
     */
    public static String DoesNotExist(String whatdoesntexist) {
        return Color(Prefix()  + "&f" + whatdoesntexist + " does not exist.");
    }

    /**
     * @param forwhat Add the subject the player doesn't have a permission for
     * @return the permission within a nice message
     */
    public static String NoPermission(String forwhat) {
        return Color(Prefix()  + "&fYou dont have permission to " + forwhat + "!");
    }

    /**
     * @return the prefix for the plugin
     */
    public static String Prefix() {
        return Color("&3SuperEssentials &7| ");
    }

}