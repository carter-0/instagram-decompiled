package com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model;

import X.0qQ;
import X.C369418uZ;
import X.C376409Hw;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import java.util.Arrays;
import java.util.Map;

public final class ValueMapFilterModel implements FilterModel {
    public static final C369418uZ A06 = new Object();
    public static final Parcelable.Creator CREATOR = new C376409Hw(9);
    public boolean A00;
    public final TypedParameterMap A01;
    public final TransformMatrixParams A02;
    public final String A03;
    public final float[] A04;
    public final float[] A05;

    public final void A03(String str, float[] fArr) {
        0qQ.A0B(str, 0);
        0qQ.A0B(fArr, 1);
        Map map = this.A01.A01;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        0qQ.A07(copyOf);
        map.put(str, copyOf);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeFloatArray(this.A05);
        parcel.writeFloatArray(this.A04);
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeParcelable(this.A02, i);
        this.A01.writeToParcel(parcel, i);
    }

    public final /* bridge */ /* synthetic */ FilterModel deepCopy() {
        String str = this.A03;
        float[] fArr = this.A05;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        0qQ.A07(copyOf);
        float[] fArr2 = this.A04;
        float[] copyOf2 = Arrays.copyOf(fArr2, fArr2.length);
        0qQ.A07(copyOf2);
        boolean z = this.A00;
        return new ValueMapFilterModel(this.A01.A00(), new TransformMatrixParams(this.A02), str, copyOf, copyOf2, z);
    }

    public final float[] getContentTransform() {
        return this.A04;
    }

    public final String getFilterName() {
        return this.A03;
    }

    public final float[] getTextureTransform() {
        return this.A05;
    }

    public final TransformMatrixParams getTransformMatrixParams() {
        return this.A02;
    }

    public final boolean isEnabled() {
        return this.A00;
    }

    public ValueMapFilterModel(TypedParameterMap typedParameterMap, TransformMatrixParams transformMatrixParams, String str, float[] fArr, float[] fArr2, boolean z) {
        this.A03 = str;
        this.A05 = fArr;
        this.A04 = fArr2;
        this.A00 = z;
        this.A02 = transformMatrixParams;
        this.A01 = typedParameterMap;
    }

    public final void A00(String str, float f) {
        this.A01.A02.put(str, Float.valueOf(f));
    }

    public final void A01(String str, int i) {
        this.A01.A03.put(str, Integer.valueOf(i));
    }

    public final void A02(String str, boolean z) {
        this.A01.A00.put(str, Boolean.valueOf(z));
    }

    public final void setEnabled(boolean z) {
        this.A00 = z;
    }
}
