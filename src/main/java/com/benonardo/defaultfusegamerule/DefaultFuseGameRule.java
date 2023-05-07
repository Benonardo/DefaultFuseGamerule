package com.benonardo.defaultfusegamerule;

import com.benonardo.defaultfusegamerule.mixin.GameRulesInvoker;
import com.benonardo.defaultfusegamerule.mixin.TntEntityAccessor;
import net.fabricmc.api.ModInitializer;
import net.minecraft.world.GameRules;

public class DefaultFuseGameRule implements ModInitializer {

    public static GameRules.Key<GameRules.IntRule> DEFAULT_TNT_FUSE;

    @Override
    public void onInitialize() {
        DEFAULT_TNT_FUSE = GameRulesInvoker.invokeRegister("defaultTntFuse", GameRules.Category.MISC, GameRulesInvoker.IntRuleInvoker.invokeCreate(TntEntityAccessor.getDEFAULT_FUSE()));
    }

}
