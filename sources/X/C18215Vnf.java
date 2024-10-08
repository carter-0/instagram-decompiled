package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Vnf  reason: case insensitive filesystem */
public abstract class C18215Vnf {
    public static final boolean A00(UserSession userSession, boolean z) {
        0qQ.A0B(userSession, 1);
        if (z) {
            return false;
        }
        return 182.A06(0Tu.A05, userSession, 36322744580712834L);
    }

    public static final boolean A01(UserSession userSession, boolean z, boolean z2) {
        0Tu r2;
        0qQ.A0B(userSession, 1);
        if (z) {
            return false;
        }
        if (z2) {
            r2 = 0Tu.A06;
        } else {
            r2 = 0Tu.A05;
        }
        if (182.A06(r2, userSession, 36323122537966454L) || 182.A06(r2, userSession, 36329264341204878L)) {
            return true;
        }
        return false;
    }
}
