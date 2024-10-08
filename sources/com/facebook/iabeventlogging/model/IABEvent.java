package com.facebook.iabeventlogging.model;

import X.C8945RGn;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class IABEvent implements Parcelable {
    public static final IABEmptyEvent A04 = new IABEmptyEvent();
    public static final Parcelable.Creator CREATOR = SWZ.A01(13);
    public final long A00;
    public final long A01;
    public final C8945RGn A02;
    public final String A03;

    public final int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02.A00);
        parcel.writeString(this.A03);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }

    public IABEvent(C8945RGn rGn, String str, long j, long j2) {
        this.A02 = rGn;
        this.A03 = str;
        this.A01 = j;
        this.A00 = j2;
    }
}
