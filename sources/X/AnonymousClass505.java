package X;

import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;

/* renamed from: X.505  reason: invalid class name */
public abstract class AnonymousClass505 {
    public static final AnonymousClass506 A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (Systrace.A0E(1)) {
            0fS.A01("ReelTrayPerPogCache.getInstance", 1509121793);
        }
        try {
            return (AnonymousClass506) userSession.A01(AnonymousClass506.class, new C377079Kl(userSession, 9));
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-1826007621);
            }
        }
    }
}
