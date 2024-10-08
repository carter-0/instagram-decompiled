package com.facebook.pando;

import X.0dV;
import X.RW7;
import java.nio.ByteBuffer;

public final class TreeSerializer {
    public static final RW7 Companion = new Object();

    public static final native TreeJNI deserializeFromBytesNative(ByteBuffer byteBuffer, Class cls);

    public static final native ByteBuffer serializeAsBytes(TreeJNI treeJNI);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.RW7, java.lang.Object] */
    static {
        0dV.A0C("pando-serialize-jni");
    }
}
