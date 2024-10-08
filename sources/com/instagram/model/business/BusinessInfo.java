package com.instagram.model.business;

import X.16V;
import X.C71269Ogb;
import X.FEa;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public class BusinessInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C71269Ogb(24);
    public Address A00;
    public PublicPhoneContact A01;
    public 16V A02;
    public 16V A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public List A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A0J);
        parcel.writeString(this.A0L);
        parcel.writeParcelable(this.A00, i);
        parcel.writeList(this.A0M);
        parcel.writeString(this.A0K);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0F);
        parcel.writeByte(this.A0N ? (byte) 1 : 0);
        parcel.writeByte(this.A0Q ? (byte) 1 : 0);
        parcel.writeByte(this.A0S ? (byte) 1 : 0);
        parcel.writeByte(this.A0R ? (byte) 1 : 0);
        parcel.writeByte(this.A0O ? (byte) 1 : 0);
        parcel.writeByte(this.A0P ? (byte) 1 : 0);
        16V r1 = this.A02;
        String str2 = null;
        if (r1 != null) {
            str = String.valueOf(r1.A00);
        } else {
            str = null;
        }
        parcel.writeString(str);
        16V r12 = this.A03;
        if (r12 != null) {
            str2 = String.valueOf(r12.A00);
        }
        parcel.writeString(str2);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A0H);
    }

    public BusinessInfo(FEa fEa) {
        this.A09 = fEa.A09;
        this.A0A = fEa.A0A;
        this.A0B = fEa.A0B;
        this.A01 = fEa.A01;
        this.A0J = fEa.A0J;
        this.A0L = fEa.A0L;
        this.A00 = fEa.A00;
        this.A0M = fEa.A0M;
        this.A0K = fEa.A0K;
        this.A05 = fEa.A05;
        this.A04 = fEa.A04;
        this.A06 = fEa.A06;
        this.A07 = fEa.A07;
        this.A08 = fEa.A08;
        this.A0N = fEa.A0N;
        this.A0C = fEa.A0C;
        this.A0D = fEa.A0D;
        this.A0E = fEa.A0E;
        this.A0F = fEa.A0F;
        this.A0Q = fEa.A0Q;
        this.A0S = fEa.A0S;
        this.A0R = fEa.A0R;
        this.A0O = fEa.A0O;
        this.A0P = fEa.A0P;
        this.A02 = fEa.A02;
        this.A03 = fEa.A03;
        this.A0G = fEa.A0G;
        this.A0I = fEa.A0I;
        this.A0H = fEa.A0H;
    }
}
