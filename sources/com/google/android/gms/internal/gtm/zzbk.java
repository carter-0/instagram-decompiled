package com.google.android.gms.internal.gtm;

import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;

public final class zzbk implements Parcelable {
    @Deprecated
    public static final Parcelable.Creator CREATOR = SWR.A00(20);
    public String A00;
    public String A01;
    public String A02;

    @Deprecated
    public final int describeContents() {
        return 0;
    }

    @Deprecated
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
    }
}
