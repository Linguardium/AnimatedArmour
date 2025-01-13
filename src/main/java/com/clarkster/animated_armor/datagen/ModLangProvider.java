package com.clarkster.animated_armor.datagen;

import com.clarkster.animated_armor.ModIdentifiers;
import com.clarkster.animated_armor.item.ModItems;
import io.github.apace100.apoli.power.Active;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.util.Identifier;

import java.util.function.BiFunction;

public class ModLangProvider extends FabricLanguageProvider {
    public ModLangProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        OriginTranslationsBuilder originTranslationsBuilder = new OriginTranslationsBuilder(translationBuilder);
        translationBuilder.add(ModItems.LIVING_BOOTS,"Living Boots");
        translationBuilder.add(ModItems.LIVING_CHESTPLATE,"Living Chestplate");
        translationBuilder.add(ModItems.LIVING_LEGGINGS,"Living Leggings");
        translationBuilder.add(ModItems.LIVING_HELMET,"Living Helmet");

        originTranslationsBuilder.addOriginTranslation(ModIdentifiers.LIVING_ARMOR_ORIGIN, "Animated Armor", "A sentient suit of magically animated armor, brought to life by unknown arcane enchantments.");
        originTranslationsBuilder.addPowerTranslation(ModIdentifiers.POWER_CONSTRUCT, "Construct", "Your body doesn't experience hunger, and you don't benefit from natural regeneration.");
        originTranslationsBuilder.addPowerTranslation(ModIdentifiers.POWER_DECOY, "Decoy","Become an immobile suit of armor. Mobs will not target you in this state.");
        originTranslationsBuilder.addPowerTranslation(ModIdentifiers.POWER_DEFLECTIVE_PLATING, "Deflective Plating", "You take no damage from regular arrows while your armor is fully intact.");
        originTranslationsBuilder.addPowerTranslation(ModIdentifiers.POWER_FIXED_ARMOR, "Living Armor","You inhabit a suit of armor. You cannot equip other armors or remove your armor.");
        originTranslationsBuilder.addPowerTranslation(ModIdentifiers.POWER_FROST_WARD, "Frost Ward","You are immune to freeze damage.");
        originTranslationsBuilder.addPowerTranslation(ModIdentifiers.POWER_ANTIMAGIC_WARD, "Antimagic Ward","You are immune to all potion and status effects.");
        originTranslationsBuilder.addPowerTranslation(ModIdentifiers.POWER_IMMOBILE_JOINTS, "Immobile Joints","Your form is too rigid to use a shield effectively.");
        originTranslationsBuilder.addPowerTranslation(ModIdentifiers.POWER_NO_STOMACH, "No Stomach","You cannot eat food.");
        originTranslationsBuilder.addPowerTranslation(ModIdentifiers.POWER_METALLURGY, "Metallurgy", "Your body cannot be naturally or magically mended. You instead repair by consuming Iron Ingots.");
        originTranslationsBuilder.addPowerTranslation(ModIdentifiers.POWER_RESTLESS, "Restless","You cannot sleep.");
        originTranslationsBuilder.addPowerTranslation(ModIdentifiers.POWER_HEAVY_METAL, "Heavy Metal","Your dense body weighs you down in water, but also renders you immune to knockback. You don't need to breathe in water as you have no lungs.");
        originTranslationsBuilder.addPowerTranslation(ModIdentifiers.POWER_DISEMBODIED, "Disembodied", "Your lack of limbs causes you to move 20% slower than a human. However, you have greater effective reach while your chestplate is intact.");
        originTranslationsBuilder.addPowerTranslation(ModIdentifiers.POWER_STEEL_CONSTITUTION, "Steel Constitution", "You do not take health damage. Instead, you have a meter that displays the overall durability of your armour, which can only take one point of damage per attack.");
        originTranslationsBuilder.addBadgeTranslation(ModIdentifiers.BADGE_REPAIR, "Active ability, use with %s while holding a Iron Ingot in your hands.");
        originTranslationsBuilder.addBadgeTranslation(ModIdentifiers.BADGE_NEARSIGHTED, "Losing your Helmet will only render entities close to you.");
        originTranslationsBuilder.addBadgeTranslation(ModIdentifiers.BADGE_ARMOR_BREAK, "For each 25% of durability you lose, a piece of your armor will break. Armor will always break in this order: Head, Chest, Legs, Feet.");
        originTranslationsBuilder.addBadgeTranslation(ModIdentifiers.BADGE_WEAKENED, "Losing your Chestplate will greatly reduce your reach and damage.");
        originTranslationsBuilder.addBadgeTranslation(ModIdentifiers.BADGE_CRIPPLED, "Losing your Leggings gives you a boost in movement speed.");
    }
    static class OriginTranslationsBuilder {
        final TranslationBuilder builder;
        OriginTranslationsBuilder(TranslationBuilder translationBuilder) {
            this.builder = translationBuilder;
        }
        public String getOriginTranslationKey(Identifier id, String type) {
            return "origin." + id.getNamespace() + "." + id.getPath() + "."+type;
        }
        public String getPowerTranslationKey(Identifier id, String type) {
            return "power." + id.getNamespace() + "." + id.getPath() + "."+type;
        }
        public void addBadgeTranslation(Identifier id, String tooltip) {
            builder.add("badge." + id.getNamespace() + "." + id.getPath() + ".tooltip", tooltip);
        }
        private void addPowerTranslation(Identifier id, String name, String description) {
            addNameAndDescriptionTranslation(this::getPowerTranslationKey, id, name, description);
        }
        private void addOriginTranslation(Identifier id, String name, String description) {
            addNameAndDescriptionTranslation(this::getOriginTranslationKey, id, name, description);
        }
        private void addNameAndDescriptionTranslation(BiFunction<Identifier, String, String> translationKeyProvider, Identifier id, String name, String description) {
            this.builder.add(translationKeyProvider.apply(id,"name"), name);
            this.builder.add(translationKeyProvider.apply(id,"description"), description);

        }
    }
}
