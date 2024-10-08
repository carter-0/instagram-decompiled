package X;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6G6  reason: invalid class name */
public final class AnonymousClass6G6<K, V> extends 0sw<K, V> implements C304526Du<K, V> {
    public static final AnonymousClass6G6 A03;
    public final Object A00;
    public final Object A01;
    public final AnonymousClass6G8 A02;

    static {
        AnonymousClass6G7 r2 = AnonymousClass6G7.A00;
        AnonymousClass6G8 r1 = AnonymousClass6G8.A02;
        0qQ.A0C(r1, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
        A03 = new AnonymousClass6G6(r2, r2, r1);
    }

    public final int A00() {
        return this.A02.size();
    }

    public final /* bridge */ /* synthetic */ Collection A01() {
        return new C22479Y5y(this);
    }

    public final Set A02() {
        return new Y6B(this);
    }

    public final /* bridge */ /* synthetic */ Set A03() {
        return new Y6C(this);
    }

    public final boolean containsKey(Object obj) {
        return this.A02.containsKey(obj);
    }

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
                if (map instanceof AnonymousClass6G6) {
                    r2 = this.A02.A00;
                    r1 = ((AnonymousClass6G6) obj).A02.A00;
                    r0 = XE4.A00;
                } else if (map instanceof C21085XDy) {
                    r2 = this.A02.A00;
                    r1 = ((C21085XDy) obj).A03.A04;
                    r0 = C22485Y6e.A00;
                } else if (map instanceof AnonymousClass6G8) {
                    r2 = this.A02.A00;
                    r1 = ((AnonymousClass6G8) obj).A00;
                    r0 = C22486Y6f.A00;
                } else if (!(map instanceof C21084XDx)) {
                    return AnonymousClass6G6.super.equals(obj);
                } else {
                    r2 = this.A02.A00;
                    r1 = ((C21084XDx) obj).A04;
                    r0 = C22487Y6g.A00;
                }
                return r2.A0G(r0, r1);
            }
        }
        return false;
    }

    public final Object get(Object obj) {
        C21086XDz xDz = (C21086XDz) this.A02.get(obj);
        if (xDz != null) {
            return xDz.A02;
        }
        return null;
    }

    public AnonymousClass6G6(Object obj, Object obj2, AnonymousClass6G8 r3) {
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = r3;
    }
}
