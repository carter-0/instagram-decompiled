package X;

import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;

/* renamed from: X.Vst  reason: case insensitive filesystem */
public final class C18498Vst {
    public static final float[] A06;
    public static final float[] A07;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;

    static {
        float[] fArr = new float[16];
        A06 = fArr;
        Matrix.setIdentityM(fArr, 0);
        float[] fArr2 = new float[16];
        A07 = fArr2;
        Matrix.setIdentityM(fArr2, 0);
        Matrix.translateM(fArr2, 0, 0.0f, 1.0f, 0.0f);
        Matrix.scaleM(fArr2, 0, 1.0f, -1.0f, 1.0f);
    }

    public static void A00(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 1285 && glGetError != 0) {
            String A0g = 002.A0g(str, ": glError 0x", Integer.toHexString(glGetError));
            Log.e("Texture2dProgram", A0g);
            throw new RuntimeException(A0g);
        }
    }
}
