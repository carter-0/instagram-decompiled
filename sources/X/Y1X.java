package X;

public final class Y1X implements Iterable, C62650uo {
    public final int A00;
    public final C286505Wq A01;
    public final int A02;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        r1 = r4.A05;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Iterator iterator() {
        /*
            r5 = this;
            X.5Wq r4 = r5.A01
            int r1 = r4.A03
            int r0 = r5.A00
            if (r1 != r0) goto L_0x0046
            int r3 = r5.A02
            java.util.HashMap r2 = r4.A06
            if (r2 == 0) goto L_0x0035
            boolean r0 = r4.A07
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x001e
            java.lang.String r0 = "use active SlotWriter to crate an anchor for location instead"
            X.AnonymousClass5XN.A03(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x001e:
            if (r3 < 0) goto L_0x0035
            int r0 = r4.A00
            if (r3 >= r0) goto L_0x0035
            java.util.ArrayList r1 = r4.A05
            int r0 = X.AnonymousClass5X6.A01(r1, r3, r0)
            if (r0 < 0) goto L_0x0035
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L_0x0035
            r2.get(r0)
        L_0x0035:
            int r2 = r3 + 1
            int[] r1 = r4.A08
            int r0 = r3 * 5
            int r0 = r0 + 3
            r0 = r1[r0]
            int r3 = r3 + r0
            X.Y3r r0 = new X.Y3r
            r0.<init>(r4, r2, r3)
            return r0
        L_0x0046:
            java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y1X.iterator():java.util.Iterator");
    }

    public Y1X(C286505Wq r1, int i, int i2) {
        this.A01 = r1;
        this.A02 = i;
        this.A00 = i2;
    }
}
