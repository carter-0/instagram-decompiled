package X;

public final class MHq extends AnonymousClass1Ek implements 0sJ {
    public int A00;
    public Object A01;
    public boolean A02;
    public final int A03;
    public final Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MHq(C60315JjI jjI, AnonymousClass4D7 r3, int i) {
        super(4, r3);
        this.A03 = i;
        this.A04 = jjI;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2 = this.A03;
        boolean A1a = AnonymousClass7TE.A1a(obj2);
        int A0M = AnonymousClass7TE.A0M(obj3);
        AnonymousClass4D7 r9 = (AnonymousClass4D7) obj4;
        C60315JjI jjI = (C60315JjI) this.A04;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        MHq mHq = new MHq(jjI, r9, i);
        mHq.A01 = obj;
        mHq.A02 = A1a;
        mHq.A00 = A0M;
        return mHq.invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
        if (r9 != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r9 != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            int r1 = r13.A03
            X.0eS.A00(r14)
            java.lang.Object r0 = r13.A01
            if (r1 == 0) goto L_0x0045
            X.JuL r0 = (X.C60963JuL) r0
            boolean r9 = r13.A02
            int r5 = r13.A00
            if (r0 == 0) goto L_0x0083
            boolean r1 = r0.A04
            if (r1 == 0) goto L_0x0018
            r6 = 1
            if (r9 == 0) goto L_0x0019
        L_0x0018:
            r6 = 0
        L_0x0019:
            java.lang.Object r1 = r13.A04
            X.JjI r1 = (X.C60315JjI) r1
            com.instagram.common.session.UserSession r4 = r1.A01
            X.0Tu r3 = X.AnonymousClass7TF.A0H(r4)
            r1 = 36605550999115016(0x820c8e001c1508, double:3.212836078338609E-306)
            int r1 = X.DbS.A04(r3, r4, r1)
            boolean r11 = X.AnonymousClass7TF.A1T(r5, r1)
            int r5 = r0.A00
            java.lang.String r3 = r0.A02
            java.lang.String r4 = r0.A01
            boolean r7 = r0.A08
            boolean r8 = r0.A05
            boolean r10 = r0.A06
            X.AnonymousClass7TG.A1O(r3, r4)
            X.JuL r2 = new X.JuL
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r2
        L_0x0045:
            X.JuP r0 = (X.C60967JuP) r0
            boolean r9 = r13.A02
            int r5 = r13.A00
            if (r0 == 0) goto L_0x0083
            boolean r1 = r0.A04
            if (r1 == 0) goto L_0x0054
            r6 = 1
            if (r9 == 0) goto L_0x0055
        L_0x0054:
            r6 = 0
        L_0x0055:
            java.lang.Object r1 = r13.A04
            X.JjI r1 = (X.C60315JjI) r1
            com.instagram.common.session.UserSession r4 = r1.A01
            X.0Tu r3 = X.AnonymousClass7TF.A0H(r4)
            r1 = 36605550999049479(0x820c8e001b1507, double:3.212836078297163E-306)
            int r1 = X.DbS.A04(r3, r4, r1)
            boolean r11 = X.AnonymousClass7TF.A1T(r5, r1)
            int r5 = r0.A00
            X.N49 r3 = r0.A02
            X.N49 r4 = r0.A01
            boolean r7 = r0.A08
            boolean r8 = r0.A05
            boolean r10 = r0.A06
            boolean r12 = r0.A09
            X.AnonymousClass7TG.A1O(r3, r4)
            X.JuP r2 = new X.JuP
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r2
        L_0x0083:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MHq.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
