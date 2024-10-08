package com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition;

import X.0qQ;
import X.SWS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TransitionFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import java.util.Arrays;

public final class BlurTransitionFilter implements TransitionFilter {
    public static final Parcelable.Creator CREATOR = new SWS(45);
    public float A00;
    public float A01;
    public float A02;
    public boolean A03;
    public final TransformMatrixParams A04;
    public final float[] A05;
    public final float[] A06;

    public BlurTransitionFilter(TransformMatrixParams transformMatrixParams, float[] fArr, float[] fArr2, float f, float f2, float f3, boolean z) {
        0qQ.A0B(fArr, 4);
        0qQ.A0B(fArr2, 5);
        0qQ.A0B(transformMatrixParams, 7);
        this.A02 = f;
        this.A01 = f2;
        this.A00 = f3;
        this.A06 = fArr;
        this.A05 = fArr2;
        this.A03 = z;
        this.A04 = transformMatrixParams;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A00);
        parcel.writeFloatArray(this.A06);
        parcel.writeFloatArray(this.A05);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeParcelable(this.A04, i);
    }

    public final float C9V() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ FilterModel deepCopy() {
        float[] fArr = this.A06;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        0qQ.A07(copyOf);
        float[] fArr2 = this.A05;
        float[] copyOf2 = Arrays.copyOf(fArr2, fArr2.length);
        0qQ.A07(copyOf2);
        BlurTransitionFilter blurTransitionFilter = new BlurTransitionFilter(new TransformMatrixParams(this.A04), copyOf, copyOf2, 0.0f, 24.0f, 1.0f, true);
        blurTransitionFilter.A02 = blurTransitionFilter.A02;
        blurTransitionFilter.A01 = blurTransitionFilter.A01;
        blurTransitionFilter.A00 = blurTransitionFilter.A00;
        blurTransitionFilter.A03 = blurTransitionFilter.A03;
        return blurTransitionFilter;
    }

    public final float[] getContentTransform() {
        return this.A05;
    }

    public final String getFilterName() {
        return "blur_transition";
    }

    public final float[] getTextureTransform() {
        return this.A06;
    }

    public final TransformMatrixParams getTransformMatrixParams() {
        return this.A04;
    }

    public final boolean isEnabled() {
        return this.A03;
    }

    public final void EpD(float f) {
        this.A02 = f;
    }

    public final void setEnabled(boolean z) {
        this.A03 = z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BlurTransitionFilter() {
        /*
            r14 = this;
            r4 = 0
            r11 = 1103101952(0x41c00000, float:24.0)
            r3 = 1065353216(0x3f800000, float:1.0)
            float[] r8 = X.C366498p3.A00()
            float[] r9 = X.C366498p3.A00()
            r13 = 1
            r7 = 0
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r0 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams
            r2 = r1
            r5 = r4
            r6 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r6 = r14
            r7 = r0
            r10 = r4
            r12 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.BlurTransitionFilter.<init>():void");
    }
}
