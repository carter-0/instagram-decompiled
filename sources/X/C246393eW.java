package X;

/* renamed from: X.3eW  reason: invalid class name and case insensitive filesystem */
public final class C246393eW {
    public static final C246393eW A00 = new Object();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01ab, code lost:
        if (X.182.A06(X.0Tu.A05, r1, 36320279273545926L) != false) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01c4, code lost:
        if (X.182.A06(X.0Tu.A05, r1, 36320652934193883L) == false) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a9, code lost:
        if (r15 != X.AnonymousClass3VA.PEOPLE) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00db, code lost:
        if (r0.A6B() == false) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00eb, code lost:
        if (r15 != X.AnonymousClass3VA.CLOSE_FRIENDS) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0035, code lost:
        if (r15 != X.AnonymousClass3VA.A09) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00f9, code lost:
        if (r0.A6T(r1) != false) goto L_0x00fb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0148  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C262744Fv A00(android.content.Context r37, com.instagram.common.session.UserSession r38, X.1Xj r39, X.1Xj r40, X.AnonymousClass4DU r41, X.AnonymousClass3W1 r42, X.AnonymousClass3VA r43) {
        /*
            r36 = this;
            r0 = 0
            r3 = r37
            X.0qQ.A0B(r3, r0)
            r0 = 2
            r2 = r39
            X.0qQ.A0B(r2, r0)
            r1 = 3
            r0 = r40
            X.0qQ.A0B(r0, r1)
            r1 = 6
            r14 = r42
            X.0qQ.A0B(r14, r1)
            r6 = 7
            r9 = r41
            X.0qQ.A0B(r9, r6)
            r4 = r43
            r15 = r4
            r1 = r38
            if (r43 != 0) goto L_0x0029
            X.3VA r15 = X.C243193Xt.A02(r1, r0, r2)
        L_0x0029:
            boolean r4 = X.C243193Xt.A05(r9, r1, r0, r2, r4)
            if (r4 == 0) goto L_0x022b
            r4 = 1
            X.0qQ.A0B(r15, r4)
            X.3VA r4 = X.AnonymousClass3VA.A09
            if (r15 == r4) goto L_0x022b
        L_0x0037:
            com.instagram.user.model.User r5 = r0.A2A(r1)
            java.lang.String r8 = r0.A2w()
            X.3VA r4 = X.AnonymousClass3VA.FUNDRAISER
            if (r15 != r4) goto L_0x0228
            if (r8 == 0) goto L_0x0228
            if (r5 == 0) goto L_0x0228
            java.lang.String r7 = r5.getId()
            X.1Xy r4 = r0.A0C
            X.1bS r5 = r4.B8b()
            java.lang.String r4 = r0.A2n()
            if (r4 == 0) goto L_0x0243
            X.JwB r13 = new X.JwB
            r13.<init>((X.C65231bS) r5, (java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r4)
        L_0x005c:
            java.lang.String r16 = X.C243193Xt.A03(r3, r1, r0, r15)
            r7 = 0
            r10 = 1
            if (r15 != 0) goto L_0x0222
            r4 = -1
        L_0x0065:
            java.lang.String r17 = ""
            r5 = 2
            if (r4 == r5) goto L_0x021d
            if (r4 == r10) goto L_0x021d
            r5 = 3
            if (r4 == r5) goto L_0x0218
            r5 = 4
            if (r4 == r5) goto L_0x0218
            if (r4 == r6) goto L_0x01f9
            r5 = 16
            if (r4 == r5) goto L_0x01f4
            r5 = 5
            if (r4 == r5) goto L_0x01ef
            r5 = 8
            if (r4 == r5) goto L_0x01ea
            r5 = 11
            if (r4 == r5) goto L_0x01ca
            r5 = 12
            if (r4 != r5) goto L_0x0091
            r4 = 2131968935(0x7f1343a7, float:1.9574779E38)
        L_0x008a:
            java.lang.String r17 = r3.getString(r4)
        L_0x008e:
            X.0qQ.A07(r17)
        L_0x0091:
            android.graphics.drawable.Drawable r11 = X.C243193Xt.A00(r3, r1, r0, r15)
            int r19 = r0.A15(r1)
            boolean r4 = r0.CeS()
            if (r4 != 0) goto L_0x00ab
            boolean r4 = r0.A5h()
            if (r4 != 0) goto L_0x00ab
            X.3VA r4 = X.AnonymousClass3VA.PEOPLE
            r20 = 0
            if (r15 == r4) goto L_0x00ad
        L_0x00ab:
            r20 = 1
        L_0x00ad:
            int r4 = r15.ordinal()
            r21 = 1
            r5 = 9
            if (r4 == r5) goto L_0x00c8
            r5 = 6
            if (r4 == r5) goto L_0x00c8
            r5 = 10
            if (r4 == r5) goto L_0x00c8
            r5 = 11
            if (r4 == r5) goto L_0x00c8
            r5 = 14
            if (r4 == r5) goto L_0x00c8
            r21 = 0
        L_0x00c8:
            r22 = 0
            switch(r4) {
                case 6: goto L_0x01c6;
                case 7: goto L_0x00cd;
                case 8: goto L_0x00cd;
                case 9: goto L_0x01c6;
                case 10: goto L_0x01c6;
                case 11: goto L_0x01c6;
                case 12: goto L_0x0196;
                case 13: goto L_0x01b9;
                case 14: goto L_0x01ae;
                default: goto L_0x00cd;
            }
        L_0x00cd:
            boolean r23 = X.C243193Xt.A08(r1, r0, r15)
            X.3VA r4 = X.AnonymousClass3VA.TEMPLATE
            if (r15 != r4) goto L_0x00dd
            boolean r4 = r0.A6B()
            r24 = 1
            if (r4 != 0) goto L_0x00df
        L_0x00dd:
            r24 = 0
        L_0x00df:
            X.3QO r5 = r0.A1t()
            X.3QO r4 = X.AnonymousClass3QO.CLOSE_FRIENDS
            if (r5 != r4) goto L_0x00ed
            X.3VA r4 = X.AnonymousClass3VA.CLOSE_FRIENDS
            r25 = 1
            if (r15 == r4) goto L_0x00ef
        L_0x00ed:
            r25 = 0
        L_0x00ef:
            X.3VA r4 = X.AnonymousClass3VA.UPCOMING_EVENT
            if (r15 != r4) goto L_0x00fb
            boolean r4 = r0.A6T(r1)
            r26 = 1
            if (r4 == 0) goto L_0x00fd
        L_0x00fb:
            r26 = 0
        L_0x00fd:
            X.1Xy r2 = r2.A0C
            java.util.List r6 = r2.Alu()
            if (r6 == 0) goto L_0x0193
            X.1Xy r2 = r0.A0C
            java.util.List r2 = r2.Alu()
            if (r2 == 0) goto L_0x0113
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0193
        L_0x0113:
            int r8 = r6.size()
            r2 = 0
        L_0x0118:
            if (r2 >= r8) goto L_0x0193
            java.lang.Object r5 = X.00k.A0O(r6, r2)
            X.1Xj r5 = (X.1Xj) r5
            if (r5 == 0) goto L_0x0193
            java.lang.String r7 = r5.getId()
            java.lang.String r4 = r0.getId()
            boolean r4 = X.0qQ.A0K(r7, r4)
            if (r4 == 0) goto L_0x018a
            int r4 = r2 + 1
            java.lang.Object r4 = X.00k.A0O(r6, r4)
            X.1Xj r4 = (X.1Xj) r4
            if (r4 == 0) goto L_0x018a
            boolean r4 = r4.A5k()
            if (r4 != r10) goto L_0x018a
            r27 = 1
        L_0x0142:
            java.lang.String r18 = r0.getId()
            if (r18 == 0) goto L_0x0233
            int r2 = r14.A03
            boolean r28 = X.1sx.A0Q(r0, r2)
            boolean r29 = r0.A6D()
            r2 = 41
            X.9LZ r5 = new X.9LZ
            r5.<init>(r0, r2)
            r31 = 46
            X.9MR r7 = new X.9MR
            r30 = r7
            r32 = r15
            r33 = r1
            r34 = r0
            r35 = r3
            r30.<init>(r31, r32, r33, r34, r35)
            r2 = 44
            X.9MC r4 = new X.9MC
            r4.<init>(r2, r1, r0, r9)
            r2 = 4
            X.9MJ r8 = new X.9MJ
            r8.<init>(r2, r3, r13, r1)
            r2 = 5
            X.9MJ r6 = new X.9MJ
            r6.<init>(r2, r0, r9, r1)
            r3 = 3
            X.9Ii r12 = new X.9Ii
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8)
            X.4Fv r10 = new X.4Fv
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return r10
        L_0x018a:
            boolean r4 = r5.A5k()
            if (r4 != 0) goto L_0x0193
            int r2 = r2 + 1
            goto L_0x0118
        L_0x0193:
            r27 = 0
            goto L_0x0142
        L_0x0196:
            X.0q2 r4 = X.0q2.A00(r1)
            boolean r4 = r4.A0N(r2)
            if (r4 == 0) goto L_0x00cd
            X.0Tu r6 = X.0Tu.A05
            r4 = 36320279273545926(0x81091a003e20c6, double:3.032429090391679E-306)
            boolean r4 = X.182.A06(r6, r1, r4)
            if (r4 == 0) goto L_0x00cd
            goto L_0x01c6
        L_0x01ae:
            int r4 = r0.A0v()
            if (r4 <= 0) goto L_0x01b5
            r7 = 1
        L_0x01b5:
            r22 = r7
            goto L_0x00cd
        L_0x01b9:
            X.0Tu r6 = X.0Tu.A05
            r4 = 36320652934193883(0x810971002722db, double:3.0326653948900575E-306)
            boolean r4 = X.182.A06(r6, r1, r4)
            if (r4 != 0) goto L_0x00cd
        L_0x01c6:
            r22 = 1
            goto L_0x00cd
        L_0x01ca:
            X.1Xy r4 = r0.A0C
            X.50l r4 = r4.BDc()
            if (r4 == 0) goto L_0x0091
            java.util.List r4 = r4.AZX()
            if (r4 == 0) goto L_0x0091
            java.lang.Object r4 = X.00k.A0J(r4)
            X.50j r4 = (X.C2801550j) r4
            if (r4 == 0) goto L_0x0091
            java.lang.String r4 = r4.getTitle()
            if (r4 == 0) goto L_0x0091
            r17 = r4
            goto L_0x0091
        L_0x01ea:
            r4 = 2131960988(0x7f13249c, float:1.955866E38)
            goto L_0x008a
        L_0x01ef:
            r4 = 2131976794(0x7f13625a, float:1.9590719E38)
            goto L_0x008a
        L_0x01f4:
            r4 = 2131963522(0x7f132e82, float:1.95638E38)
            goto L_0x008a
        L_0x01f9:
            r6 = 2131976025(0x7f135f59, float:1.9589159E38)
            com.instagram.user.model.UpcomingEvent r5 = r0.A27(r1)
            if (r5 == 0) goto L_0x023b
            X.0nE r4 = X.C61410nE.A00
            X.Vkq r5 = X.C17116VIm.A00(r1, r4, r5)
            X.Uy1 r4 = X.Uy1.A09
            java.lang.String r4 = r5.A00(r3, r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r17 = r3.getString(r6, r4)
            goto L_0x008e
        L_0x0218:
            r4 = 2131976659(0x7f1361d3, float:1.9590445E38)
            goto L_0x008a
        L_0x021d:
            r4 = 2131969341(0x7f13453d, float:1.9575602E38)
            goto L_0x008a
        L_0x0222:
            int r4 = r15.ordinal()
            goto L_0x0065
        L_0x0228:
            r13 = 0
            goto L_0x005c
        L_0x022b:
            com.instagram.user.model.User r4 = r0.A28()
            if (r4 != 0) goto L_0x0037
            r10 = 0
            return r10
        L_0x0233:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x023b:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0243:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C246393eW.A00(android.content.Context, com.instagram.common.session.UserSession, X.1Xj, X.1Xj, X.4DU, X.3W1, X.3VA):X.4Fv");
    }
}
