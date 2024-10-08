package X;

import com.instagram.common.typedurl.ImageUrl;

public final class H3L extends C57088IOc {
    public final ImageUrl A00;
    public final String A01;
    public final String A02;
    public final String A03 = "";
    public final String A04 = "";
    public final 1Xj A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H3L) {
                H3L h3l = (H3L) obj;
                if (!0qQ.A0K(this.A01, h3l.A01) || !0qQ.A0K(this.A02, h3l.A02) || !0qQ.A0K(this.A03, h3l.A03) || !0qQ.A0K(this.A04, h3l.A04) || !0qQ.A0K(this.A00, h3l.A00) || !0qQ.A0K(this.A05, h3l.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public H3L(ImageUrl imageUrl, 1Xj r3, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = imageUrl;
        this.A05 = r3;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A05, C51975G9x.A05(this.A00, AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A08(this.A02, AnonymousClass7TE.A0O(this.A01))))) * 31);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("WorldPagesLabel(id=");
        C57088IOc.A01(A1A, this.A01);
        C57088IOc.A03(A1A, this.A02);
        C57088IOc.A02(A1A, this.A03);
        G9w.A1T(A1A, this.A04);
        C57088IOc.A00(A1A, this.A00);
        A1A.append(", media=");
        return AnonymousClass7TG.A0n(this.A05, A1A);
    }
}
