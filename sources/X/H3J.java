package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;

public final class H3J extends C57088IOc {
    public final ImageUrl A00;
    public final 1Xj A01;
    public final String A02;
    public final String A03;
    public final String A04 = "";
    public final String A05 = "";

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H3J) {
                H3J h3j = (H3J) obj;
                if (!0qQ.A0K(this.A02, h3j.A02) || !0qQ.A0K(this.A03, h3j.A03) || !0qQ.A0K(this.A04, h3j.A04) || !0qQ.A0K(this.A05, h3j.A05) || !0qQ.A0K(this.A00, h3j.A00) || !0qQ.A0K(this.A01, h3j.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ H3J(1Xj r3, String str, String str2) {
        SimpleImageUrl A0V = DbS.A0V("");
        this.A02 = str;
        this.A03 = str2;
        this.A00 = A0V;
        this.A01 = r3;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, C51975G9x.A05(this.A00, AnonymousClass7TF.A08(this.A05, AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A08(this.A03, AnonymousClass7TE.A0O(this.A02))))) * 31);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MetaVerifiedLink(id=");
        C57088IOc.A01(A1A, this.A02);
        C57088IOc.A03(A1A, this.A03);
        C57088IOc.A02(A1A, this.A04);
        G9w.A1T(A1A, this.A05);
        C57088IOc.A00(A1A, this.A00);
        A1A.append(", media=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
