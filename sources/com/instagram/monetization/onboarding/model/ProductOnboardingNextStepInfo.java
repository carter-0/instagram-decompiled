package com.instagram.monetization.onboarding.model;

import X.0qQ;
import android.os.Parcel;
import android.os.Parcelable;

public final class ProductOnboardingNextStepInfo implements Parcelable {
    public int A00 = 0;
    public String A01 = "incomplete";
    public String A02 = null;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
    }
}
