package com.facebook.video.heroplayer.ipc;

import X.C66581MXm;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;

public final class SpatialAudioFocusParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWZ.A01(70);
    public final double A00;
    public final double A01;
    public final boolean A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.A02 ? (byte) 1 : 0);
        parcel.writeDouble(this.A01);
        parcel.writeDouble(this.A00);
    }

    public SpatialAudioFocusParams(Parcel parcel) {
        this.A02 = C66581MXm.A1V(parcel.readByte());
        this.A01 = parcel.readDouble();
        this.A00 = parcel.readDouble();
    }
}
