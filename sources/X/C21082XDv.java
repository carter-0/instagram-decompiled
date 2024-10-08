package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.XDv  reason: case insensitive filesystem */
public final class C21082XDv extends 0Yx implements Collection, C62650uo, YCQ {
    public static final C21082XDv A03;
    public final Object A00;
    public final Object A01;
    public final AnonymousClass6G8 A02;

    static {
        AnonymousClass6G7 r2 = AnonymousClass6G7.A00;
        AnonymousClass6G8 r1 = AnonymousClass6G8.A02;
        0qQ.A0C(r1, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
        A03 = new C21082XDv(r2, r2, r1);
    }

    public final int A08() {
        return this.A02.size();
    }

    public final boolean contains(Object obj) {
        return this.A02.containsKey(obj);
    }

    public final boolean equals(Object obj) {
        AnonymousClass6G9 r2;
        AnonymousClass6G9 r1;
        0sL r0;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() == set.size()) {
                if (set instanceof C21082XDv) {
                    r2 = this.A02.A00;
                    r1 = ((C21082XDv) obj).A02.A00;
                    r0 = C22492Y6l.A00;
                } else if (!(set instanceof XE5)) {
                    return C21082XDv.super.equals(obj);
                } else {
                    r2 = this.A02.A00;
                    r1 = ((XE5) obj).A03.A04;
                    r0 = C22493Y6m.A00;
                }
                return r2.A0G(r0, r1);
            }
        }
        return false;
    }

    public final Iterator iterator() {
        return new C21083XDw(this.A00, this.A02);
    }

    public C21082XDv(Object obj, Object obj2, AnonymousClass6G8 r3) {
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = r3;
    }
}
