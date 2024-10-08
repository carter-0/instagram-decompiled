package com.google.android.gms.common.internal;

import X.C301145yd;
import X.C376409Hw;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C376409Hw(39);
    public final int A00;
    public final RootTelemetryConfiguration A01;
    public final boolean A02;
    public final boolean A03;
    public final int[] A04;
    public final int[] A05;

    public final void writeToParcel(Parcel parcel, int i) {
        int A012 = C301145yd.A01(parcel, 20293);
        C301145yd.A0A(parcel, this.A01, 1, i, false);
        C301145yd.A09(parcel, 2, this.A02);
        C301145yd.A09(parcel, 3, this.A03);
        int[] iArr = this.A04;
        if (iArr != null) {
            int A013 = C301145yd.A01(parcel, 4);
            parcel.writeIntArray(iArr);
            C301145yd.A06(parcel, A013);
        }
        C301145yd.A07(parcel, 5, this.A00);
        int[] iArr2 = this.A05;
        if (iArr2 != null) {
            int A014 = C301145yd.A01(parcel, 6);
            parcel.writeIntArray(iArr2);
            C301145yd.A06(parcel, A014);
        }
        C301145yd.A06(parcel, A012);
    }

    public ConnectionTelemetryConfiguration(RootTelemetryConfiguration rootTelemetryConfiguration, int[] iArr, int[] iArr2, int i, boolean z, boolean z2) {
        this.A01 = rootTelemetryConfiguration;
        this.A02 = z;
        this.A03 = z2;
        this.A04 = iArr;
        this.A00 = i;
        this.A05 = iArr2;
    }
}
