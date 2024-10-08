package com.facebook.browser.lite.extensions.igcallextension;

import X.0qQ;
import X.SWS;
import android.os.Parcel;
import android.os.Parcelable;

public final class IGCallExtensionModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWS.A00(20);
    public final String A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }

    public IGCallExtensionModel(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public IGCallExtensionModel(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
    }
}
