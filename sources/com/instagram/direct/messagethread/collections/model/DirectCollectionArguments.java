package com.instagram.direct.messagethread.collections.model;

import X.00l;
import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41847B3o;
import X.C41848B3p;
import X.C51967G9n;
import X.C51972G9s;
import X.C70864OPd;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Iterator;
import java.util.List;

public final class DirectCollectionArguments extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LVP(86);
    public final ImageUrl A00;
    public final DirectThreadKey A01;
    public final Boolean A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final List A0A;
    public final boolean A0B;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DirectCollectionArguments) {
                DirectCollectionArguments directCollectionArguments = (DirectCollectionArguments) obj;
                if (!0qQ.A0K(this.A00, directCollectionArguments.A00) || !0qQ.A0K(this.A07, directCollectionArguments.A07) || this.A0B != directCollectionArguments.A0B || this.A03 != directCollectionArguments.A03 || !0qQ.A0K(this.A05, directCollectionArguments.A05) || !0qQ.A0K(this.A04, directCollectionArguments.A04) || !0qQ.A0K(this.A08, directCollectionArguments.A08) || !0qQ.A0K(this.A01, directCollectionArguments.A01) || !0qQ.A0K(this.A09, directCollectionArguments.A09) || !0qQ.A0K(this.A02, directCollectionArguments.A02) || !0qQ.A0K(this.A06, directCollectionArguments.A06) || !0qQ.A0K(this.A0A, directCollectionArguments.A0A)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        boolean booleanValue;
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A07);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeString(C70864OPd.A01(this.A03));
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeString(this.A08);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A09);
        Boolean bool = this.A02;
        if (bool == null) {
            booleanValue = false;
        } else {
            parcel.writeInt(1);
            booleanValue = bool.booleanValue();
        }
        parcel.writeInt(booleanValue ? 1 : 0);
        parcel.writeString(this.A06);
        Iterator A1F = C41848B3p.A1F(parcel, this.A0A);
        while (A1F.hasNext()) {
            C41847B3o.A1I(parcel, A1F, i);
        }
    }

    public final String A00() {
        int A042;
        String str = this.A05;
        if (str == null || (A042 = 00l.A04(str, '_', 0)) == -1) {
            return null;
        }
        return C51967G9n.A0q(str, 0, A042);
    }

    public final int hashCode() {
        int A092 = AnonymousClass7TF.A09(this.A0B, AnonymousClass7TF.A08(this.A07, AnonymousClass7TG.A0C(this.A00) * 31));
        Integer num = this.A03;
        return AnonymousClass7TE.A0N(this.A0A, (((((((((((((AnonymousClass7TG.A0B(num, C70864OPd.A01(num), A092) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + C41845B3m.A00(this.A06)) * 31);
    }

    public DirectCollectionArguments(ImageUrl imageUrl, DirectThreadKey directThreadKey, Boolean bool, Integer num, String str, String str2, String str3, String str4, String str5, String str6, List list, boolean z) {
        C51972G9s.A1C(str, num);
        0qQ.A0B(list, 12);
        this.A00 = imageUrl;
        this.A07 = str;
        this.A0B = z;
        this.A03 = num;
        this.A05 = str2;
        this.A04 = str3;
        this.A08 = str4;
        this.A01 = directThreadKey;
        this.A09 = str5;
        this.A02 = bool;
        this.A06 = str6;
        this.A0A = list;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DirectCollectionArguments(android.content.Context r14, X.1Xj r15, java.lang.Integer r16, java.lang.String r17, boolean r18) {
        /*
            r13 = this;
            r0 = 2
            r5 = r17
            X.0qQ.A0B(r5, r0)
            com.instagram.model.mediasize.ExtendedImageUrl r1 = r15.A1n(r14)
            if (r1 != 0) goto L_0x0010
            com.instagram.common.typedurl.ImageUrl r1 = r15.A1Q()
        L_0x0010:
            java.lang.String r6 = r15.getId()
            r2 = 0
            X.0sn r11 = X.0sn.A00
            r0 = r13
            r4 = r16
            r12 = r18
            r3 = r2
            r7 = r2
            r8 = r2
            r9 = r2
            r10 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.messagethread.collections.model.DirectCollectionArguments.<init>(android.content.Context, X.1Xj, java.lang.Integer, java.lang.String, boolean):void");
    }
}
