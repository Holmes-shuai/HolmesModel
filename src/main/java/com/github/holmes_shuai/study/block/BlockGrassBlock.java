package com.github.holmes_shuai.study.block;

import com.github.holmes_shuai.study.common.creativetab.CreativeTabsStudy;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockGrassBlock extends Block {
    public BlockGrassBlock(){
        super(Material.GROUND);
        this.setUnlocalizedName("grassBlock");
        this.setHardness(0.5F);
        this.setSoundType(SoundType.GROUND);

        this.setCreativeTab(CreativeTabsStudy.tabStudy);
    }
}
