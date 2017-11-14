package net.eragon_skill.luminousmagic.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModItems {

    public static final CreativeTabs LUMI_TAB = new CreativeTabs("luminousTab") {

        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(Items.APPLE);
        }
    };

}
