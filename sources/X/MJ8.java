package X;

public final class MJ8 extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MJ8(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARNING: type inference failed for: r1v97, types: [android.view.View] */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0441: MOVE  (r1v41 X.1bK) = (r1v40 X.1bK)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x051f  */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r21 = this;
            r4 = r21
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x073b;
                case 1: goto L_0x072f;
                case 2: goto L_0x0720;
                case 3: goto L_0x0715;
                case 4: goto L_0x0007;
                case 5: goto L_0x0007;
                case 6: goto L_0x0007;
                case 7: goto L_0x0007;
                case 8: goto L_0x0007;
                case 9: goto L_0x0084;
                case 10: goto L_0x0007;
                case 11: goto L_0x06d5;
                case 12: goto L_0x06b0;
                case 13: goto L_0x068b;
                case 14: goto L_0x05e7;
                case 15: goto L_0x05be;
                case 16: goto L_0x05a5;
                case 17: goto L_0x0561;
                case 18: goto L_0x04c6;
                case 19: goto L_0x0457;
                case 20: goto L_0x040a;
                case 21: goto L_0x0379;
                case 22: goto L_0x0084;
                case 23: goto L_0x0007;
                case 24: goto L_0x0007;
                case 25: goto L_0x0007;
                case 26: goto L_0x0350;
                case 27: goto L_0x0327;
                case 28: goto L_0x0084;
                case 29: goto L_0x0007;
                case 30: goto L_0x004f;
                case 31: goto L_0x02ef;
                case 32: goto L_0x02cf;
                case 33: goto L_0x02b5;
                case 34: goto L_0x0007;
                case 35: goto L_0x0297;
                case 36: goto L_0x027d;
                case 37: goto L_0x023f;
                case 38: goto L_0x0207;
                case 39: goto L_0x01ea;
                case 40: goto L_0x01cf;
                case 41: goto L_0x01c4;
                case 42: goto L_0x0026;
                case 43: goto L_0x01b7;
                case 44: goto L_0x01a7;
                case 45: goto L_0x017e;
                case 46: goto L_0x00e3;
                case 47: goto L_0x00c3;
                case 48: goto L_0x00b1;
                case 49: goto L_0x009a;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r4.A01
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x0013
            java.lang.Object r5 = r0.invoke()
            if (r5 != 0) goto L_0x0025
        L_0x0013:
            java.lang.Object r0 = r4.A02
            X.07g r1 = X.C51969G9p.A0c(r0)
            boolean r0 = r1 instanceof X.AnonymousClass07P
            if (r0 == 0) goto L_0x0097
            X.07P r1 = (X.AnonymousClass07P) r1
            if (r1 == 0) goto L_0x0097
            X.2YQ r5 = r1.getDefaultViewModelCreationExtras()
        L_0x0025:
            return r5
        L_0x0026:
            java.lang.Object r1 = r4.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            r0 = 3225(0xc99, float:4.519E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = X.C263454Mb.A00(r1, r0)
            r5 = 0
            if (r0 != 0) goto L_0x0025
            java.lang.Object r1 = r4.A02
            android.view.View r1 = (android.view.View) r1
            r0 = 2131439722(0x7f0b306a, float:1.8501407E38)
            android.view.View r1 = r1.findViewById(r0)
            boolean r0 = r1 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x0049
            r5 = r1
            android.view.ViewStub r5 = (android.view.ViewStub) r5
        L_0x0049:
            X.2eb r0 = new X.2eb
            r0.<init>(r5)
            return r0
        L_0x004f:
            java.lang.Object r3 = r4.A01
            X.MmG r3 = (X.C67340MmG) r3
            X.3oV r0 = r3.A01
            android.view.View r5 = r0.getView()
            int r0 = r5.getMeasuredWidth()
            if (r0 != 0) goto L_0x006a
            java.lang.Object r2 = r4.A02
            r1 = 4
            X.OkE r0 = new X.OkE
            r0.<init>(r1, r3, r2, r5)
            r5.addOnLayoutChangeListener(r0)
        L_0x006a:
            android.view.ViewParent r2 = r5.getParent()
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0025
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L_0x0025
            android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
            int r0 = r2.getHeight()
            r1.height = r0
            r5.requestLayout()
            return r5
        L_0x0084:
            java.lang.Object r0 = r4.A01
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x0090
            java.lang.Object r5 = r0.invoke()
            if (r5 != 0) goto L_0x0025
        L_0x0090:
            java.lang.Object r0 = r4.A02
            X.2YQ r5 = X.JTU.A08(r0)
            return r5
        L_0x0097:
            X.2YP r5 = X.AnonymousClass2YP.A00
            return r5
        L_0x009a:
            java.lang.Object r0 = r4.A01
            X.DbS.A1U(r0)
            java.lang.Object r3 = r4.A02
            X.OVd r3 = (X.C70989OVd) r3
            X.Odx r2 = r3.A0Z
            r1 = 34
            X.Pm5 r0 = new X.Pm5
            r0.<init>(r3, r1)
            r2.A0A(r0)
            goto L_0x074b
        L_0x00b1:
            java.lang.Object r0 = r4.A01
            android.content.Context r0 = (android.content.Context) r0
            android.content.Context r1 = X.DbT.A05(r0)
            java.lang.Object r0 = r4.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.OyC r5 = new X.OyC
            r5.<init>(r1, r0)
            return r5
        L_0x00c3:
            java.lang.Object r3 = r4.A02
            X.Odx r3 = (X.C71143Odx) r3
            java.lang.Object r2 = r4.A01
            com.facebook.msys.mca.Mailbox r2 = (com.facebook.msys.mca.Mailbox) r2
            X.6E1 r0 = X.AnonymousClass6E0.A01
            com.instagram.common.session.UserSession r1 = r3.A0H
            java.lang.Class<X.6E0> r0 = X.AnonymousClass6E0.class
            java.lang.Object r0 = r1.A00(r0)
            X.6E0 r0 = (X.AnonymousClass6E0) r0
            if (r0 == 0) goto L_0x00e1
            com.facebook.rsys.crypto.gen.CryptoContextHolder r1 = r0.A00
        L_0x00db:
            r0 = 0
            X.N4R r5 = X.C71143Odx.A00(r2, r0, r1, r3)
            return r5
        L_0x00e1:
            r1 = 0
            goto L_0x00db
        L_0x00e3:
            java.lang.Object r0 = r4.A02
            X.Hnu r0 = (X.C55814Hnu) r0
            X.Ggw r5 = r0.A02
            X.0Ud r0 = r5.A07
            java.lang.Object r1 = r0.getValue()
            X.GlG r1 = (X.C53268GlG) r1
            java.lang.Integer r0 = r1.A01
            java.lang.Integer r9 = X.AnonymousClass05K.A00
            if (r0 != r9) goto L_0x013b
            X.JMC r1 = r1.A00
            X.IWz r0 = X.C57316IWz.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x013b
            X.05G r7 = r5.A06
        L_0x0103:
            java.lang.Object r6 = r7.getValue()
            r0 = r6
            X.GlG r0 = (X.C53268GlG) r0
            X.IX0 r3 = X.IX0.A00
            boolean r2 = r0.A02
            java.lang.Integer r1 = r0.A01
            X.AnonymousClass7TG.A1O(r1, r3)
            X.GlG r0 = new X.GlG
            r0.<init>(r3, r1, r2)
            boolean r0 = r7.AIY(r6, r0)
            if (r0 == 0) goto L_0x0103
        L_0x011e:
            long r6 = X.C55351HgJ.A00
            java.lang.Object r1 = r4.A01
            r0 = 47
            X.G0g r3 = new X.G0g
            r3.<init>(r1, r0)
            r0 = 1
            X.6oS r0 = X.JTP.A0J(r5, r3, r0)
            r4 = 0
            r5 = 24
            X.MGA r2 = new X.MGA
            r2.<init>((java.lang.Object) r3, (X.AnonymousClass4D7) r4, (int) r5, (long) r6)
            X.AnonymousClass7TE.A1Z(r2, r0)
            goto L_0x074b
        L_0x013b:
            X.05G r8 = r5.A06
        L_0x013d:
            java.lang.Object r7 = r8.getValue()
            r6 = r7
            X.GlG r6 = (X.C53268GlG) r6
            java.lang.Integer r0 = r6.A01
            int r1 = r0.intValue()
            r0 = 0
            if (r1 == r0) goto L_0x0176
            r0 = 1
            if (r1 != r0) goto L_0x0179
            r3 = r9
        L_0x0151:
            boolean r2 = r6.A02
            X.JMC r1 = r6.A00
            X.AnonymousClass7TG.A1O(r3, r1)
            X.GlG r0 = new X.GlG
            r0.<init>(r1, r3, r2)
            boolean r0 = r8.AIY(r7, r0)
            if (r0 == 0) goto L_0x013d
            X.0eM r0 = r5.A05
            java.lang.Object r2 = r0.getValue()
            X.Vgr r2 = (X.C17838Vgr) r2
            X.1Xj r1 = r5.A01
            X.VOn r0 = new X.VOn
            r0.<init>(r5)
            r2.A00(r1, r0)
            goto L_0x011e
        L_0x0176:
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            goto L_0x0151
        L_0x0179:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x017e:
            java.lang.Object r6 = r4.A02
            X.4KC r6 = (X.AnonymousClass4KC) r6
            java.lang.Object r0 = r4.A01
            X.4KD r0 = (X.AnonymousClass4KD) r0
            X.1Xj r5 = r0.A00
            java.lang.String r2 = "media_reminder_confirmation_toast"
            r1 = 0
            r0 = 1
            X.2kQ r4 = X.C227942kP.A01(r2, r1, r0)
            com.instagram.common.session.UserSession r3 = r6.A01
            java.lang.String r2 = r6.A02
            X.Hrk r1 = new X.Hrk
            r1.<init>(r4, r3, r2)
            java.lang.String r0 = "edit_button_tap"
            r1.A00(r5, r0)
            android.app.Activity r1 = r6.A00
            java.lang.String r0 = r4.A00
            X.C49115Epe.A00(r1, r3, r5, r0, r2)
            goto L_0x074b
        L_0x01a7:
            java.lang.Object r1 = r4.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r4.A02
            X.Okb r0 = (X.C71436Okb) r0
            android.view.GestureDetector$OnGestureListener r0 = r0.A02
            android.view.GestureDetector r5 = new android.view.GestureDetector
            r5.<init>(r1, r0)
            return r5
        L_0x01b7:
            java.lang.Object r1 = r4.A02
            X.4gK r1 = (X.C270184gK) r1
            java.lang.Object r0 = r4.A01
            X.6Yy r0 = (X.C309616Yy) r0
            r1.A01(r0)
            goto L_0x074b
        L_0x01c4:
            java.lang.Object r1 = r4.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r4.A02
            r1.invoke(r0)
            goto L_0x074b
        L_0x01cf:
            java.lang.Object r2 = r4.A02
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.content.Context r1 = r2.getContext()
            r0 = 2131974450(0x7f135932, float:1.9585964E38)
            X.DbT.A18(r1, r2, r0)
            java.lang.Object r2 = r4.A01
            X.LDH r2 = (X.LDH) r2
            long r0 = java.lang.System.currentTimeMillis()
            r2.A00(r0)
            goto L_0x074b
        L_0x01ea:
            java.lang.Object r0 = r4.A01
            X.3oV r0 = (X.C252063oV) r0
            int r0 = r0.CFV()
            if (r0 == 0) goto L_0x0201
            java.lang.Object r1 = r4.A02
            android.view.View r1 = (android.view.View) r1
            java.lang.String r0 = "show_memory_badge_animator_key"
            boolean r1 = X.LK2.A01(r1, r0)
            r0 = 1
            if (r1 == 0) goto L_0x0202
        L_0x0201:
            r0 = 0
        L_0x0202:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L_0x0207:
            android.view.animation.Interpolator r0 = X.C338507i4.A07
            java.lang.Object r0 = r4.A01
            android.view.View r0 = (android.view.View) r0
            android.content.Context r1 = r0.getContext()
            X.7i4 r5 = new X.7i4
            r5.<init>(r1)
            X.0qQ.A07(r1)
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = X.0nA.A00(r1, r0)
            r5.A00(r0)
            int r0 = X.AnonymousClass7TE.A09(r1)
            int[] r0 = new int[]{r0}
            r5.A05(r0)
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.ROUND
            r5.A02(r0)
            java.lang.Object r0 = r4.A02
            X.Jpp r0 = (X.C60704Jpp) r0
            com.instagram.common.ui.base.IgSimpleImageView r0 = r0.A03
            r0.setImageDrawable(r5)
            r5.stop()
            return r5
        L_0x023f:
            java.lang.Object r0 = r4.A01
            android.view.View r0 = (android.view.View) r0
            android.content.Context r6 = r0.getContext()
            r0 = 6
            X.0nA.A04(r6, r0)
            java.lang.Object r1 = r4.A02
            X.Jpp r1 = (X.C60704Jpp) r1
            float r9 = r1.A01
            r12 = 0
            r0 = 128(0x80, float:1.794E-43)
            int r13 = android.graphics.Color.argb(r0, r12, r12, r12)
            int r0 = X.2Yu.A04(r6)
            int r14 = r6.getColor(r0)
            r7 = 0
            r11 = 1058642330(0x3f19999a, float:0.6)
            r18 = 1
            r15 = 300(0x12c, double:1.48E-321)
            r10 = 1045220557(0x3e4ccccd, float:0.2)
            X.JdE r5 = new X.JdE
            r8 = r7
            r17 = r12
            r19 = r12
            r20 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r17, r18, r19, r20)
            com.instagram.common.ui.base.IgSimpleImageView r0 = r1.A02
            r0.setImageDrawable(r5)
            return r5
        L_0x027d:
            java.lang.Object r0 = r4.A02
            X.8ZA r0 = (X.AnonymousClass8ZA) r0
            java.lang.Object r4 = r4.A01
            X.8Z0 r0 = r0.A00
            X.8Z1 r3 = r0.Bmt()
            java.lang.Class<X.Ndz> r2 = X.C69062Ndz.class
            r1 = 23
            X.Plc r0 = new X.Plc
            r0.<init>(r4, r1)
            X.3pa r5 = r3.A00(r2, r0)
            return r5
        L_0x0297:
            java.lang.Object r0 = r4.A02
            X.Jgn r0 = (X.C60168Jgn) r0
            X.0eM r0 = r0.A01
            java.lang.Object r3 = r0.getValue()
            X.Ndz r3 = (X.C69062Ndz) r3
            java.lang.Object r2 = r4.A01
            X.EWj r2 = (X.C48117EWj) r2
            r0 = 0
            X.0qQ.A0B(r2, r0)
            com.instagram.common.session.UserSession r1 = r3.A00
            X.CuE r0 = r3.A01
            com.instagram.reels.storiestemplate.discovery.repository.StoryTemplateDiscoverySurfaceSectionMediaPagingSource r5 = new com.instagram.reels.storiestemplate.discovery.repository.StoryTemplateDiscoverySurfaceSectionMediaPagingSource
            r5.<init>(r1, r2, r0)
            return r5
        L_0x02b5:
            java.lang.Object r1 = r4.A01
            android.content.Context r1 = (android.content.Context) r1
            r0 = 2131239994(0x7f08243a, float:1.809631E38)
            android.graphics.drawable.Drawable r5 = r1.getDrawable(r0)
            if (r5 == 0) goto L_0x02ca
            java.lang.Object r0 = r4.A02
            X.4dq r0 = (X.C268694dq) r0
            r5.setCallback(r0)
            return r5
        L_0x02ca:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x02cf:
            java.lang.Object r1 = r4.A01
            android.content.Context r1 = (android.content.Context) r1
            X.U1I r5 = new X.U1I
            r5.<init>(r1)
            java.lang.Object r0 = r4.A02
            X.4dq r0 = (X.C268694dq) r0
            r5.setCallback(r0)
            r0 = 2131099936(0x7f060120, float:1.781224E38)
            int r1 = r1.getColor(r0)
            X.6Ly r0 = r5.A00
            r0.A0F(r1)
            r5.invalidateSelf()
            return r5
        L_0x02ef:
            java.lang.Object r0 = r4.A01
            X.MmG r0 = (X.C67340MmG) r0
            X.0eM r0 = r0.A02
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            r0 = 2131440762(0x7f0b347a, float:1.8503517E38)
            android.view.View r5 = X.AnonymousClass7TF.A0F(r1, r0)
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r5 = (com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager) r5
            X.3TG r0 = X.AnonymousClass3TG.WHEEL_OF_FORTUNE
            r5.setScrollMode(r0)
            java.lang.Object r1 = r4.A02
            X.MmD r1 = (X.C67337MmD) r1
            float r0 = r1.A05
            r5.setPageSpacing(r0)
            X.0eM r0 = r1.A0F
            java.lang.Object r0 = r0.getValue()
            X.3os r0 = (X.C252293os) r0
            r5.A0P(r0)
            X.0eM r0 = r1.A0E
            java.lang.Object r0 = r0.getValue()
            X.6bI r0 = (X.C310586bI) r0
            r5.setAdapter((android.widget.Adapter) r0)
            return r5
        L_0x0327:
            java.lang.Object r1 = r4.A02
            X.K7c r1 = (X.C61427K7c) r1
            X.0eM r0 = r1.A0L
            X.2YL r5 = X.DbS.A0H(r0)
            X.0eM r0 = r1.A0E
            com.instagram.reels.prompt.model.PromptStickerModel r0 = X.JTT.A0g(r0)
            java.lang.String r7 = r0.A03
            java.lang.Object r0 = r4.A01
            X.JzN r0 = (X.C61229JzN) r0
            com.instagram.api.schemas.MediaPromptPrefType r6 = r0.A01
            X.AnonymousClass7TG.A1N(r7, r6)
            X.6oS r3 = X.C318116oQ.A00(r5)
            r8 = 0
            r9 = 20
            X.MH6 r4 = new X.MH6
            r4.<init>(r5, r6, r7, r8, r9)
            goto L_0x05a0
        L_0x0350:
            java.lang.Object r1 = r4.A02
            X.K7c r1 = (X.C61427K7c) r1
            X.0eM r0 = r1.A0L
            X.2YL r6 = X.DbS.A0H(r0)
            X.0eM r0 = r1.A0E
            com.instagram.reels.prompt.model.PromptStickerModel r0 = X.JTT.A0g(r0)
            java.lang.String r7 = r0.A05()
            java.lang.Object r0 = r4.A01
            X.JzN r0 = (X.C61229JzN) r0
            com.instagram.api.schemas.MediaPromptPrefType r5 = r0.A02
            r0 = 1
            X.6oS r3 = X.JTP.A0J(r6, r5, r0)
            r8 = 0
            r9 = 14
            X.MGk r4 = new X.MGk
            r4.<init>(r5, r6, r7, r8, r9)
            goto L_0x05a0
        L_0x0379:
            java.lang.Object r0 = r4.A01
            X.0iw r0 = (X.AnonymousClass0iw) r0
            java.lang.String r3 = r0.getModuleName()
            java.lang.Object r1 = r4.A02
            android.view.View r1 = (android.view.View) r1
            r0 = 2131439581(0x7f0b2fdd, float:1.8501121E38)
            android.view.View r4 = r1.findViewById(r0)
            r0 = 2131439580(0x7f0b2fdc, float:1.850112E38)
            android.view.View r5 = r1.findViewById(r0)
            r0 = 2131441495(0x7f0b3757, float:1.8505003E38)
            android.view.View r6 = r1.findViewById(r0)
            r0 = 2131439645(0x7f0b301d, float:1.850125E38)
            android.view.View r7 = r1.findViewById(r0)
            r0 = 2131439647(0x7f0b301f, float:1.8501255E38)
            android.view.View r8 = r1.findViewById(r0)
            r0 = 2131439405(0x7f0b2f2d, float:1.8500764E38)
            android.view.View r9 = r1.findViewById(r0)
            r0 = 2131439668(0x7f0b3034, float:1.8501298E38)
            android.view.View r10 = r1.findViewById(r0)
            r0 = 6
            r2 = 2131439671(0x7f0b3037, float:1.8501304E38)
            android.view.View r11 = r1.findViewById(r2)
            r2 = 2131439680(0x7f0b3040, float:1.8501322E38)
            android.view.View r12 = r1.findViewById(r2)
            r2 = 2131439673(0x7f0b3039, float:1.8501308E38)
            android.view.View r13 = r1.findViewById(r2)
            r2 = 2131439675(0x7f0b303b, float:1.8501312E38)
            android.view.View r14 = r1.findViewById(r2)
            r2 = 2131439679(0x7f0b303f, float:1.850132E38)
            android.view.View r15 = r1.findViewById(r2)
            r2 = 2131439676(0x7f0b303c, float:1.8501314E38)
            android.view.View r16 = r1.findViewById(r2)
            r2 = 2131439681(0x7f0b3041, float:1.8501324E38)
            android.view.View r17 = r1.findViewById(r2)
            android.view.View[] r2 = new android.view.View[]{r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17}
            X.Vc0 r4 = new X.Vc0
            r4.<init>(r1, r3, r2)
            r2 = 15
            r4.A02 = r2
            r4.A00 = r0
            android.content.Context r1 = r1.getContext()
            r0 = 2131099798(0x7f060096, float:1.781196E38)
            int r0 = r1.getColor(r0)
            r4.A03 = r0
            X.U1A r5 = new X.U1A
            r5.<init>(r4)
            return r5
        L_0x040a:
            java.lang.Object r0 = r4.A02
            X.KGo r0 = (X.C61664KGo) r0
            X.K74 r2 = r0.A03
            java.lang.Object r1 = r4.A01
            X.LiU r1 = (X.C64809LiU) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.0eM r0 = r2.A04
            java.lang.Object r5 = r0.getValue()
            X.JjL r5 = (X.C60317JjL) r5
            java.lang.String r4 = r1.A04
            java.util.List r0 = r5.A05
            java.util.Iterator r3 = r0.iterator()
        L_0x0428:
            boolean r0 = r3.hasNext()
            r2 = 0
            if (r0 == 0) goto L_0x0455
            java.lang.Object r1 = r3.next()
            boolean r0 = X.JTT.A1b(r1, r4)
            if (r0 == 0) goto L_0x0428
        L_0x0439:
            X.1bM r1 = (X.C65211bM) r1
            if (r1 == 0) goto L_0x074b
            boolean r0 = r1 instanceof X.1bK
            if (r0 == 0) goto L_0x074b
            X.1bK r1 = (X.1bK) r1
            if (r1 == 0) goto L_0x074b
            com.instagram.user.model.User r1 = r1.A09
            if (r1 == 0) goto L_0x074b
            X.6oS r3 = X.C318116oQ.A00(r5)
            r0 = 4
            X.ImF r4 = new X.ImF
            r4.<init>(r5, r1, r2, r0)
            goto L_0x05a0
        L_0x0455:
            r1 = r2
            goto L_0x0439
        L_0x0457:
            java.lang.Object r0 = r4.A02
            X.KGo r0 = (X.C61664KGo) r0
            X.K74 r2 = r0.A03
            java.lang.Object r1 = r4.A01
            X.LiU r1 = (X.C64809LiU) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.0eM r0 = r2.A04
            java.lang.Object r6 = r0.getValue()
            X.JjL r6 = (X.C60317JjL) r6
            java.lang.String r2 = r1.A04
            java.util.List r0 = r6.A05
            java.util.Iterator r1 = r0.iterator()
        L_0x0475:
            boolean r0 = r1.hasNext()
            r5 = 0
            if (r0 == 0) goto L_0x04c4
            java.lang.Object r7 = r1.next()
            boolean r0 = X.JTT.A1b(r7, r2)
            if (r0 == 0) goto L_0x0475
        L_0x0486:
            X.1bM r7 = (X.C65211bM) r7
            if (r7 == 0) goto L_0x074b
            boolean r0 = r7 instanceof X.1bK
            if (r0 == 0) goto L_0x074b
            X.1bK r7 = (X.1bK) r7
            if (r7 == 0) goto L_0x074b
            com.instagram.user.model.User r4 = r7.A09
            if (r4 == 0) goto L_0x074b
            X.1E8 r1 = r6.A02
            java.lang.String r0 = r6.A03
            X.1Xj r3 = r1.A02(r0)
            if (r3 == 0) goto L_0x074b
            java.lang.String r0 = r6.A04
            X.3uh r2 = new X.3uh
            r2.<init>((X.1Xj) r3, (com.instagram.user.model.User) r4, (java.lang.String) r0)
            X.3gp r0 = new X.3gp
            r0.<init>(r7)
            X.Tzd r1 = new X.Tzd
            r1.<init>((X.C247733gp) r0, (X.C255773uh) r2)
            X.3gp r0 = r1.A02
            if (r0 == 0) goto L_0x04b8
            r0.A02(r3)
        L_0x04b8:
            X.6oS r3 = X.C318116oQ.A00(r6)
            r0 = 6
            X.ImF r4 = new X.ImF
            r4.<init>(r6, r1, r5, r0)
            goto L_0x05a0
        L_0x04c4:
            r7 = r5
            goto L_0x0486
        L_0x04c6:
            java.lang.Object r0 = r4.A02
            X.KGo r0 = (X.C61664KGo) r0
            X.K74 r2 = r0.A03
            java.lang.Object r1 = r4.A01
            X.LiU r1 = (X.C64809LiU) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.0eM r0 = r2.A04
            java.lang.Object r6 = r0.getValue()
            X.JjL r6 = (X.C60317JjL) r6
            java.lang.String r3 = r1.A04
            java.util.List r0 = r6.A05
            java.util.Iterator r1 = r0.iterator()
        L_0x04e4:
            boolean r0 = r1.hasNext()
            r2 = 0
            if (r0 == 0) goto L_0x04f5
            java.lang.Object r2 = r1.next()
            boolean r0 = X.JTT.A1b(r2, r3)
            if (r0 == 0) goto L_0x04e4
        L_0x04f5:
            X.1bM r2 = (X.C65211bM) r2
            if (r2 == 0) goto L_0x074b
            boolean r0 = r2 instanceof X.1bK
            if (r0 == 0) goto L_0x074b
            X.1bK r2 = (X.1bK) r2
            if (r2 == 0) goto L_0x074b
            X.1E8 r1 = r6.A02
            java.lang.String r0 = r6.A03
            X.1Xj r7 = r1.A02(r0)
            if (r7 == 0) goto L_0x074b
            java.util.List r0 = X.JTO.A14(r7)
            if (r0 == 0) goto L_0x074b
            java.util.Map r0 = X.JZW.A02(r0)
            java.lang.String r5 = r2.A0r
            java.lang.Object r0 = r0.get(r5)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x074b
            boolean r4 = r0.booleanValue()
            java.util.List r0 = X.JTO.A14(r7)
            if (r0 == 0) goto L_0x074b
            java.util.Map r0 = X.JZW.A01(r0)
            java.lang.Number r0 = X.C51966G9m.A14(r5, r0)
            if (r0 == 0) goto L_0x074b
            int r3 = r0.intValue()
            r2 = 1
            r1 = -1
            if (r4 != 0) goto L_0x053c
            r1 = 1
        L_0x053c:
            if (r5 == 0) goto L_0x0547
            r0 = r4 ^ 1
            X.JZW.A06(r7, r5, r0)
            int r3 = r3 + r1
            X.JZW.A05(r7, r5, r3)
        L_0x0547:
            java.lang.Object r0 = X.C60317JjL.A00(r6)
            X.JvW r0 = (X.C61032JvW) r0
            boolean r0 = r0.A08
            if (r0 != 0) goto L_0x055c
            java.lang.Object r0 = X.C60317JjL.A00(r6)
            X.JvW r0 = (X.C61032JvW) r0
            boolean r0 = r0.A09
            if (r0 != 0) goto L_0x055c
            r2 = 0
        L_0x055c:
            X.C60317JjL.A04(r6, r2)
            goto L_0x074b
        L_0x0561:
            java.lang.Object r0 = r4.A02
            X.KGo r0 = (X.C61664KGo) r0
            X.K74 r2 = r0.A03
            java.lang.Object r1 = r4.A01
            X.LiU r1 = (X.C64809LiU) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.0eM r0 = r2.A04
            java.lang.Object r5 = r0.getValue()
            X.JjL r5 = (X.C60317JjL) r5
            java.lang.String r4 = r1.A04
            java.util.List r0 = r5.A05
            java.util.Iterator r3 = r0.iterator()
        L_0x057f:
            boolean r0 = r3.hasNext()
            r2 = 0
            if (r0 == 0) goto L_0x074b
            java.lang.Object r1 = r3.next()
            boolean r0 = X.JTT.A1b(r1, r4)
            if (r0 == 0) goto L_0x057f
            if (r1 == 0) goto L_0x074b
            boolean r0 = r1 instanceof X.1bK
            if (r0 == 0) goto L_0x074b
            X.6oS r3 = X.C318116oQ.A00(r5)
            r0 = 5
            X.ImF r4 = new X.ImF
            r4.<init>(r5, r1, r2, r0)
        L_0x05a0:
            X.AnonymousClass7TE.A1Z(r4, r3)
            goto L_0x074b
        L_0x05a5:
            java.lang.Object r0 = r4.A02
            X.K9l r0 = (X.C61480K9l) r0
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r1 = r0.A01
            java.lang.Object r0 = r4.A01
            X.3gp r0 = (X.C247733gp) r0
            com.instagram.user.model.User r0 = r0.A08
            if (r0 == 0) goto L_0x074b
            X.FnN r1 = r1.A0A
            java.lang.String r0 = r0.getId()
            r1.A05(r0)
            goto L_0x074b
        L_0x05be:
            java.lang.Object r0 = r4.A02
            X.K9l r0 = (X.C61480K9l) r0
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r3 = r0.A01
            java.lang.Object r2 = r4.A01
            X.3gp r2 = (X.C247733gp) r2
            X.3uh r0 = r3.A0F()
            if (r0 == 0) goto L_0x074b
            X.3uh r0 = r3.A0F()
            X.1Xj r0 = r0.A0b
            r2.A02(r0)
            X.3uh r0 = r3.A0F()
            X.Tzd r1 = new X.Tzd
            r1.<init>((X.C247733gp) r2, (X.C255773uh) r0)
            X.WZv r0 = r3.A0B
            r0.DVp(r1)
            goto L_0x074b
        L_0x05e7:
            java.lang.Object r0 = r4.A02
            X.K9l r0 = (X.C61480K9l) r0
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r3 = r0.A01
            java.lang.Object r2 = r4.A01
            X.3gp r2 = (X.C247733gp) r2
            X.3uh r0 = r3.A0F()
            if (r0 == 0) goto L_0x074b
            X.3uh r0 = r3.A0F()
            X.1Xj r0 = r0.A0b
            r2.A02(r0)
            X.3uh r1 = r3.A0F()
            X.Tzd r0 = new X.Tzd
            r0.<init>((X.C247733gp) r2, (X.C255773uh) r1)
            X.FnN r2 = r3.A0A
            X.3gp r3 = r0.A02
            if (r3 == 0) goto L_0x074b
            X.3uh r0 = r0.A0K
            if (r0 == 0) goto L_0x074b
            X.1Xj r7 = r0.A0b
            if (r7 == 0) goto L_0x074b
            java.util.List r0 = X.JTO.A14(r7)
            if (r0 == 0) goto L_0x074b
            java.util.Map r1 = X.JZW.A02(r0)
            java.lang.String r0 = r3.A0G
            java.lang.Object r0 = r1.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x074b
            boolean r5 = r0.booleanValue()
            java.util.List r0 = X.JTO.A14(r7)
            if (r0 == 0) goto L_0x074b
            java.util.Map r1 = X.JZW.A01(r0)
            java.lang.String r0 = r3.A0G
            java.lang.Number r0 = X.C51966G9m.A14(r0, r1)
            if (r0 == 0) goto L_0x074b
            int r1 = r0.intValue()
            if (r5 != 0) goto L_0x0673
            r14 = 1
            X.4D6 r4 = r2.A05
            com.instagram.common.session.UserSession r6 = r2.A04
            java.lang.String r8 = r3.A0G
            X.0iw r0 = r2.A03
            java.lang.String r9 = r0.getModuleName()
            r12 = 0
            r10 = -1
            r11 = r10
            r13 = r12
            X.1OC r0 = X.C56631I5k.A01(r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x065c:
            r4.schedule(r0)
            java.lang.String r4 = r3.A0G
            r0 = r5 ^ 1
            X.JZW.A06(r7, r4, r0)
            java.lang.String r0 = r3.A0G
            int r1 = r1 + r14
            X.JZW.A05(r7, r0, r1)
            X.G7s r0 = r2.A07
            r0.Cs5()
            goto L_0x074b
        L_0x0673:
            r14 = -1
            X.4D6 r4 = r2.A05
            com.instagram.common.session.UserSession r10 = r2.A04
            java.lang.String r12 = r3.A0G
            X.0iw r0 = r2.A03
            java.lang.String r13 = r0.getModuleName()
            r16 = 0
            r11 = r7
            r15 = r14
            r17 = r16
            X.1OC r0 = X.C56631I5k.A02(r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x065c
        L_0x068b:
            java.lang.Object r0 = r4.A02
            X.K9l r0 = (X.C61480K9l) r0
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r2 = r0.A01
            java.lang.Object r4 = r4.A01
            X.3gp r4 = (X.C247733gp) r4
            androidx.fragment.app.FragmentActivity r1 = r2.getActivity()
            if (r1 == 0) goto L_0x074b
            X.3uh r0 = r2.A0F()
            if (r0 == 0) goto L_0x074b
            com.instagram.common.session.UserSession r3 = r2.A06
            java.lang.String r5 = r2.A0C
            X.3uh r0 = r2.A0F()
            java.lang.String r6 = r0.A0j
            X.C39571A0n.A00(r1, r2, r3, r4, r5, r6)
            goto L_0x074b
        L_0x06b0:
            android.graphics.Paint r5 = X.JTP.A0D()
            java.lang.Object r0 = r4.A02
            X.Jcx r0 = (X.C59988Jcx) r0
            java.lang.Object r2 = r4.A01
            android.content.Context r2 = (android.content.Context) r2
            X.0eM r0 = r0.A0B
            java.lang.Object r0 = r0.getValue()
            float r1 = X.AnonymousClass7TE.A04(r0)
            android.graphics.CornerPathEffect r0 = new android.graphics.CornerPathEffect
            r0.<init>(r1)
            r5.setPathEffect(r0)
            r0 = 2131099913(0x7f060109, float:1.7812193E38)
            X.AnonymousClass7TE.A1N(r2, r5, r0)
            return r5
        L_0x06d5:
            java.lang.Object r1 = r4.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r2 = r4.A02
            X.Jcx r2 = (X.C59988Jcx) r2
            int r0 = r2.A02
            X.6Ly r5 = X.AnonymousClass7TE.A0s(r1, r0)
            java.lang.String r0 = r2.A05
            X.AnonymousClass7TF.A1A(r5, r0)
            int r0 = r2.A01
            if (r0 != 0) goto L_0x06f2
            X.0eM r0 = r2.A09
            int r0 = X.DbX.A07(r0)
        L_0x06f2:
            float r0 = (float) r0
            r5.A0A(r0)
            r0 = 2131099936(0x7f060120, float:1.781224E38)
            X.AnonymousClass7TE.A1O(r1, r5, r0)
            X.0eM r0 = r2.A07
            int r0 = X.DbX.A07(r0)
            float r1 = (float) r0
            X.0eM r0 = r2.A0A
            int r0 = X.DbX.A07(r0)
            float r0 = (float) r0
            r5.A0C(r1, r0)
            r2 = 3
            java.lang.String r1 = "…"
            r0 = 1
            r5.A0N(r1, r2, r0)
            return r5
        L_0x0715:
            java.lang.Object r3 = r4.A02
            X.2bv r3 = (X.2bv) r3
            java.lang.Object r2 = r4.A01
            X.4UC r2 = (X.AnonymousClass4UC) r2
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            goto L_0x072a
        L_0x0720:
            java.lang.Object r3 = r4.A02
            X.2bv r3 = (X.2bv) r3
            java.lang.Object r2 = r4.A01
            X.4UC r2 = (X.AnonymousClass4UC) r2
            java.lang.Integer r1 = X.AnonymousClass05K.A01
        L_0x072a:
            r0 = 0
            r3.DbI(r2, r1, r0)
            goto L_0x074b
        L_0x072f:
            java.lang.Object r1 = r4.A02
            X.2bv r1 = (X.2bv) r1
            java.lang.Object r0 = r4.A01
            X.4UC r0 = (X.AnonymousClass4UC) r0
            r1.DbJ(r0)
            goto L_0x074b
        L_0x073b:
            java.lang.Object r2 = r4.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r4.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.2bK r0 = new X.2bK
            r0.<init>(r2, r1)
            r0.A02()
        L_0x074b:
            X.0gF r5 = X.C60340gF.A00
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MJ8.invoke():java.lang.Object");
    }
}
