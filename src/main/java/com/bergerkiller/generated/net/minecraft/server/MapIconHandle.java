package com.bergerkiller.generated.net.minecraft.server;

import com.bergerkiller.mountiplex.reflection.util.StaticInitHelper;
import com.bergerkiller.mountiplex.reflection.declarations.Template;

/**
 * Instance wrapper handle for type <b>net.minecraft.server.MapIcon</b>.
 * To access members without creating a handle type, use the static {@link #T} member.
 * New handles can be created from raw instances using {@link #createHandle(Object)}.
 */
public abstract class MapIconHandle extends Template.Handle {
    /** @See {@link MapIconClass} */
    public static final MapIconClass T = new MapIconClass();
    static final StaticInitHelper _init_helper = new StaticInitHelper(MapIconHandle.class, "net.minecraft.server.MapIcon");

    /* ============================================================================== */

    public static MapIconHandle createHandle(Object handleInstance) {
        return T.createHandle(handleInstance);
    }

    public static final MapIconHandle createNew(byte type, byte x, byte y, byte direction) {
        return T.constr_type_x_y_direction.newInstance(type, x, y, direction);
    }

    /* ============================================================================== */

    public abstract byte getTypeId();
    public abstract byte getX();
    public abstract byte getY();
    public abstract byte getDirection();
    /**
     * Stores class members for <b>net.minecraft.server.MapIcon</b>.
     * Methods, fields, and constructors can be used without using Handle Objects.
     */
    public static final class MapIconClass extends Template.Class<MapIconHandle> {
        public final Template.Constructor.Converted<MapIconHandle> constr_type_x_y_direction = new Template.Constructor.Converted<MapIconHandle>();

        public final Template.Method<Byte> getTypeId = new Template.Method<Byte>();
        public final Template.Method<Byte> getX = new Template.Method<Byte>();
        public final Template.Method<Byte> getY = new Template.Method<Byte>();
        public final Template.Method<Byte> getDirection = new Template.Method<Byte>();

    }


    /**
     * Instance wrapper handle for type <b>net.minecraft.server.MapIcon.Type</b>.
     * To access members without creating a handle type, use the static {@link #T} member.
     * New handles can be created from raw instances using {@link #createHandle(Object)}.
     */
    @Template.Optional
    public abstract static class TypeHandle extends Template.Handle {
        /** @See {@link TypeClass} */
        public static final TypeClass T = new TypeClass();
        static final StaticInitHelper _init_helper = new StaticInitHelper(TypeHandle.class, "net.minecraft.server.MapIcon.Type");

        /* ============================================================================== */

        public static TypeHandle createHandle(Object handleInstance) {
            return T.createHandle(handleInstance);
        }

        /* ============================================================================== */

        public static TypeHandle fromId(byte id) {
            return T.fromId.invoke(id);
        }

        /**
         * Stores class members for <b>net.minecraft.server.MapIcon.Type</b>.
         * Methods, fields, and constructors can be used without using Handle Objects.
         */
        public static final class TypeClass extends Template.Class<TypeHandle> {
            public final Template.StaticMethod.Converted<TypeHandle> fromId = new Template.StaticMethod.Converted<TypeHandle>();

        }

    }

}

