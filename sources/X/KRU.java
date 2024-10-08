package X;

public final class KRU extends L4W {
    public final C43742C7m A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public KRU(X.C43742C7m r10) {
        /*
            r9 = this;
            r3 = 1
            r6 = 3
            X.C7l r2 = r10.A0E()
            r0 = 0
            if (r2 == 0) goto L_0x0053
            java.lang.String r1 = "sku"
            java.lang.String r8 = r2.getOptionalStringField(r3, r1)
        L_0x000f:
            X.C7l r2 = r10.A0E()
            if (r2 == 0) goto L_0x0051
            java.lang.String r1 = "purchased_sku"
            java.lang.String r7 = r2.A09(r1)
        L_0x001b:
            X.C7l r5 = r10.A0E()
            if (r5 == 0) goto L_0x004f
            java.lang.Class<X.Bk0> r4 = X.Bk0.class
            r3 = 7
            java.lang.String r2 = "early_pricing"
            r1 = 212732223(0xcae093f, float:2.681451E-31)
            X.3lr r2 = r5.getOptionalTreeField(r3, r2, r4, r1)
            if (r2 == 0) goto L_0x004f
            java.lang.String r1 = "original_sku"
            java.lang.String r1 = r2.A07(r1)
        L_0x0035:
            java.lang.String[] r1 = new java.lang.String[]{r8, r7, r1}
            java.util.Set r2 = X.C63262Ku7.A00(r1)
            X.C7l r1 = r10.A0E()
            if (r1 == 0) goto L_0x0049
            java.lang.String r0 = "tier_id"
            java.lang.String r0 = r1.getOptionalStringField(r6, r0)
        L_0x0049:
            r9.<init>(r0, r2)
            r9.A00 = r10
            return
        L_0x004f:
            r1 = r0
            goto L_0x0035
        L_0x0051:
            r7 = r0
            goto L_0x001b
        L_0x0053:
            r8 = r0
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KRU.<init>(X.C7m):void");
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof KRU) && 0qQ.A0K(this.A00, ((KRU) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
