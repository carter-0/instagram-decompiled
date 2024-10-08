package X;

/* renamed from: X.PBt  reason: case insensitive filesystem */
public final class C72588PBt implements C74334PtA {
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007f, code lost:
        if (X.182.A06(X.0Tu.A05, r3, 36317066634072851L) == false) goto L_0x0081;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ X.AnonymousClass7FW ALM(android.content.Context r30, X.C74541Pwa r31, com.instagram.common.session.UserSession r32, X.AnonymousClass7FE r33, X.AnonymousClass9HC r34, X.AnonymousClass7L2 r35, com.instagram.direct.model.messaginguser.MessagingUser r36, X.C74552Pwl r37, com.instagram.direct.msys.subtype.MsysThreadSubtype r38, java.lang.String r39, java.util.List r40, int r41, boolean r42, boolean r43, boolean r44, boolean r45) {
        /*
            r29 = this;
            r15 = 0
            r8 = r30
            X.0qQ.A0B(r8, r15)
            r3 = r32
            r9 = r34
            r10 = r36
            r11 = r37
            X.C51974G9v.A1P(r3, r9, r10, r11)
            r0 = r33
            r7 = r35
            X.C51972G9s.A1E(r0, r7)
            r0 = 12
            r1 = r38
            X.0qQ.A0B(r1, r0)
            r19 = r44
            r14 = r41
            if (r44 == 0) goto L_0x00e3
            java.lang.Long r1 = r11.Bm9(r14)
        L_0x0029:
            r2 = 0
            if (r1 == 0) goto L_0x00c6
            if (r44 == 0) goto L_0x00c9
            java.lang.String r4 = r11.BmE(r14)
        L_0x0032:
            long r0 = r1.longValue()
            java.lang.String r0 = X.OXF.A02(r4, r2, r0)
            X.0qQ.A0A(r0)
            if (r44 == 0) goto L_0x00d9
            java.lang.Integer r1 = r11.BmB(r14)
            java.lang.Integer r6 = r11.BmA(r14)
        L_0x0047:
            r5 = 0
            if (r1 == 0) goto L_0x00c7
            int r1 = r1.intValue()
            float r4 = (float) r1
        L_0x004f:
            if (r6 == 0) goto L_0x0056
            int r1 = r6.intValue()
            float r5 = (float) r1
        L_0x0056:
            com.instagram.model.mediasize.GifUrlImpl r6 = new com.instagram.model.mediasize.GifUrlImpl
            r6.<init>(r0, r4, r5)
            java.lang.String r1 = r11.BSF(r14)
            java.lang.Long r0 = r11.BNc(r14)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            X.2FW r12 = X.2FW.A0K
            com.instagram.model.direct.messageid.DirectMessageIdentifier r5 = new com.instagram.model.direct.messageid.DirectMessageIdentifier
            r5.<init>(r12, r1, r0)
            r20 = r42
            if (r42 == 0) goto L_0x0081
            X.0Tu r4 = X.0Tu.A05
            r0 = 36317066634072851(0x81062e00021313, double:3.0303974042526454E-306)
            boolean r0 = X.182.A06(r4, r3, r0)
            r17 = 1
            if (r0 != 0) goto L_0x0083
        L_0x0081:
            r17 = 0
        L_0x0083:
            X.0Tu r4 = X.0Tu.A05
            r0 = 36319519060270543(0x81086900001dcf, double:3.0319483284551935E-306)
            boolean r18 = X.182.A06(r4, r3, r0)
            r0 = 36312964941022779(0x810273000d063b, double:3.0278034770515876E-306)
            boolean r22 = X.182.A06(r4, r3, r0)
            X.Pju r13 = X.C73795Pju.A00
            r21 = r43
            r16 = r15
            X.7FT r3 = X.C71136Ode.A01(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            X.Pk1 r0 = X.C73802Pk1.A00
            X.0t0 r27 = X.AnonymousClass0eN.A01(r0)
            r20 = r31
            r21 = r9
            r22 = r7
            r23 = r10
            r24 = r11
            r25 = r2
            r26 = r2
            r28 = r14
            X.7FE r4 = X.C70101NxH.A00(r20, r21, r22, r23, r24, r25, r26, r27, r28)
            X.7Fv r2 = new X.7Fv
            r7 = r39
            r8 = r15
            r9 = r19
            r10 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x00c6:
            return r2
        L_0x00c7:
            r4 = 0
            goto L_0x004f
        L_0x00c9:
            java.lang.String r4 = r11.Acp(r14)
            X.OG9 r0 = r11.Acq(r14)
            if (r0 == 0) goto L_0x0032
            java.lang.String r0 = r0.A03
            if (r0 != 0) goto L_0x00d9
            java.lang.String r0 = ""
        L_0x00d9:
            java.lang.Integer r1 = r11.BfB(r14)
            java.lang.Integer r6 = r11.Bf0(r14)
            goto L_0x0047
        L_0x00e3:
            java.lang.Long r1 = r11.Acs(r14)
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72588PBt.ALM(android.content.Context, X.Pwa, com.instagram.common.session.UserSession, X.7FE, X.9HC, X.7L2, com.instagram.direct.model.messaginguser.MessagingUser, X.Pwl, com.instagram.direct.msys.subtype.MsysThreadSubtype, java.lang.String, java.util.List, int, boolean, boolean, boolean, boolean):X.7FW");
    }
}
