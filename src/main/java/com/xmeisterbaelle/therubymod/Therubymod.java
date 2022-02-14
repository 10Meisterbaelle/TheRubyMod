package com.xmeisterbaelle.therubymod;

import com.xmeisterbaelle.therubymod.items.RubySwordItem;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Therubymod implements ModInitializer {
    public static final RubySwordItem RUBY_SWORD = new RubySwordItem(new FabricItemSettings().group(ItemGroup.COMBAT));

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("therubymod", "ruby_sword"), RUBY_SWORD);
    }
}