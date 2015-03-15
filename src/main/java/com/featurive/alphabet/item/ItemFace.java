package com.featurive.alphabet.item;

import com.featurive.alphabet.creativetab.CreativeTab;
import com.featurive.alphabet.item.constructor.ModItem;
import com.featurive.alphabet.reference.Names;

public class ItemFace extends ModItem{

    public ItemFace() {
        setCreativeTab(CreativeTab.alphabet);
        setUnlocalizedName(Names.Item.face);
    }
}
