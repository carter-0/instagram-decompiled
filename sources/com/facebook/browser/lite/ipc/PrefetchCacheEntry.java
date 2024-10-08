package com.facebook.browser.lite.ipc;

import X.SWS;
import android.os.Parcel;
import android.os.Parcelable;

public final class PrefetchCacheEntry implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWS.A00(26);
    public String A00;
    public String A01;
    public String A02;
    public String A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
    }
}
