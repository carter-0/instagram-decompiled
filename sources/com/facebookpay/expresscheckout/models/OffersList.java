package com.facebookpay.expresscheckout.models;

import X.0qQ;
import X.0sn;
import X.C41848B3p;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
import java.util.List;

public final class OffersList implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWV.A00(48);
    @SerializedName("offersList")
    public final List<ECPOffer> A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        Iterator A1F = C41848B3p.A1F(parcel, this.A00);
        while (A1F.hasNext()) {
            ((ECPOffer) A1F.next()).writeToParcel(parcel, i);
        }
    }

    public OffersList(List list) {
        this.A00 = list;
    }

    public OffersList() {
        this(0sn.A00);
    }
}
