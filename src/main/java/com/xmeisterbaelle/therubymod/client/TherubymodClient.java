package com.xmeisterbaelle.therubymod.client;

import com.xmeisterbaelle.therubymod.Therubymod;
import com.xmeisterbaelle.therubymod.entities.models.RubySlimeEntityModel;
import com.xmeisterbaelle.therubymod.entities.renderers.RubySlimeEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class TherubymodClient implements ClientModInitializer {
    public static final EntityModelLayer MODEL_RUBY_SLIME_LAYER = new EntityModelLayer(new Identifier("therubymod", "ruby_slime"), "main");

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(Therubymod.RUBY_SLIME, (context) -> {
            return new RubySlimeEntityRenderer(context);
        });

        EntityModelLayerRegistry.registerModelLayer(MODEL_RUBY_SLIME_LAYER, RubySlimeEntityModel::getTexturedModelData);
    }
}
