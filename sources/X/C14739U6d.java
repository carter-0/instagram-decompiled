package X;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: X.U6d  reason: case insensitive filesystem */
public final class C14739U6d extends C20389WqV implements ListIterator, AnonymousClass0s4 {
    public int A00;
    public int A01 = -1;
    public C14738U6c A02;
    public final C20583WvB A03;

    public static final void A00(C14739U6d u6d) {
        if (u6d.A00 != u6d.A03.A0O()) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.AbstractCollection, X.WvB] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C14739U6d r7) {
        /*
            X.WvB r1 = r7.A03
            java.lang.Object[] r6 = r1.A03
            if (r6 != 0) goto L_0x000a
            r0 = 0
        L_0x0007:
            r7.A02 = r0
            return
        L_0x000a:
            int r0 = X.Pxe.A0A(r1)
            r5 = r0 & -32
            int r4 = r7.A00
            if (r4 <= r5) goto L_0x0015
            r4 = r5
        L_0x0015:
            int r0 = r1.A00
            int r0 = r0 / 5
            int r1 = r0 + 1
            X.U6c r3 = r7.A02
            if (r3 != 0) goto L_0x0025
            X.U6c r0 = new X.U6c
            r0.<init>(r6, r4, r5, r1)
            goto L_0x0007
        L_0x0025:
            r3.A00 = r4
            r3.A01 = r5
            r3.A00 = r1
            java.lang.Object[] r2 = r3.A02
            int r0 = r2.length
            if (r0 >= r1) goto L_0x0034
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3.A02 = r2
        L_0x0034:
            r1 = 0
            r2[r1] = r6
            r0 = 1
            if (r4 != r5) goto L_0x003b
            r1 = 1
        L_0x003b:
            r3.A01 = r1
            int r4 = r4 - r1
            X.C14738U6c.A00(r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14739U6d.A01(X.U6d):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.AbstractCollection, X.WvB] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C14739U6d(X.C20583WvB r2, int r3) {
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
            A01(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14739U6d.<init>(X.WvB, int):void");
    }

    public final Object previous() {
        Object[] objArr;
        A00(this);
        if (hasPrevious()) {
            int i = this.A00;
            int i2 = i - 1;
            this.A01 = i2;
            C14738U6c u6c = this.A02;
            if (u6c == null) {
                objArr = this.A03.A04;
                this.A00 = i2;
            } else {
                int i3 = u6c.A01;
                if (i > i3) {
                    objArr = this.A03.A04;
                    this.A00 = i2;
                    i2 -= i3;
                } else {
                    this.A00 = i2;
                    return u6c.previous();
                }
            }
            return objArr[i2];
        }
        throw new NoSuchElementException();
    }
}
