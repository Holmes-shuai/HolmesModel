package com.github.holmes_shuai.study.block;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

public class BlockLoader {
    public static Block blockChromite = new BlockChromite();
    public static Block chromeBlock = new BolckChromeBlock();
    public static Block grassBlock = new BlockGrassBlock();

    public static void init(){
        register(blockChromite,"chromite");
        register(chromeBlock,"chrome_block"); 
        OreDictionary.registerOre("oreChromite", blockChromite);
        register(grassBlock, "grass_block");
    }

    @SideOnly(Side.CLIENT)
    public static void registerRenders(){
        registerRender(blockChromite);
        registerRender(chromeBlock);
        registerRender(grassBlock);
    }

    public static void register(Block block, String name){
        ForgeRegistries.BLOCKS.register(block.setRegistryName(name));
        ForgeRegistries.ITEMS.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }

    @SideOnly(Side.CLIENT)
    public static void registerRender(Block block){
        ModelResourceLocation model = new ModelResourceLocation(block.getRegistryName(),"inventory");
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, model);
    }
}
