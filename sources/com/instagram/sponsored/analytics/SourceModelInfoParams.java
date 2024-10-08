package com.instagram.sponsored.analytics;

import X.0qQ;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;

public final class SourceModelInfoParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6F(65);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;

    public SourceModelInfoParams(String str, int i, int i2) {
        0qQ.A0B(str, 1);
        this.A06 = str;
        this.A02 = i;
        this.A00 = i2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A09);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A03);
        parcel.writeString(this.A08);
        parcel.writeString(this.A07);
    }
}
