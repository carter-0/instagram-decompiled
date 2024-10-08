package X;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.5Kp  reason: invalid class name and case insensitive filesystem */
public final class C284025Kp<K, V> extends LinkedHashMap<K, V> {
    public static final C284025Kp A01;
    public boolean A00 = true;

    static {
        C284025Kp r1 = new C284025Kp();
        A01 = r1;
        r1.A00 = false;
    }

    public static void A00(C284025Kp r0) {
        if (!r0.A00) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean equals(Object obj) {
        boolean equals;
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(value instanceof byte[]) || !(obj2 instanceof byte[])) {
                equals = value.equals(obj2);
                continue;
            } else {
                equals = Arrays.equals((byte[]) value, (byte[]) obj2);
                continue;
            }
            if (!equals) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.LinkedHashMap, X.5Kp] */
    public final C284025Kp A01() {
        ? linkedHashMap;
        if (isEmpty()) {
            return linkedHashMap;
        }
        linkedHashMap = new LinkedHashMap(this);
        linkedHashMap.A00 = true;
        return linkedHashMap;
    }

    public final void clear() {
        A00(this);
        super.clear();
    }

    public final Set entrySet() {
        if (isEmpty()) {
            return Collections.emptySet();
        }
        return super.entrySet();
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        for (Map.Entry entry : entrySet()) {
            Object key = entry.getKey();
            if (key instanceof byte[]) {
                Charset charset = C284045Ks.A03;
                i = r2;
                for (byte b : (byte[]) key) {
                    i = (i * 31) + b;
                }
                if (i == 0) {
                    i = 1;
                }
            } else {
                i = key.hashCode();
            }
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Charset charset2 = C284045Ks.A03;
                i2 = r3;
                for (byte b2 : (byte[]) value) {
                    i2 = (i2 * 31) + b2;
                }
                if (i2 == 0) {
                    i2 = 1;
                }
            } else {
                i2 = value.hashCode();
            }
            i3 += i2 ^ i;
        }
        return i3;
    }

    public final Object put(Object obj, Object obj2) {
        A00(this);
        Charset charset = C284045Ks.A03;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    public final void putAll(Map map) {
        A00(this);
        for (Object next : map.keySet()) {
            Charset charset = C284045Ks.A03;
            next.getClass();
            map.get(next).getClass();
        }
        super.putAll(map);
    }

    public final Object remove(Object obj) {
        A00(this);
        return super.remove(obj);
    }
}
