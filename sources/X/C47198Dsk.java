package X;

import com.instagram.user.model.User;

/* renamed from: X.Dsk  reason: case insensitive filesystem */
public final class C47198Dsk extends AnonymousClass0T0 implements G8Y {
    public final User A00;
    public final String A01;

    public C47198Dsk(User user, String str) {
        0qQ.A0B(user, 2);
        this.A01 = str;
        this.A00 = user;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47198Dsk) {
                C47198Dsk dsk = (C47198Dsk) obj;
                if (!0qQ.A0K(this.A01, dsk.A01) || !0qQ.A0K(this.A00, dsk.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TG.A0E(this.A01) * 31);
    }
}
