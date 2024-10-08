package X;

/* renamed from: X.Plh  reason: case insensitive filesystem */
public final class C73906Plh extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73906Plh(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass0eM A00(Object obj, int i) {
        return AnonymousClass1YB.A00(new C73906Plh(obj, i));
    }

    /* JADX WARNING: type inference failed for: r0v67, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View, java.lang.Object] */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0237: MOVE  (r1v32 X.4mf) = (r1v31 X.4mf)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r15 = this;
            int r0 = r15.A00
            switch(r0) {
                case 0: goto L_0x040f;
                case 1: goto L_0x03e3;
                case 2: goto L_0x03d1;
                case 3: goto L_0x03bf;
                case 4: goto L_0x03ad;
                case 5: goto L_0x039f;
                case 6: goto L_0x038d;
                case 7: goto L_0x0379;
                case 8: goto L_0x0056;
                case 9: goto L_0x0367;
                case 10: goto L_0x0355;
                case 11: goto L_0x0343;
                case 12: goto L_0x0337;
                case 13: goto L_0x0324;
                case 14: goto L_0x0312;
                case 15: goto L_0x0302;
                case 16: goto L_0x02f2;
                case 17: goto L_0x02e4;
                case 18: goto L_0x0283;
                case 19: goto L_0x026f;
                case 20: goto L_0x0256;
                case 21: goto L_0x0246;
                case 22: goto L_0x022f;
                case 23: goto L_0x0224;
                case 24: goto L_0x01d5;
                case 25: goto L_0x01b1;
                case 26: goto L_0x01a3;
                case 27: goto L_0x0195;
                case 28: goto L_0x0187;
                case 29: goto L_0x0179;
                case 30: goto L_0x016b;
                case 31: goto L_0x015d;
                case 32: goto L_0x014f;
                case 33: goto L_0x0141;
                case 34: goto L_0x0133;
                case 35: goto L_0x0125;
                case 36: goto L_0x0113;
                case 37: goto L_0x0047;
                case 38: goto L_0x00ec;
                case 39: goto L_0x00da;
                case 40: goto L_0x00c8;
                case 41: goto L_0x0005;
                case 42: goto L_0x00a1;
                case 43: goto L_0x0005;
                case 44: goto L_0x0005;
                case 45: goto L_0x001e;
                case 46: goto L_0x008f;
                case 47: goto L_0x007f;
                case 48: goto L_0x0071;
                case 49: goto L_0x005f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r15.A01
            X.PMS r0 = (X.PMS) r0
            X.O9u r0 = r0.A03()
            X.Neh r1 = r0.A00
            X.0sa r0 = r1.A0L
            r0.invoke()
            X.Ocu r1 = r1.A08
            X.PPP r0 = X.PPP.A00
        L_0x0018:
            r1.A03(r0)
        L_0x001b:
            X.0gF r9 = X.C60340gF.A00
        L_0x001d:
            return r9
        L_0x001e:
            java.lang.Object r5 = r15.A01
            X.PMS r5 = (X.PMS) r5
            boolean r1 = r5.A0R
            X.0eM r0 = r5.A0D
            android.view.View r4 = X.AnonymousClass7TE.A0c(r0)
            r3 = 2131443531(0x7f0b3f4b, float:1.8509133E38)
            r0 = 44
            if (r1 == 0) goto L_0x0036
            r3 = 2131443532(0x7f0b3f4c, float:1.8509135E38)
            r0 = 43
        L_0x0036:
            X.Plh r2 = new X.Plh
            r2.<init>(r5, r0)
            r1 = 1
            android.view.View r9 = r4.findViewById(r3)
            if (r9 == 0) goto L_0x001d
            r0 = 0
            X.O2G.A00(r9, r2, r0, r1)
            return r9
        L_0x0047:
            java.lang.Object r0 = r15.A01
            X.PMS r0 = (X.PMS) r0
            X.O9u r0 = r0.A03()
            X.Neh r0 = r0.A00
            X.Ocu r1 = r0.A08
            X.PLn r0 = X.C72825PLn.A00
            goto L_0x0018
        L_0x0056:
            java.lang.Object r1 = r15.A01
            X.OK5 r1 = (X.OK5) r1
            r0 = 0
            r1.A00(r0)
            goto L_0x001b
        L_0x005f:
            java.lang.Object r0 = r15.A01
            X.PMS r0 = (X.PMS) r0
            X.0eM r0 = r0.A0D
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            r0 = 2131429362(0x7f0b07f2, float:1.8480395E38)
            android.view.View r9 = r1.findViewById(r0)
            return r9
        L_0x0071:
            java.lang.Object r0 = r15.A01
            X.PMS r0 = (X.PMS) r0
            android.view.View r1 = r0.A03
            r0 = 2131429363(0x7f0b07f3, float:1.8480397E38)
            X.3Nc r9 = X.C240903Nb.A00(r1, r0)
            return r9
        L_0x007f:
            java.lang.Object r1 = r15.A01
            X.PMS r1 = (X.PMS) r1
            X.0eM r0 = r1.A0E
            android.view.View r9 = X.JTR.A0W(r0)
            android.view.View r0 = r1.A03
            r0.requestApplyInsets()
            return r9
        L_0x008f:
            java.lang.Object r0 = r15.A01
            X.PMS r0 = (X.PMS) r0
            X.0eM r0 = r0.A0D
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            r0 = 2131429361(0x7f0b07f1, float:1.8480393E38)
            android.view.View r9 = r1.findViewById(r0)
            return r9
        L_0x00a1:
            java.lang.Object r1 = r15.A01
            X.PMS r1 = (X.PMS) r1
            X.0eM r0 = r1.A08
            java.lang.Object r4 = r0.getValue()
            X.3Nc r4 = (X.C240913Nc) r4
            r0 = 41
            X.Plh r3 = new X.Plh
            r3.<init>(r1, r0)
            r2 = 2131429534(0x7f0b089e, float:1.8480743E38)
            r1 = 1
            android.view.View r0 = r4.A00()
            android.view.View r9 = r0.findViewById(r2)
            X.0qQ.A0A(r9)
            r0 = 0
            X.O2G.A00(r9, r3, r0, r1)
            return r9
        L_0x00c8:
            java.lang.Object r0 = r15.A01
            X.PMS r0 = (X.PMS) r0
            X.0eM r0 = r0.A0D
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            r0 = 2131429355(0x7f0b07eb, float:1.848038E38)
            X.3Nc r9 = X.C240903Nb.A00(r1, r0)
            return r9
        L_0x00da:
            java.lang.Object r0 = r15.A01
            X.PMS r0 = (X.PMS) r0
            X.0eM r0 = r0.A06
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            r0 = 2131429354(0x7f0b07ea, float:1.8480378E38)
            android.view.View r9 = r1.findViewById(r0)
            return r9
        L_0x00ec:
            java.lang.Object r1 = r15.A01
            X.PMS r1 = (X.PMS) r1
            X.0eM r0 = r1.A08
            java.lang.Object r4 = r0.getValue()
            X.3Nc r4 = (X.C240913Nc) r4
            r0 = 37
            X.Plh r3 = new X.Plh
            r3.<init>(r1, r0)
            r2 = 2131429353(0x7f0b07e9, float:1.8480376E38)
            r1 = 1
            android.view.View r0 = r4.A00()
            android.view.View r9 = r0.findViewById(r2)
            X.0qQ.A0A(r9)
            r0 = 0
            X.O2G.A00(r9, r3, r0, r1)
            return r9
        L_0x0113:
            java.lang.Object r0 = r15.A01
            X.PMS r0 = (X.PMS) r0
            X.0eM r0 = r0.A0D
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            r0 = 2131429360(0x7f0b07f0, float:1.848039E38)
            android.view.View r9 = r1.findViewById(r0)
            return r9
        L_0x0125:
            java.lang.Object r0 = r15.A01
            X.Neh r0 = (X.C69102Neh) r0
            android.app.Activity r1 = r0.A04
            r0 = 2131238982(0x7f082046, float:1.8094258E38)
            android.graphics.drawable.Drawable r9 = r1.getDrawable(r0)
            return r9
        L_0x0133:
            java.lang.Object r0 = r15.A01
            X.Neh r0 = (X.C69102Neh) r0
            android.app.Activity r1 = r0.A04
            r0 = 2131976570(0x7f13617a, float:1.9590264E38)
            java.lang.String r9 = r1.getString(r0)
            return r9
        L_0x0141:
            java.lang.Object r0 = r15.A01
            X.Neh r0 = (X.C69102Neh) r0
            android.app.Activity r1 = r0.A04
            r0 = 2131976576(0x7f136180, float:1.9590276E38)
            java.lang.String r9 = r1.getString(r0)
            return r9
        L_0x014f:
            java.lang.Object r0 = r15.A01
            X.Neh r0 = (X.C69102Neh) r0
            android.app.Activity r1 = r0.A04
            r0 = 2131976575(0x7f13617f, float:1.9590274E38)
            java.lang.String r9 = r1.getString(r0)
            return r9
        L_0x015d:
            java.lang.Object r0 = r15.A01
            X.Neh r0 = (X.C69102Neh) r0
            android.app.Activity r1 = r0.A04
            r0 = 2131976558(0x7f13616e, float:1.959024E38)
            java.lang.String r9 = r1.getString(r0)
            return r9
        L_0x016b:
            java.lang.Object r0 = r15.A01
            X.Neh r0 = (X.C69102Neh) r0
            android.app.Activity r1 = r0.A04
            r0 = 2131976554(0x7f13616a, float:1.9590232E38)
            java.lang.String r9 = r1.getString(r0)
            return r9
        L_0x0179:
            java.lang.Object r0 = r15.A01
            X.Neh r0 = (X.C69102Neh) r0
            android.app.Activity r1 = r0.A04
            r0 = 2131976553(0x7f136169, float:1.959023E38)
            java.lang.String r9 = r1.getString(r0)
            return r9
        L_0x0187:
            java.lang.Object r0 = r15.A01
            X.Neh r0 = (X.C69102Neh) r0
            android.app.Activity r1 = r0.A04
            r0 = 2131976557(0x7f13616d, float:1.9590238E38)
            java.lang.String r9 = r1.getString(r0)
            return r9
        L_0x0195:
            java.lang.Object r0 = r15.A01
            X.Neh r0 = (X.C69102Neh) r0
            android.app.Activity r1 = r0.A04
            r0 = 2131976552(0x7f136168, float:1.9590228E38)
            java.lang.String r9 = r1.getString(r0)
            return r9
        L_0x01a3:
            java.lang.Object r0 = r15.A01
            X.Neh r0 = (X.C69102Neh) r0
            android.app.Activity r1 = r0.A04
            r0 = 2131238025(0x7f081c89, float:1.8092317E38)
            android.graphics.drawable.Drawable r9 = r1.getDrawable(r0)
            return r9
        L_0x01b1:
            java.lang.Object r3 = r15.A01
            X.PMV r3 = (X.PMV) r3
            android.view.View r0 = r3.A06
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r0)
            r0 = 1
            X.7wt r9 = new X.7wt
            r9.<init>(r1, r3, r0)
            r0 = -2
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r0, r0)
            r0 = 17
            r2.gravity = r0
            android.view.ViewGroup r1 = r3.A07
            r1.addView(r9, r2)
            r0 = 0
            r1.setVisibility(r0)
            return r9
        L_0x01d5:
            java.lang.Object r0 = r15.A01
            X.PMV r0 = (X.PMV) r0
            com.instagram.common.session.UserSession r7 = r0.A08
            android.app.Activity r3 = r0.A05
            r0 = 2130970294(0x7f0406b6, float:1.7549294E38)
            int r14 = X.AnonymousClass7TF.A03(r3, r0)
            r2 = r3
            X.07g r2 = (X.AnonymousClass07g) r2
            X.2YN r1 = new X.2YN
            r1.<init>(r2)
            java.lang.Class<X.848> r0 = X.AnonymousClass848.class
            X.2YL r6 = r1.A00(r0)
            X.848 r6 = (X.AnonymousClass848) r6
            android.content.Context r4 = X.DbT.A05(r3)
            r8 = 0
            X.86B r5 = new X.86B
            r5.<init>(r7)
            r10 = 0
            X.86C r3 = new X.86C
            r9 = r8
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            X.2YN r1 = new X.2YN
            r1.<init>(r3, r2)
            java.lang.Class<X.86D> r0 = X.AnonymousClass86D.class
            X.2YL r10 = r1.A00(r0)
            X.86D r10 = (X.AnonymousClass86D) r10
            r0 = 1
            X.86A r12 = new X.86A
            r12.<init>(r8, r8, r0)
            r0 = 3
            X.0qQ.A0B(r10, r0)
            X.8Xo r9 = new X.8Xo
            r11 = r7
            r13 = r8
            r9.<init>(r10, r11, r12, r13, r14)
            return r9
        L_0x0224:
            java.lang.Object r0 = r15.A01
            X.PMV r0 = (X.PMV) r0
            int r0 = r0.A00
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            return r9
        L_0x022f:
            java.lang.Object r1 = r15.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            boolean r0 = r1 instanceof X.C273494mf
            if (r0 == 0) goto L_0x0244
            X.4mf r1 = (X.C273494mf) r1
            if (r1 == 0) goto L_0x0244
            boolean r0 = r1.isScrolledToTop()
        L_0x023f:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
            return r9
        L_0x0244:
            r0 = 1
            goto L_0x023f
        L_0x0246:
            java.lang.Object r0 = r15.A01
            X.Neg r0 = (X.C69101Neg) r0
            android.view.View r0 = r0.A04
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r0)
            X.OKZ r9 = new X.OKZ
            r9.<init>(r0)
            return r9
        L_0x0256:
            java.lang.Object r1 = r15.A01
            X.PMC r1 = (X.PMC) r1
            android.view.View r0 = r1.A02
            android.view.LayoutInflater r3 = X.DbV.A0D(r0)
            r2 = 2131626617(0x7f0e0a79, float:1.8880475E38)
            X.0eM r0 = r1.A03
            android.view.ViewGroup r1 = X.C66583MXo.A0C(r0)
            r0 = 0
            android.view.View r9 = X.DbW.A09(r3, r1, r2, r0)
            return r9
        L_0x026f:
            java.lang.Object r0 = r15.A01
            android.view.View r0 = (android.view.View) r0
            android.content.res.Resources r1 = X.DbU.A05(r0)
            r0 = 2131165208(0x7f070018, float:1.7944627E38)
            float r0 = X.AnonymousClass7TE.A01(r1, r0)
            java.lang.Float r9 = java.lang.Float.valueOf(r0)
            return r9
        L_0x0283:
            java.lang.Object r4 = r15.A01
            X.Mzl r4 = (X.C68080Mzl) r4
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            android.view.ViewGroup r3 = r4.A05
            X.0iw r2 = r4.A06
            com.instagram.common.session.UserSession r1 = r4.A07
            X.O9r r0 = new X.O9r
            r0.<init>(r4)
            X.PMJ r9 = new X.PMJ
            r9.<init>(r3, r2, r1, r0)
            X.OK5 r0 = r4.A01
            r9.A01 = r0
            android.widget.TextView r0 = r9.A07
            X.0qQ.A06(r0)
            X.3NG r1 = X.AnonymousClass7TE.A0m(r0)
            r0 = 24
            X.NQx.A01(r1, r9, r0)
            android.view.View r0 = r9.A04
            X.0qQ.A06(r0)
            X.3NG r1 = X.AnonymousClass7TE.A0m(r0)
            r0 = 25
            X.NQx.A01(r1, r9, r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r9.A0D
            X.0qQ.A06(r0)
            X.3NG r1 = X.AnonymousClass7TE.A0m(r0)
            r0 = 26
            X.NQx.A01(r1, r9, r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r9.A0C
            X.0qQ.A06(r0)
            X.3NG r1 = X.AnonymousClass7TE.A0m(r0)
            r0 = 27
            X.NQx.A01(r1, r9, r0)
            android.widget.TextView r0 = r9.A08
            X.0qQ.A06(r0)
            X.3NG r1 = X.AnonymousClass7TE.A0m(r0)
            r0 = 28
            X.NQx.A01(r1, r9, r0)
            return r9
        L_0x02e4:
            java.lang.Object r0 = r15.A01
            X.Mzl r0 = (X.C68080Mzl) r0
            android.view.ViewGroup r1 = r0.A05
            X.0iw r0 = r0.A06
            X.Mzk r9 = new X.Mzk
            r9.<init>(r1, r0)
            return r9
        L_0x02f2:
            java.lang.Object r1 = r15.A01
            X.Mzl r1 = (X.C68080Mzl) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            android.view.ViewGroup r1 = r1.A05
            r0 = 2131434758(0x7f0b1d06, float:1.8491339E38)
            android.view.View r9 = r1.findViewById(r0)
            return r9
        L_0x0302:
            java.lang.Object r1 = r15.A01
            X.Mzl r1 = (X.C68080Mzl) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            android.view.ViewGroup r1 = r1.A05
            r0 = 2131434757(0x7f0b1d05, float:1.8491337E38)
            android.view.View r9 = r1.findViewById(r0)
            return r9
        L_0x0312:
            java.lang.Object r3 = r15.A01
            X.Mzl r3 = (X.C68080Mzl) r3
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            android.view.ViewGroup r2 = r3.A05
            X.0iw r1 = r3.A06
            com.instagram.common.session.UserSession r0 = r3.A07
            X.PMR r9 = new X.PMR
            r9.<init>(r2, r1, r0)
            return r9
        L_0x0324:
            java.lang.Object r2 = r15.A01
            X.Mzl r2 = (X.C68080Mzl) r2
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            android.view.ViewGroup r1 = r2.A05
            X.O9s r0 = new X.O9s
            r0.<init>(r2)
            X.PMI r9 = new X.PMI
            r9.<init>(r1, r0)
            return r9
        L_0x0337:
            java.lang.Object r0 = r15.A01
            X.PMJ r0 = (X.PMJ) r0
            androidx.constraintlayout.widget.ConstraintLayout r0 = r0.A09
            X.OKw r9 = new X.OKw
            r9.<init>(r0)
            return r9
        L_0x0343:
            java.lang.Object r0 = r15.A01
            X.Neo r0 = (X.C69109Neo) r0
            com.instagram.common.session.UserSession r3 = r0.A0K
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317783893481000(0x8106d500001628, double:3.0308510019905307E-306)
            java.lang.Boolean r9 = X.AnonymousClass7TF.A0R(r2, r3, r0)
            return r9
        L_0x0355:
            java.lang.Object r0 = r15.A01
            X.Neo r0 = (X.C69109Neo) r0
            com.instagram.common.session.UserSession r3 = r0.A0K
            X.0Tu r2 = X.0Tu.A05
            r0 = 36315494675909880(0x8104c000000cf8, double:3.029403291580615E-306)
            java.lang.Boolean r9 = X.AnonymousClass7TF.A0R(r2, r3, r0)
            return r9
        L_0x0367:
            java.lang.Object r0 = r15.A01
            X.Neo r0 = (X.C69109Neo) r0
            android.content.Context r0 = r0.A0I
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165208(0x7f070018, float:1.7944627E38)
            java.lang.Integer r9 = X.JTP.A0k(r1, r0)
            return r9
        L_0x0379:
            java.lang.Object r0 = r15.A01
            X.Mzk r0 = (X.C68079Mzk) r0
            android.view.View r1 = r0.A07
            r0 = 2131443700(0x7f0b3ff4, float:1.8509476E38)
            android.view.ViewStub r1 = X.DbS.A0F(r1, r0)
            r0 = 0
            X.3v4 r9 = new X.3v4
            r9.<init>(r1, r0)
            return r9
        L_0x038d:
            java.lang.Object r0 = r15.A01
            X.Mzk r0 = (X.C68079Mzk) r0
            android.view.View r0 = r0.A07
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165270(0x7f070056, float:1.7944752E38)
            java.lang.Integer r9 = X.JTP.A0k(r1, r0)
            return r9
        L_0x039f:
            java.lang.Object r0 = r15.A01
            X.Mzk r0 = (X.C68079Mzk) r0
            com.instagram.ui.widget.framelayout.MediaFrameLayout r1 = r0.A0D
            r0 = 2131443666(0x7f0b3fd2, float:1.8509407E38)
            android.view.View r9 = r1.findViewById(r0)
            return r9
        L_0x03ad:
            java.lang.Object r0 = r15.A01
            X.Mzk r0 = (X.C68079Mzk) r0
            android.view.View r1 = r0.A07
            r0 = 2131430915(0x7f0b0e03, float:1.8483544E38)
            android.view.View r9 = r1.findViewById(r0)
            r0 = 0
            r9.setClickable(r0)
            return r9
        L_0x03bf:
            java.lang.Object r0 = r15.A01
            X.PMR r0 = (X.PMR) r0
            X.3oV r0 = r0.A05
            android.view.View r1 = r0.getView()
            r0 = 2131443834(0x7f0b407a, float:1.8509747E38)
            android.view.View r9 = r1.requireViewById(r0)
            return r9
        L_0x03d1:
            java.lang.Object r0 = r15.A01
            X.PMR r0 = (X.PMR) r0
            X.3oV r0 = r0.A05
            android.view.View r1 = r0.getView()
            r0 = 2131443833(0x7f0b4079, float:1.8509745E38)
            android.view.View r9 = r1.requireViewById(r0)
            return r9
        L_0x03e3:
            java.lang.Object r2 = r15.A01
            X.PMR r2 = (X.PMR) r2
            X.3oV r0 = r2.A05
            android.view.View r1 = r0.getView()
            r0 = 2131443832(0x7f0b4078, float:1.8509743E38)
            android.view.View r9 = X.AnonymousClass7TF.A0F(r1, r0)
            androidx.viewpager2.widget.ViewPager2 r9 = (androidx.viewpager2.widget.ViewPager2) r9
            X.0eM r0 = r2.A06
            java.lang.Object r0 = r0.getValue()
            X.2Rw r0 = (X.2Rw) r0
            r9.setAdapter(r0)
            r0 = 1
            r9.setOffscreenPageLimit(r0)
            r1 = 2
            X.N02 r0 = new X.N02
            r0.<init>(r2, r1)
            r9.A05(r0)
            return r9
        L_0x040f:
            java.lang.Object r0 = r15.A01
            android.view.View r0 = (android.view.View) r0
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165270(0x7f070056, float:1.7944752E38)
            java.lang.Integer r9 = X.JTP.A0k(r1, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73906Plh.invoke():java.lang.Object");
    }
}
