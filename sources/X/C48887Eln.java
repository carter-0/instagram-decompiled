package X;

/* renamed from: X.Eln  reason: case insensitive filesystem */
public abstract class C48887Eln {
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r33 != null) goto L_0x000a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x013c, code lost:
        if (r1.A01 == false) goto L_0x013e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.content.Context r31, androidx.fragment.app.Fragment r32, androidx.fragment.app.FragmentActivity r33, com.instagram.common.session.UserSession r34, X.C49475EwG r35, X.C331157Pu r36, X.C331127Pr r37, X.AnonymousClass177 r38, X.C49936FFp r39, X.C51922G7q r40, X.G8B r41) {
        /*
            r4 = 1
            r20 = r32
            r21 = r33
            if (r32 != 0) goto L_0x000a
            r0 = 0
            if (r33 == 0) goto L_0x000b
        L_0x000a:
            r0 = 1
        L_0x000b:
            X.17k.A0E(r0)
            r18 = r38
            boolean r0 = r18.CXO()
            r6 = r0 ^ 1
            java.lang.String r5 = r18.getId()
            java.lang.String r2 = X.AnonymousClass50n.A07(r18)
            r14 = r34
            r3 = r39
            X.C49962FGu.A06(r14, r3, r5, r6)
            int r0 = r18.BIW()
            r12 = r31
            r25 = r40
            r26 = r41
            if (r0 != r4) goto L_0x0108
            X.F0p r1 = new X.F0p
            r19 = r1
            r22 = r14
            r23 = r18
            r24 = r3
            r27 = r5
            r28 = r6
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28)
            boolean r0 = r18.CXO()
            r6 = r0 ^ 1
            java.lang.String r5 = X.DbX.A0q(r14)
            boolean r11 = X.2R8.A01(r14)
            X.FIG r7 = new X.FIG
            r7.<init>(r4, r1, r6)
            r0 = 46
            X.FJi r3 = X.C50023FJi.A00(r1, r0)
            X.8ab r2 = X.DbS.A0Y(r12)
            java.lang.String r10 = r18.getFullName()
            java.lang.String r9 = r18.getUsername()
            int r0 = r18.BIW()
            if (r0 != r4) goto L_0x00d2
            r0 = 2131966282(0x7f13394a, float:1.9569398E38)
            if (r6 == 0) goto L_0x0075
            r0 = 2131966222(0x7f13390e, float:1.9569276E38)
        L_0x0075:
            java.lang.String r8 = r12.getString(r0)
        L_0x0079:
            r2.A05 = r8
            java.lang.String r1 = r18.getFullName()
            java.lang.String r9 = r18.getUsername()
            int r0 = r18.BIW()
            if (r0 != r4) goto L_0x00b2
            if (r1 == 0) goto L_0x00b2
            r8 = 2131966281(0x7f133949, float:1.9569396E38)
            if (r6 == 0) goto L_0x0093
            r8 = 2131966221(0x7f13390d, float:1.9569274E38)
        L_0x0093:
            java.lang.Object[] r0 = new java.lang.Object[]{r5, r1}
        L_0x0097:
            java.lang.String r0 = r12.getString(r8, r0)
            r2.A0q(r0)
            if (r6 == 0) goto L_0x00ac
            r1 = 2131953885(0x7f1308dd, float:1.9544254E38)
            X.8ae r0 = X.C358278ae.RED_BOLD
        L_0x00a5:
            r2.A0Q(r7, r0, r1)
            X.DbX.A16(r3, r2)
            return
        L_0x00ac:
            r1 = 2131975843(0x7f135ea3, float:1.958879E38)
            X.8ae r0 = X.C358278ae.BLUE_BOLD
            goto L_0x00a5
        L_0x00b2:
            if (r6 == 0) goto L_0x00c0
            r8 = 2131976222(0x7f13601e, float:1.9589558E38)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
        L_0x00bb:
            r0[r1] = r5
            r0[r4] = r9
            goto L_0x0097
        L_0x00c0:
            r1 = 0
            if (r11 == 0) goto L_0x00ca
            r8 = 2131976350(0x7f13609e, float:1.9589818E38)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            goto L_0x00bb
        L_0x00ca:
            r8 = 2131976351(0x7f13609f, float:1.958982E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r9}
            goto L_0x0097
        L_0x00d2:
            boolean r0 = X.0mp.A0B(r10)
            if (r0 == 0) goto L_0x0100
            r1 = 2131976224(0x7f136020, float:1.9589562E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r9}
        L_0x00df:
            java.lang.String r8 = r12.getString(r1, r0)
            boolean r0 = X.0mp.A0B(r10)
            if (r0 == 0) goto L_0x00f8
            r1 = 2131976353(0x7f1360a1, float:1.9589824E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r9}
        L_0x00f0:
            java.lang.String r0 = r12.getString(r1, r0)
            if (r6 != 0) goto L_0x0079
            r8 = r0
            goto L_0x0079
        L_0x00f8:
            r1 = 2131976352(0x7f1360a0, float:1.9589822E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r10, r9}
            goto L_0x00f0
        L_0x0100:
            r1 = 2131976223(0x7f13601f, float:1.958956E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r10, r9}
            goto L_0x00df
        L_0x0108:
            X.1Z4 r33 = X.1Z4.A00
            r24 = 0
            X.0qQ.A0B(r14, r4)
            r0 = 6
            X.AnonymousClass7TF.A1E(r2, r0, r3)
            if (r32 != 0) goto L_0x011c
            if (r21 != 0) goto L_0x011c
            java.lang.IllegalStateException r0 = X.DbT.A0m()
            throw r0
        L_0x011c:
            int r0 = r18.BIW()
            if (r0 != 0) goto L_0x0178
            X.2Ix r0 = X.2Ix.A00(r14)
            java.lang.Integer r1 = r0.A01()
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x0132
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x0178
        L_0x0132:
            r23 = 1
        L_0x0134:
            r1 = r35
            if (r35 == 0) goto L_0x013e
            boolean r0 = r1.A01
            r22 = 1
            if (r0 != 0) goto L_0x0175
        L_0x013e:
            r22 = 0
            if (r35 != 0) goto L_0x0175
            r1 = 0
        L_0x0143:
            r0 = r18
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            X.4Cl r0 = r0.A03
            X.16q r13 = r0.C31()
            X.Fnk r19 = new X.Fnk
            r27 = r19
            r28 = r20
            r29 = r21
            r30 = r14
            r31 = r18
            r32 = r3
            r34 = r25
            r35 = r26
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35)
            com.instagram.fanclub.api.FanClubApi r15 = new com.instagram.fanclub.api.FanClubApi
            r15.<init>(r14)
            r16 = r36
            r17 = r37
            r20 = r2
            r21 = r1
            r25 = r24
            X.FCZ.A00(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return
        L_0x0175:
            int r1 = r1.A00
            goto L_0x0143
        L_0x0178:
            r23 = 0
            goto L_0x0134
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48887Eln.A00(android.content.Context, androidx.fragment.app.Fragment, androidx.fragment.app.FragmentActivity, com.instagram.common.session.UserSession, X.EwG, X.7Pu, X.7Pr, X.177, X.FFp, X.G7q, X.G8B):void");
    }
}
