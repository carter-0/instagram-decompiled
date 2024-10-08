package com.facebookpay.expresscheckout.models;

import X.0qQ;
import X.AnonymousClass7TG;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

public final class CheckoutSetupKeyValue implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWV.A00(31);
    @SerializedName("key")
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

    public CheckoutSetupKeyValue(String str, String str2) {
        AnonymousClass7TG.A1O(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }
}
