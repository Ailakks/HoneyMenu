package com.cortmnzz.honeymenu.event;

import com.cortmnzz.honeymenu.menu.HoneyMenu;
import lombok.Getter;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public final class MenuInteractEvent extends Event {
    private static final HandlerList handlers = new HandlerList();

    @Getter
    private final HoneyMenu honeyMenu;

    public MenuInteractEvent(final HoneyMenu honeyMenu) {
        this.honeyMenu = honeyMenu;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}