package X;

import java.util.Map;

/* renamed from: X.5mI  reason: invalid class name and case insensitive filesystem */
public class C294345mI implements Map.Entry, C62650uo {
    public final Object A00;
    public final Object A01;

    public final boolean equals(Object obj) {
        Map.Entry entry;
        if (obj instanceof Map.Entry) {
            entry = (Map.Entry) obj;
        } else {
            entry = null;
        }
        if (entry == null || !0qQ.A0K(entry.getKey(), getKey()) || !0qQ.A0K(entry.getValue(), getValue())) {
            return false;
        }
        return true;
    }

    public final Object getKey() {
        return this.A00;
    }

    public final Object getValue() {
        if (this instanceof C294355mJ) {
            return ((C294355mJ) this).A00;
        }
        return this.A01;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.util.AbstractMap, X.5Ya] */
    public final Object setValue(Object obj) {
        int i;
        if (this instanceof C294355mJ) {
            C294355mJ r1 = (C294355mJ) this;
            Object value = r1.getValue();
            r1.A00 = obj;
            C22438Y3u y3u = r1.A01;
            Object key = r1.getKey();
            XGE xge = y3u.A00;
            ? r4 = xge.A03;
            if (r4.containsKey(key)) {
                if (xge.hasNext()) {
                    Object A02 = xge.A02();
                    r4.put(key, obj);
                    if (A02 != null) {
                        i = A02.hashCode();
                    } else {
                        i = 0;
                    }
                    XGE.A00(xge, r4.A01, A02, i, 0);
                } else {
                    r4.put(key, obj);
                }
                xge.A00 = r4.A00;
            }
            return value;
        }
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }

    public C294345mI(Object obj, Object obj2) {
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final int hashCode() {
        int i;
        Object key = getKey();
        int i2 = 0;
        if (key != null) {
            i = key.hashCode();
        } else {
            i = 0;
        }
        Object value = getValue();
        if (value != null) {
            i2 = value.hashCode();
        }
        return i ^ i2;
    }
}
