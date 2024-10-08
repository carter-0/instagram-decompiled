package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.Y3t  reason: case insensitive filesystem */
public abstract class C22437Y3t implements Iterator, C62650uo {
    public int A00;
    public boolean A01 = true;
    public final C22430Y3m[] A02;

    public C22437Y3t(AnonymousClass6G9 r5, C22430Y3m[] y3mArr) {
        0qQ.A0B(r5, 1);
        this.A02 = y3mArr;
        C22430Y3m y3m = y3mArr[0];
        y3m.A02 = r5.A02;
        y3m.A00 = Integer.bitCount(r5.A00) * 2;
        y3m.A01 = 0;
        this.A00 = 0;
        A01();
    }

    private final int A00(int i) {
        C22430Y3m y3m;
        Object[] objArr;
        int bitCount;
        C22430Y3m[] y3mArr = this.A02;
        C22430Y3m y3m2 = y3mArr[i];
        int i2 = y3m2.A01;
        if (i2 < y3m2.A00) {
            return i;
        }
        Object[] objArr2 = y3m2.A02;
        if (i2 >= objArr2.length) {
            return -1;
        }
        Object obj = objArr2[i2];
        0qQ.A0C(obj, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        AnonymousClass6G9 r1 = (AnonymousClass6G9) obj;
        if (i == 6) {
            y3m = y3mArr[7];
            objArr = r1.A02;
            bitCount = objArr.length;
        } else {
            y3m = y3mArr[i + 1];
            objArr = r1.A02;
            bitCount = Integer.bitCount(r1.A00) * 2;
        }
        y3m.A02 = objArr;
        y3m.A00 = bitCount;
        y3m.A01 = 0;
        return A00(i + 1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0039 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A01() {
        /*
            r7 = this;
            X.Y3m[] r5 = r7.A02
            int r4 = r7.A00
            r0 = r5[r4]
            int r1 = r0.A01
            int r0 = r0.A00
            if (r1 >= r0) goto L_0x000d
            return
        L_0x000d:
            r3 = 0
            r6 = -1
            if (r6 >= r4) goto L_0x0048
            int r0 = r7.A00(r4)
            if (r0 != r6) goto L_0x0028
            r2 = r5[r4]
            int r1 = r2.A01
            java.lang.Object[] r0 = r2.A02
            int r0 = r0.length
            if (r1 >= r0) goto L_0x002d
            int r0 = r1 + 1
            r2.A01 = r0
            int r0 = r7.A00(r4)
        L_0x0028:
            if (r0 == r6) goto L_0x002d
            r7.A00 = r0
            return
        L_0x002d:
            if (r4 <= 0) goto L_0x0039
            int r0 = r4 + -1
            r1 = r5[r0]
            int r0 = r1.A01
            int r0 = r0 + 1
            r1.A01 = r0
        L_0x0039:
            r1 = r5[r4]
            X.6G9 r0 = X.AnonymousClass6G9.A04
            java.lang.Object[] r0 = r0.A02
            r1.A02 = r0
            r1.A00 = r3
            r1.A01 = r3
            int r4 = r4 + -1
            goto L_0x000d
        L_0x0048:
            r7.A01 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22437Y3t.A01():void");
    }

    public final void remove() {
        C21084XDx xDx;
        if (this instanceof Y74) {
            Y74 y74 = (Y74) this;
            if (y74.A02) {
                if (y74.hasNext()) {
                    Object A022 = y74.A02();
                    xDx = y74.A03;
                    C66580MXl.A1S(xDx, y74.A01);
                    Y74.A00(A022, y74, xDx.A04, C51971G9r.A0E(A022), 0);
                } else {
                    xDx = y74.A03;
                    C66580MXl.A1S(xDx, y74.A01);
                }
                y74.A01 = null;
                y74.A02 = false;
                y74.A00 = xDx.A00;
                return;
            }
            throw Pxe.A0i();
        }
        throw Pxh.A0s();
    }

    public final Object A02() {
        if (hasNext()) {
            C22430Y3m y3m = this.A02[this.A00];
            return y3m.A02[y3m.A01];
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return this.A01;
    }

    public Object next() {
        if (hasNext()) {
            Object next = this.A02[this.A00].next();
            A01();
            return next;
        }
        throw new NoSuchElementException();
    }
}
