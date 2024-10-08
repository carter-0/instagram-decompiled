package com.meta.payments.model.offer;

import X.0qQ;
import X.AnonymousClass7TG;
import X.SWU;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class InternalOffer implements Parcelable {
    public static final Parcelable.Creator CREATOR = new SWU(37);
    public final Bundle A00;
    public final String A01;
    public final String A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeBundle(this.A00);
    }

    public InternalOffer(Bundle bundle, String str, String str2) {
        AnonymousClass7TG.A1U(str, str2, bundle);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = bundle;
    }
}
