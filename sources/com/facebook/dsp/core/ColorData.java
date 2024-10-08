package com.facebook.dsp.core;

import X.0qQ;
import X.SWS;
import android.os.Parcel;
import android.os.Parcelable;

public final class ColorData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new SWS(78);
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

    public ColorData(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
