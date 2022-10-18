package com.cortmnzz.honeymenu.menu;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class HoneyMenu {
    private final Inventory bukkitInventory;

    public HoneyMenu(final String title, int size) {
        this.bukkitInventory = Bukkit.createInventory(null, size, title);
    }
    public void open(final Player bukkitPlayer) {
        bukkitPlayer.openInventory(bukkitInventory);
    }
}
