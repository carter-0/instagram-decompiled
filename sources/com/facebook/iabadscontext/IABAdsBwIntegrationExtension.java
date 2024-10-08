package com.facebook.iabadscontext;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41848B3p;
import X.C51971G9r;
import X.C51975G9x;
import X.RVS;
import X.RVT;
import X.SWS;
import android.os.Parcel;
import android.os.Parcelable;

public final class IABAdsBwIntegrationExtension extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWS.A00(96);
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;
    public final Long A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IABAdsBwIntegrationExtension) {
                IABAdsBwIntegrationExtension iABAdsBwIntegrationExtension = (IABAdsBwIntegrationExtension) obj;
                if (this.A01 != iABAdsBwIntegrationExtension.A01 || this.A02 != iABAdsBwIntegrationExtension.A02 || !0qQ.A0K(this.A07, iABAdsBwIntegrationExtension.A07) || !0qQ.A0K(this.A03, iABAdsBwIntegrationExtension.A03) || !0qQ.A0K(this.A05, iABAdsBwIntegrationExtension.A05) || !0qQ.A0K(this.A04, iABAdsBwIntegrationExtension.A04) || !0qQ.A0K(this.A00, iABAdsBwIntegrationExtension.A00) || !0qQ.A0K(this.A06, iABAdsBwIntegrationExtension.A06) || !0qQ.A0K(this.A08, iABAdsBwIntegrationExtension.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(RVS.A00(this.A01));
        parcel.writeString(RVT.A00(this.A02));
        parcel.writeString(this.A07);
        C41848B3p.A1K(parcel, this.A03);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        AnonymousClass7TG.A16(parcel, this.A00, 0, 1);
        parcel.writeString(this.A06);
        parcel.writeString(this.A08);
    }

    public final int hashCode() {
        Integer num = this.A01;
        int A0D = C51971G9r.A0D(num, RVS.A00(num)) * 31;
        Integer num2 = this.A02;
        return ((((((((((((AnonymousClass7TG.A0B(num2, RVT.A00(num2), A0D) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + C41845B3m.A00(this.A08);
    }

    public IABAdsBwIntegrationExtension(Integer num, Integer num2, Integer num3, Long l, String str, String str2, String str3, String str4, String str5) {
        AnonymousClass7TG.A1O(num, num2);
        this.A01 = num;
        this.A02 = num2;
        this.A07 = str;
        this.A03 = l;
        this.A05 = str2;
        this.A04 = str3;
        this.A00 = num3;
        this.A06 = str4;
        this.A08 = str5;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("IABAdsBwIntegrationExtension(bwIType=");
        Integer num = this.A01;
        if (num != null) {
            str = RVS.A00(num);
        } else {
            str = "null";
        }
        A1A.append(str);
        A1A.append(", partnerType=");
        Integer num2 = this.A02;
        if (num2 != null) {
            str2 = RVT.A00(num2);
        } else {
            str2 = "null";
        }
        A1A.append(str2);
        A1A.append(", loadingPageUrl=");
        A1A.append(this.A07);
        A1A.append(", oauthIntegrationId=");
        A1A.append(this.A03);
        A1A.append(", apiKey=");
        A1A.append(this.A05);
        A1A.append(", accessToken=");
        A1A.append(this.A04);
        A1A.append(", accessTokenExpiryDateInSecs=");
        A1A.append(this.A00);
        A1A.append(", bauProductUrl=");
        A1A.append(this.A06);
        A1A.append(", pageName=");
        return C51975G9x.A0i(this.A08, A1A);
    }
}
