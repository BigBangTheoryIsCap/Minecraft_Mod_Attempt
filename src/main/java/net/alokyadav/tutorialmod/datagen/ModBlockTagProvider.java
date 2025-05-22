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
                // Base blocks and ores
                .add(ModBlocks.PINK_GARNET_BLOCK, ModBlocks.RAW_PINK_GARNET_BLOCK, ModBlocks.PINK_GARNET_ORE, ModBlocks.PINK_GARNET_DEEPSLATE_ORE)
                .add(ModBlocks.MAGIC_BLOCK)
                .add(ModBlocks.RUBY_ORE, ModBlocks.RUBY_BLOCK, ModBlocks.RAW_RUBY_BLOCK)
                .add(ModBlocks.ALEXANDRITE_NETHER_ORE, ModBlocks.ALEXANDRITE_END_ORE, ModBlocks.ALEXANDRITE_ORE, ModBlocks.RAW_ALEXANDRITE_BLOCK, ModBlocks.ALEXANDRITE_BLOCK)
                .add(ModBlocks.BISMUTH_BLOCK, ModBlocks.BISMUTH_NETHER_ORE, ModBlocks.BISMUTH_END_ORE, ModBlocks.BISMUTH_ORE, ModBlocks.BISMUTH_DEEPSLATE_ORE)

                // Lamps
                .add(ModBlocks.ALEXANDRITE_LAMP, ModBlocks.PINK_GARNET_LAMP, ModBlocks.BISMUTH_LAMP)

                // Pink Garnet
                .add(ModBlocks.PINK_GARNET_BUTTON, ModBlocks.PINK_GARNET_PRESSURE_PLATE, ModBlocks.PINK_GARNET_DOOR, ModBlocks.PINK_GARNET_TRAPDOOR)
                .add(ModBlocks.PINK_GARNET_FENCE, ModBlocks.PINK_GARNET_FENCE_GATE, ModBlocks.PINK_GARNET_WALL, ModBlocks.PINK_GARNET_SLAB, ModBlocks.PINK_GARNET_STAIRS)

                // Alexandrite
                .add(ModBlocks.ALEXANDRITE_BUTTON, ModBlocks.ALEXANDRITE_PRESSURE_PLATE, ModBlocks.ALEXANDRITE_DOOR, ModBlocks.ALEXANDRITE_TRAPDOOR)
                .add(ModBlocks.ALEXANDRITE_FENCE, ModBlocks.ALEXANDRITE_FENCE_GATE, ModBlocks.ALEXANDRITE_WALL, ModBlocks.ALEXANDRITE_SLAB, ModBlocks.ALEXANDRITE_STAIRS)

                // Azurite
                .add(ModBlocks.AZURITE_BUTTON, ModBlocks.AZURITE_PRESSURE_PLATE, ModBlocks.AZURITE_DOOR, ModBlocks.AZURITE_TRAPDOOR)
                .add(ModBlocks.AZURITE_FENCE, ModBlocks.AZURITE_FENCE_GATE, ModBlocks.AZURITE_WALL, ModBlocks.AZURITE_SLAB, ModBlocks.AZURITE_STAIRS)

                // Bismuth
                .add(ModBlocks.BISMUTH_BUTTON, ModBlocks.BISMUTH_PRESSURE_PLATE, ModBlocks.BISMUTH_DOOR, ModBlocks.BISMUTH_TRAPDOOR)
                .add(ModBlocks.BISMUTH_FENCE, ModBlocks.BISMUTH_FENCE_GATE, ModBlocks.BISMUTH_WALL, ModBlocks.BISMUTH_SLAB, ModBlocks.BISMUTH_STAIRS)

                // Ruby
                .add(ModBlocks.RUBY_BUTTON, ModBlocks.RUBY_PRESSURE_PLATE, ModBlocks.RUBY_DOOR, ModBlocks.RUBY_TRAPDOOR)
                .add(ModBlocks.RUBY_FENCE, ModBlocks.RUBY_FENCE_GATE, ModBlocks.RUBY_WALL, ModBlocks.RUBY_SLAB, ModBlocks.RUBY_STAIRS)

                // Zircon
                .add(ModBlocks.ZIRCON_BUTTON, ModBlocks.ZIRCON_PRESSURE_PLATE, ModBlocks.ZIRCON_DOOR, ModBlocks.ZIRCON_TRAPDOOR)
                .add(ModBlocks.ZIRCON_FENCE, ModBlocks.ZIRCON_FENCE_GATE, ModBlocks.ZIRCON_WALL, ModBlocks.ZIRCON_SLAB, ModBlocks.ZIRCON_STAIRS)

                // Titanium
                .add(ModBlocks.TITANIUM_BUTTON, ModBlocks.TITANIUM_PRESSURE_PLATE, ModBlocks.TITANIUM_DOOR, ModBlocks.TITANIUM_TRAPDOOR)
                .add(ModBlocks.TITANIUM_FENCE, ModBlocks.TITANIUM_FENCE_GATE, ModBlocks.TITANIUM_WALL, ModBlocks.TITANIUM_SLAB, ModBlocks.TITANIUM_STAIRS)

                // Black Opal
                .add(ModBlocks.BLACK_OPAL_BUTTON, ModBlocks.BLACK_OPAL_PRESSURE_PLATE, ModBlocks.BLACK_OPAL_DOOR, ModBlocks.BLACK_OPAL_TRAPDOOR)
                .add(ModBlocks.BLACK_OPAL_FENCE, ModBlocks.BLACK_OPAL_FENCE_GATE, ModBlocks.BLACK_OPAL_WALL, ModBlocks.BLACK_OPAL_SLAB, ModBlocks.BLACK_OPAL_STAIRS)

                // Citrine
                .add(ModBlocks.CITRINE_BUTTON, ModBlocks.CITRINE_PRESSURE_PLATE, ModBlocks.CITRINE_DOOR, ModBlocks.CITRINE_TRAPDOOR)
                .add(ModBlocks.CITRINE_FENCE, ModBlocks.CITRINE_FENCE_GATE, ModBlocks.CITRINE_WALL, ModBlocks.CITRINE_SLAB, ModBlocks.CITRINE_STAIRS)

                // Fluorite
                .add(ModBlocks.FLUORITE_BUTTON, ModBlocks.FLUORITE_PRESSURE_PLATE, ModBlocks.FLUORITE_DOOR, ModBlocks.FLUORITE_TRAPDOOR)
                .add(ModBlocks.FLUORITE_FENCE, ModBlocks.FLUORITE_FENCE_GATE, ModBlocks.FLUORITE_WALL, ModBlocks.FLUORITE_SLAB, ModBlocks.FLUORITE_STAIRS)

                // Lithium
                .add(ModBlocks.LITHIUM_BUTTON, ModBlocks.LITHIUM_PRESSURE_PLATE, ModBlocks.LITHIUM_DOOR, ModBlocks.LITHIUM_TRAPDOOR)
                .add(ModBlocks.LITHIUM_FENCE, ModBlocks.LITHIUM_FENCE_GATE, ModBlocks.LITHIUM_WALL, ModBlocks.LITHIUM_SLAB, ModBlocks.LITHIUM_STAIRS)

                // Mythril
                .add(ModBlocks.MYTHRIL_BUTTON, ModBlocks.MYTHRIL_PRESSURE_PLATE, ModBlocks.MYTHRIL_DOOR, ModBlocks.MYTHRIL_TRAPDOOR)
                .add(ModBlocks.MYTHRIL_FENCE, ModBlocks.MYTHRIL_FENCE_GATE, ModBlocks.MYTHRIL_WALL, ModBlocks.MYTHRIL_SLAB, ModBlocks.MYTHRIL_STAIRS)

                // Sapphire
                .add(ModBlocks.SAPPHIRE_BUTTON, ModBlocks.SAPPHIRE_PRESSURE_PLATE, ModBlocks.SAPPHIRE_DOOR, ModBlocks.SAPPHIRE_TRAPDOOR)
                .add(ModBlocks.SAPPHIRE_FENCE, ModBlocks.SAPPHIRE_FENCE_GATE, ModBlocks.SAPPHIRE_WALL, ModBlocks.SAPPHIRE_SLAB, ModBlocks.SAPPHIRE_STAIRS)

                // Tanzanite
                .add(ModBlocks.TANZANITE_BUTTON, ModBlocks.TANZANITE_PRESSURE_PLATE, ModBlocks.TANZANITE_DOOR, ModBlocks.TANZANITE_TRAPDOOR)
                .add(ModBlocks.TANZANITE_FENCE, ModBlocks.TANZANITE_FENCE_GATE, ModBlocks.TANZANITE_WALL, ModBlocks.TANZANITE_SLAB, ModBlocks.TANZANITE_STAIRS);
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                // Base blocks and ores
                .add(ModBlocks.PINK_GARNET_BLOCK, ModBlocks.RAW_PINK_GARNET_BLOCK, ModBlocks.PINK_GARNET_ORE, ModBlocks.PINK_GARNET_DEEPSLATE_ORE)
                .add(ModBlocks.MAGIC_BLOCK)
                .add(ModBlocks.RUBY_ORE, ModBlocks.RUBY_BLOCK, ModBlocks.RAW_RUBY_BLOCK)
                .add(ModBlocks.ALEXANDRITE_NETHER_ORE, ModBlocks.ALEXANDRITE_END_ORE, ModBlocks.ALEXANDRITE_ORE, ModBlocks.RAW_ALEXANDRITE_BLOCK, ModBlocks.ALEXANDRITE_BLOCK)
                .add(ModBlocks.BISMUTH_BLOCK, ModBlocks.BISMUTH_NETHER_ORE, ModBlocks.BISMUTH_END_ORE, ModBlocks.BISMUTH_ORE, ModBlocks.BISMUTH_DEEPSLATE_ORE)

                // Lamps
                .add(ModBlocks.ALEXANDRITE_LAMP, ModBlocks.PINK_GARNET_LAMP, ModBlocks.BISMUTH_LAMP)

                // Pink Garnet
                .add(ModBlocks.PINK_GARNET_BUTTON, ModBlocks.PINK_GARNET_PRESSURE_PLATE, ModBlocks.PINK_GARNET_DOOR, ModBlocks.PINK_GARNET_TRAPDOOR)
                .add(ModBlocks.PINK_GARNET_FENCE, ModBlocks.PINK_GARNET_FENCE_GATE, ModBlocks.PINK_GARNET_WALL, ModBlocks.PINK_GARNET_SLAB, ModBlocks.PINK_GARNET_STAIRS)

                // Alexandrite
                .add(ModBlocks.ALEXANDRITE_BUTTON, ModBlocks.ALEXANDRITE_PRESSURE_PLATE, ModBlocks.ALEXANDRITE_DOOR, ModBlocks.ALEXANDRITE_TRAPDOOR)
                .add(ModBlocks.ALEXANDRITE_FENCE, ModBlocks.ALEXANDRITE_FENCE_GATE, ModBlocks.ALEXANDRITE_WALL, ModBlocks.ALEXANDRITE_SLAB, ModBlocks.ALEXANDRITE_STAIRS)

                // Azurite
                .add(ModBlocks.AZURITE_BUTTON, ModBlocks.AZURITE_PRESSURE_PLATE, ModBlocks.AZURITE_DOOR, ModBlocks.AZURITE_TRAPDOOR)
                .add(ModBlocks.AZURITE_FENCE, ModBlocks.AZURITE_FENCE_GATE, ModBlocks.AZURITE_WALL, ModBlocks.AZURITE_SLAB, ModBlocks.AZURITE_STAIRS)

                // Bismuth
                .add(ModBlocks.BISMUTH_BUTTON, ModBlocks.BISMUTH_PRESSURE_PLATE, ModBlocks.BISMUTH_DOOR, ModBlocks.BISMUTH_TRAPDOOR)
                .add(ModBlocks.BISMUTH_FENCE, ModBlocks.BISMUTH_FENCE_GATE, ModBlocks.BISMUTH_WALL, ModBlocks.BISMUTH_SLAB, ModBlocks.BISMUTH_STAIRS)

                // Ruby
                .add(ModBlocks.RUBY_BUTTON, ModBlocks.RUBY_PRESSURE_PLATE, ModBlocks.RUBY_DOOR, ModBlocks.RUBY_TRAPDOOR)
                .add(ModBlocks.RUBY_FENCE, ModBlocks.RUBY_FENCE_GATE, ModBlocks.RUBY_WALL, ModBlocks.RUBY_SLAB, ModBlocks.RUBY_STAIRS)

                // Zircon
                .add(ModBlocks.ZIRCON_BUTTON, ModBlocks.ZIRCON_PRESSURE_PLATE, ModBlocks.ZIRCON_DOOR, ModBlocks.ZIRCON_TRAPDOOR)
                .add(ModBlocks.ZIRCON_FENCE, ModBlocks.ZIRCON_FENCE_GATE, ModBlocks.ZIRCON_WALL, ModBlocks.ZIRCON_SLAB, ModBlocks.ZIRCON_STAIRS)

                // Titanium
                .add(ModBlocks.TITANIUM_BUTTON, ModBlocks.TITANIUM_PRESSURE_PLATE, ModBlocks.TITANIUM_DOOR, ModBlocks.TITANIUM_TRAPDOOR)
                .add(ModBlocks.TITANIUM_FENCE, ModBlocks.TITANIUM_FENCE_GATE, ModBlocks.TITANIUM_WALL, ModBlocks.TITANIUM_SLAB, ModBlocks.TITANIUM_STAIRS)

                // Black Opal
                .add(ModBlocks.BLACK_OPAL_BUTTON, ModBlocks.BLACK_OPAL_PRESSURE_PLATE, ModBlocks.BLACK_OPAL_DOOR, ModBlocks.BLACK_OPAL_TRAPDOOR)
                .add(ModBlocks.BLACK_OPAL_FENCE, ModBlocks.BLACK_OPAL_FENCE_GATE, ModBlocks.BLACK_OPAL_WALL, ModBlocks.BLACK_OPAL_SLAB, ModBlocks.BLACK_OPAL_STAIRS)

                // Citrine
                .add(ModBlocks.CITRINE_BUTTON, ModBlocks.CITRINE_PRESSURE_PLATE, ModBlocks.CITRINE_DOOR, ModBlocks.CITRINE_TRAPDOOR)
                .add(ModBlocks.CITRINE_FENCE, ModBlocks.CITRINE_FENCE_GATE, ModBlocks.CITRINE_WALL, ModBlocks.CITRINE_SLAB, ModBlocks.CITRINE_STAIRS)

                // Fluorite
                .add(ModBlocks.FLUORITE_BUTTON, ModBlocks.FLUORITE_PRESSURE_PLATE, ModBlocks.FLUORITE_DOOR, ModBlocks.FLUORITE_TRAPDOOR)
                .add(ModBlocks.FLUORITE_FENCE, ModBlocks.FLUORITE_FENCE_GATE, ModBlocks.FLUORITE_WALL, ModBlocks.FLUORITE_SLAB, ModBlocks.FLUORITE_STAIRS)

                // Lithium
                .add(ModBlocks.LITHIUM_BUTTON, ModBlocks.LITHIUM_PRESSURE_PLATE, ModBlocks.LITHIUM_DOOR, ModBlocks.LITHIUM_TRAPDOOR)
                .add(ModBlocks.LITHIUM_FENCE, ModBlocks.LITHIUM_FENCE_GATE, ModBlocks.LITHIUM_WALL, ModBlocks.LITHIUM_SLAB, ModBlocks.LITHIUM_STAIRS)

                // Mythril
                .add(ModBlocks.MYTHRIL_BUTTON, ModBlocks.MYTHRIL_PRESSURE_PLATE, ModBlocks.MYTHRIL_DOOR, ModBlocks.MYTHRIL_TRAPDOOR)
                .add(ModBlocks.MYTHRIL_FENCE, ModBlocks.MYTHRIL_FENCE_GATE, ModBlocks.MYTHRIL_WALL, ModBlocks.MYTHRIL_SLAB, ModBlocks.MYTHRIL_STAIRS)

                // Sapphire
                .add(ModBlocks.SAPPHIRE_BUTTON, ModBlocks.SAPPHIRE_PRESSURE_PLATE, ModBlocks.SAPPHIRE_DOOR, ModBlocks.SAPPHIRE_TRAPDOOR)
                .add(ModBlocks.SAPPHIRE_FENCE, ModBlocks.SAPPHIRE_FENCE_GATE, ModBlocks.SAPPHIRE_WALL, ModBlocks.SAPPHIRE_SLAB, ModBlocks.SAPPHIRE_STAIRS)

                // Tanzanite
                .add(ModBlocks.TANZANITE_BUTTON, ModBlocks.TANZANITE_PRESSURE_PLATE, ModBlocks.TANZANITE_DOOR, ModBlocks.TANZANITE_TRAPDOOR)
                .add(ModBlocks.TANZANITE_FENCE, ModBlocks.TANZANITE_FENCE_GATE, ModBlocks.TANZANITE_WALL, ModBlocks.TANZANITE_SLAB, ModBlocks.TANZANITE_STAIRS);




        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.PINK_GARNET_DEEPSLATE_ORE)
                .add(ModBlocks.ALEXANDRITE_NETHER_ORE)
                .add(ModBlocks.ALEXANDRITE_END_ORE);

        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.ALEXANDRITE_FENCE)
                .add(ModBlocks.PINK_GARNET_FENCE)
                .add(ModBlocks.BISMUTH_FENCE)
                .add(ModBlocks.AZURITE_FENCE)
                .add(ModBlocks.RUBY_FENCE)
                .add(ModBlocks.ZIRCON_FENCE)
                .add(ModBlocks.TITANIUM_FENCE)
                .add(ModBlocks.BLACK_OPAL_FENCE)
                .add(ModBlocks.CITRINE_FENCE)
                .add(ModBlocks.FLUORITE_FENCE)
                .add(ModBlocks.LITHIUM_FENCE)
                .add(ModBlocks.MYTHRIL_FENCE)
                .add(ModBlocks.SAPPHIRE_FENCE)
                .add(ModBlocks.TANZANITE_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.ALEXANDRITE_FENCE_GATE)
                .add(ModBlocks.PINK_GARNET_FENCE_GATE)
                .add(ModBlocks.BISMUTH_FENCE_GATE)
                .add(ModBlocks.AZURITE_FENCE_GATE)
                .add(ModBlocks.RUBY_FENCE_GATE)
                .add(ModBlocks.ZIRCON_FENCE_GATE)
                .add(ModBlocks.TITANIUM_FENCE_GATE)
                .add(ModBlocks.BLACK_OPAL_FENCE_GATE)
                .add(ModBlocks.CITRINE_FENCE_GATE)
                .add(ModBlocks.FLUORITE_FENCE_GATE)
                .add(ModBlocks.LITHIUM_FENCE_GATE)
                .add(ModBlocks.MYTHRIL_FENCE_GATE)
                .add(ModBlocks.SAPPHIRE_FENCE_GATE)
                .add(ModBlocks.TANZANITE_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.ALEXANDRITE_WALL)
                .add(ModBlocks.PINK_GARNET_WALL)
                .add(ModBlocks.BISMUTH_WALL)
                .add(ModBlocks.AZURITE_WALL)
                .add(ModBlocks.RUBY_WALL)
                .add(ModBlocks.ZIRCON_WALL)
                .add(ModBlocks.TITANIUM_WALL)
                .add(ModBlocks.BLACK_OPAL_WALL)
                .add(ModBlocks.CITRINE_WALL)
                .add(ModBlocks.FLUORITE_WALL)
                .add(ModBlocks.LITHIUM_WALL)
                .add(ModBlocks.MYTHRIL_WALL)
                .add(ModBlocks.SAPPHIRE_WALL)
                .add(ModBlocks.TANZANITE_WALL);



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

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_BLACK_OPAL_TOOL)
                .add(ModBlocks.MAGIC_BLOCK)
                .addTag(BlockTags.NEEDS_IRON_TOOL);
        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_AZURITE_TOOL)
                .add(ModBlocks.MAGIC_BLOCK)
                .addTag(BlockTags.NEEDS_IRON_TOOL);
        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_TANZANITE_TOOL)
                .add(ModBlocks.MAGIC_BLOCK)
                .addTag(BlockTags.NEEDS_IRON_TOOL);
        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_TITANIUM_TOOL)
                .add(ModBlocks.MAGIC_BLOCK)
                .addTag(BlockTags.NEEDS_IRON_TOOL);
        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_LITHIUM_TOOL)
                .add(ModBlocks.MAGIC_BLOCK)
                .addTag(BlockTags.NEEDS_IRON_TOOL);
        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_CITRINE_TOOL)
                .add(ModBlocks.MAGIC_BLOCK)
                .addTag(BlockTags.NEEDS_IRON_TOOL);
        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_RUBY_TOOL)
                .add(ModBlocks.MAGIC_BLOCK)
                .addTag(BlockTags.NEEDS_IRON_TOOL);
        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_SAPPHIRE_TOOL)
                .add(ModBlocks.MAGIC_BLOCK)
                .addTag(BlockTags.NEEDS_IRON_TOOL);
        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_FLUORITE_TOOL)
                .add(ModBlocks.MAGIC_BLOCK)
                .addTag(BlockTags.NEEDS_IRON_TOOL);
        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_MYTHRIL_TOOL)
                .add(ModBlocks.MAGIC_BLOCK)
                .addTag(BlockTags.NEEDS_IRON_TOOL);
        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_ZIRCON_TOOL)
                .add(ModBlocks.MAGIC_BLOCK)
                .addTag(BlockTags.NEEDS_IRON_TOOL);



    }

}