package com.facebookpay.common.models;

import X.0qQ;
import X.AnonymousClass7TG;
import X.Pxf;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.fbpay.ptt.interfaces.SerializedName;

public final class CurrencyAmount implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWZ.A01(80);
    @SerializedName("currency")
    public final String A00;
    @SerializedName("value")
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CurrencyAmount) {
            CurrencyAmount currencyAmount = (CurrencyAmount) obj;
            if (!0qQ.A0K(this.A00, currencyAmount.A00) || !0qQ.A0K(this.A01, currencyAmount.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Pxf.A0A(this.A00, this.A01);
    }

    public CurrencyAmount(String str, String str2) {
        AnonymousClass7TG.A1O(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }
}
