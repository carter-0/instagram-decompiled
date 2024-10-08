package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;

public final class H3K extends C57088IOc {
    public final ImageUrl A00;
    public final GNW A01;
    public final String A02 = "CLIPS_LAYOUT";
    public final String A03 = "";
    public final String A04 = "";
    public final String A05 = "";

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H3K) {
                H3K h3k = (H3K) obj;
                if (this.A01 != h3k.A01 || !0qQ.A0K(this.A02, h3k.A02) || !0qQ.A0K(this.A03, h3k.A03) || !0qQ.A0K(this.A04, h3k.A04) || !0qQ.A0K(this.A05, h3k.A05) || !0qQ.A0K(this.A00, h3k.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ H3K(GNW gnw) {
        SimpleImageUrl A0V = DbS.A0V("");
        this.A01 = gnw;
        this.A00 = A0V;
    }

    public final int hashCode() {
        return C51975G9x.A05(this.A00, AnonymousClass7TF.A08(this.A05, AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A08(this.A02, AnonymousClass7TE.A0K(this.A01))))));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RecipeLayout(attributedCameraTools=");
        A1A.append(this.A01);
        A1A.append(", id=");
        C57088IOc.A01(A1A, this.A02);
        C57088IOc.A03(A1A, this.A03);
        C57088IOc.A02(A1A, this.A04);
        G9w.A1T(A1A, this.A05);
        A1A.append(this.A00);
        A1A.append(", isChecked=");
        return G9t.A1C(A1A, false);
    }
}
