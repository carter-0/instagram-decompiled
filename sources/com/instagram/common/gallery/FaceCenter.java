package com.instagram.common.gallery;

import X.0qQ;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;

public final class FaceCenter implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6D(86);
    public float A00;
    public float A01;
    public float A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A00);
    }
}
