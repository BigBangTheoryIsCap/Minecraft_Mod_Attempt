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

    public static final Block ADAMANTITE_BLOCK = registerBlock("adamantite_block",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block AQUARIUM_BLOCK = registerBlock("aquarium_block",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block BANGLUM_BLOCK = registerBlock("banglum_block",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block CARMOT_BLOCK = registerBlock("carmot_block",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block KYBER_BLOCK = registerBlock("kyber_block",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block MANGANESE_BLOCK = registerBlock("manganese_block",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block MIDAS_GOLD_BLOCK = registerBlock("midas_gold_block",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block MORKITE_BLOCK = registerBlock("morkite_block",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block ORICHALCUM_BLOCK = registerBlock("orichalcum_block",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block OSMIUM_BLOCK = registerBlock("osmium_block",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block PALLADIUM_BLOCK = registerBlock("palladium_block",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block PLATINUM_BLOCK = registerBlock("platinum_block",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block PROMETHEUM_BLOCK = registerBlock("prometheum_block",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block QUADRILLUM_BLOCK = registerBlock("quadrillum_block",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block RUNITE_BLOCK = registerBlock("runite_block",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block SILVER_BLOCK = registerBlock("silver_block",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block STARRITE_BLOCK = registerBlock("starrite_block",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block STORMYX_BLOCK = registerBlock("stormyx_block",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block TIN_BLOCK = registerBlock("tin_block",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block UNOBTAINIUM_BLOCK = registerBlock("unobtainium_block",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3.0f).requiresTool()));

    public static final Block ADAMANTITE_STAIRS = registerBlock("adamantite_stairs", new StairsBlock(ModBlocks.ADAMANTITE_BLOCK.getDefaultState(), AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block ADAMANTITE_SLAB = registerBlock("adamantite_slab", new SlabBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block ADAMANTITE_BUTTON = registerBlock("adamantite_button", new ButtonBlock(BlockSetType.IRON, 2, AbstractBlock.Settings.create().strength(3.0f).requiresTool().noCollision()));
    public static final Block ADAMANTITE_PRESSURE_PLATE = registerBlock("adamantite_plate", new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block ADAMANTITE_FENCE = registerBlock("adamantite_fence", new FenceBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block ADAMANTITE_FENCE_GATE = registerBlock("adamantite_gate", new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block ADAMANTITE_WALL = registerBlock("adamantite_wall", new WallBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block AQUARIUM_STAIRS = registerBlock("aquarium_stairs", new StairsBlock(ModBlocks.AQUARIUM_BLOCK.getDefaultState(), AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block AQUARIUM_SLAB = registerBlock("aquarium_slab", new SlabBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block AQUARIUM_BUTTON = registerBlock("aquarium_button", new ButtonBlock(BlockSetType.IRON, 2, AbstractBlock.Settings.create().strength(3.0f).requiresTool().noCollision()));
    public static final Block AQUARIUM_PRESSURE_PLATE = registerBlock("aquarium_plate", new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block AQUARIUM_FENCE = registerBlock("aquarium_fence", new FenceBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block AQUARIUM_FENCE_GATE = registerBlock("aquarium_gate", new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block AQUARIUM_WALL = registerBlock("aquarium_wall", new WallBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block BANGLUM_STAIRS = registerBlock("banglum_stairs", new StairsBlock(ModBlocks.BANGLUM_BLOCK.getDefaultState(), AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block BANGLUM_SLAB = registerBlock("banglum_slab", new SlabBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block BANGLUM_BUTTON = registerBlock("banglum_button", new ButtonBlock(BlockSetType.IRON, 2, AbstractBlock.Settings.create().strength(3.0f).requiresTool().noCollision()));
    public static final Block BANGLUM_PRESSURE_PLATE = registerBlock("banglum_plate", new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block BANGLUM_FENCE = registerBlock("banglum_fence", new FenceBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block BANGLUM_FENCE_GATE = registerBlock("banglum_gate", new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block BANGLUM_WALL = registerBlock("banglum_wall", new WallBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block CARMOT_STAIRS = registerBlock("carmot_stairs", new StairsBlock(ModBlocks.CARMOT_BLOCK.getDefaultState(), AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block CARMOT_SLAB = registerBlock("carmot_slab", new SlabBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block CARMOT_BUTTON = registerBlock("carmot_button", new ButtonBlock(BlockSetType.IRON, 2, AbstractBlock.Settings.create().strength(3.0f).requiresTool().noCollision()));
    public static final Block CARMOT_PRESSURE_PLATE = registerBlock("carmot_plate", new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block CARMOT_FENCE = registerBlock("carmot_fence", new FenceBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block CARMOT_FENCE_GATE = registerBlock("carmot_gate", new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block CARMOT_WALL = registerBlock("carmot_wall", new WallBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block KYBER_STAIRS = registerBlock("kyber_stairs", new StairsBlock(ModBlocks.KYBER_BLOCK.getDefaultState(), AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block KYBER_SLAB = registerBlock("kyber_slab", new SlabBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block KYBER_BUTTON = registerBlock("kyber_button", new ButtonBlock(BlockSetType.IRON, 2, AbstractBlock.Settings.create().strength(3.0f).requiresTool().noCollision()));
    public static final Block KYBER_PRESSURE_PLATE = registerBlock("kyber_plate", new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block KYBER_FENCE = registerBlock("kyber_fence", new FenceBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block KYBER_FENCE_GATE = registerBlock("kyber_gate", new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block KYBER_WALL = registerBlock("kyber_wall", new WallBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block MANGANESE_STAIRS = registerBlock("manganese_stairs", new StairsBlock(ModBlocks.MANGANESE_BLOCK.getDefaultState(), AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block MANGANESE_SLAB = registerBlock("manganese_slab", new SlabBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block MANGANESE_BUTTON = registerBlock("manganese_button", new ButtonBlock(BlockSetType.IRON, 2, AbstractBlock.Settings.create().strength(3.0f).requiresTool().noCollision()));
    public static final Block MANGANESE_PRESSURE_PLATE = registerBlock("manganese_plate", new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block MANGANESE_FENCE = registerBlock("manganese_fence", new FenceBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block MANGANESE_FENCE_GATE = registerBlock("manganese_gate", new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block MANGANESE_WALL = registerBlock("manganese_wall", new WallBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block MIDAS_GOLD_STAIRS = registerBlock("midas_gold_stairs", new StairsBlock(ModBlocks.MIDAS_GOLD_BLOCK.getDefaultState(), AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block MIDAS_GOLD_SLAB = registerBlock("midas_gold_slab", new SlabBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block MIDAS_GOLD_BUTTON = registerBlock("midas_gold_button", new ButtonBlock(BlockSetType.IRON, 2, AbstractBlock.Settings.create().strength(3.0f).requiresTool().noCollision()));
    public static final Block MIDAS_GOLD_PRESSURE_PLATE = registerBlock("midas_gold_plate", new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block MIDAS_GOLD_FENCE = registerBlock("midas_gold_fence", new FenceBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block MIDAS_GOLD_FENCE_GATE = registerBlock("midas_gold_gate", new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block MIDAS_GOLD_WALL = registerBlock("midas_gold_wall", new WallBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
  public static final Block MORKITE_STAIRS = registerBlock("morkite_stairs", new StairsBlock(ModBlocks.MORKITE_BLOCK.getDefaultState(), AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block MORKITE_SLAB = registerBlock("morkite_slab", new SlabBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block MORKITE_BUTTON = registerBlock("morkite_button", new ButtonBlock(BlockSetType.IRON, 2, AbstractBlock.Settings.create().strength(3.0f).requiresTool().noCollision()));
    public static final Block MORKITE_PRESSURE_PLATE = registerBlock("morkite_plate", new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block MORKITE_FENCE = registerBlock("morkite_fence", new FenceBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block MORKITE_FENCE_GATE = registerBlock("morkite_gate", new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block MORKITE_WALL = registerBlock("morkite_wall", new WallBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
 public static final Block ORICHALCUM_STAIRS = registerBlock("orichalcum_stairs", new StairsBlock(ModBlocks.ORICHALCUM_BLOCK.getDefaultState(), AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block ORICHALCUM_SLAB = registerBlock("orichalcum_slab", new SlabBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block ORICHALCUM_BUTTON = registerBlock("orichalcum_button", new ButtonBlock(BlockSetType.IRON, 2, AbstractBlock.Settings.create().strength(3.0f).requiresTool().noCollision()));
    public static final Block ORICHALCUM_PRESSURE_PLATE = registerBlock("orichalcum_plate", new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block ORICHALCUM_FENCE = registerBlock("orichalcum_fence", new FenceBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block ORICHALCUM_FENCE_GATE = registerBlock("orichalcum_gate", new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block ORICHALCUM_WALL = registerBlock("orichalcum_wall", new WallBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
public static final Block OSMIUM_STAIRS = registerBlock("osmium_stairs", new StairsBlock(ModBlocks.OSMIUM_BLOCK.getDefaultState(), AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block OSMIUM_SLAB = registerBlock("osmium_slab", new SlabBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block OSMIUM_BUTTON = registerBlock("osmium_button", new ButtonBlock(BlockSetType.IRON, 2, AbstractBlock.Settings.create().strength(3.0f).requiresTool().noCollision()));
    public static final Block OSMIUM_PRESSURE_PLATE = registerBlock("osmium_plate", new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block OSMIUM_FENCE = registerBlock("osmium_fence", new FenceBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block OSMIUM_FENCE_GATE = registerBlock("osmium_gate", new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block OSMIUM_WALL = registerBlock("osmium_wall", new WallBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
 public static final Block PALLADIUM_STAIRS = registerBlock("palladium_stairs", new StairsBlock(ModBlocks.PALLADIUM_BLOCK.getDefaultState(), AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block PALLADIUM_SLAB = registerBlock("palladium_slab", new SlabBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block PALLADIUM_BUTTON = registerBlock("palladium_button", new ButtonBlock(BlockSetType.IRON, 2, AbstractBlock.Settings.create().strength(3.0f).requiresTool().noCollision()));
    public static final Block PALLADIUM_PRESSURE_PLATE = registerBlock("palladium_plate", new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block PALLADIUM_FENCE = registerBlock("palladium_fence", new FenceBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block PALLADIUM_FENCE_GATE = registerBlock("palladium_gate", new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block PALLADIUM_WALL = registerBlock("palladium_wall", new WallBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
public static final Block PLATINUM_STAIRS = registerBlock("platinum_stairs", new StairsBlock(ModBlocks.PLATINUM_BLOCK.getDefaultState(), AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block PLATINUM_SLAB = registerBlock("platinum_slab", new SlabBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block PLATINUM_BUTTON = registerBlock("platinum_button", new ButtonBlock(BlockSetType.IRON, 2, AbstractBlock.Settings.create().strength(3.0f).requiresTool().noCollision()));
    public static final Block PLATINUM_PRESSURE_PLATE = registerBlock("platinum_plate", new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block PLATINUM_FENCE = registerBlock("platinum_fence", new FenceBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block PLATINUM_FENCE_GATE = registerBlock("platinum_gate", new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block PLATINUM_WALL = registerBlock("platinum_wall", new WallBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
public static final Block RUNITE_STAIRS = registerBlock("runite_stairs", new StairsBlock(ModBlocks.RUNITE_BLOCK.getDefaultState(), AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block RUNITE_SLAB = registerBlock("runite_slab", new SlabBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block RUNITE_BUTTON = registerBlock("runite_button", new ButtonBlock(BlockSetType.IRON, 2, AbstractBlock.Settings.create().strength(3.0f).requiresTool().noCollision()));
    public static final Block RUNITE_PRESSURE_PLATE = registerBlock("runite_plate", new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block RUNITE_FENCE = registerBlock("runite_fence", new FenceBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block RUNITE_FENCE_GATE = registerBlock("runite_gate", new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block RUNITE_WALL = registerBlock("runite_wall", new WallBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
 public static final Block QUADRILLUM_STAIRS = registerBlock("quadrillum_stairs", new StairsBlock(ModBlocks.QUADRILLUM_BLOCK.getDefaultState(), AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block QUADRILLUM_SLAB = registerBlock("quadrillum_slab", new SlabBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block QUADRILLUM_BUTTON = registerBlock("quadrillum_button", new ButtonBlock(BlockSetType.IRON, 2, AbstractBlock.Settings.create().strength(3.0f).requiresTool().noCollision()));
    public static final Block QUADRILLUM_PRESSURE_PLATE = registerBlock("quadrillum_plate", new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block QUADRILLUM_FENCE = registerBlock("quadrillum_fence", new FenceBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block QUADRILLUM_FENCE_GATE = registerBlock("quadrillum_gate", new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block QUADRILLUM_WALL = registerBlock("quadrillum_wall", new WallBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
 public static final Block PROMETHEUM_STAIRS = registerBlock("prometheum_stairs", new StairsBlock(ModBlocks.PROMETHEUM_BLOCK.getDefaultState(), AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block PROMETHEUM_SLAB = registerBlock("prometheum_slab", new SlabBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block PROMETHEUM_BUTTON = registerBlock("prometheum_button", new ButtonBlock(BlockSetType.IRON, 2, AbstractBlock.Settings.create().strength(3.0f).requiresTool().noCollision()));
    public static final Block PROMETHEUM_PRESSURE_PLATE = registerBlock("prometheum_plate", new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block PROMETHEUM_FENCE = registerBlock("prometheum_fence", new FenceBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block PROMETHEUM_FENCE_GATE = registerBlock("prometheum_gate", new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block PROMETHEUM_WALL = registerBlock("prometheum_wall", new WallBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
public static final Block SILVER_STAIRS = registerBlock("silver_stairs", new StairsBlock(ModBlocks.SILVER_BLOCK.getDefaultState(), AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block SILVER_SLAB = registerBlock("silver_slab", new SlabBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block SILVER_BUTTON = registerBlock("silver_button", new ButtonBlock(BlockSetType.IRON, 2, AbstractBlock.Settings.create().strength(3.0f).requiresTool().noCollision()));
    public static final Block SILVER_PRESSURE_PLATE = registerBlock("silver_plate", new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block SILVER_FENCE = registerBlock("silver_fence", new FenceBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block SILVER_FENCE_GATE = registerBlock("silver_gate", new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block SILVER_WALL = registerBlock("silver_wall", new WallBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
 public static final Block STARRITE_STAIRS = registerBlock("starrite_stairs", new StairsBlock(ModBlocks.STARRITE_BLOCK.getDefaultState(), AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block STARRITE_SLAB = registerBlock("starrite_slab", new SlabBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block STARRITE_BUTTON = registerBlock("starrite_button", new ButtonBlock(BlockSetType.IRON, 2, AbstractBlock.Settings.create().strength(3.0f).requiresTool().noCollision()));
    public static final Block STARRITE_PRESSURE_PLATE = registerBlock("starrite_plate", new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block STARRITE_FENCE = registerBlock("starrite_fence", new FenceBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block STARRITE_FENCE_GATE = registerBlock("starrite_gate", new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block STARRITE_WALL = registerBlock("starrite_wall", new WallBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block STORMYX_STAIRS = registerBlock("stormyx_stairs", new StairsBlock(ModBlocks.STORMYX_BLOCK.getDefaultState(), AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block STORMYX_SLAB = registerBlock("stormyx_slab", new SlabBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block STORMYX_BUTTON = registerBlock("stormyx_button", new ButtonBlock(BlockSetType.IRON, 2, AbstractBlock.Settings.create().strength(3.0f).requiresTool().noCollision()));
    public static final Block STORMYX_PRESSURE_PLATE = registerBlock("stormyx_plate", new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block STORMYX_FENCE = registerBlock("stormyx_fence", new FenceBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block STORMYX_FENCE_GATE = registerBlock("stormyx_gate", new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block STORMYX_WALL = registerBlock("stormyx_wall", new WallBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block UNOBTAINIUM_STAIRS = registerBlock("unobtainium_stairs", new StairsBlock(ModBlocks.UNOBTAINIUM_BLOCK.getDefaultState(), AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block UNOBTAINIUM_SLAB = registerBlock("unobtainium_slab", new SlabBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block UNOBTAINIUM_BUTTON = registerBlock("unobtainium_button", new ButtonBlock(BlockSetType.IRON, 2, AbstractBlock.Settings.create().strength(3.0f).requiresTool().noCollision()));
    public static final Block UNOBTAINIUM_PRESSURE_PLATE = registerBlock("unobtainium_plate", new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block UNOBTAINIUM_FENCE = registerBlock("unobtainium_fence", new FenceBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block UNOBTAINIUM_FENCE_GATE = registerBlock("unobtainium_gate", new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block UNOBTAINIUM_WALL = registerBlock("unobtainium_wall", new WallBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block TIN_STAIRS = registerBlock("tin_stairs", new StairsBlock(ModBlocks.TIN_BLOCK.getDefaultState(), AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block TIN_SLAB = registerBlock("tin_slab", new SlabBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block TIN_BUTTON = registerBlock("tin_button", new ButtonBlock(BlockSetType.IRON, 2, AbstractBlock.Settings.create().strength(3.0f).requiresTool().noCollision()));
    public static final Block TIN_PRESSURE_PLATE = registerBlock("tin_plate", new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block TIN_FENCE = registerBlock("tin_fence", new FenceBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block TIN_FENCE_GATE = registerBlock("tin_gate", new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(3.0f).requiresTool()));
    public static final Block TIN_WALL = registerBlock("tin_wall", new WallBlock(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));















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
