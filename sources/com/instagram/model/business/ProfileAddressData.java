package com.instagram.model.business;

import X.00p;
import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.AnonymousClass7TH;
import X.C41845B3m;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;

public final class ProfileAddressData extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C71269Ogb(25);
    public Float A00;
    public Float A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProfileAddressData) {
                ProfileAddressData profileAddressData = (ProfileAddressData) obj;
                if (!0qQ.A0K(this.A06, profileAddressData.A06) || !0qQ.A0K(this.A03, profileAddressData.A03) || !0qQ.A0K(this.A04, profileAddressData.A04) || !0qQ.A0K(this.A05, profileAddressData.A05) || !0qQ.A0K(this.A08, profileAddressData.A08) || !0qQ.A0K(this.A00, profileAddressData.A00) || !0qQ.A0K(this.A01, profileAddressData.A01) || !0qQ.A0K(this.A07, profileAddressData.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A06);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A08);
        AnonymousClass7TH.A0P(parcel, this.A00);
        AnonymousClass7TH.A0P(parcel, this.A01);
        parcel.writeString(this.A07);
    }

    public final int hashCode() {
        return (((((((((((((AnonymousClass7TG.A0E(this.A06) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + C41845B3m.A00(this.A07);
    }

    public ProfileAddressData(Float f, Float f2, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A06 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A08 = str5;
        this.A00 = f;
        this.A01 = f2;
        this.A07 = str6;
        String str7 = null;
        this.A02 = (str == null || !00p.A0k(str, "new:", false)) ? this.A06 : str7;
    }

    public ProfileAddressData() {
        this((Float) null, (Float) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
    }
}
