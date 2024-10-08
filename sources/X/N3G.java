package X;

import com.instagram.common.typedurl.ImageUrl;

public final class N3G extends AnonymousClass0T0 {
    public Integer A00 = null;
    public final int A01;
    public final ImageUrl A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;

    public N3G(ImageUrl imageUrl, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, boolean z) {
        0qQ.A0B(str, 1);
        AnonymousClass7TG.A1S(str2, str3);
        this.A03 = str;
        this.A02 = imageUrl;
        this.A01 = i;
        this.A0B = z;
        this.A06 = str2;
        this.A0A = str3;
        this.A04 = str4;
        this.A07 = str5;
        this.A08 = str6;
        this.A09 = str7;
        this.A05 = str8;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N3G) {
                N3G n3g = (N3G) obj;
                if (!0qQ.A0K(this.A03, n3g.A03) || !0qQ.A0K(this.A02, n3g.A02) || this.A01 != n3g.A01 || this.A0B != n3g.A0B || !0qQ.A0K(this.A06, n3g.A06) || !0qQ.A0K(this.A0A, n3g.A0A) || !0qQ.A0K(this.A04, n3g.A04) || !0qQ.A0K(this.A07, n3g.A07) || !0qQ.A0K(this.A08, n3g.A08) || !0qQ.A0K(this.A09, n3g.A09) || !0qQ.A0K(this.A05, n3g.A05) || !0qQ.A0K(this.A00, n3g.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AnonymousClass7TF.A08(this.A07, AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A08(this.A0A, AnonymousClass7TF.A08(this.A06, AnonymousClass7TF.A09(this.A0B, (((AnonymousClass7TE.A0O(this.A03) + AnonymousClass7TG.A0C(this.A02)) * 31) + this.A01) * 31))))) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }
}
