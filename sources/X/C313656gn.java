package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.6gn  reason: invalid class name and case insensitive filesystem */
public final class C313656gn {
    public final C313646gm A00(AnonymousClass0iw r6, UserSession userSession, C313666go r8) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r6, 1);
        0qQ.A0B(r8, 2);
        Map map = ((C313686gq) userSession.A01(C313686gq.class, C313676gp.A00)).A00;
        Object obj = map.get(r8);
        if (obj == null) {
            int ordinal = r8.ordinal();
            if (ordinal == 0) {
                obj = new C62176KbY(r6, userSession);
            } else if (ordinal == 2) {
                obj = new C313646gm(r6, userSession, r8);
            } else if (ordinal == 1) {
                obj = new C313696gr(r6, userSession);
            } else {
                throw new RuntimeException();
            }
            map.put(r8, obj);
        }
        return (C313646gm) obj;
    }

    public final void A01(UserSession userSession, C313666go r4) {
        ((C313686gq) userSession.A01(C313686gq.class, C313676gp.A00)).A00.remove(r4);
    }
}
