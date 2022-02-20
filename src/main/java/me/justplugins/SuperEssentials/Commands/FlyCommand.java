package me.justplugins.SuperEssentials.Commands;

import com.songoda.core.commands.AbstractCommand;
import com.songoda.core.locale.Message;
import me.justplugins.SuperEssentials.Modules.FlyModule;
import me.justplugins.SuperEssentials.Utils.Permissions;
import me.justplugins.SuperEssentials.Utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class FlyCommand extends AbstractCommand {
    public FlyCommand() {
        super(CommandType.CONSOLE_OK,true, "fly");
    }

    @Override
    protected ReturnType runCommand(CommandSender commandSender, String... args) {
        Player player = (Player) commandSender;

        if (args.length > 0) {
            Player target = Bukkit.getPlayer(args[0]);
            if (target == null) return ReturnType.NEEDS_PLAYER;
            target.setFlying(!target.getAllowFlight());
            new FlyModule().FlyToggle(target);
        } else {
            new FlyModule().FlyToggle(player);
        }
        return ReturnType.SUCCESS;
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
        return Permissions.FLY.getPermission();
    }

    @Override
    public String getSyntax() {
        return "/fly [player]";
    }

    @Override
    public String getDescription() {
        return "Gives a Player the ability to fly";
    }
}
