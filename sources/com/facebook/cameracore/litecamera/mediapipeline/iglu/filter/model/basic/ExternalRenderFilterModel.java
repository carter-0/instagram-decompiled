package com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic;

import X.0qQ;
import X.SWS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import java.util.Arrays;

public final class ExternalRenderFilterModel implements FilterModel {
    public static final Parcelable.Creator CREATOR = new SWS(39);
    public boolean A00;
    public final TransformMatrixParams A01;
    public final String A02;
    public final String A03;
    public final float[] A04;
    public final float[] A05;

    public ExternalRenderFilterModel(TransformMatrixParams transformMatrixParams, String str, String str2, float[] fArr, float[] fArr2, boolean z) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        0qQ.A0B(fArr, 3);
        0qQ.A0B(fArr2, 4);
        0qQ.A0B(transformMatrixParams, 6);
        this.A02 = str;
        this.A03 = str2;
        this.A05 = fArr;
        this.A04 = fArr2;
        this.A00 = z;
        this.A01 = transformMatrixParams;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeFloatArray(this.A05);
        parcel.writeFloatArray(this.A04);
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeParcelable(this.A01, i);
    }

    public final /* bridge */ /* synthetic */ FilterModel deepCopy() {
        String str = this.A02;
        String str2 = this.A03;
        float[] fArr = this.A05;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        0qQ.A07(copyOf);
        float[] fArr2 = this.A04;
        float[] copyOf2 = Arrays.copyOf(fArr2, fArr2.length);
        0qQ.A07(copyOf2);
        return new ExternalRenderFilterModel(new TransformMatrixParams(this.A01), str, str2, copyOf, copyOf2, this.A00);
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
        return this.A01;
    }

    public final boolean isEnabled() {
        return this.A00;
    }

    public final void setEnabled(boolean z) {
        this.A00 = z;
    }
}
