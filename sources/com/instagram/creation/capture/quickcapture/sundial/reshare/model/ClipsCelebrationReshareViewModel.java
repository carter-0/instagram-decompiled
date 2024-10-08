package com.instagram.creation.capture.quickcapture.sundial.reshare.model;

import X.0qQ;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;

public final class ClipsCelebrationReshareViewModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LVP(31);
    public final String A00;
    public final boolean A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    public ClipsCelebrationReshareViewModel(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }

    public ClipsCelebrationReshareViewModel() {
        this((String) null, false);
    }
}
