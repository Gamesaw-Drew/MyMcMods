package com.drew.drewmod.items;

import com.google.common.collect.Multimap;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemSword;

public class ItemOberlordSword extends ItemSword {


	private double AttSpeed;
	private AttributeModifier attackSpeed;

	public ItemOberlordSword(ToolMaterial material, double Speed) {
		super(material);
		this.AttSpeed = Speed;
		getAttackSpeed();
	}
	
	public AttributeModifier getAttackSpeed(){
		attackSpeed = new AttributeModifier(ATTACK_SPEED_MODIFIER, "Weapon modifier", this.AttSpeed, 0);
		
		return attackSpeed;
	}

}
