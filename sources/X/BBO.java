package X;

import com.instagram.common.typedurl.ImageUrl;

public final class BBO extends AnonymousClass0T0 {
    public final double A00;
    public final int A01;
    public final ImageUrl A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BBO) {
                BBO bbo = (BBO) obj;
                if (!0qQ.A0K(this.A04, bbo.A04) || !0qQ.A0K(this.A02, bbo.A02) || !0qQ.A0K(this.A05, bbo.A05) || !0qQ.A0K(this.A07, bbo.A07) || !0qQ.A0K(this.A03, bbo.A03) || !0qQ.A0K(this.A06, bbo.A06) || this.A01 != bbo.A01 || Double.compare(this.A00, bbo.A00) != 0 || this.A08 != bbo.A08) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0O(this.A04));
        int A082 = (((((AnonymousClass7TF.A08(this.A03, (AnonymousClass7TF.A08(this.A05, A072) + AnonymousClass7TG.A0E(this.A07)) * 31) + C41845B3m.A00(this.A06)) * 31) + this.A01) * 31) + C51968G9o.A03(Double.doubleToLongBits(this.A00))) * 31;
        int i = 1237;
        if (this.A08) {
            i = 1231;
        }
        return A082 + i;
    }

    public BBO(ImageUrl imageUrl, String str, String str2, String str3, String str4, String str5, double d, int i, boolean z) {
        this.A04 = str;
        this.A02 = imageUrl;
        this.A05 = str2;
        this.A07 = str3;
        this.A03 = str4;
        this.A06 = str5;
        this.A01 = i;
        this.A00 = d;
        this.A08 = z;
    }
}
