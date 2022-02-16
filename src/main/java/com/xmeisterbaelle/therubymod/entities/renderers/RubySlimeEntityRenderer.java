package com.xmeisterbaelle.therubymod.entities.renderers;

import com.xmeisterbaelle.therubymod.Therubymod;
import com.xmeisterbaelle.therubymod.client.TherubymodClient;
import com.xmeisterbaelle.therubymod.entities.RubySlimeEntity;
import com.xmeisterbaelle.therubymod.entities.models.RubySlimeEntityModel;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class RubySlimeEntityRenderer extends MobEntityRenderer<RubySlimeEntity, RubySlimeEntityModel> {

    public RubySlimeEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new RubySlimeEntityModel(context.getPart(TherubymodClient.MODEL_RUBY_SLIME_LAYER)), 0.5f);
    }

    @Override
    public Identifier getTexture(RubySlimeEntity entity) {
        return new Identifier("therubymod", "textures/entity/ruby/ruby_slime.png");
    }
}
