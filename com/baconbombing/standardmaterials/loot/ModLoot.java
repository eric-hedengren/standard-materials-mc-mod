package com.baconbombing.standardmaterials.loot;

import com.baconbombing.standardmaterials.StandardMaterials;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.TableLootEntry;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ModLoot {
	@SubscribeEvent
	public void loadLoot(LootTableLoadEvent event) {
    	String prefix = "minecraft:chests/";
    	String prefix2 = "village/village_";
    	String name = event.getName().toString();
    	if (name.startsWith(prefix)) {
    		if (name.contains(prefix2)) {
				String file2 = name.substring(name.indexOf(prefix2) + prefix2.length());
				switch (file2) {
				case "armorer":
				case "temple":
				case "toolsmith":
				case "weaponsmith": modifyVillageLoot(event, file2); break;
				default: break;
				}
			}
    		String file = name.substring(name.indexOf(prefix) + prefix.length());
    		switch (file) {
    		// Main
    		case "desert_pyramid":
    		case "end_city_treasure":
    		case "jungle_temple":
    		case "nether_bridge":
    		case "shipwreck_treasure":
    		case "stronghold_corridor":
    		case "stronghold_crossing": modifyLoot(event, file, "main"); break;

    		// Pool 1
    		case "abandoned_mineshaft":
    		case "buried_treasure":
    		case "underwater_ruin_big":
    		case "underwater_ruin_small": modifyLoot(event, file, "pool1"); break;

    		// Main and Pool 1
    		case "simple_dungeon":
    		case "woodland_mansion": addLoot(event, file); removeLoot(event, "main"); removeLoot(event, "pool1"); break;
    		default: break;
    		}
    	}
	}
	private void modifyLoot(LootTableLoadEvent event, String jsonFile, String pool) {
		event.getTable().addPool(LootPool.builder().addEntry(TableLootEntry.builder(new ResourceLocation(StandardMaterials.MOD_ID, "inject/chests/" + jsonFile))).build());
		event.getTable().removePool(pool);
	}
	private void modifyVillageLoot(LootTableLoadEvent event, String jsonFile2) {
		event.getTable().addPool(LootPool.builder().addEntry(TableLootEntry.builder(new ResourceLocation(StandardMaterials.MOD_ID, "inject/chests/village/village_" + jsonFile2))).build());
		event.getTable().removePool("main");
	}
	private void addLoot(LootTableLoadEvent event, String jsonFile) {
    	event.getTable().addPool(LootPool.builder().addEntry(TableLootEntry.builder(new ResourceLocation(StandardMaterials.MOD_ID, "inject/chests/" + jsonFile))).build());
    }
	private void removeLoot(LootTableLoadEvent event, String pool) {
		event.getTable().removePool(pool);
	}
}