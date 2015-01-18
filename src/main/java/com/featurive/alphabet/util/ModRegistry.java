package com.featurive.alphabet.util;

import com.featurive.alphabet.reference.References;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRegistry {
    public static void register(Item item, String name) {
        GameRegistry.registerItem(item, name);
    }

    public static void register(Block block, String name){
        GameRegistry.registerBlock(block, name);
    }

    public static void registerModel(Item item, String name, int meta){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                .register(item, meta, new ModelResourceLocation(References.MOD_ID + ":" + name, "inventory"));
    }

    public static void registerModel(Block block, String name, int meta){
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                .register(item, meta, new ModelResourceLocation(References.MOD_ID + ":" + name, "inventory"));
    }
}
