package X;

import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;

/* renamed from: X.O1m  reason: case insensitive filesystem */
public abstract class C70308O1m {
    public static final A4O A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (Systrace.A0E(1)) {
            0fS.A01("ReelTrayPogUserCache.getInstance", 1714652671);
        }
        try {
            return (A4O) userSession.A01(A4O.class, new C73901Plc(userSession, 8));
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-2044296095);
            }
        }
    }
}
