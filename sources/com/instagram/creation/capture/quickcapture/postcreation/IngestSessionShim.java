package com.instagram.creation.capture.quickcapture.postcreation;

import X.0qQ;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class IngestSessionShim implements Parcelable {
    public static final Parcelable.Creator CREATOR = LVP.A00(26);
    public final List A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeStringList(this.A00);
    }

    public IngestSessionShim(List list) {
        this.A00 = list;
    }
}
