package com.clarkster.animated_armor.entity.client.armor;

import com.clarkster.animated_armor.item.custom.LivingArmorItem;
import net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import software.bernie.geckolib.animatable.client.RenderProvider;
import software.bernie.geckolib.renderer.GeoArmorRenderer;


public class LivingArmorRenderer implements ArmorRenderer {

    @Override
    public void render(MatrixStack matrices, VertexConsumerProvider vertexConsumers, ItemStack stack, LivingEntity entity, EquipmentSlot slot, int light, BipedEntityModel<LivingEntity> contextModel) {
        if (
                stack.getItem() instanceof LivingArmorItem livingArmorItem &&
                RenderProvider.of(livingArmorItem).getHumanoidArmorModel(entity,stack,slot,contextModel) instanceof LivingArmorGeoRenderer geoRenderer
        ) {
            ArmorRenderer.renderPart(
                    matrices,
                    vertexConsumers,
                    light,
                    stack,
                    geoRenderer,
                    geoRenderer.getTextureLocation(livingArmorItem)
            );
        }
    }
    public static class LivingArmorGeoRenderer extends GeoArmorRenderer<LivingArmorItem> {
        public LivingArmorGeoRenderer() {
            super(new LivingArmorModel());
        }
    }
}
