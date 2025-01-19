package net.civicraft.socialList.command;

import net.civicraft.socialList.SocialList;
import net.civicraft.socialList.gui.SocialsGUI;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class SocialsCMD implements CommandExecutor {
    SocialList instance = SocialList.getInstance();
    String mode = instance.getConfig().getString("display_mode");
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String @NotNull [] strings) {
        if (commandSender instanceof Player player && player.hasPermission("sociallist.socials")) {
            if (mode.equalsIgnoreCase("GUI")) {
                SocialsGUI.socialsGUI(player);
            } else if (mode.equalsIgnoreCase("TEXT")) {

            } else {
                player.sendMessage("Config.yml has been incorrectly configured. The value can only be \"TEXT\" or \"GUI\"");
            }
        }
        return false;
    }
}
