package com.google.android.gms.common.internal;

import X.C301145yd;
import X.Pxi;
import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zax extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(33);
    public final int A00;
    public final int A01;
    public final int A02;
    @Deprecated
    public final Scope[] A03;

    public final void writeToParcel(Parcel parcel, int i) {
        int A06 = Pxi.A06(parcel, this.A00);
        C301145yd.A07(parcel, 2, this.A01);
        C301145yd.A07(parcel, 3, this.A02);
        C301145yd.A0G(parcel, this.A03, 4, i);
        C301145yd.A06(parcel, A06);
    }

    public zax(Scope[] scopeArr, int i, int i2, int i3) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = scopeArr;
    }
}
