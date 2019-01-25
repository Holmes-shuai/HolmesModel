package com.github.holmes_shuai.study.common.event;

import com.github.holmes_shuai.study.Study;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static com.github.holmes_shuai.study.common.event.PlayerJumpEvent.EVENT_BUS;

@Mod.EventBusSubscriber(modid = Study.MODID)
public class StudyEventHandler {
    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void onLivingJump(LivingEvent.LivingJumpEvent event){
        //if(event.getEntityLiving().getEntityWorld().isRemote) return;
        if(!(event.getEntityLiving() instanceof EntityPlayer)) return;
        //Study.instance.getLogger().info("监听到玩家"+event.getEntityLiving().getName()+"跳跃");
        EVENT_BUS.post(new PlayerJumpEvent((EntityPlayer)event.getEntityLiving()));
    }
    /*
    @SubscribeEvent
    public static void onPlayerInteract(PlayerInteractEvent event) {
        if(event.getWorld().isRemote) return;
        event.setCanceled(true);
    }
    */

    @SubscribeEvent
    public static void onPlayerJump(PlayerJumpEvent event){
        if(event.getEntityLiving().getEntityWorld().isRemote) return;
        Study.instance.getLogger().info("监听到玩家"+event.getEntityLiving().getName()+"跳跃");
    }
}
