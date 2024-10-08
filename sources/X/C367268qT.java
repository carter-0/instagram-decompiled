package X;

import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;

/* renamed from: X.8qT  reason: invalid class name and case insensitive filesystem */
public abstract class C367268qT {
    public static final boolean A00(28D r2) {
        0qQ.A0B(r2, 0);
        if (r2 == 28D.A2c || r2 == 28D.A5H || r2 == 28D.A5F) {
            return true;
        }
        return false;
    }

    public static final boolean A01(28D r1, Medium medium, UserSession userSession) {
        0qQ.A0B(r1, 0);
        if (!A00(r1) || medium == null || medium.A03 <= C3495980z.A00(userSession).A01) {
            return false;
        }
        return true;
    }
}
