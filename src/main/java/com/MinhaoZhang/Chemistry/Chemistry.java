package com.MinhaoZhang.Chemistry;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Chemistry implements ModInitializer {
    public static final Logger LOGGER = LogManager.getLogger("chem");
    public static final String MOD_ID = "chem";
    public static final ItemGroup CHEM_ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "general"),
            () -> new ItemStack(Blocks.BREWING_STAND));
    public static final ChemBlock HYDROGEN = new ChemBlock(FabricBlockSettings
            .of(Material.STONE)
            .hardness(4.0f)
            .requiresTool()
            .luminance(15)
        );
    public static final ChemItem HYDROGEN_GAS = new ChemItem(new FabricItemSettings()
            .group(CHEM_ITEM_GROUP)
            .maxCount(16)
            .food(new FoodComponent.Builder()
                    .hunger(0)
                    .saturationModifier(0)
                    .alwaysEdible()
                    .snack()
                    .statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 60*20), 1)
                    .build())
            );

    @Override
    public void onInitialize() {
        LOGGER.info("Hello Fabric world!");
        registerAll();
    }

    private void registerAll() {
        registerItem();
        registerBlock();
        registerBlockItem();
    }

    private void registerItem() {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "hydrogen_gas"), HYDROGEN_GAS);
    }

    private void registerBlock() {
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "hydrogen"), HYDROGEN);
    }

    private void registerBlockItem() {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "hydrogen"),
                new BlockItem(HYDROGEN, new FabricItemSettings().group(CHEM_ITEM_GROUP)));
    }

}
