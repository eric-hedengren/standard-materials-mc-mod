package com.baconbombing.standardmaterials.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class BlockBase extends Block {
	public BlockBase() {
		super(Block.Properties.create(Material.ROCK, MaterialColor.STONE));
	}
}