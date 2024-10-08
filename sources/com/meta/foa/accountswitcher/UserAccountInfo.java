package com.meta.foa.accountswitcher;

import X.0qQ;
import X.AnonymousClass000;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C66579MXk;
import X.SWU;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class UserAccountInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new SWU(23);
    public String A00;
    public List A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UserAccountInfo) {
                UserAccountInfo userAccountInfo = (UserAccountInfo) obj;
                if (!0qQ.A0K(this.A08, userAccountInfo.A08) || !0qQ.A0K(this.A00, userAccountInfo.A00) || !0qQ.A0K(this.A02, userAccountInfo.A02) || !0qQ.A0K(this.A09, userAccountInfo.A09) || !0qQ.A0K(this.A0A, userAccountInfo.A0A) || !0qQ.A0K(this.A05, userAccountInfo.A05) || !0qQ.A0K(this.A06, userAccountInfo.A06) || !0qQ.A0K(this.A04, userAccountInfo.A04) || !0qQ.A0K(this.A03, userAccountInfo.A03) || !0qQ.A0K(this.A07, userAccountInfo.A07) || !0qQ.A0K(this.A0B, userAccountInfo.A0B) || !0qQ.A0K(this.A01, userAccountInfo.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A08);
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeString(this.A07);
        parcel.writeString(this.A0B);
        parcel.writeStringList(this.A01);
    }

    public final boolean A00() {
        String str;
        String str2 = this.A09;
        if (str2 != null) {
            switch (str2.hashCode()) {
                case -1000026613:
                    if (str2.equals("CURRENT_SHARED")) {
                        return true;
                    }
                    break;
                case -452568510:
                    str = AnonymousClass000.A00(454);
                    break;
                case 1002241282:
                    str = "LOGGED_IN";
                    break;
                case 1844922713:
                    str = "CURRENT";
                    break;
            }
            if (!str2.equals(str)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((AnonymousClass7TF.A08(this.A02, (AnonymousClass7TE.A0O(this.A08) + AnonymousClass7TG.A0E(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TG.A0E(this.A0A)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A0B)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public UserAccountInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list) {
        AnonymousClass7TG.A1P(str, str3);
        this.A08 = str;
        this.A00 = str2;
        this.A02 = str3;
        this.A09 = str4;
        this.A0A = str5;
        this.A05 = str6;
        this.A06 = str7;
        this.A04 = str8;
        this.A03 = str9;
        this.A07 = str10;
        this.A0B = str11;
        this.A01 = list;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("UserAccountInfo(userId=");
        A1A.append(this.A08);
        A1A.append(AnonymousClass000.A00(2035));
        A1A.append(this.A00);
        A1A.append(", accountType=");
        A1A.append(this.A02);
        A1A.append(", userType=");
        A1A.append(this.A09);
        A1A.append(", username=");
        A1A.append(this.A0A);
        A1A.append(", name=");
        A1A.append(this.A05);
        A1A.append(C66579MXk.A00(81));
        A1A.append(this.A06);
        A1A.append(", badgeText=");
        A1A.append(this.A04);
        A1A.append(", badgeCount=");
        A1A.append(this.A03);
        A1A.append(", unpackedNotifsText=");
        A1A.append(this.A07);
        A1A.append(", facebookAccessToken=");
        A1A.append(this.A0B);
        A1A.append(", facebookSessionCookies=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
