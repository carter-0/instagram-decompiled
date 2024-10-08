package com.google.android.gms.common.server;

import X.C301145yd;
import X.Pxi;
import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class FavaDiagnosticsEntity extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(49);
    public final int A00;
    public final int A01;
    public final String A02;

    public final void writeToParcel(Parcel parcel, int i) {
        int A06 = Pxi.A06(parcel, this.A00);
        C301145yd.A0B(parcel, this.A02);
        C301145yd.A07(parcel, 3, this.A01);
        C301145yd.A06(parcel, A06);
    }

    public FavaDiagnosticsEntity(int i, String str, int i2) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = i2;
    }
}
