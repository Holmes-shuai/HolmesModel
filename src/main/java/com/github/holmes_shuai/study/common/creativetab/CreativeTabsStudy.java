package com.github.holmes_shuai.study.common.creativetab;

import com.github.holmes_shuai.study.item.ItemLoader;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabsStudy extends CreativeTabs {
    public static CreativeTabsStudy tabStudy = new CreativeTabsStudy();

    public CreativeTabsStudy() {
        super("Study");
        this.setBackgroundImageName("study.png");
    }

    public ItemStack getTabIconItem() {
        return new ItemStack(ItemLoader.bestSword);
    }
}
