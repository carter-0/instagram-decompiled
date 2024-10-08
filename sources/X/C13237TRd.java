package X;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.TRd  reason: case insensitive filesystem */
public class C13237TRd<K, V> extends AbstractCollection<V> {
    public final Map A00;

    public final void clear() {
        this.A00.clear();
    }

    public final boolean contains(Object obj) {
        return this.A00.containsValue(obj);
    }

    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public final Iterator iterator() {
        return new R1L(AnonymousClass7TF.A0u(this.A00), 1);
    }

    public final int size() {
        return this.A00.size();
    }

    public C13237TRd(Map map) {
        this.A00 = map;
    }

    public boolean remove(Object obj) {
        try {
            return super.remove(obj);
        } catch (UnsupportedOperationException unused) {
            Map map = this.A00;
            Iterator A0u = AnonymousClass7TF.A0u(map);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                if (2PP.A00(obj, A1J.getValue())) {
                    map.remove(A1J.getKey());
                    return true;
                }
            }
            return false;
        }
    }

    public boolean removeAll(Collection collection) {
        try {
            collection.getClass();
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet A1F = AnonymousClass7TE.A1F();
            Map map = this.A00;
            Iterator A0u = AnonymousClass7TF.A0u(map);
            while (A0u.hasNext()) {
                Pxk.A0e(A1F, collection, A0u);
            }
            return map.keySet().removeAll(A1F);
        }
    }

    public boolean retainAll(Collection collection) {
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet A1F = AnonymousClass7TE.A1F();
            Map map = this.A00;
            Iterator A0u = AnonymousClass7TF.A0u(map);
            while (A0u.hasNext()) {
                Pxk.A0e(A1F, collection, A0u);
            }
            return map.keySet().retainAll(A1F);
        }
    }
}
