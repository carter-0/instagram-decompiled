package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6LA  reason: invalid class name */
public abstract class AnonymousClass6LA {
    public static final String A00(UserSession userSession, AnonymousClass4DU r2, C255773uh r3) {
        C270194gL r0;
        if (AnonymousClass3WX.A02(r3, r2)) {
            return r3.ByO(userSession);
        }
        if (!AnonymousClass3WX.A01(r3, r2)) {
            return null;
        }
        int ordinal = r3.A0e.ordinal();
        if (ordinal == 1) {
            1Xj r02 = r3.A0b;
            r02.getClass();
            return r02.A0C.getOrganicTrackingToken();
        } else if ((ordinal == 3 || ordinal == 4) && (r0 = r3.A0c) != null) {
            return r0.A0h;
        } else {
            return null;
        }
    }
}
