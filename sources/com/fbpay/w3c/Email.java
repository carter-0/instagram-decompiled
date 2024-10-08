package com.fbpay.w3c;

import X.0qQ;
import X.C11367SPk;
import X.C41848B3p;
import X.C51971G9r;
import X.Pxg;
import X.Pxj;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;

public class Email implements Parcelable, EmailSpec {
    public static final Parcelable.Creator CREATOR = SWW.A00(40);
    public final Boolean A00;
    public final String A01;
    public final String A02;

    public Email(Boolean bool, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = bool;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Email) {
                Email email = (Email) obj;
                if (!0qQ.A0K(this.A01, email.A01) || !0qQ.A0K(this.A02, email.A02) || !0qQ.A0K(this.A00, email.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((C11367SPk.A01(this.A01) * 31) + C51971G9r.A0E(this.A02)) * 31) + C51971G9r.A0E(this.A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxj.A1B(parcel, this.A01, 0, 1);
        Pxj.A1B(parcel, this.A02, 0, 1);
        C41848B3p.A1I(parcel, this.A00);
    }

    public Email(Parcel parcel) {
        Boolean bool = null;
        if (Pxj.A0A(parcel, this) == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        this.A00 = parcel.readInt() != 0 ? Boolean.valueOf(Pxg.A1U(parcel)) : bool;
    }
}
