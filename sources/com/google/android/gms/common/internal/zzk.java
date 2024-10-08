package com.google.android.gms.common.internal;

import X.C301145yd;
import X.C376409Hw;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C376409Hw(38);
    public int A00;
    public Bundle A01;
    public ConnectionTelemetryConfiguration A02;
    public Feature[] A03;

    public final void writeToParcel(Parcel parcel, int i) {
        int A012 = C301145yd.A01(parcel, 20293);
        C301145yd.A02(this.A01, parcel, 1);
        C301145yd.A0G(parcel, this.A03, 2, i);
        C301145yd.A07(parcel, 3, this.A00);
        C301145yd.A0A(parcel, this.A02, 4, i, false);
        C301145yd.A06(parcel, A012);
    }
}
