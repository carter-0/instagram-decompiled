package com.facebookpay.common.recyclerview.adapteritems;

import X.0qQ;
import X.AnonymousClass7TE;
import X.RH6;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;

public final class AutoAdvanceButtonItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = SWZ.A01(86);
    public final int A00;
    public final RH6 A01;

    public AutoAdvanceButtonItem(RH6 rh6, int i) {
        0qQ.A0B(rh6, 1);
        this.A01 = rh6;
        this.A00 = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this.A01);
        parcel.writeInt(this.A00);
    }

    public final RH6 BJZ() {
        return this.A01;
    }
}
