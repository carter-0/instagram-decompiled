package com.facebookpay.expresscheckout.models;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C8932RGa;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

public final class CheckoutPayloadKeyValue implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWV.A00(29);
    @SerializedName("key")
    public final C8932RGa A00;
    @SerializedName("value")
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this.A00);
        parcel.writeString(this.A01);
    }

    public CheckoutPayloadKeyValue(C8932RGa rGa, String str) {
        AnonymousClass7TG.A1O(rGa, str);
        this.A00 = rGa;
        this.A01 = str;
    }
}
