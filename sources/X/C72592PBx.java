package X;

/* renamed from: X.PBx  reason: case insensitive filesystem */
public final class C72592PBx implements C74334PtA {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0050, code lost:
        if (r0.intValue() != 0) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008b, code lost:
        if (r1.A00(X.C376179Gx.MESSAGE_REPLY) == false) goto L_0x008d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ X.AnonymousClass7FW ALM(android.content.Context r28, X.C74541Pwa r29, com.instagram.common.session.UserSession r30, X.AnonymousClass7FE r31, X.AnonymousClass9HC r32, X.AnonymousClass7L2 r33, com.instagram.direct.model.messaginguser.MessagingUser r34, X.C74552Pwl r35, com.instagram.direct.msys.subtype.MsysThreadSubtype r36, java.lang.String r37, java.util.List r38, int r39, boolean r40, boolean r41, boolean r42, boolean r43) {
        /*
            r27 = this;
            r8 = 0
            r12 = r28
            X.0qQ.A0B(r12, r8)
            r5 = 1
            r0 = r30
            r13 = r32
            r14 = r34
            X.DbZ.A0t(r5, r0, r13, r14)
            r4 = 4
            r15 = r35
            X.0qQ.A0B(r15, r4)
            r9 = r31
            r0 = r33
            X.C51972G9s.A1E(r9, r0)
            r0 = 12
            r1 = r36
            X.0qQ.A0B(r1, r0)
            r3 = r39
            r23 = r42
            if (r42 == 0) goto L_0x00ee
            java.lang.Long r0 = r15.Bm9(r3)
            java.lang.Integer r11 = r15.BmC(r3)
        L_0x0032:
            if (r0 == 0) goto L_0x00fd
            if (r11 == 0) goto L_0x00fd
            if (r42 == 0) goto L_0x00e8
            java.lang.String r2 = r15.BmT(r3)
        L_0x003c:
            long r0 = r0.longValue()
            r7 = 0
            android.net.Uri r6 = X.OXF.A00(r2, r7, r0)
            java.lang.Integer r0 = r15.CFk(r3)
            if (r0 == 0) goto L_0x0052
            int r0 = r0.intValue()
            r2 = 1
            if (r0 == 0) goto L_0x0053
        L_0x0052:
            r2 = 0
        L_0x0053:
            if (r42 == 0) goto L_0x00de
            java.lang.Integer r1 = r15.BmB(r3)
            java.lang.Integer r0 = r15.BmA(r3)
        L_0x005d:
            if (r1 == 0) goto L_0x00d5
            if (r0 == 0) goto L_0x00d5
            java.lang.String r10 = r6.toString()
            int r6 = r1.intValue()
            int r1 = r0.intValue()
            com.instagram.common.typedurl.SimpleImageUrl r0 = new com.instagram.common.typedurl.SimpleImageUrl
            r0.<init>(r10, r6, r1)
        L_0x0072:
            X.NaN r6 = new X.NaN
            r6.<init>(r0)
            com.instagram.direct.capabilities.Capabilities r1 = r13.A01
            X.9Gx r0 = X.C376179Gx.MESSAGE_SAVE_MEDIA
            boolean r19 = r1.A00(r0)
            r24 = r40
            if (r40 == 0) goto L_0x008d
            X.9Gx r0 = X.C376179Gx.MESSAGE_REPLY
            boolean r0 = r1.A00(r0)
            r21 = 1
            if (r0 != 0) goto L_0x008f
        L_0x008d:
            r21 = 0
        L_0x008f:
            X.2FW r16 = X.2FW.A1j
            X.Pju r17 = X.C73795Pju.A00
            r25 = r41
            r22 = r8
            r26 = r5
            r18 = r3
            r20 = r8
            X.7FT r12 = X.C71136Ode.A01(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            int r0 = r11.intValue()
            boolean r20 = X.AnonymousClass7TF.A1S(r4, r0)
            if (r42 == 0) goto L_0x00d0
            java.lang.Long r0 = r15.BmV(r3)
            if (r0 == 0) goto L_0x00f8
            long r0 = r0.longValue()
        L_0x00b5:
            boolean r0 = r14.A01(r0)
            X.9IP r11 = X.C70051NwT.A00(r0, r2)
            r21 = r20 ^ 1
            X.NYd r10 = new X.NYd
            r17 = r37
            r13 = r9
            r14 = r6
            r15 = r7
            r16 = r7
            r18 = r23
            r19 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r10
        L_0x00d0:
            long r0 = r15.BsH(r3)
            goto L_0x00b5
        L_0x00d5:
            java.lang.String r0 = r6.toString()
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.DbS.A0V(r0)
            goto L_0x0072
        L_0x00de:
            java.lang.Integer r1 = r15.BfB(r3)
            java.lang.Integer r0 = r15.Bf0(r3)
            goto L_0x005d
        L_0x00e8:
            java.lang.String r2 = r15.Act(r3)
            goto L_0x003c
        L_0x00ee:
            java.lang.Long r0 = r15.Acs(r3)
            java.lang.Integer r11 = r15.Acu(r3)
            goto L_0x0032
        L_0x00f8:
            java.lang.IllegalArgumentException r0 = X.DbU.A0h()
            throw r0
        L_0x00fd:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72592PBx.ALM(android.content.Context, X.Pwa, com.instagram.common.session.UserSession, X.7FE, X.9HC, X.7L2, com.instagram.direct.model.messaginguser.MessagingUser, X.Pwl, com.instagram.direct.msys.subtype.MsysThreadSubtype, java.lang.String, java.util.List, int, boolean, boolean, boolean, boolean):X.7FW");
    }
}
