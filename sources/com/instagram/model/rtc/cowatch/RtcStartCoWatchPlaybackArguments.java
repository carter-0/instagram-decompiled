package com.instagram.model.rtc.cowatch;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41847B3o;
import X.C51971G9r;
import X.C51974G9v;
import X.C70897OQp;
import X.C71269Ogb;
import X.O1F;
import android.os.Parcel;
import android.os.Parcelable;

public final class RtcStartCoWatchPlaybackArguments extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C71269Ogb.A00(77);
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;
    public final String A04;
    public final String A05;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RtcStartCoWatchPlaybackArguments) {
                RtcStartCoWatchPlaybackArguments rtcStartCoWatchPlaybackArguments = (RtcStartCoWatchPlaybackArguments) obj;
                if (!0qQ.A0K(this.A04, rtcStartCoWatchPlaybackArguments.A04) || this.A01 != rtcStartCoWatchPlaybackArguments.A01 || this.A02 != rtcStartCoWatchPlaybackArguments.A02 || this.A03 != rtcStartCoWatchPlaybackArguments.A03 || !0qQ.A0K(this.A05, rtcStartCoWatchPlaybackArguments.A05) || !0qQ.A0K(this.A00, rtcStartCoWatchPlaybackArguments.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A04);
        switch (this.A01.intValue()) {
            case 1:
                str = "FACEBOOK";
                break;
            case 2:
                str = "MESSAGING";
                break;
            default:
                str = "INSTAGRAM";
                break;
        }
        parcel.writeString(str);
        parcel.writeString(O1F.A00(this.A02));
        parcel.writeString(C70897OQp.A01(this.A03));
        parcel.writeString(this.A05);
        parcel.writeInt(C41847B3o.A00(parcel, this.A00));
    }

    public final int hashCode() {
        String str;
        int A0O = AnonymousClass7TE.A0O(this.A04);
        int intValue = this.A01.intValue();
        switch (intValue) {
            case 1:
                str = "FACEBOOK";
                break;
            case 2:
                str = "MESSAGING";
                break;
            default:
                str = "INSTAGRAM";
                break;
        }
        int A0F = C51971G9r.A0F(str, intValue, A0O);
        Integer num = this.A02;
        int A0B = AnonymousClass7TG.A0B(num, O1F.A00(num), A0F);
        Integer num2 = this.A03;
        return ((AnonymousClass7TG.A0B(num2, C70897OQp.A01(num2), A0B) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public RtcStartCoWatchPlaybackArguments(Integer num, Integer num2, Integer num3, Integer num4, String str, String str2) {
        C51974G9v.A1P(str, num, num2, num3);
        this.A04 = str;
        this.A01 = num;
        this.A02 = num2;
        this.A03 = num3;
        this.A05 = str2;
        this.A00 = num4;
    }
}
