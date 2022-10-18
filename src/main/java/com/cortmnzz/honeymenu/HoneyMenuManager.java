package com.cortmnzz.honeymenu;

import com.cortmnzz.honeymenu.listeners.InventoryClickListener;
import com.cortmnzz.honeymenu.managers.HoneyPlayerManager;
import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

public class HoneyMenuManager {
    @Getter
    private static HoneyMenuManager honeyMenuManager;

    @Getter
    private final HoneyPlayerManager honeyPlayerManager;

    public HoneyMenuManager(final Plugin plugin) {
        this.honeyMenuManager = this;

        this.honeyPlayerManager = new HoneyPlayerManager();

        Bukkit.getPluginManager().registerEvents(new InventoryClickListener(), plugin);
    }
}
