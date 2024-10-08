package com.facebook.cameracore.ardelivery.compression.tarbrotli;

import X.0dV;
import com.facebook.jni.HybridData;

public class TarBrotliDecompressor {
    public final HybridData mHybridData = initHybrid();

    public static native HybridData initHybrid();

    private native int unarchiveFile(String str, String str2);

    static {
        0dV.A0C("tar-brotli-archive-native");
    }
}
