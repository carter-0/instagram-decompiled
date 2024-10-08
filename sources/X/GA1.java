package X;

public final class GA1 extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GA1(int i, Object obj, boolean z) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    public static GA1 A00(C286575Wy r1, Object obj, int i, boolean z) {
        GA1 ga1 = new GA1(i, obj, z);
        r1.FLL(ga1);
        return ga1;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007b, code lost:
        if (r6.A02 == false) goto L_0x0009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0084, code lost:
        X.C51968G9o.A1O(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r6.A02 != false) goto L_0x0009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
        X.DbS.A1U(r6.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01ee, code lost:
        r1 = (X.C55715HmC) r0.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01f6, code lost:
        if (r1.A00 != false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01f8, code lost:
        r1.A00 = true;
        r3 = r1.A01;
        r3.getViewTreeObserver().addOnDrawListener(new X.XuX(r3, r1.A02));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0267, code lost:
        r3 = new X.C58106ImS((java.lang.Object) r2, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x026c, code lost:
        X.1Eo.A03(X.AnonymousClass05K.A00, X.19B.A00, r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0294, code lost:
        if (((X.AnonymousClass9SS) r1.A09.getValue()).A01() == false) goto L_0x0296;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x0011;
                case 1: goto L_0x0005;
                case 2: goto L_0x001b;
                case 3: goto L_0x0024;
                case 4: goto L_0x003e;
                case 5: goto L_0x0063;
                case 6: goto L_0x0005;
                case 7: goto L_0x0005;
                case 8: goto L_0x0005;
                case 9: goto L_0x0079;
                case 10: goto L_0x001b;
                case 11: goto L_0x001b;
                case 12: goto L_0x007e;
                case 13: goto L_0x007e;
                case 14: goto L_0x0088;
                case 15: goto L_0x0094;
                case 16: goto L_0x0094;
                case 17: goto L_0x00ad;
                case 18: goto L_0x00bb;
                case 19: goto L_0x00c6;
                case 20: goto L_0x00ed;
                case 21: goto L_0x0341;
                case 22: goto L_0x0275;
                case 23: goto L_0x00fa;
                case 24: goto L_0x0105;
                case 25: goto L_0x029c;
                case 26: goto L_0x0110;
                case 27: goto L_0x011b;
                case 28: goto L_0x0079;
                case 29: goto L_0x0139;
                case 30: goto L_0x014c;
                case 31: goto L_0x015f;
                case 32: goto L_0x0172;
                case 33: goto L_0x0005;
                case 34: goto L_0x0193;
                case 35: goto L_0x01ce;
                case 36: goto L_0x01d9;
                case 37: goto L_0x01e4;
                case 38: goto L_0x007e;
                case 39: goto L_0x020d;
                case 40: goto L_0x021c;
                case 41: goto L_0x02ba;
                case 42: goto L_0x0234;
                case 43: goto L_0x02e1;
                case 44: goto L_0x02f4;
                case 45: goto L_0x0249;
                case 46: goto L_0x0258;
                case 47: goto L_0x0300;
                case 48: goto L_0x02cf;
                case 49: goto L_0x030c;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = r6.A02
            if (r0 == 0) goto L_0x000e
        L_0x0009:
            java.lang.Object r0 = r6.A01
            X.DbS.A1U(r0)
        L_0x000e:
            X.0gF r2 = X.C60340gF.A00
        L_0x0010:
            return r2
        L_0x0011:
            java.lang.Object r1 = r6.A01
            X.00I r1 = (X.00I) r1
            boolean r0 = r6.A02
            r1.A04(r0)
            goto L_0x000e
        L_0x001b:
            java.lang.Object r1 = r6.A01
            X.0sP r1 = (X.0sP) r1
            boolean r0 = r6.A02
            r0 = r0 ^ 1
            goto L_0x0084
        L_0x0024:
            boolean r0 = r6.A02
            r3 = 2
            if (r0 == 0) goto L_0x002b
            r3 = 113(0x71, float:1.58E-43)
        L_0x002b:
            java.lang.Object r0 = r6.A01
            X.Oan r0 = (X.C71068Oan) r0
            com.facebook.quicklog.QuickPerformanceLogger r2 = r0.A0B
            r1 = 755177991(0x2d031a07, float:7.452267E-12)
            java.lang.String r0 = r0.A0D
            int r0 = r0.hashCode()
            r2.markerEnd(r1, r0, r3)
            goto L_0x000e
        L_0x003e:
            boolean r0 = r6.A02
            if (r0 == 0) goto L_0x000e
            java.lang.Object r4 = r6.A01
            X.QhQ r4 = (X.C8132QhQ) r4
            android.view.ContextThemeWrapper r3 = r4.A01
            if (r3 != 0) goto L_0x0054
            java.lang.String r0 = "viewContext"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0054:
            boolean r2 = X.C8132QhQ.A0A(r4)
            r1 = 37
            X.TVy r0 = new X.TVy
            r0.<init>(r4, r1)
            X.C11394SRm.A04(r3, r0, r2)
            goto L_0x000e
        L_0x0063:
            boolean r0 = r6.A02
            if (r0 == 0) goto L_0x000e
            java.lang.Object r2 = r6.A01
            X.QhP r2 = (X.C8131QhP) r2
            X.QDM r0 = r2.A09()
            X.QDH r1 = r0.A0S
            r0 = 0
            r1.A06(r0)
            X.C8131QhP.A07(r2)
            goto L_0x000e
        L_0x0079:
            boolean r0 = r6.A02
            if (r0 != 0) goto L_0x000e
            goto L_0x0009
        L_0x007e:
            java.lang.Object r1 = r6.A01
            X.0sP r1 = (X.0sP) r1
            boolean r0 = r6.A02
        L_0x0084:
            X.C51968G9o.A1O(r1, r0)
            goto L_0x000e
        L_0x0088:
            java.lang.Object r2 = r6.A01
            X.6D9 r2 = (X.AnonymousClass6D9) r2
            boolean r1 = r6.A02
            r0 = 0
            r2.A02(r0, r1)
            goto L_0x000e
        L_0x0094:
            java.lang.Object r1 = r6.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.1Av r0 = X.1Au.A00(r1)
            boolean r3 = r6.A02
            r0.A1b(r3)
            X.5lm r2 = X.C294045ll.A00(r1)
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            r0 = 1
            r2.A01(r1, r3, r0)
            goto L_0x000e
        L_0x00ad:
            boolean r0 = r6.A02
            if (r0 == 0) goto L_0x000e
            java.lang.Object r1 = r6.A01
            X.5Oz r1 = (X.C284945Oz) r1
            r0 = 1
            X.C51967G9n.A16(r1, r0)
            goto L_0x000e
        L_0x00bb:
            java.lang.Object r1 = r6.A01
            X.UgY r1 = (X.C15667UgY) r1
            boolean r0 = r6.A02
            r1.A0U(r0)
            goto L_0x000e
        L_0x00c6:
            java.lang.Object r5 = r6.A01
            X.GQw r5 = (X.C52397GQw) r5
            boolean r3 = r6.A02
            X.5Oz r1 = r5.A04
            boolean r0 = X.C51971G9r.A1W(r1)
            if (r0 == r3) goto L_0x000e
            X.C51967G9n.A16(r1, r3)
            r2 = 0
            X.5Oz r0 = r5.A05
            X.C51967G9n.A14(r0, r2)
            if (r3 == 0) goto L_0x00e1
            float r2 = r5.A00
        L_0x00e1:
            X.4Cq r4 = r5.A08
            r1 = 0
            r0 = 9
            X.JUx r3 = new X.JUx
            r3.<init>(r5, r1, r2, r0)
            goto L_0x026c
        L_0x00ed:
            java.lang.Object r1 = r6.A01
            X.8EL r1 = (X.AnonymousClass8EL) r1
            if (r1 == 0) goto L_0x000e
            boolean r0 = r6.A02
            r1.A0A(r0)
            goto L_0x000e
        L_0x00fa:
            java.lang.Object r1 = r6.A01
            X.JYD r1 = (X.JYD) r1
            boolean r0 = r6.A02
            X.JYD.A0F(r1, r0)
            goto L_0x000e
        L_0x0105:
            java.lang.Object r1 = r6.A01
            X.8An r1 = (X.C351818An) r1
            boolean r0 = r6.A02
            r1.A0E(r0)
            goto L_0x000e
        L_0x0110:
            java.lang.Object r1 = r6.A01
            X.OLt r1 = (X.C70798OLt) r1
            boolean r0 = r6.A02
            r1.A00(r0)
            goto L_0x000e
        L_0x011b:
            java.lang.Object r3 = r6.A01
            X.Nga r3 = (X.C69184Nga) r3
            X.MuD r0 = X.C69184Nga.A07(r3)
            X.NUQ r1 = r0.A07
            java.lang.String r0 = "TURN_OFF_3P_DIALOG_TURN_OFF_CLICK"
            r1.A0B(r0)
            X.MuD r2 = X.C69184Nga.A07(r3)
            boolean r1 = r6.A02
            androidx.fragment.app.FragmentActivity r0 = r3.requireActivity()
            r2.A05(r0, r1)
            goto L_0x000e
        L_0x0139:
            java.lang.Object r0 = r6.A01
            X.P2b r0 = (X.C72336P2b) r0
            androidx.fragment.app.FragmentActivity r4 = r0.A01
            com.instagram.common.session.UserSession r3 = r0.A03
            X.N4P r2 = r0.A04
            boolean r1 = r6.A02
            X.0iw r0 = r0.A02
            X.OPN.A00(r4, r0, r3, r2, r1)
            goto L_0x000e
        L_0x014c:
            java.lang.Object r1 = r6.A01
            X.1Xj r1 = (X.1Xj) r1
            boolean r0 = r6.A02
            r0 = r0 ^ 1
            X.1Xy r1 = r1.A0C
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.Ec1(r0)
            goto L_0x000e
        L_0x015f:
            java.lang.Object r1 = r6.A01
            X.1Xj r1 = (X.1Xj) r1
            boolean r0 = r6.A02
            r0 = r0 ^ 1
            X.1Xy r1 = r1.A0C
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.Ek9(r0)
            goto L_0x000e
        L_0x0172:
            boolean r0 = r6.A02
            if (r0 == 0) goto L_0x000e
            java.lang.Object r2 = r6.A01
            X.3ey r2 = (X.C246663ey) r2
            X.3yi r0 = r2.A04
            if (r0 == 0) goto L_0x0336
            X.0eM r0 = r0.A03
            java.lang.Object r1 = r0.getValue()
            android.widget.SeekBar r1 = (android.widget.SeekBar) r1
            r0 = 0
            r1.setOnSeekBarChangeListener(r0)
            X.3yi r0 = r2.A04
            if (r0 == 0) goto L_0x032b
            r0.A00()
            goto L_0x000e
        L_0x0193:
            boolean r0 = r6.A02
            r5 = 1
            java.lang.Object r4 = r6.A01
            X.NdD r4 = (X.C69028NdD) r4
            if (r0 == 0) goto L_0x01c1
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            r2 = 0
            r1 = 9
            X.Phb r0 = new X.Phb
            r0.<init>(r4, r1)
            X.C69028NdD.A09(r2, r4, r3, r0)
        L_0x01a9:
            X.OI3 r1 = r4.A07
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r1.A03 = r0
            X.4A5 r1 = X.C69028NdD.A06(r4)
            if (r1 == 0) goto L_0x000e
            X.IV9 r0 = new X.IV9
            r0.<init>(r1)
            r4.A0P(r0)
            goto L_0x000e
        L_0x01c1:
            android.location.Location r0 = X.C69028NdD.A03(r4)
            r4.A0V(r0)
            X.PH4 r0 = X.PH4.A00
            r4.A0P(r0)
            goto L_0x01a9
        L_0x01ce:
            java.lang.Object r1 = r6.A01
            com.instagram.igds.components.button.IgdsButton r1 = (com.instagram.igds.components.button.IgdsButton) r1
            boolean r0 = r6.A02
            r1.setElevated(r0)
            goto L_0x000e
        L_0x01d9:
            boolean r0 = r6.A02
            if (r0 == 0) goto L_0x000e
            java.lang.Object r0 = r6.A01
            X.E6l r0 = (X.C47525E6l) r0
            X.0eM r0 = r0.A04
            goto L_0x01ee
        L_0x01e4:
            boolean r0 = r6.A02
            if (r0 == 0) goto L_0x000e
            java.lang.Object r0 = r6.A01
            X.E6k r0 = (X.C47524E6k) r0
            X.0eM r0 = r0.A02
        L_0x01ee:
            java.lang.Object r1 = r0.getValue()
            X.HmC r1 = (X.C55715HmC) r1
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x000e
            r0 = 1
            r1.A00 = r0
            android.view.View r3 = r1.A01
            X.0sa r2 = r1.A02
            android.view.ViewTreeObserver r1 = r3.getViewTreeObserver()
            X.XuX r0 = new X.XuX
            r0.<init>(r3, r2)
            r1.addOnDrawListener(r0)
            goto L_0x000e
        L_0x020d:
            java.lang.Object r0 = r6.A01
            X.NR1 r0 = (X.NR1) r0
            X.PtY r1 = r0.A02
            if (r1 == 0) goto L_0x000e
            boolean r0 = r6.A02
            r1.D5v(r0)
            goto L_0x000e
        L_0x021c:
            java.lang.Object r2 = r6.A01
            X.2LP r2 = (X.2LP) r2
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x000e
            com.instagram.common.session.UserSession r0 = r2.A02
            com.instagram.reliablemedia.IGReliableMediaMonitor r1 = new com.instagram.reliablemedia.IGReliableMediaMonitor
            r1.<init>(r0)
            r2.A00 = r1
            boolean r0 = r6.A02
            r1.onUserSessionStart(r0)
            goto L_0x000e
        L_0x0234:
            boolean r0 = r6.A02
            java.lang.String r2 = ""
            if (r0 == 0) goto L_0x0010
            java.lang.Object r1 = r6.A01
            X.GaK r1 = (X.C52646GaK) r1
            android.view.animation.OvershootInterpolator r0 = X.C52646GaK.A0u
            X.GZG r0 = r1.A04
            if (r0 == 0) goto L_0x0010
            java.lang.String r0 = r0.A01
            if (r0 != 0) goto L_0x0356
            return r2
        L_0x0249:
            boolean r0 = r6.A02
            if (r0 != 0) goto L_0x000e
            java.lang.Object r2 = r6.A01
            X.2YL r2 = (X.2YL) r2
            X.6oS r4 = X.C318116oQ.A00(r2)
            r1 = 0
            r0 = 6
            goto L_0x0267
        L_0x0258:
            boolean r0 = r6.A02
            if (r0 != 0) goto L_0x000e
            java.lang.Object r2 = r6.A01
            X.2YL r2 = (X.2YL) r2
            X.6oS r4 = X.C318116oQ.A00(r2)
            r1 = 0
            r0 = 12
        L_0x0267:
            X.ImS r3 = new X.ImS
            r3.<init>((java.lang.Object) r2, (X.AnonymousClass4D7) r1, (int) r0)
        L_0x026c:
            X.19B r1 = X.19B.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.1Eo.A03(r0, r1, r3, r4)
            goto L_0x000e
        L_0x0275:
            boolean r0 = r6.A02
            if (r0 != 0) goto L_0x0296
            java.lang.Object r1 = r6.A01
            X.8iX r1 = (X.C362818iX) r1
            X.8Yz r0 = r1.A04
            X.80m r0 = r0.A08
            java.lang.Object r0 = r0.A00
            boolean r0 = r0 instanceof X.AnonymousClass80O
            if (r0 == 0) goto L_0x0296
            X.0eM r0 = r1.A09
            java.lang.Object r0 = r0.getValue()
            X.9SS r0 = (X.AnonymousClass9SS) r0
            boolean r1 = r0.A01()
            r0 = 1
            if (r1 != 0) goto L_0x0297
        L_0x0296:
            r0 = 0
        L_0x0297:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        L_0x029c:
            r4 = 1
            android.graphics.Paint r2 = X.AnonymousClass7TE.A0V(r4)
            java.lang.Object r3 = r6.A01
            android.content.Context r3 = (android.content.Context) r3
            boolean r1 = r6.A02
            r0 = 2130970332(0x7f0406dc, float:1.7549371E38)
            if (r1 == 0) goto L_0x02af
            r0 = 2130970237(0x7f04067d, float:1.7549178E38)
        L_0x02af:
            int r0 = X.2Yu.A0H(r3, r0)
            X.AnonymousClass7TE.A1N(r3, r2, r0)
            r2.setAntiAlias(r4)
            return r2
        L_0x02ba:
            java.lang.Object r4 = r6.A01
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            X.VTl r3 = new X.VTl
            r3.<init>(r4)
            boolean r1 = r6.A02
            X.LOp r0 = X.C17052VGa.A00(r4)
            X.Lix r2 = new X.Lix
            r2.<init>(r4, r0, r3, r1)
            return r2
        L_0x02cf:
            boolean r0 = r6.A02
            if (r0 == 0) goto L_0x0329
            java.lang.Object r1 = r6.A01
            X.Gw8 r1 = (X.C53902Gw8) r1
            boolean r0 = r1.A05
            if (r0 == 0) goto L_0x0329
            X.GbJ r0 = r1.A00
            r0.A02()
            goto L_0x0329
        L_0x02e1:
            boolean r0 = r6.A02
            if (r0 != 0) goto L_0x0329
            java.lang.Object r1 = r6.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r0 = -1
            X.TwO r2 = new X.TwO
            r2.<init>(r1, r0)
            return r2
        L_0x02f4:
            java.lang.Object r1 = r6.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            boolean r0 = r6.A02
            X.ExC r2 = new X.ExC
            r2.<init>(r1, r0)
            return r2
        L_0x0300:
            java.lang.Object r1 = r6.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            boolean r0 = r6.A02
            X.2Io r2 = new X.2Io
            r2.<init>(r1, r0)
            return r2
        L_0x030c:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r1 < r0) goto L_0x0329
            boolean r0 = r6.A02
            if (r0 == 0) goto L_0x0329
            java.lang.Object r0 = r6.A01
            X.3Y5 r0 = (X.AnonymousClass3Y5) r0
            X.2V1 r1 = r0.A05
            java.lang.String r0 = "memu_camera_component"
            android.view.View r1 = r1.A03(r0)
            if (r1 == 0) goto L_0x0329
            r0 = 16
            r1.performHapticFeedback(r0)
        L_0x0329:
            r2 = 0
            return r2
        L_0x032b:
            r0 = 1920(0x780, float:2.69E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0336:
            r0 = 1920(0x780, float:2.69E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0341:
            boolean r2 = r6.A02
            java.lang.Object r1 = r6.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131437949(0x7f0b297d, float:1.8497811E38)
            if (r2 == 0) goto L_0x034f
            r0 = 2131432777(0x7f0b1549, float:1.8487321E38)
        L_0x034f:
            android.view.View r0 = r1.requireViewById(r0)
            X.0qQ.A0A(r0)
        L_0x0356:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GA1.invoke():java.lang.Object");
    }
}
