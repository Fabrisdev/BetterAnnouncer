package github.fabridora.betterannouncer.betterannouncer;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class BetterAnnouncer extends JavaPlugin {
    public String name = "&e[&a&lBA&e]";
    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("ON");

    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("OFF");
    }
}
