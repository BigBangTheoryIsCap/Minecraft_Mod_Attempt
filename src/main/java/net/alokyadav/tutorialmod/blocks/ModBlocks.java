package net.alokyadav.tutorialmod.blocks;

import net.alokyadav.tutorialmod.TutorialMod;
import net.alokyadav.tutorialmod.blocks.custom.AlexandriteLampBlock;
import net.alokyadav.tutorialmod.blocks.custom.BismuthLampBlock;
import net.alokyadav.tutorialmod.blocks.custom.MagicBlock;
import net.alokyadav.tutorialmod.blocks.custom.PinkGarnetLampBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block PINK_GARNET_BLOCK = registerBlock("pink_garnet_block",
            new Block(AbstractBlock.Settings.create().
            strength(4.0f).
            requiresTool().
            sounds(BlockSoundGroup.AMETHYST_BLOCK
            )));
    public static final Block RAW_PINK_GARNET_BLOCK = registerBlock("raw_pink_garnet_block",
            new Block(AbstractBlock.Settings.create().
                    strength(3.0f).
                    requiresTool()
            ));

    public static final Block RAW_RUBY_BLOCK = registerBlock("raw_ruby_block",
            new Block(AbstractBlock.Settings.create().
                    strength(3.0f).
                    requiresTool()
            ));

    public static final Block PINK_GARNET_ORE = registerBlock("pink_garnet_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2,5),
                    AbstractBlock.Settings.create().
                            strength(3.0f).
                            requiresTool()
            ));

    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2,5),
                    AbstractBlock.Settings.create().
                            strength(3.0f).
                            requiresTool()
            ));

    public static final Block ADAMANTITE_ORE = registerBlock("adamantite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3.0f).requiresTool()));

    public static final Block AQUARIUM_ORE = registerBlock("aquarium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3.0f).requiresTool()));

    public static final Block BANGLUM_ORE = registerBlock("banglum_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3.0f).requiresTool()));

    public static final Block CARMOT_ORE = registerBlock("carmot_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3.0f).requiresTool()));

    public static final Block KYBER_ORE = registerBlock("kyber_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3.0f).requiresTool()));

    public static final Block MANGANESE_ORE = registerBlock("manganese_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3.0f).requiresTool()));

    public static final Block MIDAS_GOLD_ORE = registerBlock("midas_gold_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3.0f).requiresTool()));

    public static final Block MORKITE_ORE = registerBlock("morkite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3.0f).requiresTool()));


    public static final Block ORICHALCUM_ORE = registerBlock("orichalcum_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3.0f).requiresTool()));

    public static final Block OSMIUM_ORE = registerBlock("osmium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3.0f).requiresTool()));

    public static final Block PALLADIUM_ORE = registerBlock("palladium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3.0f).requiresTool()));

    public static final Block PLATINUM_ORE = registerBlock("platinum_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3.0f).requiresTool()));

    public static final Block PROMETHEUM_ORE = registerBlock("prometheum_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3.0f).requiresTool()));

    public static final Block QUADRILLUM_ORE = registerBlock("quadrillum_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3.0f).requiresTool()));

    public static final Block RUNITE_ORE = registerBlock("runite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3.0f).requiresTool()));

    public static final Block SILVER_ORE = registerBlock("silver_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3.0f).requiresTool()));

    public static final Block STARRITE_ORE = registerBlock("starrite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3.0f).requiresTool()));

    public static final Block STORMYX_ORE = registerBlock("stormyx_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3.0f).requiresTool()));

    public static final Block TIN_ORE = registerBlock("tin_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3.0f).requiresTool()));

    public static final Block UNOBTAINIUM_ORE = registerBlock("unobtainium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3.0f).requiresTool()));


    public static final Block PINK_GARNET_DEEPSLATE_ORE = registerBlock("pink_garnet_deepslate_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3,7),
            AbstractBlock.Settings.create().
                    strength(5.0f).
                    requiresTool()
                    .sounds(BlockSoundGroup.DEEPSLATE)
    ));

    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new ExperienceDroppingBlock(UniformIntProvider.create(3,7),
                    AbstractBlock.Settings.create().
                            strength(3.0f).
                            requiresTool()
                            .sounds(BlockSoundGroup.DEEPSLATE)
            ));

    public static final Block BLACK_OPAL_BLOCK = registerBlock("black_opal_block",
            new ExperienceDroppingBlock(UniformIntProvider.create(3,7),
                    AbstractBlock.Settings.create().
                            strength(3.0f).
                            requiresTool()
                            .sounds(BlockSoundGroup.DEEPSLATE)
            ));

    public static final Block BLACK_OPAL_ORE = registerBlock("black_opal_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3,7),
                    AbstractBlock.Settings.create().
                            strength(3.0f).
                            requiresTool()
                            .sounds(BlockSoundGroup.DEEPSLATE)
            ));
    public static final Block DEEPSLATE_BLACK_OPAL_ORE = registerBlock("black_opal_deepslate_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3,7),
                    AbstractBlock.Settings.create().
                            strength(3.0f).
                            requiresTool()
                            .sounds(BlockSoundGroup.DEEPSLATE)
            ));
    public static final Block BLACK_OPAL_NETHER_ORE = registerBlock("black_opal_nether_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3,7),
                    AbstractBlock.Settings.create().
                            strength(3.0f).
                            requiresTool()
                            .sounds(BlockSoundGroup.DEEPSLATE)
            ));
    public static final Block BLACK_OPAL_END_ORE = registerBlock("black_opal_end_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3,7),
                    AbstractBlock.Settings.create().
                            strength(3.0f).
                            requiresTool()
                            .sounds(BlockSoundGroup.DEEPSLATE)
            ));

    // Existing material blocks...
// Adding more materials based on the provided trim_material list

    public static final Block AZURITE_BLOCK = registerBlock("azurite_block",
            new ExperienceDroppingBlock(UniformIntProvider.create(2,6),
                    AbstractBlock.Settings.create()
                            .strength(3.5f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block AZURITE_ORE = registerBlock("azurite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2,6),
                    AbstractBlock.Settings.create()
                            .strength(3.5f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block CITRINE_BLOCK = registerBlock("citrine_block",
            new ExperienceDroppingBlock(UniformIntProvider.create(2,5),
                    AbstractBlock.Settings.create()
                            .strength(3.2f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.GLASS)
            ));

    public static final Block CITRINE_ORE = registerBlock("citrine_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2,5),
                    AbstractBlock.Settings.create()
                            .strength(3.2f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block FLUORITE_BLOCK = registerBlock("fluorite_block",
            new ExperienceDroppingBlock(UniformIntProvider.create(3,7),
                    AbstractBlock.Settings.create()
                            .strength(3.0f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.CALCITE)
            ));

    public static final Block FLUORITE_ORE = registerBlock("fluorite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3,7),
                    AbstractBlock.Settings.create()
                            .strength(3.0f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block LITHIUM_BLOCK = registerBlock("lithium_block",
            new ExperienceDroppingBlock(UniformIntProvider.create(1,3),
                    AbstractBlock.Settings.create()
                            .strength(2.0f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.METAL)
            ));

    public static final Block LITHIUM_ORE = registerBlock("lithium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(1,3),
                    AbstractBlock.Settings.create()
                            .strength(2.5f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block MYTHRIL_BLOCK = registerBlock("mythril_block",
            new ExperienceDroppingBlock(UniformIntProvider.create(5,10),
                    AbstractBlock.Settings.create()
                            .strength(6.0f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.METAL)
            ));

    public static final Block MYTHRIL_ORE = registerBlock("mythril_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(5,10),
                    AbstractBlock.Settings.create()
                            .strength(5.5f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            new ExperienceDroppingBlock(UniformIntProvider.create(4,8),
                    AbstractBlock.Settings.create()
                            .strength(4.5f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.GLASS)
            ));

    public static final Block SAPPHIRE_ORE = registerBlock("sapphire_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(4,8),
                    AbstractBlock.Settings.create()
                            .strength(4.5f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block TANZANITE_BLOCK = registerBlock("tanzanite_block",
            new ExperienceDroppingBlock(UniformIntProvider.create(4,8),
                    AbstractBlock.Settings.create()
                            .strength(4.5f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.GLASS)
            ));

    public static final Block TANZANITE_ORE = registerBlock("tanzanite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(4,8),
                    AbstractBlock.Settings.create()
                            .strength(4.5f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block TITANIUM_BLOCK = registerBlock("titanium_block",
            new ExperienceDroppingBlock(UniformIntProvider.create(6,10),
                    AbstractBlock.Settings.create()
                            .strength(7.0f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.METAL)
            ));

    public static final Block TITANIUM_ORE = registerBlock("titanium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(6,10),
                    AbstractBlock.Settings.create()
                            .strength(6.5f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block ZIRCON_BLOCK = registerBlock("zircon_block",
            new ExperienceDroppingBlock(UniformIntProvider.create(3,6),
                    AbstractBlock.Settings.create()
                            .strength(4.0f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.GLASS)
            ));

    public static final Block ZIRCON_ORE = registerBlock("zircon_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3,6),
                    AbstractBlock.Settings.create()
                            .strength(4.0f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block DEEPSLATE_CITRINE_ORE = registerBlock("deepslate_citrine_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3,7),
                    AbstractBlock.Settings.create().
                            strength(3.0f).
                            requiresTool()
                            .sounds(BlockSoundGroup.DEEPSLATE)
            ));
    public static final Block DEEPSLATE_RUBY_ORE = registerBlock("black_opal_nether_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3,7),
                    AbstractBlock.Settings.create().
                            strength(3.0f).
                            requiresTool()
                            .sounds(BlockSoundGroup.DEEPSLATE)
            ));
    public static final Block ALEXANDRITE_ORE = registerBlock("alexandrite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2,5),
                    AbstractBlock.Settings.create().
                            strength(3.0f).
                            requiresTool()
            ));
    public static final Block ALEXANDRITE_NETHER_ORE = registerBlock("alexandrite_nether_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2,5),
                    AbstractBlock.Settings.create().
                            strength(3.0f).
                            requiresTool()
            ));
    public static final Block ALEXANDRITE_END_ORE = registerBlock("alexandrite_end_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2,5),
                    AbstractBlock.Settings.create().
                            strength(3.0f).
                            requiresTool()
            ));

    public static final Block BISMUTH_ORE = registerBlock("bismuth_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2,5),
                    AbstractBlock.Settings.create().
                            strength(3.0f).
                            requiresTool()
            ));

    public static final Block BISMUTH_DEEPSLATE_ORE = registerBlock("bismuth_deepslate_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2,5),
                    AbstractBlock.Settings.create().
                            strength(3.0f).
                            requiresTool()
            ));
    public static final Block BISMUTH_NETHER_ORE = registerBlock("bismuth_nether_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2,5),
                    AbstractBlock.Settings.create().
                            strength(3.0f).
                            requiresTool()
            ));
    public static final Block BISMUTH_END_ORE = registerBlock("bismuth_end_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2,5),
                    AbstractBlock.Settings.create().
                            strength(3.0f).
                            requiresTool()
            ));

    public static final Block ALEXANDRITE_BLOCK = registerBlock("alexandrite_block",
            new ExperienceDroppingBlock(UniformIntProvider.create(2,5),
                    AbstractBlock.Settings.create().
                            strength(3.0f).
                            requiresTool()
            ));
    public static final Block BISMUTH_BLOCK = registerBlock("bismuth_block",
            new ExperienceDroppingBlock(UniformIntProvider.create(2,5),
                    AbstractBlock.Settings.create().
                            strength(3.0f).
                            requiresTool()
            ));


    public static final Block RAW_ALEXANDRITE_BLOCK = registerBlock("raw_alexandrite_block",
            new ExperienceDroppingBlock(UniformIntProvider.create(2,5),
                    AbstractBlock.Settings.create().
                            strength(3.0f).
                            requiresTool()
            ));

    public static final Block PINK_GARNET_STAIRS = registerBlock("pink_garnet_stairs",
            new StairsBlock(ModBlocks.PINK_GARNET_BLOCK.getDefaultState(), AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block PINK_GARNET_SLAB = registerBlock("pink_garnet_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));



    public static final Block PINK_GARNET_BUTTON = registerBlock("pink_garnet_button",
            new ButtonBlock(BlockSetType.IRON, 2, AbstractBlock.Settings.create().strength(3.0f).requiresTool().noCollision()));
    public static final Block PINK_GARNET_PRESSURE_PLATE = registerBlock("pink_garnet_pressure_plate",
            new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));

    public static final Block PINK_GARNET_FENCE = registerBlock("pink_garnet_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block PINK_GARNET_FENCE_GATE = registerBlock("pink_garnet_fence_gate",
            new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block PINK_GARNET_WALL = registerBlock("pink_garnet_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));

    public static final Block PINK_GARNET_DOOR = registerBlock("pink_garnet_door",
            new DoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool().nonOpaque()));
    public static final Block PINK_GARNET_TRAPDOOR = registerBlock("pink_garnet_trapdoor",
            new TrapdoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool().nonOpaque()));


    public static final Block ALEXANDRITE_STAIRS = registerBlock("alexandrite_stairs",
            new StairsBlock(ModBlocks.ALEXANDRITE_BLOCK.getDefaultState(), AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block ALEXANDRITE_SLAB = registerBlock("alexandrite_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));

    public static final Block ALEXANDRITE_BUTTON = registerBlock("alexandrite_button",
            new ButtonBlock(BlockSetType.IRON, 2, AbstractBlock.Settings.create().strength(3.0f).requiresTool().noCollision()));
    public static final Block ALEXANDRITE_PRESSURE_PLATE = registerBlock("alexandrite_plate",
            new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));

    public static final Block ALEXANDRITE_FENCE = registerBlock("alexandrite_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block ALEXANDRITE_FENCE_GATE = registerBlock("alexandrite_gate",
            new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block ALEXANDRITE_WALL = registerBlock("alexandrite_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));

    public static final Block ALEXANDRITE_DOOR = registerBlock("alexandrite_door",
            new DoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool().nonOpaque()));
    public static final Block ALEXANDRITE_TRAPDOOR = registerBlock("alexandrite_trapdoor",
            new TrapdoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool().nonOpaque()));


    public static final Block BISMUTH_STAIRS = registerBlock("bismuth_stairs",
            new StairsBlock(ModBlocks.BISMUTH_BLOCK.getDefaultState(), AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block BISMUTH_SLAB = registerBlock("bismuth_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));

    public static final Block BISMUTH_BUTTON = registerBlock("bismuth_button",
            new ButtonBlock(BlockSetType.IRON, 2, AbstractBlock.Settings.create().strength(3.0f).requiresTool().noCollision()));
    public static final Block BISMUTH_PRESSURE_PLATE = registerBlock("bismuth_plate",
            new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));

    public static final Block BISMUTH_FENCE = registerBlock("bismuth_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block BISMUTH_FENCE_GATE = registerBlock("bismuth_gate",
            new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block BISMUTH_WALL = registerBlock("bismuth_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));

    public static final Block BISMUTH_DOOR = registerBlock("bismuth_door",
            new DoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool().nonOpaque()));
    public static final Block BISMUTH_TRAPDOOR = registerBlock("bismuth_trapdoor",
            new TrapdoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool().nonOpaque()));

    public static final Block AZURITE_STAIRS = registerBlock("azurite_stairs",
            new StairsBlock(ModBlocks.AZURITE_BLOCK.getDefaultState(), AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block AZURITE_SLAB = registerBlock("azurite_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));

    public static final Block AZURITE_BUTTON = registerBlock("azurite_button",
            new ButtonBlock(BlockSetType.IRON, 2, AbstractBlock.Settings.create().strength(3.0f).requiresTool().noCollision()));
    public static final Block AZURITE_PRESSURE_PLATE = registerBlock("azurite_plate",
            new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));

    public static final Block AZURITE_FENCE = registerBlock("azurite_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block AZURITE_FENCE_GATE = registerBlock("azurite_gate",
            new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block AZURITE_WALL = registerBlock("azurite_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));

    public static final Block AZURITE_DOOR = registerBlock("azurite_door",
            new DoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool().nonOpaque()));
    public static final Block AZURITE_TRAPDOOR = registerBlock("azurite_trapdoor",
            new TrapdoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool().nonOpaque()));
    // RUBY
    public static final Block RUBY_STAIRS = registerBlock("ruby_stairs",
            new StairsBlock(ModBlocks.RUBY_BLOCK.getDefaultState(), AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block RUBY_SLAB = registerBlock("ruby_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block RUBY_BUTTON = registerBlock("ruby_button",
            new ButtonBlock(BlockSetType.IRON, 2, AbstractBlock.Settings.create().strength(3.0f).requiresTool().noCollision()));
    public static final Block RUBY_PRESSURE_PLATE = registerBlock("ruby_plate",
            new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block RUBY_FENCE = registerBlock("ruby_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block RUBY_FENCE_GATE = registerBlock("ruby_gate",
            new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block RUBY_WALL = registerBlock("ruby_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block RUBY_DOOR = registerBlock("ruby_door",
            new DoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool().nonOpaque()));
    public static final Block RUBY_TRAPDOOR = registerBlock("ruby_trapdoor",
            new TrapdoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool().nonOpaque()));

    // ZIRCON
    public static final Block ZIRCON_STAIRS = registerBlock("zircon_stairs",
            new StairsBlock(ModBlocks.ZIRCON_BLOCK.getDefaultState(), AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block ZIRCON_SLAB = registerBlock("zircon_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block ZIRCON_BUTTON = registerBlock("zircon_button",
            new ButtonBlock(BlockSetType.IRON, 2, AbstractBlock.Settings.create().strength(3.0f).requiresTool().noCollision()));
    public static final Block ZIRCON_PRESSURE_PLATE = registerBlock("zircon_plate",
            new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block ZIRCON_FENCE = registerBlock("zircon_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block ZIRCON_FENCE_GATE = registerBlock("zircon_gate",
            new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block ZIRCON_WALL = registerBlock("zircon_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block ZIRCON_DOOR = registerBlock("zircon_door",
            new DoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool().nonOpaque()));
    public static final Block ZIRCON_TRAPDOOR = registerBlock("zircon_trapdoor",
            new TrapdoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool().nonOpaque()));

    // TITANIUM
    public static final Block TITANIUM_STAIRS = registerBlock("titanium_stairs",
            new StairsBlock(ModBlocks.TITANIUM_BLOCK.getDefaultState(), AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block TITANIUM_SLAB = registerBlock("titanium_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block TITANIUM_BUTTON = registerBlock("titanium_button",
            new ButtonBlock(BlockSetType.IRON, 2, AbstractBlock.Settings.create().strength(3.0f).requiresTool().noCollision()));
    public static final Block TITANIUM_PRESSURE_PLATE = registerBlock("titanium_plate",
            new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block TITANIUM_FENCE = registerBlock("titanium_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block TITANIUM_FENCE_GATE = registerBlock("titanium_gate",
            new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block TITANIUM_WALL = registerBlock("titanium_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block TITANIUM_DOOR = registerBlock("titanium_door",
            new DoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool().nonOpaque()));
    public static final Block TITANIUM_TRAPDOOR = registerBlock("titanium_trapdoor",
            new TrapdoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool().nonOpaque()));

    // BLACK_OPAL
    public static final Block BLACK_OPAL_STAIRS = registerBlock("black_opal_stairs",
            new StairsBlock(ModBlocks.BLACK_OPAL_BLOCK.getDefaultState(), AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block BLACK_OPAL_SLAB = registerBlock("black_opal_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block BLACK_OPAL_BUTTON = registerBlock("black_opal_button",
            new ButtonBlock(BlockSetType.IRON, 2, AbstractBlock.Settings.create().strength(3.0f).requiresTool().noCollision()));
    public static final Block BLACK_OPAL_PRESSURE_PLATE = registerBlock("black_opal_plate",
            new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block BLACK_OPAL_FENCE = registerBlock("black_opal_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block BLACK_OPAL_FENCE_GATE = registerBlock("black_opal_gate",
            new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block BLACK_OPAL_WALL = registerBlock("black_opal_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block BLACK_OPAL_DOOR = registerBlock("black_opal_door",
            new DoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool().nonOpaque()));
    public static final Block BLACK_OPAL_TRAPDOOR = registerBlock("black_opal_trapdoor",
            new TrapdoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool().nonOpaque()));

    // CITRINE
    public static final Block CITRINE_STAIRS = registerBlock("citrine_stairs",
            new StairsBlock(ModBlocks.CITRINE_BLOCK.getDefaultState(), AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block CITRINE_SLAB = registerBlock("citrine_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block CITRINE_BUTTON = registerBlock("citrine_button",
            new ButtonBlock(BlockSetType.IRON, 2, AbstractBlock.Settings.create().strength(3.0f).requiresTool().noCollision()));
    public static final Block CITRINE_PRESSURE_PLATE = registerBlock("citrine_plate",
            new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block CITRINE_FENCE = registerBlock("citrine_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block CITRINE_FENCE_GATE = registerBlock("citrine_gate",
            new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block CITRINE_WALL = registerBlock("citrine_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block CITRINE_DOOR = registerBlock("citrine_door",
            new DoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool().nonOpaque()));
    public static final Block CITRINE_TRAPDOOR = registerBlock("citrine_trapdoor",
            new TrapdoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool().nonOpaque()));

    // FLUORITE
    public static final Block FLUORITE_STAIRS = registerBlock("fluorite_stairs",
            new StairsBlock(ModBlocks.FLUORITE_BLOCK.getDefaultState(), AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block FLUORITE_SLAB = registerBlock("fluorite_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block FLUORITE_BUTTON = registerBlock("fluorite_button",
            new ButtonBlock(BlockSetType.IRON, 2, AbstractBlock.Settings.create().strength(3.0f).requiresTool().noCollision()));
    public static final Block FLUORITE_PRESSURE_PLATE = registerBlock("fluorite_plate",
            new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block FLUORITE_FENCE = registerBlock("fluorite_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block FLUORITE_FENCE_GATE = registerBlock("fluorite_gate",
            new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block FLUORITE_WALL = registerBlock("fluorite_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block FLUORITE_DOOR = registerBlock("fluorite_door",
            new DoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool().nonOpaque()));
    public static final Block FLUORITE_TRAPDOOR = registerBlock("fluorite_trapdoor",
            new TrapdoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool().nonOpaque()));

    // LITHIUM
    public static final Block LITHIUM_STAIRS = registerBlock("lithium_stairs",
            new StairsBlock(ModBlocks.LITHIUM_BLOCK.getDefaultState(), AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block LITHIUM_SLAB = registerBlock("lithium_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block LITHIUM_BUTTON = registerBlock("lithium_button",
            new ButtonBlock(BlockSetType.IRON, 2, AbstractBlock.Settings.create().strength(3.0f).requiresTool().noCollision()));
    public static final Block LITHIUM_PRESSURE_PLATE = registerBlock("lithium_plate",
            new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block LITHIUM_FENCE = registerBlock("lithium_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block LITHIUM_FENCE_GATE = registerBlock("lithium_gate",
            new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block LITHIUM_WALL = registerBlock("lithium_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block LITHIUM_DOOR = registerBlock("lithium_door",
            new DoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool().nonOpaque()));
    public static final Block LITHIUM_TRAPDOOR = registerBlock("lithium_trapdoor",
            new TrapdoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool().nonOpaque()));
    // MYTHRIL
    public static final Block MYTHRIL_STAIRS = registerBlock("mythril_stairs",
            new StairsBlock(ModBlocks.MYTHRIL_BLOCK.getDefaultState(), AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block MYTHRIL_SLAB = registerBlock("mythril_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block MYTHRIL_BUTTON = registerBlock("mythril_button",
            new ButtonBlock(BlockSetType.IRON, 2, AbstractBlock.Settings.create().strength(3.0f).requiresTool().noCollision()));
    public static final Block MYTHRIL_PRESSURE_PLATE = registerBlock("mythril_plate",
            new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block MYTHRIL_FENCE = registerBlock("mythril_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block MYTHRIL_FENCE_GATE = registerBlock("mythril_gate",
            new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block MYTHRIL_WALL = registerBlock("mythril_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block MYTHRIL_DOOR = registerBlock("mythril_door",
            new DoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool().nonOpaque()));
    public static final Block MYTHRIL_TRAPDOOR = registerBlock("mythril_trapdoor",
            new TrapdoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool().nonOpaque()));

    // SAPPHIRE
    public static final Block SAPPHIRE_STAIRS = registerBlock("sapphire_stairs",
            new StairsBlock(ModBlocks.SAPPHIRE_BLOCK.getDefaultState(), AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block SAPPHIRE_SLAB = registerBlock("sapphire_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block SAPPHIRE_BUTTON = registerBlock("sapphire_button",
            new ButtonBlock(BlockSetType.IRON, 2, AbstractBlock.Settings.create().strength(3.0f).requiresTool().noCollision()));
    public static final Block SAPPHIRE_PRESSURE_PLATE = registerBlock("sapphire_plate",
            new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block SAPPHIRE_FENCE = registerBlock("sapphire_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block SAPPHIRE_FENCE_GATE = registerBlock("sapphire_gate",
            new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block SAPPHIRE_WALL = registerBlock("sapphire_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block SAPPHIRE_DOOR = registerBlock("sapphire_door",
            new DoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool().nonOpaque()));
    public static final Block SAPPHIRE_TRAPDOOR = registerBlock("sapphire_trapdoor",
            new TrapdoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool().nonOpaque()));

    // TANZANITE
    public static final Block TANZANITE_STAIRS = registerBlock("tanzanite_stairs",
            new StairsBlock(ModBlocks.TANZANITE_BLOCK.getDefaultState(), AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block TANZANITE_SLAB = registerBlock("tanzanite_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block TANZANITE_BUTTON = registerBlock("tanzanite_button",
            new ButtonBlock(BlockSetType.IRON, 2, AbstractBlock.Settings.create().strength(3.0f).requiresTool().noCollision()));
    public static final Block TANZANITE_PRESSURE_PLATE = registerBlock("tanzanite_plate",
            new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block TANZANITE_FENCE = registerBlock("tanzanite_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block TANZANITE_FENCE_GATE = registerBlock("tanzanite_gate",
            new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block TANZANITE_WALL = registerBlock("tanzanite_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block TANZANITE_DOOR = registerBlock("tanzanite_door",
            new DoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool().nonOpaque()));
    public static final Block TANZANITE_TRAPDOOR = registerBlock("tanzanite_trapdoor",
            new TrapdoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool().nonOpaque()));


    public static final Block PINK_GARNET_LAMP = registerBlock("pink_garnet_lamp",
            new PinkGarnetLampBlock(AbstractBlock.Settings.create()
                    .strength(1f).requiresTool().luminance(state -> state.get(PinkGarnetLampBlock.CLICKED) ? 15 : 0)));

    public static final Block ALEXANDRITE_LAMP = registerBlock("alexandrite_lamp",
            new AlexandriteLampBlock(AbstractBlock.Settings.create()
                    .strength(1f).requiresTool().luminance(state -> state.get(AlexandriteLampBlock.CLICKED) ? 15 : 0)));

    public static final Block BISMUTH_LAMP = registerBlock("bismuth_lamp",
            new BismuthLampBlock(AbstractBlock.Settings.create()
                    .strength(1f).requiresTool().luminance(state -> state.get(BismuthLampBlock.CLICKED) ? 15 : 0)));






    public static final Block MAGIC_BLOCK = registerBlock("magic_block",
            new MagicBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name,block);
        return Registry.register(Registries.BLOCK, Identifier.of(TutorialMod.MOD_ID, name), block);
    }


    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }
    public static void registerModBlocks() {
        TutorialMod.LOGGER.info("Registering Tutorial Mod Blocks" + TutorialMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(PINK_GARNET_BLOCK);
            entries.add(RAW_PINK_GARNET_BLOCK);

            entries.add(PINK_GARNET_ORE);
            entries.add(PINK_GARNET_DEEPSLATE_ORE);
            entries.add(RUBY_ORE);

            entries.add(PINK_GARNET_STAIRS);
            entries.add(MAGIC_BLOCK);
            entries.add(PINK_GARNET_LAMP);
            entries.add(ALEXANDRITE_LAMP);
            entries.add(BISMUTH_LAMP);

            entries.add(PINK_GARNET_SLAB);
            entries.add(PINK_GARNET_FENCE);
            entries.add(PINK_GARNET_FENCE_GATE);
            entries.add(PINK_GARNET_WALL);
            entries.add(PINK_GARNET_DOOR);
            entries.add(PINK_GARNET_TRAPDOOR);
            entries.add(PINK_GARNET_BUTTON);
            entries.add(PINK_GARNET_PRESSURE_PLATE);

            entries.add(RUBY_BLOCK);
            entries.add(RAW_RUBY_BLOCK);

            entries.add(ALEXANDRITE_BLOCK);
            entries.add(RAW_ALEXANDRITE_BLOCK);
            entries.add(ALEXANDRITE_ORE);
            entries.add(ALEXANDRITE_NETHER_ORE);
            entries.add(ALEXANDRITE_END_ORE);

        });
    }
}
