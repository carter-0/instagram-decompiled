package com.facebook.wearable.applinks;

import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;

public enum AppLinkDeviceConnectionStatus implements Parcelable {
    CONNECTED(0),
    CONNECTING(1),
    DISCONNECTED(2),
    UNPAIRED(3);
    
    public static final Parcelable.Creator CREATOR = null;
    public final int value;

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = SWZ.A01(73);
    }

    public int getValue() {
        return this.value;
    }

    /* access modifiers changed from: public */
    AppLinkDeviceConnectionStatus(int i) {
        this.value = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }
}
