package X;

import com.instagram.common.gallery.Medium;

public final class UKK extends AnonymousClass0T0 {
    public final int A00;
    public final Medium A01;
    public final AnonymousClass3Q2 A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UKK) {
                UKK ukk = (UKK) obj;
                if (!0qQ.A0K(this.A01, ukk.A01) || this.A00 != ukk.A00 || !0qQ.A0K(this.A02, ukk.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TE.A0K(this.A01) + this.A00) * 31) + AnonymousClass7TG.A0C(this.A02);
    }

    public UKK(Medium medium, AnonymousClass3Q2 r2, int i) {
        this.A01 = medium;
        this.A00 = i;
        this.A02 = r2;
    }
}
