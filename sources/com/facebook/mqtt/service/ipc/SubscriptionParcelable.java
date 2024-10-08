package com.facebook.mqtt.service.ipc;

import X.0qQ;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;

public final class SubscriptionParcelable implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWZ.A01(37);
    public int A00;
    public String A01 = "";

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
    }
}
