package X;

import com.instagram.user.model.User;

public final class BEK extends AnonymousClass0T0 implements C46227DRi {
    public final int A00;
    public final User A01;

    public BEK(User user, int i) {
        0qQ.A0B(user, 2);
        this.A00 = i;
        this.A01 = user;
    }

    public final BEK F1r(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BEK) {
                BEK bek = (BEK) obj;
                if (this.A00 != bek.A00 || !0qQ.A0K(this.A01, bek.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, this.A00 * 31);
    }
}
