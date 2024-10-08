package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4ir  reason: invalid class name and case insensitive filesystem */
public abstract class C271444ir {
    public static AnonymousClass2pP A00;
    public static final Map A01 = new LinkedHashMap();
    public static final Map A02 = new LinkedHashMap();

    public static final Integer A00(String str) {
        Map map = A02;
        for (Object next : map.keySet()) {
            if (00l.A0d((String) next, str, false)) {
                if (next != null) {
                    return (Integer) map.get(next);
                }
                return null;
            }
        }
        return null;
    }

    public static final Long A01(String str) {
        0qQ.A0B(str, 0);
        Map map = A01;
        for (Object next : map.keySet()) {
            if (00l.A0d((String) next, str, false)) {
                if (next != null) {
                    return (Long) map.get(next);
                }
                return null;
            }
        }
        return null;
    }
}
