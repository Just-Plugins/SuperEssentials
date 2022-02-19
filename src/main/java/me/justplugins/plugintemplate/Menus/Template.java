package me.justplugins.plugintemplate.Menus;

import com.songoda.core.compatibility.CompatibleMaterial;
import com.songoda.core.compatibility.CompatibleSound;
import com.songoda.core.gui.Gui;
import com.songoda.core.gui.GuiUtils;
import me.justplugins.plugintemplate.PluginTemplate;
import me.justplugins.plugintemplate.Utils.Utils;
import org.bukkit.entity.Player;

public class Template extends Gui {
    final PluginTemplate plugin;
    public Template(PluginTemplate plugin, Player player) {
        this.plugin = plugin;

        setTitle(Utils.Color("&8UltimateStaff"));
        setRows(5);
        setDefaultItem(CompatibleMaterial.AIR.getItem());
        setDefaultSound(CompatibleSound.BLOCK_NOTE_BLOCK_BIT);

        setButton(11, GuiUtils.createButtonItem(CompatibleMaterial.CHEST, Utils.Color("Test")), guiClickEvent -> {
        });

    }
}
