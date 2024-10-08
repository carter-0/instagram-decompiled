package com.instagram.business.promote.model;

import X.0oU;
import X.Pxg;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;

public enum DistanceUnit implements Parcelable {
    MILE(2131970328),
    KILOMETER(2131970327);
    
    public static final Parcelable.Creator CREATOR = null;
    public final int A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        DistanceUnit[] distanceUnitArr;
        A01 = 0oU.A00(distanceUnitArr);
        CREATOR = new W6D(20);
    }

    /* access modifiers changed from: public */
    DistanceUnit(int i) {
        this.A00 = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxg.A1G(parcel, this);
    }
}
