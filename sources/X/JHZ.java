package X;

import com.instagram.api.schemas.LineType;

public final class JHZ extends 0Yg implements 0sK {
    public final /* synthetic */ LineType A00;
    public final /* synthetic */ C299665vd A01;
    public final /* synthetic */ C299575vQ A02;
    public final /* synthetic */ C299635va A03;
    public final /* synthetic */ C303846Ba A04;
    public final /* synthetic */ C299515vK A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JHZ(LineType lineType, C299665vd r3, C299575vQ r4, C299635va r5, C303846Ba r6, C299515vK r7, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        super(3);
        this.A02 = r4;
        this.A05 = r7;
        this.A03 = r5;
        this.A06 = str;
        this.A07 = str2;
        this.A00 = lineType;
        this.A0B = z;
        this.A04 = r6;
        this.A01 = r3;
        this.A09 = z2;
        this.A08 = z3;
        this.A0A = z4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006b, code lost:
        if (r10.A05.AXm() == null) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r39, java.lang.Object r40, java.lang.Object r41) {
        /*
            r38 = this;
            r15 = r40
            r2 = r39
            X.5dk r2 = (X.C289525dk) r2
            X.5Wy r15 = (X.C286575Wy) r15
            int r1 = X.AnonymousClass7TE.A0M(r41)
            r8 = 0
            X.0qQ.A0B(r2, r8)
            r0 = r1 & 6
            if (r0 != 0) goto L_0x0019
            int r0 = X.G9t.A0O(r15, r2)
            r1 = r1 | r0
        L_0x0019:
            r1 = r1 & 19
            r0 = 18
            if (r1 != r0) goto L_0x002b
            boolean r0 = r15.Bwn()
            if (r0 == 0) goto L_0x002b
            r15.Evl()
        L_0x0028:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x002b:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0039
            r1 = 792490230(0x2f3c70f6, float:1.7138632E-10)
            java.lang.String r0 = "com.instagram.barcelona.feed.post.ui.FeedPostRow.<anonymous>.<anonymous> (FeedPostRow.kt:396)"
            X.0fL.A01(r1, r0)
        L_0x0039:
            r10 = r38
            X.5vQ r3 = r10.A02
            r7 = 0
            X.0lg r6 = X.C51969G9p.A0j(r15)
            r5 = 1065353216(0x3f800000, float:1.0)
            X.0Tu r4 = X.DbS.A0J(r6, r8)
            r0 = 37163583215370534(0x84081500220126, double:3.565737898913975E-306)
            double r0 = X.182.A00(r4, r6, r0)
            int r4 = (int) r0
            r1 = 0
            X.6Fj r0 = new X.6Fj
            r0.<init>(r1, r1, r1, r1)
            X.6D0 r6 = new X.6D0
            r6.<init>(r0, r5, r4)
            X.6Cw r3 = (X.C304286Cw) r3
            boolean r0 = r3.A09
            if (r0 == 0) goto L_0x006d
            X.5vK r0 = r10.A05
            java.lang.String r0 = r0.AXm()
            r33 = 1
            if (r0 != 0) goto L_0x006f
        L_0x006d:
            r33 = 0
        L_0x006f:
            r0 = -2121405581(0xffffffff818deb73, float:-5.2133073E-38)
            r15.ExS(r0)
            boolean r0 = r3.A0B
            if (r0 == 0) goto L_0x0163
            r0 = -2121403757(0xffffffff818df293, float:-5.2143297E-38)
            r15.ExS(r0)
            X.5va r4 = r10.A03
            boolean r0 = r15.AGu(r4)
            java.lang.String r3 = r10.A06
            boolean r0 = X.C51972G9s.A1X(r15, r3, r7, r0)
            java.lang.String r1 = r10.A07
            boolean r0 = X.C51965G9l.A1Z(r15, r1, r0)
            java.lang.Object r5 = r15.ECw()
            if (r0 != 0) goto L_0x009b
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r5 != r0) goto L_0x00a3
        L_0x009b:
            X.Ix0 r5 = new X.Ix0
            r5.<init>(r4, r3, r1, r8)
            r15.FLL(r5)
        L_0x00a3:
            X.0sP r5 = (X.0sP) r5
            X.C51965G9l.A1X(r15, r8)
        L_0x00a8:
            X.5Wx r11 = X.C51965G9l.A0H(r15, r8)
            X.5Qk r0 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r0 = r2.CmS(r0)
            androidx.compose.ui.Modifier r16 = X.C51966G9m.A0V(r0)
            java.lang.String r4 = r10.A06
            com.instagram.api.schemas.LineType r14 = r10.A00
            boolean r13 = r10.A0B
            X.5vK r12 = r10.A05
            X.6Ba r9 = r10.A04
            r0 = -2121422694(0xffffffff818da89a, float:-5.203715E-38)
            r15.ExS(r0)
            X.5vd r2 = r10.A01
            boolean r0 = X.C51971G9r.A1U(r15, r2, r7)
            java.lang.String r1 = r10.A07
            boolean r0 = X.C51965G9l.A1Z(r15, r1, r0)
            java.lang.Object r3 = r15.ECw()
            if (r0 != 0) goto L_0x00dc
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r3 != r0) goto L_0x00e4
        L_0x00dc:
            X.JGp r3 = new X.JGp
            r3.<init>(r2, r7, r1, r8)
            r15.FLL(r3)
        L_0x00e4:
            X.0sK r3 = (X.0sK) r3
            X.C286565Wx.A0L(r11, r8)
            r0 = -2121387686(0xffffffff818e315a, float:-5.223338E-38)
            boolean r1 = X.G9t.A1Z(r15, r2, r4, r0)
            java.lang.Object r0 = r15.ECw()
            if (r1 != 0) goto L_0x00fa
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r0 != r1) goto L_0x0103
        L_0x00fa:
            r1 = 1
            X.J74 r0 = new X.J74
            r0.<init>(r4, r2, r1)
            r15.FLL(r0)
        L_0x0103:
            X.0sL r26 = X.C51965G9l.A10(r11, r0)
            r0 = -2121376830(0xffffffff818e5bc2, float:-5.229423E-38)
            r15.ExS(r0)
            X.5va r2 = r10.A03
            boolean r0 = r15.AGu(r2)
            java.lang.Object r1 = r15.ECw()
            if (r0 != 0) goto L_0x011d
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r1 != r0) goto L_0x0123
        L_0x011d:
            r0 = 42
            X.J6h r1 = X.C59099J6h.A00(r15, r2, r0)
        L_0x0123:
            X.0sP r25 = X.C51965G9l.A0z(r11, r1)
            boolean r2 = r10.A09
            boolean r1 = r10.A08
            boolean r0 = r10.A0A
            r28 = 1572864(0x180000, float:2.204052E-39)
            r30 = 155648(0x26000, float:2.1811E-40)
            r23 = r7
            r27 = r3
            r29 = r8
            r31 = r13
            r32 = r8
            r34 = r2
            r35 = r1
            r36 = r8
            r37 = r0
            r22 = r7
            r24 = r5
            r21 = r4
            r20 = r12
            r19 = r9
            r18 = r6
            r17 = r14
            X.AnonymousClass6D1.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0028
            r0 = 189931227(0xb521edb, float:4.0467742E-32)
            X.0fL.A00(r0)
            goto L_0x0028
        L_0x0163:
            r5 = r7
            goto L_0x00a8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JHZ.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
