package com.instagram.creation.capture.quickcapture.analytics.common;

import X.0qQ;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;

public final class MediaTransformation implements Parcelable {
    public static final Parcelable.Creator CREATOR = LVP.A00(15);
    public float A00 = 0.0f;
    public float A01 = 0.0f;
    public float A02 = 0.0f;
    public float A03 = 1.0f;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A03);
        parcel.writeFloat(this.A00);
    }
}
