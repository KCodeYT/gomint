/*
 * Copyright (c) 2017, GoMint, BlackyPaw and geNAZt
 *
 * This code is licensed under the BSD license found in the
 * LICENSE file in the root directory of this source tree.
 */

package io.gomint.server.player;

/**
 * @author BlackyPaw
 * @version 1.0
 */
public class PlayerSkin implements io.gomint.player.PlayerSkin {

    public static final int SKIN_DATA_SIZE_STEVE = 8192;
    public static final int SKIN_DATA_SIZE_ALEX = 16384;

    private String name;
    private byte[] data;

    public PlayerSkin( String name, byte[] data ) {
        if ( data.length != SKIN_DATA_SIZE_STEVE && data.length != SKIN_DATA_SIZE_ALEX ) {
            throw new IllegalArgumentException( "Invalid skin data buffer length" );
        }

        this.name = name;
        this.data = data;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public byte[] getRawData() {
        return this.data;
    }
}
