package X;

import android.util.LruCache;
import com.instagram.common.session.UserSession;

/* renamed from: X.HpP  reason: case insensitive filesystem */
public final class C55902HpP {
    public final C62031KWh A00(UserSession userSession, String str) {
        AnonymousClass7TG.A1N(userSession, str);
        C56508Hze hze = (C56508Hze) userSession.A01(C56508Hze.class, new C58710IwJ(userSession, 19));
        LruCache lruCache = hze.A00;
        C62031KWh kWh = (C62031KWh) lruCache.get(str);
        if (kWh != null) {
            return kWh;
        }
        C62031KWh kWh2 = new C62031KWh(hze.A01, str);
        lruCache.put(str, kWh2);
        return kWh2;
    }
}
