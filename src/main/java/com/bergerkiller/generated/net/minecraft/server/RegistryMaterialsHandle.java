package com.bergerkiller.generated.net.minecraft.server;

import com.bergerkiller.mountiplex.reflection.util.StaticInitHelper;
import com.bergerkiller.mountiplex.reflection.declarations.Template;
import java.util.Map;

/**
 * Instance wrapper handle for type <b>net.minecraft.server.RegistryMaterials</b>.
 * To access members without creating a handle type, use the static {@link #T} member.
 * New handles can be created from raw instances using {@link #createHandle(Object)}.
 */
public abstract class RegistryMaterialsHandle extends Template.Handle {
    /** @See {@link RegistryMaterialsClass} */
    public static final RegistryMaterialsClass T = new RegistryMaterialsClass();
    static final StaticInitHelper _init_helper = new StaticInitHelper(RegistryMaterialsHandle.class, "net.minecraft.server.RegistryMaterials");

    /* ============================================================================== */

    public static RegistryMaterialsHandle createHandle(Object handleInstance) {
        return T.createHandle(handleInstance);
    }

    /* ============================================================================== */

    public abstract Object get(Object key);
    public abstract Object getKey(Object value);
    public abstract Map<Object, Object> getInverseLookupField();
    public abstract void setInverseLookupField(Map<Object, Object> value);
    /**
     * Stores class members for <b>net.minecraft.server.RegistryMaterials</b>.
     * Methods, fields, and constructors can be used without using Handle Objects.
     */
    public static final class RegistryMaterialsClass extends Template.Class<RegistryMaterialsHandle> {
        public final Template.Field<Map<Object, Object>> inverseLookupField = new Template.Field<Map<Object, Object>>();

        public final Template.Method<Object> get = new Template.Method<Object>();
        public final Template.Method<Object> getKey = new Template.Method<Object>();

    }

}

