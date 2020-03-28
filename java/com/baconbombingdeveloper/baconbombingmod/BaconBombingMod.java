package com.baconbombingdeveloper.baconbombingmod;

import com.baconbombingdeveloper.baconbombingmod.item.ItemRegister;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
/*
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
*/

@Mod("baconbombingmod")
public class BaconBombingMod
{
	public static final String MOD_ID = "baconbombingmod";
    public static BaconBombingMod instance;
    //private static final Logger LOGGER = LogManager.getLogger();
    
    public BaconBombingMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        
        instance = this;
        
        ItemRegister.init();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {}

    private void doClientStuff(final FMLClientSetupEvent event) {}
}