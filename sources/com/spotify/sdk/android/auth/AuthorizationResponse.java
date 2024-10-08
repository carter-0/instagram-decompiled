package com.spotify.sdk.android.auth;

import X.AnonymousClass05K;
import X.SWU;
import android.os.Parcel;
import android.os.Parcelable;

public class AuthorizationResponse implements Parcelable {
    public static final Parcelable.Creator CREATOR = new SWU(53);
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final int A03;
    public final String A04;
    public final String A05;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00.intValue());
    }

    public AuthorizationResponse(Integer num, String str, String str2, String str3, String str4, int i) {
        this.A00 = num;
        this.A01 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A02 = str4;
        this.A03 = i;
    }

    public AuthorizationResponse(Parcel parcel) {
        this.A03 = parcel.readInt();
        this.A02 = parcel.readString();
        this.A05 = parcel.readString();
        this.A04 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = AnonymousClass05K.A00(5)[parcel.readInt()];
    }
}
