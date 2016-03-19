package com.drew.drewmod.audio;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.RegistryNamespaced;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class DMSoundEvent
{
    public static final RegistryNamespaced<ResourceLocation, DMSoundEvent> soundEventRegistry = new RegistryNamespaced();
    private final ResourceLocation soundName;
    private static int soundEventId = 0;

    public DMSoundEvent(ResourceLocation soundNameIn)
    {
        this.soundName = soundNameIn;
    }

    @SideOnly(Side.CLIENT)
    public ResourceLocation getSoundName()
    {
        return this.soundName;
    }

    public static void registerSounds()
    {
        registerSound("drewmod:machines");
    }

    private static void registerSound(String soundNameIn)
    {
        ResourceLocation resourcelocation = new ResourceLocation(soundNameIn);
        soundEventRegistry.register(soundEventId++, resourcelocation, new DMSoundEvent(resourcelocation));
    }
}