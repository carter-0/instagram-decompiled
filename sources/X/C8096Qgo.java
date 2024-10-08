package X;

/* renamed from: X.Qgo  reason: case insensitive filesystem */
public final class C8096Qgo extends C11345SOd {
    public final C8091Qgj A00;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        if (r6.A00.A00.size() != ((X.C8096Qgo) r7).A00.A00.size()) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A04(X.C11345SOd r7) {
        /*
            r6 = this;
            boolean r1 = r7 instanceof X.C8096Qgo
            r0 = 0
            if (r1 != 0) goto L_0x0006
            return r0
        L_0x0006:
            boolean r0 = super.A04(r7)
            if (r0 == 0) goto L_0x0022
            X.Qgj r0 = r6.A00
            java.util.List r0 = r0.A00
            int r1 = r0.size()
            r0 = r7
            X.Qgo r0 = (X.C8096Qgo) r0
            X.Qgj r0 = r0.A00
            java.util.List r0 = r0.A00
            int r0 = r0.size()
            r5 = 1
            if (r1 == r0) goto L_0x0023
        L_0x0022:
            r5 = 0
        L_0x0023:
            X.Qgj r0 = r6.A00
            java.util.List r0 = r0.A00
            java.util.Iterator r4 = r0.iterator()
            r3 = 0
        L_0x002c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x005d
            java.lang.Object r2 = r4.next()
            int r1 = r3 + 1
            if (r3 >= 0) goto L_0x0042
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0042:
            X.SOd r2 = (X.C11345SOd) r2
            if (r5 == 0) goto L_0x005a
            r0 = r7
            X.Qgo r0 = (X.C8096Qgo) r0
            X.Qgj r0 = r0.A00
            java.util.List r0 = r0.A00
            java.lang.Object r0 = r0.get(r3)
            X.SOd r0 = (X.C11345SOd) r0
            boolean r0 = r2.A04(r0)
            r5 = 1
            if (r0 != 0) goto L_0x005b
        L_0x005a:
            r5 = 0
        L_0x005b:
            r3 = r1
            goto L_0x002c
        L_0x005d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8096Qgo.A04(X.SOd):boolean");
    }

    public C8096Qgo(C8091Qgj qgj) {
        super(qgj);
        this.A00 = qgj;
    }
}
