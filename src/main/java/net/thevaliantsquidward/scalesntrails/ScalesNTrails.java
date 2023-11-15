package net.thevaliantsquidward.scalesntrails;

import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.thevaliantsquidward.scalesntrails.block.ModBlocks;
import net.thevaliantsquidward.scalesntrails.entity.ModEntities;
import net.thevaliantsquidward.scalesntrails.entity.client.BasaliskRenderer;
import net.thevaliantsquidward.scalesntrails.entity.client.LeafTailedGeckoRenderer;
import net.thevaliantsquidward.scalesntrails.entity.client.VineSnakeRenderer;
import net.thevaliantsquidward.scalesntrails.item.ModCreativeModeTabs;
import net.thevaliantsquidward.scalesntrails.item.ModItems;
import net.thevaliantsquidward.scalesntrails.painting.ModPaintings;
import org.slf4j.Logger;
import software.bernie.geckolib.GeckoLib;

@Mod(ScalesNTrails.MOD_ID)
public class ScalesNTrails
{
    public static final String MOD_ID = "scalesntrails";
    private static final Logger LOGGER = LogUtils.getLogger();
    public ScalesNTrails()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);

        ModEntities.register(modEventBus);

        ModItems.register(modEventBus);

        ModPaintings.register(modEventBus);

        ModCreativeModeTabs.register(modEventBus);

        ModBlocks.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);

        GeckoLib.initialize();
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }


    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

        @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            EntityRenderers.register
                    (ModEntities.LEAF_TAILED_GECKO.get(), LeafTailedGeckoRenderer:: new);
            EntityRenderers.register
                    (ModEntities.VINE_SNAKE.get(), VineSnakeRenderer:: new);
            EntityRenderers.register
                    (ModEntities.BASALISK_LIZARD.get(), BasaliskRenderer:: new);
        }
    }
}
