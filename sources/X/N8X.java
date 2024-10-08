package X;

import com.instagram.common.typedurl.ImageUrl;

public final class N8X extends AnonymousClass0T0 implements C74249Prd {
    public final ImageUrl A00;
    public final C74249Prd A01;
    public final C69290Niq A02;
    public final C69348Njn A03;
    public final String A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N8X) {
                N8X n8x = (N8X) obj;
                if (this.A03 != n8x.A03 || this.A02 != n8x.A02 || !0qQ.A0K(this.A01, n8x.A01) || !0qQ.A0K(this.A04, n8x.A04) || this.A05 != n8x.A05 || !0qQ.A0K(this.A00, n8x.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0K = AnonymousClass7TE.A0K(this.A03);
        return AnonymousClass7TF.A09(this.A05, (((AnonymousClass7TF.A07(this.A02, A0K) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public N8X(ImageUrl imageUrl, C74249Prd prd, C69290Niq niq, C69348Njn njn, String str, boolean z) {
        this.A03 = njn;
        this.A02 = niq;
        this.A01 = prd;
        this.A04 = str;
        this.A05 = z;
        this.A00 = imageUrl;
    }
}
