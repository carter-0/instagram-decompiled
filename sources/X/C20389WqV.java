package X;

import java.util.ListIterator;

/* renamed from: X.WqV  reason: case insensitive filesystem */
public abstract class C20389WqV implements ListIterator, C62650uo {
    public int A00;
    public int A01;

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.AbstractCollection, X.WvB, java.util.AbstractList] */
    public final void add(Object obj) {
        if (this instanceof C14739U6d) {
            C14739U6d u6d = (C14739U6d) this;
            C14739U6d.A00(u6d);
            ? r1 = u6d.A03;
            r1.add(u6d.A00, obj);
            u6d.A00++;
            u6d.A01 = r1.size();
            u6d.A00 = r1.A0O();
            u6d.A01 = -1;
            C14739U6d.A01(u6d);
            return;
        }
        throw Pxh.A0s();
    }

    public final boolean hasNext() {
        return AnonymousClass7TF.A1T(this.A00, this.A01);
    }

    public final boolean hasPrevious() {
        return AnonymousClass7TF.A1R(this.A00);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: X.U6b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: X.U6d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: X.U6b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: X.U6b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object next() {
        /*
            r6 = this;
            boolean r0 = r6 instanceof X.C14738U6c
            if (r0 == 0) goto L_0x0050
            r5 = r6
            X.U6c r5 = (X.C14738U6c) r5
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x004a
            int r0 = r5.A00
            r2 = r0 & 31
            java.lang.Object[] r1 = r5.A02
            int r0 = r5.A00
            int r0 = r0 + -1
            r1 = r1[r0]
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>"
            X.0qQ.A0C(r1, r0)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r4 = r1[r2]
            int r0 = r5.A00
            r1 = 1
            int r3 = r0 + 1
            r5.A00 = r3
            int r0 = r5.A01
            if (r3 != r0) goto L_0x0030
            r5.A01 = r1
        L_0x002f:
            return r4
        L_0x0030:
            r1 = 0
            r2 = 0
        L_0x0032:
            int r0 = r3 >> r2
            r0 = r0 & 31
            if (r0 != r1) goto L_0x003b
            int r2 = r2 + 5
            goto L_0x0032
        L_0x003b:
            if (r2 <= 0) goto L_0x002f
            int r0 = r5.A00
            int r1 = r0 + -1
            int r0 = r2 / 5
            int r1 = r1 - r0
            int r0 = r1 + 1
            X.C14738U6c.A00(r5, r3, r0)
            return r4
        L_0x004a:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x0050:
            boolean r0 = r6 instanceof X.U6a
            if (r0 == 0) goto L_0x006c
            r1 = r6
            X.U6a r1 = (X.U6a) r1
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0066
            int r0 = r1.A00
            int r0 = r0 + 1
            r1.A00 = r0
            java.lang.Object r4 = r1.A00
            return r4
        L_0x0066:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x006c:
            boolean r0 = r6 instanceof X.C14739U6d
            if (r0 == 0) goto L_0x00a4
            r4 = r6
            X.U6d r4 = (X.C14739U6d) r4
            X.C14739U6d.A00(r4)
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x009e
            int r3 = r4.A00
            r4.A01 = r3
            X.U6c r2 = r4.A02
            if (r2 != 0) goto L_0x008f
            X.WvB r0 = r4.A03
            java.lang.Object[] r1 = r0.A04
            int r0 = r3 + 1
            r4.A00 = r0
            r4 = r1[r3]
            return r4
        L_0x008f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00c9
            int r0 = r3 + 1
            r4.A00 = r0
            java.lang.Object r4 = r2.next()
            return r4
        L_0x009e:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x00a4:
            boolean r0 = r6 instanceof X.C14737U6b
            if (r0 == 0) goto L_0x00dd
            r4 = r6
            X.U6b r4 = (X.C14737U6b) r4
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00d7
            X.U6c r2 = r4.A00
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00c4
            int r0 = r4.A00
            int r0 = r0 + 1
            r4.A00 = r0
            java.lang.Object r4 = r2.next()
            return r4
        L_0x00c4:
            java.lang.Object[] r1 = r4.A01
            int r3 = r4.A00
            goto L_0x00cd
        L_0x00c9:
            X.WvB r0 = r4.A03
            java.lang.Object[] r1 = r0.A04
        L_0x00cd:
            int r0 = r3 + 1
            r4.A00 = r0
            int r0 = r2.A01
            int r3 = r3 - r0
            r4 = r1[r3]
            return r4
        L_0x00d7:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x00dd:
            r3 = r6
            X.U6Z r3 = (X.U6Z) r3
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00f1
            java.lang.Object[] r2 = r3.A00
            int r1 = r3.A00
            int r0 = r1 + 1
            r3.A00 = r0
            r4 = r2[r1]
            return r4
        L_0x00f1:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20389WqV.next():java.lang.Object");
    }

    public final int nextIndex() {
        return this.A00;
    }

    public final int previousIndex() {
        return this.A00 - 1;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.AbstractCollection, X.WvB, java.util.AbstractList] */
    public final void remove() {
        if (this instanceof C14739U6d) {
            C14739U6d u6d = (C14739U6d) this;
            C14739U6d.A00(u6d);
            int i = u6d.A01;
            if (i != -1) {
                ? r2 = u6d.A03;
                r2.remove(i);
                int i2 = u6d.A01;
                if (i2 < u6d.A00) {
                    u6d.A00 = i2;
                }
                u6d.A01 = r2.size();
                u6d.A00 = r2.A0O();
                u6d.A01 = -1;
                C14739U6d.A01(u6d);
                return;
            }
            throw new IllegalStateException();
        }
        throw Pxh.A0s();
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.WvB, java.util.AbstractList] */
    public final void set(Object obj) {
        if (this instanceof C14739U6d) {
            C14739U6d u6d = (C14739U6d) this;
            C14739U6d.A00(u6d);
            int i = u6d.A01;
            if (i != -1) {
                ? r0 = u6d.A03;
                r0.set(i, obj);
                u6d.A00 = r0.A0O();
                C14739U6d.A01(u6d);
                return;
            }
            throw new IllegalStateException();
        }
        throw Pxh.A0s();
    }
}
