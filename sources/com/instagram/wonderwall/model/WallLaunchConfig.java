package com.instagram.wonderwall.model;

import X.0qQ;
import X.SWU;
import android.os.Parcel;
import android.os.Parcelable;

public final class WallLaunchConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new SWU(7);
    public Destination A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
    }

    public WallLaunchConfig(Destination destination, String str) {
        this.A01 = str;
        this.A00 = destination;
    }
}
