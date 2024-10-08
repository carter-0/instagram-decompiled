package X;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class Pxo implements Iterable {
    public int A00 = 0;
    public Pxv A01;
    public Pxv A02;
    public final WeakHashMap A03 = new WeakHashMap();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Pxo) {
            Pxo pxo = (Pxo) obj;
            if (this.A00 == pxo.A00) {
                Iterator it = iterator();
                Iterator it2 = pxo.iterator();
                while (it.hasNext() && it2.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(it);
                    Object next = it2.next();
                    if (A1J == null) {
                        if (next == null) {
                        }
                    } else if (!A1J.equals(next)) {
                        return false;
                    }
                }
                return !it.hasNext() && !it2.hasNext();
            }
        }
        return false;
    }

    public final int A00() {
        return this.A00;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.2Ww, X.3Q0, java.lang.Object] */
    public final AnonymousClass3Q0 A01() {
        Pxv pxv = this.A01;
        Pxv pxv2 = this.A02;
        ? obj = new Object();
        obj.A00 = pxv2;
        obj.A01 = pxv;
        this.A03.put(obj, false);
        return obj;
    }

    public final Pxv A02() {
        return this.A02;
    }

    public final Pxv A03() {
        return this.A01;
    }

    public Pxv A04(Object obj) {
        Pxv pxv = this.A02;
        while (pxv != null && !pxv.A02.equals(obj)) {
            pxv = pxv.A00;
        }
        return pxv;
    }

    public final 11n A05() {
        11n r2 = new 11n(this);
        this.A03.put(r2, false);
        return r2;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.2Ww, java.util.Iterator, java.lang.Object] */
    public final Iterator iterator() {
        Pxv pxv = this.A02;
        Pxv pxv2 = this.A01;
        ? obj = new Object();
        obj.A00 = pxv2;
        obj.A01 = pxv;
        this.A03.put(obj, false);
        return obj;
    }

    public Object A06(Object obj) {
        Pxv A04 = A04(obj);
        if (A04 == null) {
            return null;
        }
        this.A00--;
        WeakHashMap weakHashMap = this.A03;
        if (!weakHashMap.isEmpty()) {
            for (C634011o A002 : weakHashMap.keySet()) {
                A002.A00(A04);
            }
        }
        Pxv pxv = A04.A01;
        Pxv pxv2 = A04.A00;
        if (pxv != null) {
            pxv.A00 = pxv2;
        } else {
            this.A02 = pxv2;
        }
        Pxv pxv3 = A04.A00;
        if (pxv3 != null) {
            pxv3.A01 = pxv;
        } else {
            this.A01 = pxv;
        }
        A04.A00 = null;
        A04.A01 = null;
        return A04.A03;
    }

    public Object A07(Object obj, Object obj2) {
        Pxv A04 = A04(obj);
        if (A04 != null) {
            return A04.A03;
        }
        Pxv pxv = new Pxv(obj, obj2);
        this.A00++;
        Pxv pxv2 = this.A01;
        if (pxv2 == null) {
            this.A02 = pxv;
        } else {
            pxv2.A00 = pxv;
            pxv.A01 = pxv2;
        }
        this.A01 = pxv;
        return null;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += AnonymousClass7TE.A1J(it).hashCode();
        }
        return i;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        Pxh.A1P(A1A);
        Iterator it = iterator();
        while (it.hasNext()) {
            Pxf.A1O(A1A, it.next());
            if (it.hasNext()) {
                Pxe.A1Y(A1A);
            }
        }
        return AnonymousClass7TF.A0l("]", A1A);
    }
}
