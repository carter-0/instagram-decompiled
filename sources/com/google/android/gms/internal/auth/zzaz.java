package com.google.android.gms.internal.auth;

import X.AnonymousClass3Qk;
import X.C301145yd;
import X.Pxi;
import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzaz extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWR.A00(16);
    public final String A00;
    public final byte[] A01;

    public final void writeToParcel(Parcel parcel, int i) {
        int A06 = Pxi.A06(parcel, 1);
        C301145yd.A0B(parcel, this.A00);
        C301145yd.A0F(parcel, this.A01, 3, false);
        C301145yd.A06(parcel, A06);
    }

    public zzaz(byte[] bArr, String str) {
        AnonymousClass3Qk.A02(str);
        this.A00 = str;
        AnonymousClass3Qk.A02(bArr);
        this.A01 = bArr;
    }
}
