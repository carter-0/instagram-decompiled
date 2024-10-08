package com.facebookpay.common.recyclerview.adapteritems;

import X.0qQ;
import X.AnonymousClass7TE;
import X.C7X;
import X.RH6;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;

public final class AnonCheckoutPuxLink implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = SWZ.A01(84);
    public final C7X A00;
    public final RH6 A01;
    public final boolean A02;

    public AnonCheckoutPuxLink(C7X c7x, RH6 rh6, boolean z) {
        0qQ.A0B(rh6, 1);
        this.A01 = rh6;
        this.A00 = c7x;
        this.A02 = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this.A01);
        parcel.writeValue(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
    }

    public final RH6 BJZ() {
        return this.A01;
    }

    public AnonCheckoutPuxLink() {
        this((C7X) null, RH6.A09, false);
    }
}
