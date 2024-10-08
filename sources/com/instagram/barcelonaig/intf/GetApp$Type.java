package com.instagram.barcelonaig.intf;

import X.0oU;
import X.0qQ;
import X.AnonymousClass7TE;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;

public enum GetApp$Type implements Parcelable {
    NOTIFICATION,
    OTHER_PROFILE,
    SELF_PROFILE;
    
    public static final Parcelable.Creator CREATOR = null;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this);
    }

    /* access modifiers changed from: public */
    static {
        GetApp$Type[] getApp$TypeArr;
        A00 = 0oU.A00(getApp$TypeArr);
        CREATOR = FK6.A00(91);
    }
}
