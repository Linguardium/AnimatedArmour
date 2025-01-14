package com.clarkster.animated_armor.entity.client.armor;

import com.clarkster.animated_armor.ModIdentifiers;
import com.clarkster.animated_armor.item.custom.LivingArmorItem;
import software.bernie.geckolib.model.DefaultedGeoModel;


public class LivingArmorModel extends DefaultedGeoModel<LivingArmorItem> {
    public LivingArmorModel() {
        super(ModIdentifiers.LIVING_ARMOR_ITEM);
    }

    @Override
    protected String subtype() {
        return "armor";
    }

}
