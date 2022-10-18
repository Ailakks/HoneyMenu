package com.cortmnzz.honeymenu.managers;

import com.cortmnzz.honeymenu.event.MenuInteractEvent;

import java.util.HashMap;
import java.util.function.Consumer;

public class HoneyMenuInteractionManager {
    private final HashMap<Integer, Consumer<MenuInteractEvent>> consumerMap;

    public HoneyMenuInteractionManager() {
        this.consumerMap = new HashMap<>();
    }
    public void setConsumer(final int slot, final Consumer<MenuInteractEvent> consumer) {
        consumerMap.put(slot, consumer);
    }
    public Consumer<MenuInteractEvent> getConsumer(final int slot) {
        return consumerMap.get(slot);
    }
}
