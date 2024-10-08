package X;

/* renamed from: X.AwZ  reason: case insensitive filesystem */
public final class C41567AwZ extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41567AwZ(int i, Object obj, Object obj2, Object obj3) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: X.7GX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: X.6gx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: X.7GX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: X.7GX} */
    /* JADX WARNING: type inference failed for: r5v2, types: [X.0rm, java.lang.Object] */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x01c5: MOVE  (r2v87 X.0iw) = (r2v80 X.0iw)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r39 = this;
            r0 = r39
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x0043;
                case 1: goto L_0x0059;
                case 2: goto L_0x0075;
                case 3: goto L_0x06d3;
                case 4: goto L_0x0086;
                case 5: goto L_0x0096;
                case 6: goto L_0x0031;
                case 7: goto L_0x072c;
                case 8: goto L_0x075a;
                case 9: goto L_0x076d;
                case 10: goto L_0x00a9;
                case 11: goto L_0x00cb;
                case 12: goto L_0x07b8;
                case 13: goto L_0x07ca;
                case 14: goto L_0x0802;
                case 15: goto L_0x0820;
                case 16: goto L_0x0820;
                case 17: goto L_0x0832;
                case 18: goto L_0x00f8;
                case 19: goto L_0x0844;
                case 20: goto L_0x0863;
                case 21: goto L_0x0885;
                case 22: goto L_0x0125;
                case 23: goto L_0x013c;
                case 24: goto L_0x0169;
                case 25: goto L_0x0189;
                case 26: goto L_0x0897;
                case 27: goto L_0x08a9;
                case 28: goto L_0x08bb;
                case 29: goto L_0x019a;
                case 30: goto L_0x092c;
                case 31: goto L_0x01b9;
                case 32: goto L_0x021d;
                case 33: goto L_0x0236;
                case 34: goto L_0x024e;
                case 35: goto L_0x0278;
                case 36: goto L_0x0289;
                case 37: goto L_0x02b7;
                case 38: goto L_0x094a;
                case 39: goto L_0x0965;
                case 40: goto L_0x02cc;
                case 41: goto L_0x02f0;
                case 42: goto L_0x0007;
                case 43: goto L_0x0007;
                case 44: goto L_0x0306;
                case 45: goto L_0x0019;
                case 46: goto L_0x0319;
                case 47: goto L_0x0479;
                case 48: goto L_0x0631;
                case 49: goto L_0x0677;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r2 = r0.A03
            X.7H6 r2 = (X.AnonymousClass7H6) r2
            java.lang.Object r1 = r0.A01
            X.77B r1 = (X.AnonymousClass77B) r1
            java.lang.Object r0 = r0.A02
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r0 = (com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel) r0
            X.AnonymousClass7H6.A0R(r2, r1, r0)
        L_0x0016:
            X.0gF r10 = X.C60340gF.A00
        L_0x0018:
            return r10
        L_0x0019:
            java.lang.Object r4 = r0.A03
            X.NJY r4 = (X.NJY) r4
            com.instagram.common.session.UserSession r3 = r4.A0N()
            java.lang.Object r2 = r0.A02
            X.N4P r2 = (X.N4P) r2
            java.lang.Object r1 = r0.A01
            X.N9q r1 = (X.C68303N9q) r1
            com.instagram.direct.capabilities.Capabilities r0 = r4.A03
            if (r0 != 0) goto L_0x06bc
            java.lang.String r0 = "threadCapabilities"
            goto L_0x032f
        L_0x0031:
            java.lang.Object r4 = r0.A02
            X.4Cq r4 = (X.C262224Cq) r4
            r3 = 0
            java.lang.Object r2 = r0.A01
            r1 = 30
            X.MG7 r0 = new X.MG7
            r0.<init>(r2, r3, r1)
            X.AnonymousClass7TE.A1Z(r0, r4)
            goto L_0x0016
        L_0x0043:
            java.lang.Object r4 = r0.A01
            X.Hrc r4 = (X.C56030Hrc) r4
            java.lang.Object r1 = r0.A03
            X.7dj r1 = (X.C335907dj) r1
            java.lang.String r3 = r1.A0K
            java.lang.String r2 = r1.A0N
            r1 = 0
            r4.A01(r3, r2, r1)
            java.lang.Object r1 = r0.A02
            X.5Oz r1 = (X.C284945Oz) r1
            r4 = 1
            goto L_0x006d
        L_0x0059:
            java.lang.Object r3 = r0.A01
            X.Hrc r3 = (X.C56030Hrc) r3
            java.lang.Object r1 = r0.A03
            X.7dj r1 = (X.C335907dj) r1
            java.lang.String r2 = r1.A0K
            java.lang.String r1 = r1.A0N
            r4 = 0
            r3.A01(r2, r1, r4)
            java.lang.Object r1 = r0.A02
            X.5Oz r1 = (X.C284945Oz) r1
        L_0x006d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r1.Epw(r0)
            goto L_0x0016
        L_0x0075:
            java.lang.Object r2 = r0.A03
            X.0sP r2 = (X.0sP) r2
            java.lang.Object r1 = r0.A01
            X.Gl7 r1 = (X.C53259Gl7) r1
            java.lang.String r1 = r1.A01
            r2.invoke(r1)
            java.lang.Object r0 = r0.A02
            goto L_0x02c5
        L_0x0086:
            java.lang.Object r2 = r0.A03
            X.GgO r2 = (X.C52971GgO) r2
            java.lang.Object r1 = r0.A02
            X.1Xl r1 = (X.1Xl) r1
            java.lang.Object r0 = r0.A01
            X.GlX r0 = (X.C53285GlX) r0
            X.C52971GgO.A02(r0, r2, r1)
            goto L_0x0016
        L_0x0096:
            java.lang.Object r1 = r0.A03
            X.64X r1 = (X.AnonymousClass64X) r1
            X.1Nh r2 = r1.A00
            java.lang.Object r1 = r0.A01
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.Object r0 = r0.A02
            X.1wn r0 = (X.1wn) r0
            r2.EDz(r0, r1)
            goto L_0x0016
        L_0x00a9:
            java.lang.Object r1 = r0.A03
            X.GMs r1 = (X.C52302GMs) r1
            com.instagram.common.session.UserSession r4 = r1.A02
            X.1Ng r3 = X.AnonymousClass1Nd.A00(r4)
            java.lang.Class<X.3KA> r2 = X.AnonymousClass3KA.class
            java.lang.Object r1 = r0.A02
            X.GN1 r1 = (X.GN1) r1
            r3.A02(r1, r2)
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r4)
            java.lang.Class<X.27U> r1 = X.27U.class
            java.lang.Object r0 = r0.A01
            X.9OS r0 = (X.AnonymousClass9OS) r0
            r2.A02(r0, r1)
            goto L_0x0016
        L_0x00cb:
            java.lang.Object r1 = r0.A03
            X.GMs r1 = (X.C52302GMs) r1
            com.instagram.common.session.UserSession r4 = r1.A02
            X.0Tu r3 = X.AnonymousClass7TF.A0H(r4)
            r1 = 36329680953229564(0x8111a7000540fc, double:3.038374750481137E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            if (r1 == 0) goto L_0x0016
            java.lang.Object r1 = r0.A01
            X.3Y5 r1 = (X.AnonymousClass3Y5) r1
            X.2V1 r1 = r1.A05
            java.lang.Object r0 = r0.A02
            android.view.View r1 = r1.A03(r0)
            if (r1 == 0) goto L_0x0016
            r0 = 1
            r1.setHapticFeedbackEnabled(r0)
            r0 = 3
            r1.performHapticFeedback(r0)
            goto L_0x0016
        L_0x00f8:
            java.lang.Object r1 = r0.A01
            android.content.Context r1 = (android.content.Context) r1
            X.AaO r10 = new X.AaO
            r10.<init>(r1)
            java.lang.Object r1 = r0.A03
            X.8K4 r1 = (X.AnonymousClass8K4) r1
            X.8KK r3 = r1.A0M
            X.0qQ.A07(r3)
            java.util.List r2 = r10.A00
            boolean r1 = r2.contains(r3)
            if (r1 != 0) goto L_0x0115
            r2.add(r3)
        L_0x0115:
            java.lang.Object r1 = r0.A02
            r0 = 0
            X.0qQ.A0B(r1, r0)
            boolean r0 = r2.contains(r1)
            if (r0 != 0) goto L_0x0018
            r2.add(r1)
            return r10
        L_0x0125:
            java.lang.Object r1 = r0.A01
            com.instagram.common.gallery.model.GalleryItem r1 = (com.instagram.common.gallery.model.GalleryItem) r1
            com.instagram.common.gallery.Medium r2 = r1.A00
            if (r2 == 0) goto L_0x0016
            java.lang.Object r1 = r0.A02
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            java.lang.Object r0 = r0.A03
            X.8hG r0 = (X.C362048hG) r0
            if (r1 == 0) goto L_0x0016
            X.C362048hG.A05(r1, r2, r0)
            goto L_0x0016
        L_0x013c:
            java.lang.Object r1 = r0.A01
            com.instagram.common.gallery.model.GalleryItem r1 = (com.instagram.common.gallery.model.GalleryItem) r1
            com.instagram.common.gallery.Medium r2 = r1.A00
            if (r2 == 0) goto L_0x0016
            java.lang.Object r1 = r0.A03
            X.8hG r1 = (X.C362048hG) r1
            java.lang.Object r5 = r0.A02
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            X.8XA r4 = r1.A0w
            if (r5 == 0) goto L_0x0a09
            java.lang.String r3 = r2.A0X
            r2 = 1
            X.0qQ.A0B(r3, r2)
            com.instagram.common.session.UserSession r0 = r4.A0F
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r0)
            X.8c4 r0 = new X.8c4
            r0.<init>(r5, r3)
            r1.A00(r0)
            r4.A0M(r2)
            goto L_0x0016
        L_0x0169:
            java.lang.Object r1 = r0.A03
            X.8hG r1 = (X.C362048hG) r1
            X.85O r3 = r1.A10
            java.lang.Object r2 = r0.A01
            com.instagram.common.gallery.model.GalleryItem r2 = (com.instagram.common.gallery.model.GalleryItem) r2
            java.lang.Object r0 = r0.A02
            X.MQT r0 = (X.MQT) r0
            X.JYg r0 = (X.C59787JYg) r0
            android.graphics.Bitmap r1 = r0.A00
            X.9SZ r0 = new X.9SZ
            r0.<init>(r2, r1)
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            r3.A01(r0)
            goto L_0x0016
        L_0x0189:
            java.lang.Object r2 = r0.A03
            X.8hG r2 = (X.C362048hG) r2
            java.lang.Object r1 = r0.A01
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.A02
            java.util.List r0 = (java.util.List) r0
            X.C362048hG.A0L(r2, r1, r0)
            goto L_0x0016
        L_0x019a:
            java.lang.Object r2 = r0.A01
            X.I4e r2 = (X.C56605I4e) r2
            java.lang.String r1 = "ADD_YOURS_WITH_MAGIC_MOD_BACKDROP_PROMPT_DONE"
            X.C56605I4e.A01(r2, r1)
            java.lang.Object r1 = r0.A02
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r0.A03
            X.GgC r0 = (X.C52959GgC) r0
            X.5Oz r0 = r0.A00
            java.lang.Object r0 = r0.getValue()
            X.5Tl r0 = (X.C285975Tl) r0
            X.5Tq r0 = r0.A01
            java.lang.String r0 = r0.A00
            goto L_0x0249
        L_0x01b9:
            java.lang.Object r4 = r0.A03
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.Object r2 = r0.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            boolean r1 = r2 instanceof X.AnonymousClass0iw
            if (r1 == 0) goto L_0x01c9
            X.0iw r2 = (X.AnonymousClass0iw) r2
            if (r2 != 0) goto L_0x01cb
        L_0x01c9:
            X.FU2 r2 = X.FGZ.A00
        L_0x01cb:
            java.lang.Object r0 = r0.A02
            X.FBQ r0 = (X.FBQ) r0
            X.FGZ.A03(r2, r4, r0)
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.2D6 r2 = X.2D5.A00(r4)
            r2.A0B(r0)
            long r0 = java.lang.System.currentTimeMillis()
            r2.A03(r0)
            X.0xa r8 = r2.A04
            r0 = 2403(0x963, float:3.367E-42)
            java.lang.String r7 = X.AnonymousClass000.A00(r0)
            r5 = 0
            long r2 = r8.getLong(r7, r5)
            r0 = 1
            long r2 = r2 + r0
            X.0xY r0 = r8.AR4()
            r0.E5c(r7, r2)
            r0.apply()
            r8.getLong(r7, r5)
            r3 = 0
            r1 = 1677891942(0x64029966, float:9.636521E21)
            r0 = 3
            X.19S r2 = X.AnonymousClass1HX.A02(r1, r0)
            r1 = 7
            X.MH9 r0 = new X.MH9
            r0.<init>(r4, r3, r1)
            X.AnonymousClass7TE.A1Z(r0, r2)
            X.819 r1 = X.AnonymousClass819.BOTTOMSHEET_XAR_REELS
            X.818 r0 = X.AnonymousClass818.IG_REELS_COMPOSER
            X.C367998ru.A01(r0, r1, r4)
            goto L_0x0016
        L_0x021d:
            java.lang.Object r2 = r0.A02
            X.0sL r2 = (X.0sL) r2
            java.lang.Object r1 = r0.A03
            X.5Oz r1 = (X.C284945Oz) r1
            java.lang.Object r1 = r1.getValue()
            java.lang.Object r0 = r0.A01
            X.5Oz r0 = (X.C284945Oz) r0
            java.lang.Object r0 = r0.getValue()
            r2.invoke(r1, r0)
            goto L_0x0016
        L_0x0236:
            java.lang.Object r1 = r0.A02
            X.I1b r1 = (X.C56547I1b) r1
            r1.A00()
            java.lang.Object r1 = r0.A03
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r0.A01
            X.5Oz r0 = (X.C284945Oz) r0
            java.lang.Object r0 = r0.getValue()
        L_0x0249:
            r1.invoke(r0)
            goto L_0x0016
        L_0x024e:
            java.lang.Object r5 = r0.A03
            X.7NJ r5 = (X.AnonymousClass7NJ) r5
            java.lang.Object r1 = r0.A02
            X.A7s r1 = (X.C39752A7s) r1
            java.lang.Object r4 = r0.A01
            X.7NZ r4 = (X.AnonymousClass7NZ) r4
            android.widget.ImageView r0 = r1.A06
            if (r0 == 0) goto L_0x0016
            android.content.Context r3 = r0.getContext()
            if (r3 == 0) goto L_0x0016
            android.view.View r2 = r1.A01
            boolean r0 = r2 instanceof com.instagram.common.ui.widget.imageview.IgImageView
            if (r0 == 0) goto L_0x0016
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            if (r2 == 0) goto L_0x0016
            X.7NF r1 = r5.A00
            float r0 = r4.A00
            X.NEp r4 = new X.NEp
            r4.<init>(r3, r1, r0)
            goto L_0x02b2
        L_0x0278:
            java.lang.Object r2 = r0.A03
            X.7NP r2 = (X.AnonymousClass7NP) r2
            java.lang.Object r1 = r0.A02
            X.A7s r1 = (X.C39752A7s) r1
            java.lang.Object r0 = r0.A01
            X.7NZ r0 = (X.AnonymousClass7NZ) r0
            X.AnonymousClass7NP.A01(r1, r0, r2)
            goto L_0x0016
        L_0x0289:
            java.lang.Object r5 = r0.A03
            X.7NJ r5 = (X.AnonymousClass7NJ) r5
            java.lang.Object r1 = r0.A02
            X.A7s r1 = (X.C39752A7s) r1
            java.lang.Object r4 = r0.A01
            X.7NZ r4 = (X.AnonymousClass7NZ) r4
            android.widget.ImageView r0 = r1.A06
            if (r0 == 0) goto L_0x0016
            android.content.Context r3 = r0.getContext()
            if (r3 == 0) goto L_0x0016
            android.view.View r2 = r1.A01
            boolean r0 = r2 instanceof com.instagram.common.ui.widget.imageview.IgImageView
            if (r0 == 0) goto L_0x0016
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            if (r2 == 0) goto L_0x0016
            X.7NF r1 = r5.A00
            float r0 = r4.A00
            X.NEr r4 = new X.NEr
            r4.<init>(r3, r1, r0)
        L_0x02b2:
            r2.setImageDrawable(r4)
            goto L_0x0016
        L_0x02b7:
            java.lang.Object r3 = r0.A01
            com.instagram.common.ui.widget.imageview.IgImageView r3 = (com.instagram.common.ui.widget.imageview.IgImageView) r3
            java.lang.Object r2 = r0.A02
            com.instagram.common.ui.widget.imageview.IgImageView r2 = (com.instagram.common.ui.widget.imageview.IgImageView) r2
            r1 = 1
            X.C71081Ob0.A00(r3, r2, r1)
            java.lang.Object r0 = r0.A03
        L_0x02c5:
            X.0sa r0 = (X.C62320sa) r0
            r0.invoke()
            goto L_0x0016
        L_0x02cc:
            java.lang.Object r1 = r0.A03
            X.Nga r1 = (X.C69184Nga) r1
            X.MuD r1 = X.C69184Nga.A07(r1)
            X.NUQ r2 = r1.A07
            java.lang.String r1 = "TURN_OFF_3P_DIALOG_CANCEL_CLICK"
            r2.A0B(r1)
            java.lang.Object r3 = r0.A02
            X.PR9 r3 = (X.PR9) r3
            android.widget.CompoundButton$OnCheckedChangeListener r2 = r3.A08
            r1 = 0
            r3.A08 = r1
            java.lang.Object r1 = r0.A01
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            r0 = 1
            r1.setChecked(r0)
            r3.A08 = r2
            goto L_0x0016
        L_0x02f0:
            java.lang.Object r2 = r0.A01
            X.5nL r2 = (X.C294975nL) r2
            r1 = 0
            r2.A05 = r1
            r2.A07 = r1
            java.lang.Object r1 = r0.A03
            X.K6K r1 = (X.K6K) r1
            java.lang.Object r0 = r0.A02
            X.Lno r0 = (X.C65126Lno) r0
            X.K6K.A02(r1, r0)
            goto L_0x0016
        L_0x0306:
            java.lang.Object r1 = r0.A03
            X.AcO r1 = (X.C40453AcO) r1
            X.7Wa r2 = r1.A06
            java.lang.Object r1 = r0.A01
            X.7Ya r1 = (X.C333197Ya) r1
            java.lang.Object r0 = r0.A02
            android.os.Bundle r0 = (android.os.Bundle) r0
            r2.D6Y(r0, r1)
            goto L_0x0016
        L_0x0319:
            java.lang.Object r7 = r0.A01
            android.content.Context r7 = (android.content.Context) r7
            java.lang.Object r11 = r0.A03
            X.NJY r11 = (X.NJY) r11
            com.instagram.common.session.UserSession r1 = r11.A0N()
            java.lang.Object r12 = r0.A02
            X.N4P r12 = (X.N4P) r12
            X.Pv4 r10 = r11.A0Q
            if (r10 != 0) goto L_0x0337
            java.lang.String r0 = "clientInfra"
        L_0x032f:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0337:
            X.1a8 r8 = r11.A0z
            X.AnonymousClass7TG.A1T(r7, r1, r12)
            r0 = 4
            X.0qQ.A0B(r8, r0)
            com.instagram.user.model.User r6 = X.AnonymousClass7TF.A0Q(r1)
            X.3Te r4 = r12.A0E
            r5 = 0
            if (r4 == 0) goto L_0x0016
            java.util.List r2 = r4.A0D
            if (r2 == 0) goto L_0x0476
            java.lang.String r0 = r6.getId()
            boolean r3 = r2.contains(r0)
        L_0x0355:
            java.util.List r2 = r4.A0E
            if (r2 == 0) goto L_0x0361
            java.lang.String r0 = r6.getId()
            boolean r5 = r2.contains(r0)
        L_0x0361:
            if (r3 == 0) goto L_0x0409
            X.6gx r9 = X.C313746gw.A00(r1)
            int r16 = r12.A06()
            X.3t3 r0 = r12.A0L
            java.lang.String r14 = X.C300965yF.A07(r0)
            java.lang.String r15 = r12.A0Q
            X.0wc r0 = r9.A03
            X.1Ln r5 = X.1Ln.A0E(r0)
            X.0Aj r0 = r5.A00
            boolean r0 = r0.isSampled()
            if (r0 == 0) goto L_0x03b8
            long r2 = r9.A02
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r5.A0h(r0)
            java.lang.String r0 = "resign_collaborator_dialog_rendered"
            r5.A0l(r0)
            java.lang.String r0 = "tap"
            r5.A0k(r0)
            java.lang.String r0 = "resign_cta_button"
            r5.A0p(r0)
            java.lang.String r0 = "thread_details"
            r5.A0q(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            java.lang.String r0 = X.C313746gw.A01(r0)
            r5.A0o(r0)
            r5.A0s(r14)
            if (r15 == 0) goto L_0x0407
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r15)
        L_0x03b2:
            r5.A0i(r0)
            r5.Cgf()
        L_0x03b8:
            com.instagram.user.model.User r13 = X.AnonymousClass7TF.A0Q(r1)
            int r1 = r12.A09
            boolean r0 = X.AnonymousClass48O.A02(r1)
            if (r0 != 0) goto L_0x03cb
            boolean r1 = X.C66651MaK.A03(r4, r1)
            r0 = 0
            if (r1 == 0) goto L_0x03cc
        L_0x03cb:
            r0 = 1
        L_0x03cc:
            r1 = 1
            if (r0 == 0) goto L_0x03d6
            boolean r0 = r4.A0R
            r3 = 2131958692(0x7f131ba4, float:1.9554003E38)
            if (r0 != r1) goto L_0x03d9
        L_0x03d6:
            r3 = 2131958693(0x7f131ba5, float:1.9554005E38)
        L_0x03d9:
            X.8ab r0 = new X.8ab
            r0.<init>((android.content.Context) r7)
            r2 = 2131958689(0x7f131ba1, float:1.9553997E38)
            r0.A09(r2)
            r0.A08(r3)
            r2 = 2131958945(0x7f131ca1, float:1.9554517E38)
            r17 = 0
            X.OfO r6 = new X.OfO
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0.A0K(r6, r2)
            r7 = 2
        L_0x03f5:
            X.I8K r2 = new X.I8K
            r3 = r9
            r4 = r14
            r5 = r15
            r6 = r16
            r2.<init>(r3, r4, r5, r6, r7)
            r0.A0C(r2)
            X.AnonymousClass7TH.A0a(r0, r1)
            goto L_0x0016
        L_0x0407:
            r0 = 0
            goto L_0x03b2
        L_0x0409:
            if (r5 == 0) goto L_0x0016
            r0 = 25
            X.PhW r2 = new X.PhW
            r2.<init>(r1, r0)
            java.lang.Class<X.7GX> r0 = X.AnonymousClass7GX.class
            java.lang.Object r9 = r1.A01(r0, r2)
            X.7GX r9 = (X.AnonymousClass7GX) r9
            int r16 = r12.A06()
            X.3t3 r0 = r12.A0L
            java.lang.String r14 = X.C300965yF.A07(r0)
            java.lang.String r15 = r12.A0Q
            com.instagram.common.session.UserSession r0 = r9.A00
            java.lang.String r20 = "resign_moderator_dialog_rendered"
            java.lang.String r21 = "tap"
            java.lang.String r22 = "resign_cta_button"
            java.lang.String r23 = "thread_details"
            r24 = 0
            r17 = r0
            r18 = r14
            r19 = r15
            r25 = r16
            X.C69871NtZ.A00(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            com.instagram.user.model.User r18 = X.AnonymousClass7TF.A0Q(r1)
            X.8ab r0 = new X.8ab
            r0.<init>((android.content.Context) r7)
            r1 = 2131958691(0x7f131ba3, float:1.9554001E38)
            r0.A09(r1)
            r1 = 2131958690(0x7f131ba2, float:1.9554E38)
            r0.A08(r1)
            r3 = 2131958945(0x7f131ca1, float:1.9554517E38)
            r1 = 1
            X.OfO r2 = new X.OfO
            r17 = r2
            r19 = r8
            r20 = r10
            r21 = r7
            r22 = r9
            r23 = r12
            r24 = r11
            r25 = r14
            r26 = r15
            r27 = r16
            r28 = r1
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r0.A0K(r2, r3)
            r7 = 3
            goto L_0x03f5
        L_0x0476:
            r3 = 0
            goto L_0x0355
        L_0x0479:
            java.lang.Object r11 = r0.A01
            android.content.Context r11 = (android.content.Context) r11
            java.lang.Object r1 = r0.A03
            r18 = r1
            r1 = r18
            X.NJY r1 = (X.NJY) r1
            r18 = r1
            com.instagram.common.session.UserSession r10 = r18.A0N()
            java.lang.Object r9 = r0.A02
            X.N4P r9 = (X.N4P) r9
            java.lang.String r17 = X.AnonymousClass7TG.A0j()
            r16 = 0
            r0 = r16
            X.0qQ.A0B(r11, r0)
            r8 = 1
            X.AnonymousClass7TF.A1B(r10, r8, r9)
            X.FYu r19 = X.C48796EkJ.A00(r10)
            X.6gx r7 = X.C313746gw.A00(r10)
            X.FYv r6 = X.C69866NtU.A00(r10)
            X.3t3 r0 = r9.A0L
            X.3t0 r0 = X.C300965yF.A01(r0)
            java.lang.String r5 = r0.A00
            X.3sy r0 = r9.A08()
            com.instagram.model.direct.DirectThreadKey r0 = X.C66647MaG.A03(r0)
            java.lang.String r4 = r0.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 36314910560357253(0x81043800000b85, double:3.029033894553089E-306)
            boolean r28 = X.182.A06(r2, r10, r0)
            if (r4 != 0) goto L_0x0628
            r13 = 0
        L_0x04ca:
            X.3Te r2 = r9.A0E
            r3 = -1
            if (r2 == 0) goto L_0x04d6
            int r0 = r2.A01
            r1 = 2131959233(0x7f131dc1, float:1.95551E38)
            if (r0 == r3) goto L_0x04db
        L_0x04d6:
            r1 = 2131959234(0x7f131dc2, float:1.9555103E38)
            if (r2 == 0) goto L_0x04e2
        L_0x04db:
            int r0 = r2.A01
            r12 = 2131959237(0x7f131dc5, float:1.9555109E38)
            if (r0 == r3) goto L_0x04e5
        L_0x04e2:
            r12 = 2131959235(0x7f131dc3, float:1.9555105E38)
        L_0x04e5:
            X.8ab r3 = new X.8ab
            r3.<init>((android.content.Context) r11)
            r3.A09(r1)
            com.instagram.direct.model.thread.CreatorSubscriberThreadInfo r0 = r9.A0G
            r1 = 61
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            if (r0 == 0) goto L_0x0601
            java.lang.Long r0 = r0.A01
            if (r0 == 0) goto L_0x0601
            long r14 = r0.longValue()
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            r2.<init>(r1, r0)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = r0.toMillis(r14)
        L_0x050e:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = r2.format(r0)
            r1 = 2131959236(0x7f131dc4, float:1.9555107E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r11.getString(r1, r0)
        L_0x0521:
            X.0qQ.A07(r0)
            r3.A0q(r0)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r11, r12)
            X.FIx r1 = new X.FIx
            r25 = r5
            r26 = r4
            r27 = r17
            r20 = r7
            r21 = r6
            r22 = r18
            r23 = r9
            r24 = r13
            r17 = r1
            r18 = r10
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            X.8ae r0 = X.C358278ae.RED_BOLD
            r3.A0Y(r1, r0, r2, r8)
            X.FIu r0 = new X.FIu
            r29 = r0
            r30 = r7
            r31 = r9
            r32 = r19
            r33 = r6
            r34 = r13
            r35 = r5
            r36 = r4
            r37 = r16
            r38 = r28
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38)
            r3.A0C(r0)
            X.AnonymousClass7TH.A0a(r3, r8)
            int r1 = r9.A09
            r0 = 29
            if (r1 != r0) goto L_0x05b5
            X.0wc r0 = r7.A03
            X.1Ln r2 = X.1Ln.A0E(r0)
            X.0Aj r0 = r2.A00
            boolean r0 = r0.isSampled()
            if (r0 == 0) goto L_0x0016
            com.instagram.common.session.UserSession r0 = r7.A04
            java.lang.String r0 = r0.A06
            long r0 = java.lang.Long.parseLong(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0h(r0)
            java.lang.String r0 = "end_chat_dialog_rendered"
            r2.A0l(r0)
            java.lang.String r0 = "tap"
            r2.A0k(r0)
            java.lang.String r0 = "end_chat_cta_button"
            r2.A0p(r0)
            java.lang.String r0 = "thread_details"
            r2.A0q(r0)
            java.lang.String r0 = "broadcast"
            r2.A0o(r0)
            r2.A0s(r5)
            if (r4 == 0) goto L_0x05ff
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r4)
        L_0x05ad:
            r2.A0i(r0)
            r2.Cgf()
            goto L_0x0016
        L_0x05b5:
            boolean r0 = X.AnonymousClass48O.A01(r1)
            if (r0 == 0) goto L_0x0016
            X.0wc r0 = r6.A02
            X.1Ln r2 = X.1Ln.A0F(r0)
            X.0Aj r0 = r2.A00
            boolean r0 = r0.isSampled()
            if (r0 == 0) goto L_0x0016
            com.instagram.common.session.UserSession r0 = r6.A03
            java.lang.String r0 = r0.A06
            long r0 = java.lang.Long.parseLong(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0h(r0)
            java.lang.String r0 = "end_chat_dialog_rendered"
            r2.A0l(r0)
            java.lang.String r0 = "tap"
            r2.A0k(r0)
            java.lang.String r0 = "end_chat_cta_button"
            r2.A0p(r0)
            r0 = 4103(0x1007, float:5.75E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A0q(r0)
            java.lang.String r0 = "instagram"
            r2.A0o(r0)
            r2.A0s(r5)
            if (r4 == 0) goto L_0x05ff
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r4)
            goto L_0x05ad
        L_0x05ff:
            r0 = 0
            goto L_0x05ad
        L_0x0601:
            if (r2 == 0) goto L_0x061f
            int r0 = r2.A01
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            if (r2 == 0) goto L_0x061f
            if (r0 <= 0) goto L_0x061f
            java.util.Locale r14 = java.util.Locale.getDefault()
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            r2.<init>(r1, r14)
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = (long) r0
            long r0 = r14.toMillis(r0)
            goto L_0x050e
        L_0x061f:
            r0 = 2131959238(0x7f131dc6, float:1.955511E38)
            java.lang.String r0 = r11.getString(r0)
            goto L_0x0521
        L_0x0628:
            X.FAS r13 = new X.FAS
            r0 = r17
            r13.<init>(r10, r0, r5, r4)
            goto L_0x04ca
        L_0x0631:
            java.lang.Object r4 = r0.A01
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r5 = r0.A03
            X.NJY r5 = (X.NJY) r5
            com.instagram.common.session.UserSession r3 = r5.A0N()
            java.lang.Object r6 = r0.A02
            X.N4P r6 = (X.N4P) r6
            X.AnonymousClass7TG.A1T(r4, r3, r6)
            X.6gx r7 = X.C313746gw.A00(r3)
            int r11 = r6.A06()
            X.3t3 r0 = r6.A0L
            java.lang.String r9 = X.C300965yF.A07(r0)
            java.lang.String r10 = r6.A0Q
            X.3Te r0 = r6.A0E
            if (r0 == 0) goto L_0x0675
            java.lang.String r1 = r0.A07
        L_0x065a:
            java.lang.String r0 = r3.A06
            boolean r12 = X.0qQ.A0K(r1, r0)
            java.lang.Integer r8 = X.AnonymousClass05K.A01
            r7.A0L(r8, r9, r10, r11, r12)
            X.3sy r2 = r6.A08()
            X.PEe r1 = new X.PEe
            r1.<init>(r4, r3, r5, r6)
            java.lang.Integer r0 = X.AnonymousClass05K.A06
            X.C70266Nzw.A00(r4, r3, r1, r2, r0)
            goto L_0x0016
        L_0x0675:
            r1 = 0
            goto L_0x065a
        L_0x0677:
            java.lang.Object r1 = r0.A03
            X.NJY r1 = (X.NJY) r1
            com.instagram.common.session.UserSession r4 = r1.A0N()
            java.lang.Object r3 = r0.A02
            X.N4P r3 = (X.N4P) r3
            r1 = 1
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.0qQ.A0B(r3, r1)
            int r0 = r3.A0A
            boolean r0 = X.OPx.A00(r0)
            r2 = 1
            if (r0 == 0) goto L_0x06cd
            boolean r0 = r3.A0i
            if (r0 != 0) goto L_0x06cd
            boolean r0 = X.C69946Num.A00(r4, r3)
            if (r0 != 0) goto L_0x06cd
            int r1 = r3.A07
            r0 = 8
            if (r1 == r0) goto L_0x06cd
            r0 = 6
            if (r1 == r0) goto L_0x06cd
            int r1 = r3.A09
            r0 = 29
            if (r1 != r0) goto L_0x06ce
            boolean r0 = X.C329997La.A01(r4, r3)
            if (r0 != 0) goto L_0x06cd
            X.3Te r0 = r3.A0E
            if (r0 == 0) goto L_0x06cd
            boolean r0 = r0.A0I
            if (r0 == 0) goto L_0x06cd
            goto L_0x06ce
        L_0x06bc:
            boolean r0 = X.C69952Nus.A00(r3, r0, r2, r1)
            if (r0 == 0) goto L_0x06cd
            boolean r0 = r2.A0C()
            if (r0 != 0) goto L_0x06cd
            boolean r0 = r4.A0l
            r2 = 1
            if (r0 == 0) goto L_0x06ce
        L_0x06cd:
            r2 = 0
        L_0x06ce:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r2)
            return r10
        L_0x06d3:
            java.lang.Object r4 = r0.A02
            X.3Y5 r4 = (X.AnonymousClass3Y5) r4
            android.content.Context r11 = X.C243803a8.A00(r4)
            java.lang.Object r5 = r0.A03
            X.Gwr r5 = (X.C53947Gwr) r5
            com.instagram.common.session.UserSession r12 = r5.A03
            java.lang.Object r14 = r0.A01
            com.instagram.model.mediasize.GifUrlImpl r14 = (com.instagram.model.mediasize.GifUrlImpl) r14
            X.7fs r2 = r5.A02
            java.lang.String r3 = r2.A02
            android.content.Context r1 = X.C243803a8.A00(r4)
            r0 = 1
            float r17 = X.0nA.A04(r1, r0)
            android.content.Context r1 = X.C243803a8.A00(r4)
            int r0 = r5.A01
            X.6tX r13 = X.HX4.A00(r1, r2, r0)
            android.content.Context r2 = X.C243803a8.A00(r4)
            android.content.Context r1 = X.C243803a8.A00(r4)
            r0 = 2130971273(0x7f040a89, float:1.755128E38)
            int r0 = X.2Yu.A0H(r1, r0)
            int r18 = r2.getColor(r0)
            android.content.Context r2 = X.C243803a8.A00(r4)
            android.content.Context r1 = X.C243803a8.A00(r4)
            r0 = 2130971272(0x7f040a88, float:1.7551278E38)
            int r0 = X.2Yu.A0H(r1, r0)
            int r19 = r2.getColor(r0)
            java.lang.Integer r15 = X.AnonymousClass05K.A00
            X.6tR r10 = new X.6tR
            r16 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r10
        L_0x072c:
            X.0rm r5 = new X.0rm
            r5.<init>()
            java.lang.Object r4 = r0.A03
            X.GMH r4 = (X.GMH) r4
            X.3ex r2 = r4.A05
            com.instagram.common.session.UserSession r1 = r4.A03
            boolean r1 = X.GMK.A03(r1, r2)
            if (r1 == 0) goto L_0x0751
            java.lang.Object r1 = r0.A02
            java.lang.Object r0 = r0.A01
            r3 = 0
            X.GPh r2 = new X.GPh
            r2.<init>(r3, r1, r4, r0)
            r5.A00 = r2
            X.3W1 r1 = r4.A09
            r0 = 0
            r1.A0L(r2, r0, r3)
        L_0x0751:
            r0 = 27
            X.GNG r1 = new X.GNG
            r1.<init>(r0, r5, r4)
            goto L_0x09ef
        L_0x075a:
            java.lang.Object r3 = r0.A02
            X.2V5 r3 = (X.2V5) r3
            java.lang.Object r2 = r0.A03
            X.2V5 r2 = (X.2V5) r2
            java.lang.Object r1 = r0.A01
            X.2V5 r1 = (X.2V5) r1
            r0 = 0
            X.GA2 r10 = new X.GA2
            r10.<init>(r3, r2, r1, r0)
            return r10
        L_0x076d:
            java.lang.Object r1 = r0.A03
            X.2Wa r1 = (X.2Wa) r1
            java.lang.Object r1 = r1.A03
            boolean r1 = X.AnonymousClass7TE.A1a(r1)
            if (r1 == 0) goto L_0x09e9
            r7 = 2
            float[] r1 = new float[r7]
            r1 = {1065353216, 0} // fill-array
            android.animation.ValueAnimator r6 = android.animation.ValueAnimator.ofFloat(r1)
            java.lang.Object r3 = r0.A01
            X.2V5 r3 = (X.2V5) r3
            r4 = 300(0x12c, double:1.48E-321)
            r6.setDuration(r4)
            r2 = 13
            X.I84 r1 = new X.I84
            r1.<init>((X.2V5) r3, (int) r2)
            r6.addUpdateListener(r1)
            r6.start()
            float[] r1 = new float[r7]
            r1 = {0, -1054867456} // fill-array
            android.animation.ValueAnimator r3 = android.animation.ValueAnimator.ofFloat(r1)
            java.lang.Object r2 = r0.A02
            X.2V5 r2 = (X.2V5) r2
            r3.setDuration(r4)
            r1 = 14
            X.I84 r0 = new X.I84
            r0.<init>((X.2V5) r2, (int) r1)
            r3.addUpdateListener(r0)
            r3.start()
            goto L_0x09e9
        L_0x07b8:
            java.lang.Object r2 = r0.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r0.A02
            X.UkT r1 = (X.C15904UkT) r1
            java.lang.Object r0 = r0.A03
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            X.9X4 r10 = new X.9X4
            r10.<init>(r2, r0, r1)
            return r10
        L_0x07ca:
            java.lang.Object r1 = r0.A03
            X.WUW r1 = (X.WUW) r1
            android.content.Context r11 = r1.A06
            java.lang.Object r14 = r0.A01
            X.8AL r14 = (X.AnonymousClass8AL) r14
            X.WUJ r13 = r1.A0C
            X.8HT r12 = r1.A0A
            r15 = 0
            X.9ma r10 = new X.9ma
            r10.<init>(r11, r12, r13, r14, r15)
            java.lang.Object r0 = r0.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            java.util.ArrayList r1 = X.ABO.A01(r11, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x07fe
            X.8HJ[] r1 = X.AnonymousClass8HJ.values()
            int r0 = r1.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.util.List r1 = java.util.Arrays.asList(r0)
            X.8HJ r0 = X.AnonymousClass8HJ.NONE
            r1.remove(r0)
        L_0x07fe:
            r10.A04(r1)
            return r10
        L_0x0802:
            java.lang.Object r1 = r0.A03
            X.Ljc r1 = (X.C64876Ljc) r1
            com.instagram.common.session.UserSession r4 = r1.A04
            java.lang.Object r1 = r0.A02
            android.view.View r1 = (android.view.View) r1
            android.content.Context r3 = X.AnonymousClass7TE.A0S(r1)
            java.lang.Object r2 = r0.A01
            X.07i r2 = (X.AnonymousClass07i) r2
            r1 = 0
            X.2lw r0 = new X.2lw
            r0.<init>(r3, r2, r1)
            X.KCW r10 = new X.KCW
            r10.<init>(r0, r4)
            return r10
        L_0x0820:
            java.lang.Object r2 = r0.A03
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Object r1 = r0.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            java.lang.Object r0 = r0.A02
            X.81T r0 = (X.AnonymousClass81T) r0
            X.88Y r10 = new X.88Y
            r10.<init>(r1, r0, r2)
            return r10
        L_0x0832:
            java.lang.Object r2 = r0.A03
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            java.lang.Object r1 = r0.A02
            X.88R r1 = (X.AnonymousClass88R) r1
            java.lang.Object r0 = r0.A01
            X.8FR r0 = (X.AnonymousClass8FR) r0
            X.8FU r10 = new X.8FU
            r10.<init>(r2, r0, r1)
            return r10
        L_0x0844:
            java.lang.Object r3 = r0.A02
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r2 = r0.A01
            X.869 r2 = (X.AnonymousClass869) r2
            java.lang.Object r0 = r0.A03
            X.07g r0 = (X.AnonymousClass07g) r0
            X.2YN r1 = new X.2YN
            r1.<init>(r0)
            java.lang.Class<X.8N0> r0 = X.AnonymousClass8N0.class
            X.2YL r0 = r1.A00(r0)
            X.8N0 r0 = (X.AnonymousClass8N0) r0
            X.Y0B r10 = new X.Y0B
            r10.<init>(r3, r2, r0)
            return r10
        L_0x0863:
            java.lang.Object r4 = r0.A01
            X.84u r4 = (X.C3504784u) r4
            java.lang.Object r3 = r0.A03
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            java.lang.Object r2 = r0.A02
            X.81m r2 = (X.C3497281m) r2
            X.81t r0 = r2.A00()
            android.widget.FrameLayout r1 = r0.Btr()
            X.81t r0 = r2.A00()
            X.9m9 r0 = r0.Btk()
            X.WUX r10 = new X.WUX
            r10.<init>(r1, r3, r0, r4)
            return r10
        L_0x0885:
            java.lang.Object r2 = r0.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r0.A03
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r0 = r0.A02
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            X.9QO r10 = new X.9QO
            r10.<init>(r2, r0, r1)
            return r10
        L_0x0897:
            java.lang.Object r2 = r0.A01
            X.8W7 r2 = (X.AnonymousClass8W7) r2
            java.lang.Object r1 = r0.A02
            X.4DH r1 = (X.AnonymousClass4DH) r1
            java.lang.Object r0 = r0.A03
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.8W9 r10 = new X.8W9
            r10.<init>(r1, r0, r2)
            return r10
        L_0x08a9:
            java.lang.Object r2 = r0.A01
            X.8W7 r2 = (X.AnonymousClass8W7) r2
            java.lang.Object r1 = r0.A02
            X.4DH r1 = (X.AnonymousClass4DH) r1
            java.lang.Object r0 = r0.A03
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.8no r10 = new X.8no
            r10.<init>(r1, r0, r2)
            return r10
        L_0x08bb:
            java.lang.Object r9 = r0.A02
            com.instagram.creation.capture.quickcapture.aspectratioutil.intf.CreationLayoutConfig r9 = (com.instagram.creation.capture.quickcapture.aspectratioutil.intf.CreationLayoutConfig) r9
            if (r9 == 0) goto L_0x0927
            java.lang.Object r1 = r0.A01
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = r0.A03
            X.9Pb r0 = (X.C378249Pb) r0
            int r8 = r0.A01
            r7 = 1
            X.0qQ.A0B(r1, r7)
            r0 = 2131439291(0x7f0b2ebb, float:1.8500533E38)
            android.view.View r6 = X.AnonymousClass7TF.A0F(r1, r0)
            android.view.ViewStub r6 = (android.view.ViewStub) r6
            X.3oV r10 = X.2b1.A00(r6)
            boolean r5 = r9.CTv()
            r4 = 7
            r3 = 5
            r2 = 4
            r1 = 3
            r0 = 2
            if (r5 == 0) goto L_0x090b
            if (r8 == r0) goto L_0x0907
            if (r8 == r1) goto L_0x08f4
            if (r8 == r2) goto L_0x0903
            if (r8 == r3) goto L_0x0903
            r0 = 2131628710(0x7f0e12a6, float:1.888472E38)
            if (r8 != r4) goto L_0x08f7
        L_0x08f4:
            r0 = 2131628712(0x7f0e12a8, float:1.8884724E38)
        L_0x08f7:
            r6.setLayoutResource(r0)
            X.Ljl r0 = new X.Ljl
            r0.<init>(r9, r7)
            r10.EeU(r0)
            return r10
        L_0x0903:
            r0 = 2131628708(0x7f0e12a4, float:1.8884716E38)
            goto L_0x08f7
        L_0x0907:
            r0 = 2131628711(0x7f0e12a7, float:1.8884722E38)
            goto L_0x08f7
        L_0x090b:
            if (r8 == r0) goto L_0x0923
            if (r8 == r1) goto L_0x0918
            if (r8 == r2) goto L_0x091f
            if (r8 == r3) goto L_0x091f
            r0 = 2131628709(0x7f0e12a5, float:1.8884718E38)
            if (r8 != r4) goto L_0x091b
        L_0x0918:
            r0 = 2131628712(0x7f0e12a8, float:1.8884724E38)
        L_0x091b:
            r6.setLayoutResource(r0)
            return r10
        L_0x091f:
            r0 = 2131628708(0x7f0e12a4, float:1.8884716E38)
            goto L_0x091b
        L_0x0923:
            r0 = 2131628711(0x7f0e12a7, float:1.8884722E38)
            goto L_0x091b
        L_0x0927:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x092c:
            java.lang.Object r12 = r0.A02
            androidx.fragment.app.Fragment r12 = (androidx.fragment.app.Fragment) r12
            android.content.Context r11 = r12.requireContext()
            java.lang.Object r1 = r0.A03
            X.LAg r1 = (X.C63877LAg) r1
            com.instagram.common.session.UserSession r13 = r1.A01
            java.lang.Object r14 = r0.A01
            X.82p r14 = (X.C3499582p) r14
            X.KO3 r0 = r1.A03
            X.3Q2 r15 = r0.A04()
            X.LoB r10 = new X.LoB
            r10.<init>(r11, r12, r13, r14, r15)
            return r10
        L_0x094a:
            java.lang.Object r4 = r0.A02
            X.3Y5 r4 = (X.AnonymousClass3Y5) r4
            android.content.Context r3 = X.C243803a8.A00(r4)
            java.lang.Object r2 = r0.A03
            X.Gw3 r2 = (X.C53897Gw3) r2
            java.lang.Object r1 = r0.A01
            X.3Zt r1 = (X.C243673Zt) r1
            X.Jdj r0 = new X.Jdj
            r0.<init>(r4, r1, r2)
            X.Gwa r10 = new X.Gwa
            r10.<init>(r3, r0)
            return r10
        L_0x0965:
            java.lang.Object r4 = r0.A03
            X.Gw7 r4 = (X.C53901Gw7) r4
            X.MQV r2 = r4.A04
            boolean r1 = r2 instanceof X.C61199Jys
            if (r1 == 0) goto L_0x09e9
            X.Jys r2 = (X.C61199Jys) r2
            X.MQW r6 = r2.A02
            boolean r1 = r6 instanceof X.C382029cy
            if (r1 == 0) goto L_0x09e9
            java.lang.Object r2 = r0.A02
            X.7cF r2 = (X.C335017cF) r2
            r3 = r6
            X.9cy r3 = (X.C382029cy) r3
            java.util.UUID r5 = r3.A01
            r1 = 0
            X.0qQ.A0B(r5, r1)
            java.util.UUID r1 = r2.A00
            boolean r1 = r5.equals(r1)
            r1 = r1 ^ 1
            r2.A00 = r5
            if (r1 == 0) goto L_0x09cc
            boolean r1 = r3.A02     // Catch:{ IllegalArgumentException -> 0x09bd }
            if (r1 == 0) goto L_0x09b1
            java.lang.Object r1 = r0.A01     // Catch:{ IllegalArgumentException -> 0x09bd }
            X.7cD r1 = (X.C334997cD) r1     // Catch:{ IllegalArgumentException -> 0x09bd }
            X.7go r0 = r1.A01     // Catch:{ IllegalArgumentException -> 0x09bd }
            if (r0 == 0) goto L_0x09a3
            X.2Wh r0 = r0.A01     // Catch:{ IllegalArgumentException -> 0x09bd }
            if (r0 == 0) goto L_0x09a3
            androidx.recyclerview.widget.RecyclerView r3 = r0.A04     // Catch:{ IllegalArgumentException -> 0x09bd }
            goto L_0x09a4
        L_0x09a3:
            r3 = 0
        L_0x09a4:
            if (r3 == 0) goto L_0x09cc
            X.Anq r2 = new X.Anq     // Catch:{ IllegalArgumentException -> 0x09bd }
            r2.<init>(r1, r6)     // Catch:{ IllegalArgumentException -> 0x09bd }
            r0 = 300(0x12c, double:1.48E-321)
            r3.postDelayed(r2, r0)     // Catch:{ IllegalArgumentException -> 0x09bd }
            goto L_0x09cc
        L_0x09b1:
            java.lang.Object r2 = r0.A01     // Catch:{ IllegalArgumentException -> 0x09bd }
            X.7cD r2 = (X.C334997cD) r2     // Catch:{ IllegalArgumentException -> 0x09bd }
            java.lang.String r1 = r3.A00     // Catch:{ IllegalArgumentException -> 0x09bd }
            java.lang.Integer r0 = X.AnonymousClass05K.A0N     // Catch:{ IllegalArgumentException -> 0x09bd }
            r2.A02(r0, r1)     // Catch:{ IllegalArgumentException -> 0x09bd }
            goto L_0x09cc
        L_0x09bd:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Error processing ui action "
            java.lang.String r1 = X.AnonymousClass7TG.A0m(r6, r0, r1)
            java.lang.String r0 = "BroadcastChannelRepliesListComponent"
            X.0KC.A0C(r0, r1)
        L_0x09cc:
            X.JjH r3 = r4.A03
            X.05G r2 = r3.A0E
            java.lang.Object r1 = r2.getValue()
            X.MQW r1 = (X.MQW) r1
            boolean r0 = r1 instanceof X.C382029cy
            if (r0 == 0) goto L_0x09f5
            X.9cy r1 = (X.C382029cy) r1
            java.util.UUID r0 = r1.A01
            boolean r0 = X.0qQ.A0K(r0, r5)
            if (r0 == 0) goto L_0x09e9
            X.Lq9 r0 = X.Lq9.A00
            r2.Epw(r0)
        L_0x09e9:
            r0 = 0
            X.Iom r1 = new X.Iom
            r1.<init>(r0)
        L_0x09ef:
            X.3dj r10 = new X.3dj
            r10.<init>(r1)
            return r10
        L_0x09f5:
            boolean r0 = r1 instanceof X.Lq9
            if (r0 == 0) goto L_0x09e9
            com.instagram.comments.mvvm.data.MediaCommentListRepository r4 = r3.A05
            X.4Cq r3 = r4.A01
            r2 = 0
            r1 = 19
            X.MGz r0 = new X.MGz
            r0.<init>((java.lang.Object) r5, (java.lang.Object) r4, (X.AnonymousClass4D7) r2, (int) r1)
            X.AnonymousClass7TE.A1Z(r0, r3)
            goto L_0x09e9
        L_0x0a09:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41567AwZ.invoke():java.lang.Object");
    }
}
