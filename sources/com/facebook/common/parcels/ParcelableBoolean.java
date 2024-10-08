package com.facebook.common.parcels;

import X.SWS;
import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableBoolean implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWS.A00(67);
    public final boolean A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00 ? 1 : 0);
    }

    public ParcelableBoolean(boolean z) {
        this.A00 = z;
    }
}
