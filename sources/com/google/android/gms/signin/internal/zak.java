package com.google.android.gms.signin.internal;

import X.C301145yd;
import X.Pxf;
import X.Pxi;
import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zav;

public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWR.A00(77);
    public final int A00;
    public final ConnectionResult A01;
    public final zav A02;

    public zak(ConnectionResult connectionResult, zav zav, int i) {
        this.A00 = i;
        this.A01 = connectionResult;
        this.A02 = zav;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = Pxf.A03(parcel);
        C301145yd.A05(parcel, this.A00);
        C301145yd.A0A(parcel, this.A02, 3, i, Pxi.A1R(parcel, this.A01, i));
        C301145yd.A06(parcel, A03);
    }
}
