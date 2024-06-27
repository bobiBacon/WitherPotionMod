package net.bobibacon.mixin;

import net.bobibacon.potion.ModPotions;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.recipe.BrewingRecipeRegistry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BrewingRecipeRegistry.class)
public class BrewingRecipeRegistryMixin {
    @Inject(method = "registerDefaults",at = @At("TAIL"))
    private static void registerPotionRecipes(BrewingRecipeRegistry.Builder builder, CallbackInfo ci){
        builder.registerPotionRecipe(Potions.AWKWARD, Items.WITHER_ROSE,ModPotions.Wither_Potion);
        builder.registerPotionRecipe(ModPotions.Wither_Potion, Items.GLOWSTONE_DUST,ModPotions.Strong_Wither_Potion);
        builder.registerPotionRecipe(ModPotions.Long_Wither_Potion, Items.GLOWSTONE_DUST,ModPotions.Strong_Wither_Potion);
        builder.registerPotionRecipe(ModPotions.Wither_Potion, Items.REDSTONE,ModPotions.Long_Wither_Potion);
        builder.registerPotionRecipe(ModPotions.Strong_Wither_Potion, Items.REDSTONE,ModPotions.Long_Wither_Potion);
        builder.registerPotionRecipe(Potions.WATER, Items.WITHER_ROSE,Potions.MUNDANE);



    }
}
