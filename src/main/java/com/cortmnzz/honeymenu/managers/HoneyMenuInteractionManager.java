package com.cortmnzz.honeymenu.managers;

import org.bukkit.event.inventory.InventoryClickEvent;

import java.util.HashMap;
import java.util.function.Consumer;

public class HoneyMenuInteractionManager {
    private final HashMap<Integer, Consumer<InventoryClickEvent>> consumerMap;

    public HoneyMenuInteractionManager() {
        this.consumerMap = new HashMap<>();
    }
    public void setConsumer(final int slot, final Consumer<InventoryClickEvent> consumer) {
        consumerMap.put(slot, consumer);
    }
    public Consumer<InventoryClickEvent> getConsumer(final int slot) {
        return consumerMap.get(slot);
    }
}
