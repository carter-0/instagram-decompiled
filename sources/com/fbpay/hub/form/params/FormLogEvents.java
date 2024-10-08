package com.fbpay.hub.form.params;

import X.0qQ;
import X.C11367SPk;
import X.C51971G9r;
import X.Pxi;
import X.Pxj;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;

public class FormLogEvents implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWW.A00(20);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    public FormLogEvents(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = null;
        this.A05 = str5;
        this.A06 = str6;
        this.A07 = str7;
        this.A08 = null;
        this.A09 = str8;
        this.A0A = str9;
        this.A0B = str10;
    }

    public FormLogEvents(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
        this.A05 = str6;
        this.A06 = str7;
        this.A07 = str8;
        this.A08 = str9;
        this.A09 = str10;
        this.A0A = str11;
        this.A0B = str12;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FormLogEvents) {
                FormLogEvents formLogEvents = (FormLogEvents) obj;
                if (!0qQ.A0K(this.A00, formLogEvents.A00) || !0qQ.A0K(this.A01, formLogEvents.A01) || !0qQ.A0K(this.A02, formLogEvents.A02) || !0qQ.A0K(this.A03, formLogEvents.A03) || !0qQ.A0K(this.A04, formLogEvents.A04) || !0qQ.A0K(this.A05, formLogEvents.A05) || !0qQ.A0K(this.A06, formLogEvents.A06) || !0qQ.A0K(this.A07, formLogEvents.A07) || !0qQ.A0K(this.A08, formLogEvents.A08) || !0qQ.A0K(this.A09, formLogEvents.A09) || !0qQ.A0K(this.A0A, formLogEvents.A0A) || !0qQ.A0K(this.A0B, formLogEvents.A0B)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((((((((C11367SPk.A01(this.A00) * 31) + C51971G9r.A0E(this.A01)) * 31) + C51971G9r.A0E(this.A02)) * 31) + C51971G9r.A0E(this.A03)) * 31) + C51971G9r.A0E(this.A04)) * 31) + C51971G9r.A0E(this.A05)) * 31) + C51971G9r.A0E(this.A06)) * 31) + C51971G9r.A0E(this.A07)) * 31) + C51971G9r.A0E(this.A08)) * 31) + C51971G9r.A0E(this.A09)) * 31) + C51971G9r.A0E(this.A0A)) * 31) + C51971G9r.A0E(this.A0B);
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
        Pxj.A1B(parcel, this.A08, 0, 1);
        Pxj.A1B(parcel, this.A09, 0, 1);
        Pxj.A1B(parcel, this.A0A, 0, 1);
        Pxj.A1B(parcel, this.A0B, 0, 1);
    }

    public FormLogEvents(Parcel parcel) {
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
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = parcel.readString();
        }
        this.A0A = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A0B = Pxi.A0e(parcel);
    }
}
