package com.instagram.model.coupon;

import X.0qQ;
import X.AnonymousClass00P;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;

public final class PromoteCouponCurrencyAmount implements Parcelable {
    public static final C71269Ogb CREATOR = C71269Ogb.A00(29);
    public int A00;
    public int A01;
    public String A02;
    public String A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        String str = this.A02;
        if (str != null) {
            parcel.writeString(str);
            parcel.writeString(A00());
            parcel.writeInt(this.A00);
            parcel.writeInt(this.A01);
            return;
        }
        0qQ.A0F("currencyCode");
        throw AnonymousClass00P.createAndThrow();
    }

    public final String A00() {
        String str = this.A03;
        if (str != null) {
            return str;
        }
        0qQ.A0F("formattedAmount");
        throw AnonymousClass00P.createAndThrow();
    }
}
