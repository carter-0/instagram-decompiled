package X;

import com.instagram.user.model.User;

public final class BGA extends AnonymousClass0T0 implements YBK {
    public final User A00;
    public final C266544Zk A01;
    public final Boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BGA) {
                BGA bga = (BGA) obj;
                if (!0qQ.A0K(this.A01, bga.A01) || !0qQ.A0K(this.A02, bga.A02) || !0qQ.A0K(this.A00, bga.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public BGA(C266544Zk r1, User user, Boolean bool) {
        this.A01 = r1;
        this.A02 = bool;
        this.A00 = user;
    }
}
