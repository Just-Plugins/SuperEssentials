package me.justplugins.plugintemplate;

import me.justplugins.plugintemplate.Utils.ConsoleColors;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public final class PluginTemplate extends JavaPlugin {

    @Override
    public void onEnable() {
        long start = System.currentTimeMillis();
        String pluginName = "Ultimate";

        getLogger().log(Level.INFO, ConsoleColors.PURPLE_BACKGROUND_BRIGHT + pluginName + " || Loading..." + ConsoleColors.RESET);
        getLogger().log(Level.INFO, ConsoleColors.PURPLE_BACKGROUND_BRIGHT + pluginName + " || Loading Configs..." + ConsoleColors.RESET);

        // Configs


        getLogger().log(Level.INFO, ConsoleColors.PURPLE_BACKGROUND_BRIGHT + pluginName + " || Configs Done!" + ConsoleColors.RESET);
        getLogger().log(Level.INFO, ConsoleColors.PURPLE_BACKGROUND_BRIGHT + pluginName + " || Loading Commands..." + ConsoleColors.RESET);

        // Commands


        getLogger().log(Level.INFO, ConsoleColors.PURPLE_BACKGROUND_BRIGHT + pluginName + " || Commands Done!" + ConsoleColors.RESET);
        getLogger().log(Level.INFO, ConsoleColors.PURPLE_BACKGROUND_BRIGHT + pluginName + " || Loading Events..." + ConsoleColors.RESET);

        // Events


        getLogger().log(Level.INFO, ConsoleColors.PURPLE_BACKGROUND_BRIGHT + pluginName + " || Events Done!" + ConsoleColors.RESET);
        getLogger().log(Level.INFO, ConsoleColors.PURPLE_BACKGROUND_BRIGHT + pluginName + " || Successfully loaded in " + (System.currentTimeMillis() - start) + "ms" + ConsoleColors.RESET);
        getLogger().log(Level.INFO, ConsoleColors.PURPLE_BACKGROUND_BRIGHT + pluginName + " || All Rights Reserved" + ConsoleColors.RESET);

    }
}
