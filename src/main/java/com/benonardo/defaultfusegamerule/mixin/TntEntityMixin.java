package com.benonardo.defaultfusegamerule.mixin;

import com.benonardo.defaultfusegamerule.DefaultFuseGameRule;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.TntEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(TntEntity.class)
public abstract class TntEntityMixin extends Entity {

    public TntEntityMixin(EntityType<?> type, World world) {
        super(type, world);
    }

    @ModifyConstant(method = {"initDataTracker", "<init>(Lnet/minecraft/world/World;DDDLnet/minecraft/entity/LivingEntity;)V"}, constant = @Constant(intValue = 80))
    private int makeDefaultFuseGameRuleBased(int constant) {
        return this.world.getGameRules().getInt(DefaultFuseGameRule.DEFAULT_TNT_FUSE);
    }

}
