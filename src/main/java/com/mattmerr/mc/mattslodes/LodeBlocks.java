package com.mattmerr.mc.mattslodes;

import com.mattmerr.mc.mattslodes.block.IronLode.IronLodeBlock;
import com.mattmerr.mc.mattslodes.block.IronLode.IronLodeItem;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class LodeBlocks {

  public static final IronLodeBlock ironLodeBlock = new IronLodeBlock();
  public static final IronLodeItem ironLodeItem = new IronLodeItem();

  @SubscribeEvent
  public static void registerBlocks(RegistryEvent.Register<Block> event) {
    event.getRegistry().registerAll(ironLodeBlock);
    MattsLodesMod.logger.info("lode blocks registered");
  }

  @SubscribeEvent
  public static void registerItems(RegistryEvent.Register<Item> event) {
    event.getRegistry().registerAll(ironLodeItem);
    MattsLodesMod.logger.info("lode items registered");
  }




}
