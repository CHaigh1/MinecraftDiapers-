package com.warpedcakez.pissmod;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectType;
import net.minecraft.entity.player.PlayerEntity;

public class PeeStatusEffect extends StatusEffect {
    public PeeStatusEffect() {
        super(StatusEffectType.HARMFUL, 0xFFFF66);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity instanceof PlayerEntity) {
            entity.teleport(entity.getX(), entity.getY(), entity.getZ());
        }
    }
}
