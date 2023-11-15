package net.thevaliantsquidward.scalesntrails.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.thevaliantsquidward.scalesntrails.ScalesNTrails;
import net.thevaliantsquidward.scalesntrails.entity.custom.EntityLeafTailedGecko;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class LeafTailedGeckoModel extends GeoModel<EntityLeafTailedGecko> {
    @Override
    public ResourceLocation getModelResource(EntityLeafTailedGecko animatable) {
        return new ResourceLocation(ScalesNTrails.MOD_ID, "geo/leafgecko.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(EntityLeafTailedGecko animatable) {
        return new ResourceLocation(ScalesNTrails.MOD_ID, "textures/entity/leafgecko.png");
    }

    @Override
    public ResourceLocation getAnimationResource(EntityLeafTailedGecko animatable) {
        return new ResourceLocation(ScalesNTrails.MOD_ID, "animations/leafgecko.animation.json");
    }


}
