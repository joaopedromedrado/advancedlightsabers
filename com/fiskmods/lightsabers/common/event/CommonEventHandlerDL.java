package com.fiskmods.lightsabers.common.event;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.fiskmods.lightsabers.common.config.ModConfig;
import com.fiskmods.lightsabers.common.entity.EntityLightsaber;
import com.fiskmods.lightsabers.common.item.ItemLightsaberBase;
import com.google.common.collect.Lists;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

public class CommonEventHandlerDL
{
    private Minecraft mc;
    private long nextUpdate;
    private Thread thread;
    private boolean threadRunning;

    public CommonEventHandlerDL()
    {
        mc = FMLClientHandler.instance().getClient();
        nextUpdate = System.currentTimeMillis();
        threadRunning = false;
    }

    @SubscribeEvent
    public void onTick(TickEvent.ClientTickEvent tick)
    {
    }

    private int getEntityEquipmentMaxLight(Entity entity)
    {
        if (entity instanceof EntityLivingBase)
        {
            int light = getLightFromItemStack(((EntityLivingBase) entity).getEquipmentInSlot(0));

            return light;
        }
        else if (entity instanceof EntityLightsaber)
        {
            return 15;
        }

        return 0;
    }

    private int getLightFromItemStack(ItemStack itemstack)
    {
        if (itemstack != null && itemstack.getItem() instanceof ItemLightsaberBase && ItemLightsaberBase.isActive(itemstack))
        {
            return 15;
        }

        return 0;
    }

    private class EntityListChecker extends Thread
    {
        private final Object[] list;

        public EntityListChecker(List<Entity> input)
        {
            list = input.toArray();
        }

    }

}
