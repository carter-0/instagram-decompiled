package org.pytorch.executorch;

import X.002;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C21056XCh;
import X.C21232XQd;
import X.C22510Y7d;
import X.C22511Y7e;
import X.C22512Y7f;
import X.C22513Y7g;
import X.C22514Y7h;
import X.C22515Y7i;
import X.Pxf;
import X.Pxg;
import com.facebook.jni.HybridData;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.LongBuffer;
import java.util.Arrays;

public abstract class Tensor {
    public HybridData mHybridData;
    public final long[] shape;

    public static void checkShape(long[] jArr) {
        Object[] objArr = new Object[0];
        if (AnonymousClass7TF.A1V(jArr)) {
            int i = 0;
            while (i < jArr.length) {
                Object[] objArr2 = new Object[0];
                if (Pxf.A1R((jArr[i] > 0 ? 1 : (jArr[i] == 0 ? 0 : -1)))) {
                    i++;
                } else {
                    throw C21056XCh.A07("Shape elements must be non negative", objArr2);
                }
            }
            return;
        }
        throw C21056XCh.A07("Shape must be not null", objArr);
    }

    public static Tensor fromBlob(FloatBuffer floatBuffer, long[] jArr) {
        boolean z = true;
        Object[] objArr = new Object[0];
        if (AnonymousClass7TF.A1V(floatBuffer)) {
            checkShape(jArr);
            checkShapeAndDataCapacityConsistency(floatBuffer.capacity(), jArr);
            Object[] objArr2 = new Object[0];
            if (floatBuffer.isDirect()) {
                if (floatBuffer.order() != ByteOrder.nativeOrder()) {
                    z = false;
                }
                Object[] objArr3 = new Object[0];
                if (z) {
                    return new C22515Y7i(floatBuffer, jArr);
                }
                throw C21056XCh.A07("Data buffer must have native byte order (java.nio.ByteOrder#nativeOrder)", objArr3);
            }
            throw C21056XCh.A07("Data buffer must be direct (java.nio.ByteBuffer#allocateDirect)", objArr2);
        }
        throw C21056XCh.A07("Data buffer must be not null", objArr);
    }

    public static Tensor nativeNewTensor(ByteBuffer byteBuffer, long[] jArr, int i, HybridData hybridData) {
        Tensor y7g;
        if (6 == i) {
            y7g = new C22515Y7i(byteBuffer.asFloatBuffer(), jArr);
        } else if (3 == i) {
            y7g = new C22511Y7e(byteBuffer.asIntBuffer(), jArr);
        } else if (4 == i) {
            y7g = new C22512Y7f(byteBuffer.asLongBuffer(), jArr);
        } else if (7 == i) {
            y7g = new C22510Y7d(byteBuffer.asDoubleBuffer(), jArr);
        } else if (0 == i) {
            y7g = new C22514Y7h(byteBuffer, jArr);
        } else if (1 == i) {
            y7g = new C22513Y7g(byteBuffer, jArr);
        } else {
            throw AnonymousClass7TE.A0w("Unknown Tensor dtype");
        }
        y7g.mHybridData = hybridData;
        return y7g;
    }

    public abstract C21232XQd dtype();

    public abstract Buffer getRawDataBuffer();

    public float[] getDataAsFloatArray() {
        throw AnonymousClass7TE.A0z(002.A0g("Tensor of type ", getClass().getSimpleName(), " cannot return data as float array."));
    }

    public Tensor(long[] jArr) {
        checkShape(jArr);
        this.shape = Arrays.copyOf(jArr, jArr.length);
    }

    public static void checkShapeAndDataCapacityConsistency(int i, long[] jArr) {
        checkShape(jArr);
        int i2 = 1;
        for (long j : jArr) {
            i2 = (int) (((long) i2) * j);
        }
        long j2 = (long) i2;
        boolean A1Q = AnonymousClass7TF.A1Q((j2 > ((long) i) ? 1 : (j2 == ((long) i) ? 0 : -1)));
        Object[] objArr = {Integer.valueOf(i), Long.valueOf(j2), Arrays.toString(jArr)};
        if (!A1Q) {
            throw C21056XCh.A07("Inconsistent data capacity:%d and shape number elements:%d shape:%s", objArr);
        }
    }

    public int dtypeJniCode() {
        return dtype().A00;
    }

    public static Tensor fromBlob(long[] jArr, long[] jArr2) {
        checkShape(jArr2);
        checkShapeAndDataCapacityConsistency(jArr.length, jArr2);
        checkShape(jArr2);
        int i = 1;
        int i2 = 0;
        do {
            i = (int) (((long) i) * jArr2[i2]);
            i2++;
        } while (i2 < 2);
        LongBuffer asLongBuffer = Pxg.A13(((int) ((long) i)) * 8).asLongBuffer();
        asLongBuffer.put(jArr);
        return new C22512Y7f(asLongBuffer, jArr2);
    }

    public static Tensor fromBlob(float[] fArr, long[] jArr) {
        checkShape(jArr);
        checkShapeAndDataCapacityConsistency(fArr.length, jArr);
        checkShape(jArr);
        int i = 1;
        for (long j : jArr) {
            i = (int) (((long) i) * j);
        }
        FloatBuffer asFloatBuffer = Pxg.A13(((int) ((long) i)) * 4).asFloatBuffer();
        asFloatBuffer.put(fArr);
        return new C22515Y7i(asFloatBuffer, jArr);
    }
}
