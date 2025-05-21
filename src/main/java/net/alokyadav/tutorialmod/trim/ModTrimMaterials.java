package net.alokyadav.tutorialmod.trim;

import net.alokyadav.tutorialmod.TutorialMod;
import net.alokyadav.tutorialmod.item.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.trim.ArmorTrimMaterial;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.Map;

import static net.alokyadav.tutorialmod.item.ModItems.MYTHRIL_INGOT;
import static net.alokyadav.tutorialmod.item.ModToolMaterials.*;


public class ModTrimMaterials {
    public static final RegistryKey<ArmorTrimMaterial> ALEXANDRITE = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(TutorialMod.MOD_ID, "alexandrite"));
    public static final RegistryKey<ArmorTrimMaterial> AZURITE = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(TutorialMod.MOD_ID, "azurite"));
    public static final RegistryKey<ArmorTrimMaterial> BISMUTH = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(TutorialMod.MOD_ID, "bismuth"));
    public static final RegistryKey<ArmorTrimMaterial> BLACK_OPAL = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(TutorialMod.MOD_ID, "black_opal"));
    public static final RegistryKey<ArmorTrimMaterial> CITRINE = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(TutorialMod.MOD_ID, "citrine"));
    public static final RegistryKey<ArmorTrimMaterial> FLUORITE = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(TutorialMod.MOD_ID, "fluorite"));
    public static final RegistryKey<ArmorTrimMaterial> LITHIUM = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(TutorialMod.MOD_ID, "lithium"));
    public static final RegistryKey<ArmorTrimMaterial> MYTHRIL = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(TutorialMod.MOD_ID, "mythril"));
    public static final RegistryKey<ArmorTrimMaterial> PINK_GARNET = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(TutorialMod.MOD_ID, "pink_garnet"));
    public static final RegistryKey<ArmorTrimMaterial> RUBY = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(TutorialMod.MOD_ID, "ruby"));
    public static final RegistryKey<ArmorTrimMaterial> SAPPHIRE = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(TutorialMod.MOD_ID, "sapphire"));
    public static final RegistryKey<ArmorTrimMaterial> TANZANITE = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(TutorialMod.MOD_ID, "tanzanite"));
    public static final RegistryKey<ArmorTrimMaterial> TITANIUM = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(TutorialMod.MOD_ID, "titanium"));
    public static final RegistryKey<ArmorTrimMaterial> ZIRCON = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(TutorialMod.MOD_ID, "zircon"));


    public static void bootstrap(Registerable<ArmorTrimMaterial> registerable) {
        register(registerable, ALEXANDRITE, Registries.ITEM.getEntry(ModItems.ALEXANDRITE),
                Style.EMPTY.withColor(TextColor.parse("#b03fe0").getOrThrow()), 1.0f);
        register(registerable, AZURITE, Registries.ITEM.getEntry(ModItems.AZURITE),
                Style.EMPTY.withColor(TextColor.parse("#b03fe0").getOrThrow()), 1.0f);
        register(registerable, BISMUTH, Registries.ITEM.getEntry(ModItems.BISMUTH),
                Style.EMPTY.withColor(TextColor.parse("#b03fe0").getOrThrow()), 1.0f);
        register(registerable, BLACK_OPAL, Registries.ITEM.getEntry(ModItems.BLACK_OPAL),
                Style.EMPTY.withColor(TextColor.parse("#b03fe0").getOrThrow()), 1.0f);
        register(registerable, CITRINE, Registries.ITEM.getEntry(ModItems.CITRINE),
                Style.EMPTY.withColor(TextColor.parse("#b03fe0").getOrThrow()), 1.0f);
        register(registerable, FLUORITE, Registries.ITEM.getEntry(ModItems.FLUORITE),
                Style.EMPTY.withColor(TextColor.parse("#b03fe0").getOrThrow()), 1.0f);
        register(registerable, LITHIUM, Registries.ITEM.getEntry(ModItems.LITHIUM),
                Style.EMPTY.withColor(TextColor.parse("#b03fe0").getOrThrow()), 1.0f);
        register(registerable, MYTHRIL, Registries.ITEM.getEntry(MYTHRIL_INGOT),
                Style.EMPTY.withColor(TextColor.parse("#b03fe0").getOrThrow()), 1.0f);
        register(registerable, PINK_GARNET, Registries.ITEM.getEntry(ModItems.PINK_GARNET),
                Style.EMPTY.withColor(TextColor.parse("#b03fe0").getOrThrow()), 1.0f);
        register(registerable, RUBY, Registries.ITEM.getEntry(ModItems.RUBY),
                Style.EMPTY.withColor(TextColor.parse("#b03fe0").getOrThrow()), 1.0f);
        register(registerable, SAPPHIRE, Registries.ITEM.getEntry(ModItems.SAPPHIRE),
                Style.EMPTY.withColor(TextColor.parse("#b03fe0").getOrThrow()), 1.0f);
        register(registerable, TANZANITE, Registries.ITEM.getEntry(ModItems.TANZANITE),
                Style.EMPTY.withColor(TextColor.parse("#b03fe0").getOrThrow()), 1.0f);
        register(registerable, TITANIUM, Registries.ITEM.getEntry(ModItems.TITANIUM_INGOT),
                Style.EMPTY.withColor(TextColor.parse("#b03fe0").getOrThrow()), 1.0f);
        register(registerable, ZIRCON, Registries.ITEM.getEntry(ModItems.ZIRCON),
                Style.EMPTY.withColor(TextColor.parse("#b03fe0").getOrThrow()), 1.0f);


    }

    private static void register(Registerable<ArmorTrimMaterial> registerable, RegistryKey<ArmorTrimMaterial> armorTrimKey,
                                 RegistryEntry<Item> item, Style style, float itemModelIndex) {
        ArmorTrimMaterial trimMaterial = new ArmorTrimMaterial(armorTrimKey.getValue().getPath(), item, itemModelIndex, Map.of(),
                Text.translatable(Util.createTranslationKey("trim_material", armorTrimKey.getValue())).fillStyle(style));

        registerable.register(armorTrimKey, trimMaterial);
    }
}