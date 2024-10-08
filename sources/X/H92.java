package X;

import com.instagram.common.typedurl.ImageUrl;

public final class H92 extends H94 {
    public final ImageUrl A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H92) {
                H92 h92 = (H92) obj;
                if (!0qQ.A0K(this.A02, h92.A02) || !0qQ.A0K(this.A01, h92.A01) || this.A03 != h92.A03 || !0qQ.A0K(this.A00, h92.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A08(this.A01, AnonymousClass7TE.A0O(this.A02))) + AnonymousClass7TG.A0C(this.A00);
    }

    public H92(ImageUrl imageUrl, String str, String str2, boolean z) {
        AnonymousClass7TG.A1O(str, str2);
        this.A02 = str;
        this.A01 = str2;
        this.A03 = z;
        this.A00 = imageUrl;
    }
}
