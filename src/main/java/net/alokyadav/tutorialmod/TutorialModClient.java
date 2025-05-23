package net.alokyadav.tutorialmod;

import net.alokyadav.tutorialmod.blocks.ModBlocks;
import net.alokyadav.tutorialmod.blocks.custom.MagicBlock;
import net.alokyadav.tutorialmod.util.ModModelPredicates;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class TutorialModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
// Pink Garnet
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_GARNET_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_GARNET_TRAPDOOR, RenderLayer.getCutout());

// Alexandrite
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ALEXANDRITE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ALEXANDRITE_TRAPDOOR, RenderLayer.getCutout());

// Bismuth
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BISMUTH_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BISMUTH_TRAPDOOR, RenderLayer.getCutout());

// Azurite
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.AZURITE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.AZURITE_TRAPDOOR, RenderLayer.getCutout());

// Ruby
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RUBY_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RUBY_TRAPDOOR, RenderLayer.getCutout());

// Zircon


// Titanium
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TITANIUM_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TITANIUM_TRAPDOOR, RenderLayer.getCutout());

// Black Opal
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLACK_OPAL_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLACK_OPAL_TRAPDOOR, RenderLayer.getCutout());



// Fluorite
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FLUORITE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FLUORITE_TRAPDOOR, RenderLayer.getCutout());

// Lithium


// Sapphire
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SAPPHIRE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SAPPHIRE_TRAPDOOR, RenderLayer.getCutout());

// Tanzanite




        ModModelPredicates.registerModelPredicates();
    }
}

