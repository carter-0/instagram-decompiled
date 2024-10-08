package X;

import com.instagram.user.model.User;

/* renamed from: X.BAt  reason: case insensitive filesystem */
public final class C42019BAt extends AnonymousClass0T0 {
    public final User A00;

    public C42019BAt(User user) {
        0qQ.A0B(user, 1);
        this.A00 = user;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C42019BAt) && 0qQ.A0K(this.A00, ((C42019BAt) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
