package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7S4  reason: invalid class name */
public final class AnonymousClass7S4 {
    public static final AnonymousClass7S5 A02 = new Object();
    public final UserSession A00;
    public final AnonymousClass9HC A01;

    public AnonymousClass7S4(UserSession userSession, AnonymousClass9HC r3) {
        0qQ.A0B(r3, 2);
        this.A00 = userSession;
        this.A01 = r3;
    }

    public final AnonymousClass7SD A00(AnonymousClass2Ep r7, String str, boolean z) {
        C254763t0 r4;
        String C6C;
        AnonymousClass2Ep r3 = r7;
        if (!(r7 == null || (C6C = r7.C6C()) == null)) {
            str = C6C;
        }
        AnonymousClass7S5 r0 = A02;
        UserSession userSession = this.A00;
        AnonymousClass9HC r2 = this.A01;
        if (str != null) {
            r4 = new C254763t0(str);
        } else {
            r4 = null;
        }
        return r0.A00(userSession, r2, r3, r4, z);
    }
}
