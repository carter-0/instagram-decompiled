package X;

import android.opengl.Matrix;

/* renamed from: X.8mo  reason: invalid class name and case insensitive filesystem */
public abstract class C365268mo {
    public static void A00(float[] fArr) {
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
        Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
    }

    public static void A01(float[] fArr) {
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
    }

    public static void A02(float[] fArr, float f) {
        float f2 = f;
        if (f != 0.0f) {
            float[] fArr2 = fArr;
            Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
            Matrix.rotateM(fArr2, 0, f2, 0.0f, 0.0f, 1.0f);
            Matrix.translateM(fArr2, 0, -0.5f, -0.5f, 0.0f);
        }
    }
}
