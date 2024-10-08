package X;

/* renamed from: X.JGv  reason: case insensitive filesystem */
public final class C59369JGv extends 0Yg implements 0sK {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59369JGv(int i, Object obj, Object obj2, Object obj3, boolean z) {
        super(3);
        this.A00 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A04 = z;
        this.A01 = obj3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0336, code lost:
        r9.Evl();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00bc, code lost:
        X.0fL.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c1, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r20, java.lang.Object r21, java.lang.Object r22) {
        /*
            r19 = this;
            r0 = r19
            r9 = r21
            int r1 = r0.A00
            r2 = r20
            X.5Wy r9 = (X.C286575Wy) r9
            switch(r1) {
                case 0: goto L_0x02bd;
                case 1: goto L_0x023d;
                case 2: goto L_0x01e5;
                case 3: goto L_0x00d0;
                default: goto L_0x000d;
            }
        L_0x000d:
            int r1 = X.AnonymousClass7TE.A0M(r22)
            r15 = 0
            X.0qQ.A0B(r2, r15)
            r2 = r1 & 17
            r1 = 16
            if (r2 != r1) goto L_0x0021
            boolean r1 = r9.Bwn()
            if (r1 != 0) goto L_0x0336
        L_0x0021:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x002f
            r2 = -946824739(0xffffffffc79099dd, float:-74035.73)
            java.lang.String r1 = "com.instagram.newsfeed.followrequests.ui.compose.FollowRequest.<anonymous> (FollowRequest.kt:44)"
            X.0fL.A01(r2, r1)
        L_0x002f:
            boolean r1 = r0.A04
            if (r1 == 0) goto L_0x00c2
            r1 = 1737569904(0x67913670, float:1.3714947E24)
            r9.ExS(r1)
            r1 = 56050699(0x357440b, float:6.326093E-37)
            r9.ExS(r1)
            java.lang.Object r3 = r0.A01
            java.lang.Number r3 = (java.lang.Number) r3
            if (r3 == 0) goto L_0x007a
            X.5Qk r2 = androidx.compose.ui.Modifier.A00
            r1 = 1082130432(0x40800000, float:4.0)
            androidx.compose.ui.Modifier r10 = X.G9w.A0I(r2, r1)
            java.lang.Object r2 = r0.A03
            r1 = 56054788(0x3575404, float:6.3279267E-37)
            boolean r1 = X.C51967G9n.A1Y(r9, r2, r1)
            java.lang.Object r13 = r9.ECw()
            if (r1 != 0) goto L_0x0060
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r13 != r1) goto L_0x0066
        L_0x0060:
            r1 = 15
            X.FyD r13 = X.C51969G9p.A0y(r9, r2, r1)
        L_0x0066:
            X.0Ya r13 = (X.C59520Ya) r13
            X.C51965G9l.A1X(r9, r15)
            java.lang.String r12 = X.C51968G9o.A13(r9, r3)
            X.GQy r11 = X.C51965G9l.A0m(r9)
            X.0sa r13 = (X.C62320sa) r13
            r14 = 384(0x180, float:5.38E-43)
            X.C55063HbY.A00(r9, r10, r11, r12, r13, r14, r15)
        L_0x007a:
            X.5Wx r3 = X.C51965G9l.A0H(r9, r15)
            java.lang.Object r2 = r0.A03
            r0 = 56061155(0x3576ce3, float:6.3307817E-37)
            boolean r0 = X.C51967G9n.A1Y(r9, r2, r0)
            java.lang.Object r1 = r9.ECw()
            if (r0 != 0) goto L_0x0091
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r1 != r0) goto L_0x0097
        L_0x0091:
            r0 = 16
            X.FyD r1 = X.C51969G9p.A0y(r9, r2, r0)
        L_0x0097:
            X.0Ya r2 = X.C51965G9l.A12(r3, r1)
            r0 = 2131957531(0x7f13171b, float:1.9551649E38)
            java.lang.String r13 = X.C288035bG.A00(r9, r0)
            X.6CA r1 = X.AnonymousClass6CA.A00
            r0 = 3
            X.GQy r12 = r1.A03(r9, r0, r15, r15)
            r11 = 0
            X.0sa r2 = (X.C62320sa) r2
            r16 = 4
            r10 = r9
            r14 = r2
            X.C55063HbY.A00(r10, r11, r12, r13, r14, r15, r16)
        L_0x00b3:
            boolean r0 = X.C51970G9q.A1a(r9, r15)
            if (r0 == 0) goto L_0x00bf
            r0 = 774327114(0x2e274b4a, float:3.8038274E-11)
        L_0x00bc:
            X.0fL.A00(r0)
        L_0x00bf:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x00c2:
            r1 = 1738043770(0x6798717a, float:1.439786E24)
            r9.ExS(r1)
            java.lang.Object r0 = r0.A02
            X.0sL r0 = (X.0sL) r0
            X.C51967G9n.A1P(r9, r0, r15)
            goto L_0x00b3
        L_0x00d0:
            int r1 = X.AnonymousClass7TE.A0M(r22)
            r14 = 0
            X.0qQ.A0B(r2, r14)
            r2 = r1 & 17
            r1 = 16
            if (r2 != r1) goto L_0x00e4
            boolean r1 = r9.Bwn()
            if (r1 != 0) goto L_0x0336
        L_0x00e4:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x00f2
            r2 = 176847475(0xa8a7a73, float:1.3334977E-32)
            java.lang.String r1 = "com.instagram.newsfeed.compose.ui.SuggestedUserRow.<anonymous> (SuggestedUserRow.kt:78)"
            X.0fL.A01(r2, r1)
        L_0x00f2:
            java.lang.Object r11 = r0.A01
            X.DgM r11 = (X.C46519DgM) r11
            r10 = 0
            java.lang.Object r13 = r0.A03
            X.0sa r13 = (X.C62320sa) r13
            r15 = 6
            r12 = r10
            X.GR2.A00(r9, r10, r11, r12, r13, r14, r15)
            boolean r1 = r0.A04
            if (r1 == 0) goto L_0x0173
            X.4bM r1 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.A00
            java.lang.Object r1 = r9.AJO(r1)
            android.content.res.Configuration r1 = (android.content.res.Configuration) r1
            int r2 = r1.screenWidthDp
            r1 = 320(0x140, float:4.48E-43)
            if (r2 >= r1) goto L_0x017e
            r1 = 2137815451(0x7f6c799b, float:3.1432922E38)
            X.5Qk r7 = X.C51965G9l.A0K(r9, r1)
            r1 = -1732150276(0xffffffff98c17bfc, float:-5.0014523E-24)
            java.lang.Object r1 = X.C51967G9n.A0m(r9, r1)
            java.lang.Object r6 = X.AnonymousClass5XT.A00
            java.lang.Object r5 = X.C51972G9s.A0l(r9, r1, r6)
            X.5aT r5 = (X.C287605aT) r5
            X.5Wx r2 = X.C51965G9l.A0H(r9, r14)
            X.4bM r1 = X.AnonymousClass5ZU.A00
            java.lang.Object r4 = r9.AJO(r1)
            X.5Yz r4 = (X.C287095Yz) r4
            r1 = -1732146157(0xffffffff98c18c13, float:-5.003077E-24)
            r9.ExS(r1)
            java.lang.Object r3 = r0.A02
            boolean r1 = r9.AGu(r3)
            java.lang.Object r0 = r9.ECw()
            if (r1 != 0) goto L_0x0148
            if (r0 != r6) goto L_0x0152
        L_0x0148:
            r1 = 42
            X.MIy r0 = new X.MIy
            r0.<init>(r3, r1)
            r9.FLL(r0)
        L_0x0152:
            X.0sa r0 = X.C51965G9l.A0y(r2, r0, r14)
            androidx.compose.ui.Modifier r4 = X.C287635aW.A02(r4, r5, r7, r0)
            r0 = 2131238568(0x7f081ea8, float:1.8093418E38)
            X.2DO r5 = X.C287975bA.A00(r9, r0, r14)
            r0 = 2131966173(0x7f1338dd, float:1.9569177E38)
        L_0x0164:
            java.lang.String r6 = X.C288035bG.A00(r9, r0)
            long r7 = X.C51966G9m.A0L(r9)
            r3 = r9
            X.C288165bT.A08(r3, r4, r5, r6, r7)
            X.C286565Wx.A0L(r2, r14)
        L_0x0173:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00bf
            r0 = -187768989(0xfffffffff4cedf63, float:-1.3112109E32)
            goto L_0x00bc
        L_0x017e:
            r1 = 2138350046(0x7f74a1de, float:3.251721E38)
            X.5Qk r2 = X.C51965G9l.A0K(r9, r1)
            r1 = 1082130432(0x40800000, float:4.0)
            androidx.compose.ui.Modifier r7 = X.C51967G9n.A0E(r2, r1)
            r1 = -1732131620(0xffffffff98c1c4dc, float:-5.0088108E-24)
            java.lang.Object r1 = X.C51967G9n.A0m(r9, r1)
            java.lang.Object r6 = X.AnonymousClass5XT.A00
            java.lang.Object r5 = X.C51972G9s.A0l(r9, r1, r6)
            X.5aT r5 = (X.C287605aT) r5
            r2 = r9
            X.5Wx r2 = (X.C286565Wx) r2
            X.C286565Wx.A0L(r2, r14)
            X.4bM r1 = X.AnonymousClass5ZU.A00
            java.lang.Object r4 = r9.AJO(r1)
            X.5Yz r4 = (X.C287095Yz) r4
            r1 = -1732127246(0xffffffff98c1d5f2, float:-5.010536E-24)
            r9.ExS(r1)
            java.lang.Object r3 = r0.A02
            boolean r1 = r9.AGu(r3)
            java.lang.Object r0 = r9.ECw()
            if (r1 != 0) goto L_0x01bc
            if (r0 != r6) goto L_0x01c6
        L_0x01bc:
            r1 = 43
            X.MIy r0 = new X.MIy
            r0.<init>(r3, r1)
            r9.FLL(r0)
        L_0x01c6:
            X.0sa r0 = X.C51965G9l.A0y(r2, r0, r14)
            androidx.compose.ui.Modifier r1 = X.C287635aW.A02(r4, r5, r7, r0)
            r0 = 1105199104(0x41e00000, float:28.0)
            androidx.compose.ui.Modifier r1 = X.C287205Zk.A0C(r1, r0)
            androidx.compose.ui.Alignment r0 = X.C287215Zl.A09
            androidx.compose.ui.Modifier r4 = X.C287205Zk.A02(r0, r1)
            r0 = 2131239943(0x7f082407, float:1.8096207E38)
            X.2DO r5 = X.C287975bA.A00(r9, r0, r14)
            r0 = 2131960862(0x7f13241e, float:1.9558405E38)
            goto L_0x0164
        L_0x01e5:
            int r2 = X.C51968G9o.A0D(r22)
            r1 = 16
            if (r2 != r1) goto L_0x01f3
            boolean r1 = r9.Bwn()
            if (r1 != 0) goto L_0x0336
        L_0x01f3:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0201
            r2 = 2118675890(0x7e486db2, float:6.660379E37)
            java.lang.String r1 = "com.instagram.creation.genai.memu.settings.MemuPhotosLayout.<anonymous> (MemuPhotosGridLayout.kt:46)"
            X.0fL.A01(r2, r1)
        L_0x0201:
            java.lang.Object r1 = r0.A03
            java.util.List r1 = (java.util.List) r1
            boolean r15 = r0.A04
            java.lang.Object r11 = r0.A02
            X.0sL r11 = (X.0sL) r11
            java.lang.Object r12 = r0.A01
            X.0sL r12 = (X.0sL) r12
            java.util.Iterator r1 = r1.iterator()
            r13 = 0
        L_0x0214:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0232
            java.lang.Object r10 = r1.next()
            int r0 = r13 + 1
            if (r13 >= 0) goto L_0x022a
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x022a:
            X.Dgg r10 = (X.C46539Dgg) r10
            r14 = 0
            X.C56578I2i.A02(r9, r10, r11, r12, r13, r14, r15)
            r13 = r0
            goto L_0x0214
        L_0x0232:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00bf
            r0 = 1504797227(0x59b1622b, float:6.241126E15)
            goto L_0x00bc
        L_0x023d:
            int r2 = X.C51968G9o.A0D(r22)
            r1 = 16
            if (r2 != r1) goto L_0x024b
            boolean r1 = r9.Bwn()
            if (r1 != 0) goto L_0x0336
        L_0x024b:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0259
            r2 = 1930829079(0x73161d17, float:1.1893227E31)
            java.lang.String r1 = "com.instagram.barcelona.feed.post.ui.FeedPostRow.<anonymous> (FeedPostRow.kt:752)"
            X.0fL.A01(r2, r1)
        L_0x0259:
            java.lang.Object r3 = r0.A03
            X.5vQ r3 = (X.C299575vQ) r3
            r8 = r3
            X.Gp7 r8 = (X.C53475Gp7) r8
            X.5vK r12 = r8.A02
            X.Glw r13 = r8.A03
            java.lang.Object r11 = r0.A02
            com.instagram.api.schemas.LineType r11 = (com.instagram.api.schemas.LineType) r11
            boolean r7 = r0.A04
            X.9IC r1 = r8.A00
            boolean r1 = r1.A01
            r6 = 1094713344(0x41400000, float:12.0)
            r5 = 1094713344(0x41400000, float:12.0)
            if (r7 == 0) goto L_0x0276
            r5 = 1098907648(0x41800000, float:16.0)
        L_0x0276:
            r4 = 1098907648(0x41800000, float:16.0)
            if (r1 == 0) goto L_0x027b
            r4 = 0
        L_0x027b:
            r2 = 0
            X.6Fj r1 = new X.6Fj
            r1.<init>(r6, r2, r5, r4)
            X.Gl4 r14 = new X.Gl4
            r14.<init>(r1, r7)
            boolean r2 = r8.A04
            r10 = 0
            r1 = -1660330624(0xffffffff9d095d80, float:-1.8180137E-21)
            r9.ExS(r1)
            java.lang.Object r1 = r0.A01
            boolean r0 = X.C51971G9r.A1U(r9, r1, r3)
            java.lang.Object r15 = r9.ECw()
            if (r0 != 0) goto L_0x029f
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r15 != r0) goto L_0x02a5
        L_0x029f:
            r0 = 42
            X.MMX r15 = X.C51970G9q.A0u(r9, r1, r3, r0)
        L_0x02a5:
            X.0sa r15 = (X.C62320sa) r15
            boolean r16 = X.C51968G9o.A1Y(r9)
            r17 = 32
            r18 = r2
            X.C56239Hv6.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00bf
            r0 = -1518037525(0xffffffffa58495eb, float:-2.2999938E-16)
            goto L_0x00bc
        L_0x02bd:
            int r2 = X.C51968G9o.A0D(r22)
            r1 = 16
            if (r2 != r1) goto L_0x02cb
            boolean r1 = r9.Bwn()
            if (r1 != 0) goto L_0x0336
        L_0x02cb:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x02d9
            r2 = 924419017(0x371983c9, float:9.150194E-6)
            java.lang.String r1 = "com.instagram.barcelona.feed.post.ui.FeedPostRow.<anonymous> (FeedPostRow.kt:694)"
            X.0fL.A01(r2, r1)
        L_0x02d9:
            java.lang.Object r4 = r0.A03
            X.5vQ r4 = (X.C299575vQ) r4
            r3 = r4
            X.6DK r3 = (X.AnonymousClass6DK) r3
            X.Gle r12 = r3.A01
            java.lang.Object r11 = r0.A02
            com.instagram.api.schemas.LineType r11 = (com.instagram.api.schemas.LineType) r11
            boolean r2 = r0.A04
            r1 = -1660407979(0xffffffff9d082f55, float:-1.802392E-21)
            r9.ExS(r1)
            boolean r1 = r12.A04
            if (r1 == 0) goto L_0x0334
            java.lang.Integer r1 = r12.A01
            if (r1 != 0) goto L_0x0334
            r1 = -1660404938(0xffffffff9d083b36, float:-1.8030061E-21)
            r9.ExS(r1)
            java.lang.Object r1 = r0.A01
            boolean r0 = X.C51971G9r.A1U(r9, r1, r4)
            java.lang.Object r13 = r9.ECw()
            if (r0 != 0) goto L_0x030c
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r13 != r0) goto L_0x0312
        L_0x030c:
            r0 = 43
            X.J6l r13 = X.C59103J6l.A00(r9, r1, r4, r0)
        L_0x0312:
            X.0sP r13 = (X.0sP) r13
            X.C51965G9l.A1V(r9)
        L_0x0317:
            boolean r14 = X.C51968G9o.A1Y(r9)
            r10 = 0
            X.9IC r0 = r3.A00
            boolean r0 = r0.A01
            r15 = 16
            r17 = r0
            r16 = r2
            X.C56234Hv1.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00bf
            r0 = -510068100(0xffffffffe198fa7c, float:-3.527443E20)
            goto L_0x00bc
        L_0x0334:
            r13 = 0
            goto L_0x0317
        L_0x0336:
            r9.Evl()
            goto L_0x00bf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59369JGv.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
