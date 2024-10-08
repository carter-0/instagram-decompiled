package com.instagram.shopping.model.analytics;

import X.0qQ;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;

public final class ShoppingGuideLoggingInfo implements Parcelable {
    public static final W6F CREATOR = new W6F(45);
    public final long A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeLong(this.A00);
    }

    public ShoppingGuideLoggingInfo(Parcel parcel) {
        this.A00 = parcel.readLong();
    }
}
