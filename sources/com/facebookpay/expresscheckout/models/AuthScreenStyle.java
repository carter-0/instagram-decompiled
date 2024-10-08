package com.facebookpay.expresscheckout.models;

import X.0qQ;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;

public final class AuthScreenStyle implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWV.A00(27);
    public final int A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A00);
    }

    public AuthScreenStyle(int i) {
        this.A00 = i;
    }

    public AuthScreenStyle() {
        this(0);
    }
}
