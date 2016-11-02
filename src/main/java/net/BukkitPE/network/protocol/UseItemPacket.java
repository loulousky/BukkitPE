package net.BukkitPE.network.protocol;

import net.BukkitPE.item.Item;
import net.BukkitPE.math.BlockVector3;
import net.BukkitPE.math.Vector3f;

public class UseItemPacket extends DataPacket {

    public static final byte NETWORK_ID = ProtocolInfo.USE_ITEM_PACKET;

    public int x;
    public int y;
    public int z;

    public int face;

    public float fx;
    public float fy;
    public float fz;

    public float posX;
    public float posY;
    public float posZ;

    public int unknown;

    public Item item;

    @Override
    public byte pid() {
        return NETWORK_ID;
    }

    @Override
    public void decode() {
        BlockVector3 v = this.getBlockCoords();
        this.x = v.x;
        this.y = v.y;
        this.z = v.z;
        this.face = this.getSignedVarInt();
        Vector3f faceVector3 = this.getVector3f();
        this.fx = faceVector3.x;
        this.fy = faceVector3.y;
        this.fz = faceVector3.z;
        Vector3f playerPos = this.getVector3f();
        this.posX = playerPos.x;
        this.posY = playerPos.y;
        this.posZ = playerPos.z;
        this.unknown = this.getByte();
        this.item = this.getSlot();
        this.posX = playerPos.x;
    }

    @Override
    public void encode() {

    }

}