package com.instagram.business.promote.model;

import X.0oU;
import X.Pxg;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;

public enum HpiSessionStatus implements Parcelable {
    ASSIGNMENT_SCHEDULED,
    FINISHED,
    IN_PROGRESS,
    PENDING;
    
    public static final Parcelable.Creator CREATOR = null;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        HpiSessionStatus[] hpiSessionStatusArr;
        A00 = 0oU.A00(hpiSessionStatusArr);
        CREATOR = new W6D(22);
    }

    public final String toString() {
        return name();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxg.A1G(parcel, this);
    }
}
