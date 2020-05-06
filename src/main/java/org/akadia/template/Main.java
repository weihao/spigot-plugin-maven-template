package org.akadia.template;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Template plugin is loaded.");
        super.onEnable();
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}