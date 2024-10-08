package com.facebookpay.incentives.model;

import X.0qQ;
import X.C7X;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;

public final class FeaturedIncentiveDetails implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWW.A00(0);
    public final C7X A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeValue(this.A00);
        parcel.writeString(this.A01);
    }

    public FeaturedIncentiveDetails(C7X c7x, String str) {
        this.A00 = c7x;
        this.A01 = str;
    }

    public FeaturedIncentiveDetails() {
        this((C7X) null, (String) null);
    }
}
