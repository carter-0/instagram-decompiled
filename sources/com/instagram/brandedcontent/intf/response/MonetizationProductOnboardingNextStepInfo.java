package com.instagram.brandedcontent.intf.response;

import X.0qQ;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;

public final class MonetizationProductOnboardingNextStepInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = FK6.A00(95);
    public int A00;
    public String A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A01);
    }
}
