package com.github.holmes_shuai.study.common;

import com.github.holmes_shuai.study.block.BlockLoader;
import com.github.holmes_shuai.study.common.event.PlayerJumpEvent;
import com.github.holmes_shuai.study.common.world.gen.OreGenEventHandler;
import com.github.holmes_shuai.study.item.ItemLoader;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        ItemLoader.init();
        BlockLoader.init();
    }

    public void init(FMLInitializationEvent event) {
        ItemLoader.addSmelting();
        OreGenEventHandler.init();
        PlayerJumpEvent.init();
    }

    public void postInit(FMLPostInitializationEvent event) {

    }
}
