package com.bergerkiller.generated.net.minecraft.server;

import com.bergerkiller.mountiplex.reflection.util.StaticInitHelper;
import com.bergerkiller.mountiplex.reflection.declarations.Template;
import com.bergerkiller.bukkit.common.bases.IntVector3;
import com.bergerkiller.generated.net.minecraft.server.BiomeBaseHandle.BiomeMetaHandle;
import java.util.List;

/**
 * Instance wrapper handle for type <b>net.minecraft.server.ChunkProviderServer</b>.
 * To access members without creating a handle type, use the static {@link #T} member.
 * New handles can be created from raw instances using {@link #createHandle(Object)}.
 */
public class ChunkProviderServerHandle extends Template.Handle {
    /** @See {@link ChunkProviderServerClass} */
    public static final ChunkProviderServerClass T = new ChunkProviderServerClass();
    static final StaticInitHelper _init_helper = new StaticInitHelper(ChunkProviderServerHandle.class, "net.minecraft.server.ChunkProviderServer");

    /* ============================================================================== */

    public static ChunkProviderServerHandle createHandle(Object handleInstance) {
        return T.createHandle(handleInstance);
    }

    /* ============================================================================== */

    public List<BiomeMetaHandle> getBiomeSpawnInfo(Object enumcreaturetype, IntVector3 position) {
        return T.getBiomeSpawnInfo.invoke(getRaw(), enumcreaturetype, position);
    }

    public boolean isLoaded(int cx, int cz) {
        return T.isLoaded.invoke(getRaw(), cx, cz);
    }

    public ChunkHandle getChunkIfLoaded(int cx, int cz) {
        return T.getChunkIfLoaded.invoke(getRaw(), cx, cz);
    }

    public ChunkHandle getChunkAt(int cx, int cz) {
        return T.getChunkAt.invoke(getRaw(), cx, cz);
    }


    public void saveLoadedChunk(ChunkHandle chunk) {
        if (T.saveChunk_new.isAvailable()) {
            T.saveChunk_new.invoke(getRaw(), chunk);
        } else {
            T.saveChunk_old.invoke(getRaw(), chunk, false);
        }
    }
    public Object getChunkLoader() {
        return T.chunkLoader.get(getRaw());
    }

    public void setChunkLoader(Object value) {
        T.chunkLoader.set(getRaw(), value);
    }

    public WorldServerHandle getWorld() {
        return T.world.get(getRaw());
    }

    public void setWorld(WorldServerHandle value) {
        T.world.set(getRaw(), value);
    }

    /**
     * Stores class members for <b>net.minecraft.server.ChunkProviderServer</b>.
     * Methods, fields, and constructors can be used without using Handle Objects.
     */
    public static final class ChunkProviderServerClass extends Template.Class<ChunkProviderServerHandle> {
        public final Template.Field.Converted<Object> chunkLoader = new Template.Field.Converted<Object>();
        public final Template.Field.Converted<WorldServerHandle> world = new Template.Field.Converted<WorldServerHandle>();

        public final Template.Method.Converted<List<BiomeMetaHandle>> getBiomeSpawnInfo = new Template.Method.Converted<List<BiomeMetaHandle>>();
        public final Template.Method<Boolean> isLoaded = new Template.Method<Boolean>();
        public final Template.Method.Converted<ChunkHandle> getChunkIfLoaded = new Template.Method.Converted<ChunkHandle>();
        public final Template.Method.Converted<ChunkHandle> getChunkAt = new Template.Method.Converted<ChunkHandle>();
        @Template.Optional
        public final Template.Method.Converted<Void> saveChunk_old = new Template.Method.Converted<Void>();
        @Template.Optional
        public final Template.Method.Converted<Void> saveChunk_new = new Template.Method.Converted<Void>();

    }

}

