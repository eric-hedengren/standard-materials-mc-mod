package com.baconbombing.standardmaterials;

import com.baconbombing.standardmaterials.blocks.ModBlocks;
import com.baconbombing.standardmaterials.items.ModItems;
import com.baconbombing.standardmaterials.loot.ModLoot;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod("standardmaterials")
public class StandardMaterials
{
	public static final String MOD_ID = "standardmaterials";
    public static StandardMaterials instance;
    
    public StandardMaterials() {
        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(new ModLoot());
        ModItems.init();
        ModBlocks.init();
    }
}