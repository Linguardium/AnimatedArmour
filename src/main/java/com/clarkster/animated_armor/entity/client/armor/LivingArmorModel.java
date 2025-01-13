package com.clarkster.animated_armor.entity.client.armor;
import com.clarkster.animated_armor.AnimatedArmorMod;
import com.clarkster.animated_armor.ModIdentifiers;
import com.clarkster.animated_armor.item.custom.*;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.model.DefaultedGeoModel;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoRenderer;


public class LivingArmorModel extends DefaultedGeoModel<LivingArmorItem> {
    public LivingArmorModel() {
        super(ModIdentifiers.LIVING_ARMOR_ITEM);
    }
//    @Override
//    public Identifier getModelResource(LivingArmorItem object, @Nullable GeoRenderer<LivingArmorItem> renderer) {
//        return ModIdentifiers.LIVING_ARMOR_ITEM.withPrefixedPath("geo/").withSuffixedPath(".geo.json");
//    }
//
//    @Override
//    public Identifier getTextureResource(LivingArmorItem object, @Nullable GeoRenderer<LivingArmorItem> renderer) {
//        return ModIdentifiers.LIVING_ARMOR_ITEM.withPrefixedPath("textures/models/armor/").withSuffixedPath("_texture.png");
//    }
//
//    @Override
//    public Identifier getAnimationResource(LivingArmorItem animatable) {
//        return ModIdentifiers.LIVING_ARMOR_ITEM.withPrefixedPath("animations/").withSuffixedPath(".animation.json");
//    }
//
//    // Old methods marked for removal. added for compatibility
//    @SuppressWarnings("removal")
//    @Override
//    public Identifier getTextureResource(LivingArmorItem animatable) {
//        return getTextureResource(animatable, null);
//    }

    @Override
    protected String subtype() {
        return "armor";
    }
//
//    // Old methods marked for removal. added for compatibility
//    @SuppressWarnings("removal")
//    @Override
//    public Identifier getModelResource(LivingArmorItem animatable) {
//        return getModelResource(animatable, null);
//    }
}
