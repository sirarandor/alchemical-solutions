
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.alchems.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.alchems.entity.MechanicalHoundEntity;
import net.mcreator.alchems.entity.BeamThrowerBeamEntity;
import net.mcreator.alchems.AlchemsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AlchemsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, AlchemsMod.MODID);
	public static final RegistryObject<EntityType<MechanicalHoundEntity>> MECHANICAL_HOUND = register("mechanical_hound",
			EntityType.Builder.<MechanicalHoundEntity>of(MechanicalHoundEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MechanicalHoundEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BeamThrowerBeamEntity>> BEAM_THROWER_BEAM = register("projectile_beam_thrower_beam", EntityType.Builder.<BeamThrowerBeamEntity>of(BeamThrowerBeamEntity::new, MobCategory.MISC)
			.setCustomClientFactory(BeamThrowerBeamEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			MechanicalHoundEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(MECHANICAL_HOUND.get(), MechanicalHoundEntity.createAttributes().build());
	}
}
