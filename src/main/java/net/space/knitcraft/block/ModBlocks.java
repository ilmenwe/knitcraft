package net.space.knitcraft.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.space.knitcraft.Knitcraft;
import net.space.knitcraft.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Knitcraft.MOD_ID);
    public static void register(IEventBus eventbus){
        BLOCKS.register(eventbus);
    }

    public static final RegistryObject<Block> WHITE_YARN_BLOCK = registerBlock("white_yarn_block",
    ()-> new Block(BlockBehaviour.Properties.of(Material.WOOL)
            .strength(1.0f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLACK_YARN_BLOCK = registerBlock("black_yarn_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.WOOL)
                    .strength(1.0f).requiresCorrectToolForDrops()));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name,block);
        registerBlockItem(name,toReturn);
        return toReturn;
    }
    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
        new Item.Properties()));
    }
}
