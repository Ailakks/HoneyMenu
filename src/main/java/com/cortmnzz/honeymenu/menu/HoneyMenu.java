package com.cortmnzz.honeymenu.menu;

import com.cortmnzz.honeymenu.managers.HoneyMenuInteractionManager;
import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class HoneyMenu {
    @Getter
    private final HoneyMenuInteractionManager honeyMenuInteractionManager;
    private final Inventory bukkitInventory;

    public HoneyMenu(final String title, int size) {
        this.bukkitInventory = Bukkit.createInventory(null, size, title);
        this.honeyMenuInteractionManager = new HoneyMenuInteractionManager();
    }
    public void open(final Player bukkitPlayer) {
        bukkitPlayer.openInventory(bukkitInventory);
    }
}
