package com.instagram.business.promote.model;

import X.0oU;
import X.Pxg;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;

public enum PromoteErrorLevel implements Parcelable {
    ERROR;
    
    public static final Parcelable.Creator CREATOR = null;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        PromoteErrorLevel[] promoteErrorLevelArr;
        A00 = 0oU.A00(promoteErrorLevelArr);
        CREATOR = new W6D(43);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxg.A1G(parcel, this);
    }
}
