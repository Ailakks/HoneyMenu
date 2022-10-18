package com.cortmnzz.honeymenu;

import com.cortmnzz.honeymenu.managers.HoneyMenuInteractionManager;
import com.cortmnzz.honeymenu.managers.HoneyPlayerManager;
import lombok.Getter;
import org.bukkit.plugin.Plugin;

public class HoneyMenuManager {
    @Getter
    private static HoneyMenuManager honeyMenuManager;

    private final Plugin plugin;

    @Getter
    private final HoneyPlayerManager honeyPlayerManager;
    private final HoneyMenuInteractionManager honeyMenuInteractionManager;

    public HoneyMenuManager(final Plugin plugin) {
        this.honeyMenuManager = this;
        this.plugin = plugin;

        this.honeyPlayerManager = new HoneyPlayerManager();
        this.honeyMenuInteractionManager = new HoneyMenuInteractionManager();
    }
}
