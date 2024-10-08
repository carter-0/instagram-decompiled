package X;

/* renamed from: X.9Jq  reason: invalid class name and case insensitive filesystem */
public final class C376869Jq extends AnonymousClass1Ek implements 0sH {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final int A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C376869Jq(int i, AnonymousClass4D7 r3) {
        super(6, r3);
        this.A05 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i;
        int i2 = this.A05;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        boolean booleanValue3 = ((Boolean) obj3).booleanValue();
        boolean booleanValue4 = ((Boolean) obj4).booleanValue();
        boolean booleanValue5 = ((Boolean) obj5).booleanValue();
        AnonymousClass4D7 r13 = (AnonymousClass4D7) obj6;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        C376869Jq r1 = new C376869Jq(i, r13);
        r1.A00 = booleanValue;
        r1.A01 = booleanValue2;
        r1.A02 = booleanValue3;
        r1.A03 = booleanValue4;
        r1.A04 = booleanValue5;
        return r1.invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        if (r0 != false) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r0 == false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.A05
            X.0eS.A00(r6)
            if (r0 == 0) goto L_0x0021
            boolean r4 = r5.A00
            boolean r3 = r5.A01
            boolean r2 = r5.A02
            boolean r1 = r5.A03
            boolean r0 = r5.A04
            if (r4 == 0) goto L_0x0036
            if (r3 != 0) goto L_0x0036
            if (r2 != 0) goto L_0x0036
            if (r1 == 0) goto L_0x0036
            if (r0 != 0) goto L_0x0036
        L_0x001b:
            r0 = 1
        L_0x001c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x0021:
            boolean r4 = r5.A00
            boolean r3 = r5.A01
            boolean r2 = r5.A02
            boolean r1 = r5.A03
            boolean r0 = r5.A04
            if (r4 == 0) goto L_0x0036
            if (r3 != 0) goto L_0x0036
            if (r2 != 0) goto L_0x0036
            if (r1 == 0) goto L_0x0036
            if (r0 == 0) goto L_0x0036
            goto L_0x001b
        L_0x0036:
            r0 = 0
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C376869Jq.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
