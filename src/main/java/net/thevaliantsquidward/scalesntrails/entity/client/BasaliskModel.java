package net.thevaliantsquidward.scalesntrails.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.thevaliantsquidward.scalesntrails.ScalesNTrails;
import net.thevaliantsquidward.scalesntrails.entity.custom.BasaliskEntity;
import net.thevaliantsquidward.scalesntrails.entity.custom.LeafTailedGeckoEntity;
import net.thevaliantsquidward.scalesntrails.entity.custom.VineSnakeEntity;
import software.bernie.geckolib.model.GeoModel;

public class BasaliskModel extends GeoModel<BasaliskEntity> {
    @Override
    public ResourceLocation getModelResource(BasaliskEntity animatable) {
        return new ResourceLocation(ScalesNTrails.MOD_ID, "geo/basalisk.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BasaliskEntity animatable) {
        return new ResourceLocation(ScalesNTrails.MOD_ID, "textures/entity/basalisk.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BasaliskEntity animatable) {
        return new ResourceLocation(ScalesNTrails.MOD_ID, "animations/basalisk.animation.json");
    }


}
