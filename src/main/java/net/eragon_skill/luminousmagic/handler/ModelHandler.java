package net.eragon_skill.luminousmagic.handler;

import net.eragon_skill.luminousmagic.render.IModelRegister;
import net.eragon_skill.luminousmagic.utility.References;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

import java.util.Locale;

@Mod.EventBusSubscriber(Side.CLIENT)
public final class ModelHandler {
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent evt) {
        OBJLoader.INSTANCE.addDomain(References.MODID.toLowerCase(Locale.ROOT));

        for(Block block : Block.REGISTRY) {
            if(block instanceof IModelRegister)
                ((IModelRegister) block).registerModels();
        }

        for(Item item : Item.REGISTRY) {
            if(item instanceof IModelRegister)
                ((IModelRegister) item).registerModels();
        }
    }

}
