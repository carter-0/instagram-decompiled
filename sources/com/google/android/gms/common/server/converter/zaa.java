package com.google.android.gms.common.server.converter;

import X.C301145yd;
import X.Pxi;
import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(41);
    public final int A00;
    public final StringToIntConverter A01;

    public final void writeToParcel(Parcel parcel, int i) {
        int A06 = Pxi.A06(parcel, this.A00);
        C301145yd.A0A(parcel, this.A01, 2, i, false);
        C301145yd.A06(parcel, A06);
    }

    public zaa(StringToIntConverter stringToIntConverter, int i) {
        this.A00 = i;
        this.A01 = stringToIntConverter;
    }

    public zaa(StringToIntConverter stringToIntConverter) {
        this.A00 = 1;
        this.A01 = stringToIntConverter;
    }
}
