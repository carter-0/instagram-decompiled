package X;

import com.instagram.user.model.User;

/* renamed from: X.N8i  reason: case insensitive filesystem */
public final class C68271N8i extends AnonymousClass0T0 implements C74253Prh {
    public final User A00;

    public C68271N8i(User user) {
        0qQ.A0B(user, 1);
        this.A00 = user;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C68271N8i) && 0qQ.A0K(this.A00, ((C68271N8i) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
