package X;

import java.util.Map;
import java.util.Set;

/* renamed from: X.IOi  reason: case insensitive filesystem */
public final class C57094IOi implements AnonymousClass0lh {
    public final Map A00 = AnonymousClass7TE.A1H();

    public static final void A00(C61079JwH jwH, C57094IOi iOi, String str, String str2) {
        Map map = iOi.A00;
        synchronized (map) {
            Object obj = map.get(str);
            if (obj == null) {
                obj = AnonymousClass7TE.A1H();
                map.put(str, obj);
            }
            Map map2 = (Map) obj;
            Object obj2 = map2.get(str2);
            if (obj2 == null) {
                obj2 = DbS.A0y();
                map2.put(str2, obj2);
            }
            ((Set) obj2).add(jwH);
        }
    }

    public final void onSessionWillEnd() {
        Map map = this.A00;
        synchronized (map) {
            map.clear();
        }
    }
}
