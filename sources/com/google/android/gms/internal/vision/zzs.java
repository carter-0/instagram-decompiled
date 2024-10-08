package com.google.android.gms.internal.vision;

import X.C301145yd;
import X.Pxf;
import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWR.A00(46);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        C301145yd.A07(parcel, 2, this.A00);
        C301145yd.A07(parcel, 3, this.A01);
        C301145yd.A07(parcel, 4, this.A02);
        C301145yd.A08(parcel, 5, this.A04);
        C301145yd.A07(parcel, 6, this.A03);
        C301145yd.A06(parcel, A032);
    }
}
