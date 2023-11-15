package net.thevaliantsquidward.scalesntrails.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.thevaliantsquidward.scalesntrails.ScalesNTrails;
import net.thevaliantsquidward.scalesntrails.entity.custom.LeafTailedGeckoEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class LeafTailedGeckoRenderer extends GeoEntityRenderer<LeafTailedGeckoEntity> {
    public LeafTailedGeckoRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new LeafTailedGeckoModel());
        this.addRenderLayer(new LeafTailedGeckoEyesLayer(this));
        //this.addRenderLayer(new AutoGlowingGeoLayer<LeafTailedGeckoEntity>(this));
    }

    @Override
    public ResourceLocation getTextureLocation(LeafTailedGeckoEntity animatable) {
        return new ResourceLocation(ScalesNTrails.MOD_ID, "textures/entity/leafgecko.png");
    }

    @Override
    public void render(LeafTailedGeckoEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}