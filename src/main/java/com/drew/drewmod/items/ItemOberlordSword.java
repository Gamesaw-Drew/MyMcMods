package com.drew.drewmod.items;

import com.google.common.collect.Multimap;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemSword;

public class ItemOberlordSword extends ItemSword {


	private double AttSpeed;
	private float attackSpeed;

	public ItemOberlordSword(ToolMaterial material, float Speed) {
		super(material);
		this.attackSpeed = Speed;
	}
	

}
