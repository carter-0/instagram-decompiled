package com.google.android.gms.internal.auth;

import X.AnonymousClass3Qk;
import X.C301145yd;
import X.Pxi;
import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzaq extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWR.A00(13);
    public final String A00;

    public final void writeToParcel(Parcel parcel, int i) {
        int A06 = Pxi.A06(parcel, 1);
        C301145yd.A0B(parcel, this.A00);
        C301145yd.A06(parcel, A06);
    }

    public zzaq(String str) {
        AnonymousClass3Qk.A02(str);
        this.A00 = str;
    }
}
