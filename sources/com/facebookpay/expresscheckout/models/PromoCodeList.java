package com.facebookpay.expresscheckout.models;

import X.0qQ;
import X.0sn;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public final class PromoCodeList implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWV.A00(54);
    @SerializedName("promoCodeList")
    public final List<String> A00;

    public PromoCodeList(List list) {
        0qQ.A0B(list, 1);
        this.A00 = list;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeStringList(this.A00);
    }

    public PromoCodeList() {
        this(0sn.A00);
    }
}
