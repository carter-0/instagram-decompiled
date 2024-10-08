package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

public abstract class O0I {
    public static final Object A00(UserSession userSession, C254743sy r4) {
        Object obj;
        Class<N4P> cls = N4P.class;
        C72210Oya oya = (C72210Oya) userSession.A01(C72210Oya.class, C73819PkI.A00);
        synchronized (oya) {
            Map map = (Map) oya.A00.get(r4);
            if (map == null || (obj = map.get(cls)) == null) {
                obj = null;
            }
        }
        return obj;
    }
}
