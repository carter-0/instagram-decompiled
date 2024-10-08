package X;

import com.google.common.collect.AbstractMapBasedMultimap;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: X.Qz6  reason: case insensitive filesystem */
public class C8665Qz6 extends AbstractMapBasedMultimap<K, V>.KeySet implements SortedSet<K> {
    public final /* synthetic */ AbstractMapBasedMultimap A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8665Qz6(AbstractMapBasedMultimap abstractMapBasedMultimap, SortedMap sortedMap) {
        super(abstractMapBasedMultimap, sortedMap);
        this.A00 = abstractMapBasedMultimap;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Qz6, X.R1F] */
    public final Comparator comparator() {
        return ((SortedMap) this.A00).comparator();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Qz6, X.R1F] */
    public final Object first() {
        return ((SortedMap) this.A00).firstKey();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.Qz6, X.R1F] */
    public final SortedSet headSet(Object obj) {
        if (this instanceof C8667Qz8) {
            return headSet(obj, false);
        }
        return new C8665Qz6(this.A00, ((SortedMap) this.A00).headMap(obj));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Qz6, X.R1F] */
    public final Object last() {
        return ((SortedMap) this.A00).lastKey();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.Qz6, X.R1F] */
    public final SortedSet subSet(Object obj, Object obj2) {
        if (this instanceof C8667Qz8) {
            return subSet(obj, true, obj2, false);
        }
        return new C8665Qz6(this.A00, ((SortedMap) this.A00).subMap(obj, obj2));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.Qz6, X.R1F] */
    public final SortedSet tailSet(Object obj) {
        if (this instanceof C8667Qz8) {
            return tailSet(obj, true);
        }
        return new C8665Qz6(this.A00, ((SortedMap) this.A00).tailMap(obj));
    }
}
