package net.alokyadav.tutorialmod.datagen;

import net.alokyadav.tutorialmod.blocks.custom.AlexandriteLampBlock;
import net.alokyadav.tutorialmod.blocks.custom.BismuthLampBlock;
import net.alokyadav.tutorialmod.blocks.custom.PinkGarnetLampBlock;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.alokyadav.tutorialmod.blocks.ModBlocks;
import net.alokyadav.tutorialmod.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.*;
import net.minecraft.item.ArmorItem;
import net.minecraft.util.Identifier;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool pinkGarnetPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PINK_GARNET_BLOCK);
        BlockStateModelGenerator.BlockTexturePool alexandritePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ALEXANDRITE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool bismuthPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BISMUTH_BLOCK);


        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_PINK_GARNET_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_GARNET_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_GARNET_DEEPSLATE_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_RUBY_BLOCK);


        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_ALEXANDRITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BISMUTH_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BISMUTH_END_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BISMUTH_NETHER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BISMUTH_DEEPSLATE_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ALEXANDRITE_NETHER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ALEXANDRITE_END_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ALEXANDRITE_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAGIC_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_BLOCK);

        pinkGarnetPool.stairs(ModBlocks.PINK_GARNET_STAIRS);
        pinkGarnetPool.slab(ModBlocks.PINK_GARNET_SLAB);
        pinkGarnetPool.fence(ModBlocks.PINK_GARNET_FENCE);
        pinkGarnetPool.fenceGate(ModBlocks.PINK_GARNET_FENCE_GATE);
        pinkGarnetPool.pressurePlate(ModBlocks.PINK_GARNET_PRESSURE_PLATE);
        pinkGarnetPool.button(ModBlocks.PINK_GARNET_BUTTON);
        pinkGarnetPool.wall(ModBlocks.PINK_GARNET_WALL);

        blockStateModelGenerator.registerDoor(ModBlocks.PINK_GARNET_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.PINK_GARNET_TRAPDOOR);

        alexandritePool.stairs(ModBlocks.ALEXANDRITE_STAIRS);
        alexandritePool.slab(ModBlocks.ALEXANDRITE_SLAB);
        alexandritePool.fence(ModBlocks.ALEXANDRITE_FENCE);
        alexandritePool.fenceGate(ModBlocks.ALEXANDRITE_FENCE_GATE);
        alexandritePool.pressurePlate(ModBlocks.ALEXANDRITE_PRESSURE_PLATE);
        alexandritePool.button(ModBlocks.ALEXANDRITE_BUTTON);
        alexandritePool.wall(ModBlocks.ALEXANDRITE_WALL);

        blockStateModelGenerator.registerDoor(ModBlocks.ALEXANDRITE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.ALEXANDRITE_TRAPDOOR);

        bismuthPool.stairs(ModBlocks.BISMUTH_STAIRS);
        bismuthPool.slab(ModBlocks.BISMUTH_SLAB);
        bismuthPool.fence(ModBlocks.BISMUTH_FENCE);
        bismuthPool.fenceGate(ModBlocks.BISMUTH_FENCE_GATE);
        bismuthPool.pressurePlate(ModBlocks.BISMUTH_PRESSURE_PLATE);
        bismuthPool.button(ModBlocks.BISMUTH_BUTTON);
        bismuthPool.wall(ModBlocks.BISMUTH_WALL);

        blockStateModelGenerator.registerDoor(ModBlocks.BISMUTH_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.BISMUTH_TRAPDOOR);


        Identifier lampOffIdentifier =
                                        TexturedModel.CUBE_ALL.upload(ModBlocks.PINK_GARNET_LAMP, blockStateModelGenerator.modelCollector);
                                         TexturedModel.CUBE_ALL.upload(ModBlocks.ALEXANDRITE_LAMP, blockStateModelGenerator.modelCollector);
                                        TexturedModel.CUBE_ALL.upload(ModBlocks.BISMUTH_LAMP, blockStateModelGenerator.modelCollector);
        Identifier lampOnIdentifier =
                                    blockStateModelGenerator.createSubModel(ModBlocks.PINK_GARNET_LAMP, "_on", Models.CUBE_ALL, TextureMap::all);
                                    blockStateModelGenerator.createSubModel(ModBlocks.ALEXANDRITE_LAMP, "_on", Models.CUBE_ALL, TextureMap::all);
                                    blockStateModelGenerator.createSubModel(ModBlocks.BISMUTH_LAMP, "_on", Models.CUBE_ALL, TextureMap::all);

        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.PINK_GARNET_LAMP)
                .coordinate(BlockStateModelGenerator.createBooleanModelMap(PinkGarnetLampBlock.CLICKED, lampOnIdentifier, lampOffIdentifier)));
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.ALEXANDRITE_LAMP)
                .coordinate(BlockStateModelGenerator.createBooleanModelMap(AlexandriteLampBlock.CLICKED, lampOnIdentifier, lampOffIdentifier)));
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.BISMUTH_LAMP)
                .coordinate(BlockStateModelGenerator.createBooleanModelMap(BismuthLampBlock.CLICKED, lampOnIdentifier, lampOffIdentifier)));

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.PINK_GARNET, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_PINK_GARNET, Models.GENERATED);

        itemModelGenerator.register(ModItems.RAW_RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);

        itemModelGenerator.register(ModItems.RAW_BISMUTH, Models.GENERATED);
        itemModelGenerator.register(ModItems.BISMUTH, Models.GENERATED);

        itemModelGenerator.register(ModItems.ALEXANDRITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_ALEXANDRITE, Models.GENERATED);

        itemModelGenerator.register(ModItems.BLACK_OPAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_BLACK_OPAL, Models.GENERATED);

        itemModelGenerator.register(ModItems.AZURITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_AZURITE, Models.GENERATED);

        itemModelGenerator.register(ModItems.MYTHRIL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_MYTHRIL, Models.GENERATED);

        itemModelGenerator.register(ModItems.FLUORITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_FLUORITE, Models.GENERATED);


        itemModelGenerator.register(ModItems.TANZANITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_TANZANITE, Models.GENERATED);

        itemModelGenerator.register(ModItems.TITANIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_TITANIUM, Models.GENERATED);

        itemModelGenerator.register(ModItems.ZIRCON, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_ZIRCON, Models.GENERATED);

        itemModelGenerator.register(ModItems.CITRINE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_CITRINE, Models.GENERATED);


        itemModelGenerator.register(ModItems.LITHIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_LITHIUM, Models.GENERATED);

        itemModelGenerator.register(ModItems.SAPPHIRE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_SAPPHIRE, Models.GENERATED);




        itemModelGenerator.register(ModItems.MONEY_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.CAULIFLOWER, Models.GENERATED);

        // itemModelGenerator.register(ModItems.CHISEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.STARLIGHT_ASHES, Models.GENERATED);

        itemModelGenerator.register(ModItems.ALEXANDRITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ALEXANDRITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ALEXANDRITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ALEXANDRITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ALEXANDRITE_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.ALEXANDRITE_HAMMER, Models.HANDHELD);

        itemModelGenerator.register(ModItems.AZURITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AZURITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AZURITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AZURITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AZURITE_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.BISMUTH_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BISMUTH_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BISMUTH_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BISMUTH_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BISMUTH_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BISMUTH_HAMMER, Models.HANDHELD);

        itemModelGenerator.register(ModItems.BLACK_OPAL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLACK_OPAL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLACK_OPAL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLACK_OPAL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLACK_OPAL_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.CITRINE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CITRINE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CITRINE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CITRINE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CITRINE_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.FLUORITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FLUORITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FLUORITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FLUORITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FLUORITE_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.LITHIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.LITHIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.LITHIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.LITHIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.LITHIUM_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.PINK_GARNET_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PINK_GARNET_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PINK_GARNET_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PINK_GARNET_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PINK_GARNET_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PINK_GARNET_HAMMER, Models.HANDHELD);

        itemModelGenerator.register(ModItems.RUBY_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.SAPPHIRE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.TANZANITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TANZANITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TANZANITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TANZANITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TANZANITE_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.TITANIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.ZIRCON_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ZIRCON_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ZIRCON_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ZIRCON_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ZIRCON_HOE, Models.HANDHELD);

// Alexandrite
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ALEXANDRITE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ALEXANDRITE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ALEXANDRITE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ALEXANDRITE_BOOTS));

// Azurite
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AZURITE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AZURITE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AZURITE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AZURITE_BOOTS));

// Bismuth
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.BISMUTH_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.BISMUTH_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.BISMUTH_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.BISMUTH_BOOTS));

// Black Opal
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.BLACK_OPAL_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.BLACK_OPAL_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.BLACK_OPAL_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.BLACK_OPAL_BOOTS));

// Citrine
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.CITRINE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.CITRINE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.CITRINE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.CITRINE_BOOTS));

// Fluorite
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.FLUORITE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.FLUORITE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.FLUORITE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.FLUORITE_BOOTS));

// Lithium
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.LITHIUM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.LITHIUM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.LITHIUM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.LITHIUM_BOOTS));

// Mythril
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MYTHRIL_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MYTHRIL_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MYTHRIL_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MYTHRIL_BOOTS));

// Pink Garnet
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PINK_GARNET_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PINK_GARNET_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PINK_GARNET_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PINK_GARNET_BOOTS));

// Ruby
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUBY_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUBY_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUBY_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUBY_BOOTS));

// Sapphire
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SAPPHIRE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SAPPHIRE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SAPPHIRE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SAPPHIRE_BOOTS));

// Tanzanite
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TANZANITE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TANZANITE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TANZANITE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TANZANITE_BOOTS));

// Titanium
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TITANIUM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TITANIUM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TITANIUM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TITANIUM_BOOTS));

// Zircon
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ZIRCON_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ZIRCON_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ZIRCON_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ZIRCON_BOOTS));





        itemModelGenerator.register(ModItems.PINK_GARNET_HORSE_ARMOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.ALEXANDRITE_HORSE_ARMOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.BISMUTH_HORSE_ARMOR, Models.GENERATED);

        itemModelGenerator.register(ModItems.KAUPEN_SMITHING_TEMPLATE, Models.GENERATED);



    }
}