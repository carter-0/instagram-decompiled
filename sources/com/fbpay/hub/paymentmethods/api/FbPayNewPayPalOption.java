package com.fbpay.hub.paymentmethods.api;

import X.0qQ;
import X.C11367SPk;
import X.C51971G9r;
import X.Pxi;
import X.Pxj;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;

public class FbPayNewPayPalOption implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWW.A00(28);
    public final String A00;
    public final String A01;

    public FbPayNewPayPalOption(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FbPayNewPayPalOption) {
                FbPayNewPayPalOption fbPayNewPayPalOption = (FbPayNewPayPalOption) obj;
                if (!0qQ.A0K(this.A00, fbPayNewPayPalOption.A00) || !0qQ.A0K(this.A01, fbPayNewPayPalOption.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (C11367SPk.A01(this.A00) * 31) + C51971G9r.A0E(this.A01);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxj.A1B(parcel, this.A00, 0, 1);
        Pxj.A1B(parcel, this.A01, 0, 1);
    }

    public FbPayNewPayPalOption(Parcel parcel) {
        this.A00 = Pxj.A0A(parcel, this) != 0 ? parcel.readString() : null;
        this.A01 = Pxi.A0e(parcel);
    }
}
