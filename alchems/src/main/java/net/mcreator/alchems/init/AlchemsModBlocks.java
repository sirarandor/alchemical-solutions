
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.alchems.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.alchems.block.NovoglyphBlock;
import net.mcreator.alchems.block.HyphaeBlock;
import net.mcreator.alchems.block.CinnabarBlock;
import net.mcreator.alchems.AlchemsMod;

public class AlchemsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AlchemsMod.MODID);
	public static final RegistryObject<Block> CINNABAR = REGISTRY.register("cinnabar", () -> new CinnabarBlock());
	public static final RegistryObject<Block> NOVOGLYPH = REGISTRY.register("novoglyph", () -> new NovoglyphBlock());
	public static final RegistryObject<Block> HYPHAE = REGISTRY.register("hyphae", () -> new HyphaeBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			HyphaeBlock.blockColorLoad(event);
		}
	}
}
