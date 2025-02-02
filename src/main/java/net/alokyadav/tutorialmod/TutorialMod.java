package net.alokyadav.tutorialmod;

import net.alokyadav.tutorialmod.blocks.ModBlocks;
import net.alokyadav.tutorialmod.item.ModItemGroups;
import net.alokyadav.tutorialmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

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

        FuelRegistry.INSTANCE.add(ModItems.STARLIGHT_ASHES, 80000);
	}
}