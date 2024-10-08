package com.google.android.gms.internal.auth;

import X.AnonymousClass3Qk;
import X.C301145yd;
import X.Pxi;
import X.SWR;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzbb extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWR.A00(17);
    public final PendingIntent A00;
    public final String A01;

    public final void writeToParcel(Parcel parcel, int i) {
        int A06 = Pxi.A06(parcel, 1);
        C301145yd.A0B(parcel, this.A01);
        C301145yd.A0A(parcel, this.A00, 3, i, false);
        C301145yd.A06(parcel, A06);
    }

    public zzbb(PendingIntent pendingIntent, String str) {
        AnonymousClass3Qk.A02(str);
        this.A01 = str;
        AnonymousClass3Qk.A02(pendingIntent);
        this.A00 = pendingIntent;
    }
}
