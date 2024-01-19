
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.alchems.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.alchems.AlchemsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AlchemsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AlchemsMod.MODID);
	public static final RegistryObject<CreativeModeTab> ALCHEMICAL_SOLUTIONS = REGISTRY.register("alchemical_solutions",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.alchems.alchemical_solutions")).icon(() -> new ItemStack(Blocks.AMETHYST_CLUSTER)).displayItems((parameters, tabData) -> {
				tabData.accept(AlchemsModItems.MERCURY.get());
				tabData.accept(AlchemsModBlocks.NOVOGLYPH.get().asItem());
				tabData.accept(AlchemsModItems.SULFUR_DUST.get());
				tabData.accept(AlchemsModItems.CHARGED_QUARTZ_CRYSTAL.get());
				tabData.accept(AlchemsModItems.BEAM_THROWER.get());
				tabData.accept(AlchemsModItems.ROSE_INGOT.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(AlchemsModItems.MECHANICAL_HOUND_SPAWN_EGG.get());
		}
	}
}
