package X;

public final class MHZ extends AnonymousClass1Ek implements 0sK {
    public float A00;
    public Object A01;
    public final int A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MHZ(Object obj, AnonymousClass4D7 r3, int i) {
        super(3, r3);
        this.A02 = i;
        this.A03 = obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        int i;
        int i2 = this.A02;
        float A04 = AnonymousClass7TE.A04(obj2);
        AnonymousClass4D7 r7 = (AnonymousClass4D7) obj3;
        switch (i2) {
            case 0:
                obj4 = this.A03;
                i = 0;
                break;
            case 1:
                obj4 = this.A03;
                i = 1;
                break;
            case 2:
                obj4 = this.A03;
                i = 2;
                break;
            case 3:
                obj4 = this.A03;
                i = 3;
                break;
            default:
                obj4 = this.A03;
                i = 4;
                break;
        }
        MHZ mhz = new MHZ(obj4, r7, i);
        mhz.A01 = obj;
        mhz.A00 = A04;
        return mhz.invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x008e, code lost:
        return new X.C60964JuM((com.instagram.common.typedurl.ImageUrl) null, r2, (java.lang.String) null, (java.lang.String) null, r5, (java.lang.String) null, (java.lang.String) null, r8, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        X.AnonymousClass7TE.A1Z(new X.C59714JUx(r3, r4, r5, r2), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001d, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.A02
            X.0eS.A00(r11)
            switch(r0) {
                case 0: goto L_0x0066;
                case 1: goto L_0x0048;
                case 2: goto L_0x002a;
                case 3: goto L_0x001e;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.Object r0 = r10.A01
            X.4Cq r0 = (X.C262224Cq) r0
            float r5 = r10.A00
            r4 = 0
            java.lang.Object r3 = r10.A03
            r2 = 17
        L_0x0013:
            X.JUx r1 = new X.JUx
            r1.<init>(r3, r4, r5, r2)
            X.AnonymousClass7TE.A1Z(r1, r0)
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x001e:
            java.lang.Object r0 = r10.A01
            X.4Cq r0 = (X.C262224Cq) r0
            float r5 = r10.A00
            r4 = 0
            java.lang.Object r3 = r10.A03
            r2 = 16
            goto L_0x0013
        L_0x002a:
            java.lang.Object r0 = r10.A01
            java.util.List r0 = (java.util.List) r0
            float r2 = r10.A00
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x008f
            java.lang.Object r1 = r10.A03
            android.content.Context r1 = (android.content.Context) r1
            r0 = 2131956163(0x7f1311c3, float:1.9548874E38)
            java.lang.String r5 = r1.getString(r0)
            float r8 = X.LIF.A01(r2)
            X.KMi r2 = X.C61794KMi.A00
            goto L_0x0083
        L_0x0048:
            java.lang.Object r0 = r10.A01
            java.util.List r0 = (java.util.List) r0
            float r2 = r10.A00
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x008f
            java.lang.Object r1 = r10.A03
            android.content.Context r1 = (android.content.Context) r1
            r0 = 2131955293(0x7f130e5d, float:1.954711E38)
            java.lang.String r5 = r1.getString(r0)
            float r8 = X.LIF.A01(r2)
            X.KMg r2 = X.C61792KMg.A00
            goto L_0x0083
        L_0x0066:
            java.lang.Object r0 = r10.A01
            java.util.List r0 = (java.util.List) r0
            float r2 = r10.A00
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x008f
            java.lang.Object r1 = r10.A03
            android.content.Context r1 = (android.content.Context) r1
            r0 = 2131955292(0x7f130e5c, float:1.9547107E38)
            java.lang.String r5 = r1.getString(r0)
            float r8 = X.LIF.A01(r2)
            X.KMf r2 = X.C61791KMf.A00
        L_0x0083:
            r1 = 0
            r9 = 1
            X.JuM r0 = new X.JuM
            r3 = r1
            r4 = r1
            r6 = r1
            r7 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
        L_0x008f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MHZ.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
