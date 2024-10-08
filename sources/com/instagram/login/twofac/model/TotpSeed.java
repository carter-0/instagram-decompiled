package com.instagram.login.twofac.model;

import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;

public final class TotpSeed implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C71269Ogb(8);
    public String A00;
    public String A01;
    public String A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
