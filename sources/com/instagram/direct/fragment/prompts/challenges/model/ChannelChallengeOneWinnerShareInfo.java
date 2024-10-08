package com.instagram.direct.fragment.prompts.challenges.model;

import X.0qQ;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41847B3o;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.MessagingOffPlatformShareType;
import com.instagram.reels.channelchallenge.model.ChannelChallengeStickerWinnerModel;

public final class ChannelChallengeOneWinnerShareInfo implements ChannelChallengeShareInfo {
    public static final Parcelable.Creator CREATOR = new LVP(68);
    public final ChannelChallengeStickerWinnerModel A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final Integer A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A01);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
        parcel.writeInt(C41847B3o.A00(parcel, this.A08));
        parcel.writeString(this.A07);
        parcel.writeString(this.A09);
        parcel.writeString(this.A03);
    }

    public final Integer AdO() {
        return this.A08;
    }

    public final String Amd() {
        return this.A01;
    }

    public final String Amf() {
        return this.A09;
    }

    public final String Amg() {
        return this.A0A;
    }

    public final String Ami() {
        return this.A0B;
    }

    public final String AnZ() {
        return this.A02;
    }

    public final String Aqe() {
        return this.A0C;
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

    public final String Cmu() {
        return this.A0C;
    }

    public final MessagingOffPlatformShareType FH6() {
        return MessagingOffPlatformShareType.igbc_challenge_winning_submission;
    }

    public ChannelChallengeOneWinnerShareInfo(ChannelChallengeStickerWinnerModel channelChallengeStickerWinnerModel, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        AnonymousClass7TG.A1P(str, str3);
        AnonymousClass7TF.A1E(channelChallengeStickerWinnerModel, 6, str6);
        0qQ.A0B(str11, 13);
        this.A05 = str;
        this.A06 = str2;
        this.A01 = str3;
        this.A0A = str4;
        this.A0B = str5;
        this.A00 = channelChallengeStickerWinnerModel;
        this.A0C = str6;
        this.A04 = str7;
        this.A02 = str8;
        this.A08 = num;
        this.A07 = str9;
        this.A09 = str10;
        this.A03 = str11;
    }
}
