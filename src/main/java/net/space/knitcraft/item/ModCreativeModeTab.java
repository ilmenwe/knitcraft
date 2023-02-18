package net.space.knitcraft.item;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.space.knitcraft.Knitcraft;

import static net.space.knitcraft.item.ModItems.WHITE_YARN;

@Mod.EventBusSubscriber(modid = Knitcraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTab {
    public static CreativeModeTab KNITCRAFT_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event){
        KNITCRAFT_TAB = event.registerCreativeModeTab( new ResourceLocation(Knitcraft.MOD_ID, "knitcraft_tab"),
                builder -> builder.icon(() -> new ItemStack(WHITE_YARN.get()))
                        .title(Component.translatable("creativemodetab.knitcraft_tab")));
    }
}
