package X;

import com.instagram.user.model.User;

public final class UMz extends AnonymousClass0T0 implements C21017X9t {
    public final C21012X9o A00;
    public final User A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Boolean A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UMz) {
                UMz uMz = (UMz) obj;
                if (!0qQ.A0K(this.A00, uMz.A00) || !0qQ.A0K(this.A02, uMz.A02) || !0qQ.A0K(this.A03, uMz.A03) || !0qQ.A0K(this.A04, uMz.A04) || !0qQ.A0K(this.A05, uMz.A05) || !0qQ.A0K(this.A01, uMz.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public UMz(C21012X9o x9o, User user, Boolean bool, Boolean bool2, Boolean bool3, String str) {
        this.A00 = x9o;
        this.A02 = bool;
        this.A03 = bool2;
        this.A04 = bool3;
        this.A05 = str;
        this.A01 = user;
    }
}
