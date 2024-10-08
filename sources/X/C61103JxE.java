package X;

import com.instagram.user.model.User;

/* renamed from: X.JxE  reason: case insensitive filesystem */
public final class C61103JxE extends AnonymousClass0T0 implements C74527PwM {
    public final User A00;
    public final Boolean A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61103JxE) {
                C61103JxE jxE = (C61103JxE) obj;
                if (!0qQ.A0K(this.A02, jxE.A02) || !0qQ.A0K(this.A01, jxE.A01) || !0qQ.A0K(this.A00, jxE.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, (AnonymousClass7TE.A0O(this.A02) + AnonymousClass7TG.A0C(this.A01)) * 31);
    }

    public C61103JxE(User user, Boolean bool, String str) {
        AnonymousClass7TG.A1P(str, user);
        this.A02 = str;
        this.A01 = bool;
        this.A00 = user;
    }
}
