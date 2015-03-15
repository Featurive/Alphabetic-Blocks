package com.featurive.alphabet.creativetab;

import com.featurive.alphabet.item.constructor.ItemList;
import com.featurive.alphabet.reference.References;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTab {

    public final static CreativeTabs alphabet = new CreativeTabs(References.MOD_ID.toLowerCase()) {
        @Override
        public Item getTabIconItem() {
            return ItemList.face;
        }
    };
}
