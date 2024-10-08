package com.fbpay.w3c;

import X.0qQ;
import X.C11367SPk;
import X.C51971G9r;
import X.Pxi;
import X.Pxj;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;

public class Address implements Parcelable, AddressSpec {
    public static final Parcelable.Creator CREATOR = SWW.A00(37);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public Address(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
        this.A05 = str6;
        this.A06 = str7;
        this.A07 = str8;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Address) {
                Address address = (Address) obj;
                if (!0qQ.A0K(this.A00, address.A00) || !0qQ.A0K(this.A01, address.A01) || !0qQ.A0K(this.A02, address.A02) || !0qQ.A0K(this.A03, address.A03) || !0qQ.A0K(this.A04, address.A04) || !0qQ.A0K(this.A05, address.A05) || !0qQ.A0K(this.A06, address.A06) || !0qQ.A0K(this.A07, address.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((C11367SPk.A01(this.A00) * 31) + C51971G9r.A0E(this.A01)) * 31) + C51971G9r.A0E(this.A02)) * 31) + C51971G9r.A0E(this.A03)) * 31) + C51971G9r.A0E(this.A04)) * 31) + C51971G9r.A0E(this.A05)) * 31) + C51971G9r.A0E(this.A06)) * 31) + C51971G9r.A0E(this.A07);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxj.A1B(parcel, this.A00, 0, 1);
        Pxj.A1B(parcel, this.A01, 0, 1);
        Pxj.A1B(parcel, this.A02, 0, 1);
        Pxj.A1B(parcel, this.A03, 0, 1);
        Pxj.A1B(parcel, this.A04, 0, 1);
        Pxj.A1B(parcel, this.A05, 0, 1);
        Pxj.A1B(parcel, this.A06, 0, 1);
        Pxj.A1B(parcel, this.A07, 0, 1);
    }

    public Address(Parcel parcel) {
        String str = null;
        if (Pxj.A0A(parcel, this) == 0) {
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
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        this.A06 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A07 = Pxi.A0e(parcel);
    }
}
