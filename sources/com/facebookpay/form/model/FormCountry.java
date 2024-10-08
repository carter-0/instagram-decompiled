package com.facebookpay.form.model;

import X.0qQ;
import X.C41848B3p;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.locale.Country;
import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
import java.util.List;

public final class FormCountry implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWV.A00(93);
    @SerializedName("country")
    public final Country A00;
    @SerializedName("formFields")
    public final List<FormField> A01;

    public FormCountry(Country country, List list) {
        0qQ.A0B(country, 1);
        this.A00 = country;
        this.A01 = list;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        Iterator A1F = C41848B3p.A1F(parcel, this.A01);
        while (A1F.hasNext()) {
            ((FormField) A1F.next()).writeToParcel(parcel, i);
        }
    }
}
