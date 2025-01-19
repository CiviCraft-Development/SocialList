package net.civicraft.socialList.gui;

import com.github.stefvanschie.inventoryframework.gui.type.ChestGui;
import org.bukkit.entity.Player;

public class SocialsGUI {
    public static void socialsGUI(Player player) {
        // TODO: GUI size based on amount of socials
        ChestGui socials = new ChestGui(3, "Social Media");

        socials.show(player);
    }
}
