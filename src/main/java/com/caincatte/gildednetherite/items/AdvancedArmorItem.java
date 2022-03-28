package com.caincatte.gildednetherite.items;

public interface AdvancedArmorItem {
    default boolean hasKnockbackResistance() {
        return false;
    }
}
