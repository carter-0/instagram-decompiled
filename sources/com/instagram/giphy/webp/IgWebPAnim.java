package com.instagram.giphy.webp;

import X.0dV;
import X.0qQ;
import X.AnonymousClass73L;
import com.facebook.jni.HybridData;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

public final class IgWebPAnim {
    public static final AnonymousClass73L Companion = new Object();
    public final AtomicBoolean destructed = new AtomicBoolean(false);
    public HybridData mHybridData = initHybrid();

    private final native HybridData initHybrid();

    private final native IgWebPAnimDecoder nativeCreateDecoder();

    private final native void prepareFromFile(String str);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.73L, java.lang.Object] */
    static {
        0dV.A0C("webpdecoder-native");
    }

    public IgWebPAnim(File file) {
        String path = file.getPath();
        0qQ.A07(path);
        prepareFromFile(path);
    }

    public final IgWebPAnimDecoder createDecoder() {
        return nativeCreateDecoder();
    }
}
