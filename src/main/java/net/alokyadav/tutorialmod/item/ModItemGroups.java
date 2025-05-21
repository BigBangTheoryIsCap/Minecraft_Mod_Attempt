package net.alokyadav.tutorialmod.item;

import com.sun.jna.platform.unix.X11;
import net.alokyadav.tutorialmod.TutorialMod;
import net.alokyadav.tutorialmod.blocks.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static net.alokyadav.tutorialmod.blocks.ModBlocks.*;

public class ModItemGroups {
    public static final ItemGroup PINK_GARNET_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID,"pink_garnet_items"), FabricItemGroup
                    .builder()
                    .icon(()-> new ItemStack(ModItems.PINK_GARNET))
                    .displayName(Text.translatable("itemgroup.tutorial-mod.pink_garnet_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PINK_GARNET);
                        entries.add(ModItems.RAW_PINK_GARNET);
                        entries.add(ModItems.CHISEL);

                        entries.add(ModItems.PINK_GARNET_AXE);
                        entries.add(ModItems.PINK_GARNET_HOE);
                        entries.add(ModItems.PINK_GARNET_SHOVEL);
                        entries.add(ModItems.PINK_GARNET_SWORD);
                        entries.add(ModItems.PINK_GARNET_PICKAXE);
                        entries.add(ModItems.PINK_GARNET_HAMMER);


                        entries.add(ModItems.PINK_GARNET_BOOTS);
                        entries.add(ModItems.PINK_GARNET_CHESTPLATE);
                        entries.add(ModItems.PINK_GARNET_LEGGINGS);
                        entries.add(ModItems.PINK_GARNET_HELMET);

                        entries.add(ModBlocks.PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.PINK_GARNET_ORE);
                        entries.add(ModBlocks.PINK_GARNET_DEEPSLATE_ORE);
                        entries.add(ModBlocks.PINK_GARNET_STAIRS);

                        entries.add(ModBlocks.PINK_GARNET_SLAB);
                        entries.add(ModBlocks.PINK_GARNET_FENCE);
                        entries.add(ModBlocks.PINK_GARNET_FENCE_GATE);
                        entries.add(ModBlocks.PINK_GARNET_WALL);
                        entries.add(ModBlocks.PINK_GARNET_DOOR);
                        entries.add(ModBlocks.PINK_GARNET_TRAPDOOR);
                        entries.add(ModBlocks.PINK_GARNET_BUTTON);
                        entries.add(ModBlocks.PINK_GARNET_PRESSURE_PLATE);
                        entries.add(ModBlocks.PINK_GARNET_LAMP);

                        entries.add(ModItems.KAUPEN_SMITHING_TEMPLATE);

                        entries.add(ModItems.PINK_GARNET_HORSE_ARMOR);

                        entries.add(ModItems.KAUPEN_BOW);

                    }).build());

    public static final ItemGroup RUBY_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID,"ruby_items"), FabricItemGroup
                    .builder()
                    .icon(()-> new ItemStack(ModItems.RUBY))
                    .displayName(Text.translatable("itemgroup.tutorial-mod.ruby"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RAW_RUBY);
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.RAW_RUBY_BLOCK);
                        entries.add(ModItems.RUBY_HELMET);
                        entries      .add(ModItems.RUBY_CHESTPLATE);
                        entries     .add(ModItems.RUBY_LEGGINGS);
                        entries     .add(ModItems.RUBY_BOOTS);
                        entries.add(ModItems.RUBY_PICKAXE);
                        entries.add(ModItems.RUBY_AXE);
                        entries.add(ModItems.RUBY_SHOVEL);
                        entries.add(ModItems.RUBY_SWORD);
                        entries.add(ModItems.RUBY_HOE);



                    }).build());
    public static final ItemGroup ALEXANDRITE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID,"alexandrite_items"), FabricItemGroup
                    .builder()
                    .icon(()-> new ItemStack(ModItems.ALEXANDRITE))
                    .displayName(Text.translatable("itemgroup.tutorial-mod.alexandrite"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.ALEXANDRITE);
                        entries.add(ModItems.RAW_ALEXANDRITE);

                        entries.add(ALEXANDRITE_BLOCK);
                        entries.add(RAW_ALEXANDRITE_BLOCK);
                        entries.add(ALEXANDRITE_ORE);
                        entries.add(ALEXANDRITE_NETHER_ORE);
                        entries.add(ALEXANDRITE_END_ORE);

                        entries.add(ModItems.ALEXANDRITE_PICKAXE);
                        entries.add(ModItems.ALEXANDRITE_AXE);
                        entries.add(ModItems.ALEXANDRITE_SHOVEL);
                        entries.add(ModItems.ALEXANDRITE_SWORD);
                        entries.add(ModItems.ALEXANDRITE_HOE);
                        entries.add(ModItems.ALEXANDRITE_HAMMER);

                        entries.add(ModItems.ALEXANDRITE_CHESTPLATE);
                        entries.add(ModItems.ALEXANDRITE_HELMET);
                        entries.add(ModItems.ALEXANDRITE_BOOTS);
                        entries.add(ModItems.ALEXANDRITE_LEGGINGS);

                        entries.add(ModItems.ALEXANDRITE_HORSE_ARMOR);

                        entries.add(ModBlocks.ALEXANDRITE_SLAB);
                        entries.add(ModBlocks.ALEXANDRITE_FENCE);
                        entries.add(ModBlocks.ALEXANDRITE_FENCE_GATE);
                        entries.add(ModBlocks.ALEXANDRITE_WALL);
                        entries.add(ModBlocks.ALEXANDRITE_DOOR);
                        entries.add(ModBlocks.ALEXANDRITE_TRAPDOOR);
                        entries.add(ModBlocks.ALEXANDRITE_BUTTON);
                        entries.add(ModBlocks.ALEXANDRITE_PRESSURE_PLATE);
                        entries.add(ModBlocks.ALEXANDRITE_STAIRS);

                        entries.add(ModItems.KAUPEN_SMITHING_TEMPLATE);

                        entries.add(ModBlocks.ALEXANDRITE_LAMP);

                        entries.add(ModItems.KAUPEN_BOW);




                    }).build());

    public static final ItemGroup BLACK_OPAL_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID,"black_opal_items"), FabricItemGroup
                    .builder()
                    .icon(()-> new ItemStack(ModItems.BLACK_OPAL))
                    .displayName(Text.translatable("itemgroup.tutorial-mod.black_opal"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.BLACK_OPAL);
                        entries.add(ModItems.RAW_BLACK_OPAL);
                        entries                .add(ModItems.BLACK_OPAL_HELMET);
                        entries         .add(ModItems.BLACK_OPAL_CHESTPLATE);
                        entries         .add(ModItems.BLACK_OPAL_LEGGINGS);
                        entries        .add(ModItems.BLACK_OPAL_BOOTS);
                        entries.add(ModItems.BLACK_OPAL_PICKAXE);
                        entries.add(ModItems.BLACK_OPAL_AXE);
                        entries.add(ModItems.BLACK_OPAL_SHOVEL);
                        entries.add(ModItems.BLACK_OPAL_SWORD);
                        entries.add(ModItems.BLACK_OPAL_HOE);
                    }).build());

    public static final ItemGroup AZURITE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID,"azurite_items"), FabricItemGroup
                    .builder()
                    .icon(()-> new ItemStack(ModItems.AZURITE))
                    .displayName(Text.translatable("itemgroup.tutorial-mod.azurite"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.AZURITE);
                        entries.add(ModItems.RAW_AZURITE);
                        entries                .add(ModItems.AZURITE_HELMET);
                        entries         .add(ModItems.AZURITE_CHESTPLATE);
                        entries      .add(ModItems.AZURITE_LEGGINGS);
                        entries    .add(ModItems.AZURITE_BOOTS);

                        entries.add(ModItems.AZURITE_PICKAXE);
                        entries.add(ModItems.AZURITE_AXE);
                        entries.add(ModItems.AZURITE_SHOVEL);
                        entries.add(ModItems.AZURITE_SWORD);
                        entries.add(ModItems.AZURITE_HOE);

                    }).build());

    public static final ItemGroup MYTHRIL_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID,"mythril_items"), FabricItemGroup
                    .builder()
                    .icon(()-> new ItemStack(ModItems.MAGIC_MYTHRIL_DUST))
                    .displayName(Text.translatable("itemgroup.tutorial-mod.mythril"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.MAGIC_MYTHRIL_DUST);
                        entries.add(ModItems.MYTHRIL_INGOT);
                        entries.add(ModItems.RAW_MYTHRIL);
                        entries                .add(ModItems.MYTHRIL_HELMET);
                        entries    .add(ModItems.MYTHRIL_CHESTPLATE);
                        entries    .add(ModItems.MYTHRIL_LEGGINGS);
                        entries    .add(ModItems.MYTHRIL_BOOTS);

                    }).build());
    public static final ItemGroup FLUORITE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID,"fluorite_items"), FabricItemGroup
                    .builder()
                    .icon(()-> new ItemStack(ModItems.FLUORITE))
                    .displayName(Text.translatable("itemgroup.tutorial-mod.fluorite"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.FLUORITE);
                        entries.add(ModItems.RAW_FLUORITE);

                        entries                .add(ModItems.FLUORITE_HELMET);
                        entries  .add(ModItems.FLUORITE_CHESTPLATE);
                        entries   .add(ModItems.FLUORITE_LEGGINGS);
                        entries    .add(ModItems.FLUORITE_BOOTS);
                        entries.add(ModItems.FLUORITE_PICKAXE);
                        entries.add(ModItems.FLUORITE_AXE);
                        entries.add(ModItems.FLUORITE_SHOVEL);
                        entries.add(ModItems.FLUORITE_SWORD);
                        entries.add(ModItems.FLUORITE_HOE);
                    }).build());

    public static final ItemGroup TANZANITE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID,"tanzanite_items"), FabricItemGroup
                    .builder()
                    .icon(()-> new ItemStack(ModItems.TANZANITE))
                    .displayName(Text.translatable("itemgroup.tutorial-mod.tanzanite"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.TANZANITE);
                        entries.add(ModItems.RAW_TANZANITE);

                        entries.add(ModItems.TANZANITE_HELMET);
                                entries.add(ModItems.TANZANITE_CHESTPLATE);
                                entries.add(ModItems.TANZANITE_LEGGINGS);
                                entries.add(ModItems.TANZANITE_BOOTS);
                        entries.add(ModItems.TANZANITE_PICKAXE);
                        entries.add(ModItems.TANZANITE_AXE);
                        entries.add(ModItems.TANZANITE_SHOVEL);
                        entries.add(ModItems.TANZANITE_SWORD);
                        entries.add(ModItems.TANZANITE_HOE);


                    }).build());
    public static final ItemGroup TITANIUM_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID,"titanium_items"), FabricItemGroup
                    .builder()
                    .icon(()-> new ItemStack(ModItems.TITANIUM_INGOT))
                    .displayName(Text.translatable("itemgroup.tutorial-mod.titanium"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.TITANIUM_INGOT);
                        entries.add(ModItems.RAW_TITANIUM);

                            entries            .add(ModItems.TITANIUM_HELMET);
                          entries      .add(ModItems.TITANIUM_CHESTPLATE);
                          entries      .add(ModItems.TITANIUM_LEGGINGS);
                           entries     .add(ModItems.TITANIUM_BOOTS);

                        entries.add(ModItems.TITANIUM_PICKAXE);
                        entries.add(ModItems.TITANIUM_AXE);
                        entries.add(ModItems.TITANIUM_SHOVEL);
                        entries.add(ModItems.TITANIUM_SWORD);
                        entries.add(ModItems.TITANIUM_HOE);


                    }).build());
    public static final ItemGroup ZIRCON_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID,"zircon_items"), FabricItemGroup
                    .builder()
                    .icon(()-> new ItemStack(ModItems.ZIRCON))
                    .displayName(Text.translatable("itemgroup.tutorial-mod.zircon"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.ZIRCON);
                        entries.add(ModItems.RAW_ZIRCON);

                         entries       .add(ModItems.ZIRCON_HELMET);
                           entries     .add(ModItems.ZIRCON_CHESTPLATE);
                            entries    .add(ModItems.ZIRCON_LEGGINGS);
                             entries   .add(ModItems.ZIRCON_BOOTS);

                        entries.add(ModItems.ZIRCON_PICKAXE);
                        entries.add(ModItems.ZIRCON_AXE);
                        entries.add(ModItems.ZIRCON_SHOVEL);
                        entries.add(ModItems.ZIRCON_SWORD);
                        entries.add(ModItems.ZIRCON_HOE);


                    }).build());
    public static final ItemGroup SAPPHIRE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID,"sapphire_items"), FabricItemGroup
                    .builder()
                    .icon(()-> new ItemStack(ModItems.SAPPHIRE))
                    .displayName(Text.translatable("itemgroup.tutorial-mod.sapphire"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.SAPPHIRE);
                        entries.add(ModItems.RAW_SAPPHIRE);
                                        entries.add(ModItems.SAPPHIRE_HELMET);
                                entries.add(ModItems.SAPPHIRE_CHESTPLATE);
                               entries .add(ModItems.SAPPHIRE_LEGGINGS);
                               entries .add(ModItems.SAPPHIRE_BOOTS);
                        entries.add(ModItems.SAPPHIRE_PICKAXE);
                        entries.add(ModItems.SAPPHIRE_AXE);
                        entries.add(ModItems.SAPPHIRE_SHOVEL);
                        entries.add(ModItems.SAPPHIRE_SWORD);
                        entries.add(ModItems.SAPPHIRE_HOE);

                    }).build());
    public static final ItemGroup LITHIUM_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID,"lithium_items"), FabricItemGroup
                    .builder()
                    .icon(()-> new ItemStack(ModItems.LITHIUM))
                    .displayName(Text.translatable("itemgroup.tutorial-mod.lithium"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.LITHIUM);
                        entries.add(ModItems.RAW_LITHIUM);
                        entries                .add(ModItems.LITHIUM_HELMET);
                        entries   .add(ModItems.LITHIUM_CHESTPLATE);
                        entries    .add(ModItems.LITHIUM_LEGGINGS);
                        entries   .add(ModItems.LITHIUM_BOOTS);
                        entries.add(ModItems.LITHIUM_PICKAXE);
                        entries.add(ModItems.LITHIUM_AXE);
                        entries.add(ModItems.LITHIUM_SHOVEL);
                        entries.add(ModItems.LITHIUM_SWORD);
                        entries.add(ModItems.LITHIUM_HOE);


                    }).build());
    public static final ItemGroup CITRINE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID,"citrine_items"), FabricItemGroup
                    .builder()
                    .icon(()-> new ItemStack(ModItems.CITRINE))
                    .displayName(Text.translatable("itemgroup.tutorial-mod.citrine"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.CITRINE);
                        entries.add(ModItems.RAW_CITRINE);
                        entries                .add(ModItems.CITRINE_HELMET);
                        entries  .add(ModItems.CITRINE_CHESTPLATE);
                        entries      .add(ModItems.CITRINE_LEGGINGS);
                        entries     .add(ModItems.CITRINE_BOOTS);
                        entries.add(ModItems.CITRINE_PICKAXE);
                        entries.add(ModItems.CITRINE_AXE);
                        entries.add(ModItems.CITRINE_SHOVEL);
                        entries.add(ModItems.CITRINE_SWORD);
                        entries.add(ModItems.CITRINE_HOE);
                    }).build());



    public static final ItemGroup BISMUTH_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID,"bismuth_items"), FabricItemGroup
                    .builder()
                    .icon(()-> new ItemStack(ModItems.BISMUTH))
                    .displayName(Text.translatable("itemgroup.tutorial-mod.bismuth"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.BISMUTH);
                        entries.add(ModItems.RAW_BISMUTH);
                        entries.add(BISMUTH_BLOCK);
                        entries.add(BISMUTH_ORE);
                        entries.add(BISMUTH_NETHER_ORE);
                        entries.add(BISMUTH_DEEPSLATE_ORE);
                        entries.add(BISMUTH_END_ORE);

                        entries.add(ModItems.BISMUTH_PICKAXE);
                        entries.add(ModItems.BISMUTH_AXE);
                        entries.add(ModItems.BISMUTH_SHOVEL);
                        entries.add(ModItems.BISMUTH_SWORD);
                        entries.add(ModItems.BISMUTH_HOE);
                        entries.add(ModItems.BISMUTH_HAMMER);

                        entries.add(ModItems.BISMUTH_CHESTPLATE);
                        entries.add(ModItems.BISMUTH_HELMET);
                        entries.add(ModItems.BISMUTH_BOOTS);
                        entries.add(ModItems.BISMUTH_LEGGINGS);

                        entries.add(ModItems.BISMUTH_HORSE_ARMOR);

                        entries.add(ModBlocks.BISMUTH_SLAB);
                        entries.add(ModBlocks.BISMUTH_FENCE);
                        entries.add(ModBlocks.BISMUTH_FENCE_GATE);
                        entries.add(ModBlocks.BISMUTH_WALL);
                        entries.add(ModBlocks.BISMUTH_DOOR);
                        entries.add(ModBlocks.BISMUTH_TRAPDOOR);
                        entries.add(ModBlocks.BISMUTH_BUTTON);
                        entries.add(ModBlocks.BISMUTH_PRESSURE_PLATE);
                        entries.add(ModBlocks.BISMUTH_STAIRS);

                        entries.add(ModItems.KAUPEN_SMITHING_TEMPLATE);

                        entries.add(ModBlocks.BISMUTH_LAMP);

                        entries.add(ModItems.KAUPEN_BOW);





                    }).build());

    public static void registerModItemGroups() {
        TutorialMod.LOGGER.info("Registering Mod Item Groups for " + TutorialMod.MOD_ID);
    }
}


// Azurite

// Bismuth

// Black Opal

// Citrine

// Fluorite

// Lithium

// Mythril

// Pink Garnet

// Ruby

// Sapphire

// Tanzanite

// Titanium

// Zircon






















