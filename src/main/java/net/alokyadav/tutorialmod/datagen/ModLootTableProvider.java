package net.alokyadav.tutorialmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.alokyadav.tutorialmod.blocks.ModBlocks;
import net.alokyadav.tutorialmod.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.PINK_GARNET_BLOCK);
        addDrop(ModBlocks.RAW_PINK_GARNET_BLOCK);

        addDrop(ModBlocks.MAGIC_BLOCK);

        addDrop(ModBlocks.RUBY_BLOCK);
        addDrop(ModBlocks.RAW_RUBY_BLOCK);

        addDrop(ModBlocks.ALEXANDRITE_BLOCK);
        addDrop(ModBlocks.RAW_ALEXANDRITE_BLOCK);

        addDrop(ModBlocks.BISMUTH_BLOCK);


        addDrop(ModBlocks.PINK_GARNET_ORE, oreDrops(ModBlocks.PINK_GARNET_ORE, ModItems.RAW_PINK_GARNET));
        addDrop(ModBlocks.PINK_GARNET_DEEPSLATE_ORE, multipleOreDrops(ModBlocks.PINK_GARNET_DEEPSLATE_ORE, ModItems.RAW_PINK_GARNET, 3, 7));
        addDrop(ModBlocks.RUBY_ORE, multipleOreDrops(ModBlocks.RUBY_ORE, ModItems.RAW_RUBY, 1, 3));

        addDrop(ModBlocks.ALEXANDRITE_ORE, multipleOreDrops(ModBlocks.ALEXANDRITE_ORE, ModItems.RAW_ALEXANDRITE, 1, 3));
        addDrop(ModBlocks.ALEXANDRITE_END_ORE, multipleOreDrops(ModBlocks.ALEXANDRITE_END_ORE, ModItems.RAW_ALEXANDRITE, 5, 9));
        addDrop(ModBlocks.ALEXANDRITE_NETHER_ORE, multipleOreDrops(ModBlocks.ALEXANDRITE_NETHER_ORE, ModItems.RAW_ALEXANDRITE, 4, 8));



        // Pink Garnet
        addDrop(ModBlocks.PINK_GARNET_BUTTON);
        addDrop(ModBlocks.PINK_GARNET_DOOR);
        addDrop(ModBlocks.PINK_GARNET_TRAPDOOR);
        addDrop(ModBlocks.PINK_GARNET_FENCE);
        addDrop(ModBlocks.PINK_GARNET_FENCE_GATE);
        addDrop(ModBlocks.PINK_GARNET_STAIRS);
        addDrop(ModBlocks.PINK_GARNET_PRESSURE_PLATE, doorDrops(ModBlocks.PINK_GARNET_DOOR));
        addDrop(ModBlocks.PINK_GARNET_SLAB, slabDrops(ModBlocks.PINK_GARNET_SLAB));

// Alexandrite
        addDrop(ModBlocks.ALEXANDRITE_BUTTON);
        addDrop(ModBlocks.ALEXANDRITE_DOOR);
        addDrop(ModBlocks.ALEXANDRITE_TRAPDOOR);
        addDrop(ModBlocks.ALEXANDRITE_FENCE);
        addDrop(ModBlocks.ALEXANDRITE_FENCE_GATE);
        addDrop(ModBlocks.ALEXANDRITE_STAIRS);
        addDrop(ModBlocks.ALEXANDRITE_PRESSURE_PLATE, doorDrops(ModBlocks.ALEXANDRITE_DOOR));
        addDrop(ModBlocks.ALEXANDRITE_SLAB, slabDrops(ModBlocks.ALEXANDRITE_SLAB));

// Azurite
        addDrop(ModBlocks.AZURITE_BUTTON);
        addDrop(ModBlocks.AZURITE_DOOR);
        addDrop(ModBlocks.AZURITE_TRAPDOOR);
        addDrop(ModBlocks.AZURITE_FENCE);
        addDrop(ModBlocks.AZURITE_FENCE_GATE);
        addDrop(ModBlocks.AZURITE_STAIRS);
        addDrop(ModBlocks.AZURITE_PRESSURE_PLATE, doorDrops(ModBlocks.AZURITE_DOOR));
        addDrop(ModBlocks.AZURITE_SLAB, slabDrops(ModBlocks.AZURITE_SLAB));

// Bismuth
        addDrop(ModBlocks.BISMUTH_BUTTON);
        addDrop(ModBlocks.BISMUTH_DOOR);
        addDrop(ModBlocks.BISMUTH_TRAPDOOR);
        addDrop(ModBlocks.BISMUTH_FENCE);
        addDrop(ModBlocks.BISMUTH_FENCE_GATE);
        addDrop(ModBlocks.BISMUTH_STAIRS);
        addDrop(ModBlocks.BISMUTH_PRESSURE_PLATE, doorDrops(ModBlocks.BISMUTH_DOOR));
        addDrop(ModBlocks.BISMUTH_SLAB, slabDrops(ModBlocks.BISMUTH_SLAB));

// Ruby
        addDrop(ModBlocks.RUBY_BUTTON);
        addDrop(ModBlocks.RUBY_DOOR);
        addDrop(ModBlocks.RUBY_TRAPDOOR);
        addDrop(ModBlocks.RUBY_FENCE);
        addDrop(ModBlocks.RUBY_FENCE_GATE);
        addDrop(ModBlocks.RUBY_STAIRS);
        addDrop(ModBlocks.RUBY_PRESSURE_PLATE, doorDrops(ModBlocks.RUBY_DOOR));
        addDrop(ModBlocks.RUBY_SLAB, slabDrops(ModBlocks.RUBY_SLAB));

// Zircon
        addDrop(ModBlocks.ZIRCON_BUTTON);
        addDrop(ModBlocks.ZIRCON_DOOR);
        addDrop(ModBlocks.ZIRCON_TRAPDOOR);
        addDrop(ModBlocks.ZIRCON_FENCE);
        addDrop(ModBlocks.ZIRCON_FENCE_GATE);
        addDrop(ModBlocks.ZIRCON_STAIRS);
        addDrop(ModBlocks.ZIRCON_PRESSURE_PLATE, doorDrops(ModBlocks.ZIRCON_DOOR));
        addDrop(ModBlocks.ZIRCON_SLAB, slabDrops(ModBlocks.ZIRCON_SLAB));

// Titanium
        addDrop(ModBlocks.TITANIUM_BUTTON);
        addDrop(ModBlocks.TITANIUM_DOOR);
        addDrop(ModBlocks.TITANIUM_TRAPDOOR);
        addDrop(ModBlocks.TITANIUM_FENCE);
        addDrop(ModBlocks.TITANIUM_FENCE_GATE);
        addDrop(ModBlocks.TITANIUM_STAIRS);
        addDrop(ModBlocks.TITANIUM_PRESSURE_PLATE, doorDrops(ModBlocks.TITANIUM_DOOR));
        addDrop(ModBlocks.TITANIUM_SLAB, slabDrops(ModBlocks.TITANIUM_SLAB));

// Black Opal
        addDrop(ModBlocks.BLACK_OPAL_BUTTON);
        addDrop(ModBlocks.BLACK_OPAL_DOOR);
        addDrop(ModBlocks.BLACK_OPAL_TRAPDOOR);
        addDrop(ModBlocks.BLACK_OPAL_FENCE);
        addDrop(ModBlocks.BLACK_OPAL_FENCE_GATE);
        addDrop(ModBlocks.BLACK_OPAL_STAIRS);
        addDrop(ModBlocks.BLACK_OPAL_PRESSURE_PLATE, doorDrops(ModBlocks.BLACK_OPAL_DOOR));
        addDrop(ModBlocks.BLACK_OPAL_SLAB, slabDrops(ModBlocks.BLACK_OPAL_SLAB));

// Citrine
        addDrop(ModBlocks.CITRINE_BUTTON);
        addDrop(ModBlocks.CITRINE_DOOR);
        addDrop(ModBlocks.CITRINE_TRAPDOOR);
        addDrop(ModBlocks.CITRINE_FENCE);
        addDrop(ModBlocks.CITRINE_FENCE_GATE);
        addDrop(ModBlocks.CITRINE_STAIRS);
        addDrop(ModBlocks.CITRINE_PRESSURE_PLATE, doorDrops(ModBlocks.CITRINE_DOOR));
        addDrop(ModBlocks.CITRINE_SLAB, slabDrops(ModBlocks.CITRINE_SLAB));

// Fluorite
        addDrop(ModBlocks.FLUORITE_BUTTON);
        addDrop(ModBlocks.FLUORITE_DOOR);
        addDrop(ModBlocks.FLUORITE_TRAPDOOR);
        addDrop(ModBlocks.FLUORITE_FENCE);
        addDrop(ModBlocks.FLUORITE_FENCE_GATE);
        addDrop(ModBlocks.FLUORITE_STAIRS);
        addDrop(ModBlocks.FLUORITE_PRESSURE_PLATE, doorDrops(ModBlocks.FLUORITE_DOOR));
        addDrop(ModBlocks.FLUORITE_SLAB, slabDrops(ModBlocks.FLUORITE_SLAB));

// Lithium
        addDrop(ModBlocks.LITHIUM_BUTTON);
        addDrop(ModBlocks.LITHIUM_DOOR);
        addDrop(ModBlocks.LITHIUM_TRAPDOOR);
        addDrop(ModBlocks.LITHIUM_FENCE);
        addDrop(ModBlocks.LITHIUM_FENCE_GATE);
        addDrop(ModBlocks.LITHIUM_STAIRS);
        addDrop(ModBlocks.LITHIUM_PRESSURE_PLATE, doorDrops(ModBlocks.LITHIUM_DOOR));
        addDrop(ModBlocks.LITHIUM_SLAB, slabDrops(ModBlocks.LITHIUM_SLAB));

// Mythril
        addDrop(ModBlocks.MYTHRIL_BUTTON);
        addDrop(ModBlocks.MYTHRIL_DOOR);
        addDrop(ModBlocks.MYTHRIL_TRAPDOOR);
        addDrop(ModBlocks.MYTHRIL_FENCE);
        addDrop(ModBlocks.MYTHRIL_FENCE_GATE);
        addDrop(ModBlocks.MYTHRIL_STAIRS);
        addDrop(ModBlocks.MYTHRIL_PRESSURE_PLATE, doorDrops(ModBlocks.MYTHRIL_DOOR));
        addDrop(ModBlocks.MYTHRIL_SLAB, slabDrops(ModBlocks.MYTHRIL_SLAB));

// Sapphire
        addDrop(ModBlocks.SAPPHIRE_BUTTON);
        addDrop(ModBlocks.SAPPHIRE_DOOR);
        addDrop(ModBlocks.SAPPHIRE_TRAPDOOR);
        addDrop(ModBlocks.SAPPHIRE_FENCE);
        addDrop(ModBlocks.SAPPHIRE_FENCE_GATE);
        addDrop(ModBlocks.SAPPHIRE_STAIRS);
        addDrop(ModBlocks.SAPPHIRE_PRESSURE_PLATE, doorDrops(ModBlocks.SAPPHIRE_DOOR));
        addDrop(ModBlocks.SAPPHIRE_SLAB, slabDrops(ModBlocks.SAPPHIRE_SLAB));

// Tanzanite
        addDrop(ModBlocks.TANZANITE_BUTTON);
        addDrop(ModBlocks.TANZANITE_DOOR);
        addDrop(ModBlocks.TANZANITE_TRAPDOOR);
        addDrop(ModBlocks.TANZANITE_FENCE);
        addDrop(ModBlocks.TANZANITE_FENCE_GATE);
        addDrop(ModBlocks.TANZANITE_STAIRS);
        addDrop(ModBlocks.TANZANITE_PRESSURE_PLATE, doorDrops(ModBlocks.TANZANITE_DOOR));
        addDrop(ModBlocks.TANZANITE_SLAB, slabDrops(ModBlocks.TANZANITE_SLAB));

    }

    public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops))))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }
}