package net.alokyadav.tutorialmod.datagen.recipe_provider;

import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.block.Block;

import static net.minecraft.data.server.recipe.RecipeProvider.conditionsFromItem;

public class NonBlockBlockRecipeProvider {

    public static void generateStairs(Item material, Block output, RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', material)
                .criterion("has_" + material.getTranslationKey(), conditionsFromItem(material))
                .offerTo(exporter);
    }

    public static void generateSlab(Item material, Block output, RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output)
                .pattern("   ")
                .pattern("   ")
                .pattern("RRR")
                .input('R', material)
                .criterion("has_" + material.getTranslationKey(), conditionsFromItem(material))
                .offerTo(exporter);
    }

    public static void generateWall(Item material, Block output, RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("   ")
                .input('R', material)
                .criterion("has_" + material.getTranslationKey(), conditionsFromItem(material))
                .offerTo(exporter);
    }

    public static void generateDoor(Item material, Block output, RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, output)
                .pattern("RR ")
                .pattern("RR ")
                .pattern("RR ")
                .input('R', material)
                .criterion("has_" + material.getTranslationKey(), conditionsFromItem(material))
                .offerTo(exporter);
    }

    public static void generateTrapdoor(Item material, Block output, RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, output)
                .pattern("   ")
                .pattern("RR ")
                .pattern("RR ")
                .input('R', material)
                .criterion("has_" + material.getTranslationKey(), conditionsFromItem(material))
                .offerTo(exporter);
    }

    public static void generateButton(Item material, Block output, RecipeExporter exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, output)
                .input(material)
                .criterion("has_" + material.getTranslationKey(), conditionsFromItem(material))
                .offerTo(exporter);
    }

    public static void generatePressurePlate(Item material, Block output, RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, output)
                .pattern("   ")
                .pattern("   ")
                .pattern("RR ")
                .input('R', material)
                .criterion("has_" + material.getTranslationKey(), conditionsFromItem(material))
                .offerTo(exporter);
    }

    public static void generateFence(Item material, Block output, RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, output)
                .pattern("RSR")
                .pattern("RSR")
                .pattern("   ")
                .input('R', material)
                .input('S', Items.STICK)
                .criterion("has_" + material.getTranslationKey(), conditionsFromItem(material))
                .offerTo(exporter);
    }

    public static void generateFenceGate(Item material, Block output, RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, output)
                .pattern("SRS")
                .pattern("SRS")
                .pattern("   ")
                .input('R', material)
                .input('S', Items.STICK)
                .criterion("has_" + material.getTranslationKey(), conditionsFromItem(material))
                .offerTo(exporter);
    }
}
