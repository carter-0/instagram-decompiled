package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.OKj  reason: case insensitive filesystem */
public final class C70763OKj {
    public final C74541Pwa A00;
    public final UserSession A01;
    public final OKJ A02;

    public C70763OKj(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        C74541Pwa pwa = C66608MYu.A01;
        this.A00 = C66607MYt.A00(userSession).A00(C254923tH.ACT);
        this.A02 = new OKJ(userSession);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d2, code lost:
        if (r4 != null) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C68899Nab A00(X.C74552Pwl r35, int r36) {
        /*
            r34 = this;
            r3 = 0
            X.Nab r0 = new X.Nab
            r0.<init>()
            r2 = r35
            r1 = r36
            java.lang.String r4 = r2.BSF(r1)
            r0.A1E(r4)
            java.lang.Long r5 = r2.BNc(r1)
            java.lang.String r4 = r2.BeV(r1)
            if (r5 == 0) goto L_0x00d2
            java.lang.String r4 = r5.toString()
        L_0x001f:
            r0.A1W = r4
        L_0x0021:
            java.lang.String r4 = r2.BsK(r1)
            r0.A1u = r4
            long r6 = X.C74552Pwl.A00(r2, r1)
            long r4 = (long) r1
            long r6 = r6 + r4
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r0.A1A(r4)
            java.lang.Long r4 = r2.BS9(r1)
            r0.A1L = r4
            java.lang.Long r4 = r2.BNc(r1)
            if (r4 != 0) goto L_0x008b
            java.lang.Integer r5 = X.AnonymousClass05K.A0j
        L_0x0042:
            r0.A1m(r5)
            X.O7p r4 = r2.Bjo(r1)
            r9 = r34
            if (r4 == 0) goto L_0x00d6
            r8 = 0
            java.util.List r7 = r4.A00
            int r6 = r7.size()
        L_0x0054:
            if (r8 >= r6) goto L_0x00d6
            java.lang.Object r4 = r7.get(r8)
            X.OGx r4 = (X.C70702OGx) r4
            java.lang.String r13 = r4.A03
            if (r13 == 0) goto L_0x0086
            java.lang.Object r4 = r7.get(r8)
            X.OGx r4 = (X.C70702OGx) r4
            java.lang.String r14 = r4.A02
            r11 = 0
            java.lang.Object r4 = r7.get(r8)
            X.OGx r4 = (X.C70702OGx) r4
            java.lang.Long r4 = r4.A00
            if (r4 == 0) goto L_0x0089
            long r4 = r4.longValue()
            java.lang.Long r12 = X.C66582MXn.A0l(r4)
        L_0x007b:
            X.46u r10 = new X.46u
            r15 = r11
            r10.<init>(r11, r12, r13, r14, r15)
            com.instagram.common.session.UserSession r4 = r9.A01
            r0.A0y(r4, r10, r13, r11)
        L_0x0086:
            int r8 = r8 + 1
            goto L_0x0054
        L_0x0089:
            r12 = r11
            goto L_0x007b
        L_0x008b:
            int r5 = r2.BsF(r1)
            if (r5 == 0) goto L_0x00cf
            r4 = 1
            if (r5 == r4) goto L_0x00cc
            r4 = 2
            if (r5 == r4) goto L_0x00c9
            r4 = 4
            if (r5 == r4) goto L_0x00c6
            r4 = 5
            if (r5 == r4) goto L_0x00c3
            r4 = 6
            if (r5 == r4) goto L_0x00c9
            int r4 = r2.BsF(r1)
            java.lang.Object[] r6 = X.AnonymousClass7TF.A1b(r4)
            java.lang.String r5 = "MessageListUtil"
            java.lang.String r4 = "MessagesSendStatus is not in the list of messageList, MessagesSendStatus is %d "
            X.0KC.A0Q(r5, r4, r6)
            java.lang.Integer r5 = X.AnonymousClass05K.A0j
        L_0x00b1:
            java.lang.Integer r4 = X.AnonymousClass05K.A0C
            if (r5 == r4) goto L_0x00bd
            java.lang.Integer r4 = X.AnonymousClass05K.A0N
            if (r5 == r4) goto L_0x00bd
            java.lang.Integer r4 = X.AnonymousClass05K.A0Y
            if (r5 != r4) goto L_0x0042
        L_0x00bd:
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            r0.A1m(r4)
            goto L_0x0042
        L_0x00c3:
            java.lang.Integer r5 = X.AnonymousClass05K.A0N
            goto L_0x00b1
        L_0x00c6:
            java.lang.Integer r5 = X.AnonymousClass05K.A0Y
            goto L_0x00b1
        L_0x00c9:
            java.lang.Integer r5 = X.AnonymousClass05K.A0j
            goto L_0x00b1
        L_0x00cc:
            java.lang.Integer r5 = X.AnonymousClass05K.A0C
            goto L_0x00b1
        L_0x00cf:
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            goto L_0x00b1
        L_0x00d2:
            if (r4 == 0) goto L_0x0021
            goto L_0x001f
        L_0x00d6:
            X.Pwa r10 = r9.A00
            X.2FW r8 = X.OZ6.A00(r10, r2, r1)
            X.OU2 r7 = new X.OU2
            r7.<init>(r2, r1, r3)
            X.OKJ r6 = r9.A02
            X.Pu8 r4 = r6.A00(r7, r8)
            java.lang.Object r5 = r4.AWj(r7)
            X.2FW r4 = r4.BZu(r7)
            if (r4 == 0) goto L_0x00f2
            r8 = r4
        L_0x00f2:
            r0.A17(r8, r5)
            java.lang.Long r4 = r2.BmP(r1)
            if (r4 != 0) goto L_0x00ff
            r6 = 0
        L_0x00fc:
            r0.A0a = r6
            return r0
        L_0x00ff:
            java.lang.Long r4 = r2.BmP(r1)
            java.lang.String r26 = java.lang.String.valueOf(r4)
            java.lang.String r13 = r2.BmQ(r1)
            if (r13 == 0) goto L_0x0113
            if (r10 == 0) goto L_0x0113
            java.lang.String r13 = r10.ANc(r13)
        L_0x0113:
            X.OZ6 r7 = X.OZ6.A00
            java.lang.Integer r9 = r2.BmC(r1)
            java.lang.Integer r10 = r2.Bmc(r1)
            r8 = 0
            java.lang.Integer r11 = r2.BmN(r1)
            r12 = r8
            X.2FW r7 = r7.A01(r8, r9, r10, r11, r12, r13)
            java.lang.Long r4 = r2.BmV(r1)
            java.lang.String r28 = java.lang.String.valueOf(r4)
            r4 = 1
            X.OU2 r5 = new X.OU2
            r5.<init>(r2, r1, r4)
            X.Pu8 r1 = r6.A00(r5, r7)
            java.lang.Object r2 = r1.AWj(r5)
            X.2FW r19 = r1.BZu(r5)
            if (r19 != 0) goto L_0x0145
            r19 = r7
        L_0x0145:
            java.lang.String r24 = ""
            r30 = 0
            r7 = 0
            r29 = 0
            java.lang.Boolean r23 = java.lang.Boolean.valueOf(r3)
            boolean r1 = r2 instanceof java.lang.String
            if (r1 == 0) goto L_0x0178
            java.lang.String r2 = (java.lang.String) r2
            r29 = r2
        L_0x0158:
            r32 = 0
            X.3tI r6 = new X.3tI
            r9 = r8
            r10 = r8
            r11 = r8
            r13 = r8
            r14 = r8
            r15 = r8
            r16 = r8
            r17 = r8
            r18 = r8
            r20 = r8
            r21 = r8
            r22 = r8
            r25 = r8
            r27 = r24
            r31 = r8
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            goto L_0x00fc
        L_0x0178:
            r1 = 7
            boolean r1 = X.C376649Iu.A00(r1, r2)
            if (r1 == 0) goto L_0x0183
            X.9Iu r2 = (X.C376649Iu) r2
            r7 = r2
            goto L_0x0158
        L_0x0183:
            boolean r1 = r2 instanceof java.util.List
            if (r1 == 0) goto L_0x0158
            java.util.List r2 = (java.util.List) r2
            int r1 = r2.size()
            if (r1 != r4) goto L_0x0158
            java.lang.Object r1 = r2.get(r3)
            boolean r1 = r1 instanceof X.C254873tC
            if (r1 == 0) goto L_0x0158
            r30 = r2
            goto L_0x0158
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70763OKj.A00(X.Pwl, int):X.Nab");
    }
}
