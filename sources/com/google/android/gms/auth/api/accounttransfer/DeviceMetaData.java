package com.google.android.gms.auth.api.accounttransfer;

import X.C301145yd;
import X.Pxi;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class DeviceMetaData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWW.A00(84);
    public final int A00;
    public final long A01;
    public final boolean A02;
    public final boolean A03;

    public final void writeToParcel(Parcel parcel, int i) {
        int A06 = Pxi.A06(parcel, this.A00);
        C301145yd.A09(parcel, 2, this.A02);
        C301145yd.A08(parcel, 3, this.A01);
        C301145yd.A09(parcel, 4, this.A03);
        C301145yd.A06(parcel, A06);
    }

    public DeviceMetaData(int i, long j, boolean z, boolean z2) {
        this.A00 = i;
        this.A02 = z;
        this.A01 = j;
        this.A03 = z2;
    }
}
