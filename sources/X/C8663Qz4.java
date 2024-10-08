package X;

import com.google.common.collect.AbstractMapBasedMultimap;
import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: X.Qz4  reason: case insensitive filesystem */
public class C8663Qz4 extends AbstractMapBasedMultimap<K, V>.AsMap implements SortedMap<K, Collection<V>> {
    public SortedSet A00;
    public final /* synthetic */ AbstractMapBasedMultimap A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8663Qz4(AbstractMapBasedMultimap abstractMapBasedMultimap, SortedMap sortedMap) {
        super(abstractMapBasedMultimap, sortedMap);
        this.A01 = abstractMapBasedMultimap;
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [X.Qz7, X.R0x] */
    /* renamed from: A01 */
    public SortedSet keySet() {
        SortedSet sortedSet = this.A00;
        if (sortedSet == null) {
            if (this instanceof C8666Qz7) {
                ? r2 = (C8666Qz7) this;
                sortedSet = new C8667Qz8(r2.A00, (NavigableMap) ((SortedMap) r2.A00));
            } else {
                sortedSet = new C8665Qz6(this.A01, (SortedMap) this.A00);
            }
            this.A00 = sortedSet;
        }
        return sortedSet;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.R0x, X.Qz4] */
    public final Comparator comparator() {
        return ((SortedMap) this.A00).comparator();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.R0x, X.Qz4] */
    public final Object firstKey() {
        return ((SortedMap) this.A00).firstKey();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.R0x, X.Qz4] */
    public final SortedMap headMap(Object obj) {
        if (this instanceof C8666Qz7) {
            return headMap(obj, false);
        }
        return new C8663Qz4(this.A01, ((SortedMap) this.A00).headMap(obj));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.R0x, X.Qz4] */
    public final Object lastKey() {
        return ((SortedMap) this.A00).lastKey();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.R0x, X.Qz4] */
    public final SortedMap subMap(Object obj, Object obj2) {
        if (this instanceof C8666Qz7) {
            return subMap(obj, true, obj2, false);
        }
        return new C8663Qz4(this.A01, ((SortedMap) this.A00).subMap(obj, obj2));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.R0x, X.Qz4] */
    public final SortedMap tailMap(Object obj) {
        if (this instanceof C8666Qz7) {
            return tailMap(obj, true);
        }
        return new C8663Qz4(this.A01, ((SortedMap) this.A00).tailMap(obj));
    }
}
