package com.facebook.businessextension.jscalls;

import X.SWS;
import android.os.Parcel;
import android.os.Parcelable;

public class InitJSBridgeCallData implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWS.A00(31);
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }

    public InitJSBridgeCallData(Parcel parcel) {
        this.A00 = parcel.readString();
    }
}
