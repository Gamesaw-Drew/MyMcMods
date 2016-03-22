package com.drew.drewmod.backend.sound;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public final class DrewSoundEvents {

	public static final SoundEvent machinesPrimed = getRegisteredSoundEvent("drewmod:machines");

    private static SoundEvent getRegisteredSoundEvent(String name) {
        return SoundEvent.soundEventRegistry.getObject(new ResourceLocation(name));
    }

    private DrewSoundEvents() {}
}

