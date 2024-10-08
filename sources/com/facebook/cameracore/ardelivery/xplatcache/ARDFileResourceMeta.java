package com.facebook.cameracore.ardelivery.xplatcache;

import X.0dV;
import com.facebook.jni.HybridClassBase;
import java.nio.ByteBuffer;

public class ARDFileResourceMeta extends HybridClassBase {
    public native ByteBuffer getExtra();

    static {
        0dV.A0C("ardcache-jni");
    }
}
