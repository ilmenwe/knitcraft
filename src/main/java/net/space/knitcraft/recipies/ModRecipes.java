package net.space.knitcraft.recipies;

import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.space.knitcraft.Knitcraft;

public class ModRecipes{
    public static final DeferredRegister<RecipeSerializer<?>> SERAILIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, Knitcraft.MOD_ID);

    public static final RegistryObject<RecipeSerializer<KnitingChairStationRecipe>> KNITING_CHAIR_SERIALIZER =
            SERAILIZERS.register("kniting_chair",()-> KnitingChairStationRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventbus){

        SERAILIZERS.register(eventbus);

    }
}