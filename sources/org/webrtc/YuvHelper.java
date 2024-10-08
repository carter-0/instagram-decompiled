package org.webrtc;

import X.C51971G9r;
import java.nio.ByteBuffer;

public class YuvHelper {
    public static native void nativeABGRToI420(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5, int i6);

    public static native void nativeCopyPlane(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3, int i4);

    public static native void nativeI420Copy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, ByteBuffer byteBuffer6, int i6, int i7, int i8);

    public static native void nativeI420Rotate(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, ByteBuffer byteBuffer6, int i6, int i7, int i8, int i9);

    public static native void nativeI420ToNV12(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, int i6, int i7);

    public static void I420Copy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5) {
        int i6 = i5;
        int i7 = i4;
        int i8 = (i4 + 1) / 2;
        int i9 = i4 * i5;
        int i10 = ((i5 + 1) / 2) * i8;
        int i11 = (i10 * 2) + i9;
        ByteBuffer byteBuffer5 = byteBuffer4;
        if (byteBuffer5.capacity() >= i11) {
            byteBuffer5.position(0);
            ByteBuffer slice = byteBuffer5.slice();
            byteBuffer5.position(i9);
            ByteBuffer slice2 = byteBuffer5.slice();
            byteBuffer5.position(i10 + i9);
            nativeI420Copy(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, slice, i7, slice2, i8, byteBuffer5.slice(), i8, i7, i6);
            return;
        }
        throw C51971G9r.A0l("Expected destination buffer capacity to be at least ", " was ", i11, byteBuffer5.capacity());
    }

    public static void I420ToNV12(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5) {
        int i6 = i4;
        int i7 = (i4 + 1) / 2;
        int i8 = i5;
        int i9 = i4 * i5;
        int i10 = (((i5 + 1) / 2) * i7 * 2) + i9;
        ByteBuffer byteBuffer5 = byteBuffer4;
        if (byteBuffer5.capacity() >= i10) {
            byteBuffer5.position(0);
            ByteBuffer slice = byteBuffer5.slice();
            byteBuffer5.position(i9);
            nativeI420ToNV12(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, slice, i6, byteBuffer5.slice(), i7 * 2, i6, i8);
            return;
        }
        throw C51971G9r.A0l("Expected destination buffer capacity to be at least ", " was ", i10, byteBuffer5.capacity());
    }

    public static void copyPlane(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3, int i4) {
        nativeCopyPlane(byteBuffer, i, byteBuffer2, i2, i3, i4);
    }

    public static void ABGRToI420(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5, int i6) {
        nativeABGRToI420(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, i5, i6);
    }

    public static void I420Rotate(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, ByteBuffer byteBuffer6, int i6, int i7, int i8, int i9) {
        nativeI420Rotate(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, byteBuffer5, i5, byteBuffer6, i6, i7, i8, i9);
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, ByteBuffer byteBuffer6, int i6, int i7, int i8) {
        nativeI420Copy(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, byteBuffer5, i5, byteBuffer6, i6, i7, i8);
    }

    public static void I420ToNV12(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, int i6, int i7) {
        nativeI420ToNV12(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, byteBuffer5, i5, i6, i7);
    }

    public static void I420Rotate(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5, int i6) {
        int i7 = i6;
        int i8 = i5;
        int i9 = i8;
        int i10 = i4;
        int i11 = i10;
        if (i7 % 180 == 0) {
            i9 = i11;
            i11 = i8;
        }
        int i12 = (i11 + 1) / 2;
        int i13 = (i9 + 1) / 2;
        int i14 = i11 * i9;
        int i15 = i12 * i13;
        int i16 = (i15 * 2) + i14;
        ByteBuffer byteBuffer5 = byteBuffer4;
        if (byteBuffer5.capacity() >= i16) {
            byteBuffer5.position(0);
            ByteBuffer slice = byteBuffer5.slice();
            byteBuffer5.position(i14);
            ByteBuffer slice2 = byteBuffer5.slice();
            byteBuffer5.position(i15 + i14);
            nativeI420Rotate(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, slice, i9, slice2, i13, byteBuffer5.slice(), i13, i10, i8, i7);
            return;
        }
        throw C51971G9r.A0l("Expected destination buffer capacity to be at least ", " was ", i16, byteBuffer5.capacity());
    }
}
