package io.gomint.server.inventory.item;

import io.gomint.inventory.item.ItemType;

import io.gomint.server.registry.RegisterInfo;
import io.gomint.taglib.NBTTagCompound;

/**
 * @author geNAZt
 * @version 1.0
 */
@RegisterInfo(sId = "minecraft:stained_glass", id = 241)
public class ItemStainedGlass extends ItemStack implements io.gomint.inventory.item.ItemStainedGlass {

    @Override
    public ItemType getType() {
        return ItemType.STAINED_GLASS;
    }

}
