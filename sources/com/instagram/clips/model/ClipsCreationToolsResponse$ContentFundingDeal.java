package com.instagram.clips.model;

import X.0qQ;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;

public final class ClipsCreationToolsResponse$ContentFundingDeal implements Parcelable {
    public static final W6D CREATOR = new W6D(70);
    public long A00;
    public String A01;
    public String A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }
}
