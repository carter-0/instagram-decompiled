package com.instagram.wellbeing.fundraiser.model;

import X.0qQ;
import X.AnonymousClass7TG;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;

public final class ExistingStandaloneFundraiserForFeedModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6F(99);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public ExistingStandaloneFundraiserForFeedModel(String str, String str2, String str3, String str4) {
        AnonymousClass7TG.A1U(str, str2, str3);
        this.A03 = str;
        this.A00 = str2;
        this.A01 = str3;
        this.A02 = str4;
    }
}
