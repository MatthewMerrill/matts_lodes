package com.mattmerr.mc.mattslodes.block;

import com.mattmerr.mc.mattslodes.LodeBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class IronLode {

  public static class IronLodeBlock extends Block {

    public IronLodeBlock() {
      super(Material.IRON, MapColor.IRON);
      setUnlocalizedName("ironlode");
      setRegistryName("ironlode");
      setHardness(2000);
//      setResistance(1.0); // TODO: IDK
      setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    }

  }

  public static class IronLodeItem extends ItemBlock {

    public IronLodeItem() {
      super(LodeBlocks.ironLodeBlock);
      setRegistryName("ironlode");
      setUnlocalizedName("ironlode");
      setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
      setMaxStackSize(1);

    }
  }
}
