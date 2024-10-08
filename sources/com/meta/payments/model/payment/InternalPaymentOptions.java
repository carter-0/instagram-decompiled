package com.meta.payments.model.payment;

import X.0qQ;
import X.SWU;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class InternalPaymentOptions implements Parcelable {
    public static final Parcelable.Creator CREATOR = new SWU(42);
    public final int A00;
    public final int A01;
    public final int A02;
    public final Bundle A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeBundle(this.A03);
    }

    public InternalPaymentOptions(Bundle bundle, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        0qQ.A0B(bundle, 9);
        this.A06 = z;
        this.A07 = z2;
        this.A08 = z3;
        this.A05 = z4;
        this.A04 = z5;
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
        this.A03 = bundle;
    }
}
