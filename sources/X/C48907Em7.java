package X;

/* renamed from: X.Em7  reason: case insensitive filesystem */
public abstract class C48907Em7 {
    /* JADX WARNING: type inference failed for: r0v25, types: [android.view.View$OnClickListener] */
    /* JADX WARNING: type inference failed for: r7v22, types: [X.FOC] */
    /* JADX WARNING: type inference failed for: r18v3, types: [X.FOX] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.content.Context r36, X.AnonymousClass0iw r37, com.instagram.common.session.UserSession r38, X.AnonymousClass32K r39, X.F1A r40, X.G88 r41, X.AnonymousClass3UM r42, java.lang.String r43, java.lang.String r44, int r45, boolean r46, boolean r47, boolean r48, boolean r49, boolean r50, boolean r51) {
        /*
            r1 = 0
            r0 = r36
            X.0qQ.A0B(r0, r1)
            r13 = r37
            r3 = r38
            r2 = r40
            X.AnonymousClass7TG.A1U(r3, r13, r2)
            r0 = 5
            r15 = r42
            X.0qQ.A0B(r15, r0)
            r4 = 11
            r35 = r39
            r6 = r41
            r0 = r35
            X.DbW.A1P(r6, r4, r0)
            android.content.res.Resources r4 = r36.getResources()
            r0 = 2131165196(0x7f07000c, float:1.7944602E38)
            r17 = r45
            if (r45 != 0) goto L_0x002e
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
        L_0x002e:
            int r0 = r4.getDimensionPixelSize(r0)
            android.view.View r5 = r2.A03
            X.0nA.A0c(r5, r0)
            java.lang.String r0 = X.DbU.A0q(r15)
            java.lang.Integer r0 = r6.Auv(r0)
            if (r0 == 0) goto L_0x029c
            int r4 = r0.intValue()
        L_0x0045:
            r34 = r44
            r0 = r34
            r6.DgN(r15, r0, r4)
            r5.setBackgroundColor(r1)
            r16 = 2
            X.FOt r14 = new X.FOt
            r7 = r14
            r8 = r6
            r9 = r15
            r10 = r0
            r11 = r17
            r12 = r16
            r7.<init>(r8, r9, r10, r11, r12)
            com.instagram.model.reels.Reel r8 = r15.BkU(r3)
            com.instagram.ui.widget.gradientspinner.GradientSpinner r7 = r2.A0F
            android.view.ViewGroup$LayoutParams r9 = r7.getLayoutParams()
            android.content.res.Resources r4 = r7.getResources()
            r10 = 2131165236(0x7f070034, float:1.7944683E38)
            int r0 = X.DbS.A03(r4, r10)
            r9.height = r0
            int r0 = X.DbS.A03(r4, r10)
            r9.width = r0
            r0 = 0
            if (r8 == 0) goto L_0x0289
            boolean r4 = r8.A15(r3)
            if (r4 == 0) goto L_0x008a
            boolean r4 = r8.A0z(r3)
            if (r4 != 0) goto L_0x0289
        L_0x008a:
            java.lang.String r4 = r8.getId()
            r2.A02 = r4
            boolean r4 = r8.A16(r3)
            if (r4 == 0) goto L_0x0284
            r7.A04()
        L_0x0099:
            r7.setVisibility(r1)
            com.instagram.common.ui.widget.imageview.CircularImageView r7 = r2.A0E
            r7.setClickable(r1)
            X.3NM r8 = r2.A0D
            if (r8 == 0) goto L_0x00aa
            android.widget.FrameLayout r4 = r2.A05
            r4.setOnTouchListener(r8)
        L_0x00aa:
            X.3NM r4 = r2.A0D
            if (r4 == 0) goto L_0x00b1
            r4.A02()
        L_0x00b1:
            X.6VJ r8 = r2.A01
            if (r8 == 0) goto L_0x00ba
            java.lang.Integer r4 = X.AnonymousClass05K.A0C
            r8.A05(r4)
        L_0x00ba:
            r2.A01 = r0
            X.Exh r8 = new X.Exh
            r8.<init>(r2, r6, r11)
            r2.A00 = r8
            com.instagram.user.model.User r4 = r15.CCd()
            X.DbU.A1S(r13, r7, r4)
            android.view.ViewGroup$LayoutParams r9 = r7.getLayoutParams()
            android.content.res.Resources r8 = r7.getResources()
            int r7 = X.DbS.A03(r8, r10)
            r9.height = r7
            int r7 = X.DbS.A03(r8, r10)
            r9.width = r7
            android.widget.TextView r8 = r2.A09
            X.DbU.A1H(r8, r4)
            boolean r7 = r4.isVerified()
            X.C244273av.A0B(r8, r7)
            android.view.ViewStub r10 = r2.A04
            boolean r7 = X.C308436Ug.A02(r4)
            r9 = 8
            int r7 = X.DbW.A01(r7)
            r10.setVisibility(r7)
            java.lang.String r10 = r4.B8Q()
            java.lang.String r7 = r4.getUsername()
            boolean r10 = X.0qQ.A0K(r10, r7)
            android.widget.TextView r7 = r2.A07
            if (r10 != 0) goto L_0x027f
            java.lang.String r9 = r4.B8Q()
            r7.setText(r9)
            r7.setVisibility(r1)
        L_0x0113:
            android.widget.LinearLayout r10 = r2.A06
            android.content.res.Resources r9 = r10.getResources()
            int r9 = X.AnonymousClass7TE.A0F(r9)
            X.0nA.A0Z(r10, r9)
            java.lang.String r10 = r15.BxN()
            int r9 = r10.length()
            r12 = 1
            if (r9 <= 0) goto L_0x0276
            if (r46 == 0) goto L_0x0276
            android.widget.TextView r9 = r2.A08
            r9.setText(r10)
            r9.setMaxLines(r12)
            r9.setVisibility(r1)
        L_0x0138:
            java.lang.String r26 = r13.getModuleName()
            com.google.common.collect.ImmutableList r27 = r15.getSocialContextFacepileUsers()
            if (r47 == 0) goto L_0x01ac
            if (r49 != 0) goto L_0x014f
            com.instagram.user.model.User r10 = r15.CCd()
            java.lang.String r10 = r10.B8Q()
            r8.setText(r10)
        L_0x014f:
            r8 = 8
            r7.setVisibility(r8)
            if (r27 == 0) goto L_0x026c
            boolean r7 = r27.isEmpty()
            if (r7 != 0) goto L_0x026c
            r7 = r16
            r9.setMaxLines(r7)
            com.instagram.common.ui.base.IgSimpleImageView r8 = r2.A0A
            android.content.Context r7 = r8.getContext()
            X.0qQ.A0A(r7)
            r9 = 23
            if (r49 == 0) goto L_0x0170
            r9 = 18
        L_0x0170:
            int r28 = X.DbS.A02(r7, r9)
            java.lang.Integer r21 = X.AnonymousClass05K.A01
            X.0Tu r11 = X.0Tu.A05
            r9 = 36325501949719552(0x810dda00003400, double:3.035731931833909E-306)
            boolean r29 = X.182.A06(r11, r3, r9)
            r9 = 1059816735(0x3f2b851f, float:0.67)
            java.lang.Float r20 = java.lang.Float.valueOf(r9)
            int r9 = X.DbS.A02(r7, r12)
            java.lang.Integer r23 = java.lang.Integer.valueOf(r9)
            r22 = r0
            r24 = r0
            r25 = r0
            r30 = r12
            r31 = r1
            r32 = r12
            r33 = r1
            r18 = r7
            r19 = r0
            android.graphics.drawable.Drawable r0 = X.C244283aw.A00(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r8.setImageDrawable(r0)
            r8.setVisibility(r1)
        L_0x01ac:
            com.instagram.user.follow.FollowButton r8 = r2.A0G
            r8.setVisibility(r1)
            if (r50 == 0) goto L_0x01c1
            android.content.res.Resources r7 = r36.getResources()
            r0 = 2131165507(0x7f070143, float:1.7945233E38)
            int r0 = X.DbS.A03(r7, r0)
            r8.setMinWidth(r0)
        L_0x01c1:
            r0 = r51
            r8.A0A = r0
            X.4at r7 = r8.A0J
            X.EUD r0 = new X.EUD
            r18 = r0
            r19 = r6
            r20 = r15
            r21 = r34
            r22 = r17
            r23 = r12
            r18.<init>(r19, r20, r21, r22, r23)
            r7.A07(r0)
            r0 = r43
            r7.A0K = r0
            r7.A03(r13, r3, r4)
            java.lang.String r0 = X.DbU.A0q(r15)
            X.C267154b3.A02(r8, r3, r0)
            android.util.DisplayMetrics r0 = X.AnonymousClass7TF.A0E(r36)
            int r8 = r0.widthPixels
            r0 = 1000(0x3e8, float:1.401E-42)
            r7 = 0
            if (r8 > r0) goto L_0x01f5
            r7 = 1
        L_0x01f5:
            com.instagram.user.model.FollowStatus r3 = X.DbV.A0i(r3, r4)
            if (r48 == 0) goto L_0x025f
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A05
            if (r3 == r0) goto L_0x025f
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A07
            if (r3 == r0) goto L_0x025f
            if (r7 == 0) goto L_0x0233
            com.instagram.common.ui.base.IgSimpleImageView r3 = r2.A0C
            r3.setVisibility(r1)
            r1 = 2131960866(0x7f132422, float:1.9558413E38)
            r0 = r36
            java.lang.String r0 = r0.getString(r1)
            java.lang.CharSequence[] r25 = new java.lang.CharSequence[]{r0}
            X.FOX r0 = new X.FOX
            r18 = r0
            r19 = r36
            r20 = r35
            r21 = r6
            r22 = r4
            r23 = r15
            r24 = r34
            r26 = r17
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
        L_0x022c:
            X.AnonymousClass0fU.A00(r0, r3)
        L_0x022f:
            X.AnonymousClass0fU.A00(r14, r5)
            return
        L_0x0233:
            com.instagram.common.ui.base.IgSimpleImageView r3 = r2.A0B
            r3.setVisibility(r1)
            if (r50 == 0) goto L_0x024f
            android.view.ViewGroup$MarginLayoutParams r2 = X.DbX.A0H(r3)
            android.content.res.Resources r1 = r36.getResources()
            r0 = 2131165196(0x7f07000c, float:1.7944602E38)
            int r0 = X.DbS.A03(r1, r0)
            r2.setMarginStart(r0)
            r3.setLayoutParams(r2)
        L_0x024f:
            X.FOC r0 = new X.FOC
            r7 = r0
            r8 = r6
            r9 = r15
            r10 = r4
            r11 = r34
            r12 = r17
            r13 = r16
            r7.<init>(r8, r9, r10, r11, r12, r13)
            goto L_0x022c
        L_0x025f:
            com.instagram.common.ui.base.IgSimpleImageView r0 = r2.A0B
            r1 = 8
            r0.setVisibility(r1)
            com.instagram.common.ui.base.IgSimpleImageView r0 = r2.A0C
            r0.setVisibility(r1)
            goto L_0x022f
        L_0x026c:
            com.instagram.common.ui.base.IgSimpleImageView r7 = r2.A0A
            r7.setVisibility(r8)
            r7.setImageDrawable(r0)
            goto L_0x01ac
        L_0x0276:
            android.widget.TextView r9 = r2.A08
            r10 = 8
            r9.setVisibility(r10)
            goto L_0x0138
        L_0x027f:
            r7.setVisibility(r9)
            goto L_0x0113
        L_0x0284:
            r7.A02()
            goto L_0x0099
        L_0x0289:
            r2.A02 = r0
            r4 = 8
            r7.setVisibility(r4)
            com.instagram.common.ui.widget.imageview.CircularImageView r7 = r2.A0E
            X.AnonymousClass0fU.A00(r14, r7)
            android.widget.FrameLayout r4 = r2.A05
            r4.setOnTouchListener(r0)
            goto L_0x00aa
        L_0x029c:
            r4 = r17
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48907Em7.A00(android.content.Context, X.0iw, com.instagram.common.session.UserSession, X.32K, X.F1A, X.G88, X.3UM, java.lang.String, java.lang.String, int, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }
}
