package com.clarkster.animated_armor;

import com.clarkster.animated_armor.entity.client.armor.LivingArmorModel;
import com.clarkster.animated_armor.entity.client.armor.LivingArmorRenderer;
import com.clarkster.animated_armor.item.ModItems;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderer;


public class ClientMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ArmorRenderer.register(new LivingArmorRenderer(), ModItems.LIVING_HELMET, ModItems.LIVING_CHESTPLATE, ModItems.LIVING_LEGGINGS, ModItems.LIVING_BOOTS);
    }
}
