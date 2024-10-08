package X;

import com.instagram.common.typedurl.ImageUrl;

public final class H3Q extends C57088IOc {
    public final ImageUrl A00;
    public final 1Xj A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05 = "";
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H3Q) {
                H3Q h3q = (H3Q) obj;
                if (!0qQ.A0K(this.A02, h3q.A02) || !0qQ.A0K(this.A03, h3q.A03) || !0qQ.A0K(this.A04, h3q.A04) || !0qQ.A0K(this.A05, h3q.A05) || !0qQ.A0K(this.A00, h3q.A00) || this.A06 != h3q.A06 || !0qQ.A0K(this.A01, h3q.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public H3Q(ImageUrl imageUrl, 1Xj r3, String str, String str2, String str3, boolean z) {
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A00 = imageUrl;
        this.A06 = z;
        this.A01 = r3;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A08(this.A05, AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A08(this.A03, AnonymousClass7TE.A0O(this.A02)))))));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Template(id=");
        C57088IOc.A01(A1A, this.A02);
        C57088IOc.A03(A1A, this.A03);
        C57088IOc.A02(A1A, this.A04);
        G9w.A1T(A1A, this.A05);
        A1A.append(this.A00);
        A1A.append(", isChecked=");
        A1A.append(this.A06);
        A1A.append(", media=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
