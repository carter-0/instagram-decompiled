package X;

import android.view.View;

public final class ICZ implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    public ICZ(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.A00 = i;
        this.A06 = obj4;
        this.A03 = obj5;
        this.A04 = obj6;
        this.A05 = obj3;
        this.A02 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: type inference failed for: r0v47, types: [X.07Z, X.4DH] */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0177, code lost:
        r1.A0D(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0221, code lost:
        X.0qQ.A0F("clipsItem");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x022a, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0038, code lost:
        X.AnonymousClass0fD.A0C(-1773250883, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r29) {
        /*
            r28 = this;
            r6 = r28
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x0299;
                case 1: goto L_0x0249;
                case 2: goto L_0x0008;
                default: goto L_0x0007;
            }
        L_0x0007:
            return
        L_0x0008:
            r0 = 7657835(0x74d96b, float:1.0730912E-38)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r6.A06
            X.GCf r0 = (X.C52033GCf) r0
            java.lang.Object r12 = r6.A01
            X.4bN r12 = (X.C267324bN) r12
            java.lang.Object r13 = r6.A02
            X.GDe r13 = (X.C52058GDe) r13
            java.lang.Object r5 = r6.A05
            X.HNQ r5 = (X.HNQ) r5
            java.lang.Object r7 = r6.A03
            android.content.Context r7 = (android.content.Context) r7
            java.lang.Object r1 = r6.A04
            X.1Xj r1 = (X.1Xj) r1
            r3 = 12
            X.I9B r4 = new X.I9B
            r4.<init>(r0, r3)
            int r3 = r5.ordinal()
            r11 = 0
            java.lang.String r6 = "Required value was null."
            switch(r3) {
                case 0: goto L_0x0128;
                case 1: goto L_0x0100;
                case 2: goto L_0x006a;
                case 3: goto L_0x01e4;
                case 4: goto L_0x01ed;
                case 5: goto L_0x0207;
                case 6: goto L_0x01a1;
                case 7: goto L_0x005a;
                case 8: goto L_0x004b;
                case 9: goto L_0x0045;
                case 10: goto L_0x003f;
                case 11: goto L_0x01d5;
                case 12: goto L_0x01d5;
                case 13: goto L_0x0121;
                case 14: goto L_0x01ba;
                case 15: goto L_0x017c;
                case 16: goto L_0x00f6;
                case 17: goto L_0x0173;
                case 18: goto L_0x0092;
                case 19: goto L_0x0038;
                case 20: goto L_0x0038;
                case 21: goto L_0x0196;
                case 22: goto L_0x0038;
                case 23: goto L_0x0038;
                case 24: goto L_0x0038;
                case 25: goto L_0x0038;
                case 26: goto L_0x0038;
                case 27: goto L_0x0038;
                case 28: goto L_0x0185;
                case 29: goto L_0x0185;
                case 30: goto L_0x0038;
                case 31: goto L_0x0038;
                case 32: goto L_0x015a;
                case 33: goto L_0x010f;
                case 34: goto L_0x010f;
                case 35: goto L_0x010f;
                case 36: goto L_0x010f;
                default: goto L_0x0038;
            }
        L_0x0038:
            r0 = -1773250883(0xffffffff964e56bd, float:-1.6667917E-25)
            X.AnonymousClass0fD.A0C(r0, r2)
            return
        L_0x003f:
            X.GCg r1 = r0.A0H
            X.HNR r0 = X.HNR.A2R
            goto L_0x0177
        L_0x0045:
            X.GCg r1 = r0.A0H
            X.HNR r0 = X.HNR.A1e
            goto L_0x0177
        L_0x004b:
            X.GCg r0 = r0.A0H
            X.4bN r4 = r0.A00
            if (r4 == 0) goto L_0x0221
            X.GBE r3 = r0.A0G
            java.lang.String r1 = "three_dot_menu"
            r0 = 0
            r3.A0N(r4, r1, r0, r0)
            goto L_0x0038
        L_0x005a:
            X.GCg r0 = r0.A0H
            X.4bN r5 = r0.A00
            if (r5 == 0) goto L_0x0221
            X.GBE r4 = r0.A0G
            java.lang.String r3 = "three_dot_menu"
            r1 = 0
            r0 = 1
            r4.A0N(r5, r3, r0, r1)
            goto L_0x0038
        L_0x006a:
            X.JTB r10 = r0.A0F
            com.instagram.common.session.UserSession r0 = r0.A0A
            com.instagram.user.model.User r15 = r12.A08(r0)
            X.HLF r14 = X.AnonymousClass3ZC.A01(r12)
            java.lang.String r22 = "DOVETAIL_OVERFLOW_MENU"
            r26 = 0
            r16 = r11
            r17 = r11
            r18 = r11
            r19 = r11
            r20 = r11
            r21 = r11
            r23 = r11
            r24 = r11
            r25 = r11
            r27 = r26
            r10.Da6(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0038
        L_0x0092:
            X.4DH r3 = r0.A07
            androidx.fragment.app.FragmentActivity r7 = r3.requireActivity()
            com.instagram.common.session.UserSession r5 = r0.A0A
            X.0gy r8 = X.AnonymousClass07i.A00(r3)
            java.lang.String r10 = r1.A2n()
            X.1Xy r0 = r1.A0C
            X.DTk r4 = r0.BFp()
            if (r4 == 0) goto L_0x0230
            r0 = 3961(0xf79, float:5.55E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r4.getId()
            java.lang.String r0 = X.002.A0R(r3, r0)
            java.lang.String r9 = X.LQM.A02(r0)
            X.0qQ.A07(r9)
            X.FYp r0 = X.C50334FYp.A00(r5)
            if (r10 == 0) goto L_0x022b
            X.KTi r6 = new X.KTi
            r6.<init>(r7, r5, r1, r9)
            com.instagram.common.session.UserSession r5 = r0.A00
            r4 = 0
            X.0qQ.A0B(r5, r4)
            X.1NY r3 = X.AnonymousClass7TG.A0a(r5)
            java.lang.Object[] r1 = new java.lang.Object[]{r9}
            java.lang.String r0 = "igtv/series/%s/remove_episode/"
            r3.A0K(r0, r1)
            java.lang.String r0 = "media_id"
            r3.A9m(r0, r10)
            java.lang.Class<X.K1O> r1 = X.K1O.class
            java.lang.Class<X.LJ3> r0 = X.LJ3.class
            X.1OC r1 = X.DbT.A0R(r11, r3, r1, r0, r4)
            X.K1m r0 = new X.K1m
            r0.<init>(r5, r6)
            r1.A00 = r0
            X.1ES.A00(r7, r8, r1)
            goto L_0x0038
        L_0x00f6:
            X.4DH r5 = r0.A07
            com.instagram.common.session.UserSession r3 = r0.A0A
            r0 = 1
            X.I72.A03(r4, r5, r3, r1, r0)
            goto L_0x0038
        L_0x0100:
            r3 = 4
            X.I9G r4 = new X.I9G
            r4.<init>(r3, r12, r0)
            X.4DH r3 = r0.A07
            com.instagram.common.session.UserSession r0 = r0.A0A
            X.C55029Hb0.A00(r4, r3, r0, r1)
            goto L_0x0038
        L_0x010f:
            X.GOp r6 = X.C52345GOp.A00
            com.instagram.common.session.UserSession r9 = r0.A0A
            X.4DH r0 = r0.A07
            X.0gy r8 = X.AnonymousClass07i.A00(r0)
            java.lang.String r11 = "CLIPS_VIEWER"
            r10 = r1
            r6.A0H(r7, r8, r9, r10, r11)
            goto L_0x0038
        L_0x0121:
            X.GHv r0 = r0.A0G
            r0.DQq(r11)
            goto L_0x0038
        L_0x0128:
            com.instagram.common.session.UserSession r14 = r0.A0A
            com.instagram.user.model.User r5 = r1.A2A(r14)
            if (r5 == 0) goto L_0x0038
            X.4DH r13 = r0.A07
            java.lang.String r17 = r1.getId()
            if (r17 == 0) goto L_0x0235
            r6 = 1
            X.Ias r3 = new X.Ias
            r3.<init>(r6, r1, r0)
            r0 = 4
            X.Kfe r1 = new X.Kfe
            r1.<init>(r0, r3, r4)
            androidx.fragment.app.FragmentActivity r12 = r13.requireActivity()
            X.TpH r15 = X.C14068TpH.POST
            X.UzD r16 = X.C16677UzD.MEDIA
            X.OcF r0 = X.ORV.A01(r12, r13, r14, r15, r16, r17)
            r0.A01 = r5
            r0.A07(r1)
            X.C71093OcF.A00(r11, r0)
            goto L_0x0038
        L_0x015a:
            X.4DU r6 = r0.A0B
            X.4DH r3 = r0.A07
            androidx.fragment.app.FragmentActivity r4 = r3.requireActivity()
            com.instagram.common.session.UserSession r7 = r0.A0A
            boolean r0 = X.C52345GOp.A0C(r7, r1)
            if (r0 == 0) goto L_0x0038
            X.28D r5 = X.28D.A2p
            r8 = r1
            r9 = r11
            X.C250563lf.A0U(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0038
        L_0x0173:
            X.GCg r1 = r0.A0H
            X.HNR r0 = X.HNR.A1H
        L_0x0177:
            r1.A0D(r0)
            goto L_0x0038
        L_0x017c:
            X.4DH r3 = r0.A07
            com.instagram.common.session.UserSession r0 = r0.A0A
            X.I72.A02(r4, r3, r0, r1)
            goto L_0x0038
        L_0x0185:
            com.instagram.common.session.UserSession r5 = r0.A0A
            X.HNQ r4 = X.C56319HwW.A00(r1)
            if (r4 == 0) goto L_0x0038
            X.4DH r3 = r0.A07
            java.lang.String r0 = "CLIPS_VIEWER"
            X.C56319HwW.A01(r3, r5, r1, r4, r0)
            goto L_0x0038
        L_0x0196:
            com.instagram.common.session.UserSession r4 = r0.A0A
            X.4DH r3 = r0.A07
            java.lang.String r0 = "CLIPS_VIEWER"
            X.I72.A07(r3, r4, r1, r0)
            goto L_0x0038
        L_0x01a1:
            X.4DH r3 = r0.A07
            androidx.fragment.app.FragmentActivity r5 = r3.requireActivity()
            com.instagram.common.session.UserSession r4 = r0.A0A
            X.93U r0 = r0.A0D
            java.lang.String r3 = r0.getSessionId()
            java.lang.String r0 = r1.getId()
            if (r0 == 0) goto L_0x023a
            X.I72.A04(r5, r4, r1, r3, r0)
            goto L_0x0038
        L_0x01ba:
            X.4DH r1 = r0.A07
            com.instagram.common.session.UserSession r5 = r0.A0A
            r8 = 0
            androidx.fragment.app.FragmentActivity r4 = r1.requireActivity()
            X.2EG r6 = X.2EG.A0X
            r0 = 156(0x9c, float:2.19E-43)
            java.lang.String r7 = X.AnonymousClass000.A00(r0)
            X.SUL r3 = new X.SUL
            r3.<init>(r4, r5, r6, r7, r8)
            X.DbW.A1J(r1, r3)
            goto L_0x0038
        L_0x01d5:
            com.instagram.common.session.UserSession r4 = r0.A0A
            X.4DU r3 = r0.A0B
            X.93U r0 = r0.A0D
            java.lang.String r0 = r0.getSessionId()
            X.I72.A01(r7, r4, r1, r3, r0)
            goto L_0x0038
        L_0x01e4:
            com.instagram.common.session.UserSession r3 = r0.A0A
            X.4DU r0 = r0.A0B
            X.I72.A00(r7, r0, r3, r1, r11)
            goto L_0x0038
        L_0x01ed:
            X.4DH r5 = r0.A07
            com.instagram.common.session.UserSession r4 = r0.A0A
            java.lang.String r9 = r1.getId()
            if (r9 == 0) goto L_0x023f
            X.4DU r3 = r0.A0B
            r0 = 1446(0x5a6, float:2.026E-42)
            java.lang.String r10 = X.AnonymousClass000.A00(r0)
            r6 = r3
            r7 = r4
            r8 = r1
            X.I72.A06(r5, r6, r7, r8, r9, r10)
            goto L_0x0038
        L_0x0207:
            X.4DH r5 = r0.A07
            com.instagram.common.session.UserSession r4 = r0.A0A
            java.lang.String r9 = r1.getId()
            if (r9 == 0) goto L_0x0244
            X.4DU r3 = r0.A0B
            r0 = 1446(0x5a6, float:2.026E-42)
            java.lang.String r10 = X.AnonymousClass000.A00(r0)
            r6 = r3
            r7 = r4
            r8 = r1
            X.I72.A05(r5, r6, r7, r8, r9, r10)
            goto L_0x0038
        L_0x0221:
            java.lang.String r0 = "clipsItem"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x022b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r6)
            throw r0
        L_0x0230:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r6)
            throw r0
        L_0x0235:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r6)
            throw r0
        L_0x023a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r6)
            throw r0
        L_0x023f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r6)
            throw r0
        L_0x0244:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r6)
            throw r0
        L_0x0249:
            r0 = 241230142(0xe60e13e, float:2.7718582E-30)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r8 = r6.A06
            X.HqX r8 = (X.C55966HqX) r8
            X.310 r7 = r8.A01
            X.324 r4 = r7.BQk()
            java.lang.Object r3 = r6.A03
            X.1Xj r3 = (X.1Xj) r3
            java.lang.Object r2 = r6.A04
            X.3W1 r2 = (X.AnonymousClass3W1) r2
            java.lang.Object r0 = r6.A05
            X.3ha r0 = (X.C248203ha) r0
            int r1 = r0.A01
            X.324 r0 = r7.BQk()
            X.JQg r0 = r0.CBn()
            r4.DgX(r3, r2, r0, r1)
            X.2f5 r0 = r8.A03
            boolean r1 = r0.A0O(r3)
            java.lang.Object r4 = r6.A02
            android.content.Context r4 = (android.content.Context) r4
            r0 = 2131975990(0x7f135f36, float:1.9589088E38)
            if (r1 == 0) goto L_0x0285
            r0 = 2131952456(0x7f130348, float:1.9541355E38)
        L_0x0285:
            java.lang.String r3 = X.C51967G9n.A0p(r4, r0)
            java.lang.Object r2 = r6.A01
            android.view.View r2 = (android.view.View) r2
            r0 = 750(0x2ee, double:3.705E-321)
            X.2eQ.A06(r2, r0)
            X.C59689JTv.A09(r4, r3)
            r0 = 1840866817(0x6db96601, float:7.172255E27)
            goto L_0x02bc
        L_0x0299:
            r0 = -1136173242(0xffffffffbc475f46, float:-0.012168711)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r6.A01
            X.0lg r0 = (X.0lg) r0
            X.3Kz r0 = X.C240443Kx.A00(r0)
            r4 = 0
            r0.Eaj(r4)
            java.lang.Object r2 = r6.A04
            if (r2 == 0) goto L_0x02c0
            java.lang.Object r1 = r6.A02
            X.0sL r1 = (X.0sL) r1
            java.lang.Object r0 = r6.A05
            r1.invoke(r2, r0)
        L_0x02b9:
            r0 = -673394758(0xffffffffd7dccfba, float:-4.85569474E14)
        L_0x02bc:
            X.AnonymousClass0fD.A0C(r0, r5)
            return
        L_0x02c0:
            java.lang.Object r3 = r6.A03
            X.0sJ r3 = (X.0sJ) r3
            java.lang.Object r2 = r6.A06
            java.lang.Boolean r1 = X.AnonymousClass7TE.A0u()
            r0 = 1206(0x4b6, float:1.69E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.invoke(r2, r0, r4, r1)
            goto L_0x02b9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ICZ.onClick(android.view.View):void");
    }
}
