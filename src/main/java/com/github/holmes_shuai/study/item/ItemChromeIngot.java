package com.github.holmes_shuai.study.item;

import com.github.holmes_shuai.study.common.creativetab.CreativeTabsStudy;
import net.minecraft.item.Item;

public class ItemChromeIngot extends Item {
    public ItemChromeIngot(){
        super();
        this.setUnlocalizedName("chromeIngot");

        this.setCreativeTab(CreativeTabsStudy.tabStudy);
    }
}
