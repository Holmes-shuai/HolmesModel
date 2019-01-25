package com.github.holmes_shuai.study.common.event;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.eventhandler.EventBus;

public class PlayerJumpEvent extends PlayerEvent {
    public static final EventBus EVENT_BUS = new EventBus();

    public PlayerJumpEvent(EntityPlayer player) {
        super(player);
    }

    public static void init() {
        EVENT_BUS.register(StudyEventHandler.class);
    }
}
