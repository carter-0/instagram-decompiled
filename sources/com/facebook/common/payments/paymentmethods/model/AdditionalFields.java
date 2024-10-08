package com.facebook.common.payments.paymentmethods.model;

import X.AnonymousClass7TE;
import X.SWS;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;

public class AdditionalFields implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWS.A00(69);
    public final Map A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeMap(this.A00);
    }

    public AdditionalFields(Parcel parcel) {
        HashMap A1E = AnonymousClass7TE.A1E();
        parcel.readMap(A1E, Map.class.getClassLoader());
        this.A00 = A1E;
    }
}
