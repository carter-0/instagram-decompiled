package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.6h0  reason: invalid class name and case insensitive filesystem */
public final class C313786h0 {
    public final C313776gz A00(UserSession userSession, C313666go r7) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r7, 1);
        Map map = ((C313806h2) userSession.A01(C313806h2.class, C313796h1.A00)).A00;
        Object obj = map.get(r7);
        if (obj == null) {
            int ordinal = r7.ordinal();
            if (ordinal == 0) {
                obj = new C62242Kcc(userSession);
            } else if (ordinal == 2) {
                obj = new C62243Kcd(userSession, r7);
            } else if (ordinal == 1) {
                obj = new AnonymousClass6h3(userSession);
            } else {
                throw new RuntimeException();
            }
            map.put(r7, obj);
        }
        return (C313776gz) obj;
    }

    public final void A01(UserSession userSession, C313666go r4) {
        0qQ.A0B(userSession, 0);
        ((C313806h2) userSession.A01(C313806h2.class, C313796h1.A00)).A00.remove(r4);
    }
}
