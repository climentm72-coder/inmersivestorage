package com.climentm72.immersivestorage;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ImmersiveStorage implements ModInitializer {
    public static final String MOD_ID = "immersivestorage";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("¡Immersive Storage se ha inicializado correctamente para Minecraft 1.20.1!");
    }
}