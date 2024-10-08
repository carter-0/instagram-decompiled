package X;

public final class OUk {
    public static final OUk A00 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0135, code lost:
        if (r0 != null) goto L_0x00fb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C68184N3z A00(android.view.View.OnClickListener r20, android.view.View.OnClickListener r21, com.instagram.common.session.UserSession r22, com.instagram.model.reels.Reel r23, X.C255773uh r24, X.C311716d8 r25, X.OAL r26, X.0sK r27, boolean r28) {
        /*
            r19 = this;
            r9 = 0
            r6 = r23
            r7 = r24
            r0 = r26
            X.C51974G9v.A1L(r6, r7, r0)
            r11 = 5
            r0 = r25
            X.3BQ r10 = r0.A00
            r4 = 3
            X.0qQ.A0B(r10, r4)
            X.1Ns r3 = r6.A0W
            r13 = 0
            r8 = r22
            if (r3 == 0) goto L_0x0027
            boolean r0 = r6.A18(r8)
            if (r0 == 0) goto L_0x00e2
            r0 = 2131974756(0x7f135a64, float:1.9586585E38)
        L_0x0023:
            X.GKO r13 = X.JTP.A0Q(r0)
        L_0x0027:
            X.1Ns r2 = r6.A0W
            boolean r4 = r2 instanceof X.AnonymousClass6YJ
            if (r4 == 0) goto L_0x00df
            java.lang.Integer r15 = java.lang.Integer.valueOf(r9)
        L_0x0031:
            r5 = 1
            r18 = 0
            if (r2 == 0) goto L_0x0052
            java.lang.Integer r1 = r2.CAm()
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x0052
            com.instagram.user.model.User r0 = r2.CCd()
            if (r0 == 0) goto L_0x0052
            boolean r0 = r0.isVerified()
            if (r0 != r5) goto L_0x0052
            boolean r0 = r10.A00()
            if (r0 == 0) goto L_0x0052
            r18 = 1
        L_0x0052:
            r10 = 2
            boolean r0 = r7.A1N()
            if (r0 != 0) goto L_0x00dc
            boolean r0 = r7.A0R
            if (r0 != 0) goto L_0x00dc
            boolean r0 = r7.A12()
            if (r0 != 0) goto L_0x00dc
            boolean r0 = r7.A1E()
            if (r0 != 0) goto L_0x00dc
            boolean r0 = r6.A18(r8)
            if (r0 != 0) goto L_0x00dc
            boolean r0 = r7.A1i()
            if (r0 != 0) goto L_0x00dc
            long r0 = r7.A03()
            long r7 = X.AnonymousClass3PE.A00
            r2 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 / r2
            long r0 = r0 + r7
            boolean r7 = r6.A0b()
            if (r7 == 0) goto L_0x009a
            X.N9o r14 = new X.N9o
            r14.<init>(r0, r9)
        L_0x008a:
            X.Ps4 r14 = (X.C74276Ps4) r14
        L_0x008c:
            X.N3z r10 = new X.N3z
            r11 = r20
            r12 = r21
            r16 = r28
            r17 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return r10
        L_0x009a:
            boolean r7 = r6.A0l()
            if (r7 == 0) goto L_0x00c3
            java.util.Calendar r5 = java.util.Calendar.getInstance()
            long r2 = r2 * r0
            r5.setTimeInMillis(r2)
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            int r3 = r2.get(r11)
            int r2 = r5.get(r11)
            boolean r3 = X.AnonymousClass7TF.A1S(r3, r2)
            r2 = 7
            int r2 = r5.get(r2)
            X.N9p r14 = new X.N9p
            r14.<init>(r0, r2, r3)
            goto L_0x008c
        L_0x00c3:
            boolean r2 = r6.A0i()
            if (r2 != 0) goto L_0x00d0
            boolean r2 = r6.A0k()
            if (r2 == 0) goto L_0x00d6
            r10 = 3
        L_0x00d0:
            X.N9o r14 = new X.N9o
            r14.<init>(r0, r10)
            goto L_0x008a
        L_0x00d6:
            X.N9o r14 = new X.N9o
            r14.<init>(r0, r5)
            goto L_0x008a
        L_0x00dc:
            X.PQ6 r14 = X.PQ6.A00
            goto L_0x008a
        L_0x00df:
            r15 = 0
            goto L_0x0031
        L_0x00e2:
            boolean r0 = r7.A1i()
            if (r0 == 0) goto L_0x00ed
            r0 = 2131974521(0x7f135979, float:1.9586108E38)
            goto L_0x0023
        L_0x00ed:
            boolean r0 = r6.A0u()
            if (r0 == 0) goto L_0x0102
            com.instagram.user.model.User r0 = r7.A0i
            if (r0 == 0) goto L_0x0248
            java.lang.String r0 = r0.getUsername()
        L_0x00fb:
            X.GKw r13 = new X.GKw
            r13.<init>(r0)
            goto L_0x0027
        L_0x0102:
            boolean r0 = r6.A0l()
            if (r0 == 0) goto L_0x0119
            java.lang.String r1 = r8.A06
            java.lang.String r0 = r3.getId()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0119
            r0 = 2131967975(0x7f133fe7, float:1.9572832E38)
            goto L_0x0023
        L_0x0119:
            boolean r0 = r6.A0i()
            if (r0 == 0) goto L_0x0138
            java.lang.String r0 = r6.A0r
            if (r0 == 0) goto L_0x0138
            X.3BQ r0 = X.AnonymousClass3BQ.REEL_HIGHLIGHTS_UPDATES_HUB
            if (r10 != r0) goto L_0x012d
            boolean r0 = r6.A0l()
            if (r0 != 0) goto L_0x0138
        L_0x012d:
            com.instagram.model.reels.ReelType r1 = r6.A0P
            com.instagram.model.reels.ReelType r0 = com.instagram.model.reels.ReelType.A0D
            if (r1 == r0) goto L_0x0138
            java.lang.String r0 = r6.A0r
        L_0x0135:
            if (r0 == 0) goto L_0x0027
            goto L_0x00fb
        L_0x0138:
            boolean r0 = r6.A0b()
            if (r0 == 0) goto L_0x0154
            long r0 = r7.A03()
            double r2 = (double) r0
            long r4 = X.AnonymousClass7TG.A0I()
            double r0 = (double) r4
            java.lang.String r4 = "EEEE, MMMM d"
            java.lang.String r0 = X.1G0.A0F(r4, r2, r0)
        L_0x014e:
            X.GKw r13 = X.JUH.A00(r0)
            goto L_0x0027
        L_0x0154:
            com.instagram.model.reels.ReelType r1 = r6.A0P
            com.instagram.model.reels.ReelType r0 = com.instagram.model.reels.ReelType.A0D
            if (r1 != r0) goto L_0x016b
            long r0 = r7.A03()
            double r4 = (double) r0
            long r2 = X.AnonymousClass7TG.A0I()
            double r0 = (double) r2
            java.lang.String r2 = "MMMM d"
            java.lang.String r0 = X.1G0.A0F(r2, r4, r0)
            goto L_0x014e
        L_0x016b:
            java.lang.Integer r1 = r3.CAm()
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r2 = 1
            if (r1 != r0) goto L_0x019b
            com.instagram.user.model.User r1 = r3.CCd()
            com.instagram.user.model.User r0 = r7.A0i
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x019b
            boolean r0 = r7.CWu()
            if (r0 == 0) goto L_0x019b
            X.1Xj r1 = r7.A0b
            if (r1 == 0) goto L_0x019b
            com.instagram.user.model.User r0 = r1.A2A(r8)
            if (r0 == 0) goto L_0x019b
            boolean r0 = r0.A2Q()
            if (r0 != r2) goto L_0x019b
            java.lang.String r0 = X.C231122qu.A0G(r8, r1)
            goto L_0x0135
        L_0x019b:
            boolean r0 = r7.A12()
            if (r0 == 0) goto L_0x01aa
            com.instagram.model.effect.AttributedAREffect r0 = r7.A05
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r0.A05()
            goto L_0x0135
        L_0x01aa:
            boolean r0 = r3 instanceof X.AnonymousClass6YJ
            if (r0 == 0) goto L_0x0248
            java.lang.Integer r0 = r3.CAm()
            int r5 = r0.intValue()
            r2 = 0
            r1 = 9
            r0 = 8
            if (r5 == r0) goto L_0x023e
            if (r5 == r1) goto L_0x0234
            java.lang.String r5 = r3.getName()
            r1 = 25
            if (r5 == 0) goto L_0x01d4
            java.util.regex.Pattern r0 = X.0mp.A06
            int r0 = r5.length()
            if (r0 >= r1) goto L_0x0212
            X.GKw r13 = new X.GKw
            r13.<init>(r5)
        L_0x01d4:
            java.lang.String r0 = " • "
            X.GKw r12 = X.JUH.A00(r0)
            r0 = -1
            android.text.style.ForegroundColorSpan r5 = X.C66580MXl.A0E(r0)
            java.util.List r1 = r12.A00
            X.HiD r0 = new X.HiD
            r0.<init>(r5)
            r1.add(r0)
            com.instagram.user.model.User r0 = r7.A0i
            if (r0 == 0) goto L_0x01f6
            java.lang.String r0 = r0.getUsername()
            X.GKw r2 = new X.GKw
            r2.<init>(r0)
        L_0x01f6:
            r0 = r27
            r0.invoke(r13, r2, r3)
            X.4Yx[] r0 = new X.C266444Yx[]{r13, r12, r2}
            X.0qQ.A0B(r0, r9)
            java.util.List r1 = X.03t.A0I(r0)
            java.lang.String r0 = ""
            X.0qQ.A0B(r1, r4)
            X.Uhc r13 = new X.Uhc
            r13.<init>(r0, r1)
            goto L_0x0027
        L_0x0212:
            java.lang.String r0 = X.C51967G9n.A0q(r5, r9, r1)
            X.GKw r5 = new X.GKw
            r5.<init>(r0)
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r0 = 2131961564(0x7f1326dc, float:1.9559828E38)
            X.GKO r0 = X.DbS.A0Q(r1, r0)
            X.4Yx[] r0 = new X.C266444Yx[]{r5, r0}
            java.util.List r1 = X.0sr.A1P(r0)
            java.lang.String r0 = ""
            X.Uhc r13 = new X.Uhc
            r13.<init>(r0, r1)
            goto L_0x01d4
        L_0x0234:
            java.lang.String r0 = r6.A0r
            if (r0 == 0) goto L_0x01d4
            X.GKw r13 = new X.GKw
            r13.<init>(r0)
            goto L_0x01d4
        L_0x023e:
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r0 = 2131974453(0x7f135935, float:1.958597E38)
            X.GKO r13 = X.DbS.A0Q(r1, r0)
            goto L_0x01d4
        L_0x0248:
            java.lang.String r0 = r3.getName()
            goto L_0x0135
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OUk.A00(android.view.View$OnClickListener, android.view.View$OnClickListener, com.instagram.common.session.UserSession, com.instagram.model.reels.Reel, X.3uh, X.6d8, X.OAL, X.0sK, boolean):X.N3z");
    }
}
