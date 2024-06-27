package net.bobibacon.potion;

import net.bobibacon.WitherPotionMod;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.potion.Potion;
import net.minecraft.recipe.BrewingRecipeRegistry;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModPotions {

    public static final RegistryEntry<Potion> Wither_Potion= Registry.registerReference(Registries.POTION, Identifier.of(WitherPotionMod.MOD_ID,"wither_potion"),new Potion(new StatusEffectInstance(StatusEffects.WITHER,900,0)));
    public static final RegistryEntry<Potion> Strong_Wither_Potion= Registry.registerReference(Registries.POTION, Identifier.of(WitherPotionMod.MOD_ID,"strong_wither_potion"),new Potion(new StatusEffectInstance(StatusEffects.WITHER,432,1)));
    public static final RegistryEntry<Potion> Long_Wither_Potion= Registry.registerReference(Registries.POTION, Identifier.of(WitherPotionMod.MOD_ID,"long_wither_potion"),new Potion(new StatusEffectInstance(StatusEffects.WITHER,1800,0)));
    public static void register(){
    }
}
