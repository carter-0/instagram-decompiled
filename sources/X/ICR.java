package X;

import android.view.View;

public final class ICR implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public ICR(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A03 = obj4;
        this.A04 = obj5;
        this.A05 = obj3;
        this.A02 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d3, code lost:
        if (r2 == X.AnonymousClass3W9.A05) goto L_0x00d5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r14) {
        /*
            r13 = this;
            int r0 = r13.A00
            switch(r0) {
                case 0: goto L_0x01ba;
                case 1: goto L_0x0182;
                case 2: goto L_0x0116;
                case 3: goto L_0x00b5;
                case 4: goto L_0x0092;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 1944487254(0x73e68556, float:3.6527486E31)
            int r1 = X.AnonymousClass0fD.A05(r0)
            X.Hmu r2 = X.GBU.A04
            if (r2 == 0) goto L_0x002e
            int r0 = X.GBU.A03
            int r4 = r0 + -1
            int r0 = r2.A00
            if (r4 <= r0) goto L_0x0071
            r2.A00 = r4
        L_0x001a:
            X.0wc r2 = r2.A01
            java.lang.String r0 = "suggested_creator_shuffle_button_tapped"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r2, r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.String r0 = "position"
            r3.A8k(r0, r2)
            r3.Cgf()
        L_0x002e:
            java.lang.Object r6 = r13.A03
            X.HJs r6 = (X.C54583HJs) r6
            X.6lL r0 = r6.A00
            r5 = 1
            X.61R r0 = r0.A09
            if (r0 == 0) goto L_0x003f
            r0.EFJ(r5)
            r0.E2p()
        L_0x003f:
            X.HtK r0 = X.GBU.A05
            if (r0 == 0) goto L_0x0054
            X.Ib7 r4 = r0.A02
            if (r4 == 0) goto L_0x0054
            X.Tol r3 = r4.A01
            if (r3 == 0) goto L_0x0051
            r2 = 0
            java.lang.String r0 = "preview_end"
            r3.A0D(r0, r2)
        L_0x0051:
            X.C57463Ib7.A01(r4, r5)
        L_0x0054:
            X.HtK r0 = X.GBU.A05
            if (r0 == 0) goto L_0x005b
            r0.A00()
        L_0x005b:
            java.util.ArrayList r0 = X.GBU.A0C
            java.util.Iterator r2 = X.AnonymousClass7TE.A1G(r0)
        L_0x0061:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0073
            java.lang.Object r0 = X.AnonymousClass7TF.A0a(r2)
            X.1O8 r0 = (X.AnonymousClass1O8) r0
            r0.A00()
            goto L_0x0061
        L_0x0071:
            r4 = -1
            goto L_0x001a
        L_0x0073:
            X.I6n r5 = X.GBU.A0B
            r8 = 0
            X.GBU.A07 = r8
            X.GBU.A06 = r8
            java.lang.Object r7 = r13.A04
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r4 = r13.A05
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.Object r3 = r13.A02
            X.0iw r3 = (X.AnonymousClass0iw) r3
            java.lang.Object r2 = r13.A01
            android.app.Activity r2 = (android.app.Activity) r2
            X.C56658I6n.A02(r2, r3, r4, r5, r6, r7, r8)
            r0 = -610669900(0xffffffffdb99eab4, float:-8.6647461E16)
            goto L_0x021b
        L_0x0092:
            r0 = -321890334(0xffffffffecd057e2, float:-2.0149727E27)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r13.A05
            X.GCb r5 = (X.C52029GCb) r5
            java.lang.Object r4 = r13.A02
            X.1Xj r4 = (X.1Xj) r4
            java.lang.Object r3 = r13.A04
            X.3W1 r3 = (X.AnonymousClass3W1) r3
            java.lang.Object r2 = r13.A01
            com.instagram.feed.media.EffectPreviewIntf r2 = (com.instagram.feed.media.EffectPreviewIntf) r2
            java.lang.Object r0 = r13.A03
            X.8ZN r0 = (X.AnonymousClass8ZN) r0
            X.C52029GCb.A06(r0, r2, r4, r3, r5)
            r0 = 1995626962(0x76f2d9d2, float:2.4628003E33)
            goto L_0x021b
        L_0x00b5:
            r0 = 562943880(0x218dd788, float:9.611582E-19)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r13.A02
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.Object r5 = r13.A03
            X.1Xj r5 = (X.1Xj) r5
            boolean r0 = X.AnonymousClass3WP.A08(r4, r5)
            if (r0 == 0) goto L_0x00f7
            java.lang.Object r2 = r13.A05
            X.3W9 r0 = X.AnonymousClass3W9.Translated
            if (r2 == r0) goto L_0x00d5
            X.3W9 r0 = X.AnonymousClass3W9.PartiallyTranslated
            r8 = 0
            if (r2 != r0) goto L_0x00d6
        L_0x00d5:
            r8 = 1
        L_0x00d6:
            java.lang.Object r3 = r13.A01
            X.0iw r3 = (X.AnonymousClass0iw) r3
            if (r8 == 0) goto L_0x0113
            X.GKd r2 = X.C52236GKd.A0P
        L_0x00de:
            java.lang.String r0 = X.C51966G9m.A1D(r5)
            java.lang.String r6 = X.AnonymousClass3WP.A01(r0)
            if (r8 == 0) goto L_0x0110
            java.lang.String r7 = X.AnonymousClass3WP.A00(r4, r5)
        L_0x00ec:
            boolean r9 = X.AnonymousClass3WS.A06(r4)
            boolean r10 = X.AnonymousClass3WP.A07(r4)
            X.C52086GEg.A0B(r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x00f7:
            X.1Ng r4 = X.AnonymousClass1Nd.A00(r4)
            java.lang.Object r3 = r13.A05
            X.3W9 r3 = (X.AnonymousClass3W9) r3
            java.lang.Object r2 = r13.A04
            X.JOH r2 = (X.JOH) r2
            X.3Jx r0 = new X.3Jx
            r0.<init>(r5, r3, r2)
            r4.A00(r0)
            r0 = -128739768(0xfffffffff8539648, float:-1.716598E34)
            goto L_0x021b
        L_0x0110:
            java.lang.String r7 = ""
            goto L_0x00ec
        L_0x0113:
            X.GKd r2 = X.C52236GKd.A0Q
            goto L_0x00de
        L_0x0116:
            r0 = -30761053(0xfffffffffe2a9fa3, float:-5.669941E37)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r13.A04
            X.N4R r0 = (X.N4R) r0
            r3 = 1
            if (r0 == 0) goto L_0x013e
            java.lang.Object r0 = r0.A02
            X.4Ke r0 = (X.AnonymousClass4Ke) r0
            if (r0 == 0) goto L_0x013e
            boolean r0 = r0.A05
            if (r0 != r3) goto L_0x013e
            java.lang.Object r2 = r13.A01
            X.3Wa r2 = (X.C242813Wa) r2
            java.lang.Object r0 = r13.A02
            X.1Xj r0 = (X.1Xj) r0
            r2.D3d(r0, r3)
        L_0x0139:
            r0 = 474195053(0x1c43a46d, float:6.4732603E-22)
            goto L_0x021b
        L_0x013e:
            java.lang.Object r6 = r13.A02
            X.1Xj r6 = (X.1Xj) r6
            com.instagram.api.schemas.OriginalSoundDataIntf r0 = r6.A1J()
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            java.lang.Object r5 = r13.A01
            X.3Wa r5 = (X.C242813Wa) r5
            java.lang.Object r4 = r13.A03
            X.3W1 r4 = (X.AnonymousClass3W1) r4
            X.8ZN r3 = X.AnonymousClass8ZN.MUSIC_IN_FEED
            if (r0 == 0) goto L_0x016d
            X.1sP r0 = X.DA2.A00()
            X.5nz r2 = new X.5nz
            r2.<init>(r0)
            com.instagram.api.schemas.OriginalSoundDataIntf r0 = r6.A1J()
            r2.A09 = r0
            X.1sP r0 = r2.A00()
        L_0x0169:
            r5.D3b(r3, r0, r6, r4)
            goto L_0x0139
        L_0x016d:
            X.3ZH r0 = r6.A1Y()
            com.instagram.api.schemas.MusicInfo r2 = X.C51976G9y.A0F(r0)
            java.lang.Object r0 = r13.A05
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.1E5 r0 = X.1E4.A00(r0)
            X.1sP r0 = X.HWN.A00(r0, r2)
            goto L_0x0169
        L_0x0182:
            r0 = -1640720960(0xffffffff9e3495c0, float:-9.560088E-21)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r13.A05
            X.0lg r4 = (X.0lg) r4
            X.0Tu r0 = X.0Tu.A05
            r2 = 36331175601521602(0x811303000043c2, double:3.0393199720794874E-306)
            boolean r0 = X.182.A06(r0, r4, r2)
            if (r0 != 0) goto L_0x01a9
            java.lang.Object r2 = r13.A01
            X.WW4 r2 = (X.WW4) r2
            java.lang.Object r0 = r13.A04
            X.GSn r0 = (X.C52435GSn) r0
            X.1Xj r0 = r0.BPf()
            r2.DJ3(r0)
        L_0x01a9:
            java.lang.Object r3 = r13.A03
            X.GWn r3 = (X.C52536GWn) r3
            java.lang.Object r2 = r13.A02
            X.4DU r2 = (X.AnonymousClass4DU) r2
            java.lang.String r0 = "explore_grid_hidden_media_tap"
            r3.A01(r2, r0)
            r0 = -1155783513(0xffffffffbb1c24a7, float:-0.0023825557)
            goto L_0x021b
        L_0x01ba:
            r0 = -1497306150(0xffffffffa6c0ebda, float:-1.3386604E-15)
            int r1 = X.AnonymousClass0fD.A05(r0)
            X.Sto r4 = X.C51965G9l.A0g()
            java.lang.Object r8 = r13.A05
            X.QEW r8 = (X.QEW) r8
            com.facebookpay.logging.LoggingContext r3 = r8.A03
            java.lang.Object r7 = r13.A02
            com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem r7 = (com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem) r7
            java.lang.String r0 = r7.A0A
            java.lang.Long r2 = X.DbV.A0q(r0)
            r0 = 0
            r4.A0L(r3, r2, r0)
            java.lang.Object r0 = r13.A01
            android.content.Context r0 = (android.content.Context) r0
            X.0qQ.A0A(r0)
            java.lang.Object r10 = r13.A04
            java.lang.Object r9 = r13.A03
            r6 = 11
            X.IoC r5 = new X.IoC
            r5.<init>(r6, r7, r8, r9, r10)
            r2 = 25
            X.TVw r4 = new X.TVw
            r4.<init>(r2, r7, r8)
            r11 = 0
            r12 = 2
            X.SIG r3 = X.AnonymousClass2E0.A0H()
            r7 = 2131961312(0x7f1325e0, float:1.9559317E38)
            r8 = 2131961311(0x7f1325df, float:1.9559315E38)
            r9 = 2131961310(0x7f1325de, float:1.9559313E38)
            r10 = 2131961303(0x7f1325d7, float:1.95593E38)
            X.I8z r5 = X.C56719I8z.A00(r5, r11)
            r2 = 1
            X.I8z r6 = X.C56719I8z.A00(r4, r2)
            X.SOk r2 = X.SA0.A00(r5, r6, r7, r8, r9, r10, r11, r12)
            android.app.Dialog r0 = r3.A01(r0, r2)
            X.AnonymousClass0fN.A00(r0)
            r0 = 1140452697(0x43f9ed59, float:499.85428)
        L_0x021b:
            X.AnonymousClass0fD.A0C(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ICR.onClick(android.view.View):void");
    }
}
