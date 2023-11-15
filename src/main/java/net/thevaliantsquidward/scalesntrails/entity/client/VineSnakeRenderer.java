package net.thevaliantsquidward.scalesntrails.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.thevaliantsquidward.scalesntrails.ScalesNTrails;
import net.thevaliantsquidward.scalesntrails.entity.custom.VineSnakeEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class VineSnakeRenderer extends GeoEntityRenderer<VineSnakeEntity> {
    public VineSnakeRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new VineSnakeModel());
    }

    private static final ResourceLocation TEXTURE_VINE2 = new ResourceLocation(ScalesNTrails.MOD_ID, "textures/entity/vine_snake_2.png");
    private static final ResourceLocation TEXTURE_VINE = new ResourceLocation(ScalesNTrails.MOD_ID, "textures/entity/vine_snake.png");
    private static final ResourceLocation TEXTURE_BINE = new ResourceLocation(ScalesNTrails.MOD_ID, "textures/entity/bine_snake.png");

    @Override
    public void render(VineSnakeEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }

    public ResourceLocation getTextureLocation(VineSnakeEntity entity) {
        return switch (entity.getVariant()) {
            case 1 -> TEXTURE_VINE;
            case 2 -> TEXTURE_BINE;
            default -> TEXTURE_VINE2;
        };
    }
}