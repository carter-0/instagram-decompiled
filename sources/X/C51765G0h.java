package X;

/* renamed from: X.G0h  reason: case insensitive filesystem */
public final class C51765G0h extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C51765G0h(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:172:0x04e4, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0066, code lost:
        X.0qQ.A0F(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006d, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L_0x04b1;
                case 1: goto L_0x005c;
                case 2: goto L_0x04a7;
                case 3: goto L_0x049c;
                case 4: goto L_0x0492;
                case 5: goto L_0x0489;
                case 6: goto L_0x046a;
                case 7: goto L_0x0460;
                case 8: goto L_0x0456;
                case 9: goto L_0x043a;
                case 10: goto L_0x041a;
                case 11: goto L_0x0005;
                case 12: goto L_0x0433;
                case 13: goto L_0x042c;
                case 14: goto L_0x041a;
                case 15: goto L_0x0408;
                case 16: goto L_0x03f0;
                case 17: goto L_0x0005;
                case 18: goto L_0x0433;
                case 19: goto L_0x042c;
                case 20: goto L_0x03e2;
                case 21: goto L_0x03c0;
                case 22: goto L_0x03a6;
                case 23: goto L_0x0395;
                case 24: goto L_0x0380;
                case 25: goto L_0x0370;
                case 26: goto L_0x0360;
                case 27: goto L_0x0350;
                case 28: goto L_0x0340;
                case 29: goto L_0x030f;
                case 30: goto L_0x0251;
                case 31: goto L_0x01c6;
                case 32: goto L_0x01b2;
                case 33: goto L_0x019e;
                case 34: goto L_0x018a;
                case 35: goto L_0x0176;
                case 36: goto L_0x016d;
                case 37: goto L_0x015d;
                case 38: goto L_0x013d;
                case 39: goto L_0x0129;
                case 40: goto L_0x0107;
                case 41: goto L_0x00f6;
                case 42: goto L_0x00e4;
                case 43: goto L_0x0008;
                case 44: goto L_0x00d5;
                case 45: goto L_0x00c8;
                case 46: goto L_0x0090;
                case 47: goto L_0x0044;
                case 48: goto L_0x0030;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = r8.A01
        L_0x0007:
            return r4
        L_0x0008:
            java.lang.Object r3 = r8.A01
            X.E5x r3 = (X.C47514E5x) r3
            android.os.Bundle r1 = r3.mArguments
            if (r1 == 0) goto L_0x04e5
            java.lang.String r0 = "ARG_AUDIENCE_LIST"
            java.util.ArrayList r0 = r1.getStringArrayList(r0)
            if (r0 == 0) goto L_0x04e5
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r0.iterator()
        L_0x0020:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0007
            java.lang.String r1 = X.AnonymousClass7TE.A18(r2)
            X.0eM r0 = r3.A05
            X.Dbb.A1U(r1, r4, r0)
            goto L_0x0020
        L_0x0030:
            java.lang.Object r0 = r8.A01
            X.E5P r0 = (X.E5P) r0
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            X.0eM r0 = r0.A02
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.9jN r4 = new X.9jN
            r4.<init>(r1, r0)
            return r4
        L_0x0044:
            java.lang.Object r0 = r8.A01
            X.OTk r0 = (X.C70963OTk) r0
            X.NJv r2 = r0.A02
            android.view.View r0 = r2.A04
            java.lang.String r1 = "editText"
            if (r0 == 0) goto L_0x0066
            r0.clearFocus()
            android.view.View r0 = r2.A04
            if (r0 == 0) goto L_0x0066
            X.0nA.A0N(r0)
            goto L_0x04e2
        L_0x005c:
            java.lang.Object r4 = r8.A01
            X.E15 r4 = (X.E15) r4
            X.Ey0 r0 = r4.A00
            if (r0 != 0) goto L_0x006e
            java.lang.String r1 = "delegate"
        L_0x0066:
            X.0qQ.A0F(r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x006e:
            X.37E r1 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r0 = r0.A00
            X.DbX.A10(r0, r1)
            android.content.Context r3 = r4.requireContext()
            X.0eM r0 = r4.A02
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r1 = r4.A01
            X.2EG r0 = X.2EG.A0i
            X.SUL r1 = X.Dba.A0J(r3, r2, r0, r1)
            java.lang.String r0 = "ProfileCardNuxBottomSheetFragment"
            r1.A0S = r0
            r1.A0A()
            goto L_0x04e2
        L_0x0090:
            java.lang.Object r7 = r8.A01
            X.8Ff r7 = (X.C352838Ff) r7
            X.1Av r5 = r7.A09
            X.0s0 r4 = r5.A6l
            X.0YZ[] r6 = X.1Av.A8a
            r3 = 519(0x207, float:7.27E-43)
            int r1 = X.DbY.A03(r5, r4, r6, r3)
            r0 = 3
            if (r1 >= r0) goto L_0x04e2
            r1 = 2
            java.lang.String r0 = "quick_snap_archive_tooltip_last_shown_ts"
            boolean r0 = X.1Av.A07(r5, r0, r1)
            if (r0 == 0) goto L_0x04e2
            X.FkE r0 = X.FkE.A00
            X.C352838Ff.A03(r0, r7)
            X.DbZ.A1b(r5, r4, r6, r3)
            long r3 = java.lang.System.currentTimeMillis()
            X.0s0 r2 = r5.A6m
            r0 = 520(0x208, float:7.29E-43)
            r1 = r6[r0]
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r2.Epx(r5, r0, r1)
            goto L_0x04e2
        L_0x00c8:
            java.lang.Object r1 = r8.A01
            X.8Ff r1 = (X.C352838Ff) r1
            boolean r0 = r1.A03
            if (r0 != 0) goto L_0x04e2
            r1.A07()
            goto L_0x04e2
        L_0x00d5:
            java.lang.Object r0 = r8.A01
            X.E5x r0 = (X.C47514E5x) r0
            X.0eM r0 = r0.A04
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.17i r4 = X.17h.A00(r0)
            return r4
        L_0x00e4:
            java.lang.Object r2 = r8.A01
            X.E5x r2 = (X.C47514E5x) r2
            X.2tC r1 = X.DbV.A0S(r2)
            X.EH0 r0 = new X.EH0
            r0.<init>(r2)
            X.2t9 r4 = X.DbU.A0U(r1, r0)
            return r4
        L_0x00f6:
            java.lang.Object r2 = r8.A01
            r0 = 40
            X.G4S r1 = new X.G4S
            r1.<init>(r2, r0)
            r0 = 22
            X.FKk r4 = new X.FKk
            r4.<init>(r1, r0)
            return r4
        L_0x0107:
            java.lang.Object r0 = r8.A01
            X.LSq r0 = (X.C64183LSq) r0
            android.view.ViewGroup r1 = r0.A01
            r0 = 2131439139(0x7f0b2e23, float:1.8500225E38)
            X.DbY.A10(r1, r0)
            r0 = 2131439138(0x7f0b2e22, float:1.8500223E38)
            android.view.View r4 = r1.findViewById(r0)
            android.content.res.Resources r1 = X.DbU.A05(r4)
            r0 = 2131165250(0x7f070042, float:1.7944712E38)
            int r0 = r1.getDimensionPixelSize(r0)
            X.AnonymousClass8LZ.A02(r4, r0)
            return r4
        L_0x0129:
            java.lang.Object r0 = r8.A01
            X.LSq r0 = (X.C64183LSq) r0
            android.view.ViewGroup r1 = r0.A01
            r0 = 2131439127(0x7f0b2e17, float:1.85002E38)
            X.DbY.A10(r1, r0)
            r0 = 2131439126(0x7f0b2e16, float:1.8500198E38)
            android.view.View r4 = r1.findViewById(r0)
            return r4
        L_0x013d:
            java.lang.Object r2 = r8.A01
            X.LSq r2 = (X.C64183LSq) r2
            android.view.View r1 = X.C64183LSq.A00(r2)
            r0 = 2131439125(0x7f0b2e15, float:1.8500196E38)
            android.view.View r4 = r1.findViewById(r0)
            X.0qQ.A0A(r4)
            X.8br r0 = r2.A09
            int r1 = r0.A00()
            int r0 = r0.A00()
            X.0nA.A0g(r4, r1, r0)
            return r4
        L_0x015d:
            java.lang.Object r0 = r8.A01
            X.LSq r0 = (X.C64183LSq) r0
            android.view.View r1 = X.C64183LSq.A00(r0)
            r0 = 2131439080(0x7f0b2de8, float:1.8500105E38)
            android.view.View r4 = r1.findViewById(r0)
            return r4
        L_0x016d:
            java.lang.Object r0 = r8.A01
            X.LSq r0 = (X.C64183LSq) r0
            X.C64183LSq.A02(r0)
            goto L_0x04e2
        L_0x0176:
            java.lang.Object r0 = r8.A01
            X.LSq r0 = (X.C64183LSq) r0
            android.view.ViewGroup r1 = r0.A01
            r0 = 2131439124(0x7f0b2e14, float:1.8500194E38)
            X.DbY.A10(r1, r0)
            r0 = 2131439123(0x7f0b2e13, float:1.8500192E38)
            android.view.View r4 = r1.findViewById(r0)
            return r4
        L_0x018a:
            java.lang.Object r0 = r8.A01
            X.LSq r0 = (X.C64183LSq) r0
            android.view.ViewGroup r1 = r0.A01
            r0 = 2131439121(0x7f0b2e11, float:1.8500188E38)
            X.DbY.A10(r1, r0)
            r0 = 2131439122(0x7f0b2e12, float:1.850019E38)
            android.view.View r4 = r1.findViewById(r0)
            return r4
        L_0x019e:
            java.lang.Object r0 = r8.A01
            X.LSq r0 = (X.C64183LSq) r0
            android.view.ViewGroup r1 = r0.A01
            r0 = 2131429440(0x7f0b0840, float:1.8480553E38)
            X.DbY.A10(r1, r0)
            r0 = 2131429439(0x7f0b083f, float:1.848055E38)
            android.view.View r4 = r1.findViewById(r0)
            return r4
        L_0x01b2:
            java.lang.Object r0 = r8.A01
            X.LSq r0 = (X.C64183LSq) r0
            android.view.ViewGroup r1 = r0.A01
            r0 = 2131429421(0x7f0b082d, float:1.8480514E38)
            X.DbY.A10(r1, r0)
            r0 = 2131429618(0x7f0b08f2, float:1.8480914E38)
            android.view.View r4 = r1.findViewById(r0)
            return r4
        L_0x01c6:
            java.lang.Object r5 = r8.A01
            X.LSq r5 = (X.C64183LSq) r5
            android.view.ViewGroup r3 = r5.A01
            r0 = 2131439094(0x7f0b2df6, float:1.8500133E38)
            android.view.ViewStub r0 = X.DbS.A0F(r3, r0)
            if (r0 == 0) goto L_0x0235
            android.view.View r6 = r0.inflate()
            if (r6 == 0) goto L_0x0235
            r0 = 2131439142(0x7f0b2e26, float:1.850023E38)
            android.view.View r1 = r6.findViewById(r0)
            if (r1 == 0) goto L_0x01e8
            r0 = 6
            X.FP2.A00(r1, r0, r5)
        L_0x01e8:
            r0 = 2131439141(0x7f0b2e25, float:1.8500229E38)
            android.view.View r1 = r6.findViewById(r0)
            if (r1 == 0) goto L_0x01f5
            r0 = 7
            X.FP2.A00(r1, r0, r5)
        L_0x01f5:
            r0 = 2131439143(0x7f0b2e27, float:1.8500233E38)
            android.view.View r7 = r6.findViewById(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r7 = (com.instagram.common.ui.widget.imageview.IgImageView) r7
            if (r7 == 0) goto L_0x021b
            com.instagram.common.session.UserSession r4 = r5.A03
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325557784491042(0x810de700033422, double:3.035767241968228E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x023d
            r1 = 2131239454(0x7f08221e, float:1.8095215E38)
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r0 = r5.A04
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r0 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r0
            int r0 = r0.A06
            X.I7E.A08(r4, r7, r1, r0)
        L_0x021b:
            r0 = 2131439140(0x7f0b2e24, float:1.8500227E38)
            android.widget.TextView r2 = X.AnonymousClass7TE.A0d(r6, r0)
            if (r2 == 0) goto L_0x0235
            com.instagram.common.session.UserSession r0 = r5.A03
            boolean r1 = X.AnonymousClass39U.A03(r0)
            r0 = 2131971145(0x7f134c49, float:1.9579261E38)
            if (r1 == 0) goto L_0x0232
            r0 = 2131971146(0x7f134c4a, float:1.9579263E38)
        L_0x0232:
            r2.setText(r0)
        L_0x0235:
            r0 = 2131439093(0x7f0b2df5, float:1.8500131E38)
            android.view.View r4 = X.AnonymousClass7TE.A0b(r3, r0)
            return r4
        L_0x023d:
            android.content.Context r2 = r7.getContext()
            boolean r1 = X.C61670oa.A07()
            r0 = 2131239458(0x7f082222, float:1.8095224E38)
            if (r1 == 0) goto L_0x024d
            r0 = 2131239459(0x7f082223, float:1.8095226E38)
        L_0x024d:
            X.DbU.A13(r2, r7, r0)
            goto L_0x021b
        L_0x0251:
            java.lang.Object r4 = r8.A01
            X.LSq r4 = (X.C64183LSq) r4
            android.view.ViewGroup r3 = r4.A01
            r0 = 2131439092(0x7f0b2df4, float:1.850013E38)
            android.view.ViewStub r0 = X.DbS.A0F(r3, r0)
            if (r0 == 0) goto L_0x02e4
            android.view.View r5 = r0.inflate()
            if (r5 == 0) goto L_0x02e4
            r0 = 2131439109(0x7f0b2e05, float:1.8500164E38)
            android.view.View r1 = r5.findViewById(r0)
            if (r1 == 0) goto L_0x0273
            r0 = 3
            X.FP2.A00(r1, r0, r4)
        L_0x0273:
            r0 = 2131439108(0x7f0b2e04, float:1.8500162E38)
            android.view.View r1 = r5.findViewById(r0)
            if (r1 == 0) goto L_0x0280
            r0 = 4
            X.FP2.A00(r1, r0, r4)
        L_0x0280:
            r0 = 2131439112(0x7f0b2e08, float:1.850017E38)
            android.view.View r6 = r5.findViewById(r0)
            if (r6 == 0) goto L_0x02a4
            r0 = 0
            r6.setAlpha(r0)
            android.view.ViewPropertyAnimator r2 = X.DbY.A0G(r6)
            r0 = 1000(0x3e8, double:4.94E-321)
            android.view.ViewPropertyAnimator r2 = r2.setStartDelay(r0)
            r0 = 200(0xc8, double:9.9E-322)
            android.view.ViewPropertyAnimator r0 = r2.setDuration(r0)
            r0.start()
            r0 = 5
            X.FP2.A00(r6, r0, r4)
        L_0x02a4:
            r0 = 2131439111(0x7f0b2e07, float:1.8500168E38)
            android.view.View r6 = r5.findViewById(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r6 = (com.instagram.common.ui.widget.imageview.IgImageView) r6
            if (r6 == 0) goto L_0x02ca
            com.instagram.common.session.UserSession r7 = r4.A03
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325557784491042(0x810de700033422, double:3.035767241968228E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x02ec
            r1 = 2131239453(0x7f08221d, float:1.8095213E38)
            X.8br r0 = r4.A09
            int r0 = r0.A00()
            X.I7E.A08(r7, r6, r1, r0)
        L_0x02ca:
            r0 = 2131439113(0x7f0b2e09, float:1.8500172E38)
            android.widget.TextView r2 = X.AnonymousClass7TE.A0d(r5, r0)
            if (r2 == 0) goto L_0x02e4
            com.instagram.common.session.UserSession r0 = r4.A03
            boolean r1 = X.AnonymousClass39U.A02(r0)
            r0 = 2131971140(0x7f134c44, float:1.957925E38)
            if (r1 == 0) goto L_0x02e1
            r0 = 2131971141(0x7f134c45, float:1.9579253E38)
        L_0x02e1:
            r2.setText(r0)
        L_0x02e4:
            r0 = 2131439091(0x7f0b2df3, float:1.8500127E38)
            android.view.View r4 = X.AnonymousClass7TE.A0b(r3, r0)
            return r4
        L_0x02ec:
            android.content.Context r2 = r6.getContext()
            boolean r0 = X.AnonymousClass39U.A02(r7)
            boolean r1 = X.C61670oa.A07()
            if (r0 == 0) goto L_0x0306
            r0 = 2131239456(0x7f082220, float:1.809522E38)
            if (r1 == 0) goto L_0x0302
            r0 = 2131239457(0x7f082221, float:1.8095221E38)
        L_0x0302:
            X.DbU.A13(r2, r6, r0)
            goto L_0x02ca
        L_0x0306:
            r0 = 2131239452(0x7f08221c, float:1.8095211E38)
            if (r1 == 0) goto L_0x0302
            r0 = 2131239455(0x7f08221f, float:1.8095217E38)
            goto L_0x0302
        L_0x030f:
            java.lang.Object r2 = r8.A01
            X.LSq r2 = (X.C64183LSq) r2
            android.view.View r1 = X.C64183LSq.A00(r2)
            r0 = 2131439086(0x7f0b2dee, float:1.8500117E38)
            X.DbY.A10(r1, r0)
            android.view.View r1 = X.C64183LSq.A00(r2)
            r0 = 2131439085(0x7f0b2ded, float:1.8500115E38)
            android.view.View r4 = r1.findViewById(r0)
            X.0qQ.A0A(r4)
            X.8br r2 = r2.A09
            int r1 = r2.A00()
            int r0 = r2.A00()
            X.0nA.A0g(r4, r1, r0)
            int r0 = r2.A00()
            X.AnonymousClass8LZ.A02(r4, r0)
            return r4
        L_0x0340:
            java.lang.Object r0 = r8.A01
            X.LSq r0 = (X.C64183LSq) r0
            android.view.View r1 = X.C64183LSq.A00(r0)
            r0 = 2131439083(0x7f0b2deb, float:1.8500111E38)
            android.view.View r4 = X.AnonymousClass7TF.A0G(r1, r0)
            return r4
        L_0x0350:
            java.lang.Object r0 = r8.A01
            X.LSq r0 = (X.C64183LSq) r0
            android.view.View r1 = X.C64183LSq.A00(r0)
            r0 = 2131439082(0x7f0b2dea, float:1.850011E38)
            android.view.View r4 = X.AnonymousClass7TF.A0G(r1, r0)
            return r4
        L_0x0360:
            java.lang.Object r0 = r8.A01
            X.LSq r0 = (X.C64183LSq) r0
            android.view.View r1 = X.C64183LSq.A00(r0)
            r0 = 2131439081(0x7f0b2de9, float:1.8500107E38)
            android.view.View r4 = X.AnonymousClass7TF.A0G(r1, r0)
            return r4
        L_0x0370:
            java.lang.Object r0 = r8.A01
            X.LSq r0 = (X.C64183LSq) r0
            android.view.View r1 = X.C64183LSq.A00(r0)
            r0 = 2131439051(0x7f0b2dcb, float:1.8500046E38)
            android.view.View r4 = X.AnonymousClass7TF.A0G(r1, r0)
            return r4
        L_0x0380:
            java.lang.Object r2 = r8.A01
            X.8Fe r2 = (X.C352828Fe) r2
            X.872 r0 = r2.A08
            r0.A0C()
            r1 = 23
            X.G0h r0 = new X.G0h
            r0.<init>(r2, r1)
            X.C352828Fe.A00(r2, r0)
            goto L_0x04e2
        L_0x0395:
            java.lang.Object r0 = r8.A01
            X.8Fe r0 = (X.C352828Fe) r0
            X.0eM r0 = r0.A0F
            java.lang.Object r0 = r0.getValue()
            X.8Ff r0 = (X.C352838Ff) r0
            r0.A06()
            goto L_0x04e2
        L_0x03a6:
            java.lang.Object r2 = r8.A01
            X.8Fe r2 = (X.C352828Fe) r2
            X.0eM r0 = r2.A0E
            java.lang.Object r0 = r0.getValue()
            X.LSq r0 = (X.C64183LSq) r0
            android.view.View r1 = r0.A05()
            X.Aky r0 = new X.Aky
            r0.<init>(r2)
            r1.post(r0)
            goto L_0x04e2
        L_0x03c0:
            java.lang.Object r1 = r8.A01
            X.E5Y r1 = (X.E5Y) r1
            android.content.Context r3 = r1.requireContext()
            X.0eM r0 = r1.A0G
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            android.os.Bundle r1 = r1.mArguments
            if (r1 == 0) goto L_0x03da
            java.lang.String r0 = "arg_quick_snap_media_id"
            java.lang.String r0 = r1.getString(r0)
            if (r0 != 0) goto L_0x03dc
        L_0x03da:
            java.lang.String r0 = ""
        L_0x03dc:
            X.9jO r4 = new X.9jO
            r4.<init>(r3, r2, r0)
            return r4
        L_0x03e2:
            java.lang.Object r1 = r8.A01
            X.E5Y r1 = (X.E5Y) r1
            android.content.Context r0 = r1.requireContext()
            X.OCb r4 = new X.OCb
            r4.<init>(r0, r1)
            return r4
        L_0x03f0:
            java.lang.Object r0 = r8.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r2 = r0.mArguments
            r1 = 1
            if (r2 == 0) goto L_0x0406
            java.lang.String r0 = "arg_show_camera_entry_point"
            boolean r0 = r2.getBoolean(r0)
            if (r0 != r1) goto L_0x0406
        L_0x0401:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            return r4
        L_0x0406:
            r1 = 0
            goto L_0x0401
        L_0x0408:
            java.lang.Object r2 = r8.A01
            X.4DH r2 = (X.AnonymousClass4DH) r2
            X.2tC r1 = X.DbV.A0S(r2)
            X.EH1 r0 = new X.EH1
            r0.<init>(r2)
            X.2t9 r4 = X.DbU.A0U(r1, r0)
            return r4
        L_0x041a:
            java.lang.Object r0 = r8.A01
            android.content.Context r1 = X.DbT.A07(r0)
            r0 = 2131165489(0x7f070131, float:1.7945197E38)
            int r0 = X.I7E.A00(r1, r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            return r4
        L_0x042c:
            java.lang.Object r0 = r8.A01
            X.07f r4 = X.DbY.A0I(r0)
            return r4
        L_0x0433:
            java.lang.Object r0 = r8.A01
            java.lang.Object r4 = X.DbT.A0r(r0)
            return r4
        L_0x043a:
            java.lang.Object r1 = r8.A01
            X.E1G r1 = (X.E1G) r1
            android.content.Context r3 = r1.requireContext()
            X.0eM r0 = r1.A08
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r1.A07
            int r1 = X.DbX.A07(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.9jQ r4 = new X.9jQ
            r4.<init>(r3, r2, r0, r1)
            return r4
        L_0x0456:
            java.lang.Object r0 = r8.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.FYc r4 = new X.FYc
            r4.<init>(r0)
            return r4
        L_0x0460:
            java.lang.Object r0 = r8.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.2cH r4 = new X.2cH
            r4.<init>(r0)
            return r4
        L_0x046a:
            com.google.common.collect.ImmutableList$Builder r4 = com.google.common.collect.ImmutableList.builder()
            java.lang.Object r0 = r8.A01
            X.AVG r0 = (X.AVG) r0
            X.JV7 r0 = r0.A00
            java.lang.String r3 = r0.A02
            java.lang.Object r2 = r0.A00
            X.4W5 r2 = (X.AnonymousClass4W5) r2
            r1 = 17
            X.JFv r0 = new X.JFv
            r0.<init>(r4, r1)
            X.C283925Jw.A00(r2, r3, r0)
            com.google.common.collect.ImmutableList r4 = r4.build()
            return r4
        L_0x0489:
            java.lang.Object r0 = r8.A01
            androidx.core.app.ComponentActivity r0 = (androidx.core.app.ComponentActivity) r0
            X.0xx r4 = X.AnonymousClass07a.A00(r0)
            return r4
        L_0x0492:
            java.lang.Object r0 = r8.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.DcZ r4 = new X.DcZ
            r4.<init>(r0)
            return r4
        L_0x049c:
            java.lang.Object r0 = r8.A01
            X.Fi2 r0 = (X.Fi2) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.8ju r4 = X.LJr.A00(r0)
            return r4
        L_0x04a7:
            java.lang.Object r0 = r8.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.Soy r4 = new X.Soy
            r4.<init>(r0)
            return r4
        L_0x04b1:
            java.lang.Object r5 = r8.A01
            X.Ey0 r5 = (X.Ey0) r5
            com.instagram.common.session.UserSession r4 = r5.A01
            X.1Av r3 = X.1Au.A00(r4)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36608901072033547(0x820f9a0004170b, double:3.214954677941949E-306)
            int r2 = X.DbS.A04(r2, r4, r0)
            X.0xY r1 = X.AnonymousClass7TE.A0p(r3)
            r0 = 3162(0xc5a, float:4.431E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r1.E5Z(r0, r2)
            r1.apply()
            X.37E r0 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r1 = r5.A00
            X.DbX.A10(r1, r0)
            com.instagram.user.model.User r0 = r5.A02
            X.AnonymousClass708.A04(r1, r4, r0)
        L_0x04e2:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x04e5:
            X.0sn r4 = X.0sn.A00
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51765G0h.invoke():java.lang.Object");
    }
}
