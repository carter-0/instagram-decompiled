package com.google.android.gms.vision.face.internal.client;

import X.C301145yd;
import X.Pxf;
import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWR.A00(93);
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public boolean A04;
    public boolean A05;

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        C301145yd.A07(parcel, 2, this.A01);
        C301145yd.A07(parcel, 3, this.A02);
        C301145yd.A07(parcel, 4, this.A03);
        C301145yd.A09(parcel, 5, this.A04);
        C301145yd.A09(parcel, 6, this.A05);
        C301145yd.A04(parcel, this.A00, 7);
        C301145yd.A06(parcel, A032);
    }
}
