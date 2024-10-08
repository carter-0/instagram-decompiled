package com.instagram.ui.primer;

import X.0qQ;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;

public final class ColorTint implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6F(77);
    public final int A00;
    public final int A01;
    public final int A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }

    public ColorTint(int i, int i2, int i3) {
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
    }
}
