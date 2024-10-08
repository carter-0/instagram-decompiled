package com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.tiltshift;

import X.0qQ;
import X.C229632nm;
import X.C376409Hw;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import java.util.Arrays;

public final class TiltShiftOverlayFilter implements FilterModel {
    public static final Parcelable.Creator CREATOR = new C376409Hw(18);
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public PointF A04;
    public PointF A05;
    public Integer A06;
    public boolean A07;
    public final TransformMatrixParams A08;
    public final String A09;
    public final float[] A0A;
    public final float[] A0B;

    public TiltShiftOverlayFilter(PointF pointF, PointF pointF2, TransformMatrixParams transformMatrixParams, Integer num, String str, float[] fArr, float[] fArr2, float f, float f2, float f3, float f4, boolean z) {
        0qQ.A0B(pointF, 2);
        0qQ.A0B(pointF2, 3);
        0qQ.A0B(str, 9);
        0qQ.A0B(fArr, 10);
        0qQ.A0B(fArr2, 11);
        0qQ.A0B(transformMatrixParams, 12);
        this.A06 = num;
        this.A05 = pointF;
        this.A04 = pointF2;
        this.A00 = f;
        this.A01 = f2;
        this.A03 = f3;
        this.A02 = f4;
        this.A07 = z;
        this.A09 = str;
        this.A0B = fArr;
        this.A0A = fArr2;
        this.A08 = transformMatrixParams;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        0qQ.A0B(parcel, 0);
        switch (this.A06.intValue()) {
            case 1:
                str = "RADIAL";
                break;
            case 2:
                str = "LINEAR";
                break;
            default:
                str = "OFF";
                break;
        }
        parcel.writeString(str);
        parcel.writeParcelable(this.A05, i);
        parcel.writeParcelable(this.A04, i);
        parcel.writeFloat(this.A00);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A03);
        parcel.writeFloat(this.A02);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeString(this.A09);
        parcel.writeFloatArray(this.A0B);
        parcel.writeFloatArray(this.A0A);
        parcel.writeParcelable(this.A08, i);
    }

    public final void A00(float f, float f2) {
        PointF pointF;
        int intValue = this.A06.intValue();
        if (intValue == 1) {
            pointF = this.A05;
        } else if (intValue == 2) {
            pointF = this.A04;
        } else {
            return;
        }
        pointF.x = C229632nm.A01(f);
        pointF.y = C229632nm.A01(f2);
    }

    public final /* bridge */ /* synthetic */ FilterModel deepCopy() {
        Integer num = this.A06;
        PointF pointF = this.A05;
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        PointF pointF3 = this.A04;
        PointF pointF4 = new PointF(pointF3.x, pointF3.y);
        float f = this.A00;
        float f2 = this.A01;
        float f3 = this.A03;
        float f4 = this.A02;
        boolean z = this.A07;
        String str = this.A09;
        float[] fArr = this.A0B;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        0qQ.A07(copyOf);
        float[] fArr2 = this.A0A;
        float[] copyOf2 = Arrays.copyOf(fArr2, fArr2.length);
        0qQ.A07(copyOf2);
        return new TiltShiftOverlayFilter(pointF2, pointF4, new TransformMatrixParams(this.A08), num, str, copyOf, copyOf2, f, f2, f3, f4, z);
    }

    public final float[] getContentTransform() {
        return this.A0A;
    }

    public final String getFilterName() {
        return this.A09;
    }

    public final float[] getTextureTransform() {
        return this.A0B;
    }

    public final TransformMatrixParams getTransformMatrixParams() {
        return this.A08;
    }

    public final boolean isEnabled() {
        return this.A07;
    }

    public final void setEnabled(boolean z) {
        this.A07 = z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TiltShiftOverlayFilter() {
        /*
            r21 = this;
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            r9 = 1056964608(0x3f000000, float:0.5)
            android.graphics.PointF r1 = new android.graphics.PointF
            r1.<init>(r9, r9)
            android.graphics.PointF r2 = new android.graphics.PointF
            r2.<init>(r9, r9)
            r8 = 0
            r12 = 1
            java.lang.String r5 = "tilt_shift_overlay"
            float[] r6 = X.C366498p3.A00()
            float[] r7 = X.C366498p3.A00()
            r20 = 0
            r16 = 1065353216(0x3f800000, float:1.0)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r3 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams
            r13 = r3
            r14 = r4
            r15 = r4
            r17 = r8
            r18 = r8
            r19 = r8
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            r0 = r21
            r10 = r9
            r11 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.tiltshift.TiltShiftOverlayFilter.<init>():void");
    }
}
