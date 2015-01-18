package com.featurive.alphabet.init;

import com.featurive.alphabet.item.ItemList;
import com.featurive.alphabet.reference.Names;
import com.featurive.alphabet.util.ModRegistry;
public class ModItems {
    public static void init(){
        ModRegistry.register(ItemList.face, Names.Item.face);
    }
}
