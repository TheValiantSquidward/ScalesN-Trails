package net.thevaliantsquidward.scalesntrails.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.thevaliantsquidward.scalesntrails.ScalesNTrails;
import net.thevaliantsquidward.scalesntrails.entity.custom.BasaliskEntity;
import net.thevaliantsquidward.scalesntrails.entity.custom.LeafTailedGeckoEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class BasaliskRenderer extends GeoEntityRenderer<BasaliskEntity> {
    public BasaliskRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new BasaliskModel());
    }

    @Override
    public ResourceLocation getTextureLocation(BasaliskEntity animatable) {
        return new ResourceLocation(ScalesNTrails.MOD_ID, "textures/entity/basalisk.png");
    }

    @Override
    public void render(BasaliskEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
