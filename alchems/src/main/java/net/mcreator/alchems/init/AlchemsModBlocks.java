
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.alchems.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.alchems.block.NovoglyphBlock;
import net.mcreator.alchems.block.CinnabarBlock;
import net.mcreator.alchems.AlchemsMod;

public class AlchemsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AlchemsMod.MODID);
	public static final RegistryObject<Block> CINNABAR = REGISTRY.register("cinnabar", () -> new CinnabarBlock());
	public static final RegistryObject<Block> NOVOGLYPH = REGISTRY.register("novoglyph", () -> new NovoglyphBlock());
}
