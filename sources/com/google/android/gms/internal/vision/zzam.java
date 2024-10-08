package com.google.android.gms.internal.vision;

import X.C301145yd;
import X.Pxf;
import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzam extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWR.A00(42);
    public final String A00;

    public zzam(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = Pxf.A03(parcel);
        C301145yd.A0B(parcel, this.A00);
        C301145yd.A06(parcel, A03);
    }

    public zzam() {
        this((String) null);
    }
}
