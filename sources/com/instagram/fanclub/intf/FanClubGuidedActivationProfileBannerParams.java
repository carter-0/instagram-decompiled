package com.instagram.fanclub.intf;

import X.0qQ;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;

public final class FanClubGuidedActivationProfileBannerParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6E(40);
    public final int A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A00);
    }

    public FanClubGuidedActivationProfileBannerParams(int i) {
        this.A00 = i;
    }
}
