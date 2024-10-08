package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.8eP  reason: invalid class name and case insensitive filesystem */
public final class C360328eP implements Collection<C360308eN>, C62650uo {
    public final int[] A00;

    public final /* synthetic */ int[] A00() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean containsAll(java.util.Collection r6) {
        /*
            r5 = this;
            r0 = 0
            X.0qQ.A0B(r6, r0)
            int[] r4 = r5.A00
            boolean r0 = r6.isEmpty()
            r3 = 0
            if (r0 != 0) goto L_0x002a
            java.util.Iterator r2 = r6.iterator()
        L_0x0011:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002a
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C360308eN
            if (r0 == 0) goto L_0x002b
            X.8eN r1 = (X.C360308eN) r1
            int r0 = r1.A00
            boolean r0 = X.03t.A0P(r4, r0)
            if (r0 == 0) goto L_0x002b
            goto L_0x0011
        L_0x002a:
            r3 = 1
        L_0x002b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C360328eP.containsAll(java.util.Collection):boolean");
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object[] toArray() {
        return 0q3.A00(this);
    }

    public final Object[] toArray(Object[] objArr) {
        0qQ.A0B(objArr, 0);
        return 0q3.A01(this, objArr);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C360308eN)) {
            return false;
        }
        return 03t.A0P(this.A00, ((C360308eN) obj).A00);
    }

    public final boolean equals(Object obj) {
        int[] iArr = this.A00;
        if (!(obj instanceof C360328eP) || !0qQ.A0K(iArr, ((C360328eP) obj).A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    public final boolean isEmpty() {
        if (this.A00.length == 0) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return new C41294Ara(this.A00);
    }

    public final /* bridge */ /* synthetic */ int size() {
        return this.A00.length;
    }

    public final String toString() {
        return 002.A0S("UIntArray(storage=", Arrays.toString(this.A00), ')');
    }

    public /* synthetic */ C360328eP(int[] iArr) {
        this.A00 = iArr;
    }
}
