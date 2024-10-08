package org.pytorch;

import X.002;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C21100XEp;
import X.C22507Y7a;
import X.Pxg;
import X.XF6;
import X.XF7;
import com.facebook.jni.HybridData;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.LongBuffer;
import java.util.Arrays;
import java.util.Locale;

public abstract class Tensor {
    public HybridData mHybridData;
    public final XF6 memoryFormat;
    public final long[] shape;

    public static void checkShape(long[] jArr) {
        boolean z = false;
        if (jArr != null) {
            z = true;
        }
        checkArgument(z, "Shape must be not null", new Object[0]);
        for (long j : jArr) {
            boolean z2 = false;
            if (j >= 0) {
                z2 = true;
            }
            checkArgument(z2, "Shape elements must be non negative", new Object[0]);
        }
    }

    public abstract XF7 dtype();

    public abstract Buffer getRawDataBuffer();

    public static FloatBuffer allocateFloatBuffer(int i) {
        return ByteBuffer.allocateDirect(i * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static void checkArgument(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(Locale.US, str, objArr));
        }
    }

    public static Tensor fromBlob(long[] jArr, long[] jArr2) {
        XF6 xf6 = XF6.CONTIGUOUS;
        checkShape(jArr2);
        checkShapeAndDataCapacityConsistency(jArr.length, jArr2);
        checkShape(jArr2);
        int i = 1;
        for (long j : jArr2) {
            i = (int) (((long) i) * j);
        }
        LongBuffer asLongBuffer = Pxg.A13(((int) ((long) i)) * 8).asLongBuffer();
        asLongBuffer.put(jArr);
        return new C22507Y7a(asLongBuffer, xf6, jArr2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (3 == r6) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.pytorch.Tensor nativeNewTensor(java.nio.ByteBuffer r3, long[] r4, int r5, int r6, com.facebook.jni.HybridData r7) {
        /*
            X.XF6 r2 = X.XF6.CONTIGUOUS
            X.XF6 r1 = X.XF6.CHANNELS_LAST
            r0 = 2
            if (r0 == r6) goto L_0x000c
            X.XF6 r1 = X.XF6.CHANNELS_LAST_3D
            r0 = 3
            if (r0 != r6) goto L_0x000d
        L_0x000c:
            r2 = r1
        L_0x000d:
            r0 = 4
            r1 = 0
            if (r0 != r5) goto L_0x001d
            java.nio.FloatBuffer r0 = r3.asFloatBuffer()
            X.XEp r1 = new X.XEp
            r1.<init>(r0, r2, r4)
        L_0x001a:
            r1.mHybridData = r7
            return r1
        L_0x001d:
            r0 = 3
            if (r0 != r5) goto L_0x002a
            java.nio.IntBuffer r0 = r3.asIntBuffer()
            X.Y7Z r1 = new X.Y7Z
            r1.<init>(r0, r2, r4)
            goto L_0x001a
        L_0x002a:
            r0 = 5
            if (r0 != r5) goto L_0x0037
            java.nio.LongBuffer r0 = r3.asLongBuffer()
            X.Y7a r1 = new X.Y7a
            r1.<init>(r0, r2, r4)
            goto L_0x001a
        L_0x0037:
            r0 = 6
            if (r0 != r5) goto L_0x0044
            java.nio.DoubleBuffer r0 = r3.asDoubleBuffer()
            X.Y7Y r1 = new X.Y7Y
            r1.<init>(r0, r2, r4)
            goto L_0x001a
        L_0x0044:
            r0 = 1
            if (r0 != r5) goto L_0x004d
            X.Y7c r1 = new X.Y7c
            r1.<init>(r3, r2, r4)
            goto L_0x001a
        L_0x004d:
            r0 = 2
            if (r0 != r5) goto L_0x001a
            X.Y7b r1 = new X.Y7b
            r1.<init>(r3, r2, r4)
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: org.pytorch.Tensor.nativeNewTensor(java.nio.ByteBuffer, long[], int, int, com.facebook.jni.HybridData):org.pytorch.Tensor");
    }

    public float[] getDataAsFloatArray() {
        throw AnonymousClass7TE.A0z(002.A0g("Tensor of type ", getClass().getSimpleName(), " cannot return data as float array."));
    }

    public int memoryFormatJniCode() {
        return this.memoryFormat.A00;
    }

    public Tensor(long[] jArr, XF6 xf6) {
        checkShape(jArr);
        this.shape = Arrays.copyOf(jArr, jArr.length);
        this.memoryFormat = xf6;
    }

    public static void checkShapeAndDataCapacityConsistency(int i, long[] jArr) {
        checkShape(jArr);
        int i2 = 1;
        for (long j : jArr) {
            i2 = (int) (((long) i2) * j);
        }
        long j2 = (long) i2;
        boolean z = false;
        if (j2 == ((long) i)) {
            z = true;
        }
        checkArgument(z, "Inconsistent data capacity:%d and shape number elements:%d shape:%s", Integer.valueOf(i), Long.valueOf(j2), Arrays.toString(jArr));
    }

    public int dtypeJniCode() {
        return dtype().A00;
    }

    public static Tensor fromBlob(FloatBuffer floatBuffer, long[] jArr, XF6 xf6) {
        boolean z = true;
        boolean z2 = false;
        if (floatBuffer != null) {
            z2 = true;
        }
        checkArgument(z2, "Data buffer must be not null", new Object[0]);
        checkShape(jArr);
        checkShapeAndDataCapacityConsistency(floatBuffer.capacity(), jArr);
        checkArgument(floatBuffer.isDirect(), "Data buffer must be direct (java.nio.ByteBuffer#allocateDirect)", new Object[0]);
        if (floatBuffer.order() != ByteOrder.nativeOrder()) {
            z = false;
        }
        checkArgument(z, "Data buffer must have native byte order (java.nio.ByteOrder#nativeOrder)", new Object[0]);
        return new C21100XEp(floatBuffer, xf6, jArr);
    }

    public static Tensor fromBlob(float[] fArr, long[] jArr, XF6 xf6) {
        checkArgument(AnonymousClass7TF.A1V(fArr), "Data array must be not null", new Object[0]);
        checkShape(jArr);
        checkShapeAndDataCapacityConsistency(fArr.length, jArr);
        checkShape(jArr);
        int i = 1;
        for (long j : jArr) {
            i = (int) (((long) i) * j);
        }
        FloatBuffer allocateFloatBuffer = allocateFloatBuffer((int) ((long) i));
        allocateFloatBuffer.put(fArr);
        return new C21100XEp(allocateFloatBuffer, xf6, jArr);
    }
}
