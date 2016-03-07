package com.drew.drewmod.init;

import com.drew.drewmod.block.CreateBlocks;


public class ServerProxy implements IProxy
{
	public void registerRenderers()
	{
		
	}
	
	public void createItems()
	{
		CreateBlocks.createBlocks();
	}

}
