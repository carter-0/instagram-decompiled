package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.5mH  reason: invalid class name and case insensitive filesystem */
public abstract class C294335mH implements Iterator, C62650uo {
    public int A00;
    public boolean A01 = true;
    public final C294305mE[] A02;

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    private final int A00(int i) {
        C294305mE r3;
        Object[] objArr;
        int bitCount;
        C294305mE[] r32 = this.A02;
        C294305mE r1 = r32[i];
        int i2 = r1.A01;
        if (i2 < r1.A00) {
            return i;
        }
        Object[] objArr2 = r1.A02;
        if (i2 >= objArr2.length) {
            return -1;
        }
        Object obj = objArr2[i2];
        0qQ.A0C(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        C285005Ph r12 = (C285005Ph) obj;
        if (i == 6) {
            r3 = r32[7];
            objArr = r12.A02;
            bitCount = objArr.length;
        } else {
            r3 = r32[i + 1];
            objArr = r12.A02;
            bitCount = Integer.bitCount(r12.A00) * 2;
        }
        r3.A02 = objArr;
        r3.A00 = bitCount;
        r3.A01 = 0;
        return A00(i + 1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0039 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A01() {
        /*
            r7 = this;
            X.5mE[] r5 = r7.A02
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
            X.5Ph r0 = X.C285005Ph.A04
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
        throw new UnsupportedOperationException("Method not decompiled: X.C294335mH.A01():void");
    }

    public final boolean hasNext() {
        return this.A01;
    }

    public C294335mH(C285005Ph r5, C294305mE[] r6) {
        this.A02 = r6;
        C294305mE r2 = r6[0];
        r2.A02 = r5.A02;
        r2.A00 = Integer.bitCount(r5.A00) * 2;
        r2.A01 = 0;
        this.A00 = 0;
        A01();
    }

    public final Object A02() {
        if (hasNext()) {
            C294305mE r0 = this.A02[this.A00];
            return r0.A02[r0.A01];
        }
        throw new NoSuchElementException();
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
