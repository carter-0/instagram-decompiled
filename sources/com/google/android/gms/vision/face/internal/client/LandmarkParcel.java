package com.google.android.gms.vision.face.internal.client;

import X.C301145yd;
import X.Pxf;
import X.Pxi;
import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class LandmarkParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWR.A00(94);
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;

    public LandmarkParcel(int i, float f, float f2, int i2) {
        this.A03 = i;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        C301145yd.A05(parcel, this.A03);
        C301145yd.A04(parcel, this.A00, 2);
        C301145yd.A04(parcel, this.A01, 3);
        Pxi.A12(parcel, this.A02, A032);
    }
}
