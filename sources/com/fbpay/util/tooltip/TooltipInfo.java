package com.fbpay.util.tooltip;

import X.0qQ;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;

public final class TooltipInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWW.A00(36);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A04);
    }

    public TooltipInfo(int i, int i2, int i3, int i4, int i5, int i6) {
        this.A01 = i;
        this.A00 = i2;
        this.A03 = i3;
        this.A05 = i4;
        this.A02 = i5;
        this.A04 = i6;
    }
}
