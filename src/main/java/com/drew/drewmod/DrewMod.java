package com.drew.drewmod;

import com.drew.drewmod.block.ChrisMachine;
import com.drew.drewmod.init.IProxy;
import com.drew.drewmod.items.ChipmunkCard;
import com.drew.drewmod.items.Gtx970;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod.Metadata;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = DrewMod.MODID, version = DrewMod.VERSION)
public class DrewMod
{
    public static final String MODID = "DrewMod";
    public static final String VERSION = "1.0";
    
    // TODO: Make server proxy
    @SidedProxy(clientSide = "com.drew.drewmod.init.ClientProxy", serverSide = "com.drew.drewmod.init.ServerProxy")
    public static IProxy proxy;
    
    @Metadata
    public static ModMetadata meta;
    
    @Instance(DrewMod.MODID)
    public static DrewMod modInstance;
    
    // Items
    public static Item chipmunkcard;
	public static Item Gtx970;
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	// Items
    	chipmunkcard = new ChipmunkCard().setUnlocalizedName("chipmunkcard").setCreativeTab(tabDrew);
    	GameRegistry.registerItem(chipmunkcard, chipmunkcard.getUnlocalizedName().substring(5));

    	Gtx970 = new Gtx970().setUnlocalizedName("Gtx970").setCreativeTab(tabDrew);
    	GameRegistry.registerItem(Gtx970, Gtx970.getUnlocalizedName().substring(5));
    	
    	// Blocks
    	proxy.createItems();
    	
    	// Register all the item renderers
    	proxy.registerRenderers(); 
    	

    }
	public static CreativeTabs tabDrew = new CreativeTabs("tabDrew"){
		@Override
		public Item getTabIconItem(){
			return new ItemStack(Gtx970).getItem();
		}
		
		
	};
	
}
