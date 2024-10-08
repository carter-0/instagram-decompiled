package X;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class TSX<K, V> extends LinkedHashMap<K, V> {
    public static final TSX A01;
    public boolean A00 = true;

    static {
        TSX tsx = new TSX();
        A01 = tsx;
        tsx.A00 = false;
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
            Charset charset = SDA.A04;
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
                Charset charset = SDA.A04;
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

    public final Set entrySet() {
        if (isEmpty()) {
            return Collections.emptySet();
        }
        return super.entrySet();
    }

    public final int hashCode() {
        int i;
        int i2;
        Iterator A0s = AnonymousClass7TF.A0s(this);
        int i3 = 0;
        while (A0s.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
            Object key = A1J.getKey();
            if (key instanceof byte[]) {
                Charset charset = SDA.A04;
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
            Object value = A1J.getValue();
            if (value instanceof byte[]) {
                Charset charset2 = SDA.A04;
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
}
