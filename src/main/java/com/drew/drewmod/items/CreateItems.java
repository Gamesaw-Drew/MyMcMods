package com.drew.drewmod.items;

import com.drew.drewmod.DrewMod;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CreateItems
{
	
	public static Item chipmunkcard;
	public static Item Gtx970;
	public static Item KappaFish;
	
    public static void createItems() 
    {
    	chipmunkcard = new ChipmunkCard().setUnlocalizedName("chipmunkcard").setCreativeTab(DrewMod.tabDrew);
    	GameRegistry.registerItem(chipmunkcard, chipmunkcard.getUnlocalizedName().substring(5));

    	Gtx970 = new Gtx970().setUnlocalizedName("Gtx970").setCreativeTab(DrewMod.tabDrew);
    	GameRegistry.registerItem(Gtx970, Gtx970.getUnlocalizedName().substring(5));
    	
    	KappaFish = new ItemFood(20, 1.0F, true).setUnlocalizedName("kappaFish").setCreativeTab(DrewMod.tabDrew);
    }
    
}
