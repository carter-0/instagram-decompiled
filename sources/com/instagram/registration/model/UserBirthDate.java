package com.instagram.registration.model;

import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;

public final class UserBirthDate implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6F(9);
    public int A00;
    public int A01;
    public int A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }
}
