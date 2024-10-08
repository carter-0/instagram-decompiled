package com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic;

import X.0qQ;
import X.C376409Hw;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import java.util.Arrays;

public final class ColorFilter implements FilterModel {
    public static final Parcelable.Creator CREATOR = new C376409Hw(10);
    public float A00;
    public boolean A01;
    public boolean A02;
    public final TransformMatrixParams A03;
    public final String A04;
    public final boolean A05;
    public final float[] A06;
    public final float[] A07;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ColorFilter(java.lang.String r18, boolean r19) {
        /*
            r17 = this;
            r8 = 1
            r2 = r18
            X.0qQ.A0B(r2, r8)
            if (r19 == 0) goto L_0x002e
            float[] r1 = X.C366498p3.A00
            r0 = 16
            float[] r3 = new float[r0]
            X.0Yw.A0S(r1, r3, r0)
        L_0x0011:
            float[] r4 = X.C366498p3.A00()
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            r13 = 0
            java.lang.Integer r10 = X.AnonymousClass05K.A00
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r1 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams
            r9 = r1
            r11 = r10
            r12 = r5
            r14 = r13
            r15 = r13
            r16 = r6
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r0 = r17
            r7 = r6
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x002e:
            float[] r3 = X.C366498p3.A00()
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter.<init>(java.lang.String, boolean):void");
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeFloatArray(this.A07);
        parcel.writeFloatArray(this.A06);
        parcel.writeFloat(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeParcelable(this.A03, i);
    }

    public final /* bridge */ /* synthetic */ FilterModel deepCopy() {
        String str = this.A04;
        float[] fArr = this.A07;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        0qQ.A07(copyOf);
        float[] fArr2 = this.A06;
        float[] copyOf2 = Arrays.copyOf(fArr2, fArr2.length);
        0qQ.A07(copyOf2);
        return new ColorFilter(new TransformMatrixParams(this.A03), str, copyOf, copyOf2, this.A00, this.A01, this.A05, this.A02);
    }

    public final float[] getContentTransform() {
        return this.A06;
    }

    public final String getFilterName() {
        return this.A04;
    }

    public final float[] getTextureTransform() {
        return this.A07;
    }

    public final TransformMatrixParams getTransformMatrixParams() {
        return this.A03;
    }

    public final boolean isEnabled() {
        return this.A02;
    }

    public final void setEnabled(boolean z) {
        this.A02 = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ColorFilter(String str) {
        this(str, false);
        0qQ.A0B(str, 1);
    }

    public ColorFilter(TransformMatrixParams transformMatrixParams, String str, float[] fArr, float[] fArr2, float f, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(str, 1);
        0qQ.A0B(fArr, 2);
        0qQ.A0B(fArr2, 3);
        0qQ.A0B(transformMatrixParams, 8);
        this.A04 = str;
        this.A07 = fArr;
        this.A06 = fArr2;
        this.A00 = f;
        this.A01 = z;
        this.A05 = z2;
        this.A02 = z3;
        this.A03 = transformMatrixParams;
    }
}
