package com.instagram.libyuv;

import X.0dV;
import java.nio.ByteBuffer;

public final class IgYuvColorConverter {
    public static final IgYuvColorConverter INSTANCE = new Object();

    public static final native int nativeConvertAndroid420ToI420(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, ByteBuffer byteBuffer4, int i5, ByteBuffer byteBuffer5, int i6, ByteBuffer byteBuffer6, int i7, int i8, int i9);

    public static final native int nativeConvertI420ToABGR(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5, int i6);

    public static final native int nativeConvertI420ToNV21(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, int i6, int i7);

    public static final native int nativeConvertNV21ToI420(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, int i6, int i7);

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.libyuv.IgYuvColorConverter, java.lang.Object] */
    static {
        0dV.A0C("ig_libyuv_jni");
    }
}
