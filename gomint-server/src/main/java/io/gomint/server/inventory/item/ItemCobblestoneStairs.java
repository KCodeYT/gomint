package io.gomint.server.inventory.item;

import io.gomint.inventory.item.ItemType;

import io.gomint.server.registry.RegisterInfo;
import io.gomint.taglib.NBTTagCompound;

/**
 * @author geNAZt
 * @version 1.0
 */
@RegisterInfo(sId = "minecraft:stone_stairs", id = 67)
public class ItemCobblestoneStairs extends ItemStack implements io.gomint.inventory.item.ItemCobblestoneStairs {

    @Override
    public ItemType getType() {
        return ItemType.COBBLESTONE_STAIRS;
    }

}
