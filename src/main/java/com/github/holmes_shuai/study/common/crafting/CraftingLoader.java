package com.github.holmes_shuai.study.common.crafting;

import com.github.holmes_shuai.study.block.BlockLoader;
import com.github.holmes_shuai.study.item.ItemLoader;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingLoader {
    public static void init(){
        registerRecipe();
        registerSmelting();
        registerFuel();
    }

    private static void registerRecipe() {
        GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.goldenEgg), new Object[]
                {
                        "###", "#*#", "###", '#', Items.GOLD_INGOT, '*', Items.EGG
                });
        GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.grassBlock), new Object[]
                {
                        "##", "##", '#', Blocks.VINE
                });
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.VINE, 4), BlockLoader.grassBlock);
    }

    private static void registerSmelting() {
        GameRegistry.addSmelting(BlockLoader.grassBlock, new ItemStack(Items.COAL), 0.5F);
    }

    private static void registerFuel() {
        GameRegistry.registerFuelHandler(new IFuelHandler() {
            public int getBurnTime(ItemStack fuel) {
                return Items.DIAMOND != fuel.getItem() ? 0 : 12800;
            }
        });
        GameRegistry.registerFuelHandler((ItemStack fuel) ->{
            return Items.DIAMOND != fuel.getItem() ? 0 : 12800;
        });
    }
}
