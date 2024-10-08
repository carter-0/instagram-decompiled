package com.facebook.browser.lite.extensions.whatsapp;

import X.0qQ;
import X.SWS;
import android.os.Parcel;
import android.os.Parcelable;

public final class CTWABrowserCTAExtensionModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWS.A00(22);
    public final String A00;
    public final String A01;
    public final String A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public CTWABrowserCTAExtensionModel(String str, String str2, String str3) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }

    public CTWABrowserCTAExtensionModel(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }
}
