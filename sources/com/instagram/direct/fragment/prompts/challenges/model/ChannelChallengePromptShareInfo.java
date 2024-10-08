package com.instagram.direct.fragment.prompts.challenges.model;

import X.0qQ;
import X.AnonymousClass7TG;
import X.C41847B3o;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.MessagingOffPlatformShareType;

public final class ChannelChallengePromptShareInfo implements ChannelChallengeShareInfo {
    public static final Parcelable.Creator CREATOR = new LVP(69);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final Integer A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    public final String Cmu() {
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A00);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeInt(C41847B3o.A00(parcel, this.A07));
        parcel.writeString(this.A06);
        parcel.writeString(this.A08);
        parcel.writeString(this.A02);
    }

    public final Integer AdO() {
        return this.A07;
    }

    public final String Amd() {
        return this.A00;
    }

    public final String Amf() {
        return this.A08;
    }

    public final String Amg() {
        return this.A09;
    }

    public final String Ami() {
        return this.A0A;
    }

    public final String AnZ() {
        return this.A01;
    }

    public final String Aqe() {
        return this.A00;
    }

    public final String B23() {
        return this.A02;
    }

    public final String BSE() {
        return this.A03;
    }

    public final String C6C() {
        return this.A04;
    }

    public final String C6k() {
        return this.A05;
    }

    public final String CD1() {
        return this.A06;
    }

    public final MessagingOffPlatformShareType FH6() {
        return MessagingOffPlatformShareType.igbc_challenge;
    }

    public ChannelChallengePromptShareInfo(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        AnonymousClass7TG.A1P(str, str3);
        0qQ.A0B(str10, 11);
        this.A04 = str;
        this.A05 = str2;
        this.A00 = str3;
        this.A09 = str4;
        this.A0A = str5;
        this.A03 = str6;
        this.A01 = str7;
        this.A07 = num;
        this.A06 = str8;
        this.A08 = str9;
        this.A02 = str10;
    }
}
