package com.drew.drewmod.init;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import com.drew.drewmod.block.CreateBlocks;
import com.drew.drewmod.client.render.blocks.BlockRenderRegister;
import com.drew.drewmod.client.render.items.ItemRenderRegister;
import com.drew.drewmod.items.CreateItems;
import com.drew.drewmod.backend.sound.DrewSoundEvents;

public class ClientProxy implements IProxy
{
	@Override
	public void registerRenderers()
	{
	    ItemRenderRegister.registerItemRenderer();
	    BlockRenderRegister.registerBlockRenderer();
	
	}
	
	public void createItems()
	{
		CreateBlocks.createBlocks();
		CreateItems.createItems();
	}
	
	public void createSounds()
	{
		DrewSoundEvents.regSnds();
	}
}
