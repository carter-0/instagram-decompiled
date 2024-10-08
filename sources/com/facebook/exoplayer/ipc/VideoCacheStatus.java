package com.facebook.exoplayer.ipc;

import X.SWS;
import android.os.Parcel;
import android.os.Parcelable;

public final class VideoCacheStatus implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWS.A00(81);
    public String A00;
    public boolean A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
    }
}
