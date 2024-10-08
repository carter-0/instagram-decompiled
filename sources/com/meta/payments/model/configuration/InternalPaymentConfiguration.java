package com.meta.payments.model.configuration;

import X.0qQ;
import X.AnonymousClass7TG;
import X.C41848B3p;
import X.DbW;
import X.SWU;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

public final class InternalPaymentConfiguration implements Parcelable {
    public static final Parcelable.Creator CREATOR = new SWU(33);
    public String A00;
    public String A01;
    public final int A02;
    public final int A03;
    public final Bundle A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final List A0C;

    public InternalPaymentConfiguration(Bundle bundle, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, int i, int i2) {
        DbW.A1N(str, 3, str2);
        0qQ.A0B(bundle, 13);
        this.A02 = i;
        this.A03 = i2;
        this.A09 = str;
        this.A0C = list;
        this.A0A = str2;
        this.A07 = str3;
        this.A05 = str4;
        this.A01 = str5;
        this.A00 = str6;
        this.A0B = str7;
        this.A08 = str8;
        this.A06 = str9;
        this.A04 = bundle;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        parcel.writeString(this.A09);
        Iterator A1F = C41848B3p.A1F(parcel, this.A0C);
        while (A1F.hasNext()) {
            parcel.writeInt(AnonymousClass7TG.A0F(A1F));
        }
        parcel.writeString(this.A0A);
        parcel.writeString(this.A07);
        parcel.writeString(this.A05);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A08);
        parcel.writeString(this.A06);
        parcel.writeBundle(this.A04);
    }
}
