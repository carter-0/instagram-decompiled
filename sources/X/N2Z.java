package X;

import com.instagram.user.model.User;

public final class N2Z extends AnonymousClass0T0 {
    public final N3F A00;
    public final User A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N2Z) {
                N2Z n2z = (N2Z) obj;
                if (!0qQ.A0K(this.A02, n2z.A02) || !0qQ.A0K(this.A01, n2z.A01) || !0qQ.A0K(this.A00, n2z.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0E(this.A02) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public N2Z(N3F n3f, User user, String str) {
        this.A02 = str;
        this.A01 = user;
        this.A00 = n3f;
    }
}
