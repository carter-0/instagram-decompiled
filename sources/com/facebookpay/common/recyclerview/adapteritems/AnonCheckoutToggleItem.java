package com.facebookpay.common.recyclerview.adapteritems;

import X.0qQ;
import X.AnonymousClass7TE;
import X.C7X;
import X.RH6;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;

public final class AnonCheckoutToggleItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = SWZ.A01(85);
    public final C7X A00;
    public final C7X A01;
    public final boolean A02;
    public final RH6 A03;

    public AnonCheckoutToggleItem(C7X c7x, C7X c7x2, RH6 rh6, boolean z) {
        0qQ.A0B(rh6, 1);
        this.A03 = rh6;
        this.A02 = z;
        this.A01 = c7x;
        this.A00 = c7x2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this.A03);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeValue(this.A01);
        parcel.writeValue(this.A00);
    }

    public final RH6 BJZ() {
        return this.A03;
    }

    public AnonCheckoutToggleItem() {
        this((C7X) null, (C7X) null, RH6.A0A, false);
    }
}
