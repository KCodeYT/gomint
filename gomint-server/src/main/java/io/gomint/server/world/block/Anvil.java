package io.gomint.server.world.block;

/**
 * @author geNAZt
 * @version 1.0
 */
public class Anvil extends Block {

    @Override
    public int getBlockId() {
        return 145;
    }

    @Override
    public long getBreakTime() {
        return 7500;
    }

    @Override
    public boolean isTransparent() {
        return true;
    }

}
