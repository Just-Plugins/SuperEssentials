package me.justplugins.SuperEssentials;

import com.songoda.core.commands.CommandManager;
import me.justplugins.SuperEssentials.Commands.FlyCommand;
import me.justplugins.SuperEssentials.Commands.Gamemode.Adventure;
import me.justplugins.SuperEssentials.Commands.Gamemode.Creative;
import me.justplugins.SuperEssentials.Commands.Gamemode.Spectator;
import me.justplugins.SuperEssentials.Commands.Gamemode.Survival;
import me.justplugins.SuperEssentials.Utils.ConsoleColors;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        long start = System.currentTimeMillis();
        String pluginName = "SuperEssentials";
        String color = ConsoleColors.CYAN;

        getLogger().log(Level.INFO, color + pluginName + " || Loading..." + ConsoleColors.RESET);
        getLogger().log(Level.INFO, color + pluginName + " || Loading Configs..." + ConsoleColors.RESET);

        // Configs


        getLogger().log(Level.INFO, color + pluginName + " || Configs Done!" + ConsoleColors.RESET);
        getLogger().log(Level.INFO, color + pluginName + " || Loading Commands..." + ConsoleColors.RESET);

        // Commands

        CommandManager commandManager = new CommandManager(this);
        commandManager.setNoPermsMessage("");
        commandManager.registerCommandDynamically(new FlyCommand());
        commandManager.registerCommandDynamically(new Adventure());
        commandManager.registerCommandDynamically(new Creative());
        commandManager.registerCommandDynamically(new Spectator());
        commandManager.registerCommandDynamically(new Survival());


        getLogger().log(Level.INFO, color + pluginName + " || Commands Done!" + ConsoleColors.RESET);
        getLogger().log(Level.INFO, color + pluginName + " || Loading Events..." + ConsoleColors.RESET);

        // Events


        getLogger().log(Level.INFO, color + pluginName + " || Events Done!" + ConsoleColors.RESET);
        getLogger().log(Level.INFO, color + pluginName + " || Successfully loaded in " + (System.currentTimeMillis() - start) + "ms" + ConsoleColors.RESET);
        getLogger().log(Level.INFO, color + pluginName + " || All Rights Reserved" + ConsoleColors.RESET);

    }
}
