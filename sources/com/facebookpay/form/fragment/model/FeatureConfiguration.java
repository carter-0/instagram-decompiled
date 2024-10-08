package com.facebookpay.form.fragment.model;

import X.0qQ;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;

public final class FeatureConfiguration implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWV.A00(84);
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A00 ? 1 : 0);
    }

    public FeatureConfiguration(boolean z, boolean z2, boolean z3) {
        this.A01 = z;
        this.A02 = z2;
        this.A00 = z3;
    }

    public FeatureConfiguration() {
        this(false, false, false);
    }
}
