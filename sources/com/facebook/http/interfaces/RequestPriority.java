package com.facebook.http.interfaces;

import X.AnonymousClass7TE;
import X.SWS;
import android.os.Parcel;
import android.os.Parcelable;

public enum RequestPriority implements Parcelable {
    INTERACTIVE,
    NON_INTERACTIVE,
    CAN_WAIT,
    UNNECESSARY;
    
    public static final RequestPriority A00 = null;
    public static final Parcelable.Creator CREATOR = null;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        RequestPriority requestPriority;
        A00 = requestPriority;
        CREATOR = SWS.A00(90);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TE.A1T(parcel, this);
    }
}
