package com.instagram.business.promote.model;

import X.0qQ;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;

public final class PromoteErrorHandlingResponse implements Parcelable {
    public static final W6D CREATOR = new W6D(42);
    public ErrorHandlingResponseType A00;
    public PromoteErrorLevel A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A02);
        parcel.writeString(this.A05);
    }
}
