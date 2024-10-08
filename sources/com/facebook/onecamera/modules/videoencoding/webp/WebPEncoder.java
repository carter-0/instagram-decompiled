package com.facebook.onecamera.modules.videoencoding.webp;

import X.0dV;
import X.JTQ;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

public class WebPEncoder {
    public final AtomicBoolean mDestructed = JTQ.A0k();
    public HybridData mHybridData = initHybrid();

    private native HybridData initHybrid();

    public native int addFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4);

    public native ByteBuffer assemble();

    public native int prepare(int i, int i2, boolean z);

    static {
        0dV.A0C("webpencoder-native");
    }
}
