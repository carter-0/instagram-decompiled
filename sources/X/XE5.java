package X;

import java.util.Iterator;
import java.util.Set;

public final class XE5<E> extends 047<E> implements YCR<E> {
    public Object A00;
    public Object A01;
    public C21082XDv A02;
    public final C21084XDx A03;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.AbstractMap, X.XDx] */
    public final int A00() {
        return this.A03.size();
    }

    public final C21082XDv AEM() {
        AnonymousClass6G8 A04 = this.A03.AEL();
        C21082XDv xDv = this.A02;
        if (A04 != xDv.A02) {
            xDv = new C21082XDv(this.A00, this.A01, A04);
        }
        this.A02 = xDv;
        return xDv;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.util.AbstractMap, X.XDx] */
    public final boolean add(Object obj) {
        ? r4 = this.A03;
        if (r4.containsKey(obj)) {
            return false;
        }
        if (isEmpty()) {
            this.A00 = obj;
            this.A01 = obj;
            r4.put(obj, new XFI());
            return true;
        }
        Object obj2 = r4.get(this.A01);
        0qQ.A0A(obj2);
        r4.put(this.A01, new XFI(((XFI) obj2).A01, obj));
        r4.put(obj, new XFI(this.A01, AnonymousClass6G7.A00));
        this.A01 = obj;
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.AbstractMap, X.XDx] */
    public final void clear() {
        this.A03.clear();
        AnonymousClass6G7 r0 = AnonymousClass6G7.A00;
        this.A00 = r0;
        this.A01 = r0;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.AbstractMap, X.XDx] */
    public final boolean contains(Object obj) {
        return this.A03.containsKey(obj);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.util.AbstractCollection, java.util.AbstractSet, X.XE5] */
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
                    r2 = this.A03.A04;
                    r1 = ((C21082XDv) obj).A02.A00;
                    r0 = C22494Y6n.A00;
                } else if (!(set instanceof XE5)) {
                    return XE5.super.equals(obj);
                } else {
                    r2 = this.A03.A04;
                    r1 = ((XE5) obj).A03.A04;
                    r0 = C22495Y6o.A00;
                }
                return r2.A0G(r0, r1);
            }
        }
        return false;
    }

    public final Iterator iterator() {
        return new Y79(this);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.util.AbstractMap, X.XDx] */
    public final boolean remove(Object obj) {
        Object obj2;
        ? r5 = this.A03;
        XFI xfi = (XFI) r5.remove(obj);
        if (xfi == null) {
            return false;
        }
        Object obj3 = xfi.A01;
        Object obj4 = AnonymousClass6G7.A00;
        if (obj3 != obj4) {
            Object obj5 = r5.get(obj3);
            0qQ.A0A(obj5);
            obj2 = xfi.A00;
            r5.put(obj3, new XFI(((XFI) obj5).A01, obj2));
        } else {
            obj2 = xfi.A00;
            this.A00 = obj2;
        }
        if (obj2 != obj4) {
            Object obj6 = r5.get(obj2);
            0qQ.A0A(obj6);
            r5.put(obj2, new XFI(obj3, ((XFI) obj6).A00));
            return true;
        }
        this.A01 = obj3;
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.6GA, java.lang.Object] */
    public XE5(C21082XDv xDv) {
        this.A02 = xDv;
        this.A00 = xDv.A00;
        this.A01 = xDv.A01;
        AnonymousClass6G8 r2 = xDv.A02;
        0Yy r1 = new 0Yy();
        r1.A03 = r2;
        r1.A05 = new Object();
        r1.A04 = r2.A00;
        r1.A01 = r2.size();
        this.A03 = r1;
    }
}
