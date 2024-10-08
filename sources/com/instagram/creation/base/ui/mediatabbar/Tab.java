package com.instagram.creation.base.ui.mediatabbar;

import X.0qQ;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;

public final class Tab implements Parcelable {
    public static final Parcelable.Creator CREATOR = LVP.A00(9);
    public final int A00;
    public final int A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }

    public Tab(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
