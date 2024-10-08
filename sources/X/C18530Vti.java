package X;

/* renamed from: X.Vti  reason: case insensitive filesystem */
public final class C18530Vti {
    public static final C18530Vti A00 = new Object();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: com.instagram.common.ui.widget.imageview.IgImageView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v1, resolved type: com.instagram.igds.components.imagebutton.IgImageButton} */
    /* JADX WARNING: type inference failed for: r3v4, types: [com.instagram.igds.components.imagebutton.IgImageButton, android.view.View, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x023b, code lost:
        if (r0 == false) goto L_0x023d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.content.Context r52, androidx.fragment.app.Fragment r53, X.C296995qz r54, com.instagram.common.session.UserSession r55, X.C296905qq r56, X.WW4 r57, X.C14906UEl r58, X.C52435GSn r59, X.X9Q r60, X.AnonymousClass4DU r61, java.lang.String r62, boolean r63) {
        /*
            r51 = this;
            r8 = 0
            r3 = r53
            X.0qQ.A0B(r3, r8)
            r7 = 1
            r2 = 3
            r50 = r57
            r49 = r61
            r1 = r49
            r0 = r50
            X.DbW.A1N(r1, r2, r0)
            r26 = 8
            r11 = r55
            r1 = r62
            r0 = r26
            X.AnonymousClass7TF.A1G(r11, r0, r1)
            java.lang.String r6 = r49.getModuleName()
            X.0qQ.A0B(r6, r7)
            X.GWn r25 = new X.GWn
            r9 = r59
            r0 = r25
            r0.<init>(r11, r9)
            X.GWp r24 = new X.GWp
            r12 = r52
            r13 = r24
            r14 = r12
            r15 = r3
            r16 = r11
            r17 = r0
            r18 = r49
            r19 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19)
            X.GWo r23 = new X.GWo
            r0 = r23
            r0.<init>(r11)
            java.lang.String r1 = r49.getModuleName()
            java.lang.String r22 = "explore_popular"
            r0 = r22
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0093
            X.3Ds r21 = X.C238863Ds.EXPLORE_GRID_ADS_PROFILE_NAME
        L_0x0058:
            if (r0 == 0) goto L_0x0090
            X.3Ds r20 = X.C238863Ds.EXPLORE_GRID_ADS_CTA_BUTTON
        L_0x005c:
            r10 = r58
            r10.A00 = r9
            android.widget.RelativeLayout r1 = r10.A03
            r1.setVisibility(r8)
            boolean r16 = X.C321536uL.A02(r11)
            X.1se r0 = X.1sd.A00(r11)
            X.1Xj r5 = r9.BPf()
            boolean r0 = r0.A05(r5)
            r14 = r54
            if (r0 == 0) goto L_0x0096
            r0 = r26
            r1.setVisibility(r0)
            com.instagram.igds.components.imagebutton.IgImageButton r2 = r10.A0G
            int r1 = r14.A01
            int r0 = r14.A00
            r9 = 0
            r10 = r49
            r11 = r5
            r12 = r2
            r13 = r1
            r14 = r0
            r15 = r8
            X.OSK.A00(r9, r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0090:
            X.3Ds r20 = X.C238863Ds.SEARCH_GRID_ADS_CTA_BUTTON
            goto L_0x005c
        L_0x0093:
            X.3Ds r21 = X.C238863Ds.SEARCH_GRID_ADS_PROFILE_NAME
            goto L_0x0058
        L_0x0096:
            android.widget.TextView r13 = r10.A04
            android.widget.TextView r4 = r10.A05
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r10.A0E
            r48 = r0
            com.instagram.common.ui.base.IgFrameLayout r3 = r10.A06
            com.instagram.common.ui.base.IgTextView r0 = r10.A0B
            r47 = r0
            com.instagram.common.ui.base.IgFrameLayout r0 = r10.A08
            r46 = r0
            com.instagram.common.ui.base.IgLinearLayout r2 = r10.A0A
            r2.setVisibility(r8)
            android.content.res.Resources r15 = r12.getResources()
            r1 = 2131974142(0x7f1357fe, float:1.958534E38)
            java.lang.String r0 = r9.A04()
            if (r0 != 0) goto L_0x00bc
            java.lang.String r0 = ""
        L_0x00bc:
            java.lang.String r0 = X.AnonymousClass7TF.A0e(r15, r0, r1)
            r2.setContentDescription(r0)
            com.instagram.common.ui.base.IgView r15 = r10.A0D
            r15.setVisibility(r8)
            android.graphics.drawable.GradientDrawable$Orientation r2 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            r17 = 2
            r0 = 2131100175(0x7f06020f, float:1.7812724E38)
            int r1 = r12.getColor(r0)
            r0 = 2131099788(0x7f06008c, float:1.781194E38)
            int r0 = r12.getColor(r0)
            int[] r1 = new int[]{r1, r0}
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>(r2, r1)
            r15.setBackground(r0)
            java.lang.String r1 = X.1sx.A09(r5, r8)
            if (r1 == 0) goto L_0x039f
            int r0 = r1.length()
            if (r0 == 0) goto L_0x039f
            int r1 = android.graphics.Color.parseColor(r1)
        L_0x00f6:
            com.instagram.common.ui.base.IgFrameLayout r0 = r10.A07
            r0.setBackgroundColor(r1)
            com.instagram.model.mediasize.ExtendedImageUrl r1 = r5.A1n(r12)
            if (r1 == 0) goto L_0x0396
            r34 = r56
            r0 = r34
            int r0 = r0.A02
            if (r0 != r7) goto L_0x038e
            r0 = r34
            int r2 = r0.A04
            r0 = r17
            if (r2 != r0) goto L_0x038e
            r16 = 1056796836(0x3efd70a4, float:0.495)
        L_0x0114:
            com.instagram.igds.components.imagebutton.IgImageButton r2 = r10.A0G
            r42 = r63
            r15 = r49
            r0 = r42
            r2.A0F(r15, r1, r0)
            r0 = r16
            r2.A00 = r0
            java.lang.String r0 = r5.getId()
            r2.setTransitionName(r0)
            X.ICB r19 = new X.ICB
            r27 = r19
            r28 = r17
            r29 = r14
            r30 = r50
            r31 = r24
            r32 = r9
            r27.<init>(r28, r29, r30, r31, r32)
            r0 = r22
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x015a
            java.lang.String r0 = "serp_top"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x038a
            X.0Tu r15 = X.0Tu.A05
            r17 = 36318780326287819(0x8107bd000619cb, double:3.031481150109876E-306)
            r0 = r17
            boolean r0 = X.182.A06(r15, r11, r0)
            if (r0 == 0) goto L_0x038a
        L_0x015a:
            X.WBt r17 = new X.WBt
            r1 = r17
            r0 = r50
            r1.<init>(r7, r9, r14, r0)
            r28 = 11
            X.Ojz r0 = new X.Ojz
            r27 = r0
            r29 = r23
            r30 = r9
            r31 = r49
            r32 = r12
            r27.<init>((int) r28, (java.lang.Object) r29, (java.lang.Object) r30, (java.lang.Object) r31, (java.lang.Object) r32)
            com.instagram.common.ui.base.IgFrameLayout r15 = r10.A09
            X.AnonymousClass0fU.A00(r0, r15)
            android.content.res.Resources r1 = r12.getResources()
            r0 = 2131966728(0x7f133b08, float:1.9570302E38)
            X.DbT.A1A(r1, r15, r0)
        L_0x0183:
            X.WX5 r1 = new X.WX5
            r0 = r50
            r1.<init>(r0, r9)
            r33 = 0
            int r0 = r14.A01
            r15 = r0
            int r0 = r14.A00
            r14 = r0
            r0 = r34
            float r0 = r0.A00
            r27 = r19
            r28 = r17
            r29 = r49
            r30 = r11
            r31 = r5
            r32 = r1
            r34 = r2
            r35 = r33
            r36 = r33
            r37 = r0
            r38 = r15
            r39 = r14
            r40 = r8
            r41 = r8
            r43 = r8
            r44 = r8
            r45 = r8
            X.C321466uD.A02(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            r14 = r60
            if (r60 == 0) goto L_0x01e8
            boolean r0 = r10 instanceof X.C15943UlD
            if (r0 == 0) goto L_0x01e8
            r0 = r10
            X.UlD r0 = (X.C15943UlD) r0
            com.instagram.discovery.ui.FixedAspectRatioVideoLayout r1 = r0.A00
            r0 = r49
            r1.setVideoSource(r5, r0)
            r0 = r16
            r1.setAspectRatio(r0)
            boolean r0 = r14.CcR(r5)
            int r0 = X.DbW.A00(r0)
            r2.setVisibility(r0)
            r0 = r19
            X.AnonymousClass0fU.A00(r0, r1)
            r0 = r10
            X.X7p r0 = (X.C20976X7p) r0
            r14.E6t(r0, r5)
        L_0x01e8:
            java.lang.String r0 = r9.A04()
            if (r0 == 0) goto L_0x0381
            r13.setVisibility(r8)
            r13.setText(r0)
        L_0x01f4:
            X.1Xy r0 = r5.A0C
            X.3lZ r0 = r0.getInjected()
            if (r0 == 0) goto L_0x0378
            java.lang.String r0 = r0.BKL()
            if (r0 == 0) goto L_0x0378
            r4.setVisibility(r8)
            r4.setText(r0)
        L_0x0208:
            r14 = r5
            com.instagram.user.model.User r0 = X.C51966G9m.A11(r5)
            if (r0 == 0) goto L_0x0375
            boolean r0 = r0.A2Q()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L_0x0217:
            X.3W1 r2 = r9.A00
            int r0 = r2.A03
            r15 = r22
            boolean r15 = r6.equals(r15)
            r6 = 1
            if (r15 == 0) goto L_0x0372
            boolean r1 = X.AnonymousClass7TF.A1Y(r1, r7)
            if (r1 == 0) goto L_0x0360
            boolean r0 = X.AnonymousClass6L4.A01(r12, r11, r5, r0)
            if (r0 == 0) goto L_0x0372
            X.0Tu r15 = X.0Tu.A05
            r0 = 36318849045961218(0x8107cd00091a02, double:3.031524608708045E-306)
            boolean r0 = X.182.A06(r15, r11, r0)
        L_0x023b:
            if (r0 != 0) goto L_0x0372
        L_0x023d:
            X.IBk r11 = new X.IBk
            r0 = r24
            r11.<init>(r7, r0, r9, r6)
            boolean r1 = r5.A5D()
            r0 = r5
            if (r1 == 0) goto L_0x0251
            X.1Xj r0 = r5.A1c(r8)
            if (r0 == 0) goto L_0x0357
        L_0x0251:
            java.util.List r0 = r0.A3P()
            java.lang.Object r0 = X.00k.A0J(r0)
            com.instagram.model.androidlink.AndroidLink r0 = (com.instagram.model.androidlink.AndroidLink) r0
            if (r0 == 0) goto L_0x0357
            java.lang.String r0 = r0.CGH()
            if (r0 == 0) goto L_0x0357
            boolean r0 = r5.A5D()
            if (r0 == 0) goto L_0x026f
            X.1Xj r14 = r5.A1c(r8)
            if (r14 == 0) goto L_0x0357
        L_0x026f:
            X.1Xy r0 = r14.A0C
            java.lang.String r0 = r0.BMq()
            if (r0 == 0) goto L_0x0357
            r1 = 0
            r15 = r25
            r14 = r20
            r0 = r49
            r15.A00(r3, r14, r0, r8)
            r15 = 16
            X.ID2 r14 = new X.ID2
            r0 = r24
            r14.<init>((int) r15, (java.lang.Object) r0, (java.lang.Object) r9)
            r3.setVisibility(r8)
            X.AnonymousClass0fU.A00(r14, r3)
            android.content.res.Resources r9 = r12.getResources()
            r0 = 2131957176(0x7f1315b8, float:1.9550929E38)
            X.DbT.A1A(r9, r3, r0)
            boolean r3 = r5.A5D()
            r0 = r5
            if (r3 == 0) goto L_0x034f
            X.1Xj r0 = r5.A1c(r8)
            if (r0 != 0) goto L_0x034f
            r3 = 0
        L_0x02a8:
            r0 = r47
            r0.setText(r3)
            r2.A0L(r10, r1, r8)
        L_0x02b0:
            r0 = r46
            r0.setVisibility(r8)
            r9 = r21
            r3 = r25
            r1 = r0
            r0 = r49
            r3.A00(r1, r9, r0, r6)
            X.AnonymousClass0fU.A00(r11, r1)
            com.instagram.common.ui.base.IgView r6 = r10.A0C
            r6.setVisibility(r8)
            android.view.ViewGroup$LayoutParams r1 = r6.getLayoutParams()
            r0 = 329(0x149, float:4.61E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            r0 = 54
            float r0 = X.0nA.A04(r12, r0)
            int r0 = (int) r0
            r1.height = r0
            r6.setLayoutParams(r1)
            android.graphics.drawable.GradientDrawable$Orientation r3 = android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP
            r0 = 2131100175(0x7f06020f, float:1.7812724E38)
            int r1 = r12.getColor(r0)
            r0 = 2131099784(0x7f060088, float:1.781193E38)
            int r0 = r12.getColor(r0)
            int[] r1 = new int[]{r1, r0}
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>(r3, r1)
            r6.setBackground(r0)
            boolean r0 = r5.A5D()
            if (r0 == 0) goto L_0x0347
            r0 = r48
            r0.setVisibility(r8)
        L_0x0307:
            boolean r0 = r10 instanceof X.C15943UlD
            if (r0 == 0) goto L_0x0344
            r0 = r10
            X.UlD r0 = (X.C15943UlD) r0
            X.TuD r1 = r0.A01
        L_0x0310:
            if (r1 == 0) goto L_0x031c
            X.339 r0 = r50.CGA()
            X.3fb r0 = X.C263174Jk.A00(r5, r0, r2)
            r1.A02 = r0
        L_0x031c:
            com.instagram.igds.components.imagebutton.IgImageButton r3 = r10.A0G
            r0 = r47
            X.0qQ.A0B(r0, r7)
            r2 = 2131438001(0x7f0b29b1, float:1.8497917E38)
            X.3aa r1 = X.C244063aa.CTA
            r0.setTag(r2, r1)
            X.0qQ.A0B(r13, r7)
            X.3aa r0 = X.C244063aa.TITLE
            r13.setTag(r2, r0)
            X.0qQ.A0B(r4, r7)
            X.3aa r0 = X.C244063aa.SPONSORED_LABEL
            r4.setTag(r2, r0)
            X.0qQ.A0B(r3, r7)
            X.3aa r0 = X.C244063aa.MEDIA
            r3.setTag(r2, r0)
            return
        L_0x0344:
            X.TuD r1 = r10.A0F
            goto L_0x0310
        L_0x0347:
            r1 = r48
            r0 = r26
            r1.setVisibility(r0)
            goto L_0x0307
        L_0x034f:
            X.1Xy r0 = r0.A0C
            java.lang.String r3 = r0.BMq()
            goto L_0x02a8
        L_0x0357:
            java.lang.String r1 = "Missing CTA"
            java.lang.String r0 = "AdsGridViewBinder"
            X.0wb.A03(r0, r1)
            goto L_0x02b0
        L_0x0360:
            X.1Xy r0 = r5.A0C
            X.4xI r0 = r0.Aq4()
            boolean r0 = X.C2803051e.A01(r0, r11)
            if (r0 == 0) goto L_0x0372
            boolean r0 = X.C2803051e.A03(r11)
            goto L_0x023b
        L_0x0372:
            r6 = 0
            goto L_0x023d
        L_0x0375:
            r1 = 0
            goto L_0x0217
        L_0x0378:
            java.lang.String r1 = "Missing Sponsored Label"
            java.lang.String r0 = "AdsGridViewBinder"
            X.0wb.A03(r0, r1)
            goto L_0x0208
        L_0x0381:
            java.lang.String r1 = "Missing Handle"
            java.lang.String r0 = "AdsGridViewBinder"
            X.0wb.A03(r0, r1)
            goto L_0x01f4
        L_0x038a:
            r17 = 0
            goto L_0x0183
        L_0x038e:
            r0 = r34
            float r0 = r0.A00
            r16 = r0
            goto L_0x0114
        L_0x0396:
            java.lang.String r1 = "Missing Image"
            java.lang.String r0 = "AdsGridViewBinder"
            X.0wb.A03(r0, r1)
            goto L_0x01e8
        L_0x039f:
            r0 = 2131099989(0x7f060155, float:1.7812347E38)
            int r1 = r12.getColor(r0)
            goto L_0x00f6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18530Vti.A00(android.content.Context, androidx.fragment.app.Fragment, X.5qz, com.instagram.common.session.UserSession, X.5qq, X.WW4, X.UEl, X.GSn, X.X9Q, X.4DU, java.lang.String, boolean):void");
    }
}
