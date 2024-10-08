package com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.gainmap;

import X.0qQ;
import X.C376409Hw;
import android.opengl.Matrix;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import java.util.Arrays;

public final class GainmapFilter implements FilterModel {
    public static final Parcelable.Creator CREATOR = new C376409Hw(16);
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public int A09;
    public boolean A0A;
    public boolean A0B;
    public final String A0C;
    public final float[] A0D;
    public final float[] A0E;
    public final float[] A0F;
    public final TransformMatrixParams A0G;
    public final float[] A0H;

    public GainmapFilter() {
        this((String) null, (float[]) null, (float[]) null, 0.0f, 63);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeFloat(this.A07);
        parcel.writeString(this.A0C);
        parcel.writeFloatArray(this.A0F);
        parcel.writeFloatArray(this.A0D);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeParcelable(this.A0G, i);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ GainmapFilter(java.lang.String r15, float[] r16, float[] r17, float r18, int r19) {
        /*
            r14 = this;
            r11 = r17
            r10 = r16
            r9 = r15
            r12 = r18
            r1 = 0
            r0 = r19 & 1
            if (r0 == 0) goto L_0x000e
            r12 = 1065353216(0x3f800000, float:1.0)
        L_0x000e:
            r0 = r19 & 2
            if (r0 == 0) goto L_0x0014
            java.lang.String r9 = "gainmap"
        L_0x0014:
            r0 = r19 & 4
            if (r0 == 0) goto L_0x001c
            float[] r10 = X.C366498p3.A00()
        L_0x001c:
            r0 = r19 & 8
            if (r0 == 0) goto L_0x0024
            float[] r11 = X.C366498p3.A00()
        L_0x0024:
            r0 = r19 & 16
            r13 = 0
            if (r0 == 0) goto L_0x002a
            r13 = 1
        L_0x002a:
            r0 = r19 & 32
            if (r0 == 0) goto L_0x003c
            r8 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r1 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams
            r3 = r2
            r6 = r5
            r7 = r5
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
        L_0x003c:
            r7 = r14
            r8 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.gainmap.GainmapFilter.<init>(java.lang.String, float[], float[], float, int):void");
    }

    public final void A00(float f) {
        boolean z;
        float pow;
        double d = (double) f;
        float log = (float) Math.log(d);
        float log2 = (float) Math.log((double) this.A06);
        this.A08 = Math.max(Math.min((log - log2) / (((float) Math.log((double) this.A05)) - log2), 1.0f), 0.0f);
        float[] fArr = this.A0H;
        float[] fArr2 = this.A0E;
        float f2 = fArr[0];
        float pow2 = (float) Math.pow(d, (double) (1.0f / f2));
        fArr2[0] = f2;
        fArr2[1] = fArr[1] * pow2;
        fArr2[2] = fArr[2] * pow2;
        fArr2[3] = fArr[3] * f;
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[5] * f;
        fArr2[6] = fArr[6] * f;
        float[] fArr3 = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        float f3 = fArr2[3];
        float f4 = fArr2[4];
        float f5 = (f3 * f4) + fArr2[6];
        float pow3 = ((float) Math.pow((double) ((fArr2[1] * f4) + fArr2[2]), (double) fArr2[0])) + fArr2[5];
        if (Math.abs(f5 - pow3) <= 0.001953125f) {
            float f6 = (f5 + pow3) / 2.0f;
            fArr3[4] = f6;
            if (f6 > 0.0f) {
                fArr3[3] = 1.0f / fArr2[3];
                fArr3[6] = (-fArr2[6]) / fArr2[3];
            }
            float f7 = fArr2[0];
            float pow4 = (float) Math.pow((double) fArr2[1], (double) (-f7));
            fArr3[0] = 1.0f / f7;
            fArr3[1] = pow4;
            float f8 = -pow4;
            float f9 = f8 * fArr2[5];
            fArr3[2] = f9;
            fArr3[5] = (-fArr2[2]) / fArr2[1];
            if (pow4 >= 0.0f) {
                float f10 = fArr3[4];
                if ((pow4 * f10) + f9 < 0.0f) {
                    fArr3[2] = f8 * f10;
                }
                float f11 = fArr3[2];
                if ((pow4 * f10) + f11 >= 0.0f) {
                    float f12 = 1.0f * 1.0f;
                    if (f12 < fArr2[4]) {
                        pow = fArr2[3] * f12 * fArr2[6];
                    } else {
                        pow = ((float) Math.pow((double) ((fArr2[1] * f12) + fArr2[2]), (double) fArr2[0])) + fArr2[5];
                    }
                    float f13 = 1.0f * pow;
                    float f14 = 1.0f;
                    if (f13 < 0.0f) {
                        f14 = -1.0f;
                    }
                    float f15 = f13 * f14;
                    if (f15 < fArr3[4]) {
                        fArr3[6] = 1.0f - ((f14 * fArr3[3]) * f15);
                    } else {
                        fArr3[5] = 1.0f - (f14 * ((float) Math.pow((double) ((fArr3[1] * f15) + f11), (double) fArr3[0])));
                    }
                    float f16 = fArr3[0];
                    float f17 = fArr3[1];
                    float f18 = fArr3[2];
                    float f19 = fArr3[3];
                    float f20 = fArr3[4];
                    float f21 = f17 + f18 + f19 + f20 + fArr3[5] + fArr3[6] + f16;
                    if (!Float.isInfinite(f21) && !Float.isNaN(f21) && f17 >= 0.0f && f19 >= 0.0f && f20 >= 0.0f && f16 >= 0.0f && (f17 * f20) + f18 >= 0.0f) {
                        System.arraycopy(fArr3, 0, fArr2, 0, 7);
                        z = true;
                        this.A0B = z;
                    }
                }
            }
        }
        z = false;
        this.A0B = z;
    }

    public final void A01(boolean z) {
        float[] fArr = this.A0D;
        Matrix.setIdentityM(fArr, 0);
        if (z) {
            Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        }
    }

    public final /* bridge */ /* synthetic */ FilterModel deepCopy() {
        float f = this.A07;
        String str = this.A0C;
        float[] fArr = this.A0F;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        0qQ.A07(copyOf);
        float[] fArr2 = this.A0D;
        float[] copyOf2 = Arrays.copyOf(fArr2, fArr2.length);
        0qQ.A07(copyOf2);
        return new GainmapFilter(str, copyOf, copyOf2, f, 48);
    }

    public final float[] getContentTransform() {
        return this.A0D;
    }

    public final String getFilterName() {
        return this.A0C;
    }

    public final float[] getTextureTransform() {
        return this.A0F;
    }

    public final TransformMatrixParams getTransformMatrixParams() {
        return this.A0G;
    }

    public final boolean isEnabled() {
        return this.A0A;
    }

    public final void setEnabled(boolean z) {
        this.A0A = z;
    }

    public GainmapFilter(TransformMatrixParams transformMatrixParams, String str, float[] fArr, float[] fArr2, float f, boolean z) {
        0qQ.A0B(str, 2);
        0qQ.A0B(fArr, 3);
        0qQ.A0B(fArr2, 4);
        0qQ.A0B(transformMatrixParams, 6);
        this.A07 = f;
        this.A0C = str;
        this.A0F = fArr;
        this.A0D = fArr2;
        this.A0A = z;
        this.A0G = transformMatrixParams;
        this.A08 = 1.0f;
        this.A06 = 1.0f;
        this.A05 = 1.0f;
        this.A04 = 1.0f;
        this.A03 = 1.0f;
        this.A02 = 1.0f;
        this.A01 = 1.0f;
        this.A00 = 1.0f;
        this.A0H = new float[]{2.4f, 0.94786733f, 0.052132703f, 0.07739938f, 0.04045f, 0.0f, 0.0f};
        this.A0E = new float[7];
    }
}
