package net.space.knitcraft;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.space.knitcraft.block.ModBlocks;
import net.space.knitcraft.item.ModCreativeModeTab;
import net.space.knitcraft.item.ModItems;
import net.space.knitcraft.recipies.ModRecipes;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Knitcraft.MOD_ID)
public class Knitcraft
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "knitcraft";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    // Create a Deferred Register to hold Blocks which will all be registered under the "examplemod" namespace
    public Knitcraft()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
        ModRecipes.register(modEventBus);
    }


    private void commonSetup(final FMLCommonSetupEvent event)
    {
    }


    private void addCreative(CreativeModeTabEvent.BuildContents event)
    {
        if(event.getTab() == CreativeModeTabs.COMBAT) {
            event.accept((ModItems.WHITE_YARN_PANTS));
            event.accept(ModItems.WHITE_YARN_HAT);
        }
        if(event.getTab() == CreativeModeTabs.INGREDIENTS) {
            event.accept((ModItems.WHITE_YARN));
            event.accept((ModItems.RAW_WHITE_YARN));
        }
        if(event.getTab() == CreativeModeTabs.BUILDING_BLOCKS){
            event.accept(ModBlocks.WHITE_YARN_BLOCK);
            event.accept(ModBlocks.BLACK_YARN_BLOCK);
        }
        if(event.getTab() == ModCreativeModeTab.KNITCRAFT_TAB) {
            event.accept((ModItems.WHITE_YARN));
            event.accept((ModItems.RAW_WHITE_YARN));
            event.accept(ModBlocks.WHITE_YARN_BLOCK);
            event.accept(ModBlocks.BLACK_YARN_BLOCK);
            event.accept(ModBlocks.BLACK_YARN_BLOCK);
            event.accept(ModItems.WHITE_YARN_PANTS);
            event.accept(ModItems.WHITE_YARN_HAT);


        }
    }


    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
        }
    }
}
