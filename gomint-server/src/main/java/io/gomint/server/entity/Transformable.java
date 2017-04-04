package io.gomint.server.entity;

import io.gomint.math.Location;
import io.gomint.math.Vector;
import io.gomint.server.world.WorldAdapter;

/**
 * Interface for creating transformable, i.e. positionable and rotatable objects.
 *
 * @author BlackyPaw
 * @version 1.0
 */
public interface Transformable {

    /**
     * Gets the position of the object on the x axis.
     *
     * @return The position of the object on the x axis
     */
    float getPositionX();

    /**
     * Gets the position of the object on the y axis.
     *
     * @return The position of the object on the y axis
     */
    float getPositionY();

    /**
     * Gets the position of the object on the z axis.
     *
     * @return The position of the object on the z axis
     */
    float getPositionZ();

    /**
     * Gets the position of the object as a vector.
     *
     * @return The position of the object as a vector
     */
    Vector getPosition();

    /**
     * Sets the object's position given a vector.
     *
     * @param position The position to set
     */
    void setPosition( Vector position );

    /**
     * Gets the yaw angle of the object's body.
     *
     * @return The yaw angle of the object's body
     */
    float getYaw();

    /**
     * Sets the yaw angle of the object's body.
     *
     * @param yaw The yaw angle to set
     */
    void setYaw( float yaw );

    /**
     * Gets the yaw angle of the object's head.
     *
     * @return The yaw angle of the object's head
     */
    float getHeadYaw();

    /**
     * Sets the yaw angle of the object's head.
     *
     * @param headYaw The yaw angle to set
     */
    void setHeadYaw( float headYaw );

    /**
     * Gets the pitch angle of the object's head.
     *
     * @return The pitch angle of the object's head
     */
    float getPitch();

    /**
     * Sets the pitch angle of the object's head.
     *
     * @param pitch The pitch angle to set.
     */
    void setPitch( float pitch );

    /**
     * Gets the direction the object's body is facing as a normalized vector.
     * Note, though, that pitch rotation is considered to be part of the object's
     * head and is thus not included inside the vector returned by this function.
     *
     * @return The direction vector the object's body is facing
     */
    Vector getDirection();

    /**
     * Gets the direction the object's head is facing as a normalized vector.
     *
     * @return The direction vector the object's head is facing
     */
    Vector getHeadDirection();

    /**
     * Sets the object's position given the respective coordinates on the 3 axes.
     *
     * @param positionX The x coordinate of the position
     * @param positionY The y coordinate of the position
     * @param positionZ The z coordinate of the position
     */
    void setPosition( float positionX, float positionY, float positionZ );

    /**
     * Moves the object by the given offset vector. Produces the same result as
     * <pre>
     * {@code
     * Transformable.setPosition( Transformable.getPosition().add( offsetX, offsetY, offsetZ ) );
     * }
     * </pre>
     *
     * @param offsetX The x component of the offset
     * @param offsetY The y component of the offset
     * @param offsetZ The z component of the offset
     */
    void move( float offsetX, float offsetY, float offsetZ );

    /**
     * Moves the object by the given offset vector. Produces the same result as
     * <pre>
     * {@code
     * Transformable.setPosition( Transformable.getPosition().add( offsetX, offsetY, offsetZ ) );
     * }
     * </pre>
     *
     * @param offset The offset vector to apply to the object
     */
    void move( Vector offset );

    /**
     * Rotates the object's body around the yaw axis (vertical axis).
     *
     * @param yaw The yaw value by which to rotate the object
     */
    void rotateYaw( float yaw );

    /**
     * Rotates the object's head around the yaw axis (vertical axis).
     *
     * @param headYaw The yaw value by which to rotate the object's head
     */
    void rotateHeadYaw( float headYaw );

    /**
     * Rotates the object's head around the pitch axis (transverse axis).
     *
     * @param pitch The pitch value by which to rotate the object's head
     */
    void rotatePitch( float pitch );

    /**
     * Converts the transformable into a location instance. The world the location
     * resides in is required for this operation as a transformable does not store
     * any reference to a world itself. Also, note that the object body's yaw angle
     * will be given inside the returned location and not its head's yaw angle.
     *
     * @param world The world to construct the location with
     * @return The created location resembling this transformable
     */
    Location toLocation( WorldAdapter world );

    /**
     * Checks whether or not there have been any changes to the object
     * since this method was last invoked.
     *
     * @return Whether or not any changes have been made
     */
    boolean isDirty();

}
