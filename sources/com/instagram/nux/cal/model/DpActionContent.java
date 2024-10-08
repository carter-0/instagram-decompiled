package com.instagram.nux.cal.model;

import X.0qQ;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;

public final class DpActionContent implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LVO(62);
    public String A00;
    public String A01;
    public String A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
