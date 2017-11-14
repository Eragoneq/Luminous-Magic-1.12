package net.eragon_skill.luminousmagic.block;

import net.eragon_skill.luminousmagic.render.IModelRegister;
import net.eragon_skill.luminousmagic.utility.References;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BaseModBlock extends Block implements IModelRegister{

    public BaseModBlock(Material mat, String name){
        super(mat);
        setUnlocalizedName(name);
        setRegistryName(new ResourceLocation(References.MODID, name));
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerModels(){
        if(Item.getItemFromBlock(this) != Items.AIR){
            
        }
    }

}
