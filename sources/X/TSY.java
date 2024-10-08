package X;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class TSY<K, V> extends LinkedHashMap<K, V> {
    public static final TSY A01;
    public boolean A00 = true;

    static {
        TSY tsy = new TSY();
        A01 = tsy;
        tsy.A00 = false;
    }

    public static int A00(Object obj) {
        if (obj instanceof byte[]) {
            Charset charset = SD9.A04;
            int i = r3;
            for (byte b : (byte[]) obj) {
                i = (i * 31) + b;
            }
            if (i == 0) {
                return 1;
            }
            return i;
        } else if (!(obj instanceof C13660TeR)) {
            return obj.hashCode();
        } else {
            throw C66580MXl.A11();
        }
    }

    public final void clear() {
        if (this.A00) {
            super.clear();
            return;
        }
        throw C66580MXl.A11();
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

    public final Object put(Object obj, Object obj2) {
        if (this.A00) {
            Charset charset = SD9.A04;
            obj.getClass();
            obj2.getClass();
            return super.put(obj, obj2);
        }
        throw C66580MXl.A11();
    }

    public final void putAll(Map map) {
        if (this.A00) {
            Iterator A16 = DbV.A16(map);
            while (A16.hasNext()) {
                Object next = A16.next();
                Charset charset = SD9.A04;
                next.getClass();
                map.get(next).getClass();
            }
            super.putAll(map);
            return;
        }
        throw C66580MXl.A11();
    }

    public final Object remove(Object obj) {
        if (this.A00) {
            return super.remove(obj);
        }
        throw C66580MXl.A11();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.LinkedHashMap, X.TSY] */
    public final TSY A01() {
        ? linkedHashMap;
        if (isEmpty()) {
            return linkedHashMap;
        }
        linkedHashMap = new LinkedHashMap(this);
        linkedHashMap.A00 = true;
        return linkedHashMap;
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
}
