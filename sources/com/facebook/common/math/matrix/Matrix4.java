package com.facebook.common.math.matrix;

import X.0qQ;
import X.C376409Hw;
import X.C376429Hy;
import android.opengl.Matrix;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.FloatBuffer;

public final class Matrix4 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C376409Hw(26);
    public final FloatBuffer A00;
    public final float[] A01;

    public final C376429Hy A00(C376429Hy r15) {
        0qQ.A0B(r15, 0);
        C376429Hy r7 = new C376429Hy(0.0f, 0.0f, 15, 0.0f, 0, 0.0f);
        float[] fArr = this.A01;
        float f = fArr[0] * r15.A01;
        float f2 = fArr[4];
        float f3 = r15.A02;
        float f4 = f + (f2 * f3);
        float f5 = fArr[8];
        float f6 = r15.A03;
        float f7 = f4 + (f5 * f6);
        float f8 = fArr[12];
        float f9 = r15.A00;
        r7.A01 = f7 + (f8 * f9);
        float f10 = fArr[1];
        float f11 = r15.A01;
        r7.A02 = (f10 * f11) + (fArr[5] * f3) + (fArr[9] * f6) + (fArr[13] * f9);
        float f12 = fArr[6];
        float f13 = r15.A02;
        r7.A03 = (fArr[2] * f11) + (f12 * f13) + (fArr[10] * f6) + (fArr[14] * f9);
        r7.A00 = (fArr[3] * f11) + (fArr[7] * f13) + (fArr[11] * r15.A03) + (fArr[15] * f9);
        return r7;
    }

    public final void A04(Matrix4 matrix4) {
        0qQ.A0B(matrix4, 0);
        System.arraycopy(matrix4.A01, 0, this.A01, 0, 16);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeFloatArray(this.A00.array());
    }

    public final void A01(float f) {
        Matrix.rotateM(this.A01, 0, f, 0.0f, 0.0f, 1.0f);
    }

    public final void A02(float f, float f2) {
        Matrix.scaleM(this.A01, 0, f, f2, 1.0f);
    }

    public final void A03(float f, float f2, float f3) {
        Matrix.translateM(this.A01, 0, f, f2, f3);
    }

    public final void A05(float[] fArr) {
        float[] fArr2 = new float[16];
        float[] fArr3 = this.A01;
        Matrix.multiplyMM(fArr2, 0, fArr3, 0, fArr, 0);
        System.arraycopy(fArr2, 0, fArr3, 0, 16);
    }

    public Matrix4(Matrix4 matrix4) {
        float[] fArr = new float[16];
        this.A01 = fArr;
        FloatBuffer wrap = FloatBuffer.wrap(fArr);
        0qQ.A07(wrap);
        this.A00 = wrap;
        System.arraycopy(matrix4.A01, 0, fArr, 0, 16);
    }

    public Matrix4(Parcel parcel) {
        float[] fArr = new float[16];
        this.A01 = fArr;
        FloatBuffer wrap = FloatBuffer.wrap(fArr);
        0qQ.A07(wrap);
        this.A00 = wrap;
        parcel.readFloatArray(fArr);
    }

    public Matrix4() {
        float[] fArr = new float[16];
        this.A01 = fArr;
        FloatBuffer wrap = FloatBuffer.wrap(fArr);
        0qQ.A07(wrap);
        this.A00 = wrap;
        Matrix.setIdentityM(this.A01, 0);
    }
}
