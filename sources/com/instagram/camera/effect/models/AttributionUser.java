package com.instagram.camera.effect.models;

import X.0qQ;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;

public final class AttributionUser implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6D(62);
    public ProfilePicture A00;
    public String A01;
    public String A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
    }
}
