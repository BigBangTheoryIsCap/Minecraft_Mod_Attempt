package net.alokyadav.tutorialmod.datagen;

import net.alokyadav.tutorialmod.blocks.ModBlocks;
import net.alokyadav.tutorialmod.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;


public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.PINK_GARNET_BLOCK)
                .add(ModBlocks.RAW_PINK_GARNET_BLOCK)
                .add(ModBlocks.PINK_GARNET_ORE)
                .add(ModBlocks.PINK_GARNET_DEEPSLATE_ORE)
                .add(ModBlocks.MAGIC_BLOCK)

                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.RAW_RUBY_BLOCK)

                .add(ModBlocks.ALEXANDRITE_NETHER_ORE)
                .add(ModBlocks.ALEXANDRITE_END_ORE)
                .add(ModBlocks.ALEXANDRITE_ORE)
                .add(ModBlocks.RAW_ALEXANDRITE_BLOCK)
                .add(ModBlocks.ALEXANDRITE_BLOCK)

                .add(ModBlocks.BISMUTH_BLOCK)

                .add(ModBlocks.BISMUTH_NETHER_ORE)
                .add(ModBlocks.BISMUTH_END_ORE)
                .add(ModBlocks.BISMUTH_ORE)
                .add(ModBlocks.BISMUTH_DEEPSLATE_ORE)

                .add(ModBlocks.ALEXANDRITE_LAMP)
                .add(ModBlocks.PINK_GARNET_LAMP)
                .add(ModBlocks.BISMUTH_LAMP)


                .add(ModBlocks.PINK_GARNET_BUTTON)
                .add(ModBlocks.PINK_GARNET_PRESSURE_PLATE)
                .add(ModBlocks.PINK_GARNET_DOOR)
                .add(ModBlocks.PINK_GARNET_TRAPDOOR)
                .add(ModBlocks.PINK_GARNET_FENCE)
                .add(ModBlocks.PINK_GARNET_FENCE_GATE)
                .add(ModBlocks.PINK_GARNET_WALL)
                .add(ModBlocks.PINK_GARNET_SLAB)
                .add(ModBlocks.PINK_GARNET_STAIRS)

                .add(ModBlocks.ALEXANDRITE_BUTTON)
                .add(ModBlocks.ALEXANDRITE_PRESSURE_PLATE)
                .add(ModBlocks.ALEXANDRITE_DOOR)
                .add(ModBlocks.ALEXANDRITE_TRAPDOOR)
                .add(ModBlocks.ALEXANDRITE_FENCE)
                .add(ModBlocks.ALEXANDRITE_FENCE_GATE)
                .add(ModBlocks.ALEXANDRITE_WALL)
                .add(ModBlocks.ALEXANDRITE_SLAB)
                .add(ModBlocks.ALEXANDRITE_STAIRS)

                .add(ModBlocks.BISMUTH_BUTTON)
                .add(ModBlocks.BISMUTH_PRESSURE_PLATE)
                .add(ModBlocks.BISMUTH_DOOR)
                .add(ModBlocks.BISMUTH_TRAPDOOR)
                .add(ModBlocks.BISMUTH_FENCE)
                .add(ModBlocks.BISMUTH_FENCE_GATE)
                .add(ModBlocks.BISMUTH_WALL)
                .add(ModBlocks.BISMUTH_SLAB)
                .add(ModBlocks.BISMUTH_STAIRS);



        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.PINK_GARNET_DEEPSLATE_ORE)
                .add(ModBlocks.ALEXANDRITE_NETHER_ORE)
                .add(ModBlocks.ALEXANDRITE_END_ORE);


        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.ALEXANDRITE_FENCE)
                .add(ModBlocks.PINK_GARNET_FENCE)
                .add(ModBlocks.BISMUTH_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.ALEXANDRITE_FENCE_GATE)
                .add(ModBlocks.PINK_GARNET_FENCE_GATE)
                .add(ModBlocks.BISMUTH_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.ALEXANDRITE_WALL)
                .add(ModBlocks.PINK_GARNET_WALL)
                .add(ModBlocks.BISMUTH_WALL);



        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.MAGIC_BLOCK);

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_PINK_GARNET_TOOL)
                .add(ModBlocks.MAGIC_BLOCK)
                .addTag(BlockTags.NEEDS_IRON_TOOL);

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_ALEXANDRITE_TOOL)
                .add(ModBlocks.MAGIC_BLOCK)
                .addTag(BlockTags.NEEDS_IRON_TOOL);

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_BISMUTH_TOOL)
                .add(ModBlocks.MAGIC_BLOCK)
                .addTag(BlockTags.NEEDS_IRON_TOOL);


    }

}