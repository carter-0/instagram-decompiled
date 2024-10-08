package com.instagram.schools.management.data;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41848B3p;
import X.C51972G9s;
import X.C51973G9u;
import X.C54635HLs;
import X.C54672HOd;
import X.HM5;
import X.HM6;
import X.HMD;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

public final class SchoolOnboardingParcelData extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6F(25);
    public final C54672HOd A00;
    public final HM5 A01;
    public final HM6 A02;
    public final C54635HLs A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final List A0C;
    public final List A0D;
    public final List A0E;
    public final boolean A0F;
    public final boolean A0G;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SchoolOnboardingParcelData) {
                SchoolOnboardingParcelData schoolOnboardingParcelData = (SchoolOnboardingParcelData) obj;
                if (!0qQ.A0K(this.A06, schoolOnboardingParcelData.A06) || !0qQ.A0K(this.A0A, schoolOnboardingParcelData.A0A) || this.A02 != schoolOnboardingParcelData.A02 || !0qQ.A0K(this.A04, schoolOnboardingParcelData.A04) || !0qQ.A0K(this.A05, schoolOnboardingParcelData.A05) || !0qQ.A0K(this.A0D, schoolOnboardingParcelData.A0D) || !0qQ.A0K(this.A0E, schoolOnboardingParcelData.A0E) || !0qQ.A0K(this.A09, schoolOnboardingParcelData.A09) || !0qQ.A0K(this.A08, schoolOnboardingParcelData.A08) || !0qQ.A0K(this.A07, schoolOnboardingParcelData.A07) || this.A0F != schoolOnboardingParcelData.A0F || this.A01 != schoolOnboardingParcelData.A01 || this.A03 != schoolOnboardingParcelData.A03 || this.A0G != schoolOnboardingParcelData.A0G || !0qQ.A0K(this.A0B, schoolOnboardingParcelData.A0B) || this.A00 != schoolOnboardingParcelData.A00 || !0qQ.A0K(this.A0C, schoolOnboardingParcelData.A0C)) {
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
        parcel.writeString(this.A0A);
        HM6 hm6 = this.A02;
        if (hm6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            AnonymousClass7TE.A1T(parcel, hm6);
        }
        AnonymousClass7TG.A16(parcel, this.A04, 0, 1);
        AnonymousClass7TG.A16(parcel, this.A05, 0, 1);
        Iterator A1F = C41848B3p.A1F(parcel, this.A0D);
        while (A1F.hasNext()) {
            ((SchoolInfo) A1F.next()).writeToParcel(parcel, i);
        }
        Iterator A1F2 = C41848B3p.A1F(parcel, this.A0E);
        while (A1F2.hasNext()) {
            ((SchoolInfo) A1F2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.A09);
        parcel.writeString(this.A08);
        parcel.writeString(this.A07);
        parcel.writeInt(this.A0F ? 1 : 0);
        HM5 hm5 = this.A01;
        if (hm5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            AnonymousClass7TE.A1T(parcel, hm5);
        }
        AnonymousClass7TE.A1T(parcel, this.A03);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeString(this.A0B);
        AnonymousClass7TE.A1T(parcel, this.A00);
        Iterator A1F3 = C41848B3p.A1F(parcel, this.A0C);
        while (A1F3.hasNext()) {
            AnonymousClass7TE.A1T(parcel, (HMD) A1F3.next());
        }
    }

    public SchoolOnboardingParcelData(C54672HOd hOd, HM5 hm5, HM6 hm6, C54635HLs hLs, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, List list3, boolean z, boolean z2) {
        List list4 = list2;
        List list5 = list;
        C51972G9s.A1E(list5, list4);
        0qQ.A0B(str4, 9);
        String str7 = str6;
        C51973G9u.A0v(13, hLs, str7, hOd);
        List list6 = list3;
        0qQ.A0B(list6, 17);
        this.A06 = str;
        this.A0A = str2;
        this.A02 = hm6;
        this.A04 = num;
        this.A05 = num2;
        this.A0D = list5;
        this.A0E = list4;
        this.A09 = str3;
        this.A08 = str4;
        this.A07 = str5;
        this.A0F = z;
        this.A01 = hm5;
        this.A03 = hLs;
        this.A0G = z2;
        this.A0B = str7;
        this.A00 = hOd;
        this.A0C = list6;
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A0D, ((((((((AnonymousClass7TG.A0E(this.A06) * 31) + AnonymousClass7TG.A0E(this.A0A)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31);
        String str = this.A08;
        boolean z = this.A0F;
        return AnonymousClass7TE.A0N(this.A0C, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A08(this.A0B, AnonymousClass7TF.A09(this.A0G, AnonymousClass7TF.A07(this.A03, (AnonymousClass7TF.A09(z, (AnonymousClass7TF.A08(str, (AnonymousClass7TF.A07(this.A0E, A072) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TE.A0L(this.A01)) * 31)))));
    }
}
