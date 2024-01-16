
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.alchems.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.alchems.client.renderer.MechanicalHoundRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AlchemsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(AlchemsModEntities.MECHANICAL_HOUND.get(), MechanicalHoundRenderer::new);
	}
}
