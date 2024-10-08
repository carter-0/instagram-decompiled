package com.fbpay.theme;

import X.0oU;
import X.Pxg;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;

public enum FBPayIcon implements Parcelable {
    CAMERA_SECONDARY(8, 14),
    LOADING_SPINNER(41, 33);
    
    public static final Parcelable.Creator CREATOR = null;
    public final int A00;
    public final int A01;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        FBPayIcon[] fBPayIconArr;
        A02 = 0oU.A00(fBPayIconArr);
        CREATOR = SWW.A00(35);
    }

    /* access modifiers changed from: public */
    FBPayIcon(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxg.A1G(parcel, this);
    }
}
