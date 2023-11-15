package net.thevaliantsquidward.scalesntrails.entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thevaliantsquidward.scalesntrails.ScalesNTrails;
import net.thevaliantsquidward.scalesntrails.entity.custom.BasaliskEntity;
import net.thevaliantsquidward.scalesntrails.entity.custom.LeafTailedGeckoEntity;
import net.thevaliantsquidward.scalesntrails.entity.custom.VineSnakeEntity;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ScalesNTrails.MOD_ID);

    public static final RegistryObject<EntityType<LeafTailedGeckoEntity>> LEAF_TAILED_GECKO =
            ENTITY_TYPES.register("leaf_tailed_gecko",
                    () -> EntityType.Builder.of(LeafTailedGeckoEntity::new, MobCategory.CREATURE)
                            .sized(1f, 1f)
                            .build(new ResourceLocation(ScalesNTrails.MOD_ID, "leaf_tailed_gecko").toString()));

    public static final RegistryObject<EntityType<VineSnakeEntity>> VINE_SNAKE =
            ENTITY_TYPES.register("vine_snake",
                    () -> EntityType.Builder.of(VineSnakeEntity::new, MobCategory.CREATURE)
                            .sized(1f, 1f)
                            .build(new ResourceLocation(ScalesNTrails.MOD_ID, "vine_snake").toString()));

    public static final RegistryObject<EntityType<BasaliskEntity>> BASALISK_LIZARD =
            ENTITY_TYPES.register("basalisk",
                    () -> EntityType.Builder.of(BasaliskEntity::new, MobCategory.CREATURE)
                            .sized(1f, 1f)
                            .build(new ResourceLocation(ScalesNTrails.MOD_ID, "basalisk").toString()));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}