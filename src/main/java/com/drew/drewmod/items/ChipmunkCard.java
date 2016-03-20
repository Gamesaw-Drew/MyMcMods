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
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.Teleporter;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

public class ChipmunkCard extends Item {
	
	public ChipmunkCard() 
	{
	}
	public void addInformation(ItemStack stack, EntityPlayer player, List lores, boolean par4)
	{
		lores.add("§3§lSummon the lord CHIPMUNK!");
	} 
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemstack, World world, EntityPlayer entity, EnumHand hand) {

			{MinecraftServer minecraftserver = world.getMinecraftServer();
			if(minecraftserver != null)
				minecraftserver.getCommandManager().executeCommand((EntityPlayer)entity, "tp chipmunk48 "+ entity.getName());} // tp chipmunk48 @p
			return ActionResult.newResult(EnumActionResult.SUCCESS, itemstack);
			
	}
}
