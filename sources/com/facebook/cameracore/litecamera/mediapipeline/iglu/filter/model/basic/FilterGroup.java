package com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic;

import X.0qQ;
import X.C376409Hw;
import X.C378799Rg;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import java.util.Arrays;

public final class FilterGroup implements FilterModel {
    public static final Parcelable.Creator CREATOR = new C376409Hw(12);
    public boolean A00;
    public final SparseArray A01;
    public final SparseArray A02;
    public final TransformMatrixParams A03;
    public final String A04;
    public final float[] A05;
    public final float[] A06;

    public FilterGroup(SparseArray sparseArray, SparseArray sparseArray2, TransformMatrixParams transformMatrixParams, String str, float[] fArr, float[] fArr2, boolean z) {
        0qQ.A0B(sparseArray2, 2);
        0qQ.A0B(str, 3);
        0qQ.A0B(fArr, 5);
        0qQ.A0B(fArr2, 6);
        0qQ.A0B(transformMatrixParams, 7);
        this.A01 = sparseArray;
        this.A02 = sparseArray2;
        this.A04 = str;
        this.A00 = z;
        this.A06 = fArr;
        this.A05 = fArr2;
        this.A03 = transformMatrixParams;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        SparseArray sparseArray = this.A01;
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 != size; i2++) {
            parcel.writeInt(sparseArray.keyAt(i2));
            parcel.writeParcelable((Parcelable) sparseArray.valueAt(i2), i);
        }
        SparseArray sparseArray2 = this.A02;
        int size2 = sparseArray2.size();
        parcel.writeInt(size2);
        for (int i3 = 0; i3 != size2; i3++) {
            parcel.writeInt(sparseArray2.keyAt(i3));
            parcel.writeParcelable((Parcelable) sparseArray2.valueAt(i3), i);
        }
        parcel.writeString(this.A04);
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeFloatArray(this.A06);
        parcel.writeFloatArray(this.A05);
        parcel.writeParcelable(this.A03, i);
    }

    public final void A00(FilterModel filterModel, int i) {
        SparseArray sparseArray = this.A01;
        if (filterModel == null) {
            sparseArray.remove(i);
        } else {
            sparseArray.put(i, filterModel);
        }
    }

    public final /* bridge */ /* synthetic */ FilterModel deepCopy() {
        SparseArray A002 = C378799Rg.A00(this.A01);
        SparseArray sparseArray = this.A02;
        0qQ.A0B(sparseArray, 0);
        SparseArray sparseArray2 = new SparseArray(sparseArray.size());
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            sparseArray2.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
        }
        String str = this.A04;
        boolean z = this.A00;
        float[] fArr = this.A06;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        0qQ.A07(copyOf);
        float[] fArr2 = this.A05;
        float[] copyOf2 = Arrays.copyOf(fArr2, fArr2.length);
        0qQ.A07(copyOf2);
        return new FilterGroup(A002, sparseArray2, new TransformMatrixParams(this.A03), str, copyOf, copyOf2, z);
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
        return this.A00;
    }

    public final void setEnabled(boolean z) {
        this.A00 = z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FilterGroup() {
        /*
            r15 = this;
            android.util.SparseArray r8 = new android.util.SparseArray
            r8.<init>()
            android.util.SparseArray r9 = new android.util.SparseArray
            r9.<init>()
            r0 = 1365(0x555, float:1.913E-42)
            java.lang.String r11 = X.AnonymousClass000.A00(r0)
            r14 = 1
            float[] r12 = X.C366498p3.A00()
            float[] r13 = X.C366498p3.A00()
            r7 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r0 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams
            r2 = r1
            r5 = r4
            r6 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r7 = r15
            r10 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterGroup.<init>():void");
    }
}
