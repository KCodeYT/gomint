package io.gomint.server.world.block;

/**
 * @author geNAZt
 * @version 1.0
 */
public class BlockOfCoal extends Block {

    @Override
    public int getBlockId() {
        return 173;
    }

    @Override
    public long getBreakTime() {
        return 7500;
    }

}
