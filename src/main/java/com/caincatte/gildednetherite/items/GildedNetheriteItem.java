package com.caincatte.gildednetherite.items;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;


public class GildedNetheriteItem extends ArmorItem implements AdvancedArmorItem{
    public GildedNetheriteItem(ArmorMaterial material, EquipmentSlot slot, Settings settings) {
        super(material, slot, settings);
    }

    @Override
    public boolean isFireproof() {
        return true;
    }

    @Override
    public boolean hasKnockbackResistance() {
        return getMaterial().getKnockbackResistance() > 0;
    }
}
