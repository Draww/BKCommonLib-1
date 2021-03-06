package com.bergerkiller.reflection.net.minecraft.server;

import com.bergerkiller.bukkit.common.wrappers.EntityTracker;
import com.bergerkiller.generated.net.minecraft.server.ChunkProviderServerHandle;
import com.bergerkiller.generated.net.minecraft.server.WorldServerHandle;
import com.bergerkiller.mountiplex.reflection.ClassTemplate;
import com.bergerkiller.mountiplex.reflection.FieldAccessor;
import com.bergerkiller.mountiplex.reflection.SafeDirectField;
import com.bergerkiller.mountiplex.reflection.declarations.Template.Handle;

import java.util.Map;
import java.util.UUID;

@Deprecated
public class NMSWorldServer extends NMSWorld {
    public static final ClassTemplate<?> T = ClassTemplate.createNMS("WorldServer");
    
    public static final FieldAccessor<Object> playerChunkMap = WorldServerHandle.T.playerChunkMapField.raw.toFieldAccessor();
    public static final FieldAccessor<Object> server = WorldServerHandle.T.minecraftServer.raw.toFieldAccessor();
    public static final FieldAccessor<EntityTracker> entityTracker = WorldServerHandle.T.entityTracker.toFieldAccessor();

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static final FieldAccessor<Map<UUID, Object>> entitiesByUUID = (FieldAccessor) WorldServerHandle.T.entitiesByUUID.raw.toFieldAccessor();

    public static final FieldAccessor<Object> chunkProviderServer = new SafeDirectField<Object>() {
        @Override
        public Object get(Object instance) {
            return Handle.getRaw(WorldServerHandle.createHandle(instance).getChunkProviderServer());
        }

        @Override
        public boolean set(Object instance, Object value) {
            WorldServerHandle.createHandle(instance).setChunkProviderServer(ChunkProviderServerHandle.createHandle(value));
            return true;
        }
    };
}
