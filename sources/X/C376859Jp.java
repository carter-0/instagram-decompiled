package X;

/* renamed from: X.9Jp  reason: invalid class name and case insensitive filesystem */
public final class C376859Jp extends AnonymousClass1Ek implements 0sJ {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C376859Jp(int i, AnonymousClass4D7 r3) {
        super(4, r3);
        this.A03 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2 = this.A03;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        boolean booleanValue3 = ((Boolean) obj3).booleanValue();
        AnonymousClass4D7 r9 = (AnonymousClass4D7) obj4;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        C376859Jp r1 = new C376859Jp(i, r9);
        r1.A00 = booleanValue;
        r1.A01 = booleanValue2;
        r1.A02 = booleanValue3;
        return r1.invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r1 == false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.A03
            X.0eS.A00(r6)
            if (r0 == 0) goto L_0x0014
            boolean r4 = r5.A00
            boolean r3 = r5.A01
            boolean r2 = r5.A02
            r1 = 1
            X.JVq r0 = new X.JVq
            r0.<init>((boolean) r4, (boolean) r3, (boolean) r2, (int) r1)
            return r0
        L_0x0014:
            boolean r2 = r5.A00
            boolean r0 = r5.A01
            boolean r1 = r5.A02
            if (r2 == 0) goto L_0x0021
            if (r0 == 0) goto L_0x0021
            r0 = 1
            if (r1 != 0) goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C376859Jp.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
