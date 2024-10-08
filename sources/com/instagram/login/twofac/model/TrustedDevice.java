package com.instagram.login.twofac.model;

import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;

public final class TrustedDevice implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C71269Ogb(9);
    public double A00;
    public double A01;
    public long A02;
    public Integer A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public boolean A09;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeLong(this.A02);
        parcel.writeDouble(this.A00);
        parcel.writeDouble(this.A01);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeString(this.A08);
    }
}
