package X;

import com.instagram.user.model.User;

public final class FYB implements C232262tL {
    public final User A00;
    public final /* synthetic */ C47514E5x A01;

    public FYB(C47514E5x e5x, User user) {
        0qQ.A0B(user, 2);
        this.A01 = e5x;
        this.A00 = user;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.getId();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return 0qQ.A0K(this.A00.getId(), DbX.A0r((User) obj));
    }
}
