package X;

public abstract class HY4 {
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        if (r3.AGt(r18) == false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r36, androidx.compose.ui.Modifier r37, java.lang.String r38, int r39, int r40, long r41) {
        /*
            r18 = r41
            r21 = r38
            r22 = r37
            r0 = -580988994(0xffffffffdd5ecfbe, float:-1.00345376E18)
            r3 = r36
            r3.ExV(r0)
            r1 = r40
            r9 = r40 & 1
            r2 = r39
            if (r9 == 0) goto L_0x020f
            r5 = r39 | 6
        L_0x0018:
            r8 = r40 & 2
            if (r8 == 0) goto L_0x0202
            r5 = r5 | 48
        L_0x001e:
            r0 = r2 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x0033
            r0 = r40 & 4
            if (r0 != 0) goto L_0x0030
            r6 = r18
            boolean r4 = r3.AGt(r6)
            r0 = 256(0x100, float:3.59E-43)
            if (r4 != 0) goto L_0x0032
        L_0x0030:
            r0 = 128(0x80, float:1.794E-43)
        L_0x0032:
            r5 = r5 | r0
        L_0x0033:
            r4 = r5 & 147(0x93, float:2.06E-43)
            r0 = 146(0x92, float:2.05E-43)
            if (r4 != r0) goto L_0x0059
            boolean r0 = r3.Bwn()
            if (r0 == 0) goto L_0x0059
            r3.Evl()
        L_0x0042:
            X.5Xd r3 = r3.ASQ()
            if (r3 == 0) goto L_0x0058
            X.J7c r0 = new X.J7c
            r4 = r0
            r5 = r22
            r6 = r21
            r7 = r2
            r8 = r1
            r9 = r18
            r4.<init>(r5, r6, r7, r8, r9)
            r3.A06 = r0
        L_0x0058:
            return
        L_0x0059:
            r3.Ewr()
            r0 = r39 & 1
            r20 = 0
            if (r0 == 0) goto L_0x01ee
            boolean r0 = r3.Aw3()
            if (r0 != 0) goto L_0x01ee
            int r5 = X.C51971G9r.A06(r3, r1, r5)
        L_0x006c:
            boolean r0 = X.C51967G9n.A1S(r3)
            if (r0 == 0) goto L_0x007a
            r4 = 753909610(0x2cefbf6a, float:6.81404E-12)
            java.lang.String r0 = "com.instagram.creation.genai.common.ui.MetaAiStyledSparkleLoadingAnimation (MetaAiStyledSparkleLoadingAnimation.kt:32)"
            X.0fL.A01(r4, r0)
        L_0x007a:
            X.3Ja r0 = X.C55304HfX.A00
            X.3JZ r0 = (X.AnonymousClass3JZ) r0
            X.3JY r0 = r0.A00
            java.lang.String r0 = r0.A02
            android.net.Uri r0 = X.0cp.A03(r0)
            java.lang.String r0 = X.DbT.A10(r0)
            X.S5B r9 = new X.S5B
            r9.<init>(r0)
            r6 = 0
            r0 = 1388713460(0x52c615f4, float:4.25385918E11)
            r3.ExT(r0)
            java.lang.String r28 = "fonts/"
            java.lang.String r29 = ".ttf"
            r0 = 615(0x267, float:8.62E-43)
            java.lang.String r8 = X.Pxd.A00(r0)
            r17 = 3
            X.GQW r7 = new X.GQW
            r4 = r17
            r0 = r20
            r7.<init>(r4, r0)
            android.content.Context r11 = X.C51970G9q.A0N(r3)
            r0 = -3686930(0xffffffffffc7bdee, float:NaN)
            r3.ExT(r0)
            boolean r0 = r3.AGu(r9)
            java.lang.Object r10 = r3.ECw()
            if (r0 != 0) goto L_0x00c3
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r10 != r0) goto L_0x00cc
        L_0x00c3:
            X.IFm r0 = new X.IFm
            r0.<init>()
            androidx.compose.runtime.ParcelableSnapshotMutableState r10 = X.G9t.A0o(r3, r0)
        L_0x00cc:
            X.5Wx r0 = X.C51965G9l.A0H(r3, r6)
            X.5Oz r10 = (X.C284945Oz) r10
            r4 = -3686552(0xffffffffffc7bf68, float:NaN)
            r3.ExT(r4)
            boolean r4 = X.C51971G9r.A1U(r3, r9, r8)
            java.lang.Object r12 = r3.ECw()
            if (r4 != 0) goto L_0x00e6
            java.lang.Object r4 = X.AnonymousClass5XT.A00
            if (r12 != r4) goto L_0x00ed
        L_0x00e6:
            X.SSQ r4 = com.airbnb.lottie.compose.RememberLottieCompositionKt.A00(r11, r9, r8)
            r3.FLL(r4)
        L_0x00ed:
            X.C286565Wx.A0L(r0, r6)
            X.TTC r4 = new X.TTC
            r24 = r11
            r25 = r10
            r26 = r9
            r27 = r20
            r30 = r8
            r31 = r20
            r32 = r7
            r23 = r4
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32)
            X.C286645Xf.A02(r3, r9, r8, r4)
            java.lang.Object r10 = r10.getValue()
            X.IFm r10 = (X.C56865IFm) r10
            X.C286565Wx.A0L(r0, r6)
            X.5RD r11 = X.C51966G9m.A0a(r6)
            int r8 = X.C287425a7.A00(r3)
            X.5RM r9 = X.C286565Wx.A04(r0)
            r4 = r22
            androidx.compose.ui.Modifier r7 = X.C287435a8.A01(r3, r4)
            X.0sa r15 = X.C287485aD.A00
            X.C51973G9u.A0z(r3, r0, r15)
            X.0sL r14 = X.C287485aD.A03
            X.0sL r16 = X.C51969G9p.A0w(r3, r11, r9, r14)
            X.0sL r13 = X.C287485aD.A02
            boolean r4 = r0.A0K
            if (r4 != 0) goto L_0x013a
            boolean r4 = X.C51972G9s.A1Q(r3, r8)
            if (r4 != 0) goto L_0x013d
        L_0x013a:
            X.C51971G9r.A13(r3, r13, r8)
        L_0x013d:
            X.0sL r12 = X.C51966G9m.A1K(r3, r7)
            X.5dj r4 = X.C289515dj.A00
            X.5Qk r8 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r7 = X.C51965G9l.A0L(r4, r8)
            X.5RD r4 = X.C51968G9o.A0X(r3)
            int r11 = X.C287425a7.A00(r3)
            X.5RM r9 = X.C286565Wx.A04(r0)
            androidx.compose.ui.Modifier r7 = X.C287435a8.A01(r3, r7)
            X.C51973G9u.A0z(r3, r0, r15)
            X.C287595aO.A00(r3, r4, r14)
            r4 = r16
            boolean r4 = X.C51965G9l.A1Y(r3, r0, r9, r4)
            if (r4 != 0) goto L_0x016d
            boolean r4 = X.C51972G9s.A1Q(r3, r11)
            if (r4 != 0) goto L_0x0170
        L_0x016d:
            X.C51971G9r.A13(r3, r13, r11)
        L_0x0170:
            X.C287595aO.A00(r3, r7, r12)
            r4 = 1117913088(0x42a20000, float:81.0)
            androidx.compose.ui.Modifier r25 = X.C287205Zk.A0C(r8, r4)
            X.5Oz r4 = r10.A01
            java.lang.Object r4 = r4.getValue()
            X.S7N r4 = (X.S7N) r4
            r7 = 0
            r31 = 2147483647(0x7fffffff, float:NaN)
            r32 = 1572912(0x180030, float:2.204119E-39)
            r34 = 262076(0x3ffbc, float:3.67247E-40)
            r26 = r20
            r27 = r4
            r28 = r20
            r29 = r20
            r30 = r7
            r33 = r6
            r35 = r6
            r36 = r6
            r37 = r6
            r38 = r6
            r39 = r6
            r40 = r6
            r41 = r6
            r42 = r6
            r23 = r3
            r24 = r20
            X.C56175Hu4.A00(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            r4 = 580444446(0x2298e11e, float:4.1438035E-18)
            r3.ExS(r4)
            if (r21 == 0) goto L_0x01e0
            X.5Z4 r25 = X.C51966G9m.A0g(r3)
            r4 = 1061997773(0x3f4ccccd, float:0.8)
            androidx.compose.ui.Modifier r6 = X.C287205Zk.A07(r8, r4)
            r4 = 1098907648(0x41800000, float:16.0)
            androidx.compose.ui.Modifier r24 = X.C287195Zj.A09(r6, r7, r4)
            r28 = 2
            int r30 = X.C51965G9l.A03(r5)
            r4 = r5 & 896(0x380, float:1.256E-42)
            r30 = r30 | r4
            r31 = 390(0x186, float:5.47E-43)
            r32 = 11128(0x2b78, float:1.5594E-41)
            r26 = r21
            r27 = r17
            r29 = r28
            r33 = r18
            X.AnonymousClass5ZZ.A0B(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
        L_0x01e0:
            boolean r0 = X.C51973G9u.A1R(r3, r0)
            if (r0 == 0) goto L_0x0042
            r0 = -1490915868(0xffffffffa7226de4, float:-2.2541588E-15)
            X.0fL.A00(r0)
            goto L_0x0042
        L_0x01ee:
            if (r9 == 0) goto L_0x01f2
            X.5Qk r22 = androidx.compose.ui.Modifier.A00
        L_0x01f2:
            if (r8 == 0) goto L_0x01f6
            r21 = r20
        L_0x01f6:
            r0 = r40 & 4
            if (r0 == 0) goto L_0x006c
            long r18 = X.C51966G9m.A0M(r3)
            r5 = r5 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x006c
        L_0x0202:
            r0 = r39 & 48
            if (r0 != 0) goto L_0x001e
            r0 = r21
            int r0 = X.G9t.A0P(r3, r0)
            r5 = r5 | r0
            goto L_0x001e
        L_0x020f:
            r0 = r39 & 6
            if (r0 != 0) goto L_0x021d
            r0 = r22
            int r5 = X.G9t.A0O(r3, r0)
            r5 = r5 | r39
            goto L_0x0018
        L_0x021d:
            r5 = r2
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HY4.A00(X.5Wy, androidx.compose.ui.Modifier, java.lang.String, int, int, long):void");
    }
}
