package com.MinhaoZhang.Chemistry;

import net.minecraft.item.Item;

public class ChemMetal extends Item {
    public ChemMetal(Settings settings) {
        super(settings
                .group(Chemistry.CHEM_METAL_GROUP)
                .maxCount(16)
        );
    }
}
