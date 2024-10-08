package com.facebookpay.form.model;

import X.0qQ;
import X.C41848B3p;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

public final class CardFormFieldConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWV.A00(92);
    public final List A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        Iterator A1F = C41848B3p.A1F(parcel, this.A00);
        while (A1F.hasNext()) {
            ((FormField) A1F.next()).writeToParcel(parcel, i);
        }
    }

    public CardFormFieldConfig(List list) {
        this.A00 = list;
    }
}
