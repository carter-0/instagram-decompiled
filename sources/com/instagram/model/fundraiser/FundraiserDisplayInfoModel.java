package com.instagram.model.fundraiser;

import X.0qQ;
import X.C71269Ogb;
import X.DbW;
import android.os.Parcel;
import android.os.Parcelable;

public final class FundraiserDisplayInfoModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C71269Ogb(53);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public FundraiserDisplayInfoModel(String str, String str2, String str3, String str4, String str5) {
        DbW.A1N(str3, 3, str5);
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
        this.A04 = str4;
        this.A03 = str5;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
    }
}
