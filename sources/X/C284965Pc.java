package X;

import java.util.Iterator;

/* renamed from: X.5Pc  reason: invalid class name and case insensitive filesystem */
public final class C284965Pc<E> extends 0Yx<E> implements C284975Pd<E> {
    public static final C284965Pc A03;
    public final C284985Pf A00;
    public final Object A01;
    public final Object A02;

    static {
        AnonymousClass5Pe r2 = AnonymousClass5Pe.A00;
        C284985Pf r1 = C284985Pf.A02;
        0qQ.A0C(r1, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
        A03 = new C284965Pc(r1, r2, r2);
    }

    public final int A08() {
        return this.A00.size();
    }

    public final boolean contains(Object obj) {
        return this.A00.containsKey(obj);
    }

    public final Iterator iterator() {
        return new C22434Y3q(this.A01, this.A00);
    }

    public C284965Pc(C284985Pf r1, Object obj, Object obj2) {
        this.A01 = obj;
        this.A02 = obj2;
        this.A00 = r1;
    }
}
