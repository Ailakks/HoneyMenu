package com.cortmnzz.honeymenu;

import com.cortmnzz.honeymenu.managers.HoneyPlayerManager;
import org.bukkit.plugin.Plugin;

public class HoneyMenuManager {
    private final Plugin plugin;

    private final HoneyPlayerManager honeyPlayerManager;

    public HoneyMenuManager(final Plugin plugin) {
        this.plugin = plugin;

        this.honeyPlayerManager = new HoneyPlayerManager();
    }


}
