package me.justplugins.plugintemplate.Commands;

import com.songoda.core.commands.AbstractCommand;
import org.bukkit.command.CommandSender;

import java.util.List;

public class CommandTemplate extends AbstractCommand {
    protected CommandTemplate(CommandType type, String... command) {
        super(type, command);
    }

    @Override
    protected ReturnType runCommand(CommandSender commandSender, String... strings) {
        return null;
    }

    @Override
    protected List<String> onTab(CommandSender commandSender, String... strings) {
        return null;
    }

    @Override
    public String getPermissionNode() {
        return null;
    }

    @Override
    public String getSyntax() {
        return null;
    }

    @Override
    public String getDescription() {
        return null;
    }
}
