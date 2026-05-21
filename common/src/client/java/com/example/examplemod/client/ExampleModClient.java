package com.example.examplemod.client;

import com.example.examplemod.ExampleMod;
import net.ramixin.stator.StatorClientInitializer;

public class ExampleModClient implements StatorClientInitializer {
    @Override
    public void initializeClient() {
        ExampleMod.LOGGER.info("Initializing Client (1/1)");
        //Use StatorClientNetworking to send C2S payloads and register S2C payload handlers
    }
}
