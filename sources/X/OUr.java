package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class OUr {
    public static OUr A00;
    public static final ConcurrentMap A01 = new ConcurrentHashMap();
    public static final ConcurrentMap A02 = new ConcurrentHashMap();

    public final boolean A00(String str) {
        0qQ.A0B(str, 0);
        ConcurrentMap concurrentMap = A01;
        if (!concurrentMap.containsKey(str)) {
            return false;
        }
        ConcurrentMap concurrentMap2 = A02;
        if (!concurrentMap2.containsKey(str) && concurrentMap.containsKey(str)) {
            concurrentMap2.put(str, concurrentMap.get(str));
        }
        return true;
    }
}
