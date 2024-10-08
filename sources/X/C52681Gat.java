package X;

/* renamed from: X.Gat  reason: case insensitive filesystem */
public final class C52681Gat extends 0Yg implements 0sL {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52681Gat(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, int i) {
        super(2);
        this.A00 = i;
        this.A08 = obj;
        this.A09 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A01 = obj5;
        this.A05 = obj6;
        this.A06 = obj7;
        this.A07 = obj8;
        this.A04 = obj9;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x015e, code lost:
        if (r2.A06 != true) goto L_0x0160;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r32, java.lang.Object r33) {
        /*
            r31 = this;
            r0 = r31
            r6 = r32
            int r3 = r0.A00
            X.5Wy r6 = (X.C286575Wy) r6
            int r2 = X.C51968G9o.A0B(r33)
            r1 = 2
            if (r3 == 0) goto L_0x00ec
            if (r2 != r1) goto L_0x0017
            boolean r1 = r6.Bwn()
            if (r1 != 0) goto L_0x0259
        L_0x0017:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0025
            r2 = 1700248834(0x6557bd02, float:6.367471E22)
            java.lang.String r1 = "instagram.features.clips.viewer.feature.threads.ui.ThreadsComposeBinder.bind.<anonymous> (ThreadsComposeBinder.kt:77)"
            X.0fL.A01(r2, r1)
        L_0x0025:
            java.lang.Object r11 = r0.A08
            com.instagram.common.session.UserSession r11 = (com.instagram.common.session.UserSession) r11
            java.lang.Object r10 = r0.A02
            android.app.Activity r10 = (android.app.Activity) r10
            X.DbS.A1X(r10)
            androidx.fragment.app.FragmentActivity r10 = (androidx.fragment.app.FragmentActivity) r10
            java.lang.Object r1 = r0.A03
            java.lang.String r18 = X.C51966G9m.A1F(r1)
            java.lang.Object r12 = r0.A07
            X.GrJ r12 = (X.C53604GrJ) r12
            java.lang.String r1 = r12.A06
            r19 = r1
            java.lang.String r1 = r12.A02
            r20 = r1
            java.lang.String r1 = r12.A03
            r21 = r1
            java.lang.String r1 = r12.A05
            r22 = r1
            X.62P r15 = r12.A08
            int r9 = r12.A00
            java.lang.Object r8 = r0.A06
            X.5vZ r8 = (X.AnonymousClass5vZ) r8
            java.lang.Object r7 = r0.A04
            X.5ve r7 = (X.C299675ve) r7
            java.lang.Object r5 = r0.A05
            X.0sP r5 = (X.0sP) r5
            r1 = -320320897(0xffffffffece84a7f, float:-2.2465807E27)
            r6.ExS(r1)
            java.lang.Object r14 = r0.A09
            boolean r1 = r6.AGw(r14)
            java.lang.Object r4 = r6.ECw()
            if (r1 != 0) goto L_0x0072
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r4 != r1) goto L_0x007c
        L_0x0072:
            r1 = 42
            X.JGB r4 = new X.JGB
            r4.<init>(r14, r1)
            r6.FLL(r4)
        L_0x007c:
            X.0sL r4 = (X.0sL) r4
            r3 = r6
            X.5Wx r3 = (X.C286565Wx) r3
            r2 = 0
            X.C286565Wx.A0L(r3, r2)
            r1 = -320316576(0xffffffffece85b60, float:-2.2472184E27)
            boolean r13 = X.C51967G9n.A1Z(r6, r14, r1)
            java.lang.Object r1 = r6.ECw()
            if (r13 != 0) goto L_0x0096
            java.lang.Object r13 = X.AnonymousClass5XT.A00
            if (r1 != r13) goto L_0x009f
        L_0x0096:
            r1 = 10
            X.IwK r1 = X.C58711IwK.A00(r14, r1)
            r6.FLL(r1)
        L_0x009f:
            X.0sa r23 = X.C51965G9l.A0y(r3, r1, r2)
            r1 = -320314376(0xffffffffece863f8, float:-2.247543E27)
            boolean r1 = X.C51967G9n.A1Z(r6, r12, r1)
            java.lang.Object r13 = r0.A01
            boolean r1 = X.C51966G9m.A1U(r6, r13, r1)
            java.lang.Object r0 = r6.ECw()
            if (r1 != 0) goto L_0x00ba
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r0 != r1) goto L_0x00c3
        L_0x00ba:
            r0 = 31
            X.J6Q r0 = X.J6Q.A00(r13, r12, r0)
            r6.FLL(r0)
        L_0x00c3:
            X.0sP r25 = X.C51965G9l.A0z(r3, r0)
            r16 = r8
            r17 = r11
            r24 = r5
            r26 = r4
            r27 = r15
            r28 = r9
            r29 = r2
            r30 = r2
            r13 = r6
            r14 = r10
            r15 = r7
            X.GZS.A00(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00e9
            r0 = 1593426179(0x5ef9c103, float:8.9983344E18)
        L_0x00e6:
            X.0fL.A00(r0)
        L_0x00e9:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x00ec:
            if (r2 != r1) goto L_0x00f4
            boolean r1 = r6.Bwn()
            if (r1 != 0) goto L_0x0259
        L_0x00f4:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0102
            r2 = -496798693(0xffffffffe263741b, float:-1.0489443E21)
            java.lang.String r1 = "com.instagram.creation.genai.magicmod.tools.backdrop.ui.BackdropNineSixteenLayout.<anonymous> (BackdropNineSixteenLayout.kt:137)"
            X.0fL.A01(r2, r1)
        L_0x0102:
            X.5Qk r13 = androidx.compose.ui.Modifier.A00
            java.lang.Object r14 = r0.A08
            androidx.compose.ui.Modifier r14 = (androidx.compose.ui.Modifier) r14
            java.lang.Object r12 = r0.A09
            X.Gn8 r12 = (X.C53378Gn8) r12
            java.lang.Object r11 = r0.A02
            X.60f r11 = (X.C3018260f) r11
            java.lang.Object r10 = r0.A03
            X.Gpy r10 = (X.C53528Gpy) r10
            java.lang.Object r9 = r0.A01
            java.lang.Object r8 = r0.A05
            com.instagram.creation.genai.magicmod.model.MagicModLaunchParams r8 = (com.instagram.creation.genai.magicmod.model.MagicModLaunchParams) r8
            java.lang.Object r7 = r0.A06
            X.60f r7 = (X.C3018260f) r7
            java.lang.Object r1 = r0.A07
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r5 = r0.A04
            X.4gU r5 = (X.C270284gU) r5
            androidx.compose.ui.Alignment r0 = X.C287215Zl.A0E
            r4 = 0
            X.5RD r15 = X.C287675aa.A00(r0, r4)
            int r2 = X.C287425a7.A00(r6)
            r3 = r6
            X.5Wx r3 = (X.C286565Wx) r3
            X.5RM r0 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r14 = X.C287435a8.A01(r6, r14)
            X.C51973G9u.A0y(r6, r3)
            X.C51971G9r.A12(r6, r15, r0)
            X.0sL r15 = X.C287485aD.A02
            boolean r0 = r3.A0K
            if (r0 != 0) goto L_0x014e
            boolean r0 = X.C51972G9s.A1Q(r6, r2)
            if (r0 != 0) goto L_0x0151
        L_0x014e:
            X.C51971G9r.A13(r6, r15, r2)
        L_0x0151:
            X.C51965G9l.A18(r6, r14)
            java.lang.Object r2 = r12.A02
            X.I12 r2 = (X.I12) r2
            r15 = 1
            if (r2 == 0) goto L_0x0160
            boolean r14 = r2.A06
            r0 = 1
            if (r14 == r15) goto L_0x0161
        L_0x0160:
            r0 = 0
        L_0x0161:
            if (r11 == 0) goto L_0x0242
            if (r0 != 0) goto L_0x0242
            r0 = 1707254001(0x65c2a0f1, float:1.1488849E23)
            r6.ExS(r0)
            X.HMG r2 = r10.A02
            X.HMG r0 = X.HMG.ENTER_PROMPT
            if (r2 == r0) goto L_0x0179
            X.HMG r0 = X.HMG.GENERATING
            if (r2 != r0) goto L_0x023e
            boolean r0 = r10.A07
            if (r0 != 0) goto L_0x023e
        L_0x0179:
            r20 = 1
        L_0x017b:
            r0 = -637658515(0xffffffffd9fe1a6d, float:-8.9404624E15)
            r6.ExS(r0)
            r17 = 0
            if (r20 == 0) goto L_0x01b6
            r0 = 2131239160(0x7f0820f8, float:1.809462E38)
            X.60f r0 = X.C54748HRg.A00(r6, r0)
            X.Gf0 r1 = new X.Gf0
            r1.<init>(r0)
            X.5bM r16 = X.C288075bK.A01
            androidx.compose.ui.Modifier r14 = X.C51966G9m.A0U(r13)
            X.5ZQ r0 = X.HYI.A00(r6)
            androidx.compose.ui.Modifier r15 = X.AnonymousClass6FZ.A01(r14, r0)
            X.HMG r0 = X.HMG.GENERATING
            if (r2 != r0) goto L_0x01ab
            r14 = 1101004800(0x41a00000, float:20.0)
            X.5S2 r0 = X.C55299HfS.A00
            androidx.compose.ui.Modifier r13 = X.HRG.A00(r13, r0, r14, r14)
        L_0x01ab:
            androidx.compose.ui.Modifier r13 = r15.Ezh(r13)
            r17 = 0
            r0 = r16
            X.AnonymousClass6G3.A09(r6, r13, r1, r0)
        L_0x01b6:
            X.C286565Wx.A0L(r3, r4)
            java.lang.Object r0 = r12.A04
            X.JwM r0 = (X.C61084JwM) r0
            if (r0 == 0) goto L_0x023b
            java.lang.Object r1 = r0.A01
            X.Hkx r1 = (X.C55638Hkx) r1
        L_0x01c3:
            X.L82 r12 = r10.A01
            if (r12 == 0) goto L_0x0238
            android.graphics.Bitmap r10 = r12.A00
        L_0x01c9:
            r0 = -637629668(0xffffffffd9fe8b1c, float:-8.9559496E15)
            boolean r0 = X.C51967G9n.A1Y(r6, r10, r0)
            java.lang.Object r10 = r6.ECw()
            if (r0 != 0) goto L_0x01da
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r10 != r0) goto L_0x01e6
        L_0x01da:
            if (r12 == 0) goto L_0x0235
            android.graphics.Bitmap r0 = r12.A00
            X.60g r10 = new X.60g
            r10.<init>(r0)
        L_0x01e3:
            r6.FLL(r10)
        L_0x01e6:
            X.60f r10 = (X.C3018260f) r10
            X.C286565Wx.A0L(r3, r4)
            r0 = -637623387(0xffffffffd9fea3a5, float:-8.9593216E15)
            boolean r0 = X.C51967G9n.A1Y(r6, r9, r0)
            java.lang.Object r12 = r6.ECw()
            if (r0 != 0) goto L_0x01fc
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r12 != r0) goto L_0x0202
        L_0x01fc:
            r0 = 22
            X.MP4 r12 = X.C51969G9p.A0z(r6, r9, r0)
        L_0x0202:
            X.0sP r0 = X.C51965G9l.A0z(r3, r12)
            X.HMG r9 = X.HMG.EDIT_MASK
            if (r2 != r9) goto L_0x020c
            r17 = r0
        L_0x020c:
            java.lang.Object r5 = r5.getValue()
            X.HPM r5 = (X.HPM) r5
            boolean r21 = X.C51969G9p.A1a(r2, r9)
            com.instagram.creation.genai.magicmod.model.MagicModPostCaptureTransform r0 = r8.A02
            boolean r22 = X.AnonymousClass7TF.A1W(r2, r9)
            r13 = r10
            r14 = r5
            r15 = r0
            r16 = r1
            r18 = r4
            r19 = r4
            r10 = r6
            r12 = r7
            X.HYA.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
        L_0x022a:
            boolean r0 = X.C51971G9r.A1S(r6, r3, r4)
            if (r0 == 0) goto L_0x00e9
            r0 = -912644660(0xffffffffc99a25cc, float:-1262777.5)
            goto L_0x00e6
        L_0x0235:
            r10 = r17
            goto L_0x01e3
        L_0x0238:
            r10 = r17
            goto L_0x01c9
        L_0x023b:
            r1 = r17
            goto L_0x01c3
        L_0x023e:
            r20 = 0
            goto L_0x017b
        L_0x0242:
            r0 = 1709121348(0x65df1f44, float:1.3170806E23)
            java.lang.Object r5 = X.C51967G9n.A0n(r6, r5, r0)
            X.HPM r5 = (X.HPM) r5
            com.instagram.creation.genai.magicmod.model.MagicModPostCaptureTransform r0 = r8.A02
            r11 = 0
            r13 = 8
            r7 = r5
            r8 = r2
            r9 = r0
            r10 = r1
            r12 = r4
            X.C56276Hvk.A01(r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x022a
        L_0x0259:
            r6.Evl()
            goto L_0x00e9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52681Gat.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
