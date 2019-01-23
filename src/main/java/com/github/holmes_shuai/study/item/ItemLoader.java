package com.github.holmes_shuai.study.item;

import com.github.holmes_shuai.study.block.BlockLoader;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.oredict.OreDictionary;

public class ItemLoader
{
    public static Item goldenEgg = new ItemGoldenEgg();
    public static Item bestSword = new ItemBestSword();
    public static Item chromeIngot = new ItemChromeIngot();

    public ItemLoader(FMLPreInitializationEvent event)
    {
        register(bestSword,"best_sword");
        register(goldenEgg, "golden_egg");
        register(chromeIngot,"chrome_ingot");
        OreDictionary.registerOre("ingotChrome", chromeIngot);
    }

    @SideOnly(Side.CLIENT)
    public static void registerRenders() {
        registerRender(goldenEgg);
        registerRender(bestSword);
        registerRender(chromeIngot);
    }

    private static void register(Item item, String name) {
        ForgeRegistries.ITEMS.register(item.setRegistryName(name));
    }

    public static void addSmelting(){
        GameRegistry.addSmelting(BlockLoader.blockChromite, new ItemStack(chromeIngot), 0.5f);
    }

    @SideOnly(Side.CLIENT)
    private static void registerRender(Item item) {
        ModelResourceLocation model = new ModelResourceLocation(item.getRegistryName(), "inventory");
        ModelLoader.setCustomModelResourceLocation(item, 0, model);
    }
}
