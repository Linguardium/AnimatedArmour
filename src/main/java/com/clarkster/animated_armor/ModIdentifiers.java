package com.clarkster.animated_armor;

import net.minecraft.util.Identifier;

import static com.clarkster.animated_armor.AnimatedArmorMod.MOD_ID;

public class ModIdentifiers {
    public static final Identifier LIVING_ARMOR_ORIGIN = id("animated_armor");
    public static final Identifier LIVING_ARMOR_ITEM = id("living_armor");
    public static final Identifier POWER_CONSTRUCT = id("construct");
    public static final Identifier POWER_DECOY = id("decoy");
    public static final Identifier POWER_DEFLECTIVE_PLATING = id("deflective_plating");
    public static final Identifier POWER_FIXED_ARMOR = id("fixed_armor");
    public static final Identifier POWER_FROST_WARD = id("freeze_immune");
    public static final Identifier POWER_ANTIMAGIC_WARD = id("immune");
    public static final Identifier POWER_IMMOBILE_JOINTS = id("no_shields");
    public static final Identifier POWER_NO_STOMACH = id("prevent_food");
    public static final Identifier POWER_METALLURGY = id("repair");
    public static final Identifier POWER_RESTLESS = id("restless");
    public static final Identifier POWER_HEAVY_METAL = id("sink");
    public static final Identifier POWER_DISEMBODIED = id("slow");
    public static final Identifier POWER_STEEL_CONSTITUTION = id("steel_constitution");

    public static final Identifier BADGE_REPAIR = id("repair");
    public static final Identifier BADGE_ARMOR_BREAK = id("armor_break");
    public static final Identifier BADGE_NEARSIGHTED = id("nearsighted");
    public static final Identifier BADGE_WEAKENED = id("weakened");
    public static final Identifier BADGE_CRIPPLED = id("crippled");


    public static Identifier id(String path) {
        return Identifier.of(MOD_ID, path);
    }
}
