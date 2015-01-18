package com.featurive.alphabet.init;

import com.featurive.alphabet.item.ItemList;
import com.featurive.alphabet.reference.Names;
import com.featurive.alphabet.util.ModRegistry;

public class ModModels {
    public static void init(){
        ModRegistry.registerModel(ItemList.face, Names.Item.face, 0);
    }
}
