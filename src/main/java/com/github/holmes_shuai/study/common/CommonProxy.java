package com.github.holmes_shuai.study.common;

import com.github.holmes_shuai.study.block.BlockLoader;
import com.github.holmes_shuai.study.common.world.gen.OreGenEventHandler;
import com.github.holmes_shuai.study.item.ItemLoader;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        new ItemLoader(event);
        new BlockLoader(event);
    }

    public void init(FMLInitializationEvent event) {
        ItemLoader.addSmelting();
        OreGenEventHandler.init();
    }

    public void postInit(FMLPostInitializationEvent event) {

    }
}
