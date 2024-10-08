package X;

public final class MML extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MML(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static MML A00(Object obj, int i) {
        return new MML(obj, i);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0037: MOVE  (r1v42 com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout) = 
          (r2v47 com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout)
        
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x0338;
                case 1: goto L_0x032e;
                case 2: goto L_0x0324;
                case 3: goto L_0x031a;
                case 4: goto L_0x0310;
                case 5: goto L_0x0307;
                case 6: goto L_0x02f9;
                case 7: goto L_0x02e5;
                case 8: goto L_0x02d3;
                case 9: goto L_0x02c5;
                case 10: goto L_0x02b3;
                case 11: goto L_0x000c;
                case 12: goto L_0x028e;
                case 13: goto L_0x027c;
                case 14: goto L_0x0261;
                case 15: goto L_0x0254;
                case 16: goto L_0x024e;
                case 17: goto L_0x0244;
                case 18: goto L_0x023a;
                case 19: goto L_0x0230;
                case 20: goto L_0x0221;
                case 21: goto L_0x0200;
                case 22: goto L_0x01f6;
                case 23: goto L_0x01eb;
                case 24: goto L_0x01e1;
                case 25: goto L_0x01d7;
                case 26: goto L_0x01cd;
                case 27: goto L_0x01b9;
                case 28: goto L_0x0005;
                case 29: goto L_0x01a9;
                case 30: goto L_0x019a;
                case 31: goto L_0x0175;
                case 32: goto L_0x0163;
                case 33: goto L_0x014c;
                case 34: goto L_0x0145;
                case 35: goto L_0x0005;
                case 36: goto L_0x0135;
                case 37: goto L_0x011d;
                case 38: goto L_0x0115;
                case 39: goto L_0x0106;
                case 40: goto L_0x00f9;
                case 41: goto L_0x00ec;
                case 42: goto L_0x00b3;
                case 43: goto L_0x008b;
                case 44: goto L_0x0005;
                case 45: goto L_0x007b;
                case 46: goto L_0x0074;
                case 47: goto L_0x0067;
                case 48: goto L_0x0057;
                case 49: goto L_0x0047;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r7.A01
            X.07f r2 = X.C51971G9r.A0U(r0)
        L_0x000b:
            return r2
        L_0x000c:
            java.lang.Object r3 = r7.A01
            X.LZk r3 = (X.C64310LZk) r3
            androidx.fragment.app.FragmentActivity r1 = r3.A00
            r0 = 2131429041(0x7f0b06b1, float:1.8479744E38)
            android.view.View r0 = r1.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r2 = r0.inflate()
            android.widget.FrameLayout$LayoutParams r1 = X.JTS.A0D()
            X.0eM r0 = r3.A09
            int r0 = X.DbX.A07(r0)
            r1.bottomMargin = r0
            r0 = 80
            r1.gravity = r0
            r2.setLayoutParams(r1)
            boolean r0 = r2 instanceof com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout
            if (r0 == 0) goto L_0x000b
            r1 = r2
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r1 = (com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout) r1
            if (r1 == 0) goto L_0x000b
            X.0eM r0 = r3.A08
            java.lang.Object r0 = r0.getValue()
            X.LzB r0 = (X.C65757LzB) r0
            X.C317416nE.A00(r1, r0)
            return r2
        L_0x0047:
            java.lang.Object r1 = r7.A01
            X.Joo r1 = (X.C60641Joo) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            android.view.View r1 = r1.A00
            r0 = 2131436465(0x7f0b23b1, float:1.8494801E38)
            android.view.View r2 = X.AnonymousClass7TF.A0G(r1, r0)
            return r2
        L_0x0057:
            java.lang.Object r1 = r7.A01
            X.Joo r1 = (X.C60641Joo) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            android.view.View r1 = r1.A00
            r0 = 2131436464(0x7f0b23b0, float:1.84948E38)
            android.view.View r2 = X.AnonymousClass7TF.A0G(r1, r0)
            return r2
        L_0x0067:
            java.lang.Object r0 = r7.A01
            X.KG5 r0 = (X.KG5) r0
            X.MXF r1 = r0.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A04
            X.C64127LPb.A01(r1, r0)
            goto L_0x0197
        L_0x0074:
            java.lang.Object r0 = r7.A01
            X.DbS.A1U(r0)
            goto L_0x0197
        L_0x007b:
            java.lang.Object r1 = r7.A01
            X.K78 r1 = (X.K78) r1
            X.0eM r0 = r1.A09
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.KDW r2 = new X.KDW
            r2.<init>(r1, r0)
            return r2
        L_0x008b:
            java.lang.Object r3 = r7.A01
            X.K78 r3 = (X.K78) r3
            java.lang.Integer r0 = X.AnonymousClass05K.A0o
            X.C64127LPb.A01(r3, r0)
            r0 = 42
            X.MML r1 = A00(r3, r0)
            r0 = 0
            X.0qQ.A0B(r3, r0)
            X.37D r2 = X.DbX.A0i(r3)
            if (r2 == 0) goto L_0x0197
            r0 = 2
            X.MMW r1 = X.MMW.A00(r1, r3, r0)
            X.Lz0 r0 = new X.Lz0
            r0.<init>(r1)
            X.DbU.A1U(r0, r2, r2)
            goto L_0x0197
        L_0x00b3:
            java.lang.Object r6 = r7.A01
            X.K78 r6 = (X.K78) r6
            X.0eM r0 = r6.A0D
            X.JjW r5 = X.JTT.A0a(r0)
            X.0eM r0 = r6.A09
            X.0lg r4 = X.DbT.A0X(r0)
            r3 = 0
            X.0Tu r2 = X.DbS.A0J(r4, r3)
            r0 = 36314373689444882(0x8103bb00000a12, double:3.0286943752263E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x00e9
            X.LMc r1 = X.C64084LMc.A04
        L_0x00d5:
            X.0qQ.A0B(r1, r3)
            X.Lth r0 = new X.Lth
            r0.<init>(r1)
            X.C60327JjW.A02(r0, r5)
            X.0sa r0 = r6.A01
            if (r0 == 0) goto L_0x0197
            r0.invoke()
            goto L_0x0197
        L_0x00e9:
            X.LMc r1 = X.C64084LMc.A03
            goto L_0x00d5
        L_0x00ec:
            java.lang.Object r0 = r7.A01
            X.K78 r0 = (X.K78) r0
            X.0eM r0 = r0.A0D
            X.JjW r5 = X.JTT.A0a(r0)
            X.Khf r4 = X.C62549Khf.LINK
            goto L_0x0112
        L_0x00f9:
            java.lang.Object r0 = r7.A01
            X.K78 r0 = (X.K78) r0
            X.0eM r0 = r0.A0D
            X.JjW r5 = X.JTT.A0a(r0)
            X.Khf r4 = X.C62549Khf.DIRECT
            goto L_0x0112
        L_0x0106:
            java.lang.Object r0 = r7.A01
            X.K78 r0 = (X.K78) r0
            X.0eM r0 = r0.A0D
            X.JjW r5 = X.JTT.A0a(r0)
            X.Khf r4 = X.C62549Khf.SHARE
        L_0x0112:
            X.Khe r3 = X.C62548Khe.VISIBILITY_SHEET
            goto L_0x0183
        L_0x0115:
            java.lang.Object r0 = r7.A01
            X.K78 r0 = (X.K78) r0
            X.0eM r0 = r0.A09
            goto L_0x01a0
        L_0x011d:
            java.lang.Object r0 = r7.A01
            X.K78 r0 = (X.K78) r0
            X.0eM r0 = r0.A09
            com.instagram.common.session.UserSession r2 = X.JTS.A0J(r0)
            r0 = 36312995005204044(0x81027a0004064c, double:3.0278224897608784E-306)
            boolean r0 = X.AnonymousClass430.A03(r2, r0)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        L_0x0135:
            java.lang.Object r1 = r7.A01
            X.K75 r1 = (X.K75) r1
            X.0eM r0 = r1.A01
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.KDW r2 = new X.KDW
            r2.<init>(r1, r0)
            return r2
        L_0x0145:
            java.lang.Object r0 = r7.A01
            X.K75 r0 = (X.K75) r0
            X.0eM r0 = r0.A01
            goto L_0x01a0
        L_0x014c:
            java.lang.Object r1 = r7.A01
            X.K75 r1 = (X.K75) r1
            X.7Pu r0 = r1.A00
            X.DbW.A1K(r0)
            X.7Pu r0 = r1.A00
            X.DbW.A1K(r0)
            X.0eM r0 = r1.A02
            X.JjW r5 = X.JTT.A0a(r0)
            X.Khf r4 = X.C62549Khf.LINK
            goto L_0x0181
        L_0x0163:
            java.lang.Object r1 = r7.A01
            X.K75 r1 = (X.K75) r1
            X.7Pu r0 = r1.A00
            X.DbW.A1K(r0)
            X.0eM r0 = r1.A02
            X.JjW r5 = X.JTT.A0a(r0)
            X.Khf r4 = X.C62549Khf.SHARE
            goto L_0x0181
        L_0x0175:
            java.lang.Object r0 = r7.A01
            X.K75 r0 = (X.K75) r0
            X.0eM r0 = r0.A02
            X.JjW r5 = X.JTT.A0a(r0)
            X.Khf r4 = X.C62549Khf.DIRECT
        L_0x0181:
            X.Khe r3 = X.C62548Khe.MENU_SHEET
        L_0x0183:
            X.0Ud r0 = r5.A0M
            java.lang.Object r2 = r0.getValue()
            X.JzE r2 = (X.C61221JzE) r2
            if (r2 == 0) goto L_0x0197
            java.util.ArrayList r1 = r5.A0B
            X.Ltr r0 = new X.Ltr
            r0.<init>(r3, r4, r2, r1)
            X.C60327JjW.A02(r0, r5)
        L_0x0197:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x019a:
            java.lang.Object r0 = r7.A01
            X.K77 r0 = (X.K77) r0
            X.0eM r0 = r0.A07
        L_0x01a0:
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.LDW r2 = X.C63313Kuw.A00(r0)
            return r2
        L_0x01a9:
            java.lang.Object r1 = r7.A01
            X.K42 r1 = (X.K42) r1
            X.0eM r0 = r1.A01
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.KDW r2 = new X.KDW
            r2.<init>(r1, r0)
            return r2
        L_0x01b9:
            java.lang.Object r0 = r7.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.1Am r1 = X.1Al.A01(r0)
            X.1An r0 = X.1An.A3V
            X.0xa r0 = r1.A03(r0)
            X.LC9 r2 = new X.LC9
            r2.<init>(r0)
            return r2
        L_0x01cd:
            java.lang.Object r0 = r7.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.L9D r2 = new X.L9D
            r2.<init>(r0)
            return r2
        L_0x01d7:
            java.lang.Object r0 = r7.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.LDW r2 = new X.LDW
            r2.<init>(r0)
            return r2
        L_0x01e1:
            java.lang.Object r0 = r7.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.9NX r2 = new X.9NX
            r2.<init>(r0)
            return r2
        L_0x01eb:
            java.lang.Object r0 = r7.A01
            X.HBK r0 = (X.HBK) r0
            com.instagram.common.session.UserSession r0 = r0.A06
            X.1Kv r2 = X.1Kt.A00(r0)
            return r2
        L_0x01f6:
            java.lang.Object r0 = r7.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.IOJ r2 = new X.IOJ
            r2.<init>(r0)
            return r2
        L_0x0200:
            X.0JN r0 = X.0JN.A01()
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x021b
            java.lang.Object r0 = r7.A01
            X.LeX r0 = (X.LeX) r0
            com.instagram.common.session.UserSession r0 = r0.A05
            java.lang.Boolean r0 = X.C63311Kuu.A00(r0)
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x021c
        L_0x021b:
            r0 = 0
        L_0x021c:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        L_0x0221:
            X.1V1 r2 = X.1V0.A06
            java.lang.Object r0 = r7.A01
            X.LeX r0 = (X.LeX) r0
            android.content.Context r1 = r0.A04
            com.instagram.common.session.UserSession r0 = r0.A05
            java.io.File r2 = r2.A00(r1, r0)
            return r2
        L_0x0230:
            java.lang.Object r0 = r7.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.Hra r2 = new X.Hra
            r2.<init>(r0)
            return r2
        L_0x023a:
            java.lang.Object r0 = r7.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            com.instagram.mainfeed.data.datasource.local.MainFeedLocalDataSource r2 = new com.instagram.mainfeed.data.datasource.local.MainFeedLocalDataSource
            r2.<init>(r0)
            return r2
        L_0x0244:
            java.lang.Object r0 = r7.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.Oy4 r2 = new X.Oy4
            r2.<init>(r0)
            return r2
        L_0x024e:
            X.57F r2 = new X.57F
            r2.<init>()
            return r2
        L_0x0254:
            java.lang.Object r0 = r7.A01
            X.2Ru r0 = (X.2Ru) r0
            int r0 = r0.getViewCount()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            return r2
        L_0x0261:
            java.lang.Object r3 = r7.A01
            X.LZk r3 = (X.C64310LZk) r3
            X.Dde r2 = r3.A05
            X.0YZ[] r1 = X.C64310LZk.A0E
            r0 = 0
            r0 = r1[r0]
            java.lang.Object r1 = r2.A03(r3, r0)
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L_0x02f7
            r0 = 2131429039(0x7f0b06af, float:1.847974E38)
            android.view.View r2 = r1.findViewById(r0)
            return r2
        L_0x027c:
            java.lang.Object r0 = r7.A01
            X.LZk r0 = (X.C64310LZk) r0
            r1 = 2131165196(0x7f07000c, float:1.7944602E38)
            androidx.fragment.app.FragmentActivity r0 = r0.A00
            int r0 = X.AnonymousClass7TF.A02(r0, r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            return r2
        L_0x028e:
            java.lang.Object r0 = r7.A01
            X.LZk r0 = (X.C64310LZk) r0
            androidx.fragment.app.FragmentActivity r3 = r0.A00
            android.content.res.Resources$Theme r2 = r3.getTheme()
            r0 = 0
            int r0 = X.0Pn.A01(r0)
            r1 = 0
            int[] r0 = new int[]{r0}
            android.content.res.TypedArray r0 = r2.obtainStyledAttributes(r0)
            int r0 = r0.getResourceId(r1, r1)
            int r0 = X.AnonymousClass7TF.A02(r3, r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            return r2
        L_0x02b3:
            java.lang.Object r0 = r7.A01
            X.LZk r0 = (X.C64310LZk) r0
            android.view.View r1 = X.C64310LZk.A00(r0)
            if (r1 == 0) goto L_0x02f7
            r0 = 2131434047(0x7f0b1a3f, float:1.8489897E38)
            android.view.View r2 = r1.findViewById(r0)
            return r2
        L_0x02c5:
            java.lang.Object r0 = r7.A01
            X.LZk r0 = (X.C64310LZk) r0
            androidx.fragment.app.FragmentActivity r1 = r0.A00
            X.L1s r0 = r0.A06
            X.LzB r2 = new X.LzB
            r2.<init>(r1, r0)
            return r2
        L_0x02d3:
            java.lang.Object r0 = r7.A01
            X.LZk r0 = (X.C64310LZk) r0
            android.view.View r1 = X.C64310LZk.A00(r0)
            if (r1 == 0) goto L_0x02f7
            r0 = 2131430326(0x7f0b0bb6, float:1.848235E38)
            android.view.View r2 = r1.findViewById(r0)
            return r2
        L_0x02e5:
            java.lang.Object r0 = r7.A01
            X.LZk r0 = (X.C64310LZk) r0
            android.view.View r1 = X.C64310LZk.A00(r0)
            if (r1 == 0) goto L_0x02f7
            r0 = 2131430679(0x7f0b0d17, float:1.8483066E38)
            android.view.View r2 = r1.findViewById(r0)
            return r2
        L_0x02f7:
            r2 = 0
            return r2
        L_0x02f9:
            java.lang.Object r0 = r7.A01
            X.L8H r0 = (X.L8H) r0
            X.LAj r1 = r0.A00
            X.L1r r0 = r0.A01
            X.KCt r2 = new X.KCt
            r2.<init>(r1, r0)
            return r2
        L_0x0307:
            java.lang.Object r0 = r7.A01
            androidx.activity.ComponentActivity r0 = (androidx.activity.ComponentActivity) r0
            X.07f r2 = r0.getViewModelStore()
            return r2
        L_0x0310:
            java.lang.Object r0 = r7.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.T7C r2 = new X.T7C
            r2.<init>(r0)
            return r2
        L_0x031a:
            java.lang.Object r0 = r7.A01
            X.0lg r0 = (X.0lg) r0
            X.L4j r2 = new X.L4j
            r2.<init>(r0)
            return r2
        L_0x0324:
            java.lang.Object r1 = r7.A01
            r0 = 46
            X.FP3 r2 = new X.FP3
            r2.<init>((java.lang.Object) r1, (int) r0)
            return r2
        L_0x032e:
            java.lang.Object r1 = r7.A01
            r0 = 45
            X.FP3 r2 = new X.FP3
            r2.<init>((java.lang.Object) r1, (int) r0)
            return r2
        L_0x0338:
            java.lang.Object r1 = r7.A01
            r0 = 33
            X.EDi r2 = new X.EDi
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MML.invoke():java.lang.Object");
    }
}
