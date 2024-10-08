package X;

import com.instagram.user.model.User;

public final class EJQ extends ExY {
    public final User A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EJQ) {
                EJQ ejq = (EJQ) obj;
                if (!0qQ.A0K(this.A01, ejq.A01) || !0qQ.A0K(this.A00, ejq.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public EJQ(User user, String str) {
        super(2FW.A1f, str);
        this.A01 = str;
        this.A00 = user;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TE.A0L(this.A00);
    }
}
