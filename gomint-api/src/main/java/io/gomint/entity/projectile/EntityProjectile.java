/*
 * Copyright (c) 2017, GoMint, BlackyPaw and geNAZt
 *
 * This code is licensed under the BSD license found in the
 * LICENSE file in the root directory of this source tree.
 */

package io.gomint.entity.projectile;

import io.gomint.entity.Entity;
import io.gomint.entity.EntityLiving;

/**
 * @author geNAZt
 * @version 1.0
 */
public interface EntityProjectile extends Entity {

    /**
     * Get the shooter of this projectile
     *
     * @return shooter of this projectile or null when shooter has died
     */
    EntityLiving getShooter();

}