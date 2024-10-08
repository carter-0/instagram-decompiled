package X;

import com.google.common.collect.CompactHashMap;
import java.util.Map;

/* renamed from: X.42Q  reason: invalid class name */
public abstract class AnonymousClass42Q implements Map.Entry {
    public Object getKey() {
        return ((AnonymousClass42P) this).A01;
    }

    public Object getValue() {
        AnonymousClass42P r0 = (AnonymousClass42P) this;
        CompactHashMap compactHashMap = r0.A02;
        Map delegateOrNull = compactHashMap.delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.get(r0.A01);
        }
        AnonymousClass42P.A00(r0);
        int i = r0.A00;
        if (i == -1) {
            return null;
        }
        Object[] objArr = compactHashMap.values;
        objArr.getClass();
        return objArr[i];
    }

    public Object setValue(Object obj) {
        AnonymousClass42P r4 = (AnonymousClass42P) this;
        CompactHashMap compactHashMap = r4.A02;
        Map delegateOrNull = compactHashMap.delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.put(r4.A01, obj);
        }
        AnonymousClass42P.A00(r4);
        int i = r4.A00;
        if (i == -1) {
            compactHashMap.put(r4.A01, obj);
            return null;
        }
        Object[] objArr = compactHashMap.values;
        objArr.getClass();
        Object obj2 = objArr[i];
        int i2 = r4.A00;
        Object[] objArr2 = compactHashMap.values;
        objArr2.getClass();
        objArr2[i2] = obj;
        return obj2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!2PP.A00(getKey(), entry.getKey()) || !2PP.A00(getValue(), entry.getValue())) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append("=");
        sb.append(getValue());
        return sb.toString();
    }

    public int hashCode() {
        int hashCode;
        Object key = getKey();
        Object value = getValue();
        int i = 0;
        if (key == null) {
            hashCode = 0;
        } else {
            hashCode = key.hashCode();
        }
        if (value != null) {
            i = value.hashCode();
        }
        return hashCode ^ i;
    }
}
