package com.xmeisterbaelle.therubymod;

import com.xmeisterbaelle.therubymod.armor.RubyArmorMaterial;
import com.xmeisterbaelle.therubymod.entities.RubySlimeEntity;
import com.xmeisterbaelle.therubymod.tools.RubySwordTool;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Therubymod implements ModInitializer {
    public static ToolItem RUBY_SWORD = new SwordItem(RubySwordTool.INSTANCE, 5, 96f, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Block RUBY_ORE = new Block(FabricBlockSettings.of(Material.METAL).strength(3.5f, 3.0f)); // TODO: Faster Mining with Pickaxe & Efficiency
    public static final Item RUBY = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    public static final EntityType<RubySlimeEntity> RUBY_SLIME = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier("therubymod", "ruby_slime"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, RubySlimeEntity::new).dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build()
    );
    public static final ArmorMaterial RUBY_ARMOR_MATERIAL = new RubyArmorMaterial();
    public static final Item RUBY_HELMET = new ArmorItem(RUBY_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item RUBY_CHESTPLATE = new ArmorItem(RUBY_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item RUBY_LEGGINGS = new ArmorItem(RUBY_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item RUBY_BOOTS = new ArmorItem(RUBY_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("therubymod", "ruby_sword"), RUBY_SWORD);
        Registry.register(Registry.BLOCK, new Identifier("therubymod", "ruby_ore"), RUBY_ORE);
        Registry.register(Registry.ITEM, new Identifier("therubymod", "ruby_ore"), new BlockItem(RUBY_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("therubymod", "ruby"), RUBY);
        FabricDefaultAttributeRegistry.register(RUBY_SLIME, RubySlimeEntity.createMobAttributes());
        Registry.register(Registry.ITEM, new Identifier("therubymod", "ruby_helmet"), RUBY_HELMET);
        Registry.register(Registry.ITEM, new Identifier("therubymod", "ruby_chestplate"), RUBY_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("therubymod", "ruby_leggings"), RUBY_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("therubymod", "ruby_boots"), RUBY_BOOTS);
    }
}