package X;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: X.WzA  reason: case insensitive filesystem */
public final class C20798WzA extends AnonymousClass6BX implements ListIterator, AnonymousClass0s4 {
    public int A00;
    public int A01 = -1;
    public C14132TqR A02;
    public final C14133TqS A03;

    private final void A00() {
        if (this.A00 != this.A03.A0O()) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.AbstractCollection, X.TqS] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A01() {
        /*
            r8 = this;
            X.TqS r1 = r8.A03
            java.lang.Object[] r7 = r1.A03
            if (r7 != 0) goto L_0x000a
            r0 = 0
        L_0x0007:
            r8.A02 = r0
            return
        L_0x000a:
            int r0 = X.Pxe.A0A(r1)
            r6 = r0 & -32
            int r5 = r8.A00
            if (r5 <= r6) goto L_0x0015
            r5 = r6
        L_0x0015:
            int r0 = r1.A00
            int r0 = r0 / 5
            int r1 = r0 + 1
            X.TqR r4 = r8.A02
            if (r4 != 0) goto L_0x0025
            X.TqR r0 = new X.TqR
            r0.<init>(r7, r5, r6, r1)
            goto L_0x0007
        L_0x0025:
            r3 = 0
            r4.A00 = r5
            r4.A01 = r6
            r4.A00 = r1
            java.lang.Object[] r2 = r4.A02
            int r0 = r2.length
            if (r0 >= r1) goto L_0x0035
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r4.A02 = r2
        L_0x0035:
            r1 = 0
            r2[r3] = r7
            r0 = 1
            if (r5 != r6) goto L_0x003c
            r1 = 1
        L_0x003c:
            r4.A01 = r1
            int r5 = r5 - r1
            X.C14132TqR.A00(r4, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20798WzA.A01():void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.AbstractCollection, X.TqS] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C20798WzA(X.C14133TqS r2, int r3) {
        /*
            r1 = this;
            int r0 = r2.size()
            r1.<init>()
            r1.A00 = r3
            r1.A01 = r0
            r1.A03 = r2
            int r0 = r2.A0O()
            r1.A00 = r0
            r0 = -1
            r1.A01 = r0
            r1.A01()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20798WzA.<init>(X.TqS, int):void");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.AbstractCollection, java.util.AbstractList, X.TqS] */
    public final void add(Object obj) {
        A00();
        ? r1 = this.A03;
        r1.add(this.A00, obj);
        this.A00++;
        this.A01 = r1.size();
        this.A00 = r1.A0O();
        this.A01 = -1;
        A01();
    }

    public final Object next() {
        Object[] objArr;
        A00();
        if (hasNext()) {
            int i = this.A00;
            this.A01 = i;
            C14132TqR tqR = this.A02;
            if (tqR == null) {
                objArr = this.A03.A04;
                this.A00 = i + 1;
            } else if (tqR.hasNext()) {
                this.A00 = i + 1;
                return tqR.next();
            } else {
                objArr = this.A03.A04;
                this.A00 = i + 1;
                i -= tqR.A01;
            }
            return objArr[i];
        }
        throw new NoSuchElementException();
    }

    public final Object previous() {
        Object[] objArr;
        A00();
        if (hasPrevious()) {
            int i = this.A00;
            int i2 = i - 1;
            this.A01 = i2;
            C14132TqR tqR = this.A02;
            if (tqR == null) {
                objArr = this.A03.A04;
                this.A00 = i2;
            } else {
                int i3 = tqR.A01;
                if (i > i3) {
                    objArr = this.A03.A04;
                    this.A00 = i2;
                    i2 -= i3;
                } else {
                    this.A00 = i2;
                    return tqR.previous();
                }
            }
            return objArr[i2];
        }
        throw new NoSuchElementException();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.AbstractCollection, java.util.AbstractList, X.TqS] */
    public final void remove() {
        A00();
        int i = this.A01;
        if (i != -1) {
            ? r2 = this.A03;
            r2.remove(i);
            int i2 = this.A01;
            if (i2 < this.A00) {
                this.A00 = i2;
            }
            this.A01 = r2.size();
            this.A00 = r2.A0O();
            this.A01 = -1;
            A01();
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.AbstractList, X.TqS] */
    public final void set(Object obj) {
        A00();
        int i = this.A01;
        if (i != -1) {
            ? r0 = this.A03;
            r0.set(i, obj);
            this.A00 = r0.A0O();
            A01();
            return;
        }
        throw new IllegalStateException();
    }
}
