package com.github.brunoleitec.eventlisteners2;

import org.bukkit.plugin.java.JavaPlugin;

public final class EventListeners2 extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new XPBottleBreakListener(),this);
        getServer().getPluginManager().registerEvents(new ShearSheepListener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
