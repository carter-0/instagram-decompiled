package com.facebookpay.common.recyclerview.adapteritems;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.RH6;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;

public final class ConfirmationProductUpsellSectionHeaderItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = SWZ.A01(90);
    public String A00;
    public final RH6 A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this.A01);
        parcel.writeString(this.A00);
    }

    public final RH6 BJZ() {
        return this.A01;
    }

    public ConfirmationProductUpsellSectionHeaderItem(RH6 rh6, String str) {
        AnonymousClass7TG.A1O(rh6, str);
        this.A01 = rh6;
        this.A00 = str;
    }
}
