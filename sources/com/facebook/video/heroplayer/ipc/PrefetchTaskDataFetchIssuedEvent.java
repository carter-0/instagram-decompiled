package com.facebook.video.heroplayer.ipc;

import X.2Z0;
import X.2Z1;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;

public class PrefetchTaskDataFetchIssuedEvent extends 2Z0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWZ.A01(69);
    public final String A00;
    public final String A01;
    public final String A02;

    public final int describeContents() {
        return 0;
    }

    public PrefetchTaskDataFetchIssuedEvent(String str, String str2, String str3) {
        super(2Z1.A0X);
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public PrefetchTaskDataFetchIssuedEvent(Parcel parcel) {
        super(2Z1.A0X);
        this.A02 = parcel.readString();
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }
}
