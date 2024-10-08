package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6se  reason: invalid class name and case insensitive filesystem */
public final class C320606se {
    public final C321686ua A00;
    public final C320486sS A01;
    public final C320326sC A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final C320596sd A05;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: android.widget.ImageView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: android.widget.ImageView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v19, resolved type: com.instagram.igds.components.imagebutton.IgImageButton} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: android.widget.ImageView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: android.widget.ImageView} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x02cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C320606se r28, X.C52320GNm r29, X.C66970Mg3 r30, X.C267324bN r31, X.C14226Ts8 r32, boolean r33) {
        /*
            r0 = r28
            X.6ua r1 = r0.A00
            if (r1 == 0) goto L_0x0009
            r1.D3T()
        L_0x0009:
            r2 = r30
            X.3v7 r8 = r2.A07
            r1 = r29
            X.1Xp r7 = r1.A00
            r3 = r32
            if (r7 == 0) goto L_0x0393
            r6 = 0
            r5 = -1
            X.3ed r4 = X.C256013v5.A00
            r11 = 0
            X.3ev r7 = X.C246473ef.A00(r7, r6, r4, r5, r11)
            X.0iw r6 = r0.A03
            r10 = 1
            r4 = 8
            float[] r9 = new float[r4]
            r12 = r11
            X.C256013v5.A02(r6, r7, r8, r9, r10, r11, r12)
            X.C256013v5.A04(r8)
            X.4bN r4 = r3.A01
            X.1Xj r7 = r4.A02
            if (r7 == 0) goto L_0x003b
            com.instagram.common.session.UserSession r6 = r3.A03
            X.0iw r5 = r3.A02
            java.lang.Integer r4 = X.AnonymousClass05K.A0Y
            X.I2F.A02(r7, r5, r6, r4)
        L_0x003b:
            X.Mg2 r6 = new X.Mg2
            r6.<init>(r0)
            if (r33 == 0) goto L_0x0370
            com.instagram.model.mediasize.SpritesheetInfo r12 = r1.A03
            if (r12 == 0) goto L_0x0370
            X.0eM r4 = r2.A09
            r32 = r4
            java.lang.Object r7 = r32.getValue()
            X.2eb r7 = (X.C71662eb) r7
            android.view.View r10 = r7.A01()
            com.instagram.clips.animatedthumbnail.AnimatedThumbnailView r10 = (com.instagram.clips.animatedthumbnail.AnimatedThumbnailView) r10
            r10.A0E = r6
            r4 = 1058013184(0x3f100000, float:0.5625)
            r10.A00 = r4
            X.0iw r11 = r0.A03
            com.instagram.common.session.UserSession r8 = r0.A04
            r9 = 0
            X.0Tu r6 = X.0Tu.A05
            r4 = 37158695541145689(0x8403a3000c0059, double:3.562646914053099E-306)
            double r13 = X.182.A00(r6, r8, r4)
            r4 = 36595745587333365(0x8203a3000608f5, double:3.206635096444669E-306)
            long r15 = X.182.A01(r6, r8, r4)
            r17 = r9
            r10.A0I(r11, r12, r13, r15, r17)
            r7.A03(r9)
            com.instagram.igds.components.imagebutton.IgImageButton r7 = r2.A08
            r4 = 8
            r7.setVisibility(r4)
            java.lang.Object r4 = r32.getValue()
            X.2eb r4 = (X.C71662eb) r4
            android.view.View r10 = r4.A01()
            X.0qQ.A0A(r10)
            com.instagram.igds.components.imagebutton.IgImageButton r10 = (com.instagram.igds.components.imagebutton.IgImageButton) r10
        L_0x0093:
            r17 = 0
            r4 = r17
            r10.setMediaOverlay(r4)
            com.instagram.common.session.UserSession r6 = r0.A04
            android.content.Context r5 = r7.getContext()
            boolean r4 = com.facebook.endtoend.EndToEnd.isRunningEndToEndTest()
            r15 = 1
            r13 = 0
            r11 = r31
            if (r4 == 0) goto L_0x0352
            android.content.res.Resources r9 = r5.getResources()
            r8 = 2131956145(0x7f1311b1, float:1.9548837E38)
            int r4 = r2.getBindingAdapterPosition()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r8 = r9.getString(r8, r4)
            X.0qQ.A07(r8)
            java.lang.Object[] r4 = new java.lang.Object[r13]
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r13)
            java.lang.String r4 = java.lang.String.format(r8, r4)
            X.0qQ.A07(r4)
        L_0x00d1:
            r7.setContentDescription(r4)
            X.TrZ r4 = new X.TrZ
            r4.<init>(r2, r3)
            X.AnonymousClass0fU.A00(r4, r10)
            X.TrY r4 = new X.TrY
            r4.<init>(r2, r3)
            r10.setOnTouchListener(r4)
            boolean r4 = r1.A0C
            if (r4 == 0) goto L_0x0345
            X.6uM r4 = X.C321546uM.A0J
        L_0x00ea:
            r7.setIcon(r4)
        L_0x00ed:
            X.HsR r9 = r1.A01
            com.instagram.user.model.User r4 = r11.A0K
            boolean r11 = r1.A0F
            com.instagram.common.ui.base.IgLinearLayout r12 = r2.A02
            android.widget.TextView r8 = r2.A01
            if (r9 == 0) goto L_0x0313
            android.content.Context r10 = r8.getContext()
            android.content.res.Resources r10 = r10.getResources()
            X.0qQ.A07(r10)
            java.lang.String r9 = X.C56259HvT.A00(r10, r9)
            if (r9 == 0) goto L_0x0313
            int r10 = r9.length()
            if (r10 == 0) goto L_0x0313
            r8.setText(r9)
            android.content.res.Resources r8 = r8.getResources()
            r4 = 2131955303(0x7f130e67, float:1.954713E38)
            java.lang.String r4 = r8.getString(r4)
            boolean r4 = r9.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x019a
            int r16 = r2.getBindingAdapterPosition()
            X.4bN r4 = r3.A01
            X.1Xj r11 = r4.A02
            if (r11 == 0) goto L_0x019a
            X.0iw r10 = r3.A02
            com.instagram.common.session.UserSession r4 = r3.A03
            java.lang.String r3 = r11.A30()
            if (r3 == 0) goto L_0x039e
            X.GKd r14 = X.C52236GKd.A0K
            java.lang.String r9 = ""
            X.0wc r8 = X.AnonymousClass0kN.A01(r10, r4)
            java.lang.String r4 = "instagram_clips_viewer_link_impression"
            X.0kJ r3 = r8.A00
            X.0Aj r4 = r8.A00(r3, r4)
            boolean r3 = r4.isSampled()
            if (r3 == 0) goto L_0x019a
            java.lang.String r8 = r10.getModuleName()
            java.lang.String r3 = "containermodule"
            r4.AAJ(r3, r8)
            java.lang.String r8 = r11.A2n()
            if (r8 == 0) goto L_0x030f
            r3 = 10
            java.lang.Long r3 = X.00y.A0n(r3, r8)
            if (r3 == 0) goto L_0x030f
            long r10 = r3.longValue()
        L_0x0169:
            java.lang.Long r8 = java.lang.Long.valueOf(r10)
            java.lang.String r3 = "media_id"
            r4.A9F(r3, r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r16)
            java.lang.String r3 = "media_index"
            r4.A8k(r3, r8)
            java.lang.String r3 = "viewer_session_id"
            r4.AAJ(r3, r9)
            X.1QJ r3 = X.AnonymousClass1QI.A00
            X.1QM r3 = r3.A02
            java.lang.String r8 = r3.A00
            java.lang.String r3 = "nav_chain"
            r4.AAJ(r3, r8)
            java.lang.String r3 = "action"
            r4.A8M(r14, r3)
            X.5OC r8 = X.AnonymousClass5OC.THUMBNAIL_LABEL
            java.lang.String r3 = "action_source"
            r4.A8M(r8, r3)
            r4.Cgf()
        L_0x019a:
            r12.setVisibility(r13)
            com.instagram.common.ui.base.IgSimpleImageView r9 = r2.A03
            X.0Tu r8 = X.0Tu.A05
            r3 = 36315894107868825(0x81051d00000e99, double:3.029655893959835E-306)
            boolean r3 = X.182.A06(r8, r6, r3)
            r10 = 0
            if (r3 == 0) goto L_0x02cc
            boolean r3 = r1.A0A
            if (r3 == 0) goto L_0x02cc
            r3 = 2131238936(0x7f082018, float:1.8094165E38)
        L_0x01b4:
            r9.setImageResource(r3)
            android.content.Context r4 = r9.getContext()
            int r3 = X.2Yu.A0A(r4)
            int r3 = r4.getColor(r3)
            r9.setColorFilter(r3)
        L_0x01c6:
            r9.setVisibility(r10)
            X.6sd r3 = r0.A05
            if (r3 == 0) goto L_0x0227
            X.6sS r4 = r0.A01
            r3 = 2
            X.0qQ.A0B(r4, r3)
            X.0w6 r4 = r2.A0B
            X.0YZ[] r9 = X.C66970Mg3.A0E
            r3 = r9[r15]
            java.lang.Object r10 = r4.CDM(r2, r3)
            android.view.View r10 = (android.view.View) r10
            java.lang.Integer r12 = r1.A05
            if (r12 == 0) goto L_0x02c8
            boolean r3 = r1.A0H
            if (r3 == 0) goto L_0x02c8
            X.0w6 r4 = r2.A0A
            r11 = 0
            r3 = r9[r11]
            java.lang.Object r9 = r4.CDM(r2, r3)
            android.widget.TextView r9 = (android.widget.TextView) r9
            android.content.res.Resources r4 = r10.getResources()
            X.0qQ.A07(r4)
            r3 = 10000(0x2710, float:1.4013E-41)
            java.lang.String r3 = X.C253673rC.A04(r4, r12, r3, r11, r11)
            r9.setText(r3)
            android.content.Context r11 = r10.getContext()
            r3 = 2131437756(0x7f0b28bc, float:1.849742E38)
            android.view.View r9 = r10.requireViewById(r3)
            X.0qQ.A07(r9)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            boolean r4 = r1.A0G
            r3 = 2131238652(0x7f081efc, float:1.8093589E38)
            if (r4 == 0) goto L_0x021c
            r3 = 2131238274(0x7f081d82, float:1.8092822E38)
        L_0x021c:
            android.graphics.drawable.Drawable r3 = r11.getDrawable(r3)
            r9.setImageDrawable(r3)
            r3 = 0
        L_0x0224:
            r10.setVisibility(r3)
        L_0x0227:
            java.util.List r4 = r1.A06
            if (r4 == 0) goto L_0x0289
            com.instagram.common.ui.base.IgSimpleImageView r3 = r2.A04
            android.content.Context r16 = r3.getContext()
            X.0qQ.A07(r16)
            X.0iw r0 = r0.A03
            java.lang.String r24 = r0.getModuleName()
            android.content.res.Resources r9 = r16.getResources()
            r0 = 2131165203(0x7f070013, float:1.7944616E38)
            int r26 = r9.getDimensionPixelSize(r0)
            java.lang.Integer r19 = X.AnonymousClass05K.A00
            r0 = 0
            r9 = 1050253722(0x3e99999a, float:0.3)
            java.lang.Float r18 = java.lang.Float.valueOf(r9)
            r9 = 3
            java.lang.Integer r20 = java.lang.Integer.valueOf(r9)
            r21 = r17
            r22 = r17
            r23 = r17
            r25 = r4
            r27 = r0
            r28 = r0
            r29 = r15
            r30 = r15
            r31 = r0
            android.graphics.drawable.Drawable r4 = X.C244283aw.A00(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r3.setImageDrawable(r4)
            android.content.res.Resources r9 = r16.getResources()
            r4 = 2131165190(0x7f070006, float:1.794459E38)
            int r10 = r9.getDimensionPixelSize(r4)
            android.view.ViewGroup$LayoutParams r9 = r3.getLayoutParams()
            java.lang.String r4 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            X.0qQ.A0C(r9, r4)
            android.view.ViewGroup$MarginLayoutParams r9 = (android.view.ViewGroup.MarginLayoutParams) r9
            r9.setMargins(r10, r0, r0, r10)
            r3.setVisibility(r0)
        L_0x0289:
            boolean r0 = r1.A0B
            android.widget.TextView r2 = r2.A00
            if (r0 == 0) goto L_0x0398
            r3 = 0
            r0 = 36322551307184370(0x810b2b000028f2, double:3.033865933613376E-306)
            boolean r0 = X.182.A06(r8, r6, r0)
            if (r0 == 0) goto L_0x0398
            if (r33 == 0) goto L_0x02ac
            java.lang.Object r0 = r32.getValue()
            X.2eb r0 = (X.C71662eb) r0
            android.view.View r7 = r0.A01()
            X.0qQ.A0A(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
        L_0x02ac:
            r0 = 2130970205(0x7f04065d, float:1.7549114E38)
            int r0 = X.2Yu.A0H(r5, r0)
            int r0 = r5.getColor(r0)
            r7.setColorFilter(r0)
            r2.setVisibility(r3)
            r0 = 2131964532(0x7f133274, float:1.9565848E38)
            java.lang.CharSequence r0 = r5.getText(r0)
            r2.setText(r0)
            return
        L_0x02c8:
            r3 = 8
            goto L_0x0224
        L_0x02cc:
            boolean r3 = r1.A0A
            if (r3 != 0) goto L_0x030a
            boolean r3 = r1.A09
            if (r3 != 0) goto L_0x030a
            boolean r3 = r1.A07
            if (r3 == 0) goto L_0x02e0
            r3 = 2131238783(0x7f081f7f, float:1.8093854E38)
        L_0x02db:
            r9.setImageResource(r3)
            goto L_0x01c6
        L_0x02e0:
            boolean r3 = r1.A0E
            if (r3 == 0) goto L_0x02ee
            X.6sS r3 = r0.A01
            boolean r3 = r3.A02
            if (r3 == 0) goto L_0x02ee
            r3 = 2131238642(0x7f081ef2, float:1.8093568E38)
            goto L_0x02db
        L_0x02ee:
            X.6sS r3 = r0.A01
            boolean r3 = r3.A03
            if (r3 == 0) goto L_0x0306
            X.1iA r4 = r1.A04
            X.1iA r3 = X.1iA.A0a
            if (r4 != r3) goto L_0x02fe
            r3 = 2131238685(0x7f081f1d, float:1.8093656E38)
            goto L_0x02db
        L_0x02fe:
            X.1iA r3 = X.1iA.A09
            if (r4 != r3) goto L_0x0306
            r3 = 2131237287(0x7f0819a7, float:1.809082E38)
            goto L_0x02db
        L_0x0306:
            r10 = 8
            goto L_0x01c6
        L_0x030a:
            r3 = 2131238188(0x7f081d2c, float:1.8092648E38)
            goto L_0x01b4
        L_0x030f:
            r10 = 0
            goto L_0x0169
        L_0x0313:
            com.instagram.common.ui.widget.imageview.CircularImageView r10 = r2.A05
            if (r4 == 0) goto L_0x033e
            if (r11 == 0) goto L_0x033e
            com.instagram.common.typedurl.ImageUrl r9 = r4.Bh3()
            X.0iw r3 = r0.A03
            r10.setUrl(r9, r3)
            r10.setVisibility(r13)
            java.lang.String r3 = r4.getUsername()
            r8.setText(r3)
            android.text.TextUtils$TruncateAt r3 = android.text.TextUtils.TruncateAt.END
            r8.setEllipsize(r3)
            r8.setMaxLines(r15)
            X.Oi2 r3 = new X.Oi2
            r3.<init>(r0, r4)
            X.AnonymousClass0fU.A00(r3, r12)
            goto L_0x019a
        L_0x033e:
            r13 = 8
            r10.setVisibility(r13)
            goto L_0x019a
        L_0x0345:
            boolean r4 = r1.A08
            if (r4 == 0) goto L_0x034d
            X.6uM r4 = X.C321546uM.A09
            goto L_0x00ea
        L_0x034d:
            r7.A0H()
            goto L_0x00ed
        L_0x0352:
            boolean r4 = r11.CcK()
            android.content.res.Resources r9 = r5.getResources()
            r8 = 2131956144(0x7f1311b0, float:1.9548835E38)
            if (r4 == 0) goto L_0x0362
            r8 = 2131956135(0x7f1311a7, float:1.9548817E38)
        L_0x0362:
            java.lang.String r4 = r11.AyM(r6)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r4 = r9.getString(r8, r4)
            goto L_0x00d1
        L_0x0370:
            com.instagram.igds.components.imagebutton.IgImageButton r7 = r2.A08
            com.instagram.common.typedurl.ImageUrl r5 = r1.A02
            if (r5 == 0) goto L_0x0381
            r7.A0E = r6
            X.0iw r4 = r0.A03
            r7.setUrl(r5, r4)
            r4 = 0
            r7.setVisibility(r4)
        L_0x0381:
            X.0eM r4 = r2.A09
            r32 = r4
            java.lang.Object r5 = r32.getValue()
            X.2eb r5 = (X.C71662eb) r5
            r4 = 8
            r5.A03(r4)
            r10 = r7
            goto L_0x0093
        L_0x0393:
            X.C256013v5.A03(r8)
            goto L_0x003b
        L_0x0398:
            r0 = 8
            r2.setVisibility(r0)
            return
        L_0x039e:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C320606se.A00(X.6se, X.GNm, X.Mg3, X.4bN, X.Ts8, boolean):void");
    }

    public C320606se(C321686ua r1, C320596sd r2, C320486sS r3, C320326sC r4, AnonymousClass0iw r5, UserSession userSession) {
        this.A04 = userSession;
        this.A03 = r5;
        this.A00 = r1;
        this.A01 = r3;
        this.A02 = r4;
        this.A05 = r2;
    }
}
