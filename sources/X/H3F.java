package X;

import com.instagram.common.typedurl.ImageUrl;

public final class H3F extends C57088IOc {
    public final ImageUrl A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04 = "";

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H3F) {
                H3F h3f = (H3F) obj;
                if (!0qQ.A0K(this.A01, h3f.A01) || !0qQ.A0K(this.A02, h3f.A02) || !0qQ.A0K(this.A03, h3f.A03) || !0qQ.A0K(this.A04, h3f.A04) || !0qQ.A0K(this.A00, h3f.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public H3F(ImageUrl imageUrl, String str, String str2, String str3) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A00 = imageUrl;
    }

    public final int hashCode() {
        return C51975G9x.A05(this.A00, AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A08(this.A02, AnonymousClass7TE.A0O(this.A01)))));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Person(id=");
        C57088IOc.A01(A1A, this.A01);
        C57088IOc.A03(A1A, this.A02);
        C57088IOc.A02(A1A, this.A03);
        G9w.A1T(A1A, this.A04);
        A1A.append(this.A00);
        A1A.append(", isChecked=");
        return G9t.A1C(A1A, false);
    }
}
