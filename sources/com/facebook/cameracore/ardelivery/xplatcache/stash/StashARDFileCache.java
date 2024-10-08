package com.facebook.cameracore.ardelivery.xplatcache.stash;

import X.0dV;
import android.os.Looper;
import com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache;
import com.facebook.cameracore.ardelivery.xplatcache.ARDFileCacheEntry;
import com.facebook.cameracore.ardelivery.xplatcache.ARDFileInMemoryStatus;
import com.facebook.jni.HybridData;
import com.facebook.stash.core.FileStash;
import java.io.File;
import java.util.Map;
import java.util.Set;

public class StashARDFileCache extends ARDFileCache {
    public static final StashARDFileCache $redex_init_class = null;
    public final FileStash mStash;

    public static native HybridData initHybrid(long j, FileStash fileStash);

    public void commit(String str) {
    }

    public void unlock(String str) {
    }

    static {
        0dV.A0C("ardcache-stash");
    }

    public void clear() {
        this.mStash.removeAll();
    }

    public void flush() {
        throw new UnsupportedOperationException("flush() is not supported in Stash");
    }

    public Map.Entry[] getAllMetas() {
        throw new UnsupportedOperationException("getAllMetas() is not supported in Stash");
    }

    public ARDFileCacheEntry getCacheEntry(String str) {
        File file = this.mStash.getFile(str);
        if (file != null) {
            return new ARDFileCacheEntry(file.getAbsolutePath());
        }
        return null;
    }

    public ARDFileCacheEntry getCacheEntryWithoutPromotion(String str) {
        if (!this.mStash.hasKey(str)) {
            return null;
        }
        return new ARDFileCacheEntry(this.mStash.getFilePath(str).getAbsolutePath());
    }

    public long getSize() {
        return this.mStash.getSizeBytes();
    }

    public ARDFileCacheEntry insertAndLock(String str) {
        return new ARDFileCacheEntry(this.mStash.insertFile(str).getAbsolutePath());
    }

    public ARDFileInMemoryStatus memContains(String str) {
        if (this.mStash.hasKey(str)) {
            return ARDFileInMemoryStatus.IN_CACHE;
        }
        return ARDFileInMemoryStatus.NOT_IN_CACHE;
    }

    public boolean remove(String str) {
        return this.mStash.remove(str);
    }

    public boolean updateExtra(String str, byte[] bArr) {
        throw new UnsupportedOperationException("updateExtra() is not supported in Stash");
    }

    public StashARDFileCache(long j, FileStash fileStash) {
        this.mStash = fileStash;
        this.mHybridData = initHybrid(j, fileStash);
    }

    public Set getAllKeys() {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            return this.mStash.getAllKeys();
        }
        throw new IllegalStateException("StashARDFileCache.getAllKeys() shouldn't be called on the main thread.");
    }
}
