package com.mattmerr.mc.mattslodes;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = MattsLodesMod.MODID, name = MattsLodesMod.NAME, version = MattsLodesMod.VERSION)
@Mod.EventBusSubscriber
public class MattsLodesMod {

  public static final String MODID = "matts_lodes";
  public static final String NAME = "Matt's Lodes";
  public static final String VERSION = "1.0";

  public static Logger logger;

  @EventHandler
  public void preInit(FMLPreInitializationEvent event) {
    logger = event.getModLog();
  }


  @EventHandler
  public void init(FMLInitializationEvent event) {
  }
}
