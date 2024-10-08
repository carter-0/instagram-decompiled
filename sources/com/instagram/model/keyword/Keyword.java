package com.instagram.model.keyword;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C51972G9s;
import X.C71269Ogb;
import X.DbS;
import X.G9t;
import android.os.Parcel;
import android.os.Parcelable;

public final class Keyword extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C71269Ogb.A00(57);
    public long A00;
    public Double A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public boolean A09;
    public boolean A0A;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Keyword(String str, String str2) {
        this((Double) null, (String) null, "", (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, false);
        0qQ.A0B(str2, 2);
        this.A03 = str;
        this.A04 = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Keyword) {
                Keyword keyword = (Keyword) obj;
                if (!0qQ.A0K(this.A03, keyword.A03) || !0qQ.A0K(this.A04, keyword.A04) || this.A00 != keyword.A00 || !0qQ.A0K(this.A05, keyword.A05) || !0qQ.A0K(this.A06, keyword.A06) || !0qQ.A0K(this.A02, keyword.A02) || !0qQ.A0K(this.A01, keyword.A01) || this.A0A != keyword.A0A || !0qQ.A0K(this.A08, keyword.A08) || !0qQ.A0K(this.A07, keyword.A07) || this.A09 != keyword.A09) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        double d;
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        Double d2 = this.A01;
        if (d2 != null) {
            d = d2.doubleValue();
        } else {
            d = 0.0d;
        }
        parcel.writeDouble(d);
    }

    public final int hashCode() {
        int A082 = AnonymousClass7TF.A08(this.A04, AnonymousClass7TG.A0E(this.A03) * 31);
        boolean z = this.A0A;
        return DbS.A06(this.A09, (((AnonymousClass7TF.A09(z, (((((((C51972G9s.A07(this.A00, A082) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + C41845B3m.A00(this.A07)) * 31);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Keyword(id=");
        A1A.append(this.A03);
        A1A.append(", name=");
        A1A.append(this.A04);
        A1A.append(", mediaCount=");
        A1A.append(this.A00);
        A1A.append(", profilePicUrl=");
        A1A.append(this.A05);
        A1A.append(", searchResultSubtitle=");
        A1A.append(this.A06);
        A1A.append(", headerTitle=");
        A1A.append(this.A02);
        A1A.append(", score=");
        A1A.append(this.A01);
        A1A.append(", isPopular=");
        A1A.append(this.A0A);
        A1A.append(", subtitle=");
        A1A.append(this.A08);
        A1A.append(", style=");
        A1A.append(this.A07);
        A1A.append(", isEcho=");
        return G9t.A1C(A1A, this.A09);
    }

    public Keyword(Double d, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, boolean z, boolean z2) {
        0qQ.A0B(str2, 2);
        this.A03 = null;
        this.A04 = str2;
        this.A00 = 0;
        this.A05 = null;
        this.A06 = null;
        this.A02 = null;
        this.A01 = null;
        this.A0A = false;
        this.A08 = null;
        this.A07 = str7;
        this.A09 = false;
    }

    public Keyword() {
        this((Double) null, (String) null, "", (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, false);
    }
}
