package com.mattmerr.mc.mattslodes.block;

import com.mattmerr.mc.mattslodes.LodeBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class IronLode {

  public static class IronLodeBlock extends Block {

    public IronLodeBlock() {
      super(Material.IRON, MapColor.IRON);
      setRegistryName("iron_lode");
      setUnlocalizedName("iron_lode");
      setHardness(1);
//      setResistance(1.0); // TODO: IDK
      setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    }

  }

  public static class IronLodeItem extends ItemBlock {

    public IronLodeItem() {
      super(LodeBlocks.ironLodeBlock);
      setRegistryName("iron_lode");
      setUnlocalizedName("iron_lode");
      setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
      setMaxStackSize(1);
    }
  }

  @SubscribeEvent
  public static void blockBreak(BlockEvent.BreakEvent breakEvent) {
    if (breakEvent.getState().getBlock() == LodeBlocks.ironLodeBlock) {
      World w = breakEvent.getWorld();
      BlockPos pos = breakEvent.getPos();

      EntityItem item = new EntityItem(w,
          pos.getX(), pos.getY(), pos.getZ(),
          new ItemStack(Blocks.IRON_ORE, 1));

      w.spawnEntity(item);
      breakEvent.setCanceled(true);
    }
  }

}
