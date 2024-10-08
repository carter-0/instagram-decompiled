package X;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: X.XDy  reason: case insensitive filesystem */
public final class C21085XDy<K, V> extends 0Yy<K, V> implements YCP<K, V> {
    public Object A00;
    public Object A01;
    public AnonymousClass6G6 A02;
    public final C21084XDx A03;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.AbstractMap, X.XDx] */
    public final int A00() {
        return this.A03.size();
    }

    public final Collection A01() {
        return new Y62(this);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Set, X.Y6w] */
    public final Set A02() {
        return new C22503Y6w(this);
    }

    public final Set A03() {
        return new Y67(this);
    }

    public final C304526Du AEL() {
        AnonymousClass6G8 A04 = this.A03.AEL();
        AnonymousClass6G6 r2 = this.A02;
        if (A04 != r2.A02) {
            r2 = new AnonymousClass6G6(this.A00, this.A01, A04);
        }
        this.A02 = r2;
        return r2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.AbstractMap, X.XDx] */
    public final void clear() {
        this.A03.clear();
        AnonymousClass6G7 r0 = AnonymousClass6G7.A00;
        this.A00 = r0;
        this.A01 = r0;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.AbstractMap, X.XDx] */
    public final boolean containsKey(Object obj) {
        return this.A03.containsKey(obj);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.util.AbstractMap, java.util.Map, X.XDy] */
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
                    r2 = this.A03.A04;
                    r1 = ((AnonymousClass6G6) obj).A02.A00;
                    r0 = C22488Y6h.A00;
                } else if (map instanceof C21085XDy) {
                    r2 = this.A03.A04;
                    r1 = ((C21085XDy) obj).A03.A04;
                    r0 = C22489Y6i.A00;
                } else if (map instanceof AnonymousClass6G8) {
                    r2 = this.A03.A04;
                    r1 = ((AnonymousClass6G8) obj).A00;
                    r0 = C22490Y6j.A00;
                } else if (!(map instanceof C21084XDx)) {
                    return C21523Xdp.A01(this, map);
                } else {
                    r2 = this.A03.A04;
                    r1 = ((C21084XDx) obj).A04;
                    r0 = C22491Y6k.A00;
                }
                return r2.A0G(r0, r1);
            }
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.AbstractMap, X.XDx] */
    public final Object get(Object obj) {
        C21086XDz xDz = (C21086XDz) this.A03.get(obj);
        if (xDz != null) {
            return xDz.A02;
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.util.AbstractMap, X.XDx] */
    public final Object put(Object obj, Object obj2) {
        Object obj3;
        C21086XDz xDz;
        ? r5 = this.A03;
        C21086XDz xDz2 = (C21086XDz) r5.get(obj);
        if (xDz2 != null) {
            obj3 = xDz2.A02;
            if (obj3 == obj2) {
                return obj2;
            }
            xDz = new C21086XDz(obj2, xDz2.A01, xDz2.A00);
        } else {
            obj3 = null;
            if (isEmpty()) {
                this.A00 = obj;
                this.A01 = obj;
                AnonymousClass6G7 r0 = AnonymousClass6G7.A00;
                xDz = new C21086XDz(obj2, r0, r0);
            } else {
                Object obj4 = this.A01;
                Object obj5 = r5.get(obj4);
                0qQ.A0A(obj5);
                C21086XDz xDz3 = (C21086XDz) obj5;
                r5.put(obj4, new C21086XDz(xDz3.A02, xDz3.A01, obj));
                r5.put(obj, new C21086XDz(obj2, obj4, AnonymousClass6G7.A00));
                this.A01 = obj;
                return null;
            }
        }
        r5.put(obj, xDz);
        return obj3;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [java.util.AbstractMap, X.XDx] */
    public final Object remove(Object obj) {
        Object obj2;
        ? r7 = this.A03;
        C21086XDz xDz = (C21086XDz) r7.remove(obj);
        if (xDz == null) {
            return null;
        }
        Object obj3 = xDz.A01;
        Object obj4 = AnonymousClass6G7.A00;
        if (obj3 != obj4) {
            Object obj5 = r7.get(obj3);
            0qQ.A0A(obj5);
            C21086XDz xDz2 = (C21086XDz) obj5;
            obj2 = xDz.A00;
            r7.put(obj3, new C21086XDz(xDz2.A02, xDz2.A01, obj2));
        } else {
            obj2 = xDz.A00;
            this.A00 = obj2;
        }
        if (obj2 != obj4) {
            Object obj6 = r7.get(obj2);
            0qQ.A0A(obj6);
            C21086XDz xDz3 = (C21086XDz) obj6;
            r7.put(obj2, new C21086XDz(xDz3.A02, obj3, xDz3.A00));
        } else {
            this.A01 = obj3;
        }
        return xDz.A02;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.6GA, java.lang.Object] */
    public C21085XDy(AnonymousClass6G6 r4) {
        this.A02 = r4;
        this.A00 = r4.A00;
        this.A01 = r4.A01;
        AnonymousClass6G8 r2 = r4.A02;
        0Yy r1 = new 0Yy();
        r1.A03 = r2;
        r1.A05 = new Object();
        r1.A04 = r2.A00;
        r1.A01 = r2.size();
        this.A03 = r1;
    }

    public final int hashCode() {
        return entrySet().hashCode();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.AbstractMap, X.XDx] */
    public final boolean remove(Object obj, Object obj2) {
        C21086XDz xDz = (C21086XDz) this.A03.get(obj);
        if (xDz == null || !0qQ.A0K(xDz.A02, obj2)) {
            return false;
        }
        remove(obj);
        return true;
    }
}
