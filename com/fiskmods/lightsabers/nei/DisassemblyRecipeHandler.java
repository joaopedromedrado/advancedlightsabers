package com.fiskmods.lightsabers.nei;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.lwjgl.opengl.GL11;

import com.fiskmods.lightsabers.Lightsabers;
import com.fiskmods.lightsabers.client.gui.GuiDisassemblyStation;
import com.fiskmods.lightsabers.common.hilt.Hilt;
import com.fiskmods.lightsabers.common.item.ItemCrystal;
import com.fiskmods.lightsabers.common.item.ItemDoubleLightsaber;
import com.fiskmods.lightsabers.common.item.ItemFocusingCrystal;
import com.fiskmods.lightsabers.common.item.ItemLightsaberBase;
import com.fiskmods.lightsabers.common.item.ItemLightsaberPart;
import com.fiskmods.lightsabers.common.item.ModItems;
import com.fiskmods.lightsabers.common.lightsaber.LightsaberData;
import com.fiskmods.lightsabers.common.tileentity.TileEntityDisassemblyStation;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

public class DisassemblyRecipeHandler
{
    private Minecraft mc = Minecraft.getMinecraft();

    private class ItemEntry implements Comparable<ItemEntry>
    {
        private final Map.Entry<ItemStack, Float> e;

        public ItemEntry(Map.Entry<ItemStack, Float> e)
        {
            this.e = e;
        }

        public ItemStack getKey()
        {
            return e.getKey();
        }

        public float getValue()
        {
            return e.getValue();
        }

        @Override
        public int hashCode()
        {
            int result = 1;
            result = 31 * result + getKey().getItemDamage();
            result = 31 * result + (getKey().getItem() == null ? 0 : getKey().getItem().hashCode());
            result = 31 * result + (getKey().getTagCompound() == null ? 0 : getKey().getTagCompound().hashCode());
            result = 31 * result + Float.floatToIntBits(getValue());
            return result;
        }

        @Override
        public boolean equals(Object obj)
        {
            if (this == obj)
            {
                return true;
            }
            else if (obj == null)
            {
                return false;
            }

            ItemEntry other = (ItemEntry) obj;

            if (getKey().getItemDamage() != other.getKey().getItemDamage())
            {
                return false;
            }

            if (Float.floatToIntBits(getValue()) != Float.floatToIntBits(other.getValue()))
            {
                return false;
            }

            if (getKey().getItem() == null)
            {
                if (other.getKey().getItem() != null)
                {
                    return false;
                }
            }
            else if (!getKey().getItem().equals(other.getKey().getItem()))
            {
                return false;
            }

            if (getKey().getTagCompound() == null)
            {
                if (other.getKey().getTagCompound() != null)
                {
                    return false;
                }
            }
            else if (!getKey().getTagCompound().equals(other.getKey().getTagCompound()))
            {
                return false;
            }

            return true;
        }

        @Override
        public int compareTo(ItemEntry o)
        {
            return Float.compare(o.getValue(), getValue());
        }
    }


}
