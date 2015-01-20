package com.featurive.alphabet;

import com.featurive.alphabet.init.ModBlocks;
import com.featurive.alphabet.init.ModItems;
import com.featurive.alphabet.init.ModModels;
import com.featurive.alphabet.reference.References;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = References.MOD_ID, version = References.VERSION, name = References.MOD_NAME)
public class Alphabet{

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        ModItems.init();
        ModBlocks.init();
    }

    @EventHandler
    public void init(FMLInitializationEvent event){
        ModModels.init();
    }
}
