package com.facebook.mediastreaming.opt.source.event;

import X.0dV;
import X.XV7;
import com.facebook.jni.HybridClassBase;
import java.nio.ByteBuffer;

public final class AndroidEventMessageInputSource extends HybridClassBase {
    public static final XV7 Companion = new Object();

    private final native void initHybrid();

    public final native void sendEventMessage(long j, ByteBuffer byteBuffer, long j2, long j3);

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.XV7] */
    static {
        0dV.A0C("mediastreaming");
    }

    public AndroidEventMessageInputSource() {
        initHybrid();
    }
}
