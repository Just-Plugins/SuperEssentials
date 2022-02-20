package me.justplugins.SuperEssentials.Modules;

import com.songoda.core.compatibility.CompatibleSound;
import com.songoda.core.locale.Message;
import me.justplugins.SuperEssentials.Utils.Utils;
import org.bukkit.entity.Player;

public class FlyModule {
    public void FlyToggle(Player player) {

        if (player.getAllowFlight()) {
            new Message(Utils.Color("&fFly &7| &cOff")).sendActionBar(player);
            player.playSound(player.getLocation(), CompatibleSound.BLOCK_NOTE_BLOCK_PLING.getSound(), 10, 0);
            player.setAllowFlight(false);
        } else {
            new Message(Utils.Color("&fFly &7| &aOn")).sendActionBar(player);
            player.playSound(player.getLocation(), CompatibleSound.BLOCK_NOTE_BLOCK_PLING.getSound(), 10, 1);
            player.setAllowFlight(true);
        }
    }
}
