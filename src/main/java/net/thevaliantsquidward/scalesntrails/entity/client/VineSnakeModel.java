package net.thevaliantsquidward.scalesntrails.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.thevaliantsquidward.scalesntrails.ScalesNTrails;
import net.thevaliantsquidward.scalesntrails.entity.custom.VineSnakeEntity;
import software.bernie.geckolib.model.GeoModel;

public class VineSnakeModel extends GeoModel<VineSnakeEntity> {
    @Override
    public ResourceLocation getModelResource(VineSnakeEntity animatable) {
        return new ResourceLocation(ScalesNTrails.MOD_ID, "geo/vinesnake.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(VineSnakeEntity animatable) {
        return new ResourceLocation(ScalesNTrails.MOD_ID, "textures/entity/vine_snake_2.png");
    }

    @Override
    public ResourceLocation getAnimationResource(VineSnakeEntity animatable) {
        return new ResourceLocation(ScalesNTrails.MOD_ID, "animations/vinesnake.animation.json");
    }


}
