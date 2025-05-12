package net.alokyadav.tutorialmod.datagen.tool_recipe_provider;

import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import static net.minecraft.data.server.recipe.RecipeProvider.conditionsFromItem;

public class ShovelRecipeProvider {

    public static void generate(Item material, Item swordOutput, RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, swordOutput)
                .pattern(" M ")
                .pattern(" S ")
                .pattern(" S ")
                .input('M', material)
                .input('S', Items.STICK)
                .criterion("has_" + material.getTranslationKey().replace("item.", ""), conditionsFromItem(material))
                .offerTo(exporter);
    }
}
