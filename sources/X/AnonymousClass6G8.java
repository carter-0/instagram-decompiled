package X;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6G8  reason: invalid class name */
public final class AnonymousClass6G8<K, V> extends 0sw<K, V> implements C304526Du<K, V> {
    public static final AnonymousClass6G8 A02 = new AnonymousClass6G8(AnonymousClass6G9.A04, 0);
    public final AnonymousClass6G9 A00;
    public final int A01;

    public AnonymousClass6G8(AnonymousClass6G9 r2, int i) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
        this.A01 = i;
    }

    public final int A00() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ Collection A01() {
        return new C22478Y5x(this);
    }

    public final Set A02() {
        return new Y69(this);
    }

    public final /* bridge */ /* synthetic */ Set A03() {
        return new Y6A(this);
    }

    public final boolean containsKey(Object obj) {
        int i;
        AnonymousClass6G9 r2 = this.A00;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return r2.A0F(obj, i, 0);
    }

    public final boolean equals(Object obj) {
        AnonymousClass6G9 r2;
        AnonymousClass6G9 r0;
        0sL r1;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() == map.size()) {
                if (map instanceof AnonymousClass6G6) {
                    r2 = this.A00;
                    r0 = ((AnonymousClass6G6) obj).A02.A00;
                    r1 = Y6Y.A00;
                } else if (map instanceof C21085XDy) {
                    r2 = this.A00;
                    r0 = ((C21085XDy) obj).A03.A04;
                    r1 = Y6Z.A00;
                } else if (map instanceof AnonymousClass6G8) {
                    r2 = this.A00;
                    r0 = ((AnonymousClass6G8) obj).A00;
                    r1 = B04.A00;
                } else if (!(map instanceof C21084XDx)) {
                    return AnonymousClass6G8.super.equals(obj);
                } else {
                    r2 = this.A00;
                    r0 = ((C21084XDx) obj).A04;
                    r1 = B05.A00;
                }
                return r2.A0G(r1, r0);
            }
        }
        return false;
    }

    public final Object get(Object obj) {
        int i;
        AnonymousClass6G9 r2 = this.A00;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return r2.A09(i, obj, 0);
    }
}
