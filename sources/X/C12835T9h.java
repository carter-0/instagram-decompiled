package X;

import java.io.Serializable;

/* renamed from: X.T9h  reason: case insensitive filesystem */
public final class C12835T9h implements Serializable {
    public static final C12835T9h A02 = new C12835T9h(new int[0]);
    public final int A00;
    public final int[] A01;

    public C12835T9h(int[] iArr) {
        int length = iArr.length;
        this.A01 = iArr;
        this.A00 = length;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r8 = (X.C12835T9h) r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r6 = 1
            if (r8 == r7) goto L_0x0027
            boolean r0 = r8 instanceof X.C12835T9h
            r5 = 0
            if (r0 == 0) goto L_0x0026
            X.T9h r8 = (X.C12835T9h) r8
            int r4 = r7.A00
            int r3 = r8.A00
            if (r4 != r3) goto L_0x0026
            r2 = 0
        L_0x0011:
            if (r2 >= r4) goto L_0x0027
            X.17k.A01(r2, r4)
            int[] r0 = r7.A01
            r1 = r0[r2]
            X.17k.A01(r2, r3)
            int[] r0 = r8.A01
            r0 = r0[r2]
            if (r1 != r0) goto L_0x0026
            int r2 = r2 + 1
            goto L_0x0011
        L_0x0026:
            return r5
        L_0x0027:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12835T9h.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.A00; i2++) {
            i = (i * 31) + this.A01[i2];
        }
        return i;
    }

    public final String toString() {
        int i = this.A00;
        int i2 = 0;
        if (i == 0) {
            return "[]";
        }
        StringBuilder A14 = Pxe.A14(i * 5);
        A14.append('[');
        int[] iArr = this.A01;
        while (true) {
            A14.append(iArr[i2]);
            i2++;
            if (i2 >= i) {
                return Pxg.A0w(A14);
            }
            Pxe.A1Y(A14);
        }
    }
}
