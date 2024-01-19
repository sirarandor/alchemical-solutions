
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.alchems.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.alchems.world.inventory.NovoglyphGUIMenu;
import net.mcreator.alchems.world.inventory.BeamThrowerGUIMenu;
import net.mcreator.alchems.AlchemsMod;

public class AlchemsModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, AlchemsMod.MODID);
	public static final RegistryObject<MenuType<NovoglyphGUIMenu>> NOVOGLYPH_GUI = REGISTRY.register("novoglyph_gui", () -> IForgeMenuType.create(NovoglyphGUIMenu::new));
	public static final RegistryObject<MenuType<BeamThrowerGUIMenu>> BEAM_THROWER_GUI = REGISTRY.register("beam_thrower_gui", () -> IForgeMenuType.create(BeamThrowerGUIMenu::new));
}
