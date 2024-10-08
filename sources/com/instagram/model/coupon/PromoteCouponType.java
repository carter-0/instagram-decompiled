package com.instagram.model.coupon;

import X.0oU;
import X.0qQ;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;

public enum PromoteCouponType implements Parcelable {
    HERES_X("HERES_X"),
    RECREATE_MIN_SPEND_X_TO_GET_Y("RECREATE_MIN_SPEND_X_TO_GET_Y");
    
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
    }

    /* access modifiers changed from: public */
    static {
        PromoteCouponType[] promoteCouponTypeArr;
        A01 = 0oU.A00(promoteCouponTypeArr);
        CREATOR = C71269Ogb.A00(30);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    PromoteCouponType(String str) {
        this.A00 = str;
    }
}
