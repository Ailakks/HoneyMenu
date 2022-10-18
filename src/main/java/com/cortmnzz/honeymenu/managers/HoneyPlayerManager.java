package com.cortmnzz.honeymenu.managers;

import com.cortmnzz.honeymenu.player.HoneyPlayer;

import java.util.HashMap;
import java.util.UUID;

public class HoneyPlayerManager {
    private final HashMap<UUID, HoneyPlayer> honeyPlayerHashMap;

    public HoneyPlayerManager() {
        this.honeyPlayerHashMap = new HashMap<>();
    }

    public HoneyPlayer getPlayer(final UUID uuid) {
        honeyPlayerHashMap.putIfAbsent(uuid, new HoneyPlayer(uuid));
        return honeyPlayerHashMap.get(uuid);
    }
    public HoneyPlayer removePlayer(final UUID uuid) {
        return honeyPlayerHashMap.remove(uuid);
    }
}
