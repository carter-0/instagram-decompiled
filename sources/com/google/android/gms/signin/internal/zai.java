package com.google.android.gms.signin.internal;

import X.C301145yd;
import X.Pxf;
import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zat;

public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWR.A00(76);
    public final int A00;
    public final zat A01;

    public zai(zat zat, int i) {
        this.A00 = i;
        this.A01 = zat;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = Pxf.A03(parcel);
        C301145yd.A05(parcel, this.A00);
        C301145yd.A0A(parcel, this.A01, 2, i, false);
        C301145yd.A06(parcel, A03);
    }
}
