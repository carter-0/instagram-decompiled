package com.instagram.profile.intf;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class UserDetailEntryInfo extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LVO(91);
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
    public final String A0A;
    public final List A0B;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UserDetailEntryInfo) {
                UserDetailEntryInfo userDetailEntryInfo = (UserDetailEntryInfo) obj;
                if (!0qQ.A0K(this.A02, userDetailEntryInfo.A02) || !0qQ.A0K(this.A03, userDetailEntryInfo.A03) || !0qQ.A0K(this.A01, userDetailEntryInfo.A01) || !0qQ.A0K(this.A04, userDetailEntryInfo.A04) || !0qQ.A0K(this.A05, userDetailEntryInfo.A05) || !0qQ.A0K(this.A00, userDetailEntryInfo.A00) || !0qQ.A0K(this.A08, userDetailEntryInfo.A08) || !0qQ.A0K(this.A0B, userDetailEntryInfo.A0B) || !0qQ.A0K(this.A09, userDetailEntryInfo.A09) || !0qQ.A0K(this.A07, userDetailEntryInfo.A07) || !0qQ.A0K(this.A06, userDetailEntryInfo.A06) || !0qQ.A0K(this.A0A, userDetailEntryInfo.A0A)) {
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
        parcel.writeString(this.A01);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A00);
        parcel.writeString(this.A08);
        parcel.writeStringList(this.A0B);
        parcel.writeString(this.A09);
        parcel.writeString(this.A07);
        parcel.writeString(this.A06);
        parcel.writeString(this.A0A);
    }

    public final int hashCode() {
        return (((((((((((((((((((((AnonymousClass7TG.A0E(this.A02) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A0B)) * 31) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + C41845B3m.A00(this.A0A);
    }

    public UserDetailEntryInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list) {
        this.A02 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A04 = str4;
        this.A05 = str5;
        this.A00 = str6;
        this.A08 = str7;
        this.A0B = list;
        this.A09 = str8;
        this.A07 = str9;
        this.A06 = str10;
        this.A0A = str11;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("UserDetailEntryInfo(entityId=");
        A1A.append(this.A02);
        A1A.append(", entityName=");
        A1A.append(this.A03);
        A1A.append(", entityFollowStatus=");
        A1A.append(this.A01);
        A1A.append(", entityType=");
        A1A.append(this.A04);
        A1A.append(", insertionContext=");
        A1A.append(this.A05);
        A1A.append(", displayFormat=");
        A1A.append(this.A00);
        A1A.append(", netegoUnitId=");
        A1A.append(this.A08);
        A1A.append(", mediaList=");
        A1A.append(this.A0B);
        A1A.append(", rankingAlgorithm=");
        A1A.append(this.A09);
        A1A.append(", classificationAlgorithm=");
        A1A.append(this.A07);
        A1A.append(", algorithm=");
        A1A.append(this.A06);
        A1A.append(", unitAlgorithm=");
        A1A.append(this.A0A);
        return AnonymousClass7TG.A0p(A1A);
    }
}
