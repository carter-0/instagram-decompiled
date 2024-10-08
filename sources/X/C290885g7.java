package X;

import com.google.common.collect.CompactHashMap;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.5g7  reason: invalid class name and case insensitive filesystem */
public final class C290885g7 extends AbstractCollection<V> {
    public final /* synthetic */ CompactHashMap A00;

    public C290885g7(CompactHashMap compactHashMap) {
        this.A00 = compactHashMap;
    }

    public final void clear() {
        this.A00.clear();
    }

    public final Iterator iterator() {
        CompactHashMap compactHashMap = this.A00;
        Map delegateOrNull = compactHashMap.delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.values().iterator();
        }
        return new C290895g8(compactHashMap);
    }

    public final int size() {
        return this.A00.size();
    }
}
