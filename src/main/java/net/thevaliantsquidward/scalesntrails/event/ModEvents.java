package net.thevaliantsquidward.scalesntrails.event;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.thevaliantsquidward.scalesntrails.ScalesNTrails;
import net.thevaliantsquidward.scalesntrails.entity.ModEntities;
import net.thevaliantsquidward.scalesntrails.entity.custom.BasaliskEntity;
import net.thevaliantsquidward.scalesntrails.entity.custom.LeafTailedGeckoEntity;
import net.thevaliantsquidward.scalesntrails.entity.custom.VineSnakeEntity;

@Mod.EventBusSubscriber(modid = ScalesNTrails.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {

    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntities.LEAF_TAILED_GECKO.get(), LeafTailedGeckoEntity.setAttributes());
        event.put(ModEntities.VINE_SNAKE.get(), VineSnakeEntity.setAttributes());
        event.put(ModEntities.BASALISK_LIZARD.get(), BasaliskEntity.setAttributes());
    }


}
