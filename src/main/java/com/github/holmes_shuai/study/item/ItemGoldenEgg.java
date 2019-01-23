package com.github.holmes_shuai.study.item;

import com.github.holmes_shuai.study.common.creativetab.CreativeTabsStudy;
import net.minecraft.item.Item;

public class ItemGoldenEgg extends Item {
    public ItemGoldenEgg() {
        super();
        this.setUnlocalizedName("goldenEgg");

        this.setCreativeTab(CreativeTabsStudy.tabStudy);
    }
}
