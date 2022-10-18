package com.cortmnzz.honeymenu.player;

import com.cortmnzz.honeymenu.menu.HoneyMenu;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

public class HoneyPlayer {
    private final UUID uuid;

    @Getter @Setter
    private HoneyMenu currentOpenedMenu;

    public HoneyPlayer(final UUID uuid) {
        this.uuid = uuid;
    }
}
