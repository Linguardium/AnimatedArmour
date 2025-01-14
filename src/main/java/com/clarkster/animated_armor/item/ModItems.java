package com.clarkster.animated_armor.item;

import com.clarkster.animated_armor.AnimatedArmorMod;
import com.clarkster.animated_armor.item.custom.LivingArmorItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {

    public static final Item LIVING_HELMET = registerLivingArmorItem("living_helmet", ArmorItem.Type.HELMET);
    public static final Item LIVING_CHESTPLATE = registerLivingArmorItem("living_chestplate", ArmorItem.Type.CHESTPLATE);
    public static final Item LIVING_LEGGINGS = registerLivingArmorItem("living_leggings", ArmorItem.Type.LEGGINGS);
    public static final Item LIVING_BOOTS = registerLivingArmorItem("living_boots", ArmorItem.Type.BOOTS);

    public static void registerModItems() {
        AnimatedArmorMod.LOGGER.debug("Registering Mod Items for " + AnimatedArmorMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(LIVING_HELMET);
            entries.add(LIVING_CHESTPLATE);
            entries.add(LIVING_LEGGINGS);
            entries.add(LIVING_BOOTS);
        });
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AnimatedArmorMod.MOD_ID, name), item);
    }
    private static Item registerLivingArmorItem(String name, ArmorItem.Type type) {
        return registerItem(name, new LivingArmorItem(ModArmorMaterials.LIVING, type, new Item.Settings()));
    }

}
