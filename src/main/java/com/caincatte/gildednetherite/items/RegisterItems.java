package com.caincatte.gildednetherite.items;

import com.caincatte.gildednetherite.GildedNetherite;
import com.caincatte.gildednetherite.materials.GildedNetheriteArmorMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterItems {

    public static final Item GILDED_NETHERITE = new Item(new Item.Settings().group(GildedNetherite.GILDED_NETHERITE_GROUP).fireproof());

    public static final Item GILDED_NETHERITE_HELMET = new GildedNetheriteItem(GildedNetheriteArmorMaterial.GILDED_NETHERITE_ARMOR, EquipmentSlot.HEAD, (new Item.Settings().group(GildedNetherite.GILDED_NETHERITE_GROUP).fireproof()));
    public static final Item GILDED_NETHERITE_CHESTPLATE = new GildedNetheriteItem(GildedNetheriteArmorMaterial.GILDED_NETHERITE_ARMOR, EquipmentSlot.CHEST, (new Item.Settings().group(GildedNetherite.GILDED_NETHERITE_GROUP).fireproof()));
    public static final Item GILDED_NETHERITE_LEGGINGS = new GildedNetheriteItem(GildedNetheriteArmorMaterial.GILDED_NETHERITE_ARMOR, EquipmentSlot.LEGS, (new Item.Settings().group(GildedNetherite.GILDED_NETHERITE_GROUP).fireproof()));
    public static final Item GILDED_NETHERITE_BOOTS = new GildedNetheriteItem(GildedNetheriteArmorMaterial.GILDED_NETHERITE_ARMOR, EquipmentSlot.FEET, (new Item.Settings().group(GildedNetherite.GILDED_NETHERITE_GROUP).fireproof()));

    public static final Item GOLDEN_PORKCHOP = new GoldenPorkChopItem(new Item.Settings().group(GildedNetherite.GILDED_NETHERITE_GROUP).food(FoodComponents.COOKED_PORKCHOP));

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("gildednetherite", "gilded_netherite"), GILDED_NETHERITE);

        Registry.register(Registry.ITEM, new Identifier("gildednetherite", "gilded_netherite_helmet"), GILDED_NETHERITE_HELMET);
        Registry.register(Registry.ITEM, new Identifier("gildednetherite", "gilded_netherite_chestplate"), GILDED_NETHERITE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("gildednetherite", "gilded_netherite_leggings"), GILDED_NETHERITE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("gildednetherite", "gilded_netherite_boots"), GILDED_NETHERITE_BOOTS);

        Registry.register(Registry.ITEM, new Identifier("gildednetherite", "golden_porkchop"), GOLDEN_PORKCHOP);
    }
}
