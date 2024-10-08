package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.DE7;
import android.os.Parcel;
import android.os.Parcelable;

public final class DEPProgramLevelContentResponse extends AnonymousClass0T0 implements Parcelable, DEPProgramLevelContentResponseIntf {
    public static final Parcelable.Creator CREATOR = new DE7(48);
    public final String A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DEPProgramLevelContentResponse) {
                DEPProgramLevelContentResponse dEPProgramLevelContentResponse = (DEPProgramLevelContentResponse) obj;
                if (!0qQ.A0K(this.A04, dEPProgramLevelContentResponse.A04) || !0qQ.A0K(this.A05, dEPProgramLevelContentResponse.A05) || !0qQ.A0K(this.A00, dEPProgramLevelContentResponse.A00) || !0qQ.A0K(this.A06, dEPProgramLevelContentResponse.A06) || this.A03 != dEPProgramLevelContentResponse.A03 || !0qQ.A0K(this.A07, dEPProgramLevelContentResponse.A07) || !0qQ.A0K(this.A08, dEPProgramLevelContentResponse.A08) || !0qQ.A0K(this.A01, dEPProgramLevelContentResponse.A01) || !0qQ.A0K(this.A02, dEPProgramLevelContentResponse.A02) || !0qQ.A0K(this.A09, dEPProgramLevelContentResponse.A09)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A00);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A09);
    }

    public final int hashCode() {
        return ((((((((AnonymousClass7TF.A09(this.A03, ((((((AnonymousClass7TG.A0E(this.A04) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + C41845B3m.A00(this.A09);
    }

    public DEPProgramLevelContentResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z) {
        this.A04 = str;
        this.A05 = str2;
        this.A00 = str3;
        this.A06 = str4;
        this.A03 = z;
        this.A07 = str5;
        this.A08 = str6;
        this.A01 = str7;
        this.A02 = str8;
        this.A09 = str9;
    }
}
