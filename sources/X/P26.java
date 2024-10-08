package X;

public final class P26 implements C74319Psv {
    public final C72527P9k A00;
    public final String A01 = C51972G9s.A0n();
    public final C62320sa A02;

    public P26(C72527P9k p9k, C62320sa r3) {
        0qQ.A0B(p9k, 1);
        this.A00 = p9k;
        this.A02 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a9, code lost:
        if (X.182.A06(r8, r2, 36325836957168902L) != false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e7, code lost:
        if (r1 != null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0118, code lost:
        if (r27 != false) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x014b, code lost:
        if (r6 != false) goto L_0x011a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0095  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Cmw(android.net.Uri r29, X.N3I r30) {
        /*
            r28 = this;
            r4 = 0
            r5 = r29
            r7 = r30
            boolean r14 = X.AnonymousClass7TF.A1U(r4, r5, r7)
            android.app.Activity r3 = r7.A00
            if (r3 == 0) goto L_0x014f
            com.instagram.common.session.UserSession r2 = r7.A03
            if (r2 == 0) goto L_0x014f
            java.lang.String r6 = r7.A0A
            if (r6 != 0) goto L_0x0017
            java.lang.String r6 = ""
        L_0x0017:
            java.lang.String r1 = r5.getAuthority()
            java.lang.String r0 = "memu_onboarding"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x014f
            int r0 = X.DbV.A03(r5)
            if (r0 != 0) goto L_0x014f
            r5 = r28
            X.0sa r0 = r5.A02
            X.7Zg r0 = X.C66580MXl.A0W(r0)
            if (r0 == 0) goto L_0x014f
            X.7S9 r1 = r0.AvL()
            java.lang.String r0 = r7.A08
            X.7LQ r0 = r1.BSO(r0)
            r1 = 0
            if (r0 == 0) goto L_0x00e6
            r1 = r0
            X.3su r0 = r0.A0e
            if (r0 == 0) goto L_0x00e6
            X.7AG r0 = r0.A0Q
            if (r0 == 0) goto L_0x00e6
            java.lang.String r12 = r0.A08
        L_0x004b:
            X.3su r0 = r1.A0e
            if (r0 == 0) goto L_0x00eb
            X.7AG r0 = r0.A0Q
            if (r0 == 0) goto L_0x00eb
            java.lang.String r11 = r0.A03
        L_0x0055:
            X.0wc r1 = X.AnonymousClass0kN.A02(r2)
            r0 = 343(0x157, float:4.8E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0Aj r7 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r7.isSampled()
            if (r0 == 0) goto L_0x0088
            X.HOs r1 = X.C54687HOs.A0F
            java.lang.String r0 = "event_type"
            r7.A8M(r1, r0)
            X.HOj r0 = X.C54678HOj.XMA
            X.DbS.A1F(r0, r7)
            java.lang.String r1 = r5.A01
            r0 = 403(0x193, float:5.65E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r7.AAJ(r0, r1)
            java.lang.String r0 = "thread_type"
            r7.AAJ(r0, r6)
            r7.Cgf()
        L_0x0088:
            X.0Tu r8 = X.0Tu.A05
            r0 = 36325836957496586(0x810e280005350a, double:3.035943792101073E-306)
            boolean r0 = X.182.A06(r8, r2, r0)
            if (r0 == 0) goto L_0x00d8
            java.lang.String r7 = "AI_BOT"
            boolean r27 = r6.equals(r7)
            if (r27 != 0) goto L_0x00ab
            X.0qQ.A0B(r2, r4)
            r0 = 36325836957168902(0x810e2800003506, double:3.0359437918938446E-306)
            boolean r0 = X.182.A06(r8, r2, r0)
            if (r0 == 0) goto L_0x00d8
        L_0x00ab:
            X.HrZ r0 = X.HYV.A00(r2)
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x00ee
            r0 = 2131966351(0x7f13398f, float:1.9569538E38)
            java.lang.String r2 = X.JTQ.A0a(r3, r0)
            X.0qQ.A07(r2)
            r0 = 2131966352(0x7f133990, float:1.956954E38)
        L_0x00c2:
            java.lang.String r1 = X.JTQ.A0a(r3, r0)
            X.0qQ.A07(r1)
            X.6ap r0 = X.DbS.A0a()
            r0.A0D = r2
            r0.A0I = r1
            r0.A06()
            X.DbY.A1N(r0)
            return r14
        L_0x00d8:
            r0 = 2131966349(0x7f13398d, float:1.9569534E38)
            java.lang.String r2 = X.JTQ.A0a(r3, r0)
            X.0qQ.A07(r2)
            r0 = 2131966350(0x7f13398e, float:1.9569536E38)
            goto L_0x00c2
        L_0x00e6:
            r12 = 0
            if (r1 == 0) goto L_0x00eb
            goto L_0x004b
        L_0x00eb:
            r11 = 0
            goto L_0x0055
        L_0x00ee:
            X.HrX r9 = new X.HrX
            r9.<init>(r3, r2)
            X.HOj r16 = X.C54678HOj.XMA
            r17 = 0
            java.lang.String r13 = r5.A01
            java.lang.Integer r18 = X.AnonymousClass05K.A01
            java.lang.String r0 = "thread_type"
            java.util.Map r23 = X.AnonymousClass7TF.A0w(r0, r6)
            int r10 = r6.hashCode()
            r8 = -998144357(0xffffffffc481869b, float:-1036.2064)
            java.lang.String r1 = "GROUP"
            java.lang.String r0 = "ONE_TO_ONE"
            if (r10 == r8) goto L_0x0140
            r0 = 68091487(0x40efe5f, float:1.6808821E-36)
            if (r10 == r0) goto L_0x0146
            r0 = 1931207952(0x731be510, float:1.2351257E31)
            if (r10 != r0) goto L_0x014d
            if (r27 == 0) goto L_0x014d
        L_0x011a:
            X.HtW r15 = new X.HtW
            r20 = r17
            r24 = r4
            r25 = r4
            r26 = r4
            r19 = r13
            r21 = r7
            r22 = r11
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            X.PS3 r0 = new X.PS3
            r23 = r3
            r24 = r2
            r25 = r5
            r26 = r12
            r22 = r0
            r22.<init>(r23, r24, r25, r26, r27)
            r9.A01(r15, r0)
            return r14
        L_0x0140:
            boolean r6 = r6.equals(r0)
            r7 = r0
            goto L_0x014b
        L_0x0146:
            boolean r6 = r6.equals(r1)
            r7 = r1
        L_0x014b:
            if (r6 != 0) goto L_0x011a
        L_0x014d:
            r7 = 0
            goto L_0x011a
        L_0x014f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P26.Cmw(android.net.Uri, X.N3I):boolean");
    }
}
