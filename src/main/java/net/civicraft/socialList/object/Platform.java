package net.civicraft.socialList.object;

public class Platform {
    private final String platformName;
    private final String link;
    private final String username;
    private final String color;
    private final String headName;

    public Platform(String platformName, String link, String username, String color, String headName) {
        this.platformName = platformName;
        this.link = link;
        this.username = username;
        this.color = color;
        this.headName = headName;
    }

    public String getPlatformName() {
        return platformName;
    }

    public String getLink() {
        return link;
    }

    public String getUsername() {
        return username;
    }

    public String getColor() {
        return color;
    }

    public String getHeadName() {
        return headName;
    }
}
