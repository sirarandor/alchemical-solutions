
package net.mcreator.alchems.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.alchems.entity.MechanicalHoundEntity;
import net.mcreator.alchems.client.model.Modelhound;

public class MechanicalHoundRenderer extends MobRenderer<MechanicalHoundEntity, Modelhound<MechanicalHoundEntity>> {
	public MechanicalHoundRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhound(context.bakeLayer(Modelhound.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MechanicalHoundEntity entity) {
		return new ResourceLocation("alchems:textures/entities/texturehound.png");
	}
}
