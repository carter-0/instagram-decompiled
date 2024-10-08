package com.google.android.gms.common.internal;

import X.C301145yd;
import X.Pxi;
import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
public final class zzak extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(34);
    public final int A00;

    public final void writeToParcel(Parcel parcel, int i) {
        C301145yd.A06(parcel, Pxi.A06(parcel, this.A00));
    }

    public zzak(int i) {
        this.A00 = i;
    }
}
