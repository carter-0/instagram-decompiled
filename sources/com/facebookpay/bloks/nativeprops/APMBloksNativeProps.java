package com.facebookpay.bloks.nativeprops;

import X.0qQ;
import X.0sP;
import X.AnonymousClass7TG;
import X.C51974G9v;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;

public final class APMBloksNativeProps implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWZ.A01(79);
    public 0sP A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A06);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A05);
        parcel.writeString(this.A01);
        parcel.writeString(this.A04);
    }

    public APMBloksNativeProps(String str, String str2, String str3, String str4, String str5, String str6) {
        C51974G9v.A1P(str, str2, str3, str4);
        AnonymousClass7TG.A1S(str5, str6);
        this.A06 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A05 = str4;
        this.A01 = str5;
        this.A04 = str6;
    }
}
