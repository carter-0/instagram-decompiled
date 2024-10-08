package X;

import com.instagram.common.typedurl.ImageUrl;

public final class H93 extends H94 {
    public final ImageUrl A00;
    public final C59495JLt A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H93) {
                H93 h93 = (H93) obj;
                if (!0qQ.A0K(this.A03, h93.A03) || !0qQ.A0K(this.A02, h93.A02) || this.A04 != h93.A04 || !0qQ.A0K(this.A01, h93.A01) || !0qQ.A0K(this.A00, h93.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A08(this.A02, AnonymousClass7TE.A0O(this.A03)))) + AnonymousClass7TG.A0C(this.A00);
    }

    public H93(ImageUrl imageUrl, C59495JLt jLt, String str, String str2, boolean z) {
        AnonymousClass7TG.A1O(str, str2);
        this.A03 = str;
        this.A02 = str2;
        this.A04 = z;
        this.A01 = jLt;
        this.A00 = imageUrl;
    }
}
