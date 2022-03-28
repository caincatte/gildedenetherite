package com.caincatte.gildednetherite.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class GoldenPorkChopItem extends Item {
    public GoldenPorkChopItem(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        ItemStack finishedStack = super.finishUsing(stack, world, user);

        user.addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 150));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 200));

        return finishedStack;
    }
}
