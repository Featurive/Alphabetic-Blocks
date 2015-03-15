package com.featurive.alphabet.block.constructor;

import com.featurive.alphabet.creativetab.CreativeTab;
import com.featurive.alphabet.reference.References;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class ModBlock extends Block{
    public ModBlock(Material material){
        super(material);
        this.setCreativeTab(CreativeTab.alphabet);
        this.setHardness(1.0F);
    }

    public ModBlock(){
        super(Material.rock);
        this.setCreativeTab(CreativeTab.alphabet);
        this.setHardness(1.0F);
    }

    @Override
    public String getUnlocalizedName(){
        return String.format("tile.%s%s", References.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister){
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName){
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
