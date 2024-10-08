package com.google.android.gms.common.server.response;

import X.C301145yd;
import X.Pxi;
import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(45);
    public final int A00;
    public final FastJsonResponse$Field A01;
    public final String A02;

    public final void writeToParcel(Parcel parcel, int i) {
        int A06 = Pxi.A06(parcel, this.A00);
        C301145yd.A0B(parcel, this.A02);
        C301145yd.A0A(parcel, this.A01, 3, i, false);
        C301145yd.A06(parcel, A06);
    }

    public zam(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = fastJsonResponse$Field;
    }

    public zam(FastJsonResponse$Field fastJsonResponse$Field, String str) {
        this.A00 = 1;
        this.A02 = str;
        this.A01 = fastJsonResponse$Field;
    }
}
