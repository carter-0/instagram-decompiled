package com.meta.payments.error;

import X.0oU;
import X.Pxg;
import X.SWU;
import android.os.Parcel;
import android.os.Parcelable;

public enum ErrorCode implements Parcelable {
    ABORTED,
    INTERNAL_ERROR,
    INVALID_REQUEST,
    PRODUCT_OWNED,
    PRODUCT_UNAVAILABLE,
    SDK_NOT_INITIALIZED,
    SERVICE_DISCONNECTED,
    SERVICE_TIMEOUT;
    
    public static final Parcelable.Creator CREATOR = null;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        ErrorCode[] errorCodeArr;
        A00 = 0oU.A00(errorCodeArr);
        CREATOR = new SWU(31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxg.A1G(parcel, this);
    }
}
