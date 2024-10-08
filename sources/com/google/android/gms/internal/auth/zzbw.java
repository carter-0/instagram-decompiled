package com.google.android.gms.internal.auth;

import X.C301145yd;
import X.Pxi;
import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzbw extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWR.A00(18);
    public String A00;
    public final int A01;

    public final void writeToParcel(Parcel parcel, int i) {
        int A06 = Pxi.A06(parcel, this.A01);
        C301145yd.A0B(parcel, this.A00);
        C301145yd.A06(parcel, A06);
    }

    public zzbw(int i, String str) {
        this.A01 = i;
        this.A00 = str;
    }

    public zzbw() {
        this.A01 = 1;
    }
}
