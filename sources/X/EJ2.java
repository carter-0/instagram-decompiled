package X;

import com.instagram.user.model.User;

public final class EJ2 extends ExY {
    public final User A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EJ2) {
                EJ2 ej2 = (EJ2) obj;
                if (!0qQ.A0K(this.A01, ej2.A01) || !0qQ.A0K(this.A00, ej2.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public EJ2(User user, String str) {
        super(2FW.A0H, str);
        this.A01 = str;
        this.A00 = user;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TE.A0L(this.A00);
    }
}
