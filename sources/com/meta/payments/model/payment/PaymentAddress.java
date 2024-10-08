package com.meta.payments.model.payment;

import X.0qQ;
import X.C51974G9v;
import X.SWU;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class PaymentAddress implements Parcelable {
    public static final Parcelable.Creator CREATOR = new SWU(46);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeStringList(this.A09);
        parcel.writeString(this.A00);
        parcel.writeString(this.A07);
        parcel.writeString(this.A01);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
        parcel.writeString(this.A08);
    }

    public PaymentAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list) {
        C51974G9v.A1P(list, str, str2, str3);
        0qQ.A0B(str4, 5);
        this.A09 = list;
        this.A00 = str;
        this.A07 = str2;
        this.A01 = str3;
        this.A05 = str4;
        this.A06 = str5;
        this.A03 = str6;
        this.A04 = str7;
        this.A02 = str8;
        this.A08 = str9;
    }
}
