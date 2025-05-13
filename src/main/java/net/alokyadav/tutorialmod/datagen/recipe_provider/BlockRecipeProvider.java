package net.alokyadav.tutorialmod.datagen.recipe_provider;

import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.recipe.book.RecipeCategory;

import static net.minecraft.data.server.recipe.RecipeProvider.conditionsFromItem;

public class BlockRecipeProvider {

    public static void generate(Item material, Item blockOutput, RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, blockOutput)
                .pattern("MMM")
                .pattern("MMM")
                .pattern("MMM")
                .input('M', material)
                .criterion("has_" + material.getTranslationKey().replace("item.", ""), conditionsFromItem(material))
                .offerTo(exporter);
    }
}