package X;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: X.5Ya  reason: invalid class name and case insensitive filesystem */
public class C286845Ya<K, V> extends 0Yy<K, V> implements C286855Yb<K, V> {
    public int A00;
    public C285005Ph A01;
    public C286865Yc A02 = new Object();
    public Object A03;
    public int A04;
    public C284985Pf A05;

    public final Object put(Object obj, Object obj2) {
        int i;
        this.A03 = null;
        C285005Ph r0 = this.A01;
        Object obj3 = obj;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        this.A01 = r0.A0G(this, obj3, obj2, i, 0);
        return this.A03;
    }

    public Object remove(Object obj) {
        int i;
        this.A03 = null;
        C285005Ph r2 = this.A01;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        C285005Ph A0F = r2.A0F(this, obj, i, 0);
        if (A0F == null) {
            A0F = C285005Ph.A04;
            0qQ.A0C(A0F, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.A01 = A0F;
        return this.A03;
    }

    public final int A00() {
        return this.A04;
    }

    public final Collection A01() {
        return new Y60(this);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Set, X.Y64] */
    public final Set A02() {
        return new Y64(this);
    }

    public final Set A03() {
        return new Y65(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: X.5YZ} */
    /* JADX WARNING: type inference failed for: r0v2, types: [X.5Yc, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C284985Pf A04() {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.AnonymousClass5YZ
            if (r0 == 0) goto L_0x000c
            r0 = r3
            X.5YZ r0 = (X.AnonymousClass5YZ) r0
            X.5RL r1 = r0.A06()
            return r1
        L_0x000c:
            X.5Ph r2 = r3.A01
            X.5Pf r1 = r3.A05
            X.5Ph r0 = r1.A00
            if (r2 == r0) goto L_0x0024
            X.5Yc r0 = new X.5Yc
            r0.<init>()
            r3.A02 = r0
            int r0 = r3.size()
            X.5Pf r1 = new X.5Pf
            r1.<init>(r2, r0)
        L_0x0024:
            r3.A05 = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C286845Ya.A04():X.5Pf");
    }

    public final void A05(int i) {
        this.A04 = i;
        this.A00++;
    }

    public final /* bridge */ /* synthetic */ C284995Pg AEC() {
        if (this instanceof AnonymousClass5YZ) {
            return ((AnonymousClass5YZ) this).A06();
        }
        return A04();
    }

    public final void clear() {
        C285005Ph r1 = C285005Ph.A04;
        0qQ.A0C(r1, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.A01 = r1;
        A05(0);
    }

    public boolean containsKey(Object obj) {
        int i;
        C285005Ph r2 = this.A01;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return r2.A0K(obj, i, 0);
    }

    public Object get(Object obj) {
        int i;
        C285005Ph r2 = this.A01;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return r2.A0J(i, obj, 0);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.5Yd, java.lang.Object] */
    public final void putAll(Map map) {
        C284985Pf r6;
        C286845Ya r0;
        if (!(map instanceof C284985Pf) || (r6 = (C284985Pf) map) == null) {
            if (!(map instanceof C286845Ya) || (r0 = (C286845Ya) map) == null) {
                C286845Ya.super.putAll(map);
                return;
            }
            r6 = r0.A04();
        }
        ? obj = new Object();
        obj.A00 = 0;
        int size = size();
        C285005Ph r2 = this.A01;
        C285005Ph r1 = r6.A00;
        0qQ.A0C(r1, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.A01 = r2.A0E(this, r1, obj, 0);
        int size2 = (r6.size() + size) - obj.A00;
        if (size != size2) {
            A05(size2);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.5Yc, java.lang.Object] */
    public C286845Ya(C284985Pf r2) {
        this.A05 = r2;
        this.A01 = r2.A00;
        this.A04 = r2.size();
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [java.util.AbstractMap, X.5Ya] */
    public final boolean remove(Object obj, Object obj2) {
        int i;
        int size = size();
        C285005Ph r3 = this.A01;
        Object obj3 = obj;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        C285005Ph A0H = r3.A0H(this, obj3, obj2, i, 0);
        if (A0H == null) {
            A0H = C285005Ph.A04;
            0qQ.A0C(A0H, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.A01 = A0H;
        if (size != size()) {
            return true;
        }
        return false;
    }
}
