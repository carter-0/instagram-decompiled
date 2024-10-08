package com.instagram.model.rtc;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;

public final class RtcIgNotification extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C71269Ogb.A00(74);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public RtcIgNotification(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        0qQ.A0B(str2, 2);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
        this.A03 = str4;
        this.A04 = str5;
        this.A08 = str6;
        this.A07 = str7;
        this.A09 = str8;
        this.A05 = str9;
        this.A06 = str10;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RtcIgNotification) {
                RtcIgNotification rtcIgNotification = (RtcIgNotification) obj;
                if (!0qQ.A0K(this.A01, rtcIgNotification.A01) || !0qQ.A0K(this.A02, rtcIgNotification.A02) || !0qQ.A0K(this.A00, rtcIgNotification.A00) || !0qQ.A0K(this.A03, rtcIgNotification.A03) || !0qQ.A0K(this.A04, rtcIgNotification.A04) || !0qQ.A0K(this.A08, rtcIgNotification.A08) || !0qQ.A0K(this.A07, rtcIgNotification.A07) || !0qQ.A0K(this.A09, rtcIgNotification.A09) || !0qQ.A0K(this.A05, rtcIgNotification.A05) || !0qQ.A0K(this.A06, rtcIgNotification.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A08);
        parcel.writeString(this.A07);
        parcel.writeString(this.A09);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
    }

    public final int hashCode() {
        return ((((((((((((((AnonymousClass7TF.A08(this.A02, AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0E(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + C41845B3m.A00(this.A06);
    }
}
