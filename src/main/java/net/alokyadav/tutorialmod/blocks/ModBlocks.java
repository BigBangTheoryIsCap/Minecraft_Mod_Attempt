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
