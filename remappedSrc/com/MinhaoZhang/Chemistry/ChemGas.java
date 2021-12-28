package com.MinhaoZhang.Chemistry;

import net.minecraft.item.Item;

public class ChemGas extends Item {
    public ChemGas(Settings settings) {
        super(settings
                .group(Chemistry.CHEM_GAS_GROUP)
                .maxCount(16)
        );
    }
}
