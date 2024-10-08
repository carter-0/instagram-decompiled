package X;

import com.google.common.collect.CompactHashMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.42J  reason: invalid class name */
public final class AnonymousClass42J extends AbstractSet<Map.Entry<K, V>> {
    public final /* synthetic */ CompactHashMap A00;

    public AnonymousClass42J(CompactHashMap compactHashMap) {
        this.A00 = compactHashMap;
    }

    public final void clear() {
        this.A00.clear();
    }

    public final boolean contains(Object obj) {
        CompactHashMap compactHashMap = this.A00;
        Map delegateOrNull = compactHashMap.delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.entrySet().contains(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        int A002 = CompactHashMap.A00(compactHashMap, entry.getKey());
        if (A002 == -1) {
            return false;
        }
        Object[] objArr = compactHashMap.values;
        objArr.getClass();
        if (2PP.A00(objArr[A002], entry.getValue())) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        CompactHashMap compactHashMap = this.A00;
        Map delegateOrNull = compactHashMap.delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.entrySet().iterator();
        }
        return new AnonymousClass42N(compactHashMap);
    }

    public final boolean remove(Object obj) {
        CompactHashMap compactHashMap = this.A00;
        Map delegateOrNull = compactHashMap.delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.entrySet().remove(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (compactHashMap.A02 != null) {
                int i = (1 << (compactHashMap.A00 & 31)) - 1;
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = compactHashMap.A02;
                obj2.getClass();
                int[] iArr = compactHashMap.entries;
                iArr.getClass();
                Object[] objArr = compactHashMap.keys;
                objArr.getClass();
                Object[] objArr2 = compactHashMap.values;
                objArr2.getClass();
                int A01 = AnonymousClass42I.A01(key, value, obj2, iArr, objArr, objArr2, i);
                if (A01 != -1) {
                    compactHashMap.A0B(A01, i);
                    compactHashMap.A01--;
                    compactHashMap.A00 += 32;
                    return true;
                }
            }
        }
        return false;
    }

    public final int size() {
        return this.A00.size();
    }
}
