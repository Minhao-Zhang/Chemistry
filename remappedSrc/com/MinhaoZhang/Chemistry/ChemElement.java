package com.MinhaoZhang.Chemistry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class ChemElement extends Block {
    private int atomicNum;

    public ChemElement(int atomicNum) {
        super(
                FabricBlockSettings
                        .of(Material.METAL)
                        .strength(1.5f, 3600000f)
                        .requiresTool()
                        .luminance(15)
        );
        this.atomicNum = atomicNum;
    }
}
