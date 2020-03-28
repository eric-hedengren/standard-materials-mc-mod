package com.baconbombingdeveloper.baconbombingmod.item;

import com.baconbombingdeveloper.baconbombingmod.BaconBombingMod;
import com.baconbombingdeveloper.baconbombingmod.material.NewItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegister {

	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, BaconBombingMod.MOD_ID);
	
	public static void init() {
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
	// Items
	public static final RegistryObject<Item> OBSIDIAN_SWORD = ITEMS.register("obsidian_sword", () -> new SwordItem(NewItemTier.OBSIDIAN, 3, -2.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
	public static final RegistryObject<Item> OBSIDIAN_PICKAXE = ITEMS.register("obsidian_pickaxe", () -> new PickaxeItem(NewItemTier.OBSIDIAN, 1, -2.8F, (new Item.Properties()).group(ItemGroup.TOOLS)));
	public static final RegistryObject<Item> OBSIDIAN_GEM = ITEMS.register("obsidian_gem", ItemBase::new);
}