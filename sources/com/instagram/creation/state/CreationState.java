package com.instagram.creation.state;

import X.AnonymousClass7TE;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;

public enum CreationState implements Parcelable {
    ;
    
    public static final Parcelable.Creator CREATOR = null;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = LVP.A00(49);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TE.A1T(parcel, this);
    }
}
