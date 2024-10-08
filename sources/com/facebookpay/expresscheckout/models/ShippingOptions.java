package com.facebookpay.expresscheckout.models;

import X.0qQ;
import X.Pxi;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Deprecated;

@Deprecated(message = "To be replaced with FulfillmentOptions")
public final class ShippingOptions implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWV.A00(56);
    @SerializedName("defaultSelection")
    public final String A00;
    @SerializedName("shippingOptionList")
    public final ArrayList<ShippingOption> A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
        Iterator A0l = Pxi.A0l(parcel, this.A01);
        while (A0l.hasNext()) {
            ((ShippingOption) A0l.next()).writeToParcel(parcel, i);
        }
    }

    public ShippingOptions(String str, ArrayList arrayList) {
        this.A00 = str;
        this.A01 = arrayList;
    }
}
