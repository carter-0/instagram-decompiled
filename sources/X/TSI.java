package X;

import com.google.common.collect.CompactHashMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

public final class TSI extends AbstractSet<K> {
    public final /* synthetic */ CompactHashMap A00;

    public TSI(CompactHashMap compactHashMap) {
        this.A00 = compactHashMap;
    }

    public final void clear() {
        this.A00.clear();
    }

    public final boolean contains(Object obj) {
        return this.A00.containsKey(obj);
    }

    public final Iterator iterator() {
        CompactHashMap compactHashMap = this.A00;
        Map delegateOrNull = compactHashMap.delegateOrNull();
        if (delegateOrNull != null) {
            return DbV.A16(delegateOrNull);
        }
        return new QzY(compactHashMap);
    }

    public final boolean remove(Object obj) {
        CompactHashMap compactHashMap = this.A00;
        Map delegateOrNull = compactHashMap.delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.keySet().remove(obj);
        }
        return C51969G9p.A1a(CompactHashMap.A01(compactHashMap, obj), CompactHashMap.A06);
    }

    public final int size() {
        return this.A00.size();
    }
}
