package com.instagram.nux.cal.model;

import X.0qQ;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;

public final class FXCalAgeRestrictionScreenContent implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LVO(64);
    public FXCalAgeInfo A00;
    public FXCalAgeInfo A01;
    public String A02;
    public String A03;
    public String A04;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A01, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A00, 0);
    }
}
