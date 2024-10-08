package com.instagram.common.gallery;

import X.0qQ;
import X.C376419Hx;
import android.os.Parcel;
import android.os.Parcelable;

public final class GeneratedMediaMetadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C376419Hx(71);
    public final String A00;
    public final boolean A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    public GeneratedMediaMetadata(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }

    public GeneratedMediaMetadata() {
        this((String) null, false);
    }
}
