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

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.PINK_GARNET_SWORD)
                .add(ModItems.ALEXANDRITE_SWORD)
                .add(ModItems.BISMUTH_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.PINK_GARNET_PICKAXE)
                .add(ModItems.ALEXANDRITE_PICKAXE)
                .add(ModItems.BISMUTH_PICKAXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.PINK_GARNET_SHOVEL)
                .add(ModItems.ALEXANDRITE_SHOVEL)
                .add(ModItems.BISMUTH_SHOVEL);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.PINK_GARNET_AXE)
                .add(ModItems.ALEXANDRITE_AXE)
                .add(ModItems.BISMUTH_AXE);

        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.PINK_GARNET_HOE)
                .add(ModItems.ALEXANDRITE_HOE)
                .add(ModItems.BISMUTH_HOE);






        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.ALEXANDRITE_HELMET)
                .add(ModItems.ALEXANDRITE_CHESTPLATE)
                .add(ModItems.ALEXANDRITE_LEGGINGS)
                .add(ModItems.ALEXANDRITE_BOOTS)
                .add(ModItems.BISMUTH_HELMET)
                .add(ModItems.BISMUTH_CHESTPLATE)
                .add(ModItems.BISMUTH_LEGGINGS)
                .add(ModItems.BISMUTH_BOOTS)
                .add(ModItems.PINK_GARNET_HELMET)
                .add(ModItems.PINK_GARNET_CHESTPLATE)
                .add(ModItems.PINK_GARNET_LEGGINGS)
                .add(ModItems.PINK_GARNET_BOOTS);

        getOrCreateTagBuilder(ItemTags.TRIM_MATERIALS)
                .add(ModItems.PINK_GARNET)
                .add(ModItems.BISMUTH)
                .add(ModItems.ALEXANDRITE);

        getOrCreateTagBuilder(ItemTags.TRIM_TEMPLATES)
                .add(ModItems.KAUPEN_SMITHING_TEMPLATE);


    }
}