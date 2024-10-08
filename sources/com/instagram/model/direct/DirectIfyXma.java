package com.instagram.model.direct;

import X.0qQ;
import X.AnonymousClass000;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41848B3p;
import X.C48097EVp;
import X.C71269Ogb;
import X.Pxd;
import android.os.Parcel;
import android.os.Parcelable;

public final class DirectIfyXma extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C71269Ogb(31);
    public final long A00;
    public final C48097EVp A01;
    public final Long A02;
    public final String A03;
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
            if (obj instanceof DirectIfyXma) {
                DirectIfyXma directIfyXma = (DirectIfyXma) obj;
                if (this.A00 != directIfyXma.A00 || !0qQ.A0K(this.A02, directIfyXma.A02) || !0qQ.A0K(this.A03, directIfyXma.A03) || this.A01 != directIfyXma.A01 || !0qQ.A0K(this.A06, directIfyXma.A06) || !0qQ.A0K(this.A07, directIfyXma.A07) || !0qQ.A0K(this.A04, directIfyXma.A04) || !0qQ.A0K(this.A05, directIfyXma.A05) || !0qQ.A0K(this.A08, directIfyXma.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeLong(this.A00);
        C41848B3p.A1K(parcel, this.A02);
        parcel.writeString(this.A03);
        C48097EVp eVp = this.A01;
        if (eVp == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            AnonymousClass7TE.A1T(parcel, eVp);
        }
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A08);
    }

    public final int hashCode() {
        long j = this.A00;
        return (((((((((((((((((int) (j ^ (j >>> 32))) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + C41845B3m.A00(this.A08);
    }

    public DirectIfyXma(C48097EVp eVp, Long l, String str, String str2, String str3, String str4, String str5, String str6, long j) {
        this.A00 = j;
        this.A02 = l;
        this.A03 = str;
        this.A01 = eVp;
        this.A06 = str2;
        this.A07 = str3;
        this.A04 = str4;
        this.A05 = str5;
        this.A08 = str6;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("DirectIfyXma(generationId=");
        A1A.append(this.A00);
        A1A.append(", mediaId=");
        A1A.append(this.A02);
        A1A.append(AnonymousClass000.A00(2039));
        A1A.append(this.A03);
        A1A.append(Pxd.A00(117));
        A1A.append(this.A01);
        A1A.append(Pxd.A00(10));
        A1A.append(this.A06);
        A1A.append(AnonymousClass000.A00(851));
        A1A.append(this.A07);
        A1A.append(AnonymousClass000.A00(2040));
        A1A.append(this.A04);
        A1A.append(", recipeMimicryCaption=");
        A1A.append(this.A05);
        A1A.append(", stickerTopic=");
        A1A.append(this.A08);
        return AnonymousClass7TG.A0p(A1A);
    }
}
