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

                .add(ModBlocks.ZIRCON_FENCE, ModBlocks.ZIRCON_FENCE_GATE, ModBlocks.ZIRCON_WALL, ModBlocks.ZIRCON_SLAB, ModBlocks.ZIRCON_STAIRS)

                // Titanium
                .add(ModBlocks.TITANIUM_BUTTON, ModBlocks.TITANIUM_PRESSURE_PLATE, ModBlocks.TITANIUM_DOOR, ModBlocks.TITANIUM_TRAPDOOR)
                .add(ModBlocks.TITANIUM_FENCE, ModBlocks.TITANIUM_FENCE_GATE, ModBlocks.TITANIUM_WALL, ModBlocks.TITANIUM_SLAB, ModBlocks.TITANIUM_STAIRS)

                // Black Opal
                .add(ModBlocks.BLACK_OPAL_BUTTON, ModBlocks.BLACK_OPAL_PRESSURE_PLATE, ModBlocks.BLACK_OPAL_DOOR, ModBlocks.BLACK_OPAL_TRAPDOOR)
                .add(ModBlocks.BLACK_OPAL_FENCE, ModBlocks.BLACK_OPAL_FENCE_GATE, ModBlocks.BLACK_OPAL_WALL, ModBlocks.BLACK_OPAL_SLAB, ModBlocks.BLACK_OPAL_STAIRS)

                // Citrine

                .add(ModBlocks.CITRINE_FENCE, ModBlocks.CITRINE_FENCE_GATE, ModBlocks.CITRINE_WALL, ModBlocks.CITRINE_SLAB, ModBlocks.CITRINE_STAIRS)

                // Fluorite
                .add(ModBlocks.FLUORITE_BUTTON, ModBlocks.FLUORITE_PRESSURE_PLATE, ModBlocks.FLUORITE_DOOR, ModBlocks.FLUORITE_TRAPDOOR)
                .add(ModBlocks.FLUORITE_FENCE, ModBlocks.FLUORITE_FENCE_GATE, ModBlocks.FLUORITE_WALL, ModBlocks.FLUORITE_SLAB, ModBlocks.FLUORITE_STAIRS)

                // Lithium

                .add(ModBlocks.LITHIUM_FENCE, ModBlocks.LITHIUM_FENCE_GATE, ModBlocks.LITHIUM_WALL, ModBlocks.LITHIUM_SLAB, ModBlocks.LITHIUM_STAIRS)

                // Mythril

                .add(ModBlocks.MYTHRIL_FENCE, ModBlocks.MYTHRIL_FENCE_GATE, ModBlocks.MYTHRIL_WALL, ModBlocks.MYTHRIL_SLAB, ModBlocks.MYTHRIL_STAIRS)

                // Sapphire
                .add(ModBlocks.SAPPHIRE_BUTTON, ModBlocks.SAPPHIRE_PRESSURE_PLATE, ModBlocks.SAPPHIRE_DOOR, ModBlocks.SAPPHIRE_TRAPDOOR)
                .add(ModBlocks.SAPPHIRE_FENCE, ModBlocks.SAPPHIRE_FENCE_GATE, ModBlocks.SAPPHIRE_WALL, ModBlocks.SAPPHIRE_SLAB, ModBlocks.SAPPHIRE_STAIRS)

                // Tanzanite

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

                .add(ModBlocks.ZIRCON_FENCE, ModBlocks.ZIRCON_FENCE_GATE, ModBlocks.ZIRCON_WALL, ModBlocks.ZIRCON_SLAB, ModBlocks.ZIRCON_STAIRS)

                // Titanium
                .add(ModBlocks.TITANIUM_BUTTON, ModBlocks.TITANIUM_PRESSURE_PLATE, ModBlocks.TITANIUM_DOOR, ModBlocks.TITANIUM_TRAPDOOR)
                .add(ModBlocks.TITANIUM_FENCE, ModBlocks.TITANIUM_FENCE_GATE, ModBlocks.TITANIUM_WALL, ModBlocks.TITANIUM_SLAB, ModBlocks.TITANIUM_STAIRS)

                // Black Opal
                .add(ModBlocks.BLACK_OPAL_BUTTON, ModBlocks.BLACK_OPAL_PRESSURE_PLATE, ModBlocks.BLACK_OPAL_DOOR, ModBlocks.BLACK_OPAL_TRAPDOOR)
                .add(ModBlocks.BLACK_OPAL_FENCE, ModBlocks.BLACK_OPAL_FENCE_GATE, ModBlocks.BLACK_OPAL_WALL, ModBlocks.BLACK_OPAL_SLAB, ModBlocks.BLACK_OPAL_STAIRS)

                // Citrine

                .add(ModBlocks.CITRINE_FENCE, ModBlocks.CITRINE_FENCE_GATE, ModBlocks.CITRINE_WALL, ModBlocks.CITRINE_SLAB, ModBlocks.CITRINE_STAIRS)

                // Fluorite
                .add(ModBlocks.FLUORITE_BUTTON, ModBlocks.FLUORITE_PRESSURE_PLATE, ModBlocks.FLUORITE_DOOR, ModBlocks.FLUORITE_TRAPDOOR)
                .add(ModBlocks.FLUORITE_FENCE, ModBlocks.FLUORITE_FENCE_GATE, ModBlocks.FLUORITE_WALL, ModBlocks.FLUORITE_SLAB, ModBlocks.FLUORITE_STAIRS)

                // Lithium

                .add(ModBlocks.LITHIUM_FENCE, ModBlocks.LITHIUM_FENCE_GATE, ModBlocks.LITHIUM_WALL, ModBlocks.LITHIUM_SLAB, ModBlocks.LITHIUM_STAIRS)


                .add(ModBlocks.MYTHRIL_FENCE, ModBlocks.MYTHRIL_FENCE_GATE, ModBlocks.MYTHRIL_WALL, ModBlocks.MYTHRIL_SLAB, ModBlocks.MYTHRIL_STAIRS)

                // Sapphire
                .add(ModBlocks.SAPPHIRE_BUTTON, ModBlocks.SAPPHIRE_PRESSURE_PLATE, ModBlocks.SAPPHIRE_DOOR, ModBlocks.SAPPHIRE_TRAPDOOR)
                .add(ModBlocks.SAPPHIRE_FENCE, ModBlocks.SAPPHIRE_FENCE_GATE, ModBlocks.SAPPHIRE_WALL, ModBlocks.SAPPHIRE_SLAB, ModBlocks.SAPPHIRE_STAIRS)
                .add(ModBlocks.TANZANITE_BUTTON, ModBlocks.TANZANITE_PRESSURE_PLATE)
                .add(ModBlocks.TANZANITE_FENCE, ModBlocks.TANZANITE_FENCE_GATE, ModBlocks.TANZANITE_WALL, ModBlocks.TANZANITE_SLAB, ModBlocks.TANZANITE_STAIRS)

                .add(ModBlocks.ADAMANTITE_BUTTON, ModBlocks.ADAMANTITE_PRESSURE_PLATE)
                .add(ModBlocks.ADAMANTITE_FENCE, ModBlocks.ADAMANTITE_FENCE_GATE, ModBlocks.ADAMANTITE_WALL, ModBlocks.ADAMANTITE_SLAB, ModBlocks.ADAMANTITE_STAIRS)

                .add(ModBlocks.AQUARIUM_BUTTON, ModBlocks.AQUARIUM_PRESSURE_PLATE)
                .add(ModBlocks.AQUARIUM_FENCE, ModBlocks.AQUARIUM_FENCE_GATE, ModBlocks.AQUARIUM_WALL, ModBlocks.AQUARIUM_SLAB, ModBlocks.AQUARIUM_STAIRS)

                .add(ModBlocks.BANGLUM_BUTTON, ModBlocks.BANGLUM_PRESSURE_PLATE)
                .add(ModBlocks.BANGLUM_FENCE, ModBlocks.BANGLUM_FENCE_GATE, ModBlocks.BANGLUM_WALL, ModBlocks.BANGLUM_SLAB, ModBlocks.BANGLUM_STAIRS)

                .add(ModBlocks.CARMOT_BUTTON, ModBlocks.CARMOT_PRESSURE_PLATE)
                .add(ModBlocks.CARMOT_FENCE, ModBlocks.CARMOT_FENCE_GATE, ModBlocks.CARMOT_WALL, ModBlocks.CARMOT_SLAB, ModBlocks.CARMOT_STAIRS)

                .add(ModBlocks.KYBER_BUTTON, ModBlocks.KYBER_PRESSURE_PLATE)
                .add(ModBlocks.KYBER_FENCE, ModBlocks.KYBER_FENCE_GATE, ModBlocks.KYBER_WALL, ModBlocks.KYBER_SLAB, ModBlocks.KYBER_STAIRS)

                .add(ModBlocks.MANGANESE_BUTTON, ModBlocks.MANGANESE_PRESSURE_PLATE)
                .add(ModBlocks.MANGANESE_FENCE, ModBlocks.MANGANESE_FENCE_GATE, ModBlocks.MANGANESE_WALL, ModBlocks.MANGANESE_SLAB, ModBlocks.MANGANESE_STAIRS)

                .add(ModBlocks.MIDAS_GOLD_BUTTON, ModBlocks.MIDAS_GOLD_PRESSURE_PLATE)
                .add(ModBlocks.MIDAS_GOLD_FENCE, ModBlocks.MIDAS_GOLD_FENCE_GATE, ModBlocks.MIDAS_GOLD_WALL, ModBlocks.MIDAS_GOLD_SLAB, ModBlocks.MIDAS_GOLD_STAIRS)

                .add(ModBlocks.MORKITE_BUTTON, ModBlocks.MORKITE_PRESSURE_PLATE)
                .add(ModBlocks.MORKITE_FENCE, ModBlocks.MORKITE_FENCE_GATE, ModBlocks.MORKITE_WALL, ModBlocks.MORKITE_SLAB, ModBlocks.MORKITE_STAIRS)

                .add(ModBlocks.ORICHALCUM_BUTTON, ModBlocks.ORICHALCUM_PRESSURE_PLATE)
                .add(ModBlocks.ORICHALCUM_FENCE, ModBlocks.ORICHALCUM_FENCE_GATE, ModBlocks.ORICHALCUM_WALL, ModBlocks.ORICHALCUM_SLAB, ModBlocks.ORICHALCUM_STAIRS)

                .add(ModBlocks.OSMIUM_BUTTON, ModBlocks.OSMIUM_PRESSURE_PLATE)
                .add(ModBlocks.OSMIUM_FENCE, ModBlocks.OSMIUM_FENCE_GATE, ModBlocks.OSMIUM_WALL, ModBlocks.OSMIUM_SLAB, ModBlocks.OSMIUM_STAIRS)

                .add(ModBlocks.PALLADIUM_BUTTON, ModBlocks.PALLADIUM_PRESSURE_PLATE)
                .add(ModBlocks.PALLADIUM_FENCE, ModBlocks.PALLADIUM_FENCE_GATE, ModBlocks.PALLADIUM_WALL, ModBlocks.PALLADIUM_SLAB, ModBlocks.PALLADIUM_STAIRS)

                .add(ModBlocks.PLATINUM_BUTTON, ModBlocks.PLATINUM_PRESSURE_PLATE)
                .add(ModBlocks.PLATINUM_FENCE, ModBlocks.PLATINUM_FENCE_GATE, ModBlocks.PLATINUM_WALL, ModBlocks.PLATINUM_SLAB, ModBlocks.PLATINUM_STAIRS)

                .add(ModBlocks.PROMETHEUM_BUTTON, ModBlocks.PROMETHEUM_PRESSURE_PLATE)
                .add(ModBlocks.PROMETHEUM_FENCE, ModBlocks.PROMETHEUM_FENCE_GATE, ModBlocks.PROMETHEUM_WALL, ModBlocks.PROMETHEUM_SLAB, ModBlocks.PROMETHEUM_STAIRS)

                .add(ModBlocks.QUADRILLUM_BUTTON, ModBlocks.QUADRILLUM_PRESSURE_PLATE)
                .add(ModBlocks.QUADRILLUM_FENCE, ModBlocks.QUADRILLUM_FENCE_GATE, ModBlocks.QUADRILLUM_WALL, ModBlocks.QUADRILLUM_SLAB, ModBlocks.QUADRILLUM_STAIRS)

                .add(ModBlocks.RUNITE_BUTTON, ModBlocks.RUNITE_PRESSURE_PLATE)
                .add(ModBlocks.RUNITE_FENCE, ModBlocks.RUNITE_FENCE_GATE, ModBlocks.RUNITE_WALL, ModBlocks.RUNITE_SLAB, ModBlocks.RUNITE_STAIRS)

                .add(ModBlocks.SILVER_BUTTON, ModBlocks.SILVER_PRESSURE_PLATE)
                .add(ModBlocks.SILVER_FENCE, ModBlocks.SILVER_FENCE_GATE, ModBlocks.SILVER_WALL, ModBlocks.SILVER_SLAB, ModBlocks.SILVER_STAIRS)

                .add(ModBlocks.STARRITE_BUTTON, ModBlocks.STARRITE_PRESSURE_PLATE)
                .add(ModBlocks.STARRITE_FENCE, ModBlocks.STARRITE_FENCE_GATE, ModBlocks.STARRITE_WALL, ModBlocks.STARRITE_SLAB, ModBlocks.STARRITE_STAIRS)

                .add(ModBlocks.STORMYX_BUTTON, ModBlocks.STORMYX_PRESSURE_PLATE)
                .add(ModBlocks.STORMYX_FENCE, ModBlocks.STORMYX_FENCE_GATE, ModBlocks.STORMYX_WALL, ModBlocks.STORMYX_SLAB, ModBlocks.STORMYX_STAIRS)

                .add(ModBlocks.TIN_BUTTON, ModBlocks.TIN_PRESSURE_PLATE)
                .add(ModBlocks.TIN_FENCE, ModBlocks.TIN_FENCE_GATE, ModBlocks.TIN_WALL, ModBlocks.TIN_SLAB, ModBlocks.TIN_STAIRS)

                .add(ModBlocks.UNOBTAINIUM_BUTTON, ModBlocks.UNOBTAINIUM_PRESSURE_PLATE)
                .add(ModBlocks.UNOBTAINIUM_FENCE, ModBlocks.UNOBTAINIUM_FENCE_GATE, ModBlocks.UNOBTAINIUM_WALL, ModBlocks.UNOBTAINIUM_SLAB, ModBlocks.UNOBTAINIUM_STAIRS);





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
                .add(ModBlocks.TANZANITE_FENCE)
                .add(ModBlocks.ADAMANTITE_FENCE)
                .add(ModBlocks.AQUARIUM_FENCE)
                .add(ModBlocks.BANGLUM_FENCE)
                .add(ModBlocks.CARMOT_FENCE)
                .add(ModBlocks.KYBER_FENCE)
                .add(ModBlocks.MANGANESE_FENCE)
                .add(ModBlocks.MIDAS_GOLD_FENCE)
                .add(ModBlocks.MORKITE_FENCE)
                .add(ModBlocks.ORICHALCUM_FENCE)
                .add(ModBlocks.OSMIUM_FENCE)
                .add(ModBlocks.PALLADIUM_FENCE)
                .add(ModBlocks.PLATINUM_FENCE)
                .add(ModBlocks.PROMETHEUM_FENCE)
                .add(ModBlocks.QUADRILLUM_FENCE)
                .add(ModBlocks.RUNITE_FENCE)
                .add(ModBlocks.SILVER_FENCE)
                .add(ModBlocks.STARRITE_FENCE)
                .add(ModBlocks.STORMYX_FENCE)
                .add(ModBlocks.TIN_FENCE)
                .add(ModBlocks.UNOBTAINIUM_FENCE);

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
                .add(ModBlocks.TANZANITE_FENCE_GATE)
                .add(ModBlocks.ADAMANTITE_FENCE_GATE)
                .add(ModBlocks.AQUARIUM_FENCE_GATE)
                .add(ModBlocks.BANGLUM_FENCE_GATE)
                .add(ModBlocks.CARMOT_FENCE_GATE)
                .add(ModBlocks.KYBER_FENCE_GATE)
                .add(ModBlocks.MANGANESE_FENCE_GATE)
                .add(ModBlocks.MIDAS_GOLD_FENCE_GATE)
                .add(ModBlocks.MORKITE_FENCE_GATE)
                .add(ModBlocks.ORICHALCUM_FENCE_GATE)
                .add(ModBlocks.OSMIUM_FENCE_GATE)
                .add(ModBlocks.PALLADIUM_FENCE_GATE)
                .add(ModBlocks.PLATINUM_FENCE_GATE)
                .add(ModBlocks.PROMETHEUM_FENCE_GATE)
                .add(ModBlocks.QUADRILLUM_FENCE_GATE)
                .add(ModBlocks.RUNITE_FENCE_GATE)
                .add(ModBlocks.SILVER_FENCE_GATE)
                .add(ModBlocks.STARRITE_FENCE_GATE)
                .add(ModBlocks.STORMYX_FENCE_GATE)
                .add(ModBlocks.TIN_FENCE_GATE)
                .add(ModBlocks.UNOBTAINIUM_FENCE_GATE);


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
        .add(ModBlocks.TANZANITE_WALL)
.add(ModBlocks.ADAMANTITE_WALL)
.add(ModBlocks.AQUARIUM_WALL)
.add(ModBlocks.BANGLUM_WALL)
.add(ModBlocks.CARMOT_WALL)
.add(ModBlocks.KYBER_WALL)
.add(ModBlocks.MANGANESE_WALL)
.add(ModBlocks.MIDAS_GOLD_WALL)
.add(ModBlocks.MORKITE_WALL)
.add(ModBlocks.ORICHALCUM_WALL)
.add(ModBlocks.OSMIUM_WALL)
.add(ModBlocks.PALLADIUM_WALL)
.add(ModBlocks.PLATINUM_WALL)
.add(ModBlocks.PROMETHEUM_WALL)
.add(ModBlocks.QUADRILLUM_WALL)
.add(ModBlocks.RUNITE_WALL)
.add(ModBlocks.SILVER_WALL)
.add(ModBlocks.STARRITE_WALL)
.add(ModBlocks.STORMYX_WALL)
.add(ModBlocks.TIN_WALL)
.add(ModBlocks.UNOBTAINIUM_WALL);




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