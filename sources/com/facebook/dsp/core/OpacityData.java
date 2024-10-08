package com.facebook.dsp.core;

import X.0qQ;
import X.SWS;
import android.os.Parcel;
import android.os.Parcelable;

public final class OpacityData implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWS.A00(79);
    public final float A00;
    public final float A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A00);
    }

    public OpacityData(float f, float f2) {
        this.A01 = f;
        this.A00 = f2;
    }
}
