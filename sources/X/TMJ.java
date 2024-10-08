package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

public abstract class TMJ implements Iterator {
    public int A00;
    public int A01;
    public int A02;
    public final /* synthetic */ TS6 A03;

    public /* synthetic */ TMJ(TS6 ts6) {
        this.A03 = ts6;
        this.A00 = ts6.A00;
        this.A01 = ts6.isEmpty() ? -1 : 0;
        this.A02 = -1;
    }

    public final boolean hasNext() {
        return Pxf.A1R(this.A01);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object next() {
        /*
            r5 = this;
            X.TS6 r4 = r5.A03
            int r1 = r4.A00
            int r0 = r5.A00
            if (r1 != r0) goto L_0x0048
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0043
            int r3 = r5.A01
            r5.A02 = r3
            r1 = r5
            boolean r0 = r5 instanceof X.C8531QwV
            if (r0 == 0) goto L_0x002e
            X.QwV r1 = (X.C8531QwV) r1
            X.TS6 r0 = r1.A00
            java.lang.Object[] r0 = r0.A05
        L_0x001d:
            r0.getClass()
            r2 = r0[r3]
        L_0x0022:
            int r0 = r5.A01
            int r1 = r0 + 1
            int r0 = r4.A01
            if (r1 < r0) goto L_0x002b
            r1 = -1
        L_0x002b:
            r5.A01 = r1
            return r2
        L_0x002e:
            boolean r0 = r5 instanceof X.C8530QwU
            if (r0 == 0) goto L_0x003c
            X.QwU r1 = (X.C8530QwU) r1
            X.TS6 r0 = r1.A00
            X.QwQ r2 = new X.QwQ
            r2.<init>(r0, r3)
            goto L_0x0022
        L_0x003c:
            X.QwT r1 = (X.C8529QwT) r1
            X.TS6 r0 = r1.A00
            java.lang.Object[] r0 = r0.A04
            goto L_0x001d
        L_0x0043:
            java.util.NoSuchElementException r0 = X.Pxe.A1C()
            throw r0
        L_0x0048:
            java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TMJ.next():java.lang.Object");
    }

    public final void remove() {
        TS6 ts6 = this.A03;
        int i = ts6.A00;
        int i2 = this.A00;
        if (i == i2) {
            int i3 = this.A02;
            if (Pxf.A1R(i3)) {
                this.A00 = i2 + 32;
                Object[] objArr = ts6.A04;
                objArr.getClass();
                ts6.remove(objArr[i3]);
                this.A01--;
                this.A02 = -1;
                return;
            }
            throw AnonymousClass7TE.A0z("no calls to next() since the last call to remove()");
        }
        throw new ConcurrentModificationException();
    }
}
