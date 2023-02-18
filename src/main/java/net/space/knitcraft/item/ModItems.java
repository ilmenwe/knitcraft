package net.space.knitcraft.item;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.space.knitcraft.Knitcraft;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
           DeferredRegister.create(ForgeRegistries.ITEMS, Knitcraft.MOD_ID);

    public final static RegistryObject<Item> WHITE_YARN = ITEMS.register( "white_yarn",
           () -> new Item( new Item.Properties()));
    public final static RegistryObject<Item> RAW_WHITE_YARN = ITEMS.register( "raw_white_yarn",
            () -> new Item( new Item.Properties()));

    public final static RegistryObject<ArmorItem> WHITE_YARN_PANTS = ITEMS.register( "white_yarn_pants",
            () -> new ArmorItem(new ArmorMaterial() {
                @Override
                public int getDurabilityForSlot(EquipmentSlot pSlot) {
                    return 10;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return null;
                }

                @Override
                public int getDefenseForSlot(EquipmentSlot pSlot) {
                    return 0;
                }

                @Override
                public SoundEvent getEquipSound() {
                    return SoundEvents.GOAT_SCREAMING_HURT;
                }

                @Override
                public int getEnchantmentValue() {
                    return 0;
                }



                @Override
                public String getName() {
                    return "white_yarn_pants";
                }

                @Override
                public float getToughness() {
                    return 0;
                }

                @Override
                public float getKnockbackResistance() {
                    return 0;
                }
            }, EquipmentSlot.LEGS, new Item.Properties()));


    public final static RegistryObject<ArmorItem> WHITE_YARN_SWEATER = ITEMS.register( "white_yarn_sweater",
            () -> new ArmorItem(new ArmorMaterial() {
                @Override
                public int getDurabilityForSlot(EquipmentSlot pSlot) {
                    return 0;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return null;
                }

                @Override
                public int getDefenseForSlot(EquipmentSlot pSlot) {
                    return 0;
                }

                @Override
                public SoundEvent getEquipSound() {
                    return SoundEvents.GOAT_SCREAMING_HURT;
                }

                @Override
                public int getEnchantmentValue() {
                    return 0;
                }



                @Override
                public String getName() {
                    return "white_yarn_sweater";
                }

                @Override
                public float getToughness() {
                    return 0;
                }

                @Override
                public float getKnockbackResistance() {
                    return 0;
                }
            }, EquipmentSlot.LEGS, new Item.Properties()));

    public final static RegistryObject<ArmorItem> WHITE_YARN_HAT = ITEMS.register( "white_yarn_hat",
            () -> new ArmorItem(new ArmorMaterial() {
                @Override
                public int getDurabilityForSlot(EquipmentSlot pSlot) {
                    return 10;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return null;
                }

                @Override
                public int getDefenseForSlot(EquipmentSlot pSlot) {
                    return 0;
                }

                @Override
                public SoundEvent getEquipSound() {
                    return SoundEvents.GOAT_SCREAMING_HURT;
                }

                @Override
                public int getEnchantmentValue() {
                    return 0;
                }



                @Override
                public String getName() {
                    return "white_yarn_hat";
                }

                @Override
                public float getToughness() {
                    return 0;
                }

                @Override
                public float getKnockbackResistance() {
                    return 0;
                }
            }, EquipmentSlot.HEAD, new Item.Properties()));
    public final static RegistryObject<ArmorItem> WHITE_SOCKS = ITEMS.register( "white_yarn_socks",
            () -> new ArmorItem(new ArmorMaterial() {
                @Override
                public int getDurabilityForSlot(EquipmentSlot pSlot) {
                    return 10;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return null;
                }

                @Override
                public int getDefenseForSlot(EquipmentSlot pSlot) {
                    return 0;
                }

                @Override
                public SoundEvent getEquipSound() {
                    return SoundEvents.GOAT_SCREAMING_HURT;
                }

                @Override
                public int getEnchantmentValue() {
                    return 0;
                }



                @Override
                public String getName() {
                    return "white_yarn_socks";
                }

                @Override
                public float getToughness() {
                    return 0;
                }

                @Override
                public float getKnockbackResistance() {
                    return 0;
                }
            }, EquipmentSlot.FEET, new Item.Properties()));


public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }



}
