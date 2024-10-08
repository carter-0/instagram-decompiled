package com.instagram.feed.intf;

import X.0qQ;
import X.AnonymousClass7TG;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;

public final class ContextualFeedNetworkConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6E(43);
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
    }

    public ContextualFeedNetworkConfig(String str, String str2, String str3, String str4, String str5, int i) {
        AnonymousClass7TG.A1Q(str2, str3);
        this.A01 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A00 = i;
        this.A03 = str4;
        this.A02 = str5;
    }
}
