package com.drew.drewmod.client.render.items;

import com.drew.drewmod.DrewMod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ItemRenderRegister
{
	
	public static String modid = DrewMod.MODID;

	public static void registerItemRenderer()
	{
	    reg(DrewMod.chipmunkcard);
	    reg(DrewMod.Gtx970);
	}

	public static void reg(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation("DrewMod:" + item.getUnlocalizedName().substring(5),"inventory"));

	}

}
