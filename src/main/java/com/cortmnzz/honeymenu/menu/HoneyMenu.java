package com.cortmnzz.honeymenu.menu;

import com.cortmnzz.honeymenu.HoneyMenuManager;
import com.cortmnzz.honeymenu.event.MenuInteractEvent;
import com.cortmnzz.honeymenu.managers.HoneyMenuInteractionManager;
import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.function.Consumer;

public class HoneyMenu {
    @Getter
    private final HoneyMenuInteractionManager honeyMenuInteractionManager;
    @Getter
    private final Inventory bukkitInventory;

    public HoneyMenu(final String title, int size) {
        this.bukkitInventory = Bukkit.createInventory(null, size, title);
        this.honeyMenuInteractionManager = new HoneyMenuInteractionManager();
    }
    public HoneyMenu setItem(final int slot, final ItemStack bukkitItemStack) {
        this.bukkitInventory.setItem(slot, bukkitItemStack);
        return this;
    }
    public HoneyMenu setClickableItem(final int slot, final ItemStack bukkitItemStack, final Consumer<MenuInteractEvent> consumer) {
        this.honeyMenuInteractionManager.setConsumer(slot, consumer);
        setItem(slot, bukkitItemStack);
        return this;
    }
    public void open(final Player bukkitPlayer) {
        HoneyMenuManager.getHoneyMenuManager().getHoneyPlayerManager().getPlayer(bukkitPlayer.getUniqueId()).setCurrentOpenedMenu(this);
        bukkitPlayer.openInventory(bukkitInventory);
    }
}
