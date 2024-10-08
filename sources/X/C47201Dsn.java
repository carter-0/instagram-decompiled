package X;

import com.instagram.user.model.User;

/* renamed from: X.Dsn  reason: case insensitive filesystem */
public final class C47201Dsn extends AnonymousClass0T0 implements DRE {
    public final User A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47201Dsn) {
                C47201Dsn dsn = (C47201Dsn) obj;
                if (!0qQ.A0K(this.A01, dsn.A01) || !0qQ.A0K(this.A00, dsn.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TE.A0O(this.A01));
    }

    public C47201Dsn(User user, String str) {
        AnonymousClass7TG.A1O(str, user);
        this.A01 = str;
        this.A00 = user;
    }
}
