package me.justplugins.SuperEssentials.Commands;

import com.songoda.core.commands.AbstractCommand;
import org.bukkit.command.CommandSender;

import java.util.List;

public class CommandTemplate extends AbstractCommand {
    protected CommandTemplate() {
        super(CommandType.PLAYER_ONLY,true,"");
    }

    @Override
    protected ReturnType runCommand(CommandSender commandSender, String[] args) {
        return null;
    }

    @Override
    protected List<String> onTab(CommandSender commandSender, String[] args) {
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
