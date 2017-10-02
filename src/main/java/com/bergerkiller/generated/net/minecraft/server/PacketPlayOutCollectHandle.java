package com.bergerkiller.generated.net.minecraft.server;

import com.bergerkiller.mountiplex.reflection.util.StaticInitHelper;
import com.bergerkiller.mountiplex.reflection.declarations.Template;

/**
 * Instance wrapper handle for type <b>net.minecraft.server.PacketPlayOutCollect</b>.
 * To access members without creating a handle type, use the static {@link #T} member.
 * New handles can be created from raw instances using {@link #createHandle(Object)}.
 */
public class PacketPlayOutCollectHandle extends PacketHandle {
    /** @See {@link PacketPlayOutCollectClass} */
    public static final PacketPlayOutCollectClass T = new PacketPlayOutCollectClass();
    static final StaticInitHelper _init_helper = new StaticInitHelper(PacketPlayOutCollectHandle.class, "net.minecraft.server.PacketPlayOutCollect");

    /* ============================================================================== */

    public static PacketPlayOutCollectHandle createHandle(Object handleInstance) {
        return T.createHandle(handleInstance);
    }

    /* ============================================================================== */

    public int getCollectedItemId() {
        return T.collectedItemId.getInteger(getRaw());
    }

    public void setCollectedItemId(int value) {
        T.collectedItemId.setInteger(getRaw(), value);
    }

    public int getCollectorEntityId() {
        return T.collectorEntityId.getInteger(getRaw());
    }

    public void setCollectorEntityId(int value) {
        T.collectorEntityId.setInteger(getRaw(), value);
    }

    /**
     * Stores class members for <b>net.minecraft.server.PacketPlayOutCollect</b>.
     * Methods, fields, and constructors can be used without using Handle Objects.
     */
    public static final class PacketPlayOutCollectClass extends Template.Class<PacketPlayOutCollectHandle> {
        public final Template.Field.Integer collectedItemId = new Template.Field.Integer();
        public final Template.Field.Integer collectorEntityId = new Template.Field.Integer();
        @Template.Optional
        public final Template.Field.Integer unknown = new Template.Field.Integer();

    }

}

