package com.facebook.iabbwpextension;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C51971G9r;
import X.C51975G9x;
import X.RVU;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;

public final class IABBwPExtension extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWZ.A01(12);
    public final int A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public IABBwPExtension(Integer num, String str, String str2, String str3, String str4, String str5, int i) {
        0qQ.A0B(num, 1);
        this.A01 = num;
        this.A05 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A00 = i;
        this.A04 = str4;
        this.A06 = str5;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IABBwPExtension) {
                IABBwPExtension iABBwPExtension = (IABBwPExtension) obj;
                if (this.A01 != iABBwPExtension.A01 || !0qQ.A0K(this.A05, iABBwPExtension.A05) || !0qQ.A0K(this.A03, iABBwPExtension.A03) || !0qQ.A0K(this.A02, iABBwPExtension.A02) || this.A00 != iABBwPExtension.A00 || !0qQ.A0K(this.A04, iABBwPExtension.A04) || !0qQ.A0K(this.A06, iABBwPExtension.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(RVU.A00(this.A01));
        parcel.writeString(this.A05);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A04);
        parcel.writeString(this.A06);
    }

    public final int hashCode() {
        Integer num = this.A01;
        return (((((((((((C51971G9r.A0D(num, RVU.A00(num)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + this.A00) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + C41845B3m.A00(this.A06);
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("IABBwPExtension(bwPType=");
        Integer num = this.A01;
        if (num != null) {
            str = RVU.A00(num);
        } else {
            str = "null";
        }
        A1A.append(str);
        A1A.append(", loadingPageUrl=");
        A1A.append(this.A05);
        A1A.append(", apiKey=");
        A1A.append(this.A03);
        A1A.append(", accessToken=");
        A1A.append(this.A02);
        A1A.append(", accessTokenExpiryDateInSecs=");
        A1A.append(this.A00);
        A1A.append(", bauProductUrl=");
        A1A.append(this.A04);
        A1A.append(", pageName=");
        return C51975G9x.A0i(this.A06, A1A);
    }
}
