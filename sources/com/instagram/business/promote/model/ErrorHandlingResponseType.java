package com.instagram.business.promote.model;

import X.0oU;
import X.Pxg;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;

public enum ErrorHandlingResponseType implements Parcelable {
    ;
    
    public static final Parcelable.Creator CREATOR = null;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        ErrorHandlingResponseType[] errorHandlingResponseTypeArr;
        A00 = 0oU.A00(errorHandlingResponseTypeArr);
        CREATOR = new W6D(21);
    }

    /* access modifiers changed from: public */
    ErrorHandlingResponseType() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxg.A1G(parcel, this);
    }
}
