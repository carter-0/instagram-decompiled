package com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic;

import X.0qQ;
import X.C376409Hw;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import java.util.Arrays;
import kotlin.Deprecated;

@Deprecated(message = "Deprecated as part of https://www.internalfb.com/intern/wiki/?fbid=422423890164054. Use ValueMapFilterUtil.createMultiPassBilinearValueMapFilter to create this filter instead")
public final class GradientTransformFilter implements FilterModel {
    public static final Parcelable.Creator CREATOR = new C376409Hw(13);
    public float A00;
    public float A01;
    public float A02;
    public Bitmap A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public float[] A07;
    public float[] A08;
    public final TransformMatrixParams A09;
    public final String A0A;
    public final float[] A0B;
    public final float[] A0C;

    public GradientTransformFilter() {
        this((float[]) null, (float[]) null, 0.0f, 0.0f, 0.0f, 8191);
    }

    public GradientTransformFilter(Bitmap bitmap, TransformMatrixParams transformMatrixParams, String str, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, float f, float f2, float f3, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(fArr, 1);
        0qQ.A0B(fArr2, 2);
        0qQ.A0B(str, 10);
        0qQ.A0B(fArr3, 11);
        0qQ.A0B(fArr4, 12);
        0qQ.A0B(transformMatrixParams, 13);
        this.A08 = fArr;
        this.A07 = fArr2;
        this.A03 = bitmap;
        this.A05 = z;
        this.A02 = f;
        this.A01 = f2;
        this.A00 = f3;
        this.A06 = z2;
        this.A04 = z3;
        this.A0A = str;
        this.A0C = fArr3;
        this.A0B = fArr4;
        this.A09 = transformMatrixParams;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeFloatArray(this.A08);
        parcel.writeFloatArray(this.A07);
        parcel.writeParcelable(this.A03, i);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A00);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeString(this.A0A);
        parcel.writeFloatArray(this.A0C);
        parcel.writeFloatArray(this.A0B);
        parcel.writeParcelable(this.A09, i);
    }

    public final /* bridge */ /* synthetic */ FilterModel deepCopy() {
        float[] fArr = this.A08;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        0qQ.A07(copyOf);
        float[] fArr2 = this.A07;
        float[] copyOf2 = Arrays.copyOf(fArr2, fArr2.length);
        0qQ.A07(copyOf2);
        Bitmap bitmap = this.A03;
        boolean z = this.A05;
        float f = this.A02;
        float f2 = this.A01;
        float f3 = this.A00;
        boolean z2 = this.A06;
        boolean z3 = this.A04;
        String str = this.A0A;
        float[] fArr3 = this.A0C;
        float[] copyOf3 = Arrays.copyOf(fArr3, fArr3.length);
        0qQ.A07(copyOf3);
        float[] fArr4 = this.A0B;
        float[] copyOf4 = Arrays.copyOf(fArr4, fArr4.length);
        0qQ.A07(copyOf4);
        return new GradientTransformFilter(bitmap, new TransformMatrixParams(this.A09), str, copyOf, copyOf2, copyOf3, copyOf4, f, f2, f3, z, z2, z3);
    }

    public final float[] getContentTransform() {
        return this.A0B;
    }

    public final String getFilterName() {
        return this.A0A;
    }

    public final float[] getTextureTransform() {
        return this.A0C;
    }

    public final TransformMatrixParams getTransformMatrixParams() {
        return this.A09;
    }

    public final boolean isEnabled() {
        return this.A04;
    }

    public final void setEnabled(boolean z) {
        this.A04 = z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ GradientTransformFilter(float[] r25, float[] r26, float r27, float r28, float r29, int r30) {
        /*
            r24 = this;
            r11 = r28
            r10 = r27
            r7 = r26
            r6 = r25
            r3 = 0
            r1 = r30
            r0 = r30 & 1
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r0 == 0) goto L_0x0015
            float[] r6 = X.C366558pG.A00(r2)
        L_0x0015:
            r0 = r30 & 2
            if (r0 == 0) goto L_0x001d
            float[] r7 = X.C366558pG.A00(r2)
        L_0x001d:
            r13 = 0
            r0 = r30 & 16
            r12 = 0
            if (r0 == 0) goto L_0x0024
            r10 = 0
        L_0x0024:
            r0 = r30 & 32
            if (r0 == 0) goto L_0x0029
            r11 = 0
        L_0x0029:
            r0 = r30 & 64
            if (r0 != 0) goto L_0x002f
            r12 = r29
        L_0x002f:
            r0 = r1 & 256(0x100, float:3.59E-43)
            r15 = 0
            if (r0 == 0) goto L_0x0035
            r15 = 1
        L_0x0035:
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0071
            java.lang.String r5 = "gradient_transform"
        L_0x003b:
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x006f
            float[] r8 = X.C366498p3.A00()
        L_0x0043:
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x006d
            float[] r9 = X.C366498p3.A00()
        L_0x004b:
            r0 = r1 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x006b
            r19 = 1065353216(0x3f800000, float:1.0)
            r20 = 0
            java.lang.Integer r17 = X.AnonymousClass05K.A00
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r4 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams
            r16 = r4
            r18 = r17
            r21 = r20
            r22 = r20
            r23 = r13
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
        L_0x0064:
            r2 = r24
            r14 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        L_0x006b:
            r4 = r3
            goto L_0x0064
        L_0x006d:
            r9 = r3
            goto L_0x004b
        L_0x006f:
            r8 = r3
            goto L_0x0043
        L_0x0071:
            r5 = r3
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.GradientTransformFilter.<init>(float[], float[], float, float, float, int):void");
    }
}
