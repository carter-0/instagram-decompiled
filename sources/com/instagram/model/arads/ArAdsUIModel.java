package com.instagram.model.arads;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;

public final class ArAdsUIModel extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C71269Ogb(22);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ArAdsUIModel) {
                ArAdsUIModel arAdsUIModel = (ArAdsUIModel) obj;
                if (!0qQ.A0K(this.A02, arAdsUIModel.A02) || !0qQ.A0K(this.A03, arAdsUIModel.A03) || !0qQ.A0K(this.A04, arAdsUIModel.A04) || !0qQ.A0K(this.A05, arAdsUIModel.A05) || !0qQ.A0K(this.A01, arAdsUIModel.A01) || !0qQ.A0K(this.A00, arAdsUIModel.A00) || !0qQ.A0K(this.A06, arAdsUIModel.A06) || !0qQ.A0K(this.A07, arAdsUIModel.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
    }

    public final int hashCode() {
        return (((((((((((((AnonymousClass7TG.A0E(this.A02) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + C41845B3m.A00(this.A07);
    }

    public ArAdsUIModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A01 = str5;
        this.A00 = str6;
        this.A06 = str7;
        this.A07 = str8;
    }
}
