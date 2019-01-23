package com.github.holmes_shuai.study;

import org.apache.logging.log4j.Logger;

import com.github.holmes_shuai.study.common.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * @author Holmes_shuai
 */
@Mod(modid = Study.MODID, name = Study.NAME, version = Study.VERSION, acceptedMinecraftVersions = "[1.12,)")

public class Study {
    public static final String MODID = "study";
    public static final String NAME = "Study";
    public static final String VERSION = "1.0.0";

    @SidedProxy(clientSide = "com.github.holmes_shuai.study.client.ClientProxy",
            serverSide = "com.github.holmes_shuai.study.common.CommonProxy")
    public static CommonProxy proxy;

    @Instance(Study.MODID)
    public static Study instance;

    private Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
        Study.instance.getLogger().info("Study模组装载成功！");
    }

    public Logger getLogger()
    {
        return logger;
    }
}
