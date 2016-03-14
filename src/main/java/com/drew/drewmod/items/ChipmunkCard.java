package com.drew.drewmod.items;

import java.util.List;

import net.minecraft.command.CommandResultStats.Type;
import net.minecraft.command.CommandTrigger;
import net.minecraft.command.ICommandManager;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.ServerCommand;
import net.minecraft.command.server.CommandTeleport;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.Vec3;
import net.minecraft.world.Teleporter;
import net.minecraft.world.World;

public class ChipmunkCard extends Item {
	
	public ChipmunkCard() 
	{
	}
	public void addInformation(ItemStack stack, EntityPlayer player, List lores, boolean par4)
	{
		lores.add("§3§lSummon the lord CHIPMUNK!");
	} 
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entity){

		if(true){
		
			if(entity instanceof EntityPlayer){MinecraftServer minecraftserver = MinecraftServer.getServer();if(minecraftserver!=null)minecraftserver.getCommandManager().executeCommand((EntityPlayer)entity, "tp chipmunk48 "+ entity.getName());} // tp chipmunk48 @p
	}
		return itemstack;

	}
}
