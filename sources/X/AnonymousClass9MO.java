package X;

/* renamed from: X.9MO  reason: invalid class name */
public final class AnonymousClass9MO extends 0Yg implements 0sL {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9MO(int i, Object obj, Object obj2, Object obj3, boolean z) {
        super(2);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A04 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0048, code lost:
        return new X.C246263eI(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00fe, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r26, java.lang.Object r27) {
        /*
            r25 = this;
            r2 = r25
            r3 = r26
            r5 = r27
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x00e6;
                case 1: goto L_0x00ce;
                case 2: goto L_0x005d;
                default: goto L_0x000b;
            }
        L_0x000b:
            r0 = 1
            X.0qQ.A0B(r5, r0)
            java.lang.Object r0 = r2.A02
            X.0sP r0 = (X.0sP) r0
            java.lang.Object r0 = r0.invoke(r5)
            X.3ey r0 = (X.C246663ey) r0
            com.instagram.feed.widget.IgProgressImageView r6 = r0.A00()
            X.3VF r0 = r0.A0A
            X.3V9 r5 = r0.A01
            if (r5 == 0) goto L_0x02ea
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x003c
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r6.getIgImageView()
            boolean r0 = r0.A0G()
            if (r0 == 0) goto L_0x0049
            java.lang.Object r1 = r2.A03
            X.3et r1 = (X.C246613et) r1
            java.lang.Object r0 = r2.A01
            android.content.Context r0 = (android.content.Context) r0
            X.C247013fd.A01(r0, r1, r6, r5)
        L_0x003c:
            r0 = 43
            X.Inq r1 = new X.Inq
            r1.<init>(r0, r6, r5)
        L_0x0043:
            X.3eI r0 = new X.3eI
            r0.<init>(r1)
            return r0
        L_0x0049:
            r4 = 2131435563(0x7f0b202b, float:1.8492972E38)
            java.lang.Object r3 = r2.A03
            X.3et r3 = (X.C246613et) r3
            java.lang.Object r1 = r2.A01
            android.content.Context r1 = (android.content.Context) r1
            X.5mZ r0 = new X.5mZ
            r0.<init>(r1, r3, r6, r5)
            r6.A0A(r0, r4)
            goto L_0x003c
        L_0x005d:
            com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer r5 = (com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer) r5
            r0 = 1
            X.0qQ.A0B(r5, r0)
            java.lang.Object r1 = r2.A03
            X.4b9 r1 = (X.C267214b9) r1
            X.3ey r0 = X.C267214b9.A04(r5, r1)
            com.instagram.ui.widget.framelayout.MediaFrameLayout r4 = r0.A01()
            com.instagram.feed.widget.IgProgressImageView r10 = r0.A00()
            X.3et r8 = r1.A03
            float r0 = r8.A00
            r4.A00 = r0
            X.4DU r6 = r1.A02
            java.lang.Object r7 = r2.A01
            X.3fX r7 = (X.C246953fX) r7
            boolean r12 = r2.A04
            X.3fB r9 = r1.A04
            java.lang.Object r11 = r2.A02
            X.0sa r11 = (X.C62320sa) r11
            X.C247013fd.A0A(r6, r7, r8, r9, r10, r11, r12)
            X.3ey r2 = X.C267214b9.A04(r5, r1)
            r5 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r5)
            if (r0 == 0) goto L_0x00a2
            r1 = -858227447(0xffffffffccd87d09, float:-1.1350228E8)
            r0 = 775(0x307, float:1.086E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0fS.A01(r0, r1)
        L_0x00a2:
            X.3es r0 = r8.A0A     // Catch:{ all -> 0x02dc }
            X.0sP r0 = r0.A0J     // Catch:{ all -> 0x02dc }
            java.lang.Object r3 = r0.invoke(r2)     // Catch:{ all -> 0x02dc }
            X.3rY r3 = (X.C253873rY) r3     // Catch:{ all -> 0x02dc }
            com.instagram.ui.widget.framelayout.MediaFrameLayout r2 = r2.A01()     // Catch:{ all -> 0x02dc }
            r1 = 4
            X.IDm r0 = new X.IDm     // Catch:{ all -> 0x02dc }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x02dc }
            r2.setOnTouchListener(r0)     // Catch:{ all -> 0x02dc }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r5)
            if (r0 == 0) goto L_0x00c5
            r0 = -1976197178(0xffffffff8a359fc6, float:-8.744883E-33)
            X.0fS.A00(r0)
        L_0x00c5:
            r0 = 41
            X.Inq r1 = new X.Inq
            r1.<init>(r0, r10, r4)
            goto L_0x0043
        L_0x00ce:
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            java.lang.Object r4 = r2.A01
            X.3Wa r4 = (X.C242813Wa) r4
            java.lang.Object r3 = r2.A02
            X.1Xj r3 = (X.1Xj) r3
            java.lang.Object r1 = r2.A03
            X.3W1 r1 = (X.AnonymousClass3W1) r1
            boolean r0 = r2.A04
            r4.D2P(r3, r1, r5, r0)
            goto L_0x00fc
        L_0x00e6:
            X.5Wy r3 = (X.C286575Wy) r3
            java.lang.Number r5 = (java.lang.Number) r5
            int r0 = r5.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L_0x00ff
            boolean r0 = r3.Bwn()
            if (r0 == 0) goto L_0x00ff
            r3.Evl()
        L_0x00fc:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x00ff:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x010d
            r1 = -2011396973(0xffffffff881c8493, float:-4.7100383E-34)
            java.lang.String r0 = "com.instagram.feed.tifu.ui.Header.<anonymous> (TifuUnit.kt:192)"
            X.0fL.A01(r1, r0)
        L_0x010d:
            X.5Zp r1 = X.C287215Zl.A04
            java.lang.Object r9 = r2.A01
            X.0sa r9 = (X.C62320sa) r9
            boolean r0 = r2.A04
            r18 = r0
            java.lang.Object r0 = r2.A02
            r21 = r0
            java.lang.Object r14 = r2.A03
            X.5vX r14 = (X.AnonymousClass5vX) r14
            X.5Qk r7 = androidx.compose.ui.Modifier.A00
            X.5Zu r13 = X.C287275Zs.A01
            X.5RD r8 = X.C287395a4.A01(r13, r3, r1)
            r2 = 0
            int r6 = X.C287425a7.A00(r3)
            r1 = r3
            X.5Wx r1 = (X.C286565Wx) r1
            X.5RM r5 = X.C286565Wx.A04(r1)
            androidx.compose.ui.Modifier r4 = X.C287435a8.A01(r3, r7)
            X.0sa r12 = X.C287485aD.A00
            r3.ExX()
            boolean r0 = r1.A0K
            if (r0 == 0) goto L_0x02c8
            r3.AMT(r12)
        L_0x0143:
            X.0sL r11 = X.C287485aD.A03
            X.C287595aO.A00(r3, r8, r11)
            X.0sL r10 = X.C287485aD.A05
            X.C287595aO.A00(r3, r5, r10)
            X.0sL r8 = X.C287485aD.A02
            boolean r0 = r1.A0K
            if (r0 != 0) goto L_0x0161
            java.lang.Object r5 = r3.ECw()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 != 0) goto L_0x016b
        L_0x0161:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r3.FLL(r0)
            r3.ABr(r0, r8)
        L_0x016b:
            X.0sL r6 = X.C287485aD.A04
            X.C287595aO.A00(r3, r4, r6)
            r0 = -240003703(0xfffffffff1b1d589, float:-1.7611838E30)
            r3.ExS(r0)
            java.lang.Object r4 = r3.ECw()
            java.lang.Object r5 = X.AnonymousClass5XT.A00
            if (r4 != r5) goto L_0x0186
            X.5aS r4 = new X.5aS
            r4.<init>()
            r3.FLL(r4)
        L_0x0186:
            X.5aT r4 = (X.C287605aT) r4
            X.C286565Wx.A0L(r1, r2)
            r19 = 0
            r0 = -239998074(0xfffffffff1b1eb86, float:-1.7620345E30)
            r3.ExS(r0)
            boolean r15 = r3.AGu(r9)
            java.lang.Object r0 = r3.ECw()
            if (r15 != 0) goto L_0x019f
            if (r0 != r5) goto L_0x01a9
        L_0x019f:
            r15 = 16
            X.9Kz r0 = new X.9Kz
            r0.<init>(r9, r15)
            r3.FLL(r0)
        L_0x01a9:
            X.0sa r0 = (X.C62320sa) r0
            X.C286565Wx.A0L(r1, r2)
            r17 = 1
            androidx.compose.ui.Modifier r15 = X.C287635aW.A04(r4, r7, r0)
            r4 = 0
            if (r18 == 0) goto L_0x01b9
            r4 = 1098907648(0x41800000, float:16.0)
        L_0x01b9:
            r0 = 0
            androidx.compose.ui.Modifier r0 = X.C287195Zj.A0B(r15, r0, r0, r4, r0)
            X.5Zp r4 = X.C287215Zl.A05
            X.5RD r15 = X.C287395a4.A02(r13, r3, r4, r2)
            int r16 = X.C287425a7.A00(r3)
            X.5RM r13 = X.C286565Wx.A04(r1)
            androidx.compose.ui.Modifier r4 = X.C287435a8.A01(r3, r0)
            r3.ExX()
            boolean r0 = r1.A0K
            if (r0 == 0) goto L_0x02c3
            r3.AMT(r12)
        L_0x01da:
            X.C287595aO.A00(r3, r15, r11)
            X.C287595aO.A00(r3, r13, r10)
            boolean r0 = r1.A0K
            if (r0 != 0) goto L_0x01f2
            java.lang.Object r10 = r3.ECw()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            boolean r0 = X.0qQ.A0K(r10, r0)
            if (r0 != 0) goto L_0x01fc
        L_0x01f2:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            r3.FLL(r0)
            r3.ABr(r0, r8)
        L_0x01fc:
            X.C287595aO.A00(r3, r4, r6)
            java.lang.Integer r0 = r14.A02
            int r4 = r0.intValue()
            if (r4 == r2) goto L_0x02a3
            r0 = r17
            if (r4 != r0) goto L_0x02cd
            r0 = 773811384(0x2e1f6cb8, float:3.6248976E-11)
            r3.ExS(r0)
            boolean r0 = r14.A09
            if (r0 == 0) goto L_0x0298
            r0 = 773813168(0x2e1f73b0, float:3.6255166E-11)
            r3.ExS(r0)
            r0 = 2131975409(0x7f135cf1, float:1.958791E38)
        L_0x021e:
            java.lang.String r13 = X.C288035bG.A00(r3, r0)
            X.C286565Wx.A0L(r1, r2)
            X.C286565Wx.A0L(r1, r2)
            X.6CB r12 = X.AnonymousClass6CA.A01(r3)
            X.6CD r11 = X.AnonymousClass6CD.SMALL
            r15 = 1572864(0x180000, float:2.204052E-39)
            r16 = 412(0x19c, float:5.77E-43)
            r10 = r3
            r14 = r9
            X.AnonymousClass6CE.A08(r10, r11, r12, r13, r14, r15, r16)
            r3.ASN()
            r0 = -239965104(0xfffffffff1b26c50, float:-1.7670168E30)
            r3.ExS(r0)
            if (r18 == 0) goto L_0x0284
            r0 = 2131238568(0x7f081ea8, float:1.8093418E38)
            X.2DO r18 = X.C287975bA.A00(r3, r0, r2)
            r0 = 2131975372(0x7f135ccc, float:1.9587834E38)
            java.lang.String r20 = X.C288035bG.A00(r3, r0)
            r0 = -239955491(0xfffffffff1b291dd, float:-1.7684694E30)
            r3.ExS(r0)
            r0 = r21
            boolean r0 = r3.AGu(r0)
            java.lang.Object r4 = r3.ECw()
            if (r0 != 0) goto L_0x0264
            if (r4 != r5) goto L_0x0270
        L_0x0264:
            r5 = 17
            X.9Kz r4 = new X.9Kz
            r0 = r21
            r4.<init>(r0, r5)
            r3.FLL(r4)
        L_0x0270:
            X.0sa r4 = (X.C62320sa) r4
            X.C286565Wx.A0L(r1, r2)
            androidx.compose.ui.Modifier r17 = X.C288235ba.A04(r3, r7, r4)
            r23 = 0
            r22 = 24
            r16 = r3
            r21 = r2
            X.C288165bT.A06(r16, r17, r18, r19, r20, r21, r22, r23)
        L_0x0284:
            X.C286565Wx.A0L(r1, r2)
            r3.ASN()
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00fc
            r0 = -1825885029(0xffffffff932b349b, float:-2.160917E-27)
            X.0fL.A00(r0)
            goto L_0x00fc
        L_0x0298:
            r0 = 773815817(0x2e1f7e09, float:3.6264356E-11)
            r3.ExS(r0)
            r0 = 2131975370(0x7f135cca, float:1.958783E38)
            goto L_0x021e
        L_0x02a3:
            r0 = 773802934(0x2e1f4bb6, float:3.621966E-11)
            r3.ExS(r0)
            boolean r0 = r14.A09
            if (r0 == 0) goto L_0x02b8
            r0 = 773804719(0x2e1f52af, float:3.6225852E-11)
            r3.ExS(r0)
            r0 = 2131975408(0x7f135cf0, float:1.9587907E38)
            goto L_0x021e
        L_0x02b8:
            r0 = 773807336(0x2e1f5ce8, float:3.623493E-11)
            r3.ExS(r0)
            r0 = 2131975368(0x7f135cc8, float:1.9587826E38)
            goto L_0x021e
        L_0x02c3:
            r3.FMk()
            goto L_0x01da
        L_0x02c8:
            r3.FMk()
            goto L_0x0143
        L_0x02cd:
            r0 = 773799816(0x2e1f3f88, float:3.620884E-11)
            r3.ExS(r0)
            X.C286565Wx.A0L(r1, r2)
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x02dc:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r5)
            if (r0 == 0) goto L_0x02f1
            r0 = -2057668240(0xffffffff855a7970, float:-1.0272615E-35)
            X.0fS.A00(r0)
            throw r1
        L_0x02ea:
            java.lang.String r0 = "tag indicator holder should not be null"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
        L_0x02f1:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9MO.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
