package com.instagram.model.shopping;

import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;

public final class ProductAREffectContainer implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C71269Ogb(80);
    public ProductItemWithAR A00;
    public boolean A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeByte(this.A01 ? (byte) 1 : 0);
    }
}
