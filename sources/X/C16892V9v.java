package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.V9v  reason: case insensitive filesystem */
public abstract class C16892V9v {
    public static final String A00(C307896Rx r1, AnonymousClass6Tm r2) {
        String str;
        String A0g = DbY.A0g(r2);
        UserSession A0Z = DbT.A0Z(r1);
        Reel A0L = Dba.A0L(A0Z, A0g);
        if (A0L == null) {
            return null;
        }
        synchronized (A0L.A1n) {
            C255773uh A09 = A0L.A09(A0Z);
            if (A09 != null) {
                str = A09.A0j;
            } else {
                str = null;
            }
        }
        return str;
    }
}
