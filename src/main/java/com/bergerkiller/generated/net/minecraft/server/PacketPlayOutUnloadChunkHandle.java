package com.bergerkiller.generated.net.minecraft.server;

import com.bergerkiller.mountiplex.reflection.util.StaticInitHelper;
import com.bergerkiller.mountiplex.reflection.declarations.Template;

/**
 * Instance wrapper handle for type <b>net.minecraft.server.PacketPlayOutUnloadChunk</b>.
 * To access members without creating a handle type, use the static {@link #T} member.
 * New handles can be created from raw instances using {@link #createHandle(Object)}.
 */
@Template.Optional
public abstract class PacketPlayOutUnloadChunkHandle extends PacketHandle {
    /** @See {@link PacketPlayOutUnloadChunkClass} */
    public static final PacketPlayOutUnloadChunkClass T = new PacketPlayOutUnloadChunkClass();
    static final StaticInitHelper _init_helper = new StaticInitHelper(PacketPlayOutUnloadChunkHandle.class, "net.minecraft.server.PacketPlayOutUnloadChunk");

    /* ============================================================================== */

    public static PacketPlayOutUnloadChunkHandle createHandle(Object handleInstance) {
        return T.createHandle(handleInstance);
    }

    /* ============================================================================== */

    public abstract int getCx();
    public abstract void setCx(int value);
    public abstract int getCz();
    public abstract void setCz(int value);
    /**
     * Stores class members for <b>net.minecraft.server.PacketPlayOutUnloadChunk</b>.
     * Methods, fields, and constructors can be used without using Handle Objects.
     */
    public static final class PacketPlayOutUnloadChunkClass extends Template.Class<PacketPlayOutUnloadChunkHandle> {
        public final Template.Field.Integer cx = new Template.Field.Integer();
        public final Template.Field.Integer cz = new Template.Field.Integer();

    }

}

