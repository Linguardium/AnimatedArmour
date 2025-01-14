package com.clarkster.animated_armor;

import io.github.apace100.apoli.power.PowerType;
import io.github.apace100.apoli.power.PowerTypeReference;
import net.minecraft.util.Identifier;

import static com.clarkster.animated_armor.AnimatedArmorMod.MOD_ID;

public class ModIdentifiers {
    public static final Identifier LIVING_ARMOR_ORIGIN = id("animated_armor");
    public static final Identifier LIVING_ARMOR_ITEM = id("living_armor");

    public static final PowerType<?> POWER_CONSTRUCT = new PowerTypeReference<>(id("construct"));
    public static final PowerType<?> POWER_DECOY = new PowerTypeReference<>(id("decoy"));
    public static final PowerType<?> POWER_DEFLECTIVE_PLATING = new PowerTypeReference<>(id("deflective_plating"));
    public static final PowerType<?> POWER_FIXED_ARMOR = new PowerTypeReference<>(id("fixed_armor"));
    public static final PowerType<?> POWER_FROST_WARD = new PowerTypeReference<>(id("freeze_immune"));
    public static final PowerType<?> POWER_ANTIMAGIC_WARD = new PowerTypeReference<>(id("immune"));
    public static final PowerType<?> POWER_IMMOBILE_JOINTS =new PowerTypeReference<>(id("no_shields"));
    public static final PowerType<?> POWER_NO_STOMACH = new PowerTypeReference<>(id("prevent_food"));
    public static final PowerType<?> POWER_METALLURGY = new PowerTypeReference<>(id("repair"));
    public static final PowerType<?> POWER_RESTLESS = new PowerTypeReference<>(id("restless"));
    public static final PowerType<?> POWER_HEAVY_METAL = new PowerTypeReference<>(id("sink"));
    public static final PowerType<?> POWER_DISEMBODIED = new PowerTypeReference<>(id("slow"));
    public static final PowerType<?> POWER_STEEL_CONSTITUTION = new PowerTypeReference<>(id("steel_constitution"));

    public static final Identifier BADGE_REPAIR = id("repair");
    public static final Identifier BADGE_ARMOR_BREAK = id("armor_break");
    public static final Identifier BADGE_NEARSIGHTED = id("nearsighted");
    public static final Identifier BADGE_WEAKENED = id("weakened");
    public static final Identifier BADGE_CRIPPLED = id("crippled");


    public static Identifier id(String path) {
        return Identifier.of(MOD_ID, path);
    }
}
