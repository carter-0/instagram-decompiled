package X;

public final class TPH implements AnonymousClass0eL, C62320sa {
    public final int A00;
    public final Object A01;

    public TPH(STY sty, int i) {
        this.A00 = i;
        switch (i) {
            case 1:
            case 2:
            case 3:
                this.A01 = sty;
                return;
            default:
                this.A01 = sty;
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0071, code lost:
        r2.A06(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0075, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        return java.lang.Boolean.valueOf(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r4 = this;
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x0019;
                case 1: goto L_0x0027;
                case 2: goto L_0x0050;
                case 3: goto L_0x0061;
                case 4: goto L_0x0034;
                case 5: goto L_0x0042;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r4.A01
            com.facebook.browser.lite.extensions.autofill.instagram.AutofillController$5 r0 = (com.facebook.browser.lite.extensions.autofill.instagram.AutofillController$5) r0
            X.QKv r0 = r0.A01
            X.4gR r0 = r0.A0b
            X.1yd r1 = r0.A04
            r0 = 1
            boolean r0 = r1.A0F(r0)
        L_0x0014:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
        L_0x0018:
            return r3
        L_0x0019:
            java.lang.Object r0 = r4.A01
            X.QKv r0 = (X.C7580QKv) r0
            X.4gR r0 = r0.A0b
            X.1yd r1 = r0.A04
            r0 = 1
            boolean r0 = r1.A0G(r0)
            goto L_0x0014
        L_0x0027:
            java.lang.Object r1 = r4.A01
            X.STY r1 = (X.STY) r1
            X.QLA r0 = r1.A07
            r3 = 0
            if (r0 == 0) goto L_0x0018
            r1.A0B(r3, r0)
            return r3
        L_0x0034:
            java.lang.Object r0 = r4.A01
            X.STY r0 = (X.STY) r0
            X.4gR r0 = r0.A0T
            X.1yd r1 = r0.A04
            r0 = 1
            boolean r0 = r1.A0I(r0)
            goto L_0x0014
        L_0x0042:
            java.lang.Object r0 = r4.A01
            X.STY r0 = (X.STY) r0
            X.4gR r0 = r0.A0T
            X.1yd r1 = r0.A04
            r0 = 1
            boolean r0 = r1.A0H(r0)
            goto L_0x0014
        L_0x0050:
            java.lang.Object r1 = r4.A01
            X.STY r1 = (X.STY) r1
            X.4gR r0 = r1.A0T
            X.SJq r2 = r0.A01
            X.QKv r0 = r1.A04
            android.os.Bundle r1 = r0.A02()
            java.lang.String r0 = "PASSKEY_ASSERTION_NO_PASSKEY"
            goto L_0x0071
        L_0x0061:
            java.lang.Object r1 = r4.A01
            X.STY r1 = (X.STY) r1
            X.4gR r0 = r1.A0T
            X.SJq r2 = r0.A01
            X.QKv r0 = r1.A04
            android.os.Bundle r1 = r0.A02()
            java.lang.String r0 = "SUCCEEDED_PASSKEY_VERIFICATION"
        L_0x0071:
            r3 = 0
            r2.A06(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TPH.invoke():java.lang.Object");
    }

    public TPH(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
