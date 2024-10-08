package X;

import com.instagram.user.model.User;

/* renamed from: X.JxY  reason: case insensitive filesystem */
public final class C61122JxY extends AnonymousClass0T0 implements MWT {
    public final User A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61122JxY) {
                C61122JxY jxY = (C61122JxY) obj;
                if (!0qQ.A0K(this.A01, jxY.A01) || !0qQ.A0K(this.A00, jxY.A00)) {
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

    public C61122JxY(User user, String str) {
        AnonymousClass7TG.A1O(str, user);
        this.A01 = str;
        this.A00 = user;
    }
}
