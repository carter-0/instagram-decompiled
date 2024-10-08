package com.instagram.direct.fragment.prompts.challenges.model;

import X.0qQ;
import X.AnonymousClass7TG;
import X.C41847B3o;
import X.C41848B3p;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.MessagingOffPlatformShareType;
import java.util.Iterator;
import java.util.List;

public final class ChannelChallengeAllWinnersShareInfo implements ChannelChallengeShareInfo {
    public static final Parcelable.Creator CREATOR = new LVP(67);
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;
    public final List A09;
    public final Integer A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;

    public final String Cmu() {
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A01);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0D);
        Iterator A1F = C41848B3p.A1F(parcel, this.A08);
        while (A1F.hasNext()) {
            C41847B3o.A1I(parcel, A1F, i);
        }
        Iterator A1F2 = C41848B3p.A1F(parcel, this.A09);
        while (A1F2.hasNext()) {
            C41847B3o.A1I(parcel, A1F2, i);
        }
        parcel.writeInt(this.A00);
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
        parcel.writeInt(C41847B3o.A00(parcel, this.A0A));
        parcel.writeString(this.A07);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A03);
    }

    public final Integer AdO() {
        return this.A0A;
    }

    public final String Amd() {
        return this.A01;
    }

    public final String Amf() {
        return this.A0B;
    }

    public final String Amg() {
        return this.A0C;
    }

    public final String Ami() {
        return this.A0D;
    }

    public final String AnZ() {
        return this.A02;
    }

    public final String Aqe() {
        return this.A01;
    }

    public final String B23() {
        return this.A03;
    }

    public final String BSE() {
        return this.A04;
    }

    public final String C6C() {
        return this.A05;
    }

    public final String C6k() {
        return this.A06;
    }

    public final String CD1() {
        return this.A07;
    }

    public final MessagingOffPlatformShareType FH6() {
        return MessagingOffPlatformShareType.igbc_challenge_winners;
    }

    public ChannelChallengeAllWinnersShareInfo(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list, List list2, int i) {
        AnonymousClass7TG.A1P(str, str3);
        0qQ.A0B(str10, 14);
        this.A05 = str;
        this.A06 = str2;
        this.A01 = str3;
        this.A0C = str4;
        this.A0D = str5;
        this.A08 = list;
        this.A09 = list2;
        this.A00 = i;
        this.A04 = str6;
        this.A02 = str7;
        this.A0A = num;
        this.A07 = str8;
        this.A0B = str9;
        this.A03 = str10;
    }
}
