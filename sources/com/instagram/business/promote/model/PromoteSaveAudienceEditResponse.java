package com.instagram.business.promote.model;

import X.0qQ;
import X.1XP;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;

public final class PromoteSaveAudienceEditResponse extends 1XP implements Parcelable {
    public static final W6D CREATOR = new W6D(49);
    public boolean A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeByte(this.A00 ? (byte) 1 : 0);
    }
}
