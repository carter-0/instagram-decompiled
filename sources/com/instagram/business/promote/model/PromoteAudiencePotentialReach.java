package com.instagram.business.promote.model;

import X.0qQ;
import X.1XP;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;

public final class PromoteAudiencePotentialReach extends 1XP implements Parcelable {
    public static final W6D CREATOR = new W6D(32);
    public int A00;
    public int A01;
    public int A02;
    public AudiencePotentialReachRating A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A03, i);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
    }
}
