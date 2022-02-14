package com.xmeisterbaelle.therubymod.tools;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class RubySwordTool implements ToolMaterial {
    public static final RubySwordTool INSTANCE = new RubySwordTool();
    @Override
    public int getDurability() {
        return 10;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 1;
    }

    @Override
    public float getAttackDamage() {
        return 0;
    }

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 10;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}
