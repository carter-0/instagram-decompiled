package com.facebookpay.common.recyclerview.adapteritems;

import X.0qQ;
import X.AnonymousClass7TE;
import X.RH6;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.shippingaddress.model.ShippingAddress;

public final class PuxShippingAddressItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = SWV.A00(7);
    public final RH6 A00;
    public final ShippingAddress A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public PuxShippingAddressItem(RH6 rh6, ShippingAddress shippingAddress, String str, String str2, String str3, boolean z) {
        0qQ.A0B(rh6, 1);
        this.A00 = rh6;
        this.A03 = str;
        this.A02 = str2;
        this.A04 = str3;
        this.A01 = shippingAddress;
        this.A05 = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this.A00);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A05 ? 1 : 0);
    }

    public final RH6 BJZ() {
        return this.A00;
    }

    public PuxShippingAddressItem() {
        this(RH6.A0l, (ShippingAddress) null, (String) null, (String) null, (String) null, false);
    }
}
