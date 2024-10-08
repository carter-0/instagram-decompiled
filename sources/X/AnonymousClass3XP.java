package X;

import java.util.Map;

/* renamed from: X.3XP  reason: invalid class name */
public abstract class AnonymousClass3XP {
    public static final 2VJ A00(2VJ r3) {
        2VJ r2 = new 2VJ();
        if (r3 != null) {
            Map map = r3.A00;
            0qQ.A07(map);
            synchronized (map) {
                r2.A00.putAll(map);
            }
        }
        return r2;
    }
}
