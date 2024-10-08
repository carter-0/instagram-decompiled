package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2tN  reason: invalid class name */
public final class AnonymousClass2tN {
    public long A00;
    public final C232282tO A01 = new C232282tO();

    public final long A00(Class cls, Object obj) {
        Object obj2;
        0qQ.A0B(cls, 0);
        0qQ.A0B(obj, 1);
        Map map = this.A01.A00;
        Map map2 = (Map) map.get(cls);
        if (map2 == null) {
            obj2 = null;
        } else {
            obj2 = map2.get(obj);
        }
        Number number = (Number) obj2;
        if (number == null) {
            long j = this.A00;
            this.A00 = 1 + j;
            number = Long.valueOf(j);
            Map map3 = (Map) map.get(cls);
            if (map3 == null) {
                map3 = new HashMap();
                map.put(cls, map3);
            }
            map3.put(obj, number);
        }
        return number.longValue();
    }
}
