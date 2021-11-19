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
    public static final ItemGroup CHEM_ELEMENT_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "element"), () -> new ItemStack(Blocks.CAULDRON));
    public static final ItemGroup CHEM_ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "general"), () -> new ItemStack(Blocks.BREWING_STAND));
    public static final ChemBlock HYDROGEN = new ChemBlock(FabricBlockSettings.of(Material.METAL).strength(1.5f, 3600000f).requiresTool().luminance(15));
    public static final ChemBlock HELIUM = new ChemBlock(FabricBlockSettings.of(Material.METAL).strength(1.5f, 3600000f).requiresTool().luminance(15));
    public static final ChemBlock LITHIUM = new ChemBlock(FabricBlockSettings.of(Material.METAL).strength(1.5f, 3600000f).requiresTool().luminance(15));
    public static final ChemBlock BERYLLIUM = new ChemBlock(FabricBlockSettings.of(Material.METAL).strength(1.5f, 3600000f).requiresTool().luminance(15));
    public static final ChemBlock BORON = new ChemBlock(FabricBlockSettings.of(Material.METAL).strength(1.5f, 3600000f).requiresTool().luminance(15));
    public static final ChemBlock CARBON = new ChemBlock(FabricBlockSettings.of(Material.METAL).strength(1.5f, 3600000f).requiresTool().luminance(15));
    public static final ChemBlock NITROGEN = new ChemBlock(FabricBlockSettings.of(Material.METAL).strength(1.5f, 3600000f).requiresTool().luminance(15));
    public static final ChemBlock OXYGEN = new ChemBlock(FabricBlockSettings.of(Material.METAL).strength(1.5f, 3600000f).requiresTool().luminance(15));
    public static final ChemBlock FLUORINE = new ChemBlock(FabricBlockSettings.of(Material.METAL).strength(1.5f, 3600000f).requiresTool().luminance(15));
    public static final ChemBlock NEON = new ChemBlock(FabricBlockSettings.of(Material.METAL).strength(1.5f, 3600000f).requiresTool().luminance(15));
    public static final ChemBlock SODIUM = new ChemBlock(FabricBlockSettings.of(Material.METAL).strength(1.5f, 3600000f).requiresTool().luminance(15));
    public static final ChemBlock MAGNESIUM = new ChemBlock(FabricBlockSettings.of(Material.METAL).strength(1.5f, 3600000f).requiresTool().luminance(15));
    public static final ChemBlock ALUMINIUM = new ChemBlock(FabricBlockSettings.of(Material.METAL).strength(1.5f, 3600000f).requiresTool().luminance(15));
    public static final ChemBlock SILICON = new ChemBlock(FabricBlockSettings.of(Material.METAL).strength(1.5f, 3600000f).requiresTool().luminance(15));
    public static final ChemBlock PHOSPHORUS = new ChemBlock(FabricBlockSettings.of(Material.METAL).strength(1.5f, 3600000f).requiresTool().luminance(15));
    public static final ChemBlock SULFUR = new ChemBlock(FabricBlockSettings.of(Material.METAL).strength(1.5f, 3600000f).requiresTool().luminance(15));
    public static final ChemBlock CHLORINE = new ChemBlock(FabricBlockSettings.of(Material.METAL).strength(1.5f, 3600000f).requiresTool().luminance(15));
    public static final ChemBlock ARGON = new ChemBlock(FabricBlockSettings.of(Material.METAL).strength(1.5f, 3600000f).requiresTool().luminance(15));
    public static final ChemBlock POTASSIUM = new ChemBlock(FabricBlockSettings.of(Material.METAL).strength(1.5f, 3600000f).requiresTool().luminance(15));
    public static final ChemBlock CALCIUM = new ChemBlock(FabricBlockSettings.of(Material.METAL).strength(1.5f, 3600000f).requiresTool().luminance(15));
    public static final ChemBlock SCANDIUM = new ChemBlock(FabricBlockSettings.of(Material.METAL).strength(1.5f, 3600000f).requiresTool().luminance(15));
    public static final ChemBlock TITANIUM = new ChemBlock(FabricBlockSettings.of(Material.METAL).strength(1.5f, 3600000f).requiresTool().luminance(15));
    public static final ChemBlock VANADIUM = new ChemBlock(FabricBlockSettings.of(Material.METAL).strength(1.5f, 3600000f).requiresTool().luminance(15));
    public static final ChemBlock CHROMIUM = new ChemBlock(FabricBlockSettings.of(Material.METAL).strength(1.5f, 3600000f).requiresTool().luminance(15));
    public static final ChemBlock MANGANESE = new ChemBlock(FabricBlockSettings.of(Material.METAL).strength(1.5f, 3600000f).requiresTool().luminance(15));
    public static final ChemBlock IRON = new ChemBlock(FabricBlockSettings.of(Material.METAL).strength(1.5f, 3600000f).requiresTool().luminance(15));
    public static final ChemBlock COBALT = new ChemBlock(FabricBlockSettings.of(Material.METAL).strength(1.5f, 3600000f).requiresTool().luminance(15));
    public static final ChemBlock NICKEL = new ChemBlock(FabricBlockSettings.of(Material.METAL).strength(1.5f, 3600000f).requiresTool().luminance(15));
    public static final ChemBlock COPPER = new ChemBlock(FabricBlockSettings.of(Material.METAL).strength(1.5f, 3600000f).requiresTool().luminance(15));
    public static final ChemBlock ZINC = new ChemBlock(FabricBlockSettings.of(Material.METAL).strength(1.5f, 3600000f).requiresTool().luminance(15));
    public static final ChemBlock GALLIUM = new ChemBlock(FabricBlockSettings.of(Material.METAL).strength(1.5f, 3600000f).requiresTool().luminance(15));
    public static final ChemBlock GERMANIUM = new ChemBlock(FabricBlockSettings.of(Material.METAL).strength(1.5f, 3600000f).requiresTool().luminance(15));
    public static final ChemBlock ARSENIC = new ChemBlock(FabricBlockSettings.of(Material.METAL).strength(1.5f, 3600000f).requiresTool().luminance(15));
    public static final ChemBlock SELENIUM = new ChemBlock(FabricBlockSettings.of(Material.METAL).strength(1.5f, 3600000f).requiresTool().luminance(15));
    public static final ChemBlock BROMINE = new ChemBlock(FabricBlockSettings.of(Material.METAL).strength(1.5f, 3600000f).requiresTool().luminance(15));
    public static final ChemBlock KRYPTON = new ChemBlock(FabricBlockSettings.of(Material.METAL).strength(1.5f, 3600000f).requiresTool().luminance(15));
    public static final ChemItem HYDROGEN_GAS = new ChemItem(new FabricItemSettings().group(CHEM_ITEM_GROUP).maxCount(16).food(new FoodComponent.Builder().hunger(0).saturationModifier(0).alwaysEdible().snack().statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 60*20), 1).build()));
    public static final ChemItem HELIUM_GAS = new ChemItem(new FabricItemSettings().group(CHEM_ITEM_GROUP).maxCount(16).food(new FoodComponent.Builder().hunger(0).saturationModifier(0).alwaysEdible().snack().statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 60*20), 1).build()));

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
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "helium_gas"), HELIUM_GAS);
    }

    private void registerBlock() {
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "hydrogen"), HYDROGEN);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "helium"), HELIUM);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "lithium"), LITHIUM);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "beryllium"), BERYLLIUM);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "boron"), BORON);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "carbon"), CARBON);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "nitrogen"), NITROGEN);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "oxygen"), OXYGEN);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "fluorine"), FLUORINE);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "neon"), NEON);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "sodium"), SODIUM);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "magnesium"), MAGNESIUM);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "aluminium"), ALUMINIUM);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "silicon"), SILICON);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "phosphorus"), PHOSPHORUS);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "sulfur"), SULFUR);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "chlorine"), CHLORINE);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "argon"), ARGON);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "potassium"), POTASSIUM);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "calcium"), CALCIUM);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "scandium"), SCANDIUM);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "titanium"), TITANIUM);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "vanadium"), VANADIUM);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "chromium"), CHROMIUM);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "manganese"), MANGANESE);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "iron"), IRON);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "cobalt"), COBALT);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "nickel"), NICKEL);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "copper"), COPPER);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "zinc"), ZINC);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "gallium"), GALLIUM);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "germanium"), GERMANIUM);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "arsenic"), ARSENIC);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "selenium"), SELENIUM);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "bromine"), BROMINE);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "krypton"), KRYPTON);
    }

    private void registerBlockItem() {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "hydrogen"), new BlockItem(HYDROGEN, new FabricItemSettings().group(CHEM_ELEMENT_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "helium"), new BlockItem(HELIUM, new FabricItemSettings().group(CHEM_ELEMENT_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "lithium"), new BlockItem(LITHIUM, new FabricItemSettings().group(CHEM_ELEMENT_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "beryllium"), new BlockItem(BERYLLIUM, new FabricItemSettings().group(CHEM_ELEMENT_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "boron"), new BlockItem(BORON, new FabricItemSettings().group(CHEM_ELEMENT_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "carbon"), new BlockItem(CARBON, new FabricItemSettings().group(CHEM_ELEMENT_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "nitrogen"), new BlockItem(NITROGEN, new FabricItemSettings().group(CHEM_ELEMENT_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "oxygen"), new BlockItem(OXYGEN, new FabricItemSettings().group(CHEM_ELEMENT_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fluorine"), new BlockItem(FLUORINE, new FabricItemSettings().group(CHEM_ELEMENT_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "neon"), new BlockItem(NEON, new FabricItemSettings().group(CHEM_ELEMENT_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "sodium"), new BlockItem(SODIUM, new FabricItemSettings().group(CHEM_ELEMENT_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "magnesium"), new BlockItem(MAGNESIUM, new FabricItemSettings().group(CHEM_ELEMENT_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "aluminium"), new BlockItem(ALUMINIUM, new FabricItemSettings().group(CHEM_ELEMENT_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "silicon"), new BlockItem(SILICON, new FabricItemSettings().group(CHEM_ELEMENT_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "phosphorus"), new BlockItem(PHOSPHORUS, new FabricItemSettings().group(CHEM_ELEMENT_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "sulfur"), new BlockItem(SULFUR, new FabricItemSettings().group(CHEM_ELEMENT_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "chlorine"), new BlockItem(CHLORINE, new FabricItemSettings().group(CHEM_ELEMENT_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "argon"), new BlockItem(ARGON, new FabricItemSettings().group(CHEM_ELEMENT_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "potassium"), new BlockItem(POTASSIUM, new FabricItemSettings().group(CHEM_ELEMENT_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "calcium"), new BlockItem(CALCIUM, new FabricItemSettings().group(CHEM_ELEMENT_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "scandium"), new BlockItem(SCANDIUM, new FabricItemSettings().group(CHEM_ELEMENT_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "titanium"), new BlockItem(TITANIUM, new FabricItemSettings().group(CHEM_ELEMENT_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "vanadium"), new BlockItem(VANADIUM, new FabricItemSettings().group(CHEM_ELEMENT_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "chromium"), new BlockItem(CHROMIUM, new FabricItemSettings().group(CHEM_ELEMENT_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "manganese"), new BlockItem(MANGANESE, new FabricItemSettings().group(CHEM_ELEMENT_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "iron"), new BlockItem(IRON, new FabricItemSettings().group(CHEM_ELEMENT_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cobalt"), new BlockItem(COBALT, new FabricItemSettings().group(CHEM_ELEMENT_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "nickel"), new BlockItem(NICKEL, new FabricItemSettings().group(CHEM_ELEMENT_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "copper"), new BlockItem(COPPER, new FabricItemSettings().group(CHEM_ELEMENT_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "zinc"), new BlockItem(ZINC, new FabricItemSettings().group(CHEM_ELEMENT_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "gallium"), new BlockItem(GALLIUM, new FabricItemSettings().group(CHEM_ELEMENT_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "germanium"), new BlockItem(GERMANIUM, new FabricItemSettings().group(CHEM_ELEMENT_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "arsenic"), new BlockItem(ARSENIC, new FabricItemSettings().group(CHEM_ELEMENT_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "selenium"), new BlockItem(SELENIUM, new FabricItemSettings().group(CHEM_ELEMENT_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bromine"), new BlockItem(BROMINE, new FabricItemSettings().group(CHEM_ELEMENT_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "krypton"), new BlockItem(KRYPTON, new FabricItemSettings().group(CHEM_ELEMENT_GROUP)));
    }
}
