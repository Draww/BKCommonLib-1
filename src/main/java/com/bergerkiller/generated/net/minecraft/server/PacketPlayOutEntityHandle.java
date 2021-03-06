package com.bergerkiller.generated.net.minecraft.server;

import com.bergerkiller.mountiplex.reflection.util.StaticInitHelper;
import com.bergerkiller.mountiplex.reflection.declarations.Template;

/**
 * Instance wrapper handle for type <b>net.minecraft.server.PacketPlayOutEntity</b>.
 * To access members without creating a handle type, use the static {@link #T} member.
 * New handles can be created from raw instances using {@link #createHandle(Object)}.
 */
public abstract class PacketPlayOutEntityHandle extends PacketHandle {
    /** @See {@link PacketPlayOutEntityClass} */
    public static final PacketPlayOutEntityClass T = new PacketPlayOutEntityClass();
    static final StaticInitHelper _init_helper = new StaticInitHelper(PacketPlayOutEntityHandle.class, "net.minecraft.server.PacketPlayOutEntity");

    /* ============================================================================== */

    public static PacketPlayOutEntityHandle createHandle(Object handleInstance) {
        return T.createHandle(handleInstance);
    }

    /* ============================================================================== */


    public double getDeltaX() {
        return getProtocolPosition(T.dx_1_8_8, T.dx_1_10_2);
    }

    public double getDeltaY() {
        return getProtocolPosition(T.dy_1_8_8, T.dy_1_10_2);
    }

    public double getDeltaZ() {
        return getProtocolPosition(T.dz_1_8_8, T.dz_1_10_2);
    }

    public void setDeltaX(double dx) {
        setProtocolPosition(T.dx_1_8_8, T.dx_1_10_2, dx);
    }

    public void setDeltaY(double dy) {
        setProtocolPosition(T.dy_1_8_8, T.dy_1_10_2, dy);
    }

    public void setDeltaZ(double dz) {
        setProtocolPosition(T.dz_1_8_8, T.dz_1_10_2, dz);
    }

    public float getDeltaYaw() {
        return deserializeRotation(T.dyaw_raw.getByte(getRaw()));
    }

    public float getDeltaPitch() {
        return deserializeRotation(T.dpitch_raw.getByte(getRaw()));
    }

    public void setDeltaYaw(float deltaYaw) {
        T.dyaw_raw.setByte(getRaw(), (byte) serializeRotation(deltaYaw));
    }

    public void setDeltaPitch(float deltaPitch) {
        T.dpitch_raw.setByte(getRaw(), (byte) serializeRotation(deltaPitch));
    }
    public abstract int getEntityId();
    public abstract void setEntityId(int value);
    public abstract boolean isOnGround();
    public abstract void setOnGround(boolean value);
    /**
     * Stores class members for <b>net.minecraft.server.PacketPlayOutEntity</b>.
     * Methods, fields, and constructors can be used without using Handle Objects.
     */
    public static final class PacketPlayOutEntityClass extends Template.Class<PacketPlayOutEntityHandle> {
        public final Template.Field.Integer entityId = new Template.Field.Integer();
        @Template.Optional
        public final Template.Field.Byte dx_1_8_8 = new Template.Field.Byte();
        @Template.Optional
        public final Template.Field.Byte dy_1_8_8 = new Template.Field.Byte();
        @Template.Optional
        public final Template.Field.Byte dz_1_8_8 = new Template.Field.Byte();
        @Template.Optional
        public final Template.Field.Integer dx_1_10_2 = new Template.Field.Integer();
        @Template.Optional
        public final Template.Field.Integer dy_1_10_2 = new Template.Field.Integer();
        @Template.Optional
        public final Template.Field.Integer dz_1_10_2 = new Template.Field.Integer();
        @Template.Optional
        public final Template.Field.Byte dyaw_raw = new Template.Field.Byte();
        @Template.Optional
        public final Template.Field.Byte dpitch_raw = new Template.Field.Byte();
        public final Template.Field.Boolean onGround = new Template.Field.Boolean();

    }


    /**
     * Instance wrapper handle for type <b>net.minecraft.server.PacketPlayOutEntity.PacketPlayOutEntityLook</b>.
     * To access members without creating a handle type, use the static {@link #T} member.
     * New handles can be created from raw instances using {@link #createHandle(Object)}.
     */
    public abstract static class PacketPlayOutEntityLookHandle extends PacketPlayOutEntityHandle {
        /** @See {@link PacketPlayOutEntityLookClass} */
        public static final PacketPlayOutEntityLookClass T = new PacketPlayOutEntityLookClass();
        static final StaticInitHelper _init_helper = new StaticInitHelper(PacketPlayOutEntityLookHandle.class, "net.minecraft.server.PacketPlayOutEntity.PacketPlayOutEntityLook");

        /* ============================================================================== */

        public static PacketPlayOutEntityLookHandle createHandle(Object handleInstance) {
            return T.createHandle(handleInstance);
        }

        public static final PacketPlayOutEntityLookHandle createNew() {
            return T.constr.newInstance();
        }

        /* ============================================================================== */


        public static PacketPlayOutEntityHandle.PacketPlayOutEntityLookHandle createNew(int entityId, float deltaYaw, float deltaPitch, boolean onGround) {
            PacketPlayOutEntityHandle.PacketPlayOutEntityLookHandle handle = createNew();
            handle.setEntityId(entityId);
            handle.setDeltaYaw(deltaYaw);
            handle.setDeltaPitch(deltaPitch);
            handle.setOnGround(onGround);
            return handle;
        }
        /**
         * Stores class members for <b>net.minecraft.server.PacketPlayOutEntity.PacketPlayOutEntityLook</b>.
         * Methods, fields, and constructors can be used without using Handle Objects.
         */
        public static final class PacketPlayOutEntityLookClass extends Template.Class<PacketPlayOutEntityLookHandle> {
            public final Template.Constructor.Converted<PacketPlayOutEntityLookHandle> constr = new Template.Constructor.Converted<PacketPlayOutEntityLookHandle>();

        }

    }


    /**
     * Instance wrapper handle for type <b>net.minecraft.server.PacketPlayOutEntity.PacketPlayOutRelEntityMove</b>.
     * To access members without creating a handle type, use the static {@link #T} member.
     * New handles can be created from raw instances using {@link #createHandle(Object)}.
     */
    public abstract static class PacketPlayOutRelEntityMoveHandle extends PacketPlayOutEntityHandle {
        /** @See {@link PacketPlayOutRelEntityMoveClass} */
        public static final PacketPlayOutRelEntityMoveClass T = new PacketPlayOutRelEntityMoveClass();
        static final StaticInitHelper _init_helper = new StaticInitHelper(PacketPlayOutRelEntityMoveHandle.class, "net.minecraft.server.PacketPlayOutEntity.PacketPlayOutRelEntityMove");

        /* ============================================================================== */

        public static PacketPlayOutRelEntityMoveHandle createHandle(Object handleInstance) {
            return T.createHandle(handleInstance);
        }

        public static final PacketPlayOutRelEntityMoveHandle createNew() {
            return T.constr.newInstance();
        }

        /* ============================================================================== */


        public static PacketPlayOutEntityHandle.PacketPlayOutRelEntityMoveHandle createNew(int entityId, double dx, double dy, double dz, boolean onGround) {
            PacketPlayOutEntityHandle.PacketPlayOutRelEntityMoveHandle handle = createNew();
            handle.setEntityId(entityId);
            handle.setDeltaX(dx);
            handle.setDeltaY(dy);
            handle.setDeltaZ(dz);
            handle.setOnGround(onGround);
            return handle;
        }
        /**
         * Stores class members for <b>net.minecraft.server.PacketPlayOutEntity.PacketPlayOutRelEntityMove</b>.
         * Methods, fields, and constructors can be used without using Handle Objects.
         */
        public static final class PacketPlayOutRelEntityMoveClass extends Template.Class<PacketPlayOutRelEntityMoveHandle> {
            public final Template.Constructor.Converted<PacketPlayOutRelEntityMoveHandle> constr = new Template.Constructor.Converted<PacketPlayOutRelEntityMoveHandle>();

        }

    }


    /**
     * Instance wrapper handle for type <b>net.minecraft.server.PacketPlayOutEntity.PacketPlayOutRelEntityMoveLook</b>.
     * To access members without creating a handle type, use the static {@link #T} member.
     * New handles can be created from raw instances using {@link #createHandle(Object)}.
     */
    public abstract static class PacketPlayOutRelEntityMoveLookHandle extends PacketPlayOutEntityHandle {
        /** @See {@link PacketPlayOutRelEntityMoveLookClass} */
        public static final PacketPlayOutRelEntityMoveLookClass T = new PacketPlayOutRelEntityMoveLookClass();
        static final StaticInitHelper _init_helper = new StaticInitHelper(PacketPlayOutRelEntityMoveLookHandle.class, "net.minecraft.server.PacketPlayOutEntity.PacketPlayOutRelEntityMoveLook");

        /* ============================================================================== */

        public static PacketPlayOutRelEntityMoveLookHandle createHandle(Object handleInstance) {
            return T.createHandle(handleInstance);
        }

        public static final PacketPlayOutRelEntityMoveLookHandle createNew() {
            return T.constr.newInstance();
        }

        /* ============================================================================== */


        public static PacketPlayOutEntityHandle.PacketPlayOutRelEntityMoveLookHandle createNew(int entityId, double dx, double dy, double dz, float deltaYaw, float deltaPitch, boolean onGround) {
            PacketPlayOutEntityHandle.PacketPlayOutRelEntityMoveLookHandle handle = createNew();
            handle.setEntityId(entityId);
            handle.setDeltaX(dx);
            handle.setDeltaY(dy);
            handle.setDeltaZ(dz);
            handle.setDeltaYaw(deltaYaw);
            handle.setDeltaPitch(deltaPitch);
            handle.setOnGround(onGround);
            return handle;
        }
        /**
         * Stores class members for <b>net.minecraft.server.PacketPlayOutEntity.PacketPlayOutRelEntityMoveLook</b>.
         * Methods, fields, and constructors can be used without using Handle Objects.
         */
        public static final class PacketPlayOutRelEntityMoveLookClass extends Template.Class<PacketPlayOutRelEntityMoveLookHandle> {
            public final Template.Constructor.Converted<PacketPlayOutRelEntityMoveLookHandle> constr = new Template.Constructor.Converted<PacketPlayOutRelEntityMoveLookHandle>();

        }

    }

}

