package com.clarkster.animated_armor.datagen;

import com.clarkster.animated_armor.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.LIVING_BOOTS, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIVING_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIVING_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIVING_LEGGINGS, Models.GENERATED);
    }
}
