package X;

/* renamed from: X.IxH  reason: case insensitive filesystem */
public final class C58770IxH extends 0Yg implements 0sP {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58770IxH(Object obj, Object obj2, String str, int i, int i2) {
        super(1);
        this.A00 = i2;
        this.A01 = i;
        this.A04 = str;
        this.A02 = obj;
        this.A03 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0138, code lost:
        if (r3 < 0.2f) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x016e, code lost:
        if (X.0qQ.A0K(r0, r9) != false) goto L_0x013a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.A00
            switch(r0) {
                case 0: goto L_0x0037;
                case 1: goto L_0x006d;
                case 2: goto L_0x008d;
                case 3: goto L_0x00b5;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.N8r r14 = (X.C68280N8r) r14
            r2 = 0
            X.0qQ.A0B(r14, r2)
            java.lang.Object r1 = r13.A02
            X.O93 r1 = (X.O93) r1
            X.NdG r1 = (X.C69030NdG) r1
            java.lang.Object r7 = r13.A03
            java.util.Set r7 = (java.util.Set) r7
            int r8 = r13.A01
            java.lang.String r5 = r13.A04
            java.lang.String r6 = r1.A02
            boolean r0 = r5.equals(r6)
            if (r0 == 0) goto L_0x0022
            r6 = 0
        L_0x0022:
            android.location.Location r4 = r1.A01
            X.0qQ.A0B(r7, r2)
            X.NdG r3 = new X.NdG
            r3.<init>(r4, r5, r6, r7, r8)
            java.util.Set r2 = r14.A03
            java.util.List r1 = r14.A02
            X.Gmr r0 = r14.A01
            X.N8r r14 = X.C68280N8r.A00(r3, r0, r1, r2)
            return r14
        L_0x0037:
            X.1Ln r14 = (X.1Ln) r14
            X.N17 r3 = new X.N17
            r3.<init>()
            java.lang.Object r2 = r13.A03
            com.facebookpay.logging.LoggingContext r2 = (com.facebookpay.logging.LoggingContext) r2
            X.C51971G9r.A1B(r3, r2)
            java.lang.String r1 = r13.A04
            java.lang.String r0 = "view_name"
            r3.A06(r0, r1)
            int r0 = r13.A01
            java.lang.Long r1 = X.DbS.A0j(r0)
            java.lang.String r0 = "num_suggestions"
            r3.A05(r0, r1)
            X.GkD r1 = X.SQ1.A00(r2)
            if (r1 == 0) goto L_0x0062
            java.lang.String r0 = "logging_policy"
            r3.A02(r1, r0)
        L_0x0062:
            java.lang.String r0 = "event_payload"
            r14.A0N(r3, r0)
            java.lang.Object r0 = r13.A02
            X.C51969G9p.A1G(r14, r0)
            return r14
        L_0x006d:
            java.lang.String r4 = X.C41847B3o.A1E(r14)
            java.lang.Object r2 = r13.A03
            X.5Oz r2 = (X.C284945Oz) r2
            int r1 = r4.length()
            int r0 = r13.A01
            if (r1 <= r0) goto L_0x008a
            java.lang.String r1 = r13.A04
            X.Gpg r0 = new X.Gpg
            r0.<init>(r1)
        L_0x0084:
            r2.Epw(r0)
            java.lang.Object r0 = r13.A02
            goto L_0x00ad
        L_0x008a:
            X.IPY r0 = X.IPY.A00
            goto L_0x0084
        L_0x008d:
            java.lang.String r4 = X.C41847B3o.A1E(r14)
            int r3 = r4.length()
            int r1 = r13.A01
            java.lang.Object r0 = r13.A02
            X.0rm r0 = (X.0rm) r0
            java.lang.Object r2 = r0.A00
            X.5Oz r2 = (X.C284945Oz) r2
            if (r3 <= r1) goto L_0x00b2
            java.lang.String r1 = r13.A04
            X.Gpg r0 = new X.Gpg
            r0.<init>(r1)
        L_0x00a8:
            r2.Epw(r0)
            java.lang.Object r0 = r13.A03
        L_0x00ad:
            X.C51965G9l.A1W(r0, r4)
            goto L_0x0145
        L_0x00b2:
            X.IPY r0 = X.IPY.A00
            goto L_0x00a8
        L_0x00b5:
            X.4ch r4 = X.C51968G9o.A0U(r14)
            java.lang.Object r1 = r13.A03
            X.6D8 r1 = (X.AnonymousClass6D8) r1
            java.lang.String r9 = r13.A04
            int r10 = r13.A01
            java.lang.Object r3 = r13.A02
            android.content.Context r3 = (android.content.Context) r3
            r0 = 3
            X.0qQ.A0B(r3, r0)
            X.6C3 r2 = r1.A04
            java.lang.String r8 = r1.A05
            long r11 = r4.Bwh()
            X.6Bz r1 = r2.A0A
            X.6By r0 = X.C304046By.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0173
            X.5VN r7 = X.C289425dZ.A01(r4)
            int r0 = X.AnonymousClass0nB.A00(r3)
            float r6 = (float) r0
            int r0 = X.AnonymousClass0nB.A01(r3)
            float r1 = (float) r0
            float r0 = r7.A01
            r5 = 0
            float r4 = X.C229632nm.A02(r0, r5, r1)
            float r0 = r7.A03
            float r3 = X.C229632nm.A02(r0, r5, r6)
            float r0 = r7.A02
            float r1 = X.C229632nm.A02(r0, r5, r1)
            float r0 = r7.A00
            float r0 = X.C229632nm.A02(r0, r5, r6)
            X.5VN r7 = new X.5VN
            r7.<init>(r4, r3, r1, r0)
        L_0x0107:
            X.GmR r6 = new X.GmR
            r6.<init>(r7, r8, r9, r10, r11)
            java.util.Map r4 = r2.A0B
            r4.put(r8, r6)
            X.5Oz r3 = r2.A07
            boolean r0 = X.C51969G9p.A1T(r3, r8)
            if (r0 == 0) goto L_0x0148
            float r3 = r6.A00()
            float r0 = r2.A00
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            boolean r1 = X.C51970G9q.A1T(r0)
            r2.A03 = r1
            java.lang.String r0 = r6.A01
            r2.A02 = r0
            int r0 = r6.A00
            r2.A01 = r0
            r2.A00 = r3
            if (r1 == 0) goto L_0x0145
            r0 = 1045220557(0x3e4ccccd, float:0.2)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0145
        L_0x013a:
            X.5Oz r1 = r2.A06
            int r0 = X.C51971G9r.A0B(r1)
            int r0 = r0 + 1
            X.C51967G9n.A15(r1, r0)
        L_0x0145:
            X.0gF r14 = X.C60340gF.A00
            return r14
        L_0x0148:
            java.lang.Object r0 = r3.getValue()
            if (r0 != 0) goto L_0x015a
            float r1 = r6.A00()
            r0 = 1053609165(0x3ecccccd, float:0.4)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x015a
            goto L_0x013a
        L_0x015a:
            if (r9 == 0) goto L_0x0145
            java.lang.Object r0 = r3.getValue()
            java.lang.Object r0 = r4.get(r0)
            X.GmR r0 = (X.C53341GmR) r0
            if (r0 == 0) goto L_0x0171
            java.lang.String r0 = r0.A01
        L_0x016a:
            boolean r0 = X.0qQ.A0K(r0, r9)
            if (r0 == 0) goto L_0x0145
            goto L_0x013a
        L_0x0171:
            r0 = 0
            goto L_0x016a
        L_0x0173:
            X.4ch r1 = X.C289425dZ.A02(r4)
            r0 = 1
            X.5VN r7 = r1.CgV(r4, r0)
            goto L_0x0107
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58770IxH.invoke(java.lang.Object):java.lang.Object");
    }
}
