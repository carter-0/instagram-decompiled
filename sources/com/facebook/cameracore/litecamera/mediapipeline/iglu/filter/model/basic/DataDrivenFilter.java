package com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic;

import X.0qQ;
import X.SWS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class DataDrivenFilter implements FilterModel {
    public static final Parcelable.Creator CREATOR = new SWS(37);
    public String A00;
    public boolean A01;
    public final TransformMatrixParams A02;
    public final String A03;
    public final HashMap A04;
    public final float[] A05;
    public final float[] A06;

    public DataDrivenFilter(TransformMatrixParams transformMatrixParams, String str, String str2, HashMap hashMap, float[] fArr, float[] fArr2, boolean z) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        0qQ.A0B(fArr, 4);
        0qQ.A0B(fArr2, 5);
        0qQ.A0B(transformMatrixParams, 7);
        this.A03 = str;
        this.A00 = str2;
        this.A04 = hashMap;
        this.A06 = fArr;
        this.A05 = fArr2;
        this.A01 = z;
        this.A02 = transformMatrixParams;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A00);
        HashMap hashMap = this.A04;
        if (hashMap == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(hashMap.size());
            for (Map.Entry entry : hashMap.entrySet()) {
                parcel.writeString((String) entry.getKey());
                parcel.writeValue(entry.getValue());
            }
        }
        parcel.writeFloatArray(this.A06);
        parcel.writeFloatArray(this.A05);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeParcelable(this.A02, i);
    }

    public final /* bridge */ /* synthetic */ FilterModel deepCopy() {
        String str = this.A03;
        String str2 = this.A00;
        HashMap hashMap = this.A04;
        float[] fArr = this.A06;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        0qQ.A07(copyOf);
        float[] fArr2 = this.A05;
        float[] copyOf2 = Arrays.copyOf(fArr2, fArr2.length);
        0qQ.A07(copyOf2);
        return new DataDrivenFilter(new TransformMatrixParams(this.A02), str, str2, hashMap, copyOf, copyOf2, this.A01);
    }

    public final float[] getContentTransform() {
        return this.A05;
    }

    public final String getFilterName() {
        return this.A03;
    }

    public final float[] getTextureTransform() {
        return this.A06;
    }

    public final TransformMatrixParams getTransformMatrixParams() {
        return this.A02;
    }

    public final boolean isEnabled() {
        return this.A01;
    }

    public final void setEnabled(boolean z) {
        this.A01 = z;
    }
}
