package com.instagram.shopping.model;

import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.LinkWithText;

public final class ShippingAndReturnsSection implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6F(43);
    public LinkWithText A00;
    public String A01;
    public String A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
    }
}
