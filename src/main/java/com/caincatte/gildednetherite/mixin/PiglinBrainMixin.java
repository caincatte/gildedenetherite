package com.caincatte.gildednetherite.mixin;

import com.caincatte.gildednetherite.materials.GildedNetheriteArmorMaterial;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.PiglinBrain;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;



@Mixin(PiglinBrain.class)
public abstract class PiglinBrainMixin {

    @Inject(method = "wearsGoldArmor", at = @At("HEAD"), cancellable = true)
    private static void wearsGoldArmor(LivingEntity entity, CallbackInfoReturnable<Boolean> cir){
        for (ItemStack stack : entity.getArmorItems()) {
            Item item = stack.getItem();
            if (stack.getItem() instanceof ArmorItem && ((ArmorItem) stack.getItem()).getMaterial() == GildedNetheriteArmorMaterial.GILDED_NETHERITE_ARMOR) {
                cir.setReturnValue(true);
            }

        }
    }

}
