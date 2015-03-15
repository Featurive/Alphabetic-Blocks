package com.featurive.alphabet.block;

import com.featurive.alphabet.block.constructor.ModBlock;
import com.featurive.alphabet.creativetab.CreativeTab;

public class BlockLetter extends ModBlock {
    public BlockLetter(String chararacter){
        this.setBlockName("letter_" + chararacter);
        this.setCreativeTab(CreativeTab.alphabet);
    }
}
