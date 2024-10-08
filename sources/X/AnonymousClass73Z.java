package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.73Z  reason: invalid class name */
public abstract class AnonymousClass73Z {
    public static final boolean A00(UserSession userSession, C254933tI r6, boolean z) {
        if (r6 == null) {
            return false;
        }
        2FW r3 = r6.A0F;
        boolean z2 = false;
        if (r3 == 2FW.A1v) {
            z2 = true;
        }
        boolean z3 = false;
        if (r3 == 2FW.A1p) {
            z3 = true;
        }
        if (z) {
            return (z2 || z3) && 182.A06(0Tu.A05, userSession, 36326764670105558L);
        }
        return false;
    }
}
