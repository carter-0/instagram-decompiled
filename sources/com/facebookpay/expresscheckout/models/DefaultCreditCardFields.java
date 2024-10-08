package com.facebookpay.expresscheckout.models;

import X.0qQ;
import X.AnonymousClass7TE;
import X.C8946RGo;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

public final class DefaultCreditCardFields implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWV.A00(32);
    @SerializedName("cardType")
    public final C8946RGo A00;
    @SerializedName("last4Digits")
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        C8946RGo rGo = this.A00;
        if (rGo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            AnonymousClass7TE.A1T(parcel, rGo);
        }
        parcel.writeString(this.A01);
    }

    public DefaultCreditCardFields(C8946RGo rGo, String str) {
        this.A00 = rGo;
        this.A01 = str;
    }

    public DefaultCreditCardFields() {
        this((C8946RGo) null, (String) null);
    }
}
