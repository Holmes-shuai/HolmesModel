package com.github.holmes_shuai.study.block;

import com.github.holmes_shuai.study.common.creativetab.CreativeTabsStudy;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BlockChromite extends Block {
    public BlockChromite() {
        super(Material.ROCK);
        this.setSoundType(SoundType.STONE);//表示方块踩上去的声音
        this.setHardness(50.0f);//表示方块硬度 黑曜石的硬度为50
        this.setHarvestLevel("pickaxe", 2);//pickaxe表示镐子（axe表示斧子 shovel表示铲子） 2表示铁镐以上才能挖掘（3-钻石 1-石 0-木/金）
        this.setUnlocalizedName("chromite");

        this.setCreativeTab(CreativeTabsStudy.tabStudy);
    }
}
