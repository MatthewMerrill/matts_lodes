package com.mattmerr.mc.mattslodes;

import com.mattmerr.mc.mattslodes.block.IronLode.IronLodeBlock;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber(modid = MattsLodesMod.MODID)
public class LodeBlocks {

  public static final IronLodeBlock ironLodeBlock = new IronLodeBlock();
  public static final Item ironLodeItem = new ItemBlock(ironLodeBlock)
      .setRegistryName("iron_lode");

  @SubscribeEvent
  public static void registerBlocks(RegistryEvent.Register<Block> event) {
    event.getRegistry().registerAll(ironLodeBlock);
    MattsLodesMod.logger.info("lode block registered");
  }

  @SubscribeEvent
  public static void registerItems(RegistryEvent.Register<Item> event) {
    event.getRegistry().register(ironLodeItem);
    MattsLodesMod.logger.info("lode items registered");
  }

  @SubscribeEvent
  public static void registerRenders(ModelRegistryEvent event) {
    registerRender(ironLodeItem);
  }

  private static void registerRender(Item item) {
    ModelLoader.setCustomModelResourceLocation(item, 0,
        new ModelResourceLocation(item.getRegistryName(), "inventory"));
  }


}
