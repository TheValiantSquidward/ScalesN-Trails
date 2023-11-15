package net.thevaliantsquidward.scalesntrails.entity.client;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.thevaliantsquidward.scalesntrails.ScalesNTrails;
import net.thevaliantsquidward.scalesntrails.entity.custom.LeafTailedGeckoEntity;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoRenderer;
import software.bernie.geckolib.renderer.layer.GeoRenderLayer;
public class LeafTailedGeckoEyesLayer extends GeoRenderLayer<LeafTailedGeckoEntity> {
    private static final ResourceLocation OVERLAY = new ResourceLocation(ScalesNTrails.MOD_ID, "textures/entity/leafgeckoglowingeyes_glowmask.png");
    private static final ResourceLocation MODEL = new ResourceLocation(ScalesNTrails.MOD_ID, "geo/leafgecko.geo.json");
    public LeafTailedGeckoEyesLayer(GeoRenderer<LeafTailedGeckoEntity> entityRendererIn) {
        super(entityRendererIn);

    }

   public void render(PoseStack poseStack, LeafTailedGeckoEntity entityLivingBaseIn, BakedGeoModel bakedModel, RenderType renderType, MultiBufferSource bufferSource, VertexConsumer buffer, float partialTick, int packedLight, int packedOverlay) {
        long roundedTime = entityLivingBaseIn.level().getDayTime() % 24000;
        boolean night = roundedTime >= 13000 && roundedTime <= 22000;
        if (night) {
            RenderType cameo = RenderType.eyes(OVERLAY);
            getRenderer().reRender(this.getGeoModel().getBakedModel(MODEL), poseStack, bufferSource, entityLivingBaseIn, renderType,
                   bufferSource.getBuffer(cameo), partialTick, packedLight, OverlayTexture.NO_OVERLAY,
                    1, 1, 1, 1);
       }
    }


}
