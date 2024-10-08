package com.instagram.direct.model.thread;

import X.0qQ;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;

public final class DiscoverableThreadInfo implements Parcelable {
    public static final LVP CREATOR = LVP.A00(97);
    public String A00;
    public String A01;
    public String A02;
    public boolean A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeByte(this.A03 ? (byte) 1 : 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }
}
