package com.baconbombingdeveloper.baconbombingmod.util;

import com.baconbombingdeveloper.baconbombingmod.BaconBombingMod;
import com.baconbombingdeveloper.baconbombingmod.item.ItemBase;
//import com.baconbombingdeveloper.baconbombingmod.item.NewItemTier;
import net.minecraft.item.ItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, BaconBombingMod.MOD_ID);
	//public static final DeferredRegister<>
	
	public static void init() {
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
	// Items
	public static final RegistryObject<Item> OBSIDIAN_SWORD = ITEMS.register("obsidian_sword", () -> new SwordItem(ItemTier.DIAMOND, 3, -2.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
	public static final RegistryObject<Item> OBSIDIAN_GEM = ITEMS.register( "obsidian_gem", ItemBase::new);
}