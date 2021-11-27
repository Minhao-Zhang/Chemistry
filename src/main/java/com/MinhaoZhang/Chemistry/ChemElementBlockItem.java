package com.MinhaoZhang.Chemistry;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

public class ChemElementBlockItem extends BlockItem {

    public ChemElementBlockItem(Block block, Settings settings) {
        super(block, settings.group(Chemistry.CHEM_ELEMENT_GROUP));
    }
}
