package X;

public final class JTX extends AnonymousClass1Ek implements 0sK {
    public boolean A00;
    public boolean A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JTX(int i, AnonymousClass4D7 r3) {
        super(3, r3);
        this.A02 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int i2 = this.A02;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        AnonymousClass4D7 r7 = (AnonymousClass4D7) obj3;
        switch (i2) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            default:
                i = 2;
                break;
        }
        JTX jtx = new JTX(i, r7);
        jtx.A00 = booleanValue;
        jtx.A01 = booleanValue2;
        return jtx.invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0032, code lost:
        if (r1 != false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r0 == false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.A02
            X.0eS.A00(r4)
            switch(r0) {
                case 0: goto L_0x001a;
                case 1: goto L_0x002b;
                default: goto L_0x0008;
            }
        L_0x0008:
            boolean r1 = r3.A00
            boolean r0 = r3.A01
            if (r1 == 0) goto L_0x0011
            r2 = 1
            if (r0 != 0) goto L_0x0012
        L_0x0011:
            r2 = 0
        L_0x0012:
            r1 = 16
            X.JTb r0 = new X.JTb
            r0.<init>(r2, r1)
            return r0
        L_0x001a:
            boolean r1 = r3.A00
            boolean r0 = r3.A01
            if (r1 == 0) goto L_0x0023
            X.KMl r0 = X.C61797KMl.A00
            return r0
        L_0x0023:
            if (r0 == 0) goto L_0x0028
            X.KMj r0 = X.C61795KMj.A00
            return r0
        L_0x0028:
            X.KMk r0 = X.C61796KMk.A00
            return r0
        L_0x002b:
            boolean r0 = r3.A00
            boolean r1 = r3.A01
            if (r0 == 0) goto L_0x0034
            r0 = 1
            if (r1 == 0) goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JTX.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
