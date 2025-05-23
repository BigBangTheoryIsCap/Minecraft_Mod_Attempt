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
            Identifier.of(TutorialMod.MOD_ID, "pink_garnet_items"), FabricItemGroup
                    .builder()
                    .icon(() -> new ItemStack(ModItems.PINK_GARNET))
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
            Identifier.of(TutorialMod.MOD_ID, "ruby_items"), FabricItemGroup
                    .builder()
                    .icon(() -> new ItemStack(ModItems.RUBY))
                    .displayName(Text.translatable("itemgroup.tutorial-mod.ruby"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RAW_RUBY);
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.RAW_RUBY_BLOCK);
                        entries.add(ModItems.RUBY_HELMET);
                        entries.add(ModItems.RUBY_CHESTPLATE);
                        entries.add(ModItems.RUBY_LEGGINGS);
                        entries.add(ModItems.RUBY_BOOTS);
                        entries.add(ModItems.RUBY_PICKAXE);
                        entries.add(ModItems.RUBY_AXE);
                        entries.add(ModItems.RUBY_SHOVEL);
                        entries.add(ModItems.RUBY_SWORD);
                        entries.add(ModItems.RUBY_HOE);

                        entries.add(ModBlocks.RUBY_SLAB);
                        entries.add(ModBlocks.RUBY_FENCE);
                        entries.add(ModBlocks.RUBY_FENCE_GATE);
                        entries.add(ModBlocks.RUBY_WALL);
                        entries.add(ModBlocks.RUBY_DOOR);
                        entries.add(ModBlocks.RUBY_TRAPDOOR);
                        entries.add(ModBlocks.RUBY_BUTTON);
                        entries.add(ModBlocks.RUBY_PRESSURE_PLATE);
                        entries.add(ModBlocks.RUBY_STAIRS);


                    }).build());
    public static final ItemGroup ALEXANDRITE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "alexandrite_items"), FabricItemGroup
                    .builder()
                    .icon(() -> new ItemStack(ModItems.ALEXANDRITE))
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
            Identifier.of(TutorialMod.MOD_ID, "black_opal_items"), FabricItemGroup
                    .builder()
                    .icon(() -> new ItemStack(ModItems.BLACK_OPAL))
                    .displayName(Text.translatable("itemgroup.tutorial-mod.black_opal"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.BLACK_OPAL);
                        entries.add(ModItems.RAW_BLACK_OPAL);
                        entries.add(ModItems.BLACK_OPAL_HELMET);
                        entries.add(ModItems.BLACK_OPAL_CHESTPLATE);
                        entries.add(ModItems.BLACK_OPAL_LEGGINGS);
                        entries.add(ModItems.BLACK_OPAL_BOOTS);
                        entries.add(ModItems.BLACK_OPAL_PICKAXE);
                        entries.add(ModItems.BLACK_OPAL_AXE);
                        entries.add(ModItems.BLACK_OPAL_SHOVEL);
                        entries.add(ModItems.BLACK_OPAL_SWORD);
                        entries.add(ModItems.BLACK_OPAL_HOE);

                        entries.add(ModBlocks.BLACK_OPAL_BLOCK);
                        entries.add(ModBlocks.BLACK_OPAL_ORE);

                        entries.add(ModBlocks.BLACK_OPAL_SLAB);
                        entries.add(ModBlocks.BLACK_OPAL_FENCE);
                        entries.add(ModBlocks.BLACK_OPAL_FENCE_GATE);
                        entries.add(ModBlocks.BLACK_OPAL_WALL);
                        entries.add(ModBlocks.BLACK_OPAL_DOOR);
                        entries.add(ModBlocks.BLACK_OPAL_TRAPDOOR);
                        entries.add(ModBlocks.BLACK_OPAL_BUTTON);
                        entries.add(ModBlocks.BLACK_OPAL_PRESSURE_PLATE);
                        entries.add(ModBlocks.BLACK_OPAL_STAIRS);


                    }).build());

    public static final ItemGroup AZURITE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "azurite_items"), FabricItemGroup
                    .builder()
                    .icon(() -> new ItemStack(ModItems.AZURITE))
                    .displayName(Text.translatable("itemgroup.tutorial-mod.azurite"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.AZURITE);
                        entries.add(ModItems.RAW_AZURITE);
                        entries.add(ModItems.AZURITE_HELMET);
                        entries.add(ModItems.AZURITE_CHESTPLATE);
                        entries.add(ModItems.AZURITE_LEGGINGS);
                        entries.add(ModItems.AZURITE_BOOTS);

                        entries.add(ModItems.AZURITE_PICKAXE);
                        entries.add(ModItems.AZURITE_AXE);
                        entries.add(ModItems.AZURITE_SHOVEL);
                        entries.add(ModItems.AZURITE_SWORD);
                        entries.add(ModItems.AZURITE_HOE);

                        entries.add(ModBlocks.AZURITE_ORE);
                        entries.add(ModBlocks.AZURITE_BLOCK);
                        entries.add(ModBlocks.AZURITE_SLAB);
                        entries.add(ModBlocks.AZURITE_FENCE);
                        entries.add(ModBlocks.AZURITE_FENCE_GATE);
                        entries.add(ModBlocks.AZURITE_WALL);
                        entries.add(ModBlocks.AZURITE_DOOR);
                        entries.add(ModBlocks.AZURITE_TRAPDOOR);
                        entries.add(ModBlocks.AZURITE_BUTTON);
                        entries.add(ModBlocks.AZURITE_PRESSURE_PLATE);
                        entries.add(ModBlocks.AZURITE_STAIRS);


                    }).build());

    public static final ItemGroup MYTHRIL_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "mythril_items"), FabricItemGroup
                    .builder()
                    .icon(() -> new ItemStack(ModItems.MAGIC_MYTHRIL_DUST))
                    .displayName(Text.translatable("itemgroup.tutorial-mod.mythril"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.MAGIC_MYTHRIL_DUST);
                        entries.add(ModItems.MYTHRIL_INGOT);
                        entries.add(ModItems.RAW_MYTHRIL);

                        entries.add(ModItems.MYTHRIL_HELMET);
                        entries.add(ModItems.MYTHRIL_CHESTPLATE);
                        entries.add(ModItems.MYTHRIL_LEGGINGS);
                        entries.add(ModItems.MYTHRIL_BOOTS);

                        entries.add(ModBlocks.MYTHRIL_BLOCK);
                        entries.add(ModBlocks.MYTHRIL_ORE);

                        entries.add(ModBlocks.MYTHRIL_SLAB);
                        entries.add(ModBlocks.MYTHRIL_FENCE);
                        entries.add(ModBlocks.MYTHRIL_FENCE_GATE);
                        entries.add(ModBlocks.MYTHRIL_WALL);
                        entries.add(ModBlocks.MYTHRIL_BUTTON);
                        entries.add(ModBlocks.MYTHRIL_PRESSURE_PLATE);
                        entries.add(ModBlocks.MYTHRIL_STAIRS);


                    }).build());
    public static final ItemGroup FLUORITE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "fluorite_items"), FabricItemGroup
                    .builder()
                    .icon(() -> new ItemStack(ModItems.FLUORITE))
                    .displayName(Text.translatable("itemgroup.tutorial-mod.fluorite"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.FLUORITE);
                        entries.add(ModItems.RAW_FLUORITE);

                        entries.add(ModItems.FLUORITE_HELMET);
                        entries.add(ModItems.FLUORITE_CHESTPLATE);
                        entries.add(ModItems.FLUORITE_LEGGINGS);
                        entries.add(ModItems.FLUORITE_BOOTS);
                        entries.add(ModItems.FLUORITE_PICKAXE);
                        entries.add(ModItems.FLUORITE_AXE);
                        entries.add(ModItems.FLUORITE_SHOVEL);
                        entries.add(ModItems.FLUORITE_SWORD);
                        entries.add(ModItems.FLUORITE_HOE);

                        entries.add(ModBlocks.FLUORITE_BLOCK);
                        entries.add(ModBlocks.FLUORITE_ORE);

                        entries.add(ModBlocks.FLUORITE_SLAB);
                        entries.add(ModBlocks.FLUORITE_FENCE);
                        entries.add(ModBlocks.FLUORITE_FENCE_GATE);
                        entries.add(ModBlocks.FLUORITE_WALL);
                        entries.add(ModBlocks.FLUORITE_DOOR);
                        entries.add(ModBlocks.FLUORITE_TRAPDOOR);
                        entries.add(ModBlocks.FLUORITE_BUTTON);
                        entries.add(ModBlocks.FLUORITE_PRESSURE_PLATE);
                        entries.add(ModBlocks.FLUORITE_STAIRS);

                    }).build());

    public static final ItemGroup TANZANITE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "tanzanite_items"), FabricItemGroup
                    .builder()
                    .icon(() -> new ItemStack(ModItems.TANZANITE))
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

                        entries.add(ModBlocks.TANZANITE_BLOCK);
                        entries.add(ModBlocks.TANZANITE_ORE);

                        entries.add(ModBlocks.TANZANITE_SLAB);
                        entries.add(ModBlocks.TANZANITE_FENCE);
                        entries.add(ModBlocks.TANZANITE_FENCE_GATE);
                        entries.add(ModBlocks.TANZANITE_WALL);
                        entries.add(ModBlocks.TANZANITE_BUTTON);
                        entries.add(ModBlocks.TANZANITE_PRESSURE_PLATE);
                        entries.add(ModBlocks.TANZANITE_STAIRS);


                    }).build());
    public static final ItemGroup TITANIUM_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "titanium_items"), FabricItemGroup
                    .builder()
                    .icon(() -> new ItemStack(ModItems.TITANIUM_INGOT))
                    .displayName(Text.translatable("itemgroup.tutorial-mod.titanium"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.TITANIUM_INGOT);
                        entries.add(ModItems.RAW_TITANIUM);

                        entries.add(ModItems.TITANIUM_HELMET);
                        entries.add(ModItems.TITANIUM_CHESTPLATE);
                        entries.add(ModItems.TITANIUM_LEGGINGS);
                        entries.add(ModItems.TITANIUM_BOOTS);

                        entries.add(ModItems.TITANIUM_PICKAXE);
                        entries.add(ModItems.TITANIUM_AXE);
                        entries.add(ModItems.TITANIUM_SHOVEL);
                        entries.add(ModItems.TITANIUM_SWORD);
                        entries.add(ModItems.TITANIUM_HOE);

                        entries.add(ModBlocks.TITANIUM_BLOCK);
                        entries.add(ModBlocks.TITANIUM_ORE);

                        entries.add(ModBlocks.TITANIUM_SLAB);
                        entries.add(ModBlocks.TITANIUM_FENCE);
                        entries.add(ModBlocks.TITANIUM_FENCE_GATE);
                        entries.add(ModBlocks.TITANIUM_WALL);
                        entries.add(ModBlocks.TITANIUM_DOOR);
                        entries.add(ModBlocks.TITANIUM_TRAPDOOR);
                        entries.add(ModBlocks.TITANIUM_BUTTON);
                        entries.add(ModBlocks.TITANIUM_PRESSURE_PLATE);
                        entries.add(ModBlocks.TITANIUM_STAIRS);


                    }).build());
    public static final ItemGroup ZIRCON_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "zircon_items"), FabricItemGroup
                    .builder()
                    .icon(() -> new ItemStack(ModItems.ZIRCON))
                    .displayName(Text.translatable("itemgroup.tutorial-mod.zircon"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.ZIRCON);
                        entries.add(ModItems.RAW_ZIRCON);

                        entries.add(ModItems.ZIRCON_PICKAXE);


                        entries.add(ModBlocks.ZIRCON_BLOCK);
                        entries.add(ModBlocks.ZIRCON_ORE);

                        entries.add(ModBlocks.ZIRCON_SLAB);
                        entries.add(ModBlocks.ZIRCON_FENCE);
                        entries.add(ModBlocks.ZIRCON_FENCE_GATE);
                        entries.add(ModBlocks.ZIRCON_WALL);
                        entries.add(ModBlocks.ZIRCON_BUTTON);
                        entries.add(ModBlocks.ZIRCON_PRESSURE_PLATE);
                        entries.add(ModBlocks.ZIRCON_STAIRS);


                    }).build());
    public static final ItemGroup SAPPHIRE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "sapphire_items"), FabricItemGroup
                    .builder()
                    .icon(() -> new ItemStack(ModItems.SAPPHIRE))
                    .displayName(Text.translatable("itemgroup.tutorial-mod.sapphire"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.SAPPHIRE);
                        entries.add(ModItems.RAW_SAPPHIRE);
                        entries.add(ModItems.SAPPHIRE_HELMET);
                        entries.add(ModItems.SAPPHIRE_CHESTPLATE);
                        entries.add(ModItems.SAPPHIRE_LEGGINGS);
                        entries.add(ModItems.SAPPHIRE_BOOTS);
                        entries.add(ModItems.SAPPHIRE_PICKAXE);
                        entries.add(ModItems.SAPPHIRE_AXE);
                        entries.add(ModItems.SAPPHIRE_SHOVEL);
                        entries.add(ModItems.SAPPHIRE_SWORD);
                        entries.add(ModItems.SAPPHIRE_HOE);

                        entries.add(ModBlocks.SAPPHIRE_BLOCK);
                        entries.add(ModBlocks.SAPPHIRE_ORE);

                        entries.add(ModBlocks.SAPPHIRE_SLAB);
                        entries.add(ModBlocks.SAPPHIRE_FENCE);
                        entries.add(ModBlocks.SAPPHIRE_FENCE_GATE);
                        entries.add(ModBlocks.SAPPHIRE_WALL);
                        entries.add(ModBlocks.SAPPHIRE_DOOR);
                        entries.add(ModBlocks.SAPPHIRE_TRAPDOOR);
                        entries.add(ModBlocks.SAPPHIRE_BUTTON);
                        entries.add(ModBlocks.SAPPHIRE_PRESSURE_PLATE);
                        entries.add(ModBlocks.SAPPHIRE_STAIRS);


                    }).build());
    public static final ItemGroup LITHIUM_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "lithium_items"), FabricItemGroup
                    .builder()
                    .icon(() -> new ItemStack(ModItems.LITHIUM))
                    .displayName(Text.translatable("itemgroup.tutorial-mod.lithium"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.LITHIUM);
                        entries.add(ModItems.RAW_LITHIUM);
                        ;
                        entries.add(ModItems.LITHIUM_PICKAXE);


                        entries.add(ModBlocks.LITHIUM_BLOCK);
                        entries.add(ModBlocks.LITHIUM_ORE);

                        entries.add(ModBlocks.LITHIUM_SLAB);
                        entries.add(ModBlocks.LITHIUM_FENCE);
                        entries.add(ModBlocks.LITHIUM_FENCE_GATE);
                        entries.add(ModBlocks.LITHIUM_WALL);
                        entries.add(ModBlocks.LITHIUM_BUTTON);
                        entries.add(ModBlocks.LITHIUM_PRESSURE_PLATE);
                        entries.add(ModBlocks.LITHIUM_STAIRS);


                    }).build());
    public static final ItemGroup CITRINE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "citrine_items"), FabricItemGroup
                    .builder()
                    .icon(() -> new ItemStack(ModItems.CITRINE))
                    .displayName(Text.translatable("itemgroup.tutorial-mod.citrine"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.CITRINE);
                        entries.add(ModItems.RAW_CITRINE);
                        entries.add(ModItems.CITRINE_HELMET);
                        entries.add(ModItems.CITRINE_CHESTPLATE);
                        entries.add(ModItems.CITRINE_LEGGINGS);
                        entries.add(ModItems.CITRINE_BOOTS);
                        entries.add(ModItems.CITRINE_PICKAXE);
                        entries.add(ModItems.CITRINE_AXE);
                        entries.add(ModItems.CITRINE_SHOVEL);
                        entries.add(ModItems.CITRINE_SWORD);
                        entries.add(ModItems.CITRINE_HOE);

                        entries.add(ModBlocks.CITRINE_BLOCK);
                        entries.add(ModBlocks.CITRINE_ORE);


                        entries.add(ModBlocks.CITRINE_SLAB);
                        entries.add(ModBlocks.CITRINE_FENCE);
                        entries.add(ModBlocks.CITRINE_FENCE_GATE);
                        entries.add(ModBlocks.CITRINE_WALL);
                        entries.add(ModBlocks.CITRINE_BUTTON);
                        entries.add(ModBlocks.CITRINE_PRESSURE_PLATE);
                        entries.add(ModBlocks.CITRINE_STAIRS);

                    }).build());


    public static final ItemGroup BISMUTH_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "bismuth_items"), FabricItemGroup
                    .builder()
                    .icon(() -> new ItemStack(ModItems.BISMUTH))
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


    public static final ItemGroup ADAMANTITE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "adamantite_items"), FabricItemGroup
                    .builder()
                    .icon(() -> new ItemStack(ModItems.ADAMANTITE_INGOT))
                    .displayName(Text.translatable("itemgroup.tutorial-mod.adamantite"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.ADAMANTITE_INGOT);
                        entries.add(ModItems.ADAMANTITE_DUST);
                        entries.add(ModItems.ADAMANTITE_NUGGET);
                        entries.add(ModBlocks.ADAMANTITE_BLOCK);
                        entries.add(ModBlocks.ADAMANTITE_ORE);
                        entries.add(ModBlocks.ADAMANTITE_SLAB);
                        entries.add(ModBlocks.ADAMANTITE_FENCE);
                        entries.add(ModBlocks.ADAMANTITE_FENCE_GATE);
                        entries.add(ModBlocks.ADAMANTITE_WALL);
                        entries.add(ModBlocks.ADAMANTITE_BUTTON);
                        entries.add(ModBlocks.ADAMANTITE_PRESSURE_PLATE);
                        entries.add(ModBlocks.ADAMANTITE_STAIRS);

                    }).build());


    public static final ItemGroup AQUARIUM_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "aquarium_items"), FabricItemGroup
                    .builder()
                    .icon(() -> new ItemStack(ModItems.AQUARIUM_INGOT))
                    .displayName(Text.translatable("itemgroup.tutorial-mod.aquarium"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.AQUARIUM_INGOT);
                        entries.add(ModItems.AQUARIUM_DUST);
                        entries.add(ModItems.AQUARIUM_NUGGET);
                        entries.add(ModBlocks.AQUARIUM_BLOCK);
                        entries.add(ModBlocks.AQUARIUM_ORE);
                        entries.add(ModBlocks.AQUARIUM_SLAB);
                        entries.add(ModBlocks.AQUARIUM_FENCE);
                        entries.add(ModBlocks.AQUARIUM_FENCE_GATE);
                        entries.add(ModBlocks.AQUARIUM_WALL);
                        entries.add(ModBlocks.AQUARIUM_BUTTON);
                        entries.add(ModBlocks.AQUARIUM_PRESSURE_PLATE);
                        entries.add(ModBlocks.AQUARIUM_STAIRS);

                    }).build());


    public static final ItemGroup BANGLUM_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "banglum_items"), FabricItemGroup
                    .builder()

                    .icon(() -> new ItemStack(ModItems.BANGLUM_INGOT))
                    .displayName(Text.translatable("itemgroup.tutorial-mod.banglum"))
                    .entries((displayContext, entries) -> {


                        entries.add(ModItems.BANGLUM_INGOT);
                        entries.add(ModItems.BANGLUM_DUST);
                        entries.add(ModItems.BANGLUM_NUGGET);
                        entries.add(ModBlocks.BANGLUM_BLOCK);
                        entries.add(ModBlocks.BANGLUM_ORE);
                        entries.add(ModBlocks.BANGLUM_SLAB);
                        entries.add(ModBlocks.BANGLUM_FENCE);
                        entries.add(ModBlocks.BANGLUM_FENCE_GATE);
                        entries.add(ModBlocks.BANGLUM_WALL);
                        entries.add(ModBlocks.BANGLUM_BUTTON);
                        entries.add(ModBlocks.BANGLUM_PRESSURE_PLATE);
                        entries.add(ModBlocks.BANGLUM_STAIRS);

                    }).build());


    public static final ItemGroup CARMOT_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "carmot_items"), FabricItemGroup
                    .builder()
                    .icon(() -> new ItemStack(ModItems.CARMOT_INGOT))
                    .displayName(Text.translatable("itemgroup.tutorial-mod.carmot"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.CARMOT_INGOT);
                        entries.add(ModItems.CARMOT_DUST);
                        entries.add(ModItems.CARMOT_NUGGET);
                        entries.add(ModBlocks.CARMOT_BLOCK);
                        entries.add(ModBlocks.CARMOT_ORE);
                        entries.add(ModBlocks.CARMOT_SLAB);
                        entries.add(ModBlocks.CARMOT_FENCE);
                        entries.add(ModBlocks.CARMOT_FENCE_GATE);
                        entries.add(ModBlocks.CARMOT_WALL);
                        entries.add(ModBlocks.CARMOT_BUTTON);
                        entries.add(ModBlocks.CARMOT_PRESSURE_PLATE);
                        entries.add(ModBlocks.CARMOT_STAIRS);

                    }).build());


    public static final ItemGroup KYBER_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "kyber_items"), FabricItemGroup
                    .builder()
                    .icon(() -> new ItemStack(ModItems.KYBER_INGOT))
                    .displayName(Text.translatable("itemgroup.tutorial-mod.kyber"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.KYBER_INGOT);
                        entries.add(ModItems.KYBER_DUST);
                        entries.add(ModItems.KYBER_NUGGET);
                        entries.add(ModBlocks.KYBER_BLOCK);
                        entries.add(ModBlocks.KYBER_ORE);
                        entries.add(ModBlocks.KYBER_SLAB);
                        entries.add(ModBlocks.KYBER_FENCE);
                        entries.add(ModBlocks.KYBER_FENCE_GATE);
                        entries.add(ModBlocks.KYBER_WALL);
                        entries.add(ModBlocks.KYBER_BUTTON);
                        entries.add(ModBlocks.KYBER_PRESSURE_PLATE);
                        entries.add(ModBlocks.KYBER_STAIRS);

                    }).build());


    public static final ItemGroup MANGANESE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "manganese_items"), FabricItemGroup
                    .builder()
                    .icon(() -> new ItemStack(ModItems.MANGANESE_INGOT))
                    .displayName(Text.translatable("itemgroup.tutorial-mod.manganese"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.MANGANESE_INGOT);
                        entries.add(ModItems.MANGANESE_DUST);
                        entries.add(ModItems.MANGANESE_NUGGET);
                        entries.add(ModBlocks.MANGANESE_BLOCK);
                        entries.add(ModBlocks.MANGANESE_ORE);
                        entries.add(ModBlocks.MANGANESE_SLAB);
                        entries.add(ModBlocks.MANGANESE_FENCE);
                        entries.add(ModBlocks.MANGANESE_FENCE_GATE);
                        entries.add(ModBlocks.MANGANESE_WALL);
                        entries.add(ModBlocks.MANGANESE_BUTTON);
                        entries.add(ModBlocks.MANGANESE_PRESSURE_PLATE);
                        entries.add(ModBlocks.MANGANESE_STAIRS);

                    }).build());


    public static final ItemGroup MIDAS_GOLD_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "midas_gold_items"), FabricItemGroup
                    .builder()
                    .icon(() -> new ItemStack(ModItems.MIDAS_GOLD_INGOT))
                    .displayName(Text.translatable("itemgroup.tutorial-mod.midas_gold"))
                    .entries((displayContext, entries) -> {


                        entries.add(ModItems.MIDAS_GOLD_INGOT);
                        entries.add(ModItems.MIDAS_GOLD_DUST);
                        entries.add(ModItems.MIDAS_GOLD_NUGGET);
                        entries.add(ModBlocks.MIDAS_GOLD_BLOCK);
                        entries.add(ModBlocks.MIDAS_GOLD_ORE);
                        entries.add(ModBlocks.MIDAS_GOLD_SLAB);
                        entries.add(ModBlocks.MIDAS_GOLD_FENCE);
                        entries.add(ModBlocks.MIDAS_GOLD_FENCE_GATE);
                        entries.add(ModBlocks.MIDAS_GOLD_WALL);
                        entries.add(ModBlocks.MIDAS_GOLD_BUTTON);
                        entries.add(ModBlocks.MIDAS_GOLD_PRESSURE_PLATE);
                        entries.add(ModBlocks.MIDAS_GOLD_STAIRS);




                    }).build());


    public static final ItemGroup MORKITE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "morkite_items"), FabricItemGroup
                    .builder()
                    .icon(() -> new ItemStack(ModItems.MORKITE))
                    .displayName(Text.translatable("itemgroup.tutorial-mod.morkite"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.MORKITE);
                        entries.add(MORKITE_BLOCK);
                        entries.add(ModBlocks.MORKITE_SLAB);
                        entries.add(ModBlocks.MORKITE_FENCE);
                        entries.add(ModBlocks.MORKITE_FENCE_GATE);
                        entries.add(ModBlocks.MORKITE_WALL);
                        entries.add(ModBlocks.MORKITE_BUTTON);
                        entries.add(ModBlocks.MORKITE_PRESSURE_PLATE);
                        entries.add(ModBlocks.MORKITE_STAIRS);

                    }).build());


    public static final ItemGroup ORICHALCUM_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "orichalcum_items"), FabricItemGroup
                    .builder()
                    .icon(() -> new ItemStack(ModItems.ORICHALCUM_INGOT))
                    .displayName(Text.translatable("itemgroup.tutorial-mod.orichalcum"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.ORICHALCUM_INGOT);
                        entries.add(ModItems.ORICHALCUM_DUST);
                        entries.add(ModItems.ORICHALCUM_NUGGET);
                        entries.add(ModBlocks.ORICHALCUM_BLOCK);
                        entries.add(ModBlocks.ORICHALCUM_ORE);
                        entries.add(ModBlocks.ORICHALCUM_SLAB);
                        entries.add(ModBlocks.ORICHALCUM_FENCE);
                        entries.add(ModBlocks.ORICHALCUM_FENCE_GATE);
                        entries.add(ModBlocks.ORICHALCUM_WALL);
                        entries.add(ModBlocks.ORICHALCUM_BUTTON);
                        entries.add(ModBlocks.ORICHALCUM_PRESSURE_PLATE);
                        entries.add(ModBlocks.ORICHALCUM_STAIRS);


                    }).build());


    public static final ItemGroup OSMIUM_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "osmium_items"), FabricItemGroup
                    .builder()
                    .icon(() -> new ItemStack(ModItems.OSMIUM_INGOT))
                    .displayName(Text.translatable("itemgroup.tutorial-mod.osmium"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.OSMIUM_INGOT);
                        entries.add(ModItems.OSMIUM_DUST);
                        entries.add(ModItems.OSMIUM_NUGGET);
                        entries.add(ModBlocks.OSMIUM_BLOCK);
                        entries.add(ModBlocks.OSMIUM_ORE);
                        entries.add(ModBlocks.OSMIUM_SLAB);
                        entries.add(ModBlocks.OSMIUM_FENCE);
                        entries.add(ModBlocks.OSMIUM_FENCE_GATE);
                        entries.add(ModBlocks.OSMIUM_WALL);
                        entries.add(ModBlocks.OSMIUM_BUTTON);
                        entries.add(ModBlocks.OSMIUM_PRESSURE_PLATE);
                        entries.add(ModBlocks.OSMIUM_STAIRS);

                    }).build());


    public static final ItemGroup PALLADIUM_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "palladium_items"), FabricItemGroup
                    .builder()
                    .icon(() -> new ItemStack(ModItems.PALLADIUM_INGOT))
                    .displayName(Text.translatable("itemgroup.tutorial-mod.palladium"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PALLADIUM_INGOT);
                        entries.add(ModItems.PALLADIUM_DUST);
                        entries.add(ModItems.PALLADIUM_NUGGET);
                        entries.add(ModBlocks.PALLADIUM_BLOCK);
                        entries.add(ModBlocks.PALLADIUM_ORE);
                        entries.add(ModBlocks.PALLADIUM_SLAB);
                        entries.add(ModBlocks.PALLADIUM_FENCE);
                        entries.add(ModBlocks.PALLADIUM_FENCE_GATE);
                        entries.add(ModBlocks.PALLADIUM_WALL);
                        entries.add(ModBlocks.PALLADIUM_BUTTON);
                        entries.add(ModBlocks.PALLADIUM_PRESSURE_PLATE);
                        entries.add(ModBlocks.PALLADIUM_STAIRS);

                    }).build());


    public static final ItemGroup PLATINUM_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "platinum_items"), FabricItemGroup
                    .builder()
                    .icon(() -> new ItemStack(ModItems.PLATINUM_INGOT))
                    .displayName(Text.translatable("itemgroup.tutorial-mod.platinum"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PLATINUM_INGOT);
                        entries.add(ModItems.PLATINUM_DUST);
                        entries.add(ModItems.PLATINUM_NUGGET);
                        entries.add(ModBlocks.PLATINUM_BLOCK);
                        entries.add(ModBlocks.PLATINUM_ORE);
                        entries.add(ModBlocks.PLATINUM_SLAB);
                        entries.add(ModBlocks.PLATINUM_FENCE);
                        entries.add(ModBlocks.PLATINUM_FENCE_GATE);
                        entries.add(ModBlocks.PLATINUM_WALL);
                        entries.add(ModBlocks.PLATINUM_BUTTON);
                        entries.add(ModBlocks.PLATINUM_PRESSURE_PLATE);
                        entries.add(ModBlocks.PLATINUM_STAIRS);


                    }).build());


    public static final ItemGroup PROMETHEUM_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "prometheum_items"), FabricItemGroup
                    .builder()
                    .icon(() -> new ItemStack(ModItems.PROMETHEUM_INGOT))
                    .displayName(Text.translatable("itemgroup.tutorial-mod.prometheum"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PROMETHEUM_INGOT);
                        entries.add(ModItems.PROMETHEUM_DUST);
                        entries.add(ModItems.PROMETHEUM_NUGGET);
                        entries.add(ModBlocks.PROMETHEUM_BLOCK);
                        entries.add(ModBlocks.PROMETHEUM_ORE);
                        entries.add(ModBlocks.PROMETHEUM_SLAB);
                        entries.add(ModBlocks.PROMETHEUM_FENCE);
                        entries.add(ModBlocks.PROMETHEUM_FENCE_GATE);
                        entries.add(ModBlocks.PROMETHEUM_WALL);
                        entries.add(ModBlocks.PROMETHEUM_BUTTON);
                        entries.add(ModBlocks.PROMETHEUM_PRESSURE_PLATE);
                        entries.add(ModBlocks.PROMETHEUM_STAIRS);

                    }).build());


    public static final ItemGroup QUADRILLUM_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "quadrillum_items"), FabricItemGroup
                    .builder()
                    .icon(() -> new ItemStack(ModItems.QUADRILLUM_INGOT))
                    .displayName(Text.translatable("itemgroup.tutorial-mod.quadrillum"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.QUADRILLUM_INGOT);
                        entries.add(ModItems.QUADRILLUM_DUST);
                        entries.add(ModItems.QUADRILLUM_NUGGET);
                        entries.add(ModBlocks.QUADRILLUM_BLOCK);
                        entries.add(ModBlocks.QUADRILLUM_ORE);
                        entries.add(ModBlocks.QUADRILLUM_SLAB);
                        entries.add(ModBlocks.QUADRILLUM_FENCE);
                        entries.add(ModBlocks.QUADRILLUM_FENCE_GATE);
                        entries.add(ModBlocks.QUADRILLUM_WALL);
                        entries.add(ModBlocks.QUADRILLUM_BUTTON);
                        entries.add(ModBlocks.QUADRILLUM_PRESSURE_PLATE);
                        entries.add(ModBlocks.QUADRILLUM_STAIRS);

                    }).build());


    public static final ItemGroup RUNITE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "runite_items"), FabricItemGroup
                    .builder()
                    .icon(() -> new ItemStack(ModItems.RUNITE_INGOT))
                    .displayName(Text.translatable("itemgroup.tutorial-mod.runite"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RUNITE_INGOT);
                        entries.add(ModItems.RUNITE_DUST);
                        entries.add(ModItems.RUNITE_NUGGET);
                        entries.add(ModBlocks.RUNITE_BLOCK);
                        entries.add(ModBlocks.RUNITE_ORE);
                        entries.add(ModBlocks.RUNITE_SLAB);
                        entries.add(ModBlocks.RUNITE_FENCE);
                        entries.add(ModBlocks.RUNITE_FENCE_GATE);
                        entries.add(ModBlocks.RUNITE_WALL);
                        entries.add(ModBlocks.RUNITE_BUTTON);
                        entries.add(ModBlocks.RUNITE_PRESSURE_PLATE);
                        entries.add(ModBlocks.RUNITE_STAIRS);

                    }).build());


    public static final ItemGroup SILVER_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "silver_items"), FabricItemGroup
                    .builder()
                    .icon(() -> new ItemStack(ModItems.SILVER_INGOT))
                    .displayName(Text.translatable("itemgroup.tutorial-mod.silver"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.SILVER_INGOT);
                        entries.add(ModItems.SILVER_DUST);
                        entries.add(ModItems.SILVER_NUGGET);
                        entries.add(ModBlocks.SILVER_BLOCK);
                        entries.add(ModBlocks.SILVER_ORE);
                        entries.add(ModBlocks.SILVER_SLAB);
                        entries.add(ModBlocks.SILVER_FENCE);
                        entries.add(ModBlocks.SILVER_FENCE_GATE);
                        entries.add(ModBlocks.SILVER_WALL);
                        entries.add(ModBlocks.SILVER_BUTTON);
                        entries.add(ModBlocks.SILVER_PRESSURE_PLATE);
                        entries.add(ModBlocks.SILVER_STAIRS);

                    }).build());


    public static final ItemGroup STARRITE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "starrite_items"), FabricItemGroup
                    .builder()
                    .icon(() -> new ItemStack(ModItems.STARRITE))
                    .displayName(Text.translatable("itemgroup.tutorial-mod.starrite"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.STARRITE);
                        entries.add(ModItems.STARLIGHT_ASHES);
                        entries.add(ModBlocks.STARRITE_SLAB);
                        entries.add(ModBlocks.STARRITE_FENCE);
                        entries.add(ModBlocks.STARRITE_FENCE_GATE);
                        entries.add(ModBlocks.STARRITE_WALL);
                        entries.add(ModBlocks.STARRITE_BUTTON);
                        entries.add(ModBlocks.STARRITE_PRESSURE_PLATE);
                        entries.add(ModBlocks.STARRITE_STAIRS);

                    }).build());


    public static final ItemGroup STORMYX_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "stormyx_items"), FabricItemGroup
                    .builder()
                    .icon(() -> new ItemStack(ModItems.STORMYX_INGOT))
                    .displayName(Text.translatable("itemgroup.tutorial-mod.stormyx"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.STORMYX_INGOT);
                        entries.add(ModItems.STORMYX_DUST);
                        entries.add(ModItems.STORMYX_NUGGET);
                        entries.add(ModBlocks.STORMYX_BLOCK);
                        entries.add(ModBlocks.STORMYX_ORE);
                        entries.add(ModBlocks.STORMYX_SLAB);
                        entries.add(ModBlocks.STORMYX_FENCE);
                        entries.add(ModBlocks.STORMYX_FENCE_GATE);
                        entries.add(ModBlocks.STORMYX_WALL);
                        entries.add(ModBlocks.STORMYX_BUTTON);
                        entries.add(ModBlocks.STORMYX_PRESSURE_PLATE);
                        entries.add(ModBlocks.STORMYX_STAIRS);

                    }).build());


    public static final ItemGroup TIN_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "tin_items"), FabricItemGroup
                    .builder()
                    .icon(() -> new ItemStack(ModItems.TIN_INGOT))
                    .displayName(Text.translatable("itemgroup.tutorial-mod.tin"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.TIN_INGOT);
                        entries.add(ModItems.TIN_DUST);
                        entries.add(ModItems.TIN_NUGGET);
                        entries.add(TIN_BLOCK);
                        entries.add(TIN_ORE);
                        entries.add(ModBlocks.TIN_SLAB);
                        entries.add(ModBlocks.TIN_FENCE);
                        entries.add(ModBlocks.TIN_FENCE_GATE);
                        entries.add(ModBlocks.TIN_WALL);
                        entries.add(ModBlocks.TIN_BUTTON);
                        entries.add(ModBlocks.TIN_PRESSURE_PLATE);
                        entries.add(ModBlocks.TIN_STAIRS);


                    }).build());


    public static final ItemGroup UNOBTAINIUM_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "unobtainium_items"), FabricItemGroup
                    .builder()
                    .icon(() -> new ItemStack(ModItems.UNOBTAINIUM))
                    .displayName(Text.translatable("itemgroup.tutorial-mod.unobtainium"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.UNOBTAINIUM);
                        entries.add(UNOBTAINIUM_ORE);
                        entries.add(UNOBTAINIUM_BLOCK);
                        entries.add(ModBlocks.UNOBTAINIUM_SLAB);
                        entries.add(ModBlocks.UNOBTAINIUM_FENCE);
                        entries.add(ModBlocks.UNOBTAINIUM_FENCE_GATE);
                        entries.add(ModBlocks.UNOBTAINIUM_WALL);
                        entries.add(ModBlocks.UNOBTAINIUM_BUTTON);
                        entries.add(ModBlocks.UNOBTAINIUM_PRESSURE_PLATE);
                        entries.add(ModBlocks.UNOBTAINIUM_STAIRS);

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










































