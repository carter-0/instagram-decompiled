package X;

/* renamed from: X.8Ft  reason: invalid class name and case insensitive filesystem */
public final class C352968Ft implements C3497181l {
    public final /* synthetic */ C352888Fl A00;

    public C352968Ft(C352888Fl r1) {
        this.A00 = r1;
    }

    public final void DDD(Exception exc) {
        C352888Fl r3 = this.A00;
        if (r3.A0I) {
            C360908fL.A03(r3.A0f, "first_frame_rendered", false);
            C342827pE r0 = r3.A0j;
            if (r0 != null) {
                r0.D09();
            }
            if (exc != null) {
                0kD.A01("Camera initialization failure", C340217kt.A03(exc));
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v16, types: [X.7qN, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v1, types: [android.widget.FrameLayout, X.9Xz, android.view.View, android.view.ViewGroup] */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0348, code lost:
        if (r15.A0R() == false) goto L_0x008a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DKf(X.C343367q6 r19) {
        /*
            r18 = this;
            r0 = r18
            X.8Fl r3 = r0.A00
            r7 = r19
            X.7p3 r1 = r7.A03
            X.7p4 r0 = X.C342717p3.A0y
            java.lang.Object r0 = r1.A02(r0)
            X.7pa r0 = (X.C343047pa) r0
            X.C352888Fl.A03(r0, r3)
            boolean r0 = r3.A0I
            if (r0 == 0) goto L_0x032c
            X.7l2 r0 = r3.A06
            r0.getClass()
            X.7np r0 = new X.7np
            r0.<init>(r3)
            r3.A0U(r0)
            X.8Yz r15 = r3.A0g
            r2 = 1
            X.8aL r0 = X.C358088aL.A0C
            r6 = 0
            X.8aL[] r0 = new X.C358088aL[]{r0}
            boolean r0 = r15.A0V(r0)
            if (r0 != 0) goto L_0x0076
            X.8GA r8 = r3.A0n
            X.7l2 r5 = r3.A06
            X.0qQ.A0B(r5, r6)
            r8.A03 = r5
            r8.A02 = r7
            java.util.ArrayList r4 = r8.A0I
            r4.clear()
            X.7p0 r1 = r7.A02
            X.7p1 r0 = X.C342687p0.A0v
            java.lang.Object r0 = r1.A01(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            r4.addAll(r0)
            r8.A08 = r2
            boolean r0 = X.AnonymousClass8GA.A02(r8)
            if (r0 == 0) goto L_0x034c
            X.AnonymousClass8GA.A00(r8)
        L_0x005c:
            int r0 = r8.A00
            r8.A09(r0)
        L_0x0061:
            X.07Z r0 = r8.A0B
            X.0xx r5 = X.AnonymousClass07a.A00(r0)
            r1 = 0
            r0 = 19
            X.9Js r4 = new X.9Js
            r4.<init>(r8, r1, r0)
            X.19B r1 = X.19B.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.1Eo.A03(r0, r1, r4, r5)
        L_0x0076:
            X.84E r10 = r3.A0c
            if (r10 == 0) goto L_0x016e
            java.lang.Integer r1 = r3.A0N()
            if (r1 == 0) goto L_0x0343
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0343
        L_0x008a:
            r8 = 0
        L_0x008b:
            android.app.Activity r5 = r10.A08
            com.instagram.common.session.UserSession r4 = r10.A0D
            X.0iw r0 = r10.A0C
            r0.getModuleName()
            X.7qN r1 = new X.7qN
            r1.<init>()
            java.lang.String r0 = "android.permission.CAMERA"
            X.1DL.A07(r5, r0)
            X.C2604245p.A03(r5)
            X.C343547qO.A00 = r1
            r10.A06 = r3
            if (r8 == 0) goto L_0x016e
            X.1Av r9 = X.1Au.A00(r4)
            X.0s0 r8 = r9.A46
            X.0YZ[] r14 = X.1Av.A8a
            r0 = 103(0x67, float:1.44E-43)
            r0 = r14[r0]
            java.lang.Object r0 = r8.CDM(r9, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x016e
            X.0s0 r1 = r9.A43
            r0 = 101(0x65, float:1.42E-43)
            r0 = r14[r0]
            java.lang.Object r0 = r1.CDM(r9, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x016e
            X.9Xz r0 = r10.A04
            if (r0 != 0) goto L_0x013c
            android.view.ViewGroup r13 = r10.A0A
            android.content.Context r0 = r13.getContext()
            r4 = 2131971021(0x7f134bcd, float:1.957901E38)
            X.9Xz r12 = new X.9Xz
            r12.<init>(r0)
            r12.A03 = r6
            android.content.Context r1 = r12.getContext()
            r0 = 2131629287(0x7f0e14e7, float:1.888589E38)
            android.view.View.inflate(r1, r0, r12)
            r0 = 2131428090(0x7f0b02fa, float:1.8477815E38)
            android.view.View r1 = r12.findViewById(r0)
            r1.getClass()
            android.widget.TextView r1 = (android.widget.TextView) r1
            r12.A01 = r1
            r0 = 3
            r1.setMaxLines(r0)
            android.widget.TextView r0 = r12.A01
            r0.setText(r4)
            r0 = 2131440693(0x7f0b3435, float:1.8503377E38)
            android.view.View r1 = r12.findViewById(r0)
            r1.getClass()
            r12.A00 = r1
            X.9WY r0 = new X.9WY
            r0.<init>()
            r1.setBackground(r0)
            X.2cp r0 = X.C61340me.A00()
            X.2cs r11 = r0.A02()
            r4 = 4619567317775286272(0x401c000000000000, double:7.0)
            r0 = 4626322717216342016(0x4034000000000000, double:20.0)
            X.2co r0 = X.C71392co.A03(r4, r0)
            r11.A09(r0)
            X.9fx r0 = new X.9fx
            r0.<init>(r12)
            r11.A0A(r0)
            r12.A02 = r11
            r10.A04 = r12
            r13.addView(r12)
        L_0x013c:
            android.view.ViewGroup r5 = r10.A0A
            java.lang.Runnable r4 = r10.A0E
            r5.removeCallbacks(r4)
            r0 = 4000(0xfa0, double:1.9763E-320)
            r5.postDelayed(r4, r0)
            X.9Xz r5 = r10.A04
            boolean r0 = r5.A03
            if (r0 != 0) goto L_0x0163
            r5.A03 = r2
            X.2cs r4 = r5.A02
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r4.A06(r0)
            android.widget.TextView r0 = r5.A01
            android.view.View[] r1 = new android.view.View[]{r0}
            X.2co r0 = X.C315596kB.A02
            r0 = 0
            X.C294975nL.A04(r0, r1, r2)
        L_0x0163:
            r0 = 103(0x67, float:1.44E-43)
            r1 = r14[r0]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r8.Epx(r9, r0, r1)
        L_0x016e:
            X.80U r1 = r3.A1C
            X.80V r0 = X.AnonymousClass80V.LAYOUT_CAPTURE
            boolean r0 = r1.CQ0(r0)
            if (r0 != 0) goto L_0x0339
            X.80V r0 = X.AnonymousClass80V.LAYOUT_COMPLETE
            boolean r0 = r1.CQ0(r0)
            if (r0 != 0) goto L_0x0339
            X.8aL r0 = X.C358088aL.A0T
            X.8aL[] r0 = new X.C358088aL[]{r0}
            boolean r0 = r15.A0V(r0)
            if (r0 == 0) goto L_0x0195
            X.JYD r0 = X.C352888Fl.A00(r3)
            if (r0 == 0) goto L_0x0195
            r0.A0K(r2)
        L_0x0195:
            X.8aL r0 = X.C358088aL.A0p
            X.8aL[] r0 = new X.C358088aL[]{r0}
            boolean r0 = r15.A0V(r0)
            if (r0 == 0) goto L_0x01aa
            X.Jc1 r0 = X.C352888Fl.A01(r3)
            if (r0 == 0) goto L_0x01aa
            r0.A03()
        L_0x01aa:
            X.80m r4 = r15.A08
            java.lang.Object r0 = r4.A00
            boolean r0 = r0 instanceof X.AnonymousClass80K
            if (r0 == 0) goto L_0x01be
            X.8Fe r5 = r3.A0E
            r1 = 22
            X.G0h r0 = new X.G0h
            r0.<init>(r5, r1)
            X.C352828Fe.A00(r5, r0)
        L_0x01be:
            X.88F r9 = r3.A1H
            if (r9 == 0) goto L_0x01d2
            com.instagram.common.session.UserSession r8 = r9.A0C
            X.0Tu r5 = X.0Tu.A05
            r0 = 36328581441273278(0x8110a700003dbe, double:3.0376794146926024E-306)
            boolean r0 = X.182.A06(r5, r8, r0)
            X.AnonymousClass88F.A04(r9, r0)
        L_0x01d2:
            X.885 r0 = r3.A1D
            X.05G r0 = r0.A01
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r0.Epw(r1)
            X.8H1 r0 = r3.A0h
            if (r0 == 0) goto L_0x01e6
            X.2Fj r0 = r0.A05
            r0.A0B(r1)
        L_0x01e6:
            X.7l2 r0 = r3.A06
            r0.EXA(r2)
            X.80x r8 = r3.A1G
            X.7l2 r1 = r3.A06
            r8.A01 = r1
            java.lang.Object r0 = r4.A00
            boolean r0 = r0 instanceof X.AnonymousClass80O
            if (r0 == 0) goto L_0x01fe
            boolean r0 = X.C352888Fl.A0H(r3)
            if (r0 != 0) goto L_0x01fe
            r6 = 1
        L_0x01fe:
            r5 = 0
            X.7tb r0 = X.C340297l2.A02(r1)
            com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController r0 = (com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController) r0
            X.7lR r0 = r0.A04
            if (r0 == 0) goto L_0x020e
            X.7lX r0 = r0.A0N
            r0.EXp(r5, r6)
        L_0x020e:
            boolean r0 = r3.A1M
            if (r0 == 0) goto L_0x025d
            X.8GT r1 = r3.A0o
            if (r1 == 0) goto L_0x025d
            X.7l2 r6 = r3.A06
            r0 = 0
            X.0qQ.A0B(r6, r0)
            r1.A02 = r6
            X.7p0 r6 = r7.A02
            X.7p1 r0 = X.C342687p0.A0U
            java.lang.Object r0 = r6.A01(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x025d
            X.7p1 r0 = X.C342687p0.A0O
            java.lang.Object r0 = r6.A01(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x025d
            X.7p1 r0 = X.C342687p0.A0l
            java.lang.Object r0 = r6.A01(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 >= r2) goto L_0x025d
            X.7l2 r0 = r1.A02
            if (r0 == 0) goto L_0x025d
            X.7tb r0 = X.C340297l2.A02(r0)
            com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController r0 = (com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController) r0
            X.7lR r0 = r0.A04
            if (r0 == 0) goto L_0x025d
            X.7lX r0 = r0.A0N
            r0.AAm(r1)
        L_0x025d:
            X.8Gi r0 = r3.A0m
            r0.A06(r7)
            X.14i r1 = X.14i.A08
            X.0lV r0 = r3.A0e
            r1.A0A(r0)
            java.lang.Object r0 = r4.A00
            X.4yO r0 = (X.C279284yO) r0
            boolean r0 = X.C352888Fl.A0G(r0, r3)
            if (r0 == 0) goto L_0x032d
            X.7p0 r1 = r7.A02
            X.7p1 r0 = X.C342687p0.A08
            java.lang.Object r0 = r1.A01(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x032d
            com.instagram.common.session.UserSession r14 = r3.A0f
            X.0Tu r6 = X.0Tu.A05
            r0 = 36317762418644472(0x8106d0000015f8, double:3.030837421217438E-306)
            boolean r0 = X.182.A06(r6, r14, r0)
            if (r0 == 0) goto L_0x032d
            X.8Fr r10 = r3.A0A
            if (r10 != 0) goto L_0x02a9
            X.81m r0 = r3.A19
            android.content.Context r11 = X.C60960kU.A00
            X.07Z r12 = r3.A0W
            X.7l2 r13 = r3.A06
            X.8Fr r10 = new X.8Fr
            r17 = r8
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r3.A0A = r10
        L_0x02a9:
            X.81w r0 = r10.A07
            X.8GF r1 = r0.CrP()
            X.AZq r0 = new X.AZq
            r0.<init>(r10)
            r1.A00 = r0
            r1.A00()
            X.7l2 r7 = r10.A04
            int r0 = r7.A09()
            r6 = 1
            if (r0 == r2) goto L_0x02ca
            int r1 = r7.A09()
            r0 = 2
            if (r1 == r0) goto L_0x02ca
            r6 = 0
        L_0x02ca:
            r10.A00 = r6
            X.C352948Fr.A01(r10, r6)
            X.7lh r1 = r10.A03
            X.7tb r0 = X.C340297l2.A02(r7)
            com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController r0 = (com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController) r0
            X.7lR r0 = r0.A04
            if (r0 == 0) goto L_0x02e0
            X.7lX r0 = r0.A0N
            r0.A9G(r1)
        L_0x02e0:
            X.07Z r0 = r10.A02
            X.0xx r7 = X.AnonymousClass07a.A00(r0)
            r0 = 20
            X.9Js r6 = new X.9Js
            r6.<init>(r10, r5, r0)
            X.19B r1 = X.19B.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.1Eo.A03(r0, r1, r6, r7)
            X.8GJ r1 = r3.A0k
            X.8Fr r0 = r3.A0A
            r1.A02 = r0
            android.view.ViewGroup r1 = r3.A0T
            r0 = 2131433988(0x7f0b1a04, float:1.8489777E38)
            android.view.View r0 = r1.requireViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.A02 = r0
        L_0x0307:
            boolean r0 = r3.A0K
            if (r0 == 0) goto L_0x032a
            java.lang.Object r0 = r4.A00
            boolean r0 = r0 instanceof X.AnonymousClass80O
            if (r0 == 0) goto L_0x032a
            X.8FK r0 = r3.A11
            X.81C r0 = r0.A00
            X.81E r4 = r0.A00()
            X.8FL r4 = (X.AnonymousClass8FL) r4
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r1 = r4.A0N
            float r0 = r4.A03
            r1.setScaleX(r0)
            float r0 = r4.A03
            r1.setScaleY(r0)
            X.AnonymousClass8FL.A00(r4)
        L_0x032a:
            r3.A0M = r2
        L_0x032c:
            return
        L_0x032d:
            X.8Fr r0 = r3.A0A
            if (r0 == 0) goto L_0x0334
            r0.A02()
        L_0x0334:
            X.8GJ r0 = r3.A0k
            r0.A02 = r5
            goto L_0x0307
        L_0x0339:
            X.8SB r0 = new X.8SB
            r0.<init>()
            r1.E3H(r0)
            goto L_0x0195
        L_0x0343:
            boolean r0 = r15.A0R()
            r8 = 1
            if (r0 != 0) goto L_0x008b
            goto L_0x008a
        L_0x034c:
            X.7q6 r0 = r8.A02
            if (r0 == 0) goto L_0x005c
            X.7q6 r0 = r0.A00
            if (r0 == 0) goto L_0x005c
            X.8GD r0 = r8.A0C
            r5.A0K(r0, r6)
            goto L_0x0061
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C352968Ft.DKf(X.7q6):void");
    }
}
