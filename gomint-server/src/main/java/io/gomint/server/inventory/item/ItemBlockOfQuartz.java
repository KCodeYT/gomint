package io.gomint.server.inventory.item;

import io.gomint.inventory.item.ItemType;

import io.gomint.server.registry.RegisterInfo;
import io.gomint.taglib.NBTTagCompound;

/**
 * @author geNAZt
 * @version 1.0
 */
@RegisterInfo(sId = "minecraft:quartz_block", id = 155)
public class ItemBlockOfQuartz extends ItemStack implements io.gomint.inventory.item.ItemBlockOfQuartz {

    @Override
    public ItemType getType() {
        return ItemType.BLOCK_OF_QUARTZ;
    }

}
