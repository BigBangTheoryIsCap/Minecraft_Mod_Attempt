package net.alokyadav.tutorialmod.item;

import net.alokyadav.tutorialmod.util.ModTags;
import com.google.common.base.Suppliers;
import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    PINK_GARNET(ModTags.Blocks.INCORRECT_FOR_PINK_GARNET_TOOL,
            1200, 5.0F, 4.0F, 22, () -> Ingredient.ofItems(ModItems.PINK_GARNET)),
    ALEXANDRITE(ModTags.Blocks.INCORRECT_FOR_ALEXANDRITE_TOOL,
            1200, 5.0F, 4.0F, 22, () -> Ingredient.ofItems(ModItems.ALEXANDRITE)),
    BISMUTH(ModTags.Blocks.INCORRECT_FOR_BISMUTH_TOOL,
            1200, 5.0F, 4.0F, 22, () -> Ingredient.ofItems(ModItems.BISMUTH)),
    AZURITE(ModTags.Blocks.INCORRECT_FOR_AZURITE_TOOL,
            1200, 5.0F, 4.0F, 22, () -> Ingredient.ofItems(ModItems.AZURITE)),
    TITANIUM(ModTags.Blocks.INCORRECT_FOR_TITANIUM_TOOL,
            1200, 5.0F, 4.0F, 22, () -> Ingredient.ofItems(ModItems.TITANIUM_INGOT)),
    LITHIUM(ModTags.Blocks.INCORRECT_FOR_LITHIUM_TOOL,
            1200, 5.0F, 4.0F, 22, () -> Ingredient.ofItems(ModItems.LITHIUM)),
    TANZANITE(ModTags.Blocks.INCORRECT_FOR_TANZANITE_TOOL,
            1200, 5.0F, 4.0F, 22, () -> Ingredient.ofItems(ModItems.TANZANITE)),
    MYTHRIL(ModTags.Blocks.INCORRECT_FOR_MYTHRIL_TOOL,
            1200, 5.0F, 4.0F, 22, () -> Ingredient.ofItems(ModItems.MYTHRIL_INGOT)),
    SAPPHIRE(ModTags.Blocks.INCORRECT_FOR_SAPPHIRE_TOOL,
            1200, 5.0F, 4.0F, 22, () -> Ingredient.ofItems(ModItems.SAPPHIRE)),
    FLUORITE(ModTags.Blocks.INCORRECT_FOR_FLUORITE_TOOL,
            1200, 5.0F, 4.0F, 22, () -> Ingredient.ofItems(ModItems.FLUORITE)),
    RUBY(ModTags.Blocks.INCORRECT_FOR_RUBY_TOOL,
            1200, 5.0F, 4.0F, 22, () -> Ingredient.ofItems(ModItems.RUBY)),
    CITRINE(ModTags.Blocks.INCORRECT_FOR_CITRINE_TOOL,
            1200, 5.0F, 4.0F, 22, () -> Ingredient.ofItems(ModItems.CITRINE)),
    ZIRCON(ModTags.Blocks.INCORRECT_FOR_ZIRCON_TOOL,
            1200, 5.0F, 4.0F, 22, () -> Ingredient.ofItems(ModItems.ZIRCON)),

    BLACK_OPAL(ModTags.Blocks.INCORRECT_FOR_BLACK_OPAL_TOOL,
            1200, 5.0F, 4.0F, 22, () -> Ingredient.ofItems(ModItems.BLACK_OPAL));




    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;


    ModToolMaterials(final TagKey<Block> inverseTag, final int itemDurability,final float miningSpeed,
                     final float attackDamage, final int enchantability,final Supplier<Ingredient> repairIngredient) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}