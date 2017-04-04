package io.gomint.server.world.block;

/**
 * @author geNAZt
 * @version 1.0
 */
public class PistonHead extends Block {

    @Override
    public int getBlockId() {
        return 34;
    }

    @Override
    public long getBreakTime() {
        return 750;
    }

    @Override
    public boolean isTransparent() {
        return true;
    }

}
