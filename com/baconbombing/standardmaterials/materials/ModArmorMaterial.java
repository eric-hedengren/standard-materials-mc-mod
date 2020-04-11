package com.baconbombing.standardmaterials.materials;

import java.util.function.Supplier;

import com.baconbombing.standardmaterials.StandardMaterials;
import com.baconbombing.standardmaterials.items.ModItems;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public enum ModArmorMaterial implements IArmorMaterial {
   OBSIDIAN("obsidian", 30, new int[]{2, 5, 6, 2}, 14, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1.0F, () -> {
      return Ingredient.fromItems(ModItems.OBSIDIAN_GEM.get());
   }),
   EMERALD("emerald", 14, new int[]{2, 6, 7, 2}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F, () -> {
	  return Ingredient.fromItems(Items.EMERALD);
   });

   private static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};
   private final String name;
   private final int maxDamageFactor;
   private final int[] damageReductionAmountArray;
   private final int enchantability;
   private final SoundEvent soundEvent;
   private final float toughness;
   private final LazyValue<Ingredient> repairMaterial;

   private ModArmorMaterial(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountsIn, int enchantabilityIn, SoundEvent equipSoundIn, float p_i48533_8_, Supplier<Ingredient> repairMaterialSupplier) {
      this.name = nameIn;
      this.maxDamageFactor = maxDamageFactorIn;
      this.damageReductionAmountArray = damageReductionAmountsIn;
      this.enchantability = enchantabilityIn;
      this.soundEvent = equipSoundIn;
      this.toughness = p_i48533_8_;
      this.repairMaterial = new LazyValue<>(repairMaterialSupplier);
   }

   public int getDurability(EquipmentSlotType slotIn) {
      return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
   }

   public int getDamageReductionAmount(EquipmentSlotType slotIn) {
      return this.damageReductionAmountArray[slotIn.getIndex()];
   }

   public int getEnchantability() {
      return this.enchantability;
   }

   public SoundEvent getSoundEvent() {
      return this.soundEvent;
   }

   public Ingredient getRepairMaterial() {
      return this.repairMaterial.getValue();
   }

   @OnlyIn(Dist.CLIENT)
   public String getName() {
      return StandardMaterials.MOD_ID + ":" + this.name;
   }

   public float getToughness() {
      return this.toughness;
   }
}