package com.github.holmes_shuai.study.common;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.IFuelHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.Logger;

public class ConfigLoader {
    private static Configuration config;

    private static Logger logger;

    public static int diamondBurnTime;

    public static void init(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        config = new Configuration(event.getSuggestedConfigurationFile());

        config.load();
        load();
    }

    public static void load() {
        logger().info("Started loading config. ");
        String comment;

        comment = "How many seconds can a diamond burn in a furnace. ";
        diamondBurnTime = config.get(Configuration.CATEGORY_GENERAL, "diamondBurnTime", 640, comment).getInt();

        config.save();
        logger().info("Finished loading config. ");
    }

    private static void registerFuel() {
        GameRegistry.registerFuelHandler(new IFuelHandler() {
            @Override
            public int getBurnTime(ItemStack fuel) {
                return Items.DIAMOND != fuel.getItem() ? 0 : Math.max(0, ConfigLoader.diamondBurnTime) * 20;
            }
        });
    }

    public static Logger logger() {
        return logger;
    }
}
