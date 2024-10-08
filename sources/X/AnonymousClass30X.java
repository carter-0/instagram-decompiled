package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.30X  reason: invalid class name */
public final class AnonymousClass30X extends AnonymousClass30Y {
    public static final AnonymousClass30X A02;
    public final AnonymousClass3OA A00;
    public final UserSession A01;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.30a, X.30Z] */
    static {
        ? r1 = new C2354830a((Object) null, (Object) null, "empty");
        r1.A00 = null;
        r1.A00 = AnonymousClass30Y.A07;
        A02 = new AnonymousClass30X(r1);
    }

    public final void A01(C252093oY r5) {
        UserSession userSession = this.A01;
        AnonymousClass3OA r2 = this.A00;
        if (!(r2 == null || userSession == null || r5.CEk(this) != AnonymousClass05K.A00)) {
            1wN.A00(userSession).A01(r2);
        }
        super.A01(r5);
    }

    public AnonymousClass30X(AnonymousClass30Z r2) {
        super(r2);
        this.A00 = r2.A01;
        this.A01 = r2.A00;
    }
}
