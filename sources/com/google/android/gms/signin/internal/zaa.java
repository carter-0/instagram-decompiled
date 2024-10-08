package com.google.android.gms.signin.internal;

import X.AnonymousClass63X;
import X.C301145yd;
import X.Pxi;
import X.SWR;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zaa extends AbstractSafeParcelable implements AnonymousClass63X {
    public static final Parcelable.Creator CREATOR = SWR.A00(74);
    public int A00;
    public Intent A01;
    public final int A02;

    public final Status BzI() {
        if (this.A00 == 0) {
            return Status.A08;
        }
        return Status.A04;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A06 = Pxi.A06(parcel, this.A02);
        C301145yd.A07(parcel, 2, this.A00);
        C301145yd.A0A(parcel, this.A01, 3, i, false);
        C301145yd.A06(parcel, A06);
    }

    public zaa(int i, int i2, Intent intent) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = intent;
    }

    public zaa() {
        this(2, 0, (Intent) null);
    }
}
