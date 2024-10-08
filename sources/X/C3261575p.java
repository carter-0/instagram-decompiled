package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.75p  reason: invalid class name and case insensitive filesystem */
public final class C3261575p {
    public static final AnonymousClass9IB A04 = new AnonymousClass9IB(true, 0, false, false, false);
    public AnonymousClass9IB A00;
    public final UserSession A01;
    public final C3261675q A02;
    public final 26t A03;

    public /* synthetic */ C3261575p(UserSession userSession) {
        AnonymousClass9IB r0;
        C3261675q r2 = new C3261675q(userSession, 1vm.A01(userSession));
        26t A002 = 26G.A00(userSession);
        0qQ.A0B(userSession, 1);
        0qQ.A0B(A002, 3);
        this.A01 = userSession;
        this.A02 = r2;
        this.A03 = A002;
        if (A002.A00.getBoolean("key_has_seen_avatar_social_stickers_disclaimer", false)) {
            r0 = A04;
        } else {
            r0 = null;
        }
        this.A00 = r0;
    }
}
