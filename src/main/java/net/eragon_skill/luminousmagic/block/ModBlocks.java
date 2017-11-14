package net.eragon_skill.luminousmagic.block;

import net.eragon_skill.luminousmagic.utility.References;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

import java.util.Set;

public class ModBlocks {

    public static final Set<Block>
    //Mod blocks list
    public static BaseModBlock runicStone;


    public static void registerBlocks(){
        runicStone = new BaseModBlock();

    }

    public static void renderDefaultState(Block block){

        ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation(References.MODID+":"+block.getUnlocalizedName(), "inventory");
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, itemModelResourceLocation);

    }

}
