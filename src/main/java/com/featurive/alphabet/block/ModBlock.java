package com.featurive.alphabet.block;

import com.featurive.alphabet.reference.References;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlock extends Block{
    public ModBlock(Material material){
        super(material);
        this.setCreativeTab(CreativeTab.alphabet);
        this.setHardness(1.0F);
    }

    @Override
    public String getUnlocalizedName(){
        return String.format("tile.%s%s", References.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName){
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
