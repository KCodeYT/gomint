package io.gomint.server.world.block;

/**
 * @author geNAZt
 * @version 1.0
 */
public class Beacon extends Block {

    @Override
    public int getBlockId() {
        return 138;
    }

    @Override
    public long getBreakTime() {
        return 4500;
    }

    @Override
    public boolean isTransparent() {
        return true;
    }

}
