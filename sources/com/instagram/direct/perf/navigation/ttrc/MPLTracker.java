package com.instagram.direct.perf.navigation.ttrc;

import X.0dV;
import X.0kg;
import X.0wb;
import X.C3031967u;
import com.facebook.jni.HybridData;

public final class MPLTracker {
    public static final C3031967u Companion = new Object();
    public static boolean isNativeLibraryLoaded = true;
    public final HybridData mHybridData;

    private final native HybridData initHybrid();

    public final native boolean getIsCurrentSyncGroupStateCompleted();

    public final native void registerMPLTTRCListenerSessionedNotifications(Object obj);

    public final native void stopTrackingInteraction(int i, int i2);

    public final native void syncTamGroupStateListenForCompletion();

    public final native void trackSyncGroup(int i, int i2);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.67u, java.lang.Object] */
    static {
        0dV.A0C("mpl-tracker");
    }

    public final HybridData getMHybridData() {
        return this.mHybridData;
    }

    public final boolean isReady() {
        if (!isNativeLibraryLoaded || this.mHybridData == null) {
            return false;
        }
        return true;
    }

    public MPLTracker() {
        HybridData hybridData;
        if (isNativeLibraryLoaded) {
            hybridData = initHybrid();
        } else {
            hybridData = null;
        }
        this.mHybridData = hybridData;
        if (!isNativeLibraryLoaded) {
            0wb.A01(0kg.A09, "MPLTracker", "Failed to load library when initializing MPLTracker");
        }
    }
}
