package com.cortmnzz.honeymenu.listeners;

import com.cortmnzz.honeymenu.HoneyMenuManager;
import com.cortmnzz.honeymenu.event.MenuInteractEvent;
import com.cortmnzz.honeymenu.player.HoneyPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import java.util.Objects;

public class InventoryClickListener implements Listener {
    @EventHandler
    public void onInventoryClick(final InventoryClickEvent event) {
        if (event.getWhoClicked() instanceof Player) {
            final HoneyPlayer honeyPlayer = HoneyMenuManager.getHoneyMenuManager().getHoneyPlayerManager().getPlayer(event.getWhoClicked().getUniqueId());

            if (!Objects.isNull(honeyPlayer.getCurrentOpenedMenu()) &&
                    !Objects.isNull(honeyPlayer.getCurrentOpenedMenu().getHoneyMenuInteractionManager().getConsumer(event.getSlot()))) {
                final MenuInteractEvent menuInteractEvent = new MenuInteractEvent(honeyPlayer.getCurrentOpenedMenu());
                honeyPlayer.getCurrentOpenedMenu().getHoneyMenuInteractionManager().getConsumer(event.getSlot()).accept(menuInteractEvent);
            }
        }
    }
}
