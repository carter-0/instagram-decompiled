package com.facebook.compphoto.sdk.hollywood.io;

import X.0dV;
import X.RV7;
import com.facebook.compphoto.sdk.hollywood.data.MediaEvents;
import com.facebook.jni.HybridData;

public final class MediaEventsParser {
    public static final RV7 Companion = new Object();
    public final HybridData mHybridData = initHybridNative();

    private final native HybridData initHybridNative();

    private final native MediaEvents parseFileNative(String str);

    private final native MediaEvents parseJsonNative(String str);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.RV7, java.lang.Object] */
    static {
        0dV.A0C("compphoto-hollywood-io");
    }
}
