
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.alchems.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.alchems.client.gui.NovoglyphGUIScreen;
import net.mcreator.alchems.client.gui.BeamThrowerGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AlchemsModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(AlchemsModMenus.NOVOGLYPH_GUI.get(), NovoglyphGUIScreen::new);
			MenuScreens.register(AlchemsModMenus.BEAM_THROWER_GUI.get(), BeamThrowerGUIScreen::new);
		});
	}
}
