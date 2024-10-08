package X;

import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import java.nio.FloatBuffer;

public final class W1E {
    public static final FloatBuffer A0B;
    public static final FloatBuffer A0C;
    public static final float[] A0D;
    public static final float[] A0E;
    public static final float[] A0F;
    public C17555Va9 A00 = new C17555Va9();
    public final float[] A01;
    public volatile float A02;
    public volatile float A03;
    public volatile float A04;
    public volatile float A05;
    public volatile int A06;
    public volatile int A07;
    public volatile int A08;
    public volatile int A09;
    public volatile boolean A0A;

    static {
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        A0E = fArr;
        float[] fArr2 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        A0F = fArr2;
        float[] fArr3 = new float[16];
        A0D = fArr3;
        Matrix.setIdentityM(fArr3, 0);
        FloatBuffer A0e = C13990Tnq.A0e(fArr, 32);
        A0e.position(0);
        A0B = A0e;
        FloatBuffer A0e2 = C13990Tnq.A0e(fArr2, 32);
        A0e2.position(0);
        A0C = A0e2;
    }

    public static void A00(int i, String str) {
        if (i < 0) {
            throw C13989Tnp.A0l("Unable to locate '", str);
        }
    }

    public W1E() {
        float[] fArr = new float[16];
        this.A01 = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    public static void A01(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            String A0g = 002.A0g(str, ": glError 0x", Integer.toHexString(glGetError));
            Log.e("LayoutRenderer", A0g);
            throw new RuntimeException(A0g);
        }
    }
}
