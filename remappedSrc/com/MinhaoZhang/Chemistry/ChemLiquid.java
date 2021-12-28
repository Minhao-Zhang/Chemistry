package com.MinhaoZhang.Chemistry;

import net.minecraft.item.Item;

public class ChemLiquid extends Item {
    public ChemLiquid(Settings settings) {
        super(settings
                .group(Chemistry.CHEM_LIQUID_GROUP)
                .maxCount(16)
        );
    }
}
