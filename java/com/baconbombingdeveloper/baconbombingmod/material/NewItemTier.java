package com.baconbombingdeveloper.baconbombingmod.material;

import java.util.function.Supplier;
import com.baconbombingdeveloper.baconbombingmod.items.ItemRegister;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public enum NewItemTier implements IItemTier {
   OBSIDIAN(3, 2000, 5.0F, 2.0F, 15, () -> {
      return Ingredient.fromItems(ItemRegister.obsidian_gem);
   }),
   EMERALD(2, 500, 7.0F, 3.0F, 20, () -> {
	  return Ingredient.fromItems(Items.EMERALD);
   });
	
   private final int harvestLevel;
   private final int maxUses;
   private final float efficiency;
   private final float attackDamage;
   private final int enchantability;
   private final LazyValue<Ingredient> repairMaterial;

   private NewItemTier(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn, Supplier<Ingredient> repairMaterialIn) {
      this.harvestLevel = harvestLevelIn;
      this.maxUses = maxUsesIn;
      this.efficiency = efficiencyIn;
      this.attackDamage = attackDamageIn;
      this.enchantability = enchantabilityIn;
      this.repairMaterial = new LazyValue<>(repairMaterialIn);
   }

   public int getMaxUses() {
      return this.maxUses;
   }

   public float getEfficiency() {
      return this.efficiency;
   }

   public float getAttackDamage() {
      return this.attackDamage;
   }

   public int getHarvestLevel() {
      return this.harvestLevel;
   }

   public int getEnchantability() {
	   return this.enchantability;
   }
   
   public Ingredient getRepairMaterial() {
      return this.repairMaterial.getValue();
   }
}