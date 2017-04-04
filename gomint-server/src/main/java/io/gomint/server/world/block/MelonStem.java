package io.gomint.server.world.block;

/**
 * @author geNAZt
 * @version 1.0
 */
public class MelonStem extends Block {

    @Override
    public int getBlockId() {
        return 105;
    }

    @Override
    public boolean isTransparent() {
        return true;
    }

    @Override
    public boolean isSolid() {
        return false;
    }

}
