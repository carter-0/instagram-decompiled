package X;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: X.XDx  reason: case insensitive filesystem */
public final class C21084XDx<K, V> extends 0Yy<K, V> implements YCP<K, V> {
    public int A00;
    public int A01;
    public Object A02;
    public AnonymousClass6G8 A03;
    public AnonymousClass6G9 A04;
    public AnonymousClass6GA A05;

    public final Object put(Object obj, Object obj2) {
        int i;
        this.A02 = null;
        AnonymousClass6G9 r0 = this.A04;
        Object obj3 = obj;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        this.A04 = r0.A0B(obj3, obj2, this, i, 0);
        return this.A02;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.Xcx, java.lang.Object] */
    public final void putAll(Map map) {
        AnonymousClass6G8 r5;
        C21084XDx xDx;
        0qQ.A0B(map, 0);
        if (!(map instanceof AnonymousClass6G8) || (r5 = (AnonymousClass6G8) map) == null) {
            if (!(map instanceof C21084XDx) || (xDx = (C21084XDx) map) == null) {
                C21084XDx.super.putAll(map);
                return;
            }
            r5 = xDx.AEL();
        }
        ? obj = new Object();
        obj.A00 = 0;
        int size = size();
        AnonymousClass6G9 r2 = this.A04;
        AnonymousClass6G9 r1 = r5.A00;
        0qQ.A0C(r1, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.A04 = r2.A0E(this, r1, obj, 0);
        int size2 = (r5.size() + size) - obj.A00;
        if (size != size2) {
            A05(size2);
        }
    }

    public final Object remove(Object obj) {
        this.A02 = null;
        AnonymousClass6G9 A0D = this.A04.A0D(obj, this, C51971G9r.A0E(obj), 0);
        if (A0D == null) {
            A0D = AnonymousClass6G9.A04;
            0qQ.A0C(A0D, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.A04 = A0D;
        return this.A02;
    }

    public final Collection A01() {
        return new Y61(this);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Set, X.Y6v] */
    public final Set A02() {
        return new C22502Y6v(this);
    }

    public final Set A03() {
        return new Y66(this);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.6GA, java.lang.Object] */
    /* renamed from: A04 */
    public final AnonymousClass6G8 AEL() {
        AnonymousClass6G9 r2 = this.A04;
        AnonymousClass6G8 r1 = this.A03;
        if (r2 != r1.A00) {
            this.A05 = new Object();
            r1 = new AnonymousClass6G8(r2, size());
        }
        this.A03 = r1;
        return r1;
    }

    public final void A05(int i) {
        this.A01 = i;
        this.A00++;
    }

    public final void clear() {
        AnonymousClass6G9 r1 = AnonymousClass6G9.A04;
        0qQ.A0C(r1, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.A04 = r1;
        A05(0);
    }

    public final boolean containsKey(Object obj) {
        return this.A04.A0F(obj, C51971G9r.A0E(obj), 0);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.util.AbstractMap, java.util.Map, X.XDx] */
    public final boolean equals(Object obj) {
        AnonymousClass6G9 r2;
        AnonymousClass6G9 r1;
        0sL r0;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() == map.size()) {
                if (map instanceof AnonymousClass6G8) {
                    r2 = this.A04;
                    r1 = ((AnonymousClass6G8) obj).A00;
                    r0 = C22481Y6a.A00;
                } else if (map instanceof C21084XDx) {
                    r2 = this.A04;
                    r1 = ((C21084XDx) obj).A04;
                    r0 = C22482Y6b.A00;
                } else if (map instanceof AnonymousClass6G6) {
                    r2 = this.A04;
                    r1 = ((AnonymousClass6G6) obj).A02.A00;
                    r0 = C22483Y6c.A00;
                } else if (!(map instanceof C21085XDy)) {
                    return C21523Xdp.A01(this, map);
                } else {
                    r2 = this.A04;
                    r1 = ((C21085XDy) obj).A03.A04;
                    r0 = C22484Y6d.A00;
                }
                return r2.A0G(r0, r1);
            }
        }
        return false;
    }

    public final Object get(Object obj) {
        int i;
        AnonymousClass6G9 r2 = this.A04;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return r2.A09(i, obj, 0);
    }

    public final int A00() {
        return this.A01;
    }

    public final int hashCode() {
        return entrySet().hashCode();
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [java.util.AbstractMap, X.XDx] */
    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        AnonymousClass6G9 A0C = this.A04.A0C(obj, obj2, this, C51971G9r.A0E(obj), 0);
        if (A0C == null) {
            A0C = AnonymousClass6G9.A04;
            0qQ.A0C(A0C, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.A04 = A0C;
        if (size != size()) {
            return true;
        }
        return false;
    }
}
