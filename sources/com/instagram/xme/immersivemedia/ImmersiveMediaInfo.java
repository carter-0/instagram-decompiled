package com.instagram.xme.immersivemedia;

import X.0qQ;
import X.C41848B3p;
import X.SWU;
import android.os.Parcel;
import android.os.Parcelable;

public final class ImmersiveMediaInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new SWU(16);
    public Boolean A00 = null;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(C41848B3p.A1Y(parcel, this.A00) ? 1 : 0);
    }
}
