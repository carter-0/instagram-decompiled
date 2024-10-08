package X;

import com.instagram.user.model.User;

public final class HJ3 extends HQB {
    public final User A00;
    public final String A01;

    public HJ3(User user, String str) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = user;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HJ3) {
                HJ3 hj3 = (HJ3) obj;
                if (!0qQ.A0K(this.A01, hj3.A01) || !0qQ.A0K(this.A00, hj3.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0O(this.A01) + AnonymousClass7TG.A0C(this.A00);
    }
}
