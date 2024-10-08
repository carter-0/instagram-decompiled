package com.facebook.common.restricks;

import X.0KC;
import X.0dV;
import X.0qQ;
import android.content.res.AssetManager;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class FBAssetManager {
    public static final FBAssetManager INSTANCE = new Object();
    public static ConcurrentLinkedQueue loadedResources = new ConcurrentLinkedQueue();
    public static boolean resourceCoverageEnabled = false;
    public static AssetManager targetAssetManager;

    public static final native void initColorResourceInterceptionProxies();

    public static final native void initJNIProxy();

    public static final native void initLoadResourceValueProxy();

    public static final native void initResourceCoverage();

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.common.restricks.FBAssetManager, java.lang.Object] */
    static {
        try {
            0dV.A0C("restricks");
            initJNIProxy();
        } catch (Throwable th) {
            0KC.A0J("FBAssetManager", "Error initializing FBAssetManager", th);
        }
    }

    public static final void onAssetLoaded(String str) {
        loadedResources.add(str);
    }

    public static final void onResourceValueLoaded(Object obj, int i) {
        if (0qQ.A0K(obj, targetAssetManager)) {
            0KC.A0E("FBAssetManager", "No loadResourceValueListener is available in onResourceValueLoaded");
        }
    }

    public static final int interceptLoadedColorValue(int i, int i2) {
        return i2;
    }
}
