package net.alokyadav.tutorialmod;

import net.alokyadav.tutorialmod.blocks.ModBlocks;
import net.alokyadav.tutorialmod.component.ModDataComponentTypes;
import net.alokyadav.tutorialmod.item.ModItemGroups;
import net.alokyadav.tutorialmod.item.ModItems;
import net.alokyadav.tutorialmod.item.custom.Hammeritem;
import net.alokyadav.tutorialmod.util.HammerUsageEvent;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry; // Ensure this is imported and matches the library correctly.
import net.minecraft.item.Items; // Ensure all necessary imports for item registration are included.
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorial-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerModItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModDataComponentTypes.registerDataComponentTypes();
        FuelRegistry.INSTANCE.add(ModItems.STARLIGHT_ASHES, 32767);
		PlayerBlockBreakEvents.BEFORE.register(new HammerUsageEvent());
	}
}