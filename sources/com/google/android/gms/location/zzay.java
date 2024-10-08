package com.google.android.gms.location;

import X.C301145yd;
import X.Pxf;
import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
public final class zzay extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWR.A00(52);
    public final String A00;
    public final String A01;
    public final String A02;

    public zzay(String str, String str2, String str3) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = Pxf.A03(parcel);
        boolean A1S = Pxf.A1S(parcel, this.A00);
        C301145yd.A0B(parcel, this.A01);
        C301145yd.A0C(parcel, this.A02, 5, A1S);
        C301145yd.A06(parcel, A03);
    }
}
