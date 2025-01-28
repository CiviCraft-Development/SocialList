package net.civicraft.socialList;

import net.civicraft.socialList.command.SocialsCMD;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class SocialList extends JavaPlugin {
    public static SocialList instance;

    @Override
    public void onEnable() {
        instance = this;
        saveDefaultConfig();
        Objects.requireNonNull(getCommand("socials")).setExecutor(new SocialsCMD());
    }

    public static SocialList getInstance() {
        return instance;
    }

    @Override
    public void onDisable() {
        instance = null;
    }
}
