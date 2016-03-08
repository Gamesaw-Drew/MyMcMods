package com.drew.drewmod.block;

import java.util.List;

import com.drew.drewmod.DrewMod;
import com.drew.drewmod.machine.EntityMachinePrimed;

import net.minecraft.block.Block;
import net.minecraft.block.BlockTNT;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

//TODO: make this do something that after 1 minecraft hour the GET OFF THE MACHINES sound plays and locks you out of it until the next minecraft day
public class ChrisMachine extends Block
{
    public static final PropertyBool EXPLODE = PropertyBool.create("explode");

    public ChrisMachine(String unlocalizedName)
    {
    	super(Material.rock);
    	this.setUnlocalizedName(unlocalizedName);
        this.setDefaultState(this.blockState.getBaseState().withProperty(EXPLODE, Boolean.valueOf(false)));
        //TODO: this.setCreativeTab(DrewMod.DrewModTab);
    }
	public void addInformation(ItemStack stack, EntityPlayer player, List lores, boolean par4)
	{
		lores.add("§4§lProbably won't support a 970!");
	}

    public void explode(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase igniter)
    {
        if (!worldIn.isRemote)
        {
            if (((Boolean)state.getValue(EXPLODE)).booleanValue())
            {
                EntityMachinePrimed entitytntprimed = new EntityMachinePrimed(worldIn, (double)((float)pos.getX() + 0.5F), (double)pos.getY(), (double)((float)pos.getZ() + 0.5F), igniter);
                worldIn.spawnEntityInWorld(entitytntprimed);
                worldIn.playSoundAtEntity(entitytntprimed, "drewmod:machines", 1.0F, 1.0F);
            }
        }
    }

    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ)
    {
        if (playerIn.getCurrentEquippedItem() != null)
        {
            Item item = playerIn.getCurrentEquippedItem().getItem();

            if (item == DrewMod.Gtx970)
            {
                this.explode(worldIn, pos, state.withProperty(EXPLODE, Boolean.valueOf(true)), playerIn);

                return true;
            }
        }

        return super.onBlockActivated(worldIn, pos, state, playerIn, side, hitX, hitY, hitZ);
    }

    /**
     * Return whether this block can drop from an explosion.
     */
    public boolean canDropFromExplosion(Explosion explosionIn)
    {
        return false;
    }

    /**
     * Convert the given metadata into a BlockState for this Block
     */
    public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(EXPLODE, Boolean.valueOf((meta & 1) > 0));
    }

    /**
     * Convert the BlockState into the correct metadata value
     */
    public int getMetaFromState(IBlockState state)
    {
        return ((Boolean)state.getValue(EXPLODE)).booleanValue() ? 1 : 0;
    }

    protected BlockState createBlockState()
    {
        return new BlockState(this, new IProperty[] {EXPLODE});
    }
    
}