package X;

import com.instagram.common.typedurl.ImageUrl;

public final class H3P extends C57088IOc {
    public final ImageUrl A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public H3P(ImageUrl imageUrl, String str, String str2, String str3, String str4, String str5, boolean z) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A00 = imageUrl;
        this.A06 = z;
        this.A05 = str5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H3P) {
                H3P h3p = (H3P) obj;
                if (!0qQ.A0K(this.A01, h3p.A01) || !0qQ.A0K(this.A02, h3p.A02) || !0qQ.A0K(this.A03, h3p.A03) || !0qQ.A0K(this.A04, h3p.A04) || !0qQ.A0K(this.A00, h3p.A00) || this.A06 != h3p.A06 || !0qQ.A0K(this.A05, h3p.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A05, AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A08(this.A02, AnonymousClass7TE.A0O(this.A01)))))));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Remix(id=");
        C57088IOc.A01(A1A, this.A01);
        C57088IOc.A03(A1A, this.A02);
        C57088IOc.A02(A1A, this.A03);
        G9w.A1T(A1A, this.A04);
        A1A.append(this.A00);
        A1A.append(", isChecked=");
        A1A.append(this.A06);
        A1A.append(", userId=");
        return C51975G9x.A0i(this.A05, A1A);
    }
}
