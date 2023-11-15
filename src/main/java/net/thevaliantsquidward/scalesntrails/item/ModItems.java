package net.thevaliantsquidward.scalesntrails.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thevaliantsquidward.scalesntrails.ScalesNTrails;
import net.thevaliantsquidward.scalesntrails.entity.ModEntities;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ScalesNTrails.MOD_ID);

    public static final RegistryObject<Item> LEAF_GECKO_SPAWN_EGG = ITEMS.register("leaf_gecko_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.LEAF_TAILED_GECKO, 0x5e432d, 0x332d28, new Item.Properties()));

    public static final RegistryObject<Item> VINE_SNAKE_SPAWN_EGG = ITEMS.register("vine_snake_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.VINE_SNAKE, 0x82a949, 0x48623e, new Item.Properties()));

    public static final RegistryObject<Item> BASALISK_LIZARD_SPAWN_EGG = ITEMS.register("basalisk_lizard_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.BASALISK_LIZARD, 0x3f8153, 0x3c5e6d, new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
