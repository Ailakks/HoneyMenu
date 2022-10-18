package com.cortmnzz.honeymenu.item;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class HoneyItem {
    private ItemStack bukkitItemStack;
    private ItemMeta bukkitItemMeta;

    public HoneyItem(final Material material) {
        this.bukkitItemStack = new ItemStack(material);
        this.bukkitItemMeta = bukkitItemStack.getItemMeta();
    }
    public HoneyItem setDisplayName(final String displayName) {
        bukkitItemMeta.setDisplayName(displayName);
        return this;
    }
    public HoneyItem setLore(final List<String> lore) {
        bukkitItemMeta.setLore(lore);
        return this;
    }
    @Deprecated
    public HoneyItem setData(final int data) {
        bukkitItemStack.setDurability((short) data);
        return this;
    }
    public ItemStack build() {
        this.bukkitItemStack.setItemMeta(this.bukkitItemMeta);
        return bukkitItemStack;
    }
}
