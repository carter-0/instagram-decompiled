package X;

import android.util.SparseIntArray;

/* renamed from: X.6sz  reason: invalid class name and case insensitive filesystem */
public abstract class C320806sz {
    public boolean A00 = false;
    public final SparseIntArray A01 = new SparseIntArray();
    public final SparseIntArray A02 = new SparseIntArray();

    public final int A02(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        int A002 = A00(i);
        for (int i5 = 0; i5 < i; i5++) {
            int A003 = A00(i5);
            i4 += A003;
            if (i4 == i2) {
                i3++;
                i4 = 0;
            } else if (i4 > i2) {
                i3++;
                i4 = A003;
            }
        }
        if (i4 + A002 > i2) {
            return i3 + 1;
        }
        return i3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005d A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A01(int r8, int r9) {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.C320796sy
            if (r0 == 0) goto L_0x0007
            int r1 = r8 % r9
            return r1
        L_0x0007:
            int r4 = r7.A00(r8)
            r6 = 0
            if (r4 == r9) goto L_0x005e
            boolean r0 = r7.A00
            if (r0 == 0) goto L_0x002d
            android.util.SparseIntArray r5 = r7.A02
            int r0 = r5.size()
            int r0 = r0 + -1
            r1 = 0
        L_0x001b:
            if (r1 > r0) goto L_0x0030
            int r2 = r1 + r0
            int r3 = r2 >>> 1
            int r2 = r5.keyAt(r3)
            if (r2 >= r8) goto L_0x002a
            int r1 = r3 + 1
            goto L_0x001b
        L_0x002a:
            int r0 = r3 + -1
            goto L_0x001b
        L_0x002d:
            r2 = 0
            r1 = 0
            goto L_0x004b
        L_0x0030:
            int r1 = r1 + -1
            if (r1 < 0) goto L_0x002d
            int r0 = r5.size()
            if (r1 >= r0) goto L_0x002d
            int r2 = r5.keyAt(r1)
            if (r2 < 0) goto L_0x002d
            int r1 = r5.get(r2)
            int r0 = r7.A00(r2)
            int r1 = r1 + r0
        L_0x0049:
            int r2 = r2 + 1
        L_0x004b:
            if (r2 >= r8) goto L_0x005a
            int r0 = r7.A00(r2)
            int r1 = r1 + r0
            if (r1 != r9) goto L_0x0056
            r1 = 0
            goto L_0x0049
        L_0x0056:
            if (r1 <= r9) goto L_0x0049
            r1 = r0
            goto L_0x0049
        L_0x005a:
            int r4 = r4 + r1
            if (r4 > r9) goto L_0x005e
            return r1
        L_0x005e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C320806sz.A01(int, int):int");
    }

    public int A00(int i) {
        return 1;
    }
}
