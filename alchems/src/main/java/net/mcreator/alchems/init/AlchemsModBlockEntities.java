
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.alchems.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.alchems.block.entity.NovoglyphBlockEntity;
import net.mcreator.alchems.AlchemsMod;

public class AlchemsModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, AlchemsMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> NOVOGLYPH = register("novoglyph", AlchemsModBlocks.NOVOGLYPH, NovoglyphBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
