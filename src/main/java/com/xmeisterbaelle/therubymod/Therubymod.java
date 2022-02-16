package com.xmeisterbaelle.therubymod;

import com.xmeisterbaelle.therubymod.tools.RubySwordTool;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Therubymod implements ModInitializer {
    public static ToolItem RUBY_SWORD = new SwordItem(RubySwordTool.INSTANCE, 5, 96f, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Block RUBY_ORE = new Block(FabricBlockSettings.of(Material.METAL).strength(3.5f)); // TODO: Faster Mining with Pickaxe & Efficiency
    public static final Item RUBY = new Item(new FabricItemSettings().group(ItemGroup.MISC));

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("therubymod", "ruby_sword"), RUBY_SWORD);
        Registry.register(Registry.BLOCK, new Identifier("therubymod", "ruby_ore"), RUBY_ORE);
        Registry.register(Registry.ITEM, new Identifier("therubymod", "ruby_ore"), new BlockItem(RUBY_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("therubymod", "ruby"), RUBY);
    }
}