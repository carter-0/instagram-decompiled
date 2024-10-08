package X;

import com.instagram.common.typedurl.ImageUrl;

public final class H3G extends C57088IOc {
    public final ImageUrl A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04 = "";
    public final String A05 = "";

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H3G) {
                H3G h3g = (H3G) obj;
                if (!0qQ.A0K(this.A01, h3g.A01) || !0qQ.A0K(this.A03, h3g.A03) || !0qQ.A0K(this.A04, h3g.A04) || !0qQ.A0K(this.A05, h3g.A05) || !0qQ.A0K(this.A00, h3g.A00) || !0qQ.A0K(this.A02, h3g.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public H3G(ImageUrl imageUrl, String str, String str2, String str3) {
        this.A01 = str;
        this.A03 = str2;
        this.A00 = imageUrl;
        this.A02 = str3;
    }

    public final int hashCode() {
        return (C51975G9x.A05(this.A00, AnonymousClass7TF.A08(this.A05, AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A08(this.A03, AnonymousClass7TE.A0O(this.A01))))) * 31) + AnonymousClass7TG.A0E(this.A02);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("BusinessCategory(id=");
        C57088IOc.A01(A1A, this.A01);
        C57088IOc.A03(A1A, this.A03);
        C57088IOc.A02(A1A, this.A04);
        G9w.A1T(A1A, this.A05);
        C57088IOc.A00(A1A, this.A00);
        A1A.append(", mediaId=");
        return C51975G9x.A0i(this.A02, A1A);
    }
}
