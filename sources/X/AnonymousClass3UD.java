package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3UD  reason: invalid class name */
public abstract class AnonymousClass3UD {
    public static final AnonymousClass3U9 A00(UserSession userSession, C300585xS r4) {
        0qQ.A0B(r4, 1);
        AnonymousClass3S9 r1 = new AnonymousClass3S9();
        r1.A1T = AnonymousClass0t1.A01.A01(userSession);
        if (r1.A1V == null) {
            r1.A1V = false;
        }
        AnonymousClass3U9 r0 = new AnonymousClass3U9(userSession, r1);
        C370828x8.A00(r4, r0);
        A02(r0);
        return r0;
    }

    public static final AnonymousClass3U9 A01(UserSession userSession, AnonymousClass3U9 r3) {
        AnonymousClass3S9 r1 = r3.A02;
        try {
            r1.A1T = AnonymousClass0t1.A01.A01(userSession);
            r1.A28 = AnonymousClass3UE.A07(userSession, r3.BRZ());
            return r3;
        } catch (NullPointerException e) {
            C395229zQ.A00(userSession).A01(r3, e);
            return null;
        }
    }

    public static final void A02(AnonymousClass3U9 r1) {
        if (!r1.CUG()) {
            r1.BRZ();
        }
    }
}
