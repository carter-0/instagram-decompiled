package com.instagram.business.promote.model;

import X.0oU;
import X.Pxg;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;

public enum SbgChannelName implements Parcelable {
    LIVE_CALL,
    SCHEDULED_CALL,
    IG_LIVE_CALL;
    
    public static final Parcelable.Creator CREATOR = null;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        SbgChannelName[] sbgChannelNameArr;
        A00 = 0oU.A00(sbgChannelNameArr);
        CREATOR = new W6D(55);
    }

    public final String toString() {
        return name();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxg.A1G(parcel, this);
    }
}
