package net.thevaliantsquidward.scalesntrails.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.thevaliantsquidward.scalesntrails.ScalesNTrails;
import net.thevaliantsquidward.scalesntrails.entity.custom.EntityVineSnake;
import software.bernie.geckolib.model.GeoModel;

public class VineSnakeModel extends GeoModel<EntityVineSnake> {
    @Override
    public ResourceLocation getModelResource(EntityVineSnake animatable) {
        return new ResourceLocation(ScalesNTrails.MOD_ID, "geo/vinesnake.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(EntityVineSnake animatable) {
        return new ResourceLocation(ScalesNTrails.MOD_ID, "textures/entity/vine_snake_2.png");
    }

    @Override
    public ResourceLocation getAnimationResource(EntityVineSnake animatable) {
        return new ResourceLocation(ScalesNTrails.MOD_ID, "animations/vinesnake.animation.json");
    }


}
