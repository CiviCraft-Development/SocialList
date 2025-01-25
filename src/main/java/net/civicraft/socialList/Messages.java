package net.civicraft.socialList;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextColor;

public class Messages {
    public static final TextColor PRIMARY = TextColor.color(126, 95, 255);
    public static final TextColor SECONDARY = TextColor.color(218, 212, 255);

    public static final Component PREFIX = Component.text("[SocialList] ").color(PRIMARY);

    public static final Component INCORRECT_DISPLAY = PREFIX.append(Component.text("Config.yml has been incorrectly configured. The value can only be \"TEXT\" or \"GUI\"").color(SECONDARY));

}
