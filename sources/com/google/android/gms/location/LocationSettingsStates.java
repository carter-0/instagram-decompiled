package com.google.android.gms.location;

import X.C301145yd;
import X.Pxf;
import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class LocationSettingsStates extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWR.A00(55);
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public LocationSettingsStates(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A00 = z;
        this.A01 = z2;
        this.A02 = z3;
        this.A03 = z4;
        this.A04 = z5;
        this.A05 = z6;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        C301145yd.A09(parcel, 1, this.A00);
        C301145yd.A09(parcel, 2, this.A01);
        C301145yd.A09(parcel, 3, this.A02);
        C301145yd.A09(parcel, 4, this.A03);
        C301145yd.A09(parcel, 5, this.A04);
        C301145yd.A09(parcel, 6, this.A05);
        C301145yd.A06(parcel, A032);
    }
}
