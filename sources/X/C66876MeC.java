package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.MeC  reason: case insensitive filesystem */
public abstract class C66876MeC {
    public static final C66877MeD A00(UserSession userSession, Object obj, List list) {
        C74410PuQ puQ;
        0qQ.A0B(list, 0);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                puQ = null;
                break;
            }
            puQ = (C74410PuQ) it.next();
            if (!puQ.ASy(userSession, obj)) {
                break;
            }
        }
        return new C66877MeD(puQ);
    }
}
