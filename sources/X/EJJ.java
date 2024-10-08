package X;

import com.instagram.user.model.User;

public final class EJJ extends ExY {
    public final User A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EJJ) {
                EJJ ejj = (EJJ) obj;
                if (!0qQ.A0K(this.A01, ejj.A01) || !0qQ.A0K(this.A00, ejj.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public EJJ(User user, String str) {
        super(2FW.A1O, str);
        this.A01 = str;
        this.A00 = user;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TE.A0L(this.A00);
    }
}
