package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.OyK  reason: case insensitive filesystem */
public final class C72198OyK implements AnonymousClass0lh {
    public final 1a8 A00 = C66581MXm.A0P();
    public final UserSession A01;
    public final 2Dm A02;

    public static final AnonymousClass7Z6 A00(AnonymousClass7Z7 r2) {
        if (r2 instanceof AnonymousClass7Z6) {
            return (AnonymousClass7Z6) r2;
        }
        throw C66582MXn.A0k(r2, "Unknown SendShareManager type ", AnonymousClass7TE.A1A());
    }

    public static final PEN A01(AnonymousClass7Z7 r2) {
        if (r2 instanceof PEN) {
            return (PEN) r2;
        }
        throw C66582MXn.A0k(r2, "Unknown SendShareManager type ", AnonymousClass7TE.A1A());
    }

    public final void onSessionWillEnd() {
        this.A00.A01();
    }

    public C72198OyK(UserSession userSession, 2Dm r3) {
        AnonymousClass7TG.A1O(userSession, r3);
        this.A01 = userSession;
        this.A02 = r3;
    }
}
