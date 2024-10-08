package X;

import com.instagram.user.model.User;

/* renamed from: X.MaQ  reason: case insensitive filesystem */
public final class C66657MaQ extends C69614Now {
    public final User A00;

    public C66657MaQ(User user) {
        0qQ.A0B(user, 1);
        this.A00 = user;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C66657MaQ) && 0qQ.A0K(this.A00, ((C66657MaQ) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("OneOnOne(user=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
