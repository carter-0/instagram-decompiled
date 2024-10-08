package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.GnB  reason: case insensitive filesystem */
public final class C53381GnB extends AnonymousClass0T0 {
    public final int A00 = 0;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final String A07;
    public final String A08;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C53381GnB(C56078HsR hsR, C56078HsR hsR2, ImageUrl imageUrl, ImageUrl imageUrl2, Boolean bool, String str, String str2, String str3, int i) {
        this((i & 32) != 0 ? null : hsR, (i & 64) != 0 ? null : hsR2, imageUrl, imageUrl2, (i & 128) != 0 ? AnonymousClass7TE.A0u() : bool, str, str2, str3);
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C53381GnB)) {
                return false;
            }
            C53381GnB gnB = (C53381GnB) obj;
            if (gnB.A00 != 1 || !0qQ.A0K(this.A07, gnB.A07) || !0qQ.A0K(this.A08, gnB.A08) || !0qQ.A0K(this.A03, gnB.A03) || !0qQ.A0K(this.A06, gnB.A06) || !0qQ.A0K(this.A02, gnB.A02) || !0qQ.A0K(this.A04, gnB.A04) || !0qQ.A0K(this.A05, gnB.A05)) {
                return false;
            }
            obj2 = this.A01;
            obj3 = gnB.A01;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof C53381GnB)) {
                return false;
            }
            C53381GnB gnB2 = (C53381GnB) obj;
            if (gnB2.A00 != 0 || !0qQ.A0K(this.A01, gnB2.A01) || !0qQ.A0K(this.A02, gnB2.A02) || !0qQ.A0K(this.A06, gnB2.A06) || !0qQ.A0K(this.A03, gnB2.A03) || !0qQ.A0K(this.A04, gnB2.A04) || !0qQ.A0K(this.A07, gnB2.A07) || !0qQ.A0K(this.A08, gnB2.A08)) {
                return false;
            }
            obj2 = this.A05;
            obj3 = gnB2.A05;
        }
        if (!0qQ.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0C;
        int A0L;
        if (this.A00 != 0) {
            A0C = (((AnonymousClass7TF.A07(this.A02, (((((AnonymousClass7TE.A0O(this.A07) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31;
            A0L = AnonymousClass7TE.A0L(this.A01);
        } else {
            A0C = ((((((((((((AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31;
            A0L = AnonymousClass7TE.A0L(this.A05);
        }
        return A0C + A0L;
    }

    public final String toString() {
        if (1 - this.A00 != 0) {
            return super.toString();
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("PivotPageDefaultHeaderModel(title=");
        A1A.append(this.A07);
        A1A.append(", username=");
        A1A.append(this.A08);
        A1A.append(", userProfilePictureUrl=");
        A1A.append(this.A03);
        A1A.append(", formattedCount=");
        A1A.append(this.A06);
        A1A.append(", thumbnailUrl=");
        A1A.append(this.A02);
        A1A.append(", usernameAttributionContentRes=");
        A1A.append(this.A04);
        A1A.append(", usernamePlaceholderContentRes=");
        A1A.append(this.A05);
        A1A.append(", isUsernameVerified=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }

    public C53381GnB(C56078HsR hsR, C56078HsR hsR2, ImageUrl imageUrl, ImageUrl imageUrl2, Boolean bool, String str, String str2, String str3) {
        DbW.A1N(str, 1, imageUrl2);
        this.A07 = str;
        this.A08 = str2;
        this.A03 = imageUrl;
        this.A06 = str3;
        this.A02 = imageUrl2;
        this.A04 = hsR;
        this.A05 = hsR2;
        this.A01 = bool;
    }

    public C53381GnB(C67241sS r2, 1Xj r3, Boolean bool, Integer num, Integer num2, String str, String str2, String str3) {
        this.A01 = bool;
        this.A02 = num;
        this.A06 = str;
        this.A03 = r2;
        this.A04 = r3;
        this.A07 = str2;
        this.A08 = str3;
        this.A05 = num2;
    }
}
