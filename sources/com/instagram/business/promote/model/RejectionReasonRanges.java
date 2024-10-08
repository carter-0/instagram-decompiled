package com.instagram.business.promote.model;

import X.0qQ;
import X.AnonymousClass00P;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;

public final class RejectionReasonRanges implements Parcelable {
    public static final W6D CREATOR = new W6D(54);
    public int A00;
    public int A01;
    public String A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        String str = this.A02;
        if (str != null) {
            parcel.writeString(str);
        } else {
            0qQ.A0F("entityUrl");
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
