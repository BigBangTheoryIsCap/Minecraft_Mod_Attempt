package net.alokyadav.tutorialmod.datagen.recipe_provider;

import net.alokyadav.tutorialmod.item.ModItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.Item;
import java.lang.reflect.Field;

public class ToolRecipeProvider {
    public static void generateAllForMaterial(String materialName, RecipeExporter exporter) {
        try {
            Class<?> items = ModItems.class;
            Item material = (Item) items.getField(materialName).get(null);

            Item sword = (Item) items.getField(materialName + "_SWORD").get(null);
            Item axe = (Item) items.getField(materialName + "_AXE").get(null);
            Item pickaxe = (Item) items.getField(materialName + "_PICKAXE").get(null);
            Item shovel = (Item) items.getField(materialName + "_SHOVEL").get(null);
            Item hoe = (Item) items.getField(materialName + "_HOE").get(null);

            SwordRecipeProvider.generate(material, sword, exporter);
            AxeRecipeProvider.generate(material, axe, exporter);
            PickaxeRecipeProvider.generate(material, pickaxe, exporter);
            ShovelRecipeProvider.generate(material, shovel, exporter);
            HoeRecipeProvider.generate(material, hoe, exporter);
        } catch (Exception e) {
            throw new RuntimeException("Failed to generate tool recipes for material: " + materialName, e);
        }
    }
}

