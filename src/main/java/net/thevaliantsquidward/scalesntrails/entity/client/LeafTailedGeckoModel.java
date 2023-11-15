package net.thevaliantsquidward.scalesntrails.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.thevaliantsquidward.scalesntrails.ScalesNTrails;
import net.thevaliantsquidward.scalesntrails.entity.custom.LeafTailedGeckoEntity;
import software.bernie.geckolib.model.GeoModel;

public class LeafTailedGeckoModel extends GeoModel<LeafTailedGeckoEntity> {
    @Override
    public ResourceLocation getModelResource(LeafTailedGeckoEntity animatable) {
        return new ResourceLocation(ScalesNTrails.MOD_ID, "geo/leafgecko.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(LeafTailedGeckoEntity animatable) {
        return new ResourceLocation(ScalesNTrails.MOD_ID, "textures/entity/leafgecko.png");
    }

    @Override
    public ResourceLocation getAnimationResource(LeafTailedGeckoEntity animatable) {
        return new ResourceLocation(ScalesNTrails.MOD_ID, "animations/leafgecko.animation.json");
    }


}
