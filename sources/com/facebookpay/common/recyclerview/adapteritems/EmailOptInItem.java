package com.facebookpay.common.recyclerview.adapteritems;

import X.0qQ;
import X.AnonymousClass7TE;
import X.C7X;
import X.RH6;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;

public final class EmailOptInItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = SWZ.A01(91);
    public boolean A00;
    public final C7X A01;
    public final RH6 A02;
    public final String A03;
    public final boolean A04;

    public EmailOptInItem(C7X c7x, RH6 rh6, String str, boolean z, boolean z2) {
        0qQ.A0B(rh6, 1);
        this.A02 = rh6;
        this.A00 = z;
        this.A01 = c7x;
        this.A03 = str;
        this.A04 = z2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this.A02);
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeValue(this.A01);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A04 ? 1 : 0);
    }

    public final RH6 BJZ() {
        return this.A02;
    }

    public EmailOptInItem() {
        this((C7X) null, RH6.A0H, (String) null, false, false);
    }
}
