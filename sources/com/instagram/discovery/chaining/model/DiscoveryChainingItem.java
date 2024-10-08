package com.instagram.discovery.chaining.model;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C54664HMv;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.videofeed.intf.VideoFeedType;

public final class DiscoveryChainingItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6E(25);
    public final int A00;
    public final C54664HMv A01;
    public final VideoFeedType A02;
    public final Boolean A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final boolean A0K;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0D);
        AnonymousClass7TE.A1T(parcel, this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A0K ? 1 : 0);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A08);
        parcel.writeString(this.A07);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0J);
        AnonymousClass7TG.A16(parcel, this.A04, 0, 1);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        Boolean bool = this.A03;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0C);
    }

    public DiscoveryChainingItem(C54664HMv hMv, VideoFeedType videoFeedType, Boolean bool, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i, boolean z) {
        AnonymousClass7TG.A1U(str, str2, hMv);
        this.A0E = str;
        this.A0D = str2;
        this.A01 = hMv;
        this.A00 = i;
        this.A0K = z;
        this.A0I = str3;
        this.A09 = str4;
        this.A0A = str5;
        this.A08 = str6;
        this.A07 = str7;
        this.A02 = videoFeedType;
        this.A0B = str8;
        this.A0J = str9;
        this.A04 = num;
        this.A05 = str10;
        this.A06 = str11;
        this.A03 = bool;
        this.A0H = str12;
        this.A0G = str13;
        this.A0F = str14;
        this.A0C = str15;
    }
}
