package com.google.android.gms.common.internal;

import X.C301145yd;
import X.C376409Hw;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class RootTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C376409Hw(37);
    public final int A00;
    public final int A01;
    public final int A02;
    public final boolean A03;
    public final boolean A04;

    public final void writeToParcel(Parcel parcel, int i) {
        int A012 = C301145yd.A01(parcel, 20293);
        C301145yd.A05(parcel, this.A00);
        C301145yd.A09(parcel, 2, this.A03);
        C301145yd.A09(parcel, 3, this.A04);
        C301145yd.A07(parcel, 4, this.A01);
        C301145yd.A07(parcel, 5, this.A02);
        C301145yd.A06(parcel, A012);
    }

    public RootTelemetryConfiguration(int i, int i2, int i3, boolean z, boolean z2) {
        this.A00 = i;
        this.A03 = z;
        this.A04 = z2;
        this.A01 = i2;
        this.A02 = i3;
    }
}
