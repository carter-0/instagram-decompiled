package X;

import com.instagram.user.model.User;

public final class EJT extends ExY {
    public final User A00;
    public final String A01;
    public final String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EJT(User user, String str, String str2) {
        super(2FW.A1P, str);
        0qQ.A0B(str2, 3);
        this.A01 = str;
        this.A00 = user;
        this.A02 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EJT) {
                EJT ejt = (EJT) obj;
                if (!0qQ.A0K(this.A01, ejt.A01) || !0qQ.A0K(this.A00, ejt.A00) || !0qQ.A0K(this.A02, ejt.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A02, ((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TE.A0L(this.A00)) * 31);
    }
}
