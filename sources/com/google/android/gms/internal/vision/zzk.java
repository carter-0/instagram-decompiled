package com.google.android.gms.internal.vision;

import X.C301145yd;
import X.Pxf;
import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWR.A00(45);
    public int A00;
    public boolean A01;

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = Pxf.A03(parcel);
        C301145yd.A07(parcel, 2, this.A00);
        C301145yd.A09(parcel, 3, this.A01);
        C301145yd.A06(parcel, A03);
    }
}
