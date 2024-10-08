package com.instagram.nux.cal.model;

import X.1XP;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;

public final class NuxConnectResponse extends 1XP implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LVO(66);
    public String A00;
    public String A01;
    public String A02;

    public final int describeContents() {
        return 0;
    }

    public final String getStatus() {
        String str = this.A01;
        str.getClass();
        return str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
    }
}
