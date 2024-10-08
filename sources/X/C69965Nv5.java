package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Nv5  reason: case insensitive filesystem */
public abstract class C69965Nv5 {
    public static final boolean A00(UserSession userSession, C254783t2 r5) {
        C242373Tu r0;
        0qQ.A0B(userSession, 0);
        if (!(r5 instanceof C254763t0)) {
            return false;
        }
        AnonymousClass3U9 A0a = C66581MXm.A0a(2L2.A00(userSession), ((C254763t0) r5).A00);
        C242373Tu r1 = null;
        if (A0a != null) {
            r0 = A0a.AiM();
        } else {
            r0 = null;
        }
        if (!C331057Pi.A02(r0)) {
            if (A0a != null) {
                r1 = A0a.AiM();
            }
            if (C331057Pi.A01(userSession, r1)) {
                return true;
            }
            return false;
        }
        return true;
    }
}
