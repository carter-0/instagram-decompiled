package com.instagram.fanclub.intf;

import X.0qQ;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;

public final class UserPayFanclubUpsellParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6E(41);
    public String A00;
    public String A01;
    public boolean A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A02 ? 1 : 0);
    }
}
