package X;

public final class JGX extends 0Yg implements 0sK {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JGX(Object obj, int i) {
        super(3);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:153:0x056c, code lost:
        X.0fL.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0571, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0572, code lost:
        r5.Evl();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:?, code lost:
        return r6.A00(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r82, java.lang.Object r83, java.lang.Object r84) {
        /*
            r81 = this;
            r2 = r81
            r9 = r84
            r5 = r83
            r6 = r82
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x053d;
                case 1: goto L_0x04d9;
                case 2: goto L_0x004a;
                case 3: goto L_0x03f8;
                case 4: goto L_0x03c5;
                case 5: goto L_0x0373;
                case 6: goto L_0x0321;
                case 7: goto L_0x0303;
                case 8: goto L_0x02d2;
                case 9: goto L_0x02a1;
                case 10: goto L_0x042a;
                case 11: goto L_0x0290;
                case 12: goto L_0x0148;
                case 13: goto L_0x0134;
                case 14: goto L_0x0111;
                case 15: goto L_0x0576;
                case 16: goto L_0x00f1;
                case 17: goto L_0x00cd;
                case 18: goto L_0x00aa;
                default: goto L_0x000d;
            }
        L_0x000d:
            X.4um r6 = (X.C277274um) r6
            android.view.View r5 = (android.view.View) r5
            boolean r4 = X.AnonymousClass7TE.A1a(r9)
            r3 = 0
            X.AnonymousClass7TF.A1H(r6, r5)
            java.lang.Object r1 = r2.A01
            X.GJn r1 = (X.C52222GJn) r1
            r0 = 2131440757(0x7f0b3475, float:1.8503506E38)
            android.view.View r2 = X.AnonymousClass7TF.A0F(r5, r0)
            android.widget.AbsSeekBar r2 = (android.widget.AbsSeekBar) r2
            boolean r0 = r1.A0A
            if (r0 == 0) goto L_0x0045
            if (r4 == 0) goto L_0x0045
            android.content.Context r1 = r2.getContext()
            r0 = 2131231382(0x7f080296, float:1.8078843E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
        L_0x0037:
            r2.setThumb(r0)
            r0 = 23
            X.IwO r0 = X.C58715IwO.A01(r2, r0)
            X.4uo r9 = r6.A00(r0)
        L_0x0044:
            return r9
        L_0x0045:
            android.graphics.drawable.ColorDrawable r0 = X.C51965G9l.A0D(r3)
            goto L_0x0037
        L_0x004a:
            com.instagram.common.session.UserSession r6 = (com.instagram.common.session.UserSession) r6
            long r7 = X.AnonymousClass7TE.A0R(r5)
            long r4 = X.AnonymousClass7TE.A0R(r9)
            r0 = 0
            X.0qQ.A0B(r6, r0)
            r9 = 0
            android.content.Context r1 = X.C51966G9m.A0P(r6)     // Catch:{ Exception -> 0x059b }
            java.lang.String r0 = "usagestats"
            java.lang.Object r3 = r1.getSystemService(r0)     // Catch:{ Exception -> 0x059b }
            android.app.usage.UsageStatsManager r3 = (android.app.usage.UsageStatsManager) r3     // Catch:{ Exception -> 0x059b }
            if (r3 == 0) goto L_0x0044
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()     // Catch:{ Exception -> 0x059b }
            java.lang.Object r2 = r2.A01     // Catch:{ Exception -> 0x059b }
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch:{ Exception -> 0x059b }
            java.lang.Long r1 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x059b }
            java.lang.Long r0 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x059b }
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}     // Catch:{ Exception -> 0x059b }
            java.lang.Object r5 = r2.invoke(r3, r0)     // Catch:{ Exception -> 0x059b }
            java.lang.String r0 = "null cannot be cast to non-null type android.app.usage.UsageEvents"
            X.0qQ.A0C(r5, r0)     // Catch:{ Exception -> 0x059b }
            android.app.usage.UsageEvents r5 = (android.app.usage.UsageEvents) r5     // Catch:{ Exception -> 0x059b }
            android.app.usage.UsageEvents$Event r4 = new android.app.usage.UsageEvents$Event     // Catch:{ Exception -> 0x059b }
            r4.<init>()     // Catch:{ Exception -> 0x059b }
        L_0x008b:
            boolean r0 = r5.getNextEvent(r4)     // Catch:{ Exception -> 0x059b }
            if (r0 == 0) goto L_0x059a
            long r0 = r4.getTimeStamp()     // Catch:{ Exception -> 0x059b }
            long r2 = X.AnonymousClass7TE.A0P(r0)     // Catch:{ Exception -> 0x059b }
            int r0 = r4.getEventType()     // Catch:{ Exception -> 0x059b }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x059b }
            X.Gmt r0 = new X.Gmt     // Catch:{ Exception -> 0x059b }
            r0.<init>(r2, r1)     // Catch:{ Exception -> 0x059b }
            r6.add(r0)     // Catch:{ Exception -> 0x059b }
            goto L_0x008b
        L_0x00aa:
            X.4um r6 = (X.C277274um) r6
            android.view.View r5 = (android.view.View) r5
            int r2 = X.AnonymousClass7TE.A0M(r9)
            X.AnonymousClass7TG.A1N(r6, r5)
            r0 = 2131440757(0x7f0b3475, float:1.8503506E38)
            android.view.View r1 = X.AnonymousClass7TF.A0F(r5, r0)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            int r0 = r1.getProgress()
            boolean r0 = X.AnonymousClass7TF.A1T(r0, r2)
            r1.setProgress(r2, r0)
            X.GKj r0 = X.C52242GKj.A00
            goto L_0x0596
        L_0x00cd:
            X.4um r6 = (X.C277274um) r6
            android.view.View r5 = (android.view.View) r5
            int r0 = X.AnonymousClass7TE.A0M(r9)
            X.AnonymousClass7TG.A1N(r6, r5)
            java.lang.Object r2 = r2.A01
            long r0 = (long) r0
            java.lang.String r1 = X.1G0.A02(r0)
            r0 = 2131443102(0x7f0b3d9e, float:1.8508263E38)
            android.widget.TextView r0 = X.AnonymousClass7TG.A0R(r5, r0)
            r0.setText(r1)
            r0 = 11
            X.Iw1 r0 = X.C58692Iw1.A00(r5, r2, r0)
            goto L_0x0596
        L_0x00f1:
            float r12 = X.AnonymousClass7TE.A04(r6)
            float r13 = X.AnonymousClass7TE.A04(r5)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            java.lang.Object r0 = r2.A01
            X.GG6 r0 = (X.GG6) r0
            X.JTB r4 = r0.A0F
            X.4bN r6 = r0.A07
            X.GDe r7 = r0.A08
            X.JPD r5 = r0.A04
            r8 = 0
            r14 = 0
            r10 = r8
            r11 = r8
            r15 = r14
            r4.D3Z(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x056f
        L_0x0111:
            androidx.fragment.app.Fragment r6 = (androidx.fragment.app.Fragment) r6
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r3 = X.AnonymousClass7TE.A1a(r9)
            X.AnonymousClass7TG.A1N(r6, r5)
            java.lang.Object r0 = r2.A01
            X.2is r0 = (X.C227232is) r0
            X.Hrp r1 = r0.A0J
            if (r1 != 0) goto L_0x012e
            java.lang.String r0 = "overlayFragmentController"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x012e:
            r0 = 0
            r1.A00(r0, r6, r5, r3)
            goto L_0x056f
        L_0x0134:
            X.4bN r6 = (X.C267324bN) r6
            X.GDe r5 = (X.C52058GDe) r5
            android.view.View r9 = (android.view.View) r9
            X.AnonymousClass7TG.A1N(r6, r5)
            java.lang.Object r0 = r2.A01
            X.GCb r0 = (X.C52029GCb) r0
            X.GCf r0 = r0.A0Y
            r0.A06(r9, r6, r5)
            goto L_0x056f
        L_0x0148:
            boolean r68 = X.AnonymousClass7TE.A1a(r6)
            boolean r69 = X.AnonymousClass7TE.A1a(r5)
            boolean r67 = X.AnonymousClass7TE.A1a(r9)
            java.lang.Object r0 = r2.A01
            X.A5K r0 = (X.A5K) r0
            X.7Yf r0 = r0.A00
            X.7Tw r0 = r0.A05
            X.7UW r9 = r0.A0C
            X.7LZ r0 = r9.A01
            if (r0 == 0) goto L_0x028e
            X.7LZ r1 = X.AnonymousClass7LZ.A0y
            java.lang.String r11 = r0.A0J
            java.lang.CharSequence r1 = r0.A0G
            r80 = r1
            X.3t3 r1 = r0.A0C
            r79 = r1
            boolean r1 = r0.A0m
            r34 = r1
            boolean r1 = r0.A0s
            r35 = r1
            boolean r1 = r0.A0N
            r36 = r1
            boolean r1 = r0.A0h
            r37 = r1
            boolean r1 = r0.A0M
            r38 = r1
            boolean r1 = r0.A0U
            r39 = r1
            boolean r1 = r0.A0X
            r40 = r1
            com.instagram.model.reels.Reel r1 = r0.A0D
            r78 = r1
            boolean r1 = r0.A0Y
            r41 = r1
            X.34S r10 = r0.A09
            java.util.List r8 = r0.A0K
            boolean r1 = r0.A0c
            r42 = r1
            boolean r1 = r0.A0o
            r43 = r1
            boolean r1 = r0.A0i
            r44 = r1
            boolean r1 = r0.A0e
            r45 = r1
            boolean r1 = r0.A0g
            r46 = r1
            boolean r1 = r0.A0f
            r47 = r1
            boolean r1 = r0.A0p
            r48 = r1
            boolean r1 = r0.A0k
            r49 = r1
            boolean r1 = r0.A0r
            r50 = r1
            com.instagram.user.model.User r1 = r0.A0E
            r77 = r1
            com.instagram.direct.model.messaginguser.MessagingUser r1 = r0.A0B
            r76 = r1
            boolean r1 = r0.A0j
            r51 = r1
            int r1 = r0.A07
            r75 = r1
            int r1 = r0.A00
            r74 = r1
            int r1 = r0.A03
            r73 = r1
            int r1 = r0.A01
            r28 = r1
            int r1 = r0.A02
            r29 = r1
            boolean r1 = r0.A0x
            r52 = r1
            boolean r1 = r0.A0l
            r53 = r1
            int r1 = r0.A05
            r30 = r1
            int r1 = r0.A04
            r27 = r1
            boolean r1 = r0.A0S
            r26 = r1
            int r1 = r0.A08
            r25 = r1
            boolean r1 = r0.A0a
            r24 = r1
            boolean r1 = r0.A0Z
            r23 = r1
            boolean r1 = r0.A0n
            r22 = r1
            X.9Iv r1 = r0.A0A
            r21 = r1
            boolean r1 = r0.A0V
            r20 = r1
            boolean r1 = r0.A0T
            r19 = r1
            boolean r1 = r0.A0O
            r18 = r1
            boolean r1 = r0.A0L
            r17 = r1
            boolean r1 = r0.A0d
            r16 = r1
            boolean r15 = r0.A0b
            boolean r14 = r0.A0Q
            boolean r13 = r0.A0W
            boolean r7 = r0.A0w
            boolean r6 = r0.A0t
            int r5 = r0.A06
            boolean r4 = r0.A0q
            java.lang.Integer r3 = r0.A0I
            java.lang.Integer r2 = r0.A0H
            boolean r1 = r0.A0P
            java.lang.CharSequence r0 = r0.A0F
            r12 = 0
            X.DbW.A1P(r11, r12, r10)
            r12 = 13
            X.0qQ.A0B(r8, r12)
            X.7LZ r12 = new X.7LZ
            r31 = r27
            r32 = r25
            r33 = r5
            r54 = r26
            r55 = r24
            r56 = r23
            r57 = r22
            r58 = r20
            r59 = r19
            r60 = r18
            r61 = r17
            r62 = r16
            r63 = r15
            r64 = r14
            r65 = r13
            r66 = r7
            r70 = r6
            r71 = r4
            r72 = r1
            r13 = r10
            r14 = r21
            r15 = r76
            r16 = r79
            r17 = r78
            r18 = r77
            r19 = r80
            r20 = r0
            r21 = r3
            r22 = r2
            r23 = r11
            r24 = r8
            r25 = r75
            r26 = r74
            r27 = r73
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72)
        L_0x027d:
            r64 = 0
            r63 = 2
            r61 = r9
            r62 = r12
            r65 = r68
            r66 = r69
            X.AnonymousClass7UW.A00(r61, r62, r63, r64, r65, r66, r67)
            goto L_0x056f
        L_0x028e:
            r12 = 0
            goto L_0x027d
        L_0x0290:
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            java.lang.Object r0 = r2.A01
            X.Gte r0 = (X.C53749Gte) r0
            com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel r0 = r0.A00
            r0.A09(r9, r6, r5)
            goto L_0x056f
        L_0x02a1:
            X.5Wy r5 = (X.C286575Wy) r5
            int r1 = X.C51968G9o.A0D(r9)
            r0 = 16
            if (r1 != r0) goto L_0x02b1
            boolean r0 = r5.Bwn()
            if (r0 != 0) goto L_0x0572
        L_0x02b1:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x02bf
            r1 = 1860994643(0x6eec8653, float:3.6600425E28)
            java.lang.String r0 = "com.instagram.wonderwall.ui.compose.screens.WallPostPreviewScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WallPostPreviewScreen.kt:102)"
            X.0fL.A01(r1, r0)
        L_0x02bf:
            java.lang.Object r1 = r2.A01
            com.instagram.wonderwall.model.WallPostInfo r1 = (com.instagram.wonderwall.model.WallPostInfo) r1
            r0 = 0
            X.I5C.A02(r5, r1, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x056f
            r0 = 249415360(0xeddc6c0, float:5.4672096E-30)
            goto L_0x056c
        L_0x02d2:
            X.5Wy r5 = (X.C286575Wy) r5
            int r1 = X.C51968G9o.A0D(r9)
            r0 = 16
            if (r1 != r0) goto L_0x02e2
            boolean r0 = r5.Bwn()
            if (r0 != 0) goto L_0x0572
        L_0x02e2:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x02f0
            r1 = 700670605(0x29c3628d, float:8.6768354E-14)
            java.lang.String r0 = "com.instagram.wonderwall.ui.compose.components.WallPost.<anonymous>.<anonymous>.<anonymous> (WallPost.kt:76)"
            X.0fL.A01(r1, r0)
        L_0x02f0:
            java.lang.Object r1 = r2.A01
            com.instagram.wonderwall.model.WallPostInfo r1 = (com.instagram.wonderwall.model.WallPostInfo) r1
            r0 = 0
            X.I5C.A01(r5, r1, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x056f
            r0 = -1366285010(0xffffffffae90252e, float:-6.554966E-11)
            goto L_0x056c
        L_0x0303:
            boolean r3 = X.AnonymousClass7TE.A1a(r5)
            java.lang.Object r0 = r2.A01
            X.Dky r0 = (X.C46771Dky) r0
            X.2Fj r1 = r0.A01
            java.lang.Object r0 = r1.A02()
            if (r0 == 0) goto L_0x031c
            X.DrZ r0 = (X.C47158DrZ) r0
            r0.A03 = r3
            r1.A0A(r0)
            goto L_0x056f
        L_0x031c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0321:
            X.5Wy r5 = (X.C286575Wy) r5
            int r1 = X.C51968G9o.A0E(r9)
            r0 = 16
            if (r1 != r0) goto L_0x0331
            boolean r0 = r5.Bwn()
            if (r0 != 0) goto L_0x0572
        L_0x0331:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x033f
            r1 = -1512935001(0xffffffffa5d271a7, float:-3.6506207E-16)
            java.lang.String r0 = "com.instagram.user.userlist.ui.LikesListScreen.<anonymous>.<anonymous>.<anonymous> (LikesListComposeFragment.kt:366)"
            X.0fL.A01(r1, r0)
        L_0x033f:
            X.4bM r0 = X.AnonymousClass5YA.A01
            java.lang.Object r3 = r5.AJO(r0)
            java.lang.Object r0 = r2.A01
            X.5Oz r0 = (X.C284945Oz) r0
            X.4cd r3 = (X.C268024cd) r3
            java.lang.Object r0 = r0.getValue()
            X.5bF r0 = (X.C288025bF) r0
            long r0 = r0.A00
            long r3 = r3.Ezx(r0)
            X.5Qk r2 = androidx.compose.ui.Modifier.A00
            float r1 = X.C51971G9r.A01(r3)
            float r0 = X.C51972G9s.A00(r3)
            androidx.compose.ui.Modifier r0 = X.C287205Zk.A0G(r2, r1, r0)
            X.C289585dr.A00(r5, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x056f
            r0 = -1908900101(0xffffffff8e387efb, float:-2.274089E-30)
            goto L_0x056c
        L_0x0373:
            X.5Wy r5 = (X.C286575Wy) r5
            int r0 = X.G9t.A0j(r9, r6)
            r1 = r0 & 81
            r0 = 16
            if (r1 != r0) goto L_0x0385
            boolean r0 = r5.Bwn()
            if (r0 != 0) goto L_0x0572
        L_0x0385:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0393
            r1 = 859892919(0x3340ecb7, float:4.4918774E-8)
            java.lang.String r0 = "com.instagram.user.userlist.ui.LikesListScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LikesListComposeFragment.kt:351)"
            X.0fL.A01(r1, r0)
        L_0x0393:
            java.lang.Object r0 = r2.A01
            X.Drt r0 = (X.C47178Drt) r0
            java.lang.String r0 = r0.A07
            int r1 = r0.length()
            r0 = 2131968487(0x7f1341e7, float:1.957387E38)
            if (r1 <= 0) goto L_0x03a5
            r0 = 2131968486(0x7f1341e6, float:1.9573868E38)
        L_0x03a5:
            java.lang.String r8 = X.C288035bG.A00(r5, r0)
            X.5Qk r0 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r6 = X.C287195Zj.A04(r0)
            X.5Z4 r7 = X.C51966G9m.A0h(r5)
            long r9 = X.C51966G9m.A0M(r5)
            X.AnonymousClass5ZZ.A0W(r5, r6, r7, r8, r9)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x056f
            r0 = 2077457933(0x7bd37e0d, float:2.1962625E36)
            goto L_0x056c
        L_0x03c5:
            X.5Wy r5 = (X.C286575Wy) r5
            int r1 = X.C51968G9o.A0E(r9)
            r0 = 16
            if (r1 != r0) goto L_0x03d5
            boolean r0 = r5.Bwn()
            if (r0 != 0) goto L_0x0572
        L_0x03d5:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x03e3
            r1 = 255863489(0xf402ac1, float:9.474565E-30)
            java.lang.String r0 = "com.instagram.user.userlist.ui.LikesListScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LikesListComposeFragment.kt:310)"
            X.0fL.A01(r1, r0)
        L_0x03e3:
            java.lang.Object r0 = r2.A01
            X.Drt r0 = (X.C47178Drt) r0
            int r1 = r0.A00
            r0 = 0
            X.C56670I6z.A01(r5, r1, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x056f
            r0 = -772766735(0xffffffffd1f083f1, float:-1.2912572E11)
            goto L_0x056c
        L_0x03f8:
            X.5Wy r5 = (X.C286575Wy) r5
            int r1 = X.C51968G9o.A0E(r9)
            r0 = 16
            if (r1 != r0) goto L_0x0408
            boolean r0 = r5.Bwn()
            if (r0 != 0) goto L_0x0572
        L_0x0408:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0416
            r1 = -735439470(0xffffffffd42a1592, float:-2.92202532E12)
            java.lang.String r0 = "com.instagram.user.userlist.ui.LikesListScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LikesListComposeFragment.kt:307)"
            X.0fL.A01(r1, r0)
        L_0x0416:
            java.lang.Object r1 = r2.A01
            X.JMH r1 = (X.JMH) r1
            r0 = 8
            X.C56670I6z.A07(r5, r1, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x056f
            r0 = -1241702134(0xffffffffb5fd210a, float:-1.8859585E-6)
            goto L_0x056c
        L_0x042a:
            X.Hrm r6 = (X.C56039Hrm) r6
            r7 = 0
            X.AnonymousClass7TF.A1B(r6, r7, r9)
            android.content.Context r4 = r6.A01
            X.F3q r3 = r6.A00()
            java.lang.Object r1 = r2.A01
            r0 = 32
            X.Iw8 r10 = X.C58699Iw8.A00(r5, r9, r6, r1, r0)
            java.lang.Class<X.JNh> r6 = X.C59535JNh.class
            X.8gt r5 = X.C361838gt.HARMONIZATION_F
            boolean r0 = X.C250563lf.A0j()
            if (r0 == 0) goto L_0x046f
            X.8gt r5 = X.C361838gt.THREE_C
        L_0x044a:
            boolean r1 = r3.A01
            X.Gnu r0 = new X.Gnu
            r0.<init>(r5, r1)
            X.0eP r1 = X.AnonymousClass7TE.A1L(r6, r0)
            java.lang.Class<X.F3q> r0 = X.C49726F3q.class
            X.0eP r0 = X.AnonymousClass7TE.A1L(r0, r3)
            X.0eP[] r2 = new X.0eP[]{r1, r0}
            X.AnonymousClass90M.A01(r4)
            java.lang.Object r1 = r10.invoke()
            X.3mp r1 = (X.C251263mp) r1
            r0 = 0
            X.9d7 r6 = new X.9d7
            r6.<init>(r1, r2, r0)
            return r6
        L_0x046f:
            X.Hyv r9 = X.C56463Hyv.A00
            X.08y r0 = X.09i.A0A     // Catch:{ IllegalStateException -> 0x0483 }
            com.instagram.common.session.UserSession r8 = r0.A08(r9)     // Catch:{ IllegalStateException -> 0x0483 }
            X.0Tu r2 = X.0Tu.A05     // Catch:{ IllegalStateException -> 0x0483 }
            r0 = 36327572124154382(0x810fbc00033a0e, double:3.037041118482419E-306)
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r2, r8, r0)     // Catch:{ IllegalStateException -> 0x0483 }
            goto L_0x0487
        L_0x0483:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
        L_0x0487:
            X.0qQ.A0A(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x04d5
            X.0Tu r8 = X.0Tu.A05
            r0 = 18311099145597950(0x410dd9000533fe, double:1.897330759929076E-307)
            boolean r0 = X.1AW.A06(r8, r0)
            if (r0 != 0) goto L_0x04d5
            X.08y r0 = X.09i.A0A     // Catch:{ IllegalStateException -> 0x04ad }
            com.instagram.common.session.UserSession r2 = r0.A08(r9)     // Catch:{ IllegalStateException -> 0x04ad }
            r0 = 36327572124088845(0x810fbc00023a0d, double:3.037041118440973E-306)
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r8, r2, r0)     // Catch:{ IllegalStateException -> 0x04ad }
            goto L_0x04b1
        L_0x04ad:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
        L_0x04b1:
            X.0qQ.A0A(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x04d1
            r0 = 18311099145532413(0x410dd9000433fd, double:1.897330759903172E-307)
            boolean r0 = X.1AW.A06(r8, r0)
            if (r0 != 0) goto L_0x04d1
            X.0Tu r2 = X.0Tu.A06
            r0 = 2324146493382268545(0x204106ec00051681, double:2.539869106772962E-153)
            X.1AW.A06(r2, r0)
            goto L_0x044a
        L_0x04d1:
            X.8gt r5 = X.C361838gt.THREE_A
            goto L_0x044a
        L_0x04d5:
            X.8gt r5 = X.C361838gt.THREE_B
            goto L_0x044a
        L_0x04d9:
            X.5Wy r5 = (X.C286575Wy) r5
            int r1 = X.C51968G9o.A0D(r9)
            r0 = 16
            if (r1 != r0) goto L_0x04e9
            boolean r0 = r5.Bwn()
            if (r0 != 0) goto L_0x0572
        L_0x04e9:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x04f7
            r1 = 177665329(0xa96f531, float:1.4536705E-32)
            java.lang.String r0 = "com.instagram.schools.management.ui.SchoolOnboardingSwitchSchoolContent.<anonymous> (SchoolOnboardingSwitchSchoolContent.kt:38)"
            X.0fL.A01(r1, r0)
        L_0x04f7:
            java.lang.Object r1 = r2.A01
            com.instagram.schools.management.data.SchoolInfo r1 = (com.instagram.schools.management.data.SchoolInfo) r1
            if (r1 == 0) goto L_0x0511
            r0 = 929833975(0x376c23f7, float:1.407507E-5)
            r5.ExS(r0)
            r0 = 0
            X.I59.A03(r5, r1, r0)
        L_0x0507:
            boolean r0 = X.C51970G9q.A1Z(r5)
            if (r0 == 0) goto L_0x056f
            r0 = -184646618(0xfffffffff4fe8426, float:-1.6131881E32)
            goto L_0x056c
        L_0x0511:
            r0 = 929894425(0x376d1019, float:1.4130049E-5)
            r5.ExS(r0)
            java.lang.Object r4 = X.C51966G9m.A16(r5)
            X.0gF r3 = X.C60340gF.A00
            r0 = -1355474319(0xffffffffaf351a71, float:-1.6471248E-10)
            boolean r1 = X.C51967G9n.A1Z(r5, r4, r0)
            java.lang.Object r0 = r5.ECw()
            if (r1 != 0) goto L_0x052e
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r0 != r1) goto L_0x0539
        L_0x052e:
            r2 = 0
            r1 = 17
            X.MFx r0 = new X.MFx
            r0.<init>(r4, r2, r1)
            r5.FLL(r0)
        L_0x0539:
            X.C51972G9s.A10(r5, r0, r3)
            goto L_0x0507
        L_0x053d:
            X.5Wy r5 = (X.C286575Wy) r5
            int r1 = X.C51968G9o.A0D(r9)
            r0 = 16
            if (r1 != r0) goto L_0x054d
            boolean r0 = r5.Bwn()
            if (r0 != 0) goto L_0x0572
        L_0x054d:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x055b
            r1 = 1967005363(0x753e1eb3, float:2.4100563E32)
            java.lang.String r0 = "com.instagram.schools.management.ui.SchoolOnboardingAddSchoolContent.<anonymous> (SchoolOnboardingAddSchoolContent.kt:36)"
            X.0fL.A01(r1, r0)
        L_0x055b:
            java.lang.Object r1 = r2.A01
            X.0sa r1 = (X.C62320sa) r1
            r0 = 0
            X.I38.A02(r1, r5, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x056f
            r0 = 135752541(0x8176b5d, float:4.5566115E-34)
        L_0x056c:
            X.0fL.A00(r0)
        L_0x056f:
            X.0gF r9 = X.C60340gF.A00
            return r9
        L_0x0572:
            r5.Evl()
            goto L_0x056f
        L_0x0576:
            X.4um r6 = (X.C277274um) r6
            X.GZi r5 = (X.C52609GZi) r5
            int r0 = X.AnonymousClass7TE.A0M(r9)
            X.AnonymousClass7TG.A1N(r6, r5)
            r5.setCurrentIndex(r0)
            java.lang.Object r0 = r2.A01
            X.GG5 r0 = (X.GG5) r0
            X.GFO r0 = r0.A00
            boolean r0 = r0.A0E()
            r5.A07 = r0
            r0 = 21
            X.IwE r0 = X.C58705IwE.A01(r5, r0)
        L_0x0596:
            X.4uo r6 = r6.A00(r0)
        L_0x059a:
            return r6
        L_0x059b:
            r2 = move-exception
            r0 = 1278(0x4fe, float:1.791E-42)
            java.lang.String r1 = X.C273654mx.A00(r0)
            java.lang.String r0 = "Failed to invoke queryEventsForSelf"
            X.0KC.A0G(r1, r0, r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JGX.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
