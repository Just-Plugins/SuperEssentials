package me.justplugins.SuperEssentials.Commands.Gamemode;

import com.songoda.core.commands.AbstractCommand;
import com.songoda.core.locale.Message;
import me.justplugins.SuperEssentials.Utils.Permissions;
import me.justplugins.SuperEssentials.Utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class Spectator extends AbstractCommand {
    public Spectator() {
        super(CommandType.PLAYER_ONLY, false, "gmsp");
    }

    @Override
    protected ReturnType runCommand(CommandSender commandSender, String... strings) {
        Player player = (Player) commandSender;
        player.setGameMode(GameMode.SPECTATOR);
        new Message(Utils.Color("&fGamemode &7| &fSpectator")).sendActionBar(player);
        return null;
    }

    @Override
    protected List<String> onTab(CommandSender commandSender, String... strings) {
        ArrayList<String> players = new ArrayList<>();
        for (Player pl : Bukkit.getOnlinePlayers()) {
            players.add(pl.getName());
            break;
        }
        return players;
    }

    @Override
    public String getPermissionNode() {
        return Permissions.GAMEMODE_SPECTATOR.getPermission();
    }

    @Override
    public String getSyntax() {
        return "/gma";
    }

    @Override
    public String getDescription() {
        return "Sets player gamemode to Spectator";
    }
}