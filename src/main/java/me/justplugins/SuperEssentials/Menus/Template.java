package me.justplugins.SuperEssentials.Menus;

import com.songoda.core.compatibility.CompatibleMaterial;
import com.songoda.core.compatibility.CompatibleSound;
import com.songoda.core.gui.Gui;
import com.songoda.core.gui.GuiUtils;
import me.justplugins.SuperEssentials.Main;
import me.justplugins.SuperEssentials.Utils.Utils;
import org.bukkit.entity.Player;

public class Template extends Gui {
    final Main plugin;
    public Template(Main plugin, Player player) {
        this.plugin = plugin;

        setTitle(Utils.Color("&8UltimateStaff"));
        setRows(5);
        setDefaultItem(CompatibleMaterial.AIR.getItem());
        setDefaultSound(CompatibleSound.BLOCK_NOTE_BLOCK_BIT);

        setButton(11, GuiUtils.createButtonItem(CompatibleMaterial.CHEST, Utils.Color("Test")), guiClickEvent -> {
        });

    }
}
