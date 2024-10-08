package X;

import android.graphics.Matrix;

/* renamed from: X.5tQ  reason: invalid class name and case insensitive filesystem */
public abstract class C298435tQ {
    public static final void A00(Matrix matrix, float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[12];
        float f11 = fArr[13];
        float f12 = fArr[15];
        fArr[0] = f;
        fArr[1] = f5;
        fArr[2] = f10;
        fArr[3] = f2;
        fArr[4] = f6;
        fArr[5] = f11;
        fArr[6] = f4;
        fArr[7] = f8;
        fArr[8] = f12;
        matrix.setValues(fArr);
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f7;
        fArr[7] = f8;
        fArr[8] = f9;
    }

    public static final void A01(Matrix matrix, float[] fArr) {
        float[] fArr2 = fArr;
        matrix.getValues(fArr2);
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        float f4 = fArr2[3];
        float f5 = fArr2[4];
        float f6 = fArr2[5];
        float f7 = fArr2[6];
        float f8 = fArr2[7];
        float f9 = fArr2[8];
        fArr2[0] = f;
        fArr2[1] = f4;
        fArr2[2] = 0.0f;
        fArr2[3] = f7;
        fArr2[4] = f2;
        fArr2[5] = f5;
        fArr2[6] = 0.0f;
        fArr2[7] = f8;
        fArr2[8] = 0.0f;
        fArr2[9] = 0.0f;
        fArr2[10] = 1.0f;
        fArr2[11] = 0.0f;
        fArr2[12] = f3;
        fArr2[13] = f6;
        fArr2[14] = 0.0f;
        fArr2[15] = f9;
    }
}
