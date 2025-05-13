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

                        entries.add(ModItems.PINK_GARNET_HORSE_ARMOR);
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




                    }).build());


    public static final ItemGroup BISMUTH_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID,"bismuth_items"), FabricItemGroup
                    .builder()
                    .icon(()-> new ItemStack(ModItems.BISMUTH))
                    .displayName(Text.translatable("itemgroup.tutorial-mod.bismuth"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.BISMUTH);
                        entries.add(ModItems.RAW_BISMUTH);




                    }).build());

    public static void registerModItemGroups() {
        TutorialMod.LOGGER.info("Registering Mod Item Groups for " + TutorialMod.MOD_ID);
    }
}
