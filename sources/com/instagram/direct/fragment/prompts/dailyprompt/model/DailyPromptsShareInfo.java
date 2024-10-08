package com.instagram.direct.fragment.prompts.dailyprompt.model;

import X.0qQ;
import X.AnonymousClass7TG;
import X.C41848B3p;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;

public final class DailyPromptsShareInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LVP(71);
    public final Boolean A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
        C41848B3p.A1I(parcel, this.A00);
        AnonymousClass7TG.A16(parcel, this.A01, 0, 1);
        parcel.writeString(this.A08);
        parcel.writeString(this.A03);
    }

    public DailyPromptsShareInfo(Boolean bool, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AnonymousClass7TG.A1P(str, str3);
        0qQ.A0B(str7, 9);
        this.A06 = str;
        this.A07 = str2;
        this.A05 = str3;
        this.A04 = str4;
        this.A02 = str5;
        this.A00 = bool;
        this.A01 = num;
        this.A08 = str6;
        this.A03 = str7;
    }
}
