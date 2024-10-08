package com.fbpay.hub.contactinfo.address.api;

import X.0qQ;
import X.C11367SPk;
import X.C51971G9r;
import X.Pxg;
import X.Pxi;
import X.Pxj;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;

public class FBPayAddress implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWW.A00(18);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;

    public FBPayAddress(String str, String str2, String str3, String str4, String str5, String str6) {
        this.A06 = null;
        this.A00 = str;
        this.A01 = str2;
        this.A07 = null;
        this.A09 = false;
        this.A08 = null;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
        this.A05 = str6;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FBPayAddress) {
                FBPayAddress fBPayAddress = (FBPayAddress) obj;
                if (!0qQ.A0K(this.A06, fBPayAddress.A06) || !0qQ.A0K(this.A00, fBPayAddress.A00) || !0qQ.A0K(this.A01, fBPayAddress.A01) || !0qQ.A0K(this.A07, fBPayAddress.A07) || this.A09 != fBPayAddress.A09 || !0qQ.A0K(this.A08, fBPayAddress.A08) || !0qQ.A0K(this.A02, fBPayAddress.A02) || !0qQ.A0K(this.A03, fBPayAddress.A03) || !0qQ.A0K(this.A04, fBPayAddress.A04) || !0qQ.A0K(this.A05, fBPayAddress.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((C11367SPk.A00((((((C11367SPk.A01(this.A06) * 31) + C51971G9r.A0E(this.A00)) * 31) + C51971G9r.A0E(this.A01)) * 31) + C51971G9r.A0E(this.A07), this.A09) * 31) + C51971G9r.A0E(this.A08)) * 31) + C51971G9r.A0E(this.A02)) * 31) + C51971G9r.A0E(this.A03)) * 31) + C51971G9r.A0E(this.A04)) * 31) + C51971G9r.A0E(this.A05);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxj.A1B(parcel, this.A06, 0, 1);
        Pxj.A1B(parcel, this.A00, 0, 1);
        Pxj.A1B(parcel, this.A01, 0, 1);
        Pxj.A1B(parcel, this.A07, 0, 1);
        parcel.writeInt(this.A09 ? 1 : 0);
        Pxj.A1B(parcel, this.A08, 0, 1);
        Pxj.A1B(parcel, this.A02, 0, 1);
        Pxj.A1B(parcel, this.A03, 0, 1);
        Pxj.A1B(parcel, this.A04, 0, 1);
        Pxj.A1B(parcel, this.A05, 0, 1);
    }

    public FBPayAddress(Parcel parcel) {
        String str = null;
        if (Pxj.A0A(parcel, this) == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        this.A09 = Pxg.A1U(parcel);
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        this.A04 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A05 = Pxi.A0e(parcel);
    }
}
