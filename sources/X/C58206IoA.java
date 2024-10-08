package X;

/* renamed from: X.IoA  reason: case insensitive filesystem */
public final class C58206IoA extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58206IoA(int i, Object obj, Object obj2, Object obj3, boolean z) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A04 = z;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x025e, code lost:
        if (r10.A04 == false) goto L_0x0260;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x028c, code lost:
        if (X.0qQ.A0K(r0.BvQ(), true) != false) goto L_0x0224;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0055, code lost:
        if (r0 != null) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010d, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0187, code lost:
        r2 = (X.C53844GvB) r10.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01b5, code lost:
        r4 = (X.C52462GTo) r10.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01ef, code lost:
        return X.C51965G9l.A0V(new X.GL3(r1, r2, r3, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0222, code lost:
        if (r0 != false) goto L_0x0260;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0224, code lost:
        r2 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x010e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x003c;
                case 1: goto L_0x0059;
                case 2: goto L_0x006f;
                case 3: goto L_0x0096;
                case 4: goto L_0x014a;
                case 5: goto L_0x0183;
                case 6: goto L_0x01b1;
                case 7: goto L_0x01f0;
                case 8: goto L_0x0204;
                case 9: goto L_0x00b0;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r10.A01
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            X.3W8 r0 = r0.A3Z
            java.lang.Object r0 = r0.A00
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 == 0) goto L_0x0023
            java.lang.Object r1 = r10.A03
            X.3Y5 r1 = (X.AnonymousClass3Y5) r1
            r0 = 2131165248(0x7f070040, float:1.7944708E38)
        L_0x001a:
            long r0 = X.C244013aV.A0C(r1, r0)
        L_0x001e:
            X.2Wd r4 = X.C51965G9l.A0e(r0)
        L_0x0022:
            return r4
        L_0x0023:
            boolean r0 = r10.A04
            if (r0 != 0) goto L_0x0034
            java.lang.Object r0 = r10.A02
            boolean r0 = X.C51972G9s.A1a(r0)
            if (r0 != 0) goto L_0x0034
            long r0 = X.C51969G9p.A0D()
            goto L_0x001e
        L_0x0034:
            java.lang.Object r1 = r10.A03
            X.3Y5 r1 = (X.AnonymousClass3Y5) r1
            r0 = 2131165207(0x7f070017, float:1.7944625E38)
            goto L_0x001a
        L_0x003c:
            java.lang.Object r0 = r10.A01
            X.5V6 r0 = (X.AnonymousClass5V6) r0
            X.5V5 r0 = (X.AnonymousClass5V5) r0
            r1 = 0
            android.view.View r0 = r0.A00
            r0.performHapticFeedback(r1)
            java.lang.Object r1 = r10.A03
            X.5Oz r1 = (X.C284945Oz) r1
            boolean r0 = r10.A04
            X.C51967G9n.A16(r1, r0)
            java.lang.Object r0 = r10.A02
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x010b
            goto L_0x0108
        L_0x0059:
            java.lang.Object r0 = r10.A02
            X.DbS.A1U(r0)
            boolean r0 = r10.A04
            if (r0 == 0) goto L_0x010b
            java.lang.Object r2 = r10.A01
            X.4Cq r2 = (X.C262224Cq) r2
            java.lang.Object r1 = r10.A03
            r0 = 21
            X.C51971G9r.A1Q(r1, r2, r0)
            goto L_0x010b
        L_0x006f:
            java.lang.Object r2 = r10.A03
            com.instagram.direct.visual.DirectVisualMessageViewerController r2 = (com.instagram.direct.visual.DirectVisualMessageViewerController) r2
            com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams r3 = r2.A0q
            java.lang.Object r0 = r10.A02
            X.OW6 r0 = (X.OW6) r0
            X.N3h r0 = r0.A00()
            boolean r0 = r0.A0V
            if (r0 == 0) goto L_0x010b
            java.lang.Object r0 = r10.A01
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r0 = (com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel) r0
            int r1 = r0.A00
            r0 = 2
            if (r1 != r0) goto L_0x010b
            if (r3 == 0) goto L_0x010b
            com.instagram.common.session.UserSession r2 = r2.A0m
            boolean r1 = r10.A04
            X.NmR r0 = X.C69483NmR.PHOTO_VIEWER
            X.C71137Odf.A04(r0, r2, r3, r1)
            goto L_0x010b
        L_0x0096:
            boolean r0 = r10.A04
            if (r0 != 0) goto L_0x010b
            java.lang.Object r3 = r10.A01
            X.JOX r3 = (X.JOX) r3
            java.lang.Object r0 = r10.A02
            X.GqU r0 = (X.C53558GqU) r0
            X.MXa r2 = r0.A02
            java.lang.String r1 = r0.A03
            java.lang.Object r0 = r10.A03
            X.N47 r0 = (X.N47) r0
            java.lang.String r0 = r0.A04
            r3.Dww(r2, r1, r0)
            goto L_0x010b
        L_0x00b0:
            java.lang.Object r4 = r10.A03
            X.GIn r4 = (X.C52196GIn) r4
            boolean r3 = r10.A04
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.util.List r0 = r4.A00
            X.4bN r2 = X.C52196GIn.A00(r4, r0, r1)
            boolean r0 = X.DbT.A1b(r1)
            if (r0 == 0) goto L_0x00e3
            java.util.List r0 = r4.A00
            if (r0 == 0) goto L_0x00cd
            r0.removeAll(r1)
        L_0x00cd:
            java.util.Iterator r6 = r1.iterator()
        L_0x00d1:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00e3
            X.1Xj r5 = X.C51966G9m.A0t(r6)
            X.93F r1 = r4.A09
            X.93C r0 = r4.A0A
            r1.EE4(r5, r0)
            goto L_0x00d1
        L_0x00e3:
            com.instagram.common.session.UserSession r6 = r4.A08
            X.0Tu r5 = X.0Tu.A05
            r0 = 36323427480841372(0x810bf700052c9c, double:3.034420029362132E-306)
            boolean r0 = X.182.A06(r5, r6, r0)
            if (r0 == 0) goto L_0x0111
            if (r3 == 0) goto L_0x0111
            X.GD6 r0 = r4.A0D
            X.GBg r0 = r0.A0A
            boolean r0 = r0.A0Z()
            if (r0 == 0) goto L_0x0111
        L_0x00fe:
            r0 = 0
        L_0x00ff:
            r4 = 0
            if (r0 == 0) goto L_0x010e
            java.lang.Object r0 = r10.A02
        L_0x0104:
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x0022
        L_0x0108:
            r0.invoke()
        L_0x010b:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x010e:
            java.lang.Object r0 = r10.A01
            goto L_0x0104
        L_0x0111:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            r0 = 36325918562465146(0x810e3b000e357a, double:3.0359953994117874E-306)
            boolean r0 = X.182.A06(r5, r6, r0)
            if (r0 == 0) goto L_0x012d
            if (r3 == 0) goto L_0x012d
            X.1Bh r0 = X.1Bh.A00()
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x012d
            goto L_0x00fe
        L_0x012d:
            r0 = 36325918562530683(0x810e3b000f357b, double:3.035995399453233E-306)
            boolean r0 = X.182.A06(r5, r6, r0)
            if (r0 == 0) goto L_0x0145
            if (r3 == 0) goto L_0x0145
            X.1Bh r0 = X.1Bh.A00()
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x0145
            goto L_0x00fe
        L_0x0145:
            boolean r0 = X.C52196GIn.A02(r2, r4, r3)
            goto L_0x00ff
        L_0x014a:
            java.lang.Object r0 = r10.A02
            X.3Y5 r0 = (X.AnonymousClass3Y5) r0
            boolean r1 = r10.A04
            java.lang.Object r4 = r10.A01
            X.HtX r4 = (X.C56145HtX) r4
            java.lang.Object r3 = r10.A03
            X.Gsx r3 = (X.C53706Gsx) r3
            X.2V1 r0 = r0.A05
            r5 = 0
            X.2Wb r2 = X.AnonymousClass7TG.A0S(r0)
            if (r1 == 0) goto L_0x016b
            X.HtS r1 = r3.A00
            X.GsN r0 = new X.GsN
            r0.<init>(r4, r1)
            r2.A00(r0)
        L_0x016b:
            X.0sP r1 = r3.A01
            X.HtS r0 = r3.A00
            java.lang.Object r0 = r1.invoke(r0)
            X.3mp r0 = (X.C251263mp) r0
            r2.A00(r0)
            r9 = 0
            java.util.List r8 = r2.A01
            X.2Tl r4 = new X.2Tl
            r6 = r5
            r7 = r5
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L_0x0183:
            boolean r5 = r10.A04
            if (r5 == 0) goto L_0x01aa
            java.lang.Object r2 = r10.A03
            X.GvB r2 = (X.C53844GvB) r2
            X.Gar r0 = r2.A04
            r1 = 1
            if (r0 == 0) goto L_0x01aa
            boolean r0 = r0.A00
            if (r0 != r1) goto L_0x01aa
            X.GDe r0 = r2.A01
            boolean r0 = r0.A0P
            if (r0 == 0) goto L_0x01aa
            java.lang.Object r1 = r10.A02
            X.3Zt r1 = (X.C243673Zt) r1
            java.lang.Object r0 = r10.A01
            X.2V5 r0 = (X.2V5) r0
            X.C56372HxQ.A00(r0, r1)
            X.2S0 r0 = X.AnonymousClass2S0.A01
            r0.A03()
        L_0x01aa:
            java.lang.Object r3 = r10.A02
            java.lang.Object r2 = r10.A01
            r1 = 32
            goto L_0x01e6
        L_0x01b1:
            boolean r5 = r10.A04
            if (r5 == 0) goto L_0x01e0
            java.lang.Object r4 = r10.A03
            X.GTo r4 = (X.C52462GTo) r4
            X.JTB r3 = r4.A03
            r2 = 1
            if (r3 == 0) goto L_0x01e0
            X.4bN r1 = r4.A00
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0u()
            boolean r0 = r3.CRt(r1, r0)
            if (r0 != r2) goto L_0x01e0
            X.GDe r0 = r4.A01
            boolean r0 = r0.A0P
            if (r0 == 0) goto L_0x01e0
            java.lang.Object r1 = r10.A02
            X.3Zt r1 = (X.C243673Zt) r1
            java.lang.Object r0 = r10.A01
            X.2V5 r0 = (X.2V5) r0
            X.C56372HxQ.A00(r0, r1)
            X.2S0 r0 = X.AnonymousClass2S0.A01
            r0.A03()
        L_0x01e0:
            java.lang.Object r3 = r10.A02
            java.lang.Object r2 = r10.A01
            r1 = 33
        L_0x01e6:
            X.GL3 r0 = new X.GL3
            r0.<init>(r1, r2, r3, r5)
            X.3dj r4 = X.C51965G9l.A0V(r0)
            return r4
        L_0x01f0:
            java.lang.Object r3 = r10.A02
            X.4bN r3 = (X.C267324bN) r3
            java.lang.Object r2 = r10.A03
            X.GIt r2 = (X.C52202GIt) r2
            boolean r1 = r10.A04
            java.lang.Object r0 = r10.A01
            X.2Wa r0 = (X.2Wa) r0
            X.GIu r4 = new X.GIu
            r4.<init>(r0, r3, r2, r1)
            return r4
        L_0x0204:
            java.lang.Object r5 = r10.A03
            X.GGs r5 = (X.C52150GGs) r5
            X.GEa r4 = r5.A08
            boolean r0 = r4.A0G
            r3 = 0
            r7 = 1
            if (r0 == 0) goto L_0x0241
            X.3Y9 r6 = X.AnonymousClass3Y9.A00
            com.instagram.common.session.UserSession r2 = r5.A01
            java.lang.Object r1 = r10.A02
            X.1Xj r1 = (X.1Xj) r1
            boolean r0 = r6.A08(r2, r1)
            if (r0 == 0) goto L_0x0241
            boolean r0 = r6.A09(r2, r1, r3)
        L_0x0222:
            if (r0 != 0) goto L_0x0260
        L_0x0224:
            r2 = 1
        L_0x0225:
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r0 = r5.A01
            com.instagram.user.model.User r1 = r1.A01(r0)
            java.lang.Object r0 = r10.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x023c
            boolean r0 = r4.A0K
            if (r0 == 0) goto L_0x023c
            if (r2 == 0) goto L_0x023c
            r3 = 1
        L_0x023c:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            return r4
        L_0x0241:
            boolean r0 = r4.A0J
            if (r0 == 0) goto L_0x0258
            X.3Y9 r6 = X.AnonymousClass3Y9.A00
            com.instagram.common.session.UserSession r2 = r5.A01
            java.lang.Object r1 = r10.A02
            X.1Xj r1 = (X.1Xj) r1
            boolean r0 = r6.A07(r2, r1)
            if (r0 == 0) goto L_0x0258
            boolean r0 = r6.A09(r2, r1, r7)
            goto L_0x0222
        L_0x0258:
            boolean r0 = r4.A0F
            if (r0 != 0) goto L_0x0262
            boolean r0 = r10.A04
            if (r0 != 0) goto L_0x0224
        L_0x0260:
            r2 = 0
            goto L_0x0225
        L_0x0262:
            java.lang.Object r2 = r10.A02
            X.1Xj r2 = (X.1Xj) r2
            X.1Xy r0 = r2.A0C
            com.instagram.api.schemas.CollabFollowButtonInfo r0 = r0.AoX()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            if (r0 == 0) goto L_0x0260
            java.lang.Boolean r0 = r0.CYn()
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x0260
            X.1Xy r0 = r2.A0C
            com.instagram.api.schemas.CollabFollowButtonInfo r0 = r0.AoX()
            if (r0 == 0) goto L_0x0260
            java.lang.Boolean r0 = r0.BvQ()
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x0260
            goto L_0x0224
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58206IoA.invoke():java.lang.Object");
    }
}
