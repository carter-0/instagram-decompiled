package X;

public final class J7Q extends 0Yg implements 0sL {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J7Q(Object obj, String str, int i, boolean z) {
        super(2);
        this.A00 = i;
        this.A01 = obj;
        this.A03 = z;
        this.A02 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x03a7, code lost:
        r14.Evl();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00bf, code lost:
        X.0fL.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c4, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r23, java.lang.Object r24) {
        /*
            r22 = this;
            r3 = r22
            r14 = r23
            int r2 = r3.A00
            X.5Wy r14 = (X.C286575Wy) r14
            int r1 = X.C51968G9o.A0B(r24)
            r0 = 2
            switch(r2) {
                case 0: goto L_0x00c5;
                case 1: goto L_0x013d;
                case 2: goto L_0x0257;
                case 3: goto L_0x028d;
                default: goto L_0x0010;
            }
        L_0x0010:
            if (r1 != r0) goto L_0x0018
            boolean r0 = r14.Bwn()
            if (r0 != 0) goto L_0x03a7
        L_0x0018:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0026
            r1 = -937040525(0xffffffffc825e573, float:-169877.8)
            java.lang.String r0 = "instagram.features.clips.spins.participation.ui.ClipsSpinsAddSpinTextBottomSheetFragment.onCreateView.<anonymous> (ClipsSpinsAddSpinTextBottomSheetFragment.kt:84)"
            X.0fL.A01(r1, r0)
        L_0x0026:
            java.lang.Object r5 = r3.A01
            X.H1e r5 = (X.C54160H1e) r5
            X.0eM r0 = r5.A02
            java.lang.Object r0 = r0.getValue()
            X.H2b r0 = (X.C54181H2b) r0
            X.0Ud r0 = r0.A06
            r4 = 0
            java.lang.Object r15 = X.G9w.A0g(r14, r0, r4)
            X.Jvk r15 = (X.C61046Jvk) r15
            r0 = 1980732737(0x760f9541, float:7.280524E32)
            boolean r0 = X.C51967G9n.A1Z(r14, r5, r0)
            java.lang.String r1 = r3.A02
            boolean r0 = X.C51965G9l.A1Z(r14, r1, r0)
            java.lang.Object r2 = r14.ECw()
            if (r0 != 0) goto L_0x0052
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r2 != r0) goto L_0x005c
        L_0x0052:
            r0 = 30
            X.Iw3 r2 = new X.Iw3
            r2.<init>(r1, r5, r0)
            r14.FLL(r2)
        L_0x005c:
            X.0sa r2 = (X.C62320sa) r2
            X.5Wx r6 = X.C51965G9l.A0H(r14, r4)
            r0 = 1980738967(0x760fad97, float:7.2853444E32)
            boolean r1 = X.C51967G9n.A1Z(r14, r5, r0)
            java.lang.Object r0 = r14.ECw()
            if (r1 != 0) goto L_0x0073
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r0 != r1) goto L_0x007c
        L_0x0073:
            r0 = 38
            X.J6f r0 = X.C59097J6f.A01(r5, r0)
            r14.FLL(r0)
        L_0x007c:
            X.0sP r19 = X.C51965G9l.A0z(r6, r0)
            r0 = 1980741975(0x760fb957, float:7.287672E32)
            boolean r1 = X.C51967G9n.A1Z(r14, r5, r0)
            java.lang.Object r0 = r14.ECw()
            if (r1 != 0) goto L_0x0091
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r0 != r1) goto L_0x009a
        L_0x0091:
            r0 = 33
            X.IwL r0 = X.C58712IwL.A01(r5, r0)
            r14.FLL(r0)
        L_0x009a:
            X.0sa r18 = X.C51965G9l.A0y(r6, r0, r4)
            boolean r1 = r3.A03
            X.0eM r0 = r5.A04
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.JRL r16 = X.C63504KyF.A00(r0)
            X.0qQ.A07(r16)
            r17 = r2
            r20 = r4
            r21 = r1
            X.I3L.A00(r14, r15, r16, r17, r18, r19, r20, r21)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00c2
            r0 = 1348799158(0x50650ab6, float:1.53707377E10)
        L_0x00bf:
            X.0fL.A00(r0)
        L_0x00c2:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x00c5:
            if (r1 != r0) goto L_0x00cd
            boolean r0 = r14.Bwn()
            if (r0 != 0) goto L_0x03a7
        L_0x00cd:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00db
            r1 = 1650237970(0x625ca212, float:1.0174905E21)
            java.lang.String r0 = "com.instagram.compose.igds.components.mediabutton.IgdsMediaButton.<anonymous> (IgdsMediaButton.kt:55)"
            X.0fL.A01(r1, r0)
        L_0x00db:
            boolean r0 = r3.A03
            if (r0 == 0) goto L_0x0115
            r0 = -27663485(0xfffffffffe59e383, float:-7.2405946E37)
            X.5Qk r4 = X.C51965G9l.A0K(r14, r0)
            java.lang.Object r0 = r3.A01
            X.HMs r0 = (X.C54661HMs) r0
            float r2 = r0.A00
            r0 = 1082130432(0x40800000, float:4.0)
            float r1 = r2 - r0
            r0 = 1084227584(0x40a00000, float:5.0)
            float r2 = r2 - r0
            androidx.compose.ui.Modifier r15 = X.C287195Zj.A09(r4, r1, r2)
            X.GSc r16 = X.C52423GSb.A01(r14)
            r4 = 0
            X.5Yw r0 = X.AnonymousClass5aQ.A00(r14)
            long r0 = r0.A14
            r17 = 64
            r18 = r4
            r19 = r0
            X.GQD.A02(r14, r15, r16, r17, r18, r19)
        L_0x010b:
            boolean r0 = X.C51970G9q.A1a(r14, r4)
            if (r0 == 0) goto L_0x00c2
            r0 = -1488278800(0xffffffffa74aaaf0, float:-2.8125797E-15)
            goto L_0x00bf
        L_0x0115:
            r0 = -27357918(0xfffffffffe5e8d22, float:-7.3955355E37)
            X.5Qk r2 = X.C51965G9l.A0K(r14, r0)
            java.lang.Object r0 = r3.A01
            X.HMs r0 = (X.C54661HMs) r0
            float r1 = r0.A00
            float r0 = r0.A01
            androidx.compose.ui.Modifier r15 = X.C287195Zj.A09(r2, r1, r0)
            r4 = 0
            X.5Yw r0 = X.AnonymousClass5aQ.A00(r14)
            long r1 = r0.A14
            X.5Z4 r16 = X.C51966G9m.A0f(r14)
            java.lang.String r0 = r3.A02
            r17 = r0
            r18 = r1
            X.AnonymousClass5ZZ.A0U(r14, r15, r16, r17, r18)
            goto L_0x010b
        L_0x013d:
            if (r1 != r0) goto L_0x0145
            boolean r0 = r14.Bwn()
            if (r0 != 0) goto L_0x03a7
        L_0x0145:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0153
            r1 = -1496823822(0xffffffffa6c847f2, float:-1.3897289E-15)
            java.lang.String r0 = "com.instagram.creation.igbarcelona.upsell.ShareToBarcelonaAutoPostUpsellFragment.onCreateView.<anonymous>.<anonymous> (ShareToBarcelonaAutoPostUpsellFragment.kt:62)"
            X.0fL.A01(r1, r0)
        L_0x0153:
            X.0gF r6 = X.C60340gF.A00
            r0 = -649303854(0xffffffffd94c68d2, float:-3.59600915E15)
            r14.ExS(r0)
            java.lang.Object r5 = r3.A01
            boolean r1 = r14.AGw(r5)
            java.lang.Object r0 = r14.ECw()
            r2 = 0
            if (r1 != 0) goto L_0x016c
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r0 != r1) goto L_0x0176
        L_0x016c:
            r1 = 41
            X.MG0 r0 = new X.MG0
            r0.<init>(r5, r2, r1)
            r14.FLL(r0)
        L_0x0176:
            X.0sL r0 = (X.0sL) r0
            r4 = r14
            X.5Wx r4 = (X.C286565Wx) r4
            r2 = 0
            X.C286565Wx.A0L(r4, r2)
            X.C286645Xf.A04(r14, r6, r0)
            X.5Qk r7 = androidx.compose.ui.Modifier.A00
            r1 = 1090519040(0x41000000, float:8.0)
            r9 = 0
            androidx.compose.ui.Modifier r6 = X.C287195Zj.A0B(r7, r9, r9, r9, r1)
            X.5Zr r0 = X.C287215Zl.A00
            boolean r10 = r3.A03
            java.lang.String r11 = r3.A02
            X.5RD r3 = X.C51970G9q.A0Z(r14, r0)
            int r8 = X.C287425a7.A00(r14)
            X.5RM r0 = X.C286565Wx.A04(r4)
            androidx.compose.ui.Modifier r6 = X.C287435a8.A01(r14, r6)
            X.C51973G9u.A0y(r14, r4)
            X.C51971G9r.A12(r14, r3, r0)
            X.0sL r3 = X.C287485aD.A02
            boolean r0 = r4.A0K
            if (r0 != 0) goto L_0x01b3
            boolean r0 = X.C51972G9s.A1Q(r14, r8)
            if (r0 != 0) goto L_0x01b6
        L_0x01b3:
            X.C51971G9r.A13(r14, r3, r8)
        L_0x01b6:
            X.C51965G9l.A18(r14, r6)
            r0 = 2131973535(0x7f13559f, float:1.9584109E38)
            if (r10 == 0) goto L_0x01c1
            r0 = 2131973533(0x7f13559d, float:1.9584104E38)
        L_0x01c1:
            java.lang.String r8 = X.C288035bG.A00(r14, r0)
            X.5Z4 r6 = X.C51966G9m.A0e(r14)
            r3 = 1107296256(0x42000000, float:32.0)
            r0 = 1101004800(0x41a00000, float:20.0)
            androidx.compose.ui.Modifier r0 = X.C287195Zj.A09(r7, r3, r0)
            X.AnonymousClass5ZZ.A04(r14, r0, r6, r8)
            X.C56637I5s.A00(r14, r11, r2, r10)
            r6 = 1098907648(0x41800000, float:16.0)
            androidx.compose.ui.Modifier r0 = X.C287195Zj.A0B(r7, r9, r6, r9, r1)
            X.C56618I4t.A01(r14, r0)
            r0 = 2131973559(0x7f1355b7, float:1.9584157E38)
            java.lang.String r17 = X.C288035bG.A00(r14, r0)
            X.GQy r16 = X.C51965G9l.A0m(r14)
            androidx.compose.ui.Modifier r3 = X.C51966G9m.A0T(r7)
            androidx.compose.ui.Modifier r15 = X.C287195Zj.A09(r3, r6, r1)
            r0 = 811393015(0x305cdff7, float:8.0353807E-10)
            boolean r6 = X.C51967G9n.A1Z(r14, r5, r0)
            java.lang.Object r0 = r14.ECw()
            if (r6 != 0) goto L_0x0204
            java.lang.Object r6 = X.AnonymousClass5XT.A00
            if (r0 != r6) goto L_0x020e
        L_0x0204:
            r6 = 8
            X.Jbg r0 = new X.Jbg
            r0.<init>(r5, r6)
            r14.FLL(r0)
        L_0x020e:
            X.0sa r18 = X.C51965G9l.A0y(r4, r0, r2)
            r19 = 384(0x180, float:5.38E-43)
            X.AnonymousClass6CE.A06(r14, r15, r16, r17, r18, r19)
            r0 = 2131973534(0x7f13559e, float:1.9584107E38)
            java.lang.String r8 = X.C288035bG.A00(r14, r0)
            X.6CB r7 = X.AnonymousClass6CA.A00(r14)
            r0 = 1103101952(0x41c00000, float:24.0)
            androidx.compose.ui.Modifier r6 = X.C287195Zj.A09(r3, r0, r1)
            r0 = 811410804(0x305d2574, float:8.0452556E-10)
            boolean r1 = X.C51967G9n.A1Z(r14, r5, r0)
            java.lang.Object r0 = r14.ECw()
            if (r1 != 0) goto L_0x0239
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r0 != r1) goto L_0x0243
        L_0x0239:
            r1 = 9
            X.Jbg r0 = new X.Jbg
            r0.<init>(r5, r1)
            r14.FLL(r0)
        L_0x0243:
            X.0sa r9 = X.C51965G9l.A0y(r4, r0, r2)
            r5 = r14
            r10 = r2
            X.AnonymousClass6CE.A06(r5, r6, r7, r8, r9, r10)
            boolean r0 = X.C51967G9n.A1R(r14)
            if (r0 == 0) goto L_0x00c2
            r0 = -1880254641(0xffffffff8fed974f, float:-2.3428286E-29)
            goto L_0x00bf
        L_0x0257:
            if (r1 != r0) goto L_0x025f
            boolean r0 = r14.Bwn()
            if (r0 != 0) goto L_0x03a7
        L_0x025f:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x026d
            r1 = 1832795738(0x6d3e3e5a, float:3.6798456E27)
            java.lang.String r0 = "com.instagram.creation.igbarcelona.upsell.ShareToBarcelonaAutoPostUpsellFragment.onCreateView.<anonymous> (ShareToBarcelonaAutoPostUpsellFragment.kt:61)"
            X.0fL.A01(r1, r0)
        L_0x026d:
            X.5Qk r0 = androidx.compose.ui.Modifier.A00
            r7 = 1
            androidx.compose.ui.Modifier r6 = X.C51966G9m.A0T(r0)
            r5 = 95936860(0x5b7e15c, float:1.7292021E-35)
            java.lang.Object r4 = r3.A01
            boolean r2 = r3.A03
            java.lang.String r1 = r3.A02
            X.J7Q r0 = new X.J7Q
            r0.<init>(r4, r1, r7, r2)
            boolean r0 = X.C51972G9s.A1U(r14, r6, r0, r5)
            if (r0 == 0) goto L_0x00c2
            r0 = 180064614(0xabb9166, float:1.8062138E-32)
            goto L_0x00bf
        L_0x028d:
            if (r1 != r0) goto L_0x0295
            boolean r0 = r14.Bwn()
            if (r0 != 0) goto L_0x03a7
        L_0x0295:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x02a3
            r1 = 275828531(0x1070cf33, float:4.7491275E-29)
            java.lang.String r0 = "com.instagram.direct.inbox.ui.conversationstartersmenu.FloatingActionButton.FloatingActionButton.<anonymous> (FloatingActionButton.kt:47)"
            X.0fL.A01(r1, r0)
        L_0x02a3:
            X.5Qk r7 = androidx.compose.ui.Modifier.A00
            r0 = -1943624564(0xffffffff8c26a48c, float:-1.2837691E-31)
            r14.ExS(r0)
            java.lang.String r2 = r3.A02
            java.lang.Object r1 = r14.ECw()
            java.lang.Object r5 = X.AnonymousClass5XT.A00
            if (r1 != r5) goto L_0x02bf
            r0 = 28
            X.MYK r1 = new X.MYK
            r1.<init>(r2, r0)
            r14.FLL(r1)
        L_0x02bf:
            X.0sP r1 = (X.0sP) r1
            r12 = r14
            X.5Wx r12 = (X.C286565Wx) r12
            r8 = 0
            X.C286565Wx.A0L(r12, r8)
            androidx.compose.ui.Modifier r4 = X.AnonymousClass5R5.A00(r7, r1, r8)
            r0 = -1943619896(0xffffffff8c26b6c8, float:-1.2843179E-31)
            r14.ExS(r0)
            java.lang.Object r2 = r3.A01
            boolean r1 = r14.AGu(r2)
            java.lang.Object r0 = r14.ECw()
            if (r1 != 0) goto L_0x02e0
            if (r0 != r5) goto L_0x02ea
        L_0x02e0:
            r1 = 49
            X.Pm4 r0 = new X.Pm4
            r0.<init>(r2, r1)
            r14.FLL(r0)
        L_0x02ea:
            X.0sa r0 = X.C51965G9l.A0y(r12, r0, r8)
            androidx.compose.ui.Modifier r5 = X.C52638GaC.A01(r14, r4, r0)
            r4 = 1090519040(0x41000000, float:8.0)
            long r0 = X.AnonymousClass5RW.A04
            X.5RW r2 = X.C51965G9l.A0N(r0)
            long r0 = X.AnonymousClass5RW.A07
            java.util.List r2 = X.G9t.A1D(r2, r0)
            r1 = 2139095040(0x7f800000, float:Infinity)
            X.Gew r0 = new X.Gew
            r0.<init>(r2, r1)
            X.5ZQ r2 = X.AnonymousClass5ZN.A00
            androidx.compose.ui.Modifier r1 = X.C304816Fi.A02(r5, r0, r2, r4)
            r0 = 1117782016(0x42a00000, float:80.0)
            androidx.compose.ui.Modifier r0 = X.C287205Zk.A0C(r1, r0)
            androidx.compose.ui.Modifier r1 = X.AnonymousClass6FZ.A01(r0, r2)
            androidx.compose.ui.Alignment r6 = X.C287215Zl.A09
            boolean r5 = r3.A03
            X.5RD r4 = X.C287675aa.A00(r6, r8)
            int r3 = X.C287425a7.A00(r14)
            X.5RM r0 = X.C286565Wx.A04(r12)
            androidx.compose.ui.Modifier r1 = X.C287435a8.A01(r14, r1)
            X.0sa r11 = X.C287485aD.A00
            X.C51973G9u.A0z(r14, r12, r11)
            X.0sL r10 = X.C287485aD.A03
            X.0sL r9 = X.C51969G9p.A0w(r14, r4, r0, r10)
            X.0sL r4 = X.C287485aD.A02
            boolean r0 = r12.A0K
            if (r0 != 0) goto L_0x0342
            boolean r0 = X.C51972G9s.A1Q(r14, r3)
            if (r0 != 0) goto L_0x0345
        L_0x0342:
            X.C51971G9r.A13(r14, r4, r3)
        L_0x0345:
            X.0sL r3 = X.C51966G9m.A1K(r14, r1)
            long r0 = X.C51966G9m.A0G(r14)
            androidx.compose.ui.Modifier r1 = X.C304766Fd.A01(r7, r2, r0)
            r0 = 1115684864(0x42800000, float:64.0)
            androidx.compose.ui.Modifier r1 = X.C287205Zk.A0C(r1, r0)
            X.5RD r13 = X.C51966G9m.A0a(r8)
            int r2 = X.C287425a7.A00(r14)
            X.5RM r0 = X.C286565Wx.A04(r12)
            androidx.compose.ui.Modifier r1 = X.C287435a8.A01(r14, r1)
            X.C51973G9u.A0z(r14, r12, r11)
            X.C287595aO.A00(r14, r13, r10)
            boolean r0 = X.C51965G9l.A1Y(r14, r12, r0, r9)
            if (r0 != 0) goto L_0x0379
            boolean r0 = X.C51972G9s.A1Q(r14, r2)
            if (r0 != 0) goto L_0x037c
        L_0x0379:
            X.C51971G9r.A13(r14, r4, r2)
        L_0x037c:
            X.C287595aO.A00(r14, r1, r3)
            X.5dj r1 = X.C289515dj.A00
            r0 = 2131237848(0x7f081bd8, float:1.8091958E38)
            if (r5 == 0) goto L_0x0389
            r0 = 2131238040(0x7f081c98, float:1.8092347E38)
        L_0x0389:
            X.2DO r3 = X.C287975bA.A00(r14, r0, r8)
            androidx.compose.ui.Modifier r0 = X.C287205Zk.A04(r7)
            androidx.compose.ui.Modifier r2 = r1.AAz(r6, r0)
            long r0 = X.C51966G9m.A0A(r14)
            X.C288165bT.A05(r14, r2, r3, r0)
            boolean r0 = X.C51971G9r.A1R(r14)
            if (r0 == 0) goto L_0x00c2
            r0 = -2037141137(0xffffffff8693b16f, float:-5.555597E-35)
            goto L_0x00bf
        L_0x03a7:
            r14.Evl()
            goto L_0x00c2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.J7Q.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
