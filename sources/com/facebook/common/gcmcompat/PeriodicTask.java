package com.facebook.common.gcmcompat;

import X.SWS;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public class PeriodicTask extends Task {
    public static final Parcelable.Creator CREATOR = SWS.A00(65);
    public long A00;
    public long A01;

    public final void A00(Bundle bundle) {
        super.A00(bundle);
        bundle.putLong("period", this.A01);
        bundle.putLong("period_flex", this.A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }
}
