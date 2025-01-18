package net.civicraft.socialList;

import org.bukkit.plugin.java.JavaPlugin;

public final class SocialList extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
