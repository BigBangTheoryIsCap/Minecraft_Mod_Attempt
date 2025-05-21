package net.alokyadav.tutorialmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.alokyadav.tutorialmod.item.ModItems;
import net.alokyadav.tutorialmod.util.ModTags;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

import static net.alokyadav.tutorialmod.item.ModItems.*;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Items.TRANSFORMABLE_ITEMS)
                .add(ModItems.PINK_GARNET)
                .add(ModItems.RAW_PINK_GARNET)
                .add(Items.COAL)
                .add(Items.STICK)
                .add(Items.APPLE);
        // Item Tag Assignments

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.PINK_GARNET_SWORD)
                .add(ModItems.ALEXANDRITE_SWORD)
                .add(ModItems.BISMUTH_SWORD)
                .add(ModItems.AZURITE_SWORD)
                .add(ModItems.BLACK_OPAL_SWORD)
                .add(ModItems.CITRINE_SWORD)
                .add(ModItems.LITHIUM_SWORD)
                .add(ModItems.FLUORITE_SWORD)
                .add(ModItems.ZIRCON_SWORD)
                .add(ModItems.SAPPHIRE_SWORD)
                .add(ModItems.TANZANITE_SWORD)
                .add(ModItems.RUBY_SWORD)
                .add(ModItems.TITANIUM_SWORD);

        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.PINK_GARNET_PICKAXE)
                .add(ModItems.ALEXANDRITE_PICKAXE)
                .add(ModItems.BISMUTH_PICKAXE)
                .add(ModItems.AZURITE_PICKAXE)
                .add(ModItems.BLACK_OPAL_PICKAXE)
                .add(ModItems.CITRINE_PICKAXE)
                .add(ModItems.LITHIUM_PICKAXE)
                .add(ModItems.FLUORITE_PICKAXE)
                .add(ModItems.ZIRCON_PICKAXE)
                .add(ModItems.SAPPHIRE_PICKAXE)
                .add(ModItems.TANZANITE_PICKAXE)
                .add(ModItems.RUBY_PICKAXE)
                .add(ModItems.TITANIUM_PICKAXE);

        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.PINK_GARNET_SHOVEL)
                .add(ModItems.ALEXANDRITE_SHOVEL)
                .add(ModItems.BISMUTH_SHOVEL)
                .add(ModItems.AZURITE_SHOVEL)
                .add(ModItems.BLACK_OPAL_SHOVEL)
                .add(ModItems.CITRINE_SHOVEL)
                .add(ModItems.LITHIUM_SHOVEL)
                .add(ModItems.FLUORITE_SHOVEL)
                .add(ModItems.ZIRCON_SHOVEL)
                .add(ModItems.SAPPHIRE_SHOVEL)
                .add(ModItems.TANZANITE_SHOVEL)
                .add(ModItems.RUBY_SHOVEL)
                .add(ModItems.TITANIUM_SHOVEL);

        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.PINK_GARNET_AXE)
                .add(ModItems.ALEXANDRITE_AXE)
                .add(ModItems.BISMUTH_AXE)
                .add(ModItems.AZURITE_AXE)
                .add(ModItems.BLACK_OPAL_AXE)
                .add(ModItems.CITRINE_AXE)
                .add(ModItems.LITHIUM_AXE)
                .add(ModItems.FLUORITE_AXE)
                .add(ModItems.ZIRCON_AXE)
                .add(ModItems.SAPPHIRE_AXE)
                .add(ModItems.TANZANITE_AXE)
                .add(ModItems.RUBY_AXE)
                .add(ModItems.TITANIUM_AXE);

        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.PINK_GARNET_HOE)
                .add(ModItems.ALEXANDRITE_HOE)
                .add(ModItems.BISMUTH_HOE)
                .add(ModItems.AZURITE_HOE)
                .add(ModItems.BLACK_OPAL_HOE)
                .add(ModItems.CITRINE_HOE)
                .add(ModItems.LITHIUM_HOE)
                .add(ModItems.FLUORITE_HOE)
                .add(ModItems.ZIRCON_HOE)
                .add(ModItems.SAPPHIRE_HOE)
                .add(ModItems.TANZANITE_HOE)
                .add(ModItems.RUBY_HOE)
                .add(ModItems.TITANIUM_HOE);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
// Alexandrite
                .add(ModItems.ALEXANDRITE_HELMET)
                .add(ModItems.ALEXANDRITE_CHESTPLATE)
                .add(ModItems.ALEXANDRITE_LEGGINGS)
                .add(ModItems.ALEXANDRITE_BOOTS)
// Azurite
                .add(ModItems.AZURITE_HELMET)
                .add(ModItems.AZURITE_CHESTPLATE)
                .add(ModItems.AZURITE_LEGGINGS)
                .add(ModItems.AZURITE_BOOTS)
// Bismuth
                .add(ModItems.BISMUTH_HELMET)
                .add(ModItems.BISMUTH_CHESTPLATE)
                .add(ModItems.BISMUTH_LEGGINGS)
                .add(ModItems.BISMUTH_BOOTS)
// Black Opal
                .add(ModItems.BLACK_OPAL_HELMET)
                .add(ModItems.BLACK_OPAL_CHESTPLATE)
                .add(ModItems.BLACK_OPAL_LEGGINGS)
                .add(ModItems.BLACK_OPAL_BOOTS)
// Citrine
                .add(ModItems.CITRINE_HELMET)
                .add(ModItems.CITRINE_CHESTPLATE)
                .add(ModItems.CITRINE_LEGGINGS)
                .add(ModItems.CITRINE_BOOTS)
// Fluorite
                .add(ModItems.FLUORITE_HELMET)
                .add(ModItems.FLUORITE_CHESTPLATE)
                .add(ModItems.FLUORITE_LEGGINGS)
                .add(ModItems.FLUORITE_BOOTS)
// Lithium
                .add(ModItems.LITHIUM_HELMET)
                .add(ModItems.LITHIUM_CHESTPLATE)
                .add(ModItems.LITHIUM_LEGGINGS)
                .add(ModItems.LITHIUM_BOOTS)
// Mythril
                .add(ModItems.MYTHRIL_HELMET)
                .add(ModItems.MYTHRIL_CHESTPLATE)
                .add(ModItems.MYTHRIL_LEGGINGS)
                .add(ModItems.MYTHRIL_BOOTS)
// Pink Garnet
                .add(ModItems.PINK_GARNET_HELMET)
                .add(ModItems.PINK_GARNET_CHESTPLATE)
                .add(ModItems.PINK_GARNET_LEGGINGS)
                .add(ModItems.PINK_GARNET_BOOTS)
// Ruby
                .add(ModItems.RUBY_HELMET)
                .add(ModItems.RUBY_CHESTPLATE)
                .add(ModItems.RUBY_LEGGINGS)
                .add(ModItems.RUBY_BOOTS)
// Sapphire
                .add(ModItems.SAPPHIRE_HELMET)
                .add(ModItems.SAPPHIRE_CHESTPLATE)
                .add(ModItems.SAPPHIRE_LEGGINGS)
                .add(ModItems.SAPPHIRE_BOOTS)
// Tanzanite
                .add(ModItems.TANZANITE_HELMET)
                .add(ModItems.TANZANITE_CHESTPLATE)
                .add(ModItems.TANZANITE_LEGGINGS)
                .add(ModItems.TANZANITE_BOOTS)
// Titanium
                .add(ModItems.TITANIUM_HELMET)
                .add(ModItems.TITANIUM_CHESTPLATE)
                .add(ModItems.TITANIUM_LEGGINGS)
                .add(ModItems.TITANIUM_BOOTS)
// Zircon
                .add(ModItems.ZIRCON_HELMET)
                .add(ModItems.ZIRCON_CHESTPLATE)
                .add(ModItems.ZIRCON_LEGGINGS)
                .add(ModItems.ZIRCON_BOOTS);
        getOrCreateTagBuilder(ItemTags.TRIM_MATERIALS)
                .add(ModItems.ALEXANDRITE)
                .add(ModItems.AZURITE)
                .add(ModItems.BISMUTH)
                .add(ModItems.BLACK_OPAL)
                .add(ModItems.CITRINE)
                .add(ModItems.FLUORITE)
                .add(ModItems.LITHIUM)
                .add(ModItems.MYTHRIL_INGOT)
                .add(ModItems.PINK_GARNET)
                .add(ModItems.RUBY)
                .add(ModItems.SAPPHIRE)
                .add(ModItems.TANZANITE)
                .add(ModItems.TITANIUM_INGOT)
                .add(ModItems.ZIRCON);

        getOrCreateTagBuilder(ItemTags.TRIM_TEMPLATES)
                .add(ModItems.KAUPEN_SMITHING_TEMPLATE);


    }
}