package net.alokyadav.tutorialmod.datagen;

import net.alokyadav.tutorialmod.blocks.custom.AlexandriteLampBlock;
import net.alokyadav.tutorialmod.blocks.custom.BismuthLampBlock;
import net.alokyadav.tutorialmod.blocks.custom.PinkGarnetLampBlock;
import net.alokyadav.tutorialmod.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.alokyadav.tutorialmod.blocks.ModBlocks;
import net.alokyadav.tutorialmod.item.ModItems;
import net.minecraft.block.Block;
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
        BlockStateModelGenerator.BlockTexturePool azuritePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.AZURITE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool rubyPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RUBY_BLOCK);
        BlockStateModelGenerator.BlockTexturePool zirconPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ZIRCON_BLOCK);
        BlockStateModelGenerator.BlockTexturePool titaniumPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TITANIUM_BLOCK);
        BlockStateModelGenerator.BlockTexturePool bismuthPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BISMUTH_BLOCK);
        BlockStateModelGenerator.BlockTexturePool blackOpalPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLACK_OPAL_BLOCK);
        BlockStateModelGenerator.BlockTexturePool citrinePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CITRINE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool fluoritePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FLUORITE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool lithiumPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LITHIUM_BLOCK);
        BlockStateModelGenerator.BlockTexturePool mythrilPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MYTHRIL_BLOCK);
        BlockStateModelGenerator.BlockTexturePool sapphirePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SAPPHIRE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool tanzanitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TANZANITE_BLOCK);


        registerAll(blockStateModelGenerator, azuritePool,
                ModBlocks.AZURITE_DOOR, ModBlocks.AZURITE_TRAPDOOR,
                ModBlocks.AZURITE_STAIRS, ModBlocks.AZURITE_SLAB,
                ModBlocks.AZURITE_FENCE, ModBlocks.AZURITE_FENCE_GATE,
                ModBlocks.AZURITE_PRESSURE_PLATE, ModBlocks.AZURITE_BUTTON,
                ModBlocks.AZURITE_WALL);

        registerAll(blockStateModelGenerator, rubyPool,
                ModBlocks.RUBY_DOOR, ModBlocks.RUBY_TRAPDOOR,
                ModBlocks.RUBY_STAIRS, ModBlocks.RUBY_SLAB,
                ModBlocks.RUBY_FENCE, ModBlocks.RUBY_FENCE_GATE,
                ModBlocks.RUBY_PRESSURE_PLATE, ModBlocks.RUBY_BUTTON,
                ModBlocks.RUBY_WALL);

        registerAll(blockStateModelGenerator, zirconPool,
                ModBlocks.ZIRCON_DOOR, ModBlocks.ZIRCON_TRAPDOOR,
                ModBlocks.ZIRCON_STAIRS, ModBlocks.ZIRCON_SLAB,
                ModBlocks.ZIRCON_FENCE, ModBlocks.ZIRCON_FENCE_GATE,
                ModBlocks.ZIRCON_PRESSURE_PLATE, ModBlocks.ZIRCON_BUTTON,
                ModBlocks.ZIRCON_WALL);

        registerAll(blockStateModelGenerator, titaniumPool,
                ModBlocks.TITANIUM_DOOR, ModBlocks.TITANIUM_TRAPDOOR,
                ModBlocks.TITANIUM_STAIRS, ModBlocks.TITANIUM_SLAB,
                ModBlocks.TITANIUM_FENCE, ModBlocks.TITANIUM_FENCE_GATE,
                ModBlocks.TITANIUM_PRESSURE_PLATE, ModBlocks.TITANIUM_BUTTON,
                ModBlocks.TITANIUM_WALL);


        registerAll(blockStateModelGenerator, blackOpalPool,
                ModBlocks.BLACK_OPAL_DOOR, ModBlocks.BLACK_OPAL_TRAPDOOR,
                ModBlocks.BLACK_OPAL_STAIRS, ModBlocks.BLACK_OPAL_SLAB,
                ModBlocks.BLACK_OPAL_FENCE, ModBlocks.BLACK_OPAL_FENCE_GATE,
                ModBlocks.BLACK_OPAL_PRESSURE_PLATE, ModBlocks.BLACK_OPAL_BUTTON,
                ModBlocks.BLACK_OPAL_WALL);

        registerAll(blockStateModelGenerator, citrinePool,
                ModBlocks.CITRINE_DOOR, ModBlocks.CITRINE_TRAPDOOR,
                ModBlocks.CITRINE_STAIRS, ModBlocks.CITRINE_SLAB,
                ModBlocks.CITRINE_FENCE, ModBlocks.CITRINE_FENCE_GATE,
                ModBlocks.CITRINE_PRESSURE_PLATE, ModBlocks.CITRINE_BUTTON,
                ModBlocks.CITRINE_WALL);

        registerAll(blockStateModelGenerator, fluoritePool,
                ModBlocks.FLUORITE_DOOR, ModBlocks.FLUORITE_TRAPDOOR,
                ModBlocks.FLUORITE_STAIRS, ModBlocks.FLUORITE_SLAB,
                ModBlocks.FLUORITE_FENCE, ModBlocks.FLUORITE_FENCE_GATE,
                ModBlocks.FLUORITE_PRESSURE_PLATE, ModBlocks.FLUORITE_BUTTON,
                ModBlocks.FLUORITE_WALL);

        registerAll(blockStateModelGenerator, lithiumPool,
                ModBlocks.LITHIUM_DOOR, ModBlocks.LITHIUM_TRAPDOOR,
                ModBlocks.LITHIUM_STAIRS, ModBlocks.LITHIUM_SLAB,
                ModBlocks.LITHIUM_FENCE, ModBlocks.LITHIUM_FENCE_GATE,
                ModBlocks.LITHIUM_PRESSURE_PLATE, ModBlocks.LITHIUM_BUTTON,
                ModBlocks.LITHIUM_WALL);

        registerAll(blockStateModelGenerator, mythrilPool,
                ModBlocks.MYTHRIL_DOOR, ModBlocks.MYTHRIL_TRAPDOOR,
                ModBlocks.MYTHRIL_STAIRS, ModBlocks.MYTHRIL_SLAB,
                ModBlocks.MYTHRIL_FENCE, ModBlocks.MYTHRIL_FENCE_GATE,
                ModBlocks.MYTHRIL_PRESSURE_PLATE, ModBlocks.MYTHRIL_BUTTON,
                ModBlocks.MYTHRIL_WALL);

        registerAll(blockStateModelGenerator, sapphirePool,
                ModBlocks.SAPPHIRE_DOOR, ModBlocks.SAPPHIRE_TRAPDOOR,
                ModBlocks.SAPPHIRE_STAIRS, ModBlocks.SAPPHIRE_SLAB,
                ModBlocks.SAPPHIRE_FENCE, ModBlocks.SAPPHIRE_FENCE_GATE,
                ModBlocks.SAPPHIRE_PRESSURE_PLATE, ModBlocks.SAPPHIRE_BUTTON,
                ModBlocks.SAPPHIRE_WALL);

        registerAll(blockStateModelGenerator, tanzanitePool,
                ModBlocks.TANZANITE_DOOR, ModBlocks.TANZANITE_TRAPDOOR,
                ModBlocks.TANZANITE_STAIRS, ModBlocks.TANZANITE_SLAB,
                ModBlocks.TANZANITE_FENCE, ModBlocks.TANZANITE_FENCE_GATE,
                ModBlocks.TANZANITE_PRESSURE_PLATE, ModBlocks.TANZANITE_BUTTON,
                ModBlocks.TANZANITE_WALL);


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
        //blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_BLOCK);


        //blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AZURITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AZURITE_ORE);


        //blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLACK_OPAL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLACK_OPAL_ORE);

        //blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CITRINE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CITRINE_ORE);

        //blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FLUORITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FLUORITE_ORE);

        //blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LITHIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LITHIUM_ORE);

        //blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MYTHRIL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MYTHRIL_ORE);

        //blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SAPPHIRE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SAPPHIRE_ORE);

        //blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TANZANITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TANZANITE_ORE);


        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TITANIUM_ORE);


        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ZIRCON_ORE);


        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ADAMANTITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AQUARIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BANGLUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CARMOT_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.KYBER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MANGANESE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MIDAS_GOLD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MORKITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORICHALCUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OSMIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PALLADIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PLATINUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PROMETHEUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.QUADRILLUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUNITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILVER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STARRITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STORMYX_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TIN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.UNOBTAINIUM_ORE);



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

    private void registerAll(BlockStateModelGenerator generator, BlockStateModelGenerator.BlockTexturePool pool,
                             Block door, Block trapdoor, Block stairs, Block slab, Block fence, Block fenceGate,
                             Block pressurePlate, Block button, Block wall) {

        pool.stairs(stairs);
        pool.slab(slab);
        pool.fence(fence);
        pool.fenceGate(fenceGate);
        pool.pressurePlate(pressurePlate);
        pool.button(button);
        pool.wall(wall);

        generator.registerDoor(door);
        generator.registerTrapdoor(trapdoor);
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


        itemModelGenerator.register(ModItems.ADAMANTITE_DUST, Models.GENERATED);




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