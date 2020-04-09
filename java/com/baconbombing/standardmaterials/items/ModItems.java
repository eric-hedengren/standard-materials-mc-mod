package com.baconbombing.standardmaterials.items;

import com.baconbombing.standardmaterials.StandardMaterials;
import com.baconbombing.standardmaterials.blocks.ModBlocks;
import com.baconbombing.standardmaterials.materials.ModArmorMaterial;
import com.baconbombing.standardmaterials.materials.ModItemTier;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.HorseArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, StandardMaterials.MOD_ID);
	
	public static void init() {
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
	//Item Variables
	public static Item obsidian_gem;

	// Items
	// Obsidian
	public static final RegistryObject<Item> OBSIDIAN_GEM = ITEMS.register("obsidian_gem", ItemBase::new);
	public static final RegistryObject<Item> OBSIDIAN_SWORD = ITEMS.register("obsidian_sword", ()-> new SwordItem(ModItemTier.OBSIDIAN, 3, -2.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
	public static final RegistryObject<Item> OBSIDIAN_PICKAXE = ITEMS.register("obsidian_pickaxe", ()-> new PickaxeItem(ModItemTier.OBSIDIAN, 1, -2.8F, (new Item.Properties()).group(ItemGroup.TOOLS)));
	public static final RegistryObject<Item> OBSIDIAN_AXE = ITEMS.register("obsidian_axe", ()-> new AxeItem(ModItemTier.OBSIDIAN, 5.0F, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
	public static final RegistryObject<Item> OBSIDIAN_SHOVEL = ITEMS.register("obsidian_shovel", ()-> new ShovelItem(ModItemTier.OBSIDIAN, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
	public static final RegistryObject<Item> OBSIDIAN_HOE = ITEMS.register("obsidian_hoe", ()-> new HoeItem(ModItemTier.OBSIDIAN, 0.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
	public static final RegistryObject<Item> OBSIDIAN_HELMET = ITEMS.register("obsidian_helmet", ()-> new ArmorItem(ModArmorMaterial.OBSIDIAN, EquipmentSlotType.HEAD, (new Item.Properties()).group(ItemGroup.COMBAT)));
	public static final RegistryObject<Item> OBSIDIAN_CHESTPLATE = ITEMS.register("obsidian_chestplate", ()-> new ArmorItem(ModArmorMaterial.OBSIDIAN, EquipmentSlotType.CHEST, (new Item.Properties()).group(ItemGroup.COMBAT)));
	public static final RegistryObject<Item> OBSIDIAN_LEGGINGS = ITEMS.register("obsidian_leggings", ()-> new ArmorItem(ModArmorMaterial.OBSIDIAN, EquipmentSlotType.LEGS, (new Item.Properties()).group(ItemGroup.COMBAT)));
	public static final RegistryObject<Item> OBSIDIAN_BOOTS = ITEMS.register("obsidian_boots", ()-> new ArmorItem(ModArmorMaterial.OBSIDIAN, EquipmentSlotType.FEET, (new Item.Properties()).group(ItemGroup.COMBAT)));
	// Emerald
	public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register("emerald_sword", ()-> new SwordItem(ModItemTier.EMERALD, 3, -2.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
	public static final RegistryObject<Item> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", ()-> new PickaxeItem(ModItemTier.EMERALD, 1, -2.8F, (new Item.Properties()).group(ItemGroup.TOOLS)));
	public static final RegistryObject<Item> EMERALD_AXE = ITEMS.register("emerald_axe", ()-> new AxeItem(ModItemTier.EMERALD, 5.0F, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
	public static final RegistryObject<Item> EMERALD_SHOVEL = ITEMS.register("emerald_shovel", ()-> new ShovelItem(ModItemTier.EMERALD, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
	public static final RegistryObject<Item> EMERALD_HOE = ITEMS.register("emerald_hoe", ()-> new HoeItem(ModItemTier.EMERALD, 0.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
	public static final RegistryObject<Item> EMERALD_HELMET = ITEMS.register("emerald_helmet", ()-> new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.HEAD, (new Item.Properties()).group(ItemGroup.COMBAT)));
	public static final RegistryObject<Item> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate", ()-> new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.CHEST, (new Item.Properties()).group(ItemGroup.COMBAT)));
	public static final RegistryObject<Item> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings", ()-> new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.LEGS, (new Item.Properties()).group(ItemGroup.COMBAT)));
	public static final RegistryObject<Item> EMERALD_BOOTS = ITEMS.register("emerald_boots", ()-> new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.FEET, (new Item.Properties()).group(ItemGroup.COMBAT)));
	public static final RegistryObject<Item> EMERALD_HORSE_ARMOR = ITEMS.register("emerald_horse_armor", ()-> new HorseArmorItem(9, new ResourceLocation("standardmaterials", "textures/entity/horse/armor/horse_armor_emerald.png"), (new Item.Properties()).maxStackSize(1).group(ItemGroup.MISC)));

	// Block Items
	public static final RegistryObject<BlockItem> PURE_OBSIDIAN = ITEMS.register("pure_obsidian", ()-> new BlockItem(ModBlocks.PURE_OBSIDIAN.get(), (new BlockItem.Properties()).group(ItemGroup.BUILDING_BLOCKS)));
}