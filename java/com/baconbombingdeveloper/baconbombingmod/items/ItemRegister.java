package com.baconbombingdeveloper.baconbombingmod.items;

import com.baconbombingdeveloper.baconbombingmod.BaconBombingMod;
import com.baconbombingdeveloper.baconbombingmod.material.NewItemTier;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
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
	// Obsidian
	public static final RegistryObject<Item> OBSIDIAN_GEM = ITEMS.register("obsidian_gem", ItemBase::new);
	public static final RegistryObject<Item> OBSIDIAN_SWORD = ITEMS.register("obsidian_sword", ()-> new SwordItem(NewItemTier.OBSIDIAN, 3, -2.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
	public static final RegistryObject<Item> OBSIDIAN_PICKAXE = ITEMS.register("obsidian_pickaxe", ()-> new PickaxeItem(NewItemTier.OBSIDIAN, 1, -2.8F, (new Item.Properties()).group(ItemGroup.TOOLS)));
	public static final RegistryObject<Item> OBSIDIAN_AXE = ITEMS.register("obsidian_axe", ()-> new AxeItem(NewItemTier.OBSIDIAN, 5.0F, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
	public static final RegistryObject<Item> OBSIDIAN_SHOVEL = ITEMS.register("obsidian_shovel", ()-> new ShovelItem(NewItemTier.OBSIDIAN, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
	public static final RegistryObject<Item> OBSIDIAN_HOE = ITEMS.register("obsidian_hoe", ()-> new HoeItem(NewItemTier.OBSIDIAN, 0.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
	// Emerald
	public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register("emerald_sword", ()-> new SwordItem(NewItemTier.EMERALD, 3, -2.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
	public static final RegistryObject<Item> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", ()-> new PickaxeItem(NewItemTier.EMERALD, 1, -2.8F, (new Item.Properties()).group(ItemGroup.TOOLS)));
	public static final RegistryObject<Item> EMERALD_AXE = ITEMS.register("emerald_axe", ()-> new AxeItem(NewItemTier.EMERALD, 5.0F, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
	public static final RegistryObject<Item> EMERALD_SHOVEL = ITEMS.register("emerald_shovel", ()-> new ShovelItem(NewItemTier.EMERALD, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
	public static final RegistryObject<Item> EMERALD_HOE = ITEMS.register("emerald_hoe", ()-> new HoeItem(NewItemTier.EMERALD, 0.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
}