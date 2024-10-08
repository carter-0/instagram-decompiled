package X;

/* renamed from: X.GSd  reason: case insensitive filesystem */
public final class C52425GSd extends 0Yg implements 0sP {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final String A03;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0063, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008a, code lost:
        if (X.0qQ.A0K(r0, r8) != false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0131, code lost:
        return new X.GW5(r5, r3, r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0054, code lost:
        if (r3 < 0.2f) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r13) {
        /*
            r12 = this;
            r5 = r13
            int r0 = r12.A00
            switch(r0) {
                case 0: goto L_0x00fa;
                case 1: goto L_0x0117;
                case 2: goto L_0x008f;
                case 3: goto L_0x00c3;
                default: goto L_0x0006;
            }
        L_0x0006:
            X.4ch r4 = X.C51968G9o.A0U(r13)
            java.lang.Object r3 = r12.A02
            X.HqK r3 = (X.C55956HqK) r3
            java.lang.String r8 = r12.A03
            int r9 = r12.A01
            X.4ch r1 = X.C289425dZ.A02(r4)
            r0 = 1
            X.5VN r6 = r1.CgV(r4, r0)
            X.Hoq r2 = r3.A01
            java.lang.String r7 = r3.A02
            long r10 = r4.Bwh()
            X.GmS r5 = new X.GmS
            r5.<init>(r6, r7, r8, r9, r10)
            java.util.Map r4 = r2.A07
            r4.put(r7, r5)
            X.5Oz r3 = r2.A06
            boolean r0 = X.C51969G9p.A1T(r3, r7)
            if (r0 == 0) goto L_0x0064
            float r3 = r5.A00()
            float r0 = r2.A00
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            boolean r1 = X.C51970G9q.A1T(r0)
            r2.A03 = r1
            java.lang.String r0 = r5.A01
            r2.A02 = r0
            int r0 = r5.A00
            r2.A01 = r0
            r2.A00 = r3
            if (r1 == 0) goto L_0x0061
            r0 = 1045220557(0x3e4ccccd, float:0.2)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0061
        L_0x0056:
            X.5Oz r1 = r2.A05
            int r0 = X.C51971G9r.A0B(r1)
            int r0 = r0 + 1
            X.C51967G9n.A15(r1, r0)
        L_0x0061:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0064:
            java.lang.Object r0 = r3.getValue()
            if (r0 != 0) goto L_0x0076
            float r1 = r5.A00()
            r0 = 1053609165(0x3ecccccd, float:0.4)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0076
            goto L_0x0056
        L_0x0076:
            if (r8 == 0) goto L_0x0061
            java.lang.Object r0 = r3.getValue()
            java.lang.Object r0 = r4.get(r0)
            X.GmS r0 = (X.C53342GmS) r0
            if (r0 == 0) goto L_0x008d
            java.lang.String r0 = r0.A01
        L_0x0086:
            boolean r0 = X.0qQ.A0K(r0, r8)
            if (r0 == 0) goto L_0x0061
            goto L_0x0056
        L_0x008d:
            r0 = 0
            goto L_0x0086
        L_0x008f:
            com.facebook.msys.mca.MailboxFeature r5 = (com.facebook.msys.mca.MailboxFeature) r5
            r3 = 0
            X.0qQ.A0B(r5, r3)
            java.lang.String r8 = r12.A03
            int r0 = r12.A01
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r12.A02
            r9 = 1
            X.IIj r2 = new X.IIj
            r2.<init>(r0, r9)
            X.68J r1 = r5.mMailboxApiHandleMetaProvider
            r0 = 2
            X.68L r0 = r1.ASa(r0)
            com.facebook.msys.mca.MailboxFutureImpl r6 = new com.facebook.msys.mca.MailboxFutureImpl
            r6.<init>(r0)
            r6.Eiu(r2)
            X.Opd r4 = new X.Opd
            r4.<init>((java.lang.Object) r5, (java.lang.Object) r6, (java.lang.Object) r7, (java.lang.String) r8, (int) r9)
            boolean r0 = r0.EJd(r4)
            if (r0 != 0) goto L_0x0061
            r6.cancel(r3)
            goto L_0x0061
        L_0x00c3:
            X.ONr r5 = (X.C70840ONr) r5
            r0 = 0
            X.0qQ.A0B(r5, r0)
            java.lang.String r1 = "shared"
            java.lang.String r0 = "action"
            r5.A03(r0, r1)
            java.lang.String r1 = r12.A03
            java.lang.String r0 = "share_type"
            r5.A03(r0, r1)
            int r0 = r12.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "photobooth_output_mode"
            r5.A00(r1, r0)
            java.lang.Object r2 = r12.A02
            X.IX1 r2 = (X.IX1) r2
            boolean r0 = r2.A01
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "result"
            r5.A01(r0, r1)
            java.lang.String r1 = r2.A00
            java.lang.String r0 = "error_message"
            r5.A03(r0, r1)
            goto L_0x0061
        L_0x00fa:
            java.lang.Object r5 = r12.A02
            X.6Fx r5 = (X.C304966Fx) r5
            if (r5 == 0) goto L_0x0111
            int r0 = r12.A01
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.String r1 = r12.A03
            r0 = 1
            X.0qQ.A0B(r1, r0)
            X.1Jk r0 = X.1Jk.A08
            r0.A0J(r2, r1)
        L_0x0111:
            int r4 = r12.A01
            java.lang.String r3 = r12.A03
            r2 = 0
            goto L_0x012c
        L_0x0117:
            java.lang.Object r5 = r12.A02
            X.6Fx r5 = (X.C304966Fx) r5
            int r4 = r12.A01
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r3 = r12.A03
            r2 = 1
            X.0qQ.A0B(r3, r2)
            X.1Jk r0 = X.1Jk.A08
            r0.A0J(r1, r3)
        L_0x012c:
            X.GW5 r0 = new X.GW5
            r0.<init>(r5, r3, r4, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52425GSd.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52425GSd(Object obj, String str, int i, int i2) {
        super(1);
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
        this.A03 = str;
    }
}
