package com.instagram.discovery.refinement.model;

import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;

public final class QueryInformation implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6E(35);
    public String A00 = "";
    public String A01 = "";

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
