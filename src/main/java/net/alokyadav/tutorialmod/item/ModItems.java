package net.alokyadav.tutorialmod.item;

import net.alokyadav.tutorialmod.TutorialMod;
import net.alokyadav.tutorialmod.item.custom.ChiselItem;
import net.alokyadav.tutorialmod.item.custom.Hammeritem;
import net.alokyadav.tutorialmod.item.custom.ModArmorItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.List;

import static net.alokyadav.tutorialmod.blocks.ModBlocks.PINK_GARNET_STAIRS;

public class ModItems {

    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));
    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", new Item(new Item.Settings()));

    public static final Item MONEY_ITEM = registerItem("cash_money", new Item(new Item.Settings()));

    public static final Item CHISEL = registerItem("chisel", new ChiselItem(new Item.Settings().maxDamage(32)));

    public static final Item CAULIFLOWER = registerItem("cauliflower", new Item(new Item.Settings().food(ModFoodComponents.CAULIFOWER)));
    public static final Item STARLIGHT_ASHES = registerItem("starlight_ashes", new Item(new Item.Settings()));

    public static final Item RUBY = registerItem("ruby", new Item(new Item.Settings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new Item.Settings()));

    public static final Item BISMUTH = registerItem("bismuth", new Item(new Item.Settings()));
    public static final Item RAW_BISMUTH = registerItem("raw_bismuth", new Item(new Item.Settings()));

    public static final Item ALEXANDRITE = registerItem("alexandrite", new Item(new Item.Settings()));
    public static final Item RAW_ALEXANDRITE = registerItem("raw_alexandrite", new Item(new Item.Settings()));

    public static final Item BLACK_OPAL = registerItem("black_opal", new Item(new Item.Settings()));
    public static final Item RAW_BLACK_OPAL = registerItem("raw_black_opal", new Item(new Item.Settings()));

    public static final Item  AZURITE = registerItem("azurite", new Item(new Item.Settings()));
    public static final Item RAW_AZURITE = registerItem("raw_azurite", new Item(new Item.Settings()));

    public static final Item  FLUORITE = registerItem("fluorite", new Item(new Item.Settings()));
    public static final Item RAW_FLUORITE= registerItem("raw_fluorite", new Item(new Item.Settings()));

    public static final Item  MAGIC_MYTHRIL_DUST = registerItem("magic_mythril_dust", new Item(new Item.Settings()));
    public static final Item  MYTHRIL_INGOT = registerItem("mythril_ingot", new Item(new Item.Settings()));
    public static final Item RAW_MYTHRIL = registerItem("raw_mythril", new Item(new Item.Settings()));

    public static final Item  CITRINE = registerItem("citrine", new Item(new Item.Settings()));
    public static final Item RAW_CITRINE = registerItem("raw_citrine", new Item(new Item.Settings()));

    public static final Item  TANZANITE = registerItem("tanzanite", new Item(new Item.Settings()));
    public static final Item RAW_TANZANITE = registerItem("raw_tanzanite", new Item(new Item.Settings()));

    public static final Item  SAPPHIRE = registerItem("sapphire", new Item(new Item.Settings()));
    public static final Item RAW_SAPPHIRE = registerItem("raw_sapphire", new Item(new Item.Settings()));

    public static final Item  ZIRCON = registerItem("zircon", new Item(new Item.Settings()));
    public static final Item RAW_ZIRCON = registerItem("raw_zircon", new Item(new Item.Settings()));

    public static final Item  LITHIUM = registerItem("lithium", new Item(new Item.Settings()));
    public static final Item RAW_LITHIUM = registerItem("raw_lithium", new Item(new Item.Settings()));

    public static final Item  TITANIUM_INGOT = registerItem("titanium_ingot", new Item(new Item.Settings()));
    public static final Item RAW_TITANIUM = registerItem("raw_titanium", new Item(new Item.Settings()));


    // ALEXANDRITE
    public static final Item ALEXANDRITE_PICKAXE = registerItem("alexandrite_pickaxe",
            new PickaxeItem(ModToolMaterials.ALEXANDRITE, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.ALEXANDRITE, 1, -2.8f))));

    public static final Item ALEXANDRITE_SHOVEL = registerItem("alexandrite_shovel",
            new ShovelItem(ModToolMaterials.ALEXANDRITE, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.ALEXANDRITE, 1.5f, -3.0f))));

    public static final Item ALEXANDRITE_HOE = registerItem("alexandrite_hoe",
            new HoeItem(ModToolMaterials.ALEXANDRITE, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.ALEXANDRITE, 6, -3.2f))));

    public static final Item ALEXANDRITE_AXE = registerItem("alexandrite_axe",
            new AxeItem(ModToolMaterials.ALEXANDRITE, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.ALEXANDRITE, 0, -3f))));


    // AZURITE
    public static final Item AZURITE_PICKAXE = registerItem("azurite_pickaxe",
            new PickaxeItem(ModToolMaterials.AZURITE, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.AZURITE, 1, -2.8f))));

    public static final Item AZURITE_SHOVEL = registerItem("azurite_shovel",
            new ShovelItem(ModToolMaterials.AZURITE, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.AZURITE, 1.5f, -3.0f))));

    public static final Item AZURITE_HOE = registerItem("azurite_hoe",
            new HoeItem(ModToolMaterials.AZURITE, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.AZURITE, 6, -3.2f))));

    public static final Item AZURITE_AXE = registerItem("azurite_axe",
            new AxeItem(ModToolMaterials.AZURITE, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.AZURITE, 0, -3f))));



    // BLACK_OPAL
    public static final Item BLACK_OPAL_PICKAXE = registerItem("black_opal_pickaxe",
            new PickaxeItem(ModToolMaterials.BLACK_OPAL, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.BLACK_OPAL, 1, -2.8f))));

    public static final Item BLACK_OPAL_SHOVEL = registerItem("black_opal_shovel",
            new ShovelItem(ModToolMaterials.BLACK_OPAL, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.BLACK_OPAL, 1.5f, -3.0f))));

    public static final Item BLACK_OPAL_HOE = registerItem("black_opal_hoe",
            new HoeItem(ModToolMaterials.BLACK_OPAL, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.BLACK_OPAL, 6, -3.2f))));

    public static final Item BLACK_OPAL_AXE = registerItem("black_opal_axe",
            new AxeItem(ModToolMaterials.BLACK_OPAL, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.BLACK_OPAL, 0, -3f))));
// ... previous entries

    // ZIRCON
    public static final Item ZIRCON_PICKAXE = registerItem("zircon_pickaxe",
            new PickaxeItem(ModToolMaterials.ZIRCON, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.ZIRCON, 1, -2.8f))));

    public static final Item ZIRCON_SHOVEL = registerItem("zircon_shovel",
            new ShovelItem(ModToolMaterials.ZIRCON, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.ZIRCON, 1.5f, -3.0f))));

    public static final Item ZIRCON_HOE = registerItem("zircon_hoe",
            new HoeItem(ModToolMaterials.ZIRCON, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.ZIRCON, 6, -3.2f))));

    public static final Item ZIRCON_AXE = registerItem("zircon_axe",
            new AxeItem(ModToolMaterials.ZIRCON, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.ZIRCON, 0, -3f))));


    // PINK_GARNET
    public static final Item PINK_GARNET_PICKAXE = registerItem("pink_garnet_pickaxe",
            new PickaxeItem(ModToolMaterials.PINK_GARNET, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.PINK_GARNET, 1, -2.8f))));

    public static final Item PINK_GARNET_SHOVEL = registerItem("pink_garnet_shovel",
            new ShovelItem(ModToolMaterials.PINK_GARNET, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.PINK_GARNET, 1.5f, -3.0f))));

    public static final Item PINK_GARNET_HOE = registerItem("pink_garnet_hoe",
            new HoeItem(ModToolMaterials.PINK_GARNET, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.PINK_GARNET, 6, -3.2f))));

    public static final Item PINK_GARNET_AXE = registerItem("pink_garnet_axe",
            new AxeItem(ModToolMaterials.PINK_GARNET, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.PINK_GARNET, 0, -3f))));

    // CITRINE
    public static final Item CITRINE_PICKAXE = registerItem("citrine_pickaxe",
            new PickaxeItem(ModToolMaterials.CITRINE, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.CITRINE, 1, -2.8f))));

    public static final Item CITRINE_SHOVEL = registerItem("citrine_shovel",
            new ShovelItem(ModToolMaterials.CITRINE, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.CITRINE, 1.5f, -3.0f))));

    public static final Item CITRINE_HOE = registerItem("citrine_hoe",
            new HoeItem(ModToolMaterials.CITRINE, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.CITRINE, 6, -3.2f))));

    public static final Item CITRINE_AXE = registerItem("citrine_axe",
            new AxeItem(ModToolMaterials.CITRINE, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.CITRINE, 0, -3f))));


    // LITHIUM
    public static final Item LITHIUM_PICKAXE = registerItem("lithium_pickaxe",
            new PickaxeItem(ModToolMaterials.LITHIUM, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.LITHIUM, 1, -2.8f))));

    public static final Item LITHIUM_SHOVEL = registerItem("lithium_shovel",
            new ShovelItem(ModToolMaterials.LITHIUM, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.LITHIUM, 1.5f, -3.0f))));

    public static final Item LITHIUM_HOE = registerItem("lithium_hoe",
            new HoeItem(ModToolMaterials.LITHIUM, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.LITHIUM, 6, -3.2f))));

    public static final Item LITHIUM_AXE = registerItem("lithium_axe",
            new AxeItem(ModToolMaterials.LITHIUM, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.LITHIUM, 0, -3f))));


    // FLUORITE
    public static final Item FLUORITE_PICKAXE = registerItem("fluorite_pickaxe",
            new PickaxeItem(ModToolMaterials.FLUORITE, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.FLUORITE, 1, -2.8f))));

    public static final Item FLUORITE_SHOVEL = registerItem("fluorite_shovel",
            new ShovelItem(ModToolMaterials.FLUORITE, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.FLUORITE, 1.5f, -3.0f))));

    public static final Item FLUORITE_HOE = registerItem("fluorite_hoe",
            new HoeItem(ModToolMaterials.FLUORITE, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.FLUORITE, 6, -3.2f))));

    public static final Item FLUORITE_AXE = registerItem("fluorite_axe",
            new AxeItem(ModToolMaterials.FLUORITE, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.FLUORITE, 0, -3f))));



    public static final Item SAPPHIRE_PICKAXE = registerItem("sapphire_pickaxe",
            new PickaxeItem(ModToolMaterials.SAPPHIRE, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.SAPPHIRE, 1, -2.8f))));

    public static final Item SAPPHIRE_SHOVEL = registerItem("sapphire_shovel",
            new ShovelItem(ModToolMaterials.SAPPHIRE, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.SAPPHIRE, 1.5f, -3.0f))));

    public static final Item SAPPHIRE_HOE = registerItem("sapphire_hoe",
            new HoeItem(ModToolMaterials.SAPPHIRE, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.SAPPHIRE, 6, -3.2f))));

    public static final Item SAPPHIRE_AXE = registerItem("sapphire_axe",
            new AxeItem(ModToolMaterials.SAPPHIRE, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.SAPPHIRE, 0, -3f))));

    public static final Item BISMUTH_PICKAXE = registerItem("bismuth_pickaxe",
            new PickaxeItem(ModToolMaterials.BISMUTH, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.BISMUTH, 1, -2.8f))));

    public static final Item BISMUTH_SHOVEL = registerItem("bismuth_shovel",
            new ShovelItem(ModToolMaterials.BISMUTH, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.BISMUTH, 1.5f, -3.0f))));

    public static final Item BISMUTH_HOE = registerItem("bismuth_hoe",
            new HoeItem(ModToolMaterials.BISMUTH, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.BISMUTH, 6, -3.2f))));

    public static final Item BISMUTH_AXE = registerItem("bismuth_axe",
            new AxeItem(ModToolMaterials.BISMUTH, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.BISMUTH, 0, -3f))));


    // TANZANITE
    public static final Item TANZANITE_PICKAXE = registerItem("tanzanite_pickaxe",
            new PickaxeItem(ModToolMaterials.TANZANITE, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.TANZANITE, 1, -2.8f))));

    public static final Item TANZANITE_SHOVEL = registerItem("tanzanite_shovel",
            new ShovelItem(ModToolMaterials.TANZANITE, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.TANZANITE, 1.5f, -3.0f))));

    public static final Item TANZANITE_HOE = registerItem("tanzanite_hoe",
            new HoeItem(ModToolMaterials.TANZANITE, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.TANZANITE, 6, -3.2f))));

    public static final Item TANZANITE_AXE = registerItem("tanzanite_axe",
            new AxeItem(ModToolMaterials.TANZANITE, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.TANZANITE, 0, -3f))));

    public static final Item TITANIUM_HOE = registerItem("titanium_hoe",
            new AxeItem(ModToolMaterials.TITANIUM, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.TITANIUM, 0, -3f))));

    public static final Item TITANIUM_SHOVEL = registerItem("titanium_shovel",
            new AxeItem(ModToolMaterials.TITANIUM, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.TITANIUM, 0, -3f))));

    public static final Item TITANIUM_AXE = registerItem("titanium_axe",
            new AxeItem(ModToolMaterials.TITANIUM, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.TITANIUM, 0, -3f))));

    public static final Item TITANIUM_PICKAXE = registerItem("titanium_pickaxe",
            new AxeItem(ModToolMaterials.TITANIUM, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.TITANIUM, 0, -3f))));




    // RUBY
    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe",
            new PickaxeItem(ModToolMaterials.RUBY, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.RUBY, 1, -2.8f))));

    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel",
            new ShovelItem(ModToolMaterials.RUBY, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.RUBY, 1.5f, -3.0f))));

    public static final Item RUBY_HOE = registerItem("ruby_hoe",
            new HoeItem(ModToolMaterials.RUBY, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.RUBY, 6, -3.2f))));

    public static final Item RUBY_AXE = registerItem("ruby_axe",
            new AxeItem(ModToolMaterials.RUBY, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.RUBY, 0, -3f))));

    public static final Item ALEXANDRITE_SWORD = registerItem("alexandrite_sword",
            new SwordItem(ModToolMaterials.ALEXANDRITE, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.ALEXANDRITE, 3, -2.4f))));

    public static final Item AZURITE_SWORD = registerItem("azurite_sword",
            new SwordItem(ModToolMaterials.AZURITE, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.AZURITE, 3, -2.4f))));

    public static final Item BLACK_OPAL_SWORD = registerItem("black_opal_sword",
            new SwordItem(ModToolMaterials.BLACK_OPAL, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.BLACK_OPAL, 3, -2.4f))));

    public static final Item BISMUTH_SWORD = registerItem("bismuth_sword",
            new SwordItem(ModToolMaterials.BISMUTH, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.BISMUTH, 3, -2.4f))));

    public static final Item CITRINE_SWORD = registerItem("citrine_sword",
            new SwordItem(ModToolMaterials.CITRINE, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.CITRINE, 3, -2.4f))));

    public static final Item FLUORITE_SWORD = registerItem("fluorite_sword",
            new SwordItem(ModToolMaterials.FLUORITE, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.FLUORITE, 3, -2.4f))));

    public static final Item LITHIUM_SWORD = registerItem("lithium_sword",
            new SwordItem(ModToolMaterials.LITHIUM, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.LITHIUM, 3, -2.4f))));

    public static final Item PINK_GARNET_SWORD = registerItem("pink_garnet_sword",
            new SwordItem(ModToolMaterials.PINK_GARNET, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.PINK_GARNET, 3, -2.4f))));

    public static final Item RUBY_SWORD = registerItem("ruby_sword",
            new SwordItem(ModToolMaterials.RUBY, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.RUBY, 3, -2.4f))));

    public static final Item SAPPHIRE_SWORD = registerItem("sapphire_sword",
            new SwordItem(ModToolMaterials.SAPPHIRE, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.SAPPHIRE, 3, -2.4f))));

    public static final Item TANZANITE_SWORD = registerItem("tanzanite_sword",
            new SwordItem(ModToolMaterials.TANZANITE, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.TANZANITE, 3, -2.4f))));

    public static final Item TITANIUM_SWORD = registerItem("titanium_sword",
            new SwordItem(ModToolMaterials.TITANIUM, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.TITANIUM, 3, -2.4f))));

    public static final Item ZIRCON_SWORD = registerItem("zircon_sword",
            new SwordItem(ModToolMaterials.ZIRCON, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.ZIRCON, 3, -2.4f))));




// Repeat the same pattern for: CITRINE, LITHIUM, FLUORITE, ZIRCON, PINK_GARNET, SAPPHIRE, TANZANITE, RUBY

// If you'd like me to continue and generate the rest of the materials just say "continue".

    public static final Item BISMUTH_HAMMER = registerItem("bismuth_hammer",
            new Hammeritem(ModToolMaterials.BISMUTH, new Item.Settings()
                    .attributeModifiers(Hammeritem.createAttributeModifiers(ModToolMaterials.BISMUTH, 5, -3.4f))));


    public static final Item PINK_GARNET_HAMMER = registerItem("pink_garnet_hammer",
            new Hammeritem(ModToolMaterials.PINK_GARNET, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.PINK_GARNET, 7, -3.4f))));

    public static final Item ALEXANDRITE_HAMMER = registerItem("alexandrite_hammer",
            new Hammeritem(ModToolMaterials.ALEXANDRITE, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.ALEXANDRITE, 7, -3.4f))));

    // Alexandrite
    public static final Item ALEXANDRITE_HELMET = registerItem("alexandrite_helmet",
            new ArmorItem(ModArmorMaterials.ALEXANDRITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));
    public static final Item ALEXANDRITE_CHESTPLATE = registerItem("alexandrite_chestplate",
            new ModArmorItem(ModArmorMaterials.ALEXANDRITE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));
    public static final Item ALEXANDRITE_LEGGINGS = registerItem("alexandrite_leggings",
            new ArmorItem(ModArmorMaterials.ALEXANDRITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));
    public static final Item ALEXANDRITE_BOOTS = registerItem("alexandrite_boots",
            new ArmorItem(ModArmorMaterials.ALEXANDRITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))));

    // Azurite
    public static final Item AZURITE_HELMET = registerItem("azurite_helmet",
            new ArmorItem(ModArmorMaterials.AZURITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));
    public static final Item AZURITE_CHESTPLATE = registerItem("azurite_chestplate",
            new ModArmorItem(ModArmorMaterials.AZURITE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));
    public static final Item AZURITE_LEGGINGS = registerItem("azurite_leggings",
            new ArmorItem(ModArmorMaterials.AZURITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));
    public static final Item AZURITE_BOOTS = registerItem("azurite_boots",
            new ArmorItem(ModArmorMaterials.AZURITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))));

    // Black Opal
    public static final Item BLACK_OPAL_HELMET = registerItem("black_opal_helmet",
            new ArmorItem(ModArmorMaterials.BLACK_OPAL_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));
    public static final Item BLACK_OPAL_CHESTPLATE = registerItem("black_opal_chestplate",
            new ModArmorItem(ModArmorMaterials.BLACK_OPAL_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));
    public static final Item BLACK_OPAL_LEGGINGS = registerItem("black_opal_leggings",
            new ArmorItem(ModArmorMaterials.BLACK_OPAL_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));
    public static final Item BLACK_OPAL_BOOTS = registerItem("black_opal_boots",
            new ArmorItem(ModArmorMaterials.BLACK_OPAL_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))));

    // Bismuth
    public static final Item BISMUTH_HELMET = registerItem("bismuth_helmet",
            new ArmorItem(ModArmorMaterials.BISMUTH_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));
    public static final Item BISMUTH_CHESTPLATE = registerItem("bismuth_chestplate",
            new ModArmorItem(ModArmorMaterials.BISMUTH_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));
    public static final Item BISMUTH_LEGGINGS = registerItem("bismuth_leggings",
            new ArmorItem(ModArmorMaterials.BISMUTH_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));
    public static final Item BISMUTH_BOOTS = registerItem("bismuth_boots",
            new ArmorItem(ModArmorMaterials.BISMUTH_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))));

    // Citrine
    public static final Item CITRINE_HELMET = registerItem("citrine_helmet",
            new ArmorItem(ModArmorMaterials.CITRINE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));
    public static final Item CITRINE_CHESTPLATE = registerItem("citrine_chestplate",
            new ModArmorItem(ModArmorMaterials.CITRINE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));
    public static final Item CITRINE_LEGGINGS = registerItem("citrine_leggings",
            new ArmorItem(ModArmorMaterials.CITRINE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));
    public static final Item CITRINE_BOOTS = registerItem("citrine_boots",
            new ArmorItem(ModArmorMaterials.CITRINE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))));


    public static final Item PINK_GARNET_HORSE_ARMOR = registerItem("pink_garnet_horse_armor",
            new AnimalArmorItem(ModArmorMaterials.PINK_GARNET_ARMOR_MATERIAL, AnimalArmorItem.Type.EQUESTRIAN, false, new Item.Settings().maxCount(1)));
    public static final Item ALEXANDRITE_HORSE_ARMOR = registerItem("alexandrite_horse_armor",
            new AnimalArmorItem(ModArmorMaterials.ALEXANDRITE_ARMOR_MATERIAL, AnimalArmorItem.Type.EQUESTRIAN, false, new Item.Settings().maxCount(1)));
    public static final Item BISMUTH_HORSE_ARMOR = registerItem("bismuth_horse_armor",
            new AnimalArmorItem(ModArmorMaterials.BISMUTH_ARMOR_MATERIAL, AnimalArmorItem.Type.EQUESTRIAN, false, new Item.Settings().maxCount(1)));

    // Fluorite
    public static final Item FLUORITE_HELMET = registerItem("fluorite_helmet",
            new ArmorItem(ModArmorMaterials.FLUORITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));
    public static final Item FLUORITE_CHESTPLATE = registerItem("fluorite_chestplate",
            new ModArmorItem(ModArmorMaterials.FLUORITE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));
    public static final Item FLUORITE_LEGGINGS = registerItem("fluorite_leggings",
            new ArmorItem(ModArmorMaterials.FLUORITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));
    public static final Item FLUORITE_BOOTS = registerItem("fluorite_boots",
            new ArmorItem(ModArmorMaterials.FLUORITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))));

    // Lithium
    public static final Item LITHIUM_HELMET = registerItem("lithium_helmet",
            new ArmorItem(ModArmorMaterials.LITHIUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));
    public static final Item LITHIUM_CHESTPLATE = registerItem("lithium_chestplate",
            new ModArmorItem(ModArmorMaterials.LITHIUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));
    public static final Item LITHIUM_LEGGINGS = registerItem("lithium_leggings",
            new ArmorItem(ModArmorMaterials.LITHIUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));
    public static final Item LITHIUM_BOOTS = registerItem("lithium_boots",
            new ArmorItem(ModArmorMaterials.LITHIUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))));

    // Mythril
    public static final Item MYTHRIL_HELMET = registerItem("mythril_helmet",
            new ArmorItem(ModArmorMaterials.MYTHRIL_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));
    public static final Item MYTHRIL_CHESTPLATE = registerItem("mythril_chestplate",
            new ModArmorItem(ModArmorMaterials.MYTHRIL_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));
    public static final Item MYTHRIL_LEGGINGS = registerItem("mythril_leggings",
            new ArmorItem(ModArmorMaterials.MYTHRIL_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));
    public static final Item MYTHRIL_BOOTS = registerItem("mythril_boots",
            new ArmorItem(ModArmorMaterials.MYTHRIL_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))));

    // Pink Garnet
    public static final Item PINK_GARNET_HELMET = registerItem("pink_garnet_helmet",
            new ArmorItem(ModArmorMaterials.PINK_GARNET_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));
    public static final Item PINK_GARNET_CHESTPLATE = registerItem("pink_garnet_chestplate",
            new ModArmorItem(ModArmorMaterials.PINK_GARNET_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));
    public static final Item PINK_GARNET_LEGGINGS = registerItem("pink_garnet_leggings",
            new ArmorItem(ModArmorMaterials.PINK_GARNET_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));
    public static final Item PINK_GARNET_BOOTS = registerItem("pink_garnet_boots",
            new ArmorItem(ModArmorMaterials.PINK_GARNET_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))));

    // Ruby
    public static final Item RUBY_HELMET = registerItem("ruby_helmet",
            new ArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));
    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate",
            new ModArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));
    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings",
            new ArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));
    public static final Item RUBY_BOOTS = registerItem("ruby_boots",
            new ArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))));

    // Sapphire
    public static final Item SAPPHIRE_HELMET = registerItem("sapphire_helmet",
            new ArmorItem(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));
    public static final Item SAPPHIRE_CHESTPLATE = registerItem("sapphire_chestplate",
            new ModArmorItem(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));
    public static final Item SAPPHIRE_LEGGINGS = registerItem("sapphire_leggings",
            new ArmorItem(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));
    public static final Item SAPPHIRE_BOOTS = registerItem("sapphire_boots",
            new ArmorItem(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))));

    // Tanzanite
    public static final Item TANZANITE_HELMET = registerItem("tanzanite_helmet",
            new ArmorItem(ModArmorMaterials.TANZANITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));
    public static final Item TANZANITE_CHESTPLATE = registerItem("tanzanite_chestplate",
            new ModArmorItem(ModArmorMaterials.TANZANITE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));
    public static final Item TANZANITE_LEGGINGS = registerItem("tanzanite_leggings",
            new ArmorItem(ModArmorMaterials.TANZANITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));
    public static final Item TANZANITE_BOOTS = registerItem("tanzanite_boots",
            new ArmorItem(ModArmorMaterials.TANZANITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))));

    // Titanium
    public static final Item TITANIUM_HELMET = registerItem("titanium_helmet",
            new ArmorItem(ModArmorMaterials.TITANIUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));
    public static final Item TITANIUM_CHESTPLATE = registerItem("titanium_chestplate",
            new ModArmorItem(ModArmorMaterials.TITANIUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));
    public static final Item TITANIUM_LEGGINGS = registerItem("titanium_leggings",
            new ArmorItem(ModArmorMaterials.TITANIUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));
    public static final Item TITANIUM_BOOTS = registerItem("titanium_boots",
            new ArmorItem(ModArmorMaterials.TITANIUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))));

    // Zircon
    public static final Item ZIRCON_HELMET = registerItem("zircon_helmet",
            new ArmorItem(ModArmorMaterials.ZIRCON_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));
    public static final Item ZIRCON_CHESTPLATE = registerItem("zircon_chestplate",
            new ModArmorItem(ModArmorMaterials.ZIRCON_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));
    public static final Item ZIRCON_LEGGINGS = registerItem("zircon_leggings",
            new ArmorItem(ModArmorMaterials.ZIRCON_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));
    public static final Item ZIRCON_BOOTS = registerItem("zircon_boots",
            new ArmorItem(ModArmorMaterials.ZIRCON_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))));


    public static final Item KAUPEN_SMITHING_TEMPLATE = registerItem("kaupen_armor_trim_smithing_template",
            SmithingTemplateItem.of(Identifier.of(TutorialMod.MOD_ID, "kaupen"), FeatureFlags.VANILLA));

    public static final Item KAUPEN_BOW = registerItem("kaupen_bow",
            new BowItem(new Item.Settings().maxDamage(500)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PINK_GARNET);
            entries.add(RAW_PINK_GARNET);
            entries.add(MONEY_ITEM);
            entries.add(CHISEL);
            entries.add(CAULIFLOWER);
            entries.add(STARLIGHT_ASHES);
            entries.add(RUBY);
            entries.add(ALEXANDRITE);
        });
    }
}