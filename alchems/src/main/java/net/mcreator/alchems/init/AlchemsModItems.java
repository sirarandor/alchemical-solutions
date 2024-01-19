
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.alchems.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.alchems.item.SulfurDustItem;
import net.mcreator.alchems.item.RoseIngotItem;
import net.mcreator.alchems.item.MercuryItem;
import net.mcreator.alchems.item.CinnabarPowderItem;
import net.mcreator.alchems.item.ChargedQuartzCrystalItem;
import net.mcreator.alchems.item.BeamThrowerItem;
import net.mcreator.alchems.AlchemsMod;

public class AlchemsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AlchemsMod.MODID);
	public static final RegistryObject<Item> CINNABAR = block(AlchemsModBlocks.CINNABAR);
	public static final RegistryObject<Item> CINNABAR_POWDER = REGISTRY.register("cinnabar_powder", () -> new CinnabarPowderItem());
	public static final RegistryObject<Item> MERCURY = REGISTRY.register("mercury", () -> new MercuryItem());
	public static final RegistryObject<Item> NOVOGLYPH = block(AlchemsModBlocks.NOVOGLYPH);
	public static final RegistryObject<Item> MECHANICAL_HOUND_SPAWN_EGG = REGISTRY.register("mechanical_hound_spawn_egg", () -> new ForgeSpawnEggItem(AlchemsModEntities.MECHANICAL_HOUND, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> SULFUR_DUST = REGISTRY.register("sulfur_dust", () -> new SulfurDustItem());
	public static final RegistryObject<Item> CHARGED_QUARTZ_CRYSTAL = REGISTRY.register("charged_quartz_crystal", () -> new ChargedQuartzCrystalItem());
	public static final RegistryObject<Item> BEAM_THROWER = REGISTRY.register("beam_thrower", () -> new BeamThrowerItem());
	public static final RegistryObject<Item> ROSE_INGOT = REGISTRY.register("rose_ingot", () -> new RoseIngotItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
