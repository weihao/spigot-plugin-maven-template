package org.akadia.template;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        getLogger().info("Template plugin is loaded.");
        Bukkit.getPluginManager().registerEvents(this, this);

        getCommand("example").setExecutor(new ExampleCommand());

    }

    @Override
    public void onDisable() {
        super.onDisable();
    }


    @EventHandler(priority = EventPriority.HIGHEST)
    public void onJoin(PlayerJoinEvent e) {
        e.getPlayer().sendMessage("Hello world");

        Bukkit.getScheduler().runTaskLater(this, () -> System.out.println("After Lambdas"), 20);
    }
}