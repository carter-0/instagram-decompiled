package com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition;

import X.0qQ;
import X.SWS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import java.util.Arrays;

public final class PanFilter implements FilterModel {
    public static final Parcelable.Creator CREATOR = new SWS(53);
    public float A00;
    public int A01;
    public boolean A02;
    public final TransformMatrixParams A03;
    public final String A04;
    public final float[] A05;
    public final float[] A06;

    public PanFilter(TransformMatrixParams transformMatrixParams, String str, float[] fArr, float[] fArr2, float f, int i, boolean z) {
        0qQ.A0B(str, 1);
        0qQ.A0B(fArr, 2);
        0qQ.A0B(fArr2, 3);
        0qQ.A0B(transformMatrixParams, 7);
        this.A04 = str;
        this.A06 = fArr;
        this.A05 = fArr2;
        this.A00 = f;
        this.A01 = i;
        this.A02 = z;
        this.A03 = transformMatrixParams;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeFloatArray(this.A06);
        parcel.writeFloatArray(this.A05);
        parcel.writeFloat(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeParcelable(this.A03, i);
    }

    public final /* bridge */ /* synthetic */ FilterModel deepCopy() {
        String str = this.A04;
        float[] fArr = this.A06;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        0qQ.A07(copyOf);
        float[] fArr2 = this.A05;
        float[] copyOf2 = Arrays.copyOf(fArr2, fArr2.length);
        0qQ.A07(copyOf2);
        return new PanFilter(new TransformMatrixParams(this.A03), str, copyOf, copyOf2, this.A00, this.A01, this.A02);
    }

    public final float[] getContentTransform() {
        return this.A05;
    }

    public final String getFilterName() {
        return this.A04;
    }

    public final float[] getTextureTransform() {
        return this.A06;
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

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PanFilter() {
        /*
            r16 = this;
            java.lang.String r10 = "normal"
            float[] r11 = X.C366498p3.A00()
            float[] r12 = X.C366498p3.A00()
            r3 = 1065353216(0x3f800000, float:1.0)
            r7 = 0
            r15 = 1
            r4 = 0
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r0 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams
            r2 = r1
            r5 = r4
            r6 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8 = r16
            r9 = r0
            r13 = r3
            r14 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.PanFilter.<init>():void");
    }
}
