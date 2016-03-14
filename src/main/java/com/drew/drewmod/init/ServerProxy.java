package com.drew.drewmod.init;

import com.drew.drewmod.block.CreateBlocks;
import com.drew.drewmod.items.CreateItems;


public class ServerProxy implements IProxy
{
	public void registerRenderers()
	{
		
	}
	
	public void createItems()
	{
		CreateBlocks.createBlocks();
		CreateItems.createItems();
	}

}
