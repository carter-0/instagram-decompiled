package X;

import com.instagram.user.model.User;

public final class BI0 extends AnonymousClass0T0 implements DRY {
    public final User A00;

    public BI0(User user) {
        0qQ.A0B(user, 1);
        this.A00 = user;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof BI0) && 0qQ.A0K(this.A00, ((BI0) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
