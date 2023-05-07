package com.benonardo.defaultfusegamerule.mixin;

import net.minecraft.entity.TntEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(TntEntity.class)
public interface TntEntityAccessor {

    @Accessor
    static int getDEFAULT_FUSE() {
        throw new AssertionError();
    }

}
