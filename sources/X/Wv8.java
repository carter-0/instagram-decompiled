package X;

import java.util.List;

public final class Wv8<T> extends 0Yz<T> {
    public final List A00;
    public final int A01;
    public final int A02;

    public final int A08() {
        return this.A02 + this.A00.size() + this.A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        if (r5 >= r4.A02) goto L_0x0007;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get(int r5) {
        /*
            r4 = this;
            if (r5 < 0) goto L_0x0007
            int r1 = r4.A02
            r0 = 1
            if (r5 < r1) goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            r3 = 0
            if (r0 != 0) goto L_0x001d
            int r2 = r4.A02
            java.util.List r1 = r4.A00
            int r0 = r1.size()
            int r0 = r0 + r2
            if (r5 >= r0) goto L_0x001e
            if (r2 > r5) goto L_0x001e
            int r5 = r5 - r2
            java.lang.Object r3 = r1.get(r5)
        L_0x001d:
            return r3
        L_0x001e:
            int r0 = r1.size()
            int r2 = r2 + r0
            int r0 = r4.size()
            if (r5 >= r0) goto L_0x002c
            if (r2 > r5) goto L_0x002c
            return r3
        L_0x002c:
            java.lang.String r2 = "Illegal attempt to access index "
            java.lang.String r1 = " in ItemSnapshotList of size "
            int r0 = r4.size()
            java.lang.IndexOutOfBoundsException r0 = X.C51969G9p.A0p(r2, r1, r5, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Wv8.get(int):java.lang.Object");
    }

    public Wv8(List list, int i, int i2) {
        this.A02 = i;
        this.A01 = i2;
        this.A00 = list;
    }
}
