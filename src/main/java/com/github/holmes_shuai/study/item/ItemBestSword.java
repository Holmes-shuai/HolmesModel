package com.github.holmes_shuai.study.item;

import com.github.holmes_shuai.study.common.creativetab.CreativeTabsStudy;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;

public class ItemBestSword extends ItemSword {
    public ItemBestSword() {
        super(EnumHelper.addToolMaterial("CHROME", 4, 2000, 15.0F, 10.0F, 15));
        this.setUnlocalizedName("bestSword");

        this.addPropertyOverride(new ResourceLocation("isNatsukiSubaru"),
                (stack, world, entity) -> entity != null && entity.getCustomNameTag().equals("NatsukiSubaru")? 1.0f : 0.0f);

        this.setCreativeTab(CreativeTabsStudy.tabStudy);
    }
}
