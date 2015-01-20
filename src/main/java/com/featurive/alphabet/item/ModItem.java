package com.featurive.alphabet.item;

import com.featurive.alphabet.creativetab.CreativeTab;
import com.featurive.alphabet.reference.References;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModItem extends Item {
    public ModItem(boolean noTab){
        super();
        if(!noTab){
            setCreativeTab(CreativeTab.alphabet);
        }
    }

    @Override
    public String getUnlocalizedName(){
        return String.format("item.%s%s", References.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", References.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
