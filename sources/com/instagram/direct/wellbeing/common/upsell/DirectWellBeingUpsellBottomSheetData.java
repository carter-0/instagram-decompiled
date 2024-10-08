package com.instagram.direct.wellbeing.common.upsell;

import X.0qQ;
import X.2EG;
import X.AnonymousClass000;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.DbS;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;

public final class DirectWellBeingUpsellBottomSheetData extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6E(18);
    public final int A00;
    public final 2EG A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;

    public DirectWellBeingUpsellBottomSheetData(2EG r2, Integer num, String str, String str2, String str3, String str4, String str5, String str6, int i, boolean z) {
        0qQ.A0B(num, 1);
        this.A02 = num;
        this.A08 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A01 = r2;
        this.A00 = i;
        this.A03 = str5;
        this.A04 = str6;
        this.A09 = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DirectWellBeingUpsellBottomSheetData) {
                DirectWellBeingUpsellBottomSheetData directWellBeingUpsellBottomSheetData = (DirectWellBeingUpsellBottomSheetData) obj;
                if (this.A02 != directWellBeingUpsellBottomSheetData.A02 || !0qQ.A0K(this.A08, directWellBeingUpsellBottomSheetData.A08) || !0qQ.A0K(this.A05, directWellBeingUpsellBottomSheetData.A05) || !0qQ.A0K(this.A06, directWellBeingUpsellBottomSheetData.A06) || !0qQ.A0K(this.A07, directWellBeingUpsellBottomSheetData.A07) || this.A01 != directWellBeingUpsellBottomSheetData.A01 || this.A00 != directWellBeingUpsellBottomSheetData.A00 || !0qQ.A0K(this.A03, directWellBeingUpsellBottomSheetData.A03) || !0qQ.A0K(this.A04, directWellBeingUpsellBottomSheetData.A04) || this.A09 != directWellBeingUpsellBottomSheetData.A09) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(AnonymousClass000.A00(955));
        parcel.writeString(this.A08);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        2EG r1 = this.A01;
        if (r1 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            AnonymousClass7TE.A1T(parcel, r1);
        }
        parcel.writeInt(this.A00);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A09 ? 1 : 0);
    }

    public final int hashCode() {
        return DbS.A06(this.A09, (((((((((((((((((-1447055436 + this.A02.intValue()) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + this.A00) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + C41845B3m.A00(this.A04)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("DirectWellBeingUpsellBottomSheetData(surface=");
        if (this.A02 != null) {
            str = AnonymousClass000.A00(955);
        } else {
            str = "null";
        }
        A1A.append(str);
        A1A.append(", title=");
        A1A.append(this.A08);
        A1A.append(", subtitle=");
        A1A.append(this.A05);
        A1A.append(", subtitleSpanText=");
        A1A.append(this.A06);
        A1A.append(", subtitleSpanUrl=");
        A1A.append(this.A07);
        A1A.append(", subtitleSpanUrlSource=");
        A1A.append(this.A01);
        A1A.append(", imageRes=");
        A1A.append(this.A00);
        A1A.append(", primaryButtonText=");
        A1A.append(this.A03);
        A1A.append(", secondaryButtonText=");
        A1A.append(this.A04);
        A1A.append(", dismissOnSecondaryButtonClick=");
        A1A.append(this.A09);
        return AnonymousClass7TG.A0p(A1A);
    }
}
