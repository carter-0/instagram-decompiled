package X;

/* renamed from: X.Pqw  reason: case insensitive filesystem */
public final class C74215Pqw extends 01C {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C74215Pqw(java.lang.Object r7, int r8) {
        /*
            r6 = this;
            r0 = r6
            r6.A00 = r8
            switch(r8) {
                case 0: goto L_0x0012;
                case 1: goto L_0x0012;
                case 2: goto L_0x0012;
                case 3: goto L_0x0019;
                case 4: goto L_0x0019;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Class<X.OP3> r1 = X.OP3.class
            java.lang.String r3 = "instance"
            java.lang.String r4 = "getInstance()Lcom/instagram/direct/deeplinking/DeeplinkPlugin;"
        L_0x000c:
            r5 = 0
            r2 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return
        L_0x0012:
            java.lang.Class<X.4gU> r1 = X.C270284gU.class
            java.lang.String r3 = "value"
            java.lang.String r4 = "getValue()Ljava/lang/Object;"
            goto L_0x000c
        L_0x0019:
            java.lang.Class<X.7Vu> r1 = X.C332637Vu.class
            java.lang.String r3 = "bannerController"
            java.lang.String r4 = "getBannerController()Lcom/instagram/direct/integrity/banner/DirectThreadBannerController;"
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74215Pqw.<init>(java.lang.Object, int):void");
    }

    public final Object get() {
        switch (this.A00) {
            case 3:
            case 4:
                return ((C332637Vu) this.receiver).A02;
            case 5:
            case 6:
                return OP3.A00();
            default:
                return ((C270284gU) this.receiver).getValue();
        }
    }
}
