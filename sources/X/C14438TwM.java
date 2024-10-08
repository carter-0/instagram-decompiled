package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.TwM  reason: case insensitive filesystem */
public final class C14438TwM {
    public final UserSession A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;

    public final int A00() {
        boolean z;
        if (!G9t.A1b(this.A02)) {
            UserSession userSession = this.A00;
            0qQ.A0B(userSession, 0);
            if (2R8.A00(userSession) || !G9t.A1b(this.A01)) {
                C14470Tws tws = C14471Twt.A05;
                C14471Twt A002 = tws.A00(userSession);
                if (G9t.A1b(A002.A04)) {
                    z = AnonymousClass7TE.A1a(C67351tA.A00(19B.A00, new C51647Fy6((Object) A002, (AnonymousClass4D7) null, 42)));
                } else {
                    z = ((0xa) A002.A01.getValue()).getBoolean("bootstrap_override_enabled", false);
                }
                if (z) {
                    C14471Twt A003 = tws.A00(userSession);
                    if (!G9t.A1b(A003.A04)) {
                        return ((0xa) A003.A01.getValue()).getInt(AnonymousClass000.A00(1138), 3);
                    }
                    return AnonymousClass7TE.A0M(C67351tA.A00(19B.A00, new C51647Fy6((Object) A003, (AnonymousClass4D7) null, 38)));
                }
            }
        }
        return (int) 182.A01(0Tu.A05, this.A00, 36603729931146191L);
    }

    public C14438TwM(UserSession userSession) {
        this.A00 = userSession;
        0eO r2 = 0eO.A02;
        this.A02 = AnonymousClass0eN.A00(r2, new C13998To0(this, 17));
        this.A01 = AnonymousClass0eN.A00(r2, new C13998To0(this, 16));
    }
}
