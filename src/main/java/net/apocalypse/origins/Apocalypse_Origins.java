package net.apocalypse.origins;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Apocalypse_Origins implements ModInitializer {
	public static final String MOD_ID = "apocalypse_origins";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Teleporting, Phasing, Evolving, Injecting. Apocalypse Origins has been initialized.");
	}
}