package com.baconbombing.standardmaterials;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.baconbombing.standardmaterials.blocks.ModBlocks;
import com.baconbombing.standardmaterials.items.ModItems;
import com.baconbombing.standardmaterials.loot.ModLoot;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("standardmaterials")
public class StandardMaterials
{
	public static final String MOD_ID = "standardmaterials";
    public static StandardMaterials instance;
    private static final Logger LOGGER = LogManager.getLogger();
    
    public StandardMaterials() {
    	LOGGER.info("Main Mod Class Running...");
    	instance = this;
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(new ModLoot());
        ModItems.init();
        ModBlocks.init();
    }
    private void setup(final FMLCommonSetupEvent event) {}
    private void doClientStuff(final FMLClientSetupEvent event) {}
}