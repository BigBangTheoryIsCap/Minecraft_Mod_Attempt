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
        BlockStateModelGenerator.BlockTexturePool adamantitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ADAMANTITE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool aquariumPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.AQUARIUM_BLOCK);
        BlockStateModelGenerator.BlockTexturePool banglumPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BANGLUM_BLOCK);
        BlockStateModelGenerator.BlockTexturePool carmotPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CARMOT_BLOCK);
        BlockStateModelGenerator.BlockTexturePool kyberPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.KYBER_BLOCK);
        BlockStateModelGenerator.BlockTexturePool manganesePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MANGANESE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool midasGoldPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MIDAS_GOLD_BLOCK);
        BlockStateModelGenerator.BlockTexturePool morkitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MORKITE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool orichalcumPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ORICHALCUM_BLOCK);
        BlockStateModelGenerator.BlockTexturePool osmiumPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.OSMIUM_BLOCK);
        BlockStateModelGenerator.BlockTexturePool palladiumPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PALLADIUM_BLOCK);
        BlockStateModelGenerator.BlockTexturePool platinumPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PLATINUM_BLOCK);
        BlockStateModelGenerator.BlockTexturePool prometheumPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PROMETHEUM_BLOCK);
        BlockStateModelGenerator.BlockTexturePool quadrillumPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.QUADRILLUM_BLOCK);
        BlockStateModelGenerator.BlockTexturePool runitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RUNITE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool silverPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SILVER_BLOCK);
        BlockStateModelGenerator.BlockTexturePool starritePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.STARRITE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool stormyxPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.STORMYX_BLOCK);
        BlockStateModelGenerator.BlockTexturePool tinPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TIN_BLOCK);
        BlockStateModelGenerator.BlockTexturePool unobtainiumPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.UNOBTAINIUM_BLOCK);


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

        zirconPool.stairs(ModBlocks.ZIRCON_STAIRS);
        zirconPool.slab(ModBlocks.ZIRCON_SLAB);
        zirconPool.fence(ModBlocks.ZIRCON_FENCE);
        zirconPool.fenceGate(ModBlocks.ZIRCON_FENCE_GATE);
        zirconPool.pressurePlate(ModBlocks.ZIRCON_PRESSURE_PLATE);
        zirconPool.button(ModBlocks.ZIRCON_BUTTON);
        zirconPool.wall(ModBlocks.ZIRCON_WALL);

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




        registerAll(blockStateModelGenerator, fluoritePool,
                ModBlocks.FLUORITE_DOOR, ModBlocks.FLUORITE_TRAPDOOR,
                ModBlocks.FLUORITE_STAIRS, ModBlocks.FLUORITE_SLAB,
                ModBlocks.FLUORITE_FENCE, ModBlocks.FLUORITE_FENCE_GATE,
                ModBlocks.FLUORITE_PRESSURE_PLATE, ModBlocks.FLUORITE_BUTTON,
                ModBlocks.FLUORITE_WALL);



        registerAll(blockStateModelGenerator, sapphirePool,
                ModBlocks.SAPPHIRE_DOOR, ModBlocks.SAPPHIRE_TRAPDOOR,
                ModBlocks.SAPPHIRE_STAIRS, ModBlocks.SAPPHIRE_SLAB,
                ModBlocks.SAPPHIRE_FENCE, ModBlocks.SAPPHIRE_FENCE_GATE,
                ModBlocks.SAPPHIRE_PRESSURE_PLATE, ModBlocks.SAPPHIRE_BUTTON,
                ModBlocks.SAPPHIRE_WALL);


        citrinePool.stairs(ModBlocks.CITRINE_STAIRS);
        citrinePool.slab(ModBlocks.CITRINE_SLAB);
        citrinePool.fence(ModBlocks.CITRINE_FENCE);
        citrinePool.fenceGate(ModBlocks.CITRINE_FENCE_GATE);
        citrinePool.pressurePlate(ModBlocks.CITRINE_PRESSURE_PLATE);
        citrinePool.button(ModBlocks.CITRINE_BUTTON);
        citrinePool.wall(ModBlocks.CITRINE_WALL);

        tanzanitePool.stairs(ModBlocks.TANZANITE_STAIRS);
        tanzanitePool.slab(ModBlocks.TANZANITE_SLAB);
        tanzanitePool.fence(ModBlocks.TANZANITE_FENCE);
        tanzanitePool.fenceGate(ModBlocks.TANZANITE_FENCE_GATE);
        tanzanitePool.pressurePlate(ModBlocks.TANZANITE_PRESSURE_PLATE);
        tanzanitePool.button(ModBlocks.TANZANITE_BUTTON);
        tanzanitePool.wall(ModBlocks.TANZANITE_WALL);

        lithiumPool.stairs(ModBlocks.LITHIUM_STAIRS);
        lithiumPool.slab(ModBlocks.LITHIUM_SLAB);
        lithiumPool.fence(ModBlocks.LITHIUM_FENCE);
        lithiumPool.fenceGate(ModBlocks.LITHIUM_FENCE_GATE);
        lithiumPool.pressurePlate(ModBlocks.LITHIUM_PRESSURE_PLATE);
        lithiumPool.button(ModBlocks.LITHIUM_BUTTON);
        lithiumPool.wall(ModBlocks.LITHIUM_WALL);

        mythrilPool.stairs(ModBlocks.MYTHRIL_STAIRS);
        mythrilPool.slab(ModBlocks.MYTHRIL_SLAB);
        mythrilPool.fence(ModBlocks.MYTHRIL_FENCE);
        mythrilPool.fenceGate(ModBlocks.MYTHRIL_FENCE_GATE);
        mythrilPool.pressurePlate(ModBlocks.MYTHRIL_PRESSURE_PLATE);
        mythrilPool.button(ModBlocks.MYTHRIL_BUTTON);
        mythrilPool.wall(ModBlocks.MYTHRIL_WALL);



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

        adamantitePool.stairs(ModBlocks.ADAMANTITE_STAIRS);
        adamantitePool.slab(ModBlocks.ADAMANTITE_SLAB);
        adamantitePool.fence(ModBlocks.ADAMANTITE_FENCE);
        adamantitePool.fenceGate(ModBlocks.ADAMANTITE_FENCE_GATE);
        adamantitePool.pressurePlate(ModBlocks.ADAMANTITE_PRESSURE_PLATE);
        adamantitePool.button(ModBlocks.ADAMANTITE_BUTTON);
        adamantitePool.wall(ModBlocks.ADAMANTITE_WALL);
        aquariumPool.stairs(ModBlocks.AQUARIUM_STAIRS);
        aquariumPool.slab(ModBlocks.AQUARIUM_SLAB);
        aquariumPool.fence(ModBlocks.AQUARIUM_FENCE);
        aquariumPool.fenceGate(ModBlocks.AQUARIUM_FENCE_GATE);
        aquariumPool.pressurePlate(ModBlocks.AQUARIUM_PRESSURE_PLATE);
        aquariumPool.button(ModBlocks.AQUARIUM_BUTTON);
        aquariumPool.wall(ModBlocks.AQUARIUM_WALL);
        banglumPool.stairs(ModBlocks.BANGLUM_STAIRS);
        banglumPool.slab(ModBlocks.BANGLUM_SLAB);
        banglumPool.fence(ModBlocks.BANGLUM_FENCE);
        banglumPool.fenceGate(ModBlocks.BANGLUM_FENCE_GATE);
        banglumPool.pressurePlate(ModBlocks.BANGLUM_PRESSURE_PLATE);
        banglumPool.button(ModBlocks.BANGLUM_BUTTON);
        banglumPool.wall(ModBlocks.BANGLUM_WALL);
        carmotPool.stairs(ModBlocks.CARMOT_STAIRS);
        carmotPool.slab(ModBlocks.CARMOT_SLAB);
        carmotPool.fence(ModBlocks.CARMOT_FENCE);
        carmotPool.fenceGate(ModBlocks.CARMOT_FENCE_GATE);
        carmotPool.pressurePlate(ModBlocks.CARMOT_PRESSURE_PLATE);
        carmotPool.button(ModBlocks.CARMOT_BUTTON);
        carmotPool.wall(ModBlocks.CARMOT_WALL);

        kyberPool.stairs(ModBlocks.KYBER_STAIRS);
        kyberPool.slab(ModBlocks.KYBER_SLAB);
        kyberPool.fence(ModBlocks.KYBER_FENCE);
        kyberPool.fenceGate(ModBlocks.KYBER_FENCE_GATE);
        kyberPool.pressurePlate(ModBlocks.KYBER_PRESSURE_PLATE);
        kyberPool.button(ModBlocks.KYBER_BUTTON);
        kyberPool.wall(ModBlocks.KYBER_WALL);

        manganesePool.stairs(ModBlocks.MANGANESE_STAIRS);
        manganesePool.slab(ModBlocks.MANGANESE_SLAB);
        manganesePool.fence(ModBlocks.MANGANESE_FENCE);
        manganesePool.fenceGate(ModBlocks.MANGANESE_FENCE_GATE);
        manganesePool.pressurePlate(ModBlocks.MANGANESE_PRESSURE_PLATE);
        manganesePool.button(ModBlocks.MANGANESE_BUTTON);
        manganesePool.wall(ModBlocks.MANGANESE_WALL);

        midasGoldPool.stairs(ModBlocks.MIDAS_GOLD_STAIRS);
        midasGoldPool.slab(ModBlocks.MIDAS_GOLD_SLAB);
        midasGoldPool.fence(ModBlocks.MIDAS_GOLD_FENCE);
        midasGoldPool.fenceGate(ModBlocks.MIDAS_GOLD_FENCE_GATE);
        midasGoldPool.pressurePlate(ModBlocks.MIDAS_GOLD_PRESSURE_PLATE);
        midasGoldPool.button(ModBlocks.MIDAS_GOLD_BUTTON);
        midasGoldPool.wall(ModBlocks.MIDAS_GOLD_WALL);

        morkitePool.stairs(ModBlocks.MORKITE_STAIRS);
        morkitePool.slab(ModBlocks.MORKITE_SLAB);
        morkitePool.fence(ModBlocks.MORKITE_FENCE);
        morkitePool.fenceGate(ModBlocks.MORKITE_FENCE_GATE);
        morkitePool.pressurePlate(ModBlocks.MORKITE_PRESSURE_PLATE);
        morkitePool.button(ModBlocks.MORKITE_BUTTON);
        morkitePool.wall(ModBlocks.MORKITE_WALL);

        orichalcumPool.stairs(ModBlocks.ORICHALCUM_STAIRS);
        orichalcumPool.slab(ModBlocks.ORICHALCUM_SLAB);
        orichalcumPool.fence(ModBlocks.ORICHALCUM_FENCE);
        orichalcumPool.fenceGate(ModBlocks.ORICHALCUM_FENCE_GATE);
        orichalcumPool.pressurePlate(ModBlocks.ORICHALCUM_PRESSURE_PLATE);
        orichalcumPool.button(ModBlocks.ORICHALCUM_BUTTON);
        orichalcumPool.wall(ModBlocks.ORICHALCUM_WALL);

        osmiumPool.stairs(ModBlocks.OSMIUM_STAIRS);
        osmiumPool.slab(ModBlocks.OSMIUM_SLAB);
        osmiumPool.fence(ModBlocks.OSMIUM_FENCE);
        osmiumPool.fenceGate(ModBlocks.OSMIUM_FENCE_GATE);
        osmiumPool.pressurePlate(ModBlocks.OSMIUM_PRESSURE_PLATE);
        osmiumPool.button(ModBlocks.OSMIUM_BUTTON);
        osmiumPool.wall(ModBlocks.OSMIUM_WALL);

        palladiumPool.stairs(ModBlocks.PALLADIUM_STAIRS);
        palladiumPool.slab(ModBlocks.PALLADIUM_SLAB);
        palladiumPool.fence(ModBlocks.PALLADIUM_FENCE);
        palladiumPool.fenceGate(ModBlocks.PALLADIUM_FENCE_GATE);
        palladiumPool.pressurePlate(ModBlocks.PALLADIUM_PRESSURE_PLATE);
        palladiumPool.button(ModBlocks.PALLADIUM_BUTTON);
        palladiumPool.wall(ModBlocks.PALLADIUM_WALL);

        platinumPool.stairs(ModBlocks.PLATINUM_STAIRS);
        platinumPool.slab(ModBlocks.PLATINUM_SLAB);
        platinumPool.fence(ModBlocks.PLATINUM_FENCE);
        platinumPool.fenceGate(ModBlocks.PLATINUM_FENCE_GATE);
        platinumPool.pressurePlate(ModBlocks.PLATINUM_PRESSURE_PLATE);
        platinumPool.button(ModBlocks.PLATINUM_BUTTON);
        platinumPool.wall(ModBlocks.PLATINUM_WALL);

        prometheumPool.stairs(ModBlocks.PROMETHEUM_STAIRS);
        prometheumPool.slab(ModBlocks.PROMETHEUM_SLAB);
        prometheumPool.fence(ModBlocks.PROMETHEUM_FENCE);
        prometheumPool.fenceGate(ModBlocks.PROMETHEUM_FENCE_GATE);
        prometheumPool.pressurePlate(ModBlocks.PROMETHEUM_PRESSURE_PLATE);
        prometheumPool.button(ModBlocks.PROMETHEUM_BUTTON);
        prometheumPool.wall(ModBlocks.PROMETHEUM_WALL);

        quadrillumPool.stairs(ModBlocks.QUADRILLUM_STAIRS);
        quadrillumPool.slab(ModBlocks.QUADRILLUM_SLAB);
        quadrillumPool.fence(ModBlocks.QUADRILLUM_FENCE);
        quadrillumPool.fenceGate(ModBlocks.QUADRILLUM_FENCE_GATE);
        quadrillumPool.pressurePlate(ModBlocks.QUADRILLUM_PRESSURE_PLATE);
        quadrillumPool.button(ModBlocks.QUADRILLUM_BUTTON);
        quadrillumPool.wall(ModBlocks.QUADRILLUM_WALL);

        runitePool.stairs(ModBlocks.RUNITE_STAIRS);
        runitePool.slab(ModBlocks.RUNITE_SLAB);
        runitePool.fence(ModBlocks.RUNITE_FENCE);
        runitePool.fenceGate(ModBlocks.RUNITE_FENCE_GATE);
        runitePool.pressurePlate(ModBlocks.RUNITE_PRESSURE_PLATE);
        runitePool.button(ModBlocks.RUNITE_BUTTON);
        runitePool.wall(ModBlocks.RUNITE_WALL);

        silverPool.stairs(ModBlocks.SILVER_STAIRS);
        silverPool.slab(ModBlocks.SILVER_SLAB);
        silverPool.fence(ModBlocks.SILVER_FENCE);
        silverPool.fenceGate(ModBlocks.SILVER_FENCE_GATE);
        silverPool.pressurePlate(ModBlocks.SILVER_PRESSURE_PLATE);
        silverPool.button(ModBlocks.SILVER_BUTTON);
        silverPool.wall(ModBlocks.SILVER_WALL);

        starritePool.stairs(ModBlocks.STARRITE_STAIRS);
        starritePool.slab(ModBlocks.STARRITE_SLAB);
        starritePool.fence(ModBlocks.STARRITE_FENCE);
        starritePool.fenceGate(ModBlocks.STARRITE_FENCE_GATE);
        starritePool.pressurePlate(ModBlocks.STARRITE_PRESSURE_PLATE);
        starritePool.button(ModBlocks.STARRITE_BUTTON);
        starritePool.wall(ModBlocks.STARRITE_WALL);

        stormyxPool.stairs(ModBlocks.STORMYX_STAIRS);
        stormyxPool.slab(ModBlocks.STORMYX_SLAB);
        stormyxPool.fence(ModBlocks.STORMYX_FENCE);
        stormyxPool.fenceGate(ModBlocks.STORMYX_FENCE_GATE);
        stormyxPool.pressurePlate(ModBlocks.STORMYX_PRESSURE_PLATE);
        stormyxPool.button(ModBlocks.STORMYX_BUTTON);
        stormyxPool.wall(ModBlocks.STORMYX_WALL);

        tinPool.stairs(ModBlocks.TIN_STAIRS);
        tinPool.slab(ModBlocks.TIN_SLAB);
        tinPool.fence(ModBlocks.TIN_FENCE);
        tinPool.fenceGate(ModBlocks.TIN_FENCE_GATE);
        tinPool.pressurePlate(ModBlocks.TIN_PRESSURE_PLATE);
        tinPool.button(ModBlocks.TIN_BUTTON);
        tinPool.wall(ModBlocks.TIN_WALL);

        unobtainiumPool.stairs(ModBlocks.UNOBTAINIUM_STAIRS);
        unobtainiumPool.slab(ModBlocks.UNOBTAINIUM_SLAB);
        unobtainiumPool.fence(ModBlocks.UNOBTAINIUM_FENCE);
        unobtainiumPool.fenceGate(ModBlocks.UNOBTAINIUM_FENCE_GATE);
        unobtainiumPool.pressurePlate(ModBlocks.UNOBTAINIUM_PRESSURE_PLATE);
        unobtainiumPool.button(ModBlocks.UNOBTAINIUM_BUTTON);
        unobtainiumPool.wall(ModBlocks.UNOBTAINIUM_WALL);



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
        itemModelGenerator.register(ModItems.AQUARIUM_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.BANGLUM_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARMOT_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.KYBER_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.MANGANESE_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.MIDAS_GOLD_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORICHALCUM_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.OSMIUM_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.PALLADIUM_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.PLATINUM_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.PROMETHEUM_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.QUADRILLUM_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUNITE_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.SILVER_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.STORMYX_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.TIN_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.MYTHRIL_DUST, Models.GENERATED);

        itemModelGenerator.register(ModItems.RAW_ADAMANTITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_AQUARIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_BANGLUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_CARMOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_KYBER, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_MANGANESE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_MIDAS_GOLD, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_ORICHALCUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_OSMIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_PALLADIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_PLATINUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_PROMETHEUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_QUADRILLUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_RUNITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_SILVER, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_STORMYX, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_TIN, Models.GENERATED);



        itemModelGenerator.register(ModItems.ADAMANTITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.AQUARIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BANGLUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARMOT_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.KYBER_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.MANGANESE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.MIDAS_GOLD_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.MORKITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORICHALCUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.OSMIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.PALLADIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.PLATINUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.PROMETHEUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.QUADRILLUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUNITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.SILVER_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.STARRITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.STORMYX_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.TIN_INGOT, Models.GENERATED);


        itemModelGenerator.register(ModItems.ADAMANTITE_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.AQUARIUM_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.BANGLUM_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARMOT_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.KYBER_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.MANGANESE_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.MIDAS_GOLD_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.MYTHRIL_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORICHALCUM_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.OSMIUM_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.PALLADIUM_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.PLATINUM_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.PROMETHEUM_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.QUADRILLUM_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUNITE_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.SILVER_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.STORMYX_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.TIN_NUGGET, Models.GENERATED);






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