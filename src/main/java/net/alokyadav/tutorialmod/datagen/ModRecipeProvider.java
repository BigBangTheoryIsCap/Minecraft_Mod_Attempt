package net.alokyadav.tutorialmod.datagen;

import net.alokyadav.tutorialmod.datagen.recipe_provider.*;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.alokyadav.tutorialmod.TutorialMod;
import net.alokyadav.tutorialmod.blocks.ModBlocks;
import net.alokyadav.tutorialmod.item.ModItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import static net.minecraft.data.server.recipe.RecipeProvider.conditionsFromItem;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        List<ItemConvertible> PINK_GARNET_SMELTABLES = List.of(ModItems.RAW_PINK_GARNET, ModBlocks.PINK_GARNET_ORE,
                ModBlocks.PINK_GARNET_DEEPSLATE_ORE);
        List<ItemConvertible> RUBY_SMELTABLES = List.of(ModItems.RAW_RUBY, ModBlocks.RUBY_ORE);

        List<ItemConvertible> ALEXANDRITE_SMELTABLES = List.of(ModItems.RAW_ALEXANDRITE, ModBlocks.ALEXANDRITE_ORE,
                ModBlocks.ALEXANDRITE_END_ORE, ModBlocks.ALEXANDRITE_NETHER_ORE);

        List<ItemConvertible> BISMUTH_SMELTABLES = List.of(ModItems.RAW_BISMUTH);


        offerSmelting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RAW_RUBY, 0.25f, 200, "ruby");
        offerBlasting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY, 0.25f, 100, "ruby");

        offerSmelting(exporter, ALEXANDRITE_SMELTABLES, RecipeCategory.MISC, ModItems.RAW_ALEXANDRITE, 0.25f, 200, "alexandrite");
        offerBlasting(exporter, ALEXANDRITE_SMELTABLES, RecipeCategory.MISC, ModItems.ALEXANDRITE, 0.25f, 100, "alexandrite");


        offerSmelting(exporter, PINK_GARNET_SMELTABLES, RecipeCategory.MISC, ModItems.PINK_GARNET, 0.25f, 200, "pink_garnet");
        offerBlasting(exporter, PINK_GARNET_SMELTABLES, RecipeCategory.MISC, ModItems.PINK_GARNET, 0.25f, 100, "pink_garnet");

        offerSmelting(exporter, PINK_GARNET_SMELTABLES, RecipeCategory.MISC, ModItems.BISMUTH, 0.25f, 200, "bismuth");
        offerBlasting(exporter, PINK_GARNET_SMELTABLES, RecipeCategory.MISC, ModItems.BISMUTH, 0.25f, 100, "bismuth");



        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.PINK_GARNET, RecipeCategory.DECORATIONS, ModBlocks.PINK_GARNET_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RUBY, RecipeCategory.DECORATIONS, ModBlocks.RUBY_BLOCK);


        offerSmithingTrimRecipe(exporter, ModItems.KAUPEN_SMITHING_TEMPLATE, Identifier.of(TutorialMod.MOD_ID, "kaupen"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_PINK_GARNET_BLOCK)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.RAW_PINK_GARNET)
                .criterion(hasItem(ModItems.RAW_PINK_GARNET), conditionsFromItem(ModItems.RAW_PINK_GARNET))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_RUBY_BLOCK)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.RAW_RUBY)
                .criterion(hasItem(ModItems.RAW_RUBY), conditionsFromItem(ModItems.RAW_RUBY))
                .offerTo(exporter);

        BlockRecipeProvider.generate(ModItems.ALEXANDRITE, Item.fromBlock(ModBlocks.ALEXANDRITE_BLOCK), exporter);
        BlockRecipeProvider.generate(ModItems.RAW_ALEXANDRITE, Item.fromBlock(ModBlocks.RAW_ALEXANDRITE_BLOCK), exporter);

        BlockRecipeProvider.generate(ModItems.BISMUTH, Item.fromBlock(ModBlocks.BISMUTH_BLOCK), exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ALEXANDRITE, 9)
                .input(ModBlocks.ALEXANDRITE_BLOCK)
                .criterion(hasItem(ModBlocks.ALEXANDRITE_BLOCK), conditionsFromItem(ModBlocks.ALEXANDRITE_BLOCK))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_PINK_GARNET, 9)
                .input(ModBlocks.RAW_PINK_GARNET_BLOCK)
                .criterion(hasItem(ModBlocks.RAW_PINK_GARNET_BLOCK), conditionsFromItem(ModBlocks.RAW_PINK_GARNET_BLOCK))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_RUBY, 9)
                .input(ModBlocks.RAW_RUBY_BLOCK)
                .criterion(hasItem(ModBlocks.RAW_RUBY_BLOCK), conditionsFromItem(ModBlocks.RAW_RUBY_BLOCK))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_ALEXANDRITE, 9)
                .input(ModBlocks.RAW_ALEXANDRITE_BLOCK)
                .criterion(hasItem(ModBlocks.RAW_ALEXANDRITE_BLOCK), conditionsFromItem(ModBlocks.RAW_ALEXANDRITE_BLOCK))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_PINK_GARNET, 32)
                .input(ModBlocks.MAGIC_BLOCK)
                .criterion(hasItem(ModBlocks.MAGIC_BLOCK), conditionsFromItem(ModBlocks.MAGIC_BLOCK))
                .offerTo(exporter, Identifier.of(TutorialMod.MOD_ID, "raw_pink_garnet_from_magic_block"));


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PINK_GARNET_STAIRS)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R',ModItems.PINK_GARNET)
                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PINK_GARNET_TRAPDOOR)
                .pattern("   ")
                .pattern("RR ")
                .pattern("RR ")
                .input('R',ModItems.PINK_GARNET)
                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PINK_GARNET_SLAB)
                .pattern("   ")
                .pattern("   ")
                .pattern("RRR")
                .input('R',ModItems.PINK_GARNET)
                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PINK_GARNET_DOOR)
                .pattern("RR ")
                .pattern("RR ")
                .pattern("RR ")
                .input('R',ModItems.PINK_GARNET)
                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PINK_GARNET_BUTTON)
                .input(ModItems.PINK_GARNET)
                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PINK_GARNET_WALL)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("   ")
                .input('R',ModItems.PINK_GARNET)
                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PINK_GARNET_PRESSURE_PLATE)
                .pattern("   ")
                .pattern("   ")
                .pattern("RR ")
                .input('R',ModItems.PINK_GARNET)
                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PINK_GARNET_FENCE_GATE)
                .pattern("   ")
                .pattern("SRS")
                .pattern("SRS")
                .input('R',ModItems.PINK_GARNET)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PINK_GARNET_FENCE)
                .pattern("   ")
                .pattern("RSR")
                .pattern("RSR")
                .input('R',ModItems.PINK_GARNET)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CHISEL)
                .pattern(" R ")
                .pattern(" S ")
                .pattern(" S ")
                .input('R',ModItems.PINK_GARNET)
                .input('S', Items.STICK) // Corrected
                .criterion("has_pink_garnet", conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter);

        SwordRecipeProvider.generate(ModItems.PINK_GARNET, ModItems.PINK_GARNET_SWORD, exporter);
        AxeRecipeProvider.generate(ModItems.PINK_GARNET, ModItems.PINK_GARNET_AXE, exporter);
        PickaxeRecipeProvider.generate(ModItems.PINK_GARNET, ModItems.PINK_GARNET_PICKAXE, exporter);
        ShovelRecipeProvider.generate(ModItems.PINK_GARNET, ModItems.PINK_GARNET_SHOVEL, exporter);
        HoeRecipeProvider.generate(ModItems.PINK_GARNET, ModItems.PINK_GARNET_HOE, exporter);

        SwordRecipeProvider.generate(ModItems.ALEXANDRITE, ModItems.ALEXANDRITE_SWORD, exporter);
        AxeRecipeProvider.generate(ModItems.ALEXANDRITE, ModItems.ALEXANDRITE_AXE, exporter);
        PickaxeRecipeProvider.generate(ModItems.ALEXANDRITE, ModItems.ALEXANDRITE_PICKAXE, exporter);
        ShovelRecipeProvider.generate(ModItems.ALEXANDRITE, ModItems.ALEXANDRITE_SHOVEL, exporter);
        HoeRecipeProvider.generate(ModItems.ALEXANDRITE, ModItems.ALEXANDRITE_HOE, exporter);

        SwordRecipeProvider.generate(ModItems.BISMUTH, ModItems.BISMUTH_SWORD, exporter);
        AxeRecipeProvider.generate(ModItems.BISMUTH, ModItems.BISMUTH_AXE, exporter);
        PickaxeRecipeProvider.generate(ModItems.BISMUTH, ModItems.BISMUTH_PICKAXE, exporter);
        ShovelRecipeProvider.generate(ModItems.BISMUTH, ModItems.BISMUTH_SHOVEL, exporter);
        HoeRecipeProvider.generate(ModItems.BISMUTH, ModItems.BISMUTH_HOE,exporter);



                NonBlockBlockRecipeProvider.generateButton(ModItems.ALEXANDRITE, ModBlocks.ALEXANDRITE_BUTTON, exporter);
        NonBlockBlockRecipeProvider.generateFence(ModItems.ALEXANDRITE, ModBlocks.ALEXANDRITE_FENCE, exporter);
        NonBlockBlockRecipeProvider.generateFenceGate(ModItems.ALEXANDRITE, ModBlocks.ALEXANDRITE_FENCE_GATE, exporter);
        NonBlockBlockRecipeProvider.generateSlab(ModItems.ALEXANDRITE, ModBlocks.ALEXANDRITE_SLAB, exporter);
        NonBlockBlockRecipeProvider.generateTrapdoor(ModItems.ALEXANDRITE, ModBlocks.ALEXANDRITE_TRAPDOOR,exporter);
        NonBlockBlockRecipeProvider.generateDoor(ModItems.ALEXANDRITE, ModBlocks.ALEXANDRITE_DOOR, exporter);
        NonBlockBlockRecipeProvider.generateStairs(ModItems.ALEXANDRITE, ModBlocks.ALEXANDRITE_STAIRS, exporter);
        NonBlockBlockRecipeProvider.generateWall(ModItems.ALEXANDRITE, ModBlocks.ALEXANDRITE_WALL, exporter);
        NonBlockBlockRecipeProvider.generatePressurePlate(ModItems.ALEXANDRITE, ModBlocks.ALEXANDRITE_PRESSURE_PLATE, exporter);


        NonBlockBlockRecipeProvider.generateButton(ModItems.BISMUTH, ModBlocks.BISMUTH_BUTTON, exporter);
        NonBlockBlockRecipeProvider.generateFence(ModItems.BISMUTH, ModBlocks.BISMUTH_FENCE, exporter);
        NonBlockBlockRecipeProvider.generateFenceGate(ModItems.BISMUTH, ModBlocks.BISMUTH_FENCE_GATE, exporter);
        NonBlockBlockRecipeProvider.generateSlab(ModItems.BISMUTH, ModBlocks.BISMUTH_SLAB, exporter);
        NonBlockBlockRecipeProvider.generateTrapdoor(ModItems.BISMUTH, ModBlocks.BISMUTH_TRAPDOOR, exporter);
        NonBlockBlockRecipeProvider.generateDoor(ModItems.BISMUTH, ModBlocks.BISMUTH_DOOR, exporter);
        NonBlockBlockRecipeProvider.generateStairs(ModItems.BISMUTH, ModBlocks.BISMUTH_STAIRS, exporter);
        NonBlockBlockRecipeProvider.generateWall(ModItems.BISMUTH, ModBlocks.BISMUTH_WALL, exporter);
        NonBlockBlockRecipeProvider.generatePressurePlate(ModItems.BISMUTH, ModBlocks.BISMUTH_PRESSURE_PLATE, exporter);



    }
}
