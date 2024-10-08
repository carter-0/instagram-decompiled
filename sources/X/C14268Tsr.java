package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: X.Tsr  reason: case insensitive filesystem */
public abstract class C14268Tsr {
    public static final float[][] A00 = {new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f}, new float[]{1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f}, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f}, new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f}, new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f}, new float[]{0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f}, new float[]{1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f}, new float[]{1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}};

    public static final FloatBuffer A01(float[] fArr) {
        0qQ.A0B(fArr, 0);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        return asFloatBuffer;
    }

    public static final float[] A02(float f, float f2, float f3) {
        float f4 = (f3 - 0.5f) / 0.5f;
        if (f >= f2) {
            float f5 = (f * 2.0f) / f2;
            float f6 = ((-f5) / 2.0f) + (f4 * ((f5 - 2.0f) / 2.0f));
            float f7 = f5 + f6;
            return new float[]{f6, 1.0f, f7, 1.0f, f6, -1.0f, f7, -1.0f};
        }
        float f8 = ((1.0f / f) * 2.0f) / (1.0f / f2);
        float f9 = ((-f8) / 2.0f) + (f4 * ((f8 - 2.0f) / 2.0f));
        float f10 = f8 + f9;
        return new float[]{-1.0f, f10, 1.0f, f10, -1.0f, f9, 1.0f, f9};
    }

    public static final C14270Tst A00() {
        FloatBuffer A01 = A01(A02(1.0f, 1.0f, 0.5f));
        float[][] fArr = A00;
        return new C14270Tst(A01, A01(fArr[0]), A01(fArr[4]));
    }
}
