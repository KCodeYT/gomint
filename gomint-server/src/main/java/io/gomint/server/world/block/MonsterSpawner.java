package io.gomint.server.world.block;

/**
 * @author geNAZt
 * @version 1.0
 */
public class MonsterSpawner extends Block {

    @Override
    public int getBlockId() {
        return 52;
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
