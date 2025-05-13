package net.alokyadav.tutorialmod.datagen.recipe_provider;

import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import static net.minecraft.data.server.recipe.RecipeProvider.conditionsFromItem;

public class AxeRecipeProvider {

    public static void generate(Item material, Item axeOutput, RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, axeOutput)
                .pattern("MM ")
                .pattern("MS ")
                .pattern(" S ")
                .input('M', material)
                .input('S', Items.STICK)
                .criterion("has_" + material.getTranslationKey().replace("item.", ""), conditionsFromItem(material))
                .offerTo(exporter);
    }
}