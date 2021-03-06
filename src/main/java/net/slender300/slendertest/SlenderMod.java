package net.slender300.slendertest;

import net.fabricmc.api.ModInitializer;
import net.slender300.slendertest.item.ModItems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SlenderMod implements ModInitializer {

	public static final String MOD_ID = "slendertest";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
