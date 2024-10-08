package com.instagram.igtv.model;

import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;

public class IGTVViewerLoggingToken implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6E(74);
    public int A00;
    public int A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A05);
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }
}
