package com.example.examplemod;

import net.ramixin.stator.StatorInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleMod implements StatorInitializer {

    public static final String MOD_ID = "examplemod";
    public static final String MOD_NAME = "Example Mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

    @Override
    public void initialize() {
        LOGGER.info("Initializing (1/1)");
        //Use StatorRegistration to register items/blocks/etc.
        //Use StatorNetworking to register payloads and send S2C payloads
        //Use StatorEventRegistry to register classes containing stator events
    }
}
