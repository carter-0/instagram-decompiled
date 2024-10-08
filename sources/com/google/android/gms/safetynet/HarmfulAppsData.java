package com.google.android.gms.safetynet;

import X.C301145yd;
import X.Pxf;
import X.Pxi;
import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class HarmfulAppsData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWR.A00(69);
    public final int A00;
    public final String A01;
    public final byte[] A02;

    public HarmfulAppsData(byte[] bArr, int i, String str) {
        this.A01 = str;
        this.A02 = bArr;
        this.A00 = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = Pxf.A03(parcel);
        C301145yd.A0B(parcel, this.A01);
        C301145yd.A0F(parcel, this.A02, 3, false);
        Pxi.A12(parcel, this.A00, A03);
    }
}
