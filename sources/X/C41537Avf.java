package X;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Avf  reason: case insensitive filesystem */
public final class C41537Avf<K, V> extends LinkedHashMap<K, V> {
    public static final C41537Avf A01;
    public boolean A00 = true;

    static {
        C41537Avf avf = new C41537Avf();
        A01 = avf;
        avf.A00 = false;
    }

    public static int A00(Object obj) {
        if (obj instanceof byte[]) {
            Charset charset = AnonymousClass97S.A04;
            int i = r3;
            for (byte b : (byte[]) obj) {
                i = (i * 31) + b;
            }
            if (i == 0) {
                return 1;
            }
            return i;
        } else if (!(obj instanceof AnonymousClass97P)) {
            return obj.hashCode();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public static void A01(C41537Avf avf) {
        if (!avf.A00) {
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
        Iterator A0s = AnonymousClass7TF.A0s(this);
        while (A0s.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
            if (!map.containsKey(A1J.getKey())) {
                return false;
            }
            Object value = A1J.getValue();
            Object obj2 = map.get(A1J.getKey());
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

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.LinkedHashMap, X.Avf] */
    public final C41537Avf A02() {
        ? linkedHashMap;
        if (isEmpty()) {
            return linkedHashMap;
        }
        linkedHashMap = new LinkedHashMap(this);
        linkedHashMap.A00 = true;
        return linkedHashMap;
    }

    public final void clear() {
        A01(this);
        super.clear();
    }

    public final Set entrySet() {
        if (isEmpty()) {
            return Collections.emptySet();
        }
        return super.entrySet();
    }

    public final int hashCode() {
        Iterator A0s = AnonymousClass7TF.A0s(this);
        int i = 0;
        while (A0s.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
            i += A00(A1J.getValue()) ^ A00(A1J.getKey());
        }
        return i;
    }

    public final Object put(Object obj, Object obj2) {
        A01(this);
        Charset charset = AnonymousClass97S.A04;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    public final void putAll(Map map) {
        A01(this);
        for (Object next : map.keySet()) {
            Charset charset = AnonymousClass97S.A04;
            next.getClass();
            map.get(next).getClass();
        }
        super.putAll(map);
    }

    public final Object remove(Object obj) {
        A01(this);
        return super.remove(obj);
    }
}
