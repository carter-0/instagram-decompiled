package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GGo  reason: case insensitive filesystem */
public abstract class C52146GGo {
    public static final boolean A00(C267324bN r2, C52058GDe gDe, UserSession userSession) {
        0qQ.A0B(gDe, 0);
        0qQ.A0B(userSession, 2);
        1Xj r22 = r2.A02;
        if (gDe.A0D != AnonymousClass3WA.A0F) {
            return true;
        }
        if (r22 == null || !1sd.A00(userSession).A05(r22)) {
            return false;
        }
        return true;
    }
}
