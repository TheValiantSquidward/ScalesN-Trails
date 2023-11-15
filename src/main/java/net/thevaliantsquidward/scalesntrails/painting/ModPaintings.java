package net.thevaliantsquidward.scalesntrails.painting;

import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thevaliantsquidward.scalesntrails.ScalesNTrails;

public class ModPaintings {
    public static final DeferredRegister<PaintingVariant> PAINTING_VARIANTS =
            DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, ScalesNTrails.MOD_ID);

    public static final RegistryObject<PaintingVariant> LEAF_GECKO_PAINTING = PAINTING_VARIANTS.register("leaf_gecko",
            () -> new PaintingVariant(32, 32));

    public static void register (IEventBus eventBus) {
        PAINTING_VARIANTS.register(eventBus);
    }
}
