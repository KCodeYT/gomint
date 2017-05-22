package io.gomint.server.network.packet;

import io.gomint.inventory.ItemStack;
import io.gomint.jraknet.PacketBuffer;
import io.gomint.server.network.Protocol;
import lombok.Data;

/**
 * @author geNAZt
 * @version 1.0
 */
@Data
public class PacketMobArmorEquipment extends Packet {

    private long entityId;
    private ItemStack helmet;
    private ItemStack chestplate;
    private ItemStack leggings;
    private ItemStack boots;

    public PacketMobArmorEquipment() {
        super( Protocol.PACKET_MOB_ARMOR_EQUIPMENT );
    }

    @Override
    public void serialize( PacketBuffer buffer ) {
        buffer.writeLong( this.entityId );
        writeItemStack( this.helmet, buffer );
        writeItemStack( this.chestplate, buffer );
        writeItemStack( this.leggings, buffer );
        writeItemStack( this.boots, buffer );
    }

    @Override
    public void deserialize( PacketBuffer buffer ) {
        this.entityId = buffer.readLong();
        this.helmet = readItemStack( buffer );
        this.chestplate = readItemStack( buffer );
        this.leggings = readItemStack( buffer );
        this.boots = readItemStack( buffer );
    }

    @Override
    public int estimateLength() {
        return 8 + predictItemStack( this.helmet ) + predictItemStack( this.boots ) + predictItemStack( this.chestplate ) + predictItemStack( this.leggings );
    }

}
