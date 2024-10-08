package com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic;

import X.0qQ;
import X.SWS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class DataDrivenGraphFilter implements FilterModel {
    public static final Parcelable.Creator CREATOR = new SWS(38);
    public String A00;
    public boolean A01;
    public boolean A02 = true;
    public final TransformMatrixParams A03;
    public final String A04;
    public final HashMap A05;
    public final float[] A06;
    public final float[] A07;

    public DataDrivenGraphFilter(TransformMatrixParams transformMatrixParams, String str, String str2, HashMap hashMap, float[] fArr, float[] fArr2, boolean z) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        0qQ.A0B(fArr, 4);
        0qQ.A0B(fArr2, 5);
        0qQ.A0B(transformMatrixParams, 7);
        this.A04 = str;
        this.A00 = str2;
        this.A05 = hashMap;
        this.A07 = fArr;
        this.A06 = fArr2;
        this.A01 = z;
        this.A03 = transformMatrixParams;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A00);
        HashMap hashMap = this.A05;
        if (hashMap == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(hashMap.size());
            for (Map.Entry entry : hashMap.entrySet()) {
                parcel.writeString((String) entry.getKey());
                AbstractMap abstractMap = (AbstractMap) entry.getValue();
                parcel.writeInt(abstractMap.size());
                for (Map.Entry entry2 : abstractMap.entrySet()) {
                    parcel.writeString((String) entry2.getKey());
                    parcel.writeValue(entry2.getValue());
                }
            }
        }
        parcel.writeFloatArray(this.A07);
        parcel.writeFloatArray(this.A06);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeParcelable(this.A03, i);
    }

    public final /* bridge */ /* synthetic */ FilterModel deepCopy() {
        String str = this.A04;
        String str2 = this.A00;
        HashMap hashMap = this.A05;
        float[] fArr = this.A07;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        0qQ.A07(copyOf);
        float[] fArr2 = this.A06;
        float[] copyOf2 = Arrays.copyOf(fArr2, fArr2.length);
        0qQ.A07(copyOf2);
        return new DataDrivenGraphFilter(new TransformMatrixParams(this.A03), str, str2, hashMap, copyOf, copyOf2, this.A01);
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
        return this.A01;
    }

    public final void setEnabled(boolean z) {
        this.A01 = z;
    }
}
