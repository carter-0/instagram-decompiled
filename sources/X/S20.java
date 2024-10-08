package X;

public final class S20 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Class A01;
    public final /* synthetic */ Object A02;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r7.getClass() != r2) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r5 = 1
            if (r7 == r6) goto L_0x0037
            java.lang.Class r2 = r6.A01
            java.util.Iterator r0 = X.C269574fL.A00
            if (r7 == 0) goto L_0x0010
            java.lang.Class r1 = r7.getClass()
            r0 = 1
            if (r1 == r2) goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            r4 = 0
            if (r0 == 0) goto L_0x0033
            int r0 = java.lang.reflect.Array.getLength(r7)
            int r3 = r6.A00
            if (r0 != r3) goto L_0x0033
            r2 = 0
        L_0x001d:
            if (r2 >= r3) goto L_0x0037
            java.lang.Object r0 = r6.A02
            java.lang.Object r1 = java.lang.reflect.Array.get(r0, r2)
            java.lang.Object r0 = java.lang.reflect.Array.get(r7, r2)
            if (r1 == r0) goto L_0x0034
            if (r1 == 0) goto L_0x0034
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0034
        L_0x0033:
            return r4
        L_0x0034:
            int r2 = r2 + 1
            goto L_0x001d
        L_0x0037:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S20.equals(java.lang.Object):boolean");
    }

    public S20(Class cls, Object obj, int i) {
        this.A01 = cls;
        this.A00 = i;
        this.A02 = obj;
    }
}
