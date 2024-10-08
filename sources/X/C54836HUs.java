package X;

/* renamed from: X.HUs  reason: case insensitive filesystem */
public abstract class C54836HUs {
    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01b4, code lost:
        if (r15 == com.instagram.api.schemas.LineType.NONE) goto L_0x01b6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02f9  */
    /* JADX WARNING: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ed  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r52, androidx.compose.ui.Modifier r53, com.instagram.api.schemas.LineType r54, com.instagram.common.typedurl.ImageUrl r55, java.lang.String r56, java.lang.String r57, java.lang.String r58, X.C62320sa r59, int r60, int r61, int r62, boolean r63, boolean r64, boolean r65, boolean r66) {
        /*
            r26 = r53
            r6 = 0
            r15 = r54
            X.0qQ.A0B(r15, r6)
            r14 = 4
            r51 = r56
            r50 = r57
            r49 = r59
            r2 = r51
            r1 = r49
            r0 = r50
            X.C51973G9u.A0s(r14, r2, r1, r0)
            r0 = -269377574(0xffffffffeff19fda, float:-1.4955827E29)
            r1 = r52
            r1.ExV(r0)
            r4 = r62
            r0 = r62 & 1
            r3 = r60
            if (r0 == 0) goto L_0x033f
            r0 = r60 | 6
        L_0x002a:
            r2 = r62 & 2
            r24 = r63
            if (r2 == 0) goto L_0x0332
            r0 = r0 | 48
        L_0x0032:
            r2 = r62 & 4
            r23 = r64
            if (r2 == 0) goto L_0x0325
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x003a:
            r2 = r62 & 8
            r22 = r65
            if (r2 == 0) goto L_0x0318
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x0042:
            r2 = r62 & 16
            if (r2 == 0) goto L_0x030b
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x0048:
            r5 = r62 & 32
            r2 = 196608(0x30000, float:2.75506E-40)
            r52 = r55
            if (r5 != 0) goto L_0x005a
            r2 = r60 & r2
            if (r2 != 0) goto L_0x005b
            r2 = r52
            int r2 = X.G9t.A0T(r1, r2)
        L_0x005a:
            r0 = r0 | r2
        L_0x005b:
            r5 = r62 & 64
            r2 = 1572864(0x180000, float:2.204052E-39)
            r21 = r66
            if (r5 != 0) goto L_0x006d
            r2 = r60 & r2
            if (r2 != 0) goto L_0x006e
            r2 = r21
            int r2 = X.G9t.A0e(r1, r2)
        L_0x006d:
            r0 = r0 | r2
        L_0x006e:
            r5 = r4 & 128(0x80, float:1.794E-43)
            r2 = 12582912(0xc00000, float:1.7632415E-38)
            if (r5 != 0) goto L_0x007e
            r2 = r2 & r60
            if (r2 != 0) goto L_0x007f
            r2 = r49
            int r2 = X.G9t.A0L(r1, r2)
        L_0x007e:
            r0 = r0 | r2
        L_0x007f:
            r5 = r4 & 256(0x100, float:3.59E-43)
            r2 = 100663296(0x6000000, float:2.4074124E-35)
            if (r5 != 0) goto L_0x008f
            r2 = r2 & r60
            if (r2 != 0) goto L_0x0090
            r2 = r50
            int r2 = X.G9t.A0W(r1, r2)
        L_0x008f:
            r0 = r0 | r2
        L_0x0090:
            r5 = r4 & 512(0x200, float:7.175E-43)
            r2 = 805306368(0x30000000, float:4.656613E-10)
            r25 = r58
            if (r5 != 0) goto L_0x00a2
            r2 = r2 & r60
            if (r2 != 0) goto L_0x00a3
            r2 = r25
            int r2 = X.G9t.A0X(r1, r2)
        L_0x00a2:
            r0 = r0 | r2
        L_0x00a3:
            r7 = r4 & 1024(0x400, float:1.435E-42)
            r48 = r61
            if (r7 == 0) goto L_0x02f9
            r8 = r61 | 6
        L_0x00ab:
            r2 = 306783379(0x12492493, float:6.34695E-28)
            r5 = r0 & r2
            r2 = 306783378(0x12492492, float:6.3469493E-28)
            if (r5 != r2) goto L_0x00ed
            r5 = r8 & 3
            r2 = 2
            if (r5 != r2) goto L_0x00ed
            boolean r2 = r1.Bwn()
            if (r2 == 0) goto L_0x00ed
            r1.Evl()
        L_0x00c3:
            X.5Xd r1 = r1.ASQ()
            if (r1 == 0) goto L_0x00ec
            X.JCU r0 = new X.JCU
            r39 = r0
            r40 = r26
            r41 = r15
            r42 = r52
            r43 = r51
            r44 = r50
            r45 = r25
            r46 = r49
            r47 = r3
            r49 = r4
            r50 = r24
            r51 = r23
            r52 = r22
            r53 = r21
            r39.<init>(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)
            r1.A06 = r0
        L_0x00ec:
            return
        L_0x00ed:
            if (r7 == 0) goto L_0x00f1
            X.5Qk r26 = androidx.compose.ui.Modifier.A00
        L_0x00f1:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x00ff
            r5 = -274710324(0xffffffffefa040cc, float:-9.919187E28)
            java.lang.String r2 = "com.instagram.barcelona.feed.post.ui.PostCollapsedSummary (PostCollapsedSummary.kt:54)"
            X.0fL.A01(r5, r2)
        L_0x00ff:
            r28 = 0
            r2 = 0
            r7 = r26
            r5 = r22
            androidx.compose.ui.Modifier r8 = X.AnonymousClass6DP.A00(r7, r2, r5)
            r7 = 1090519040(0x41000000, float:8.0)
            if (r64 == 0) goto L_0x0110
            r7 = 1098907648(0x41800000, float:16.0)
        L_0x0110:
            r5 = 1082130432(0x40800000, float:4.0)
            if (r65 != 0) goto L_0x0116
            r5 = 1098907648(0x41800000, float:16.0)
        L_0x0116:
            androidx.compose.ui.Modifier r8 = X.C287195Zj.A0B(r8, r2, r7, r2, r5)
            java.lang.Integer r5 = X.AnonymousClass05K.A0C
            java.lang.Integer r7 = X.C304236Cr.A00(r15, r5)
            r5 = r24
            androidx.compose.ui.Modifier r7 = X.C304246Cs.A00(r8, r7, r5, r6)
            r5 = 1098907648(0x41800000, float:16.0)
            androidx.compose.ui.Modifier r7 = X.C287195Zj.A0B(r7, r2, r2, r5, r2)
            X.5RD r11 = X.C51968G9o.A0V(r1)
            int r9 = X.C287425a7.A00(r1)
            r5 = r1
            X.5Wx r5 = (X.C286565Wx) r5
            X.5RM r10 = X.C286565Wx.A04(r5)
            androidx.compose.ui.Modifier r8 = X.C287435a8.A01(r1, r7)
            X.0sa r20 = X.C287485aD.A00
            r7 = r20
            X.C51973G9u.A0z(r1, r5, r7)
            X.0sL r19 = X.C287485aD.A03
            r7 = r19
            X.0sL r18 = X.C51969G9p.A0w(r1, r11, r10, r7)
            X.0sL r17 = X.C287485aD.A02
            boolean r7 = r5.A0K
            if (r7 != 0) goto L_0x015a
            boolean r7 = X.C51972G9s.A1Q(r1, r9)
            if (r7 != 0) goto L_0x015f
        L_0x015a:
            r7 = r17
            X.C51971G9r.A13(r1, r7, r9)
        L_0x015f:
            X.0sL r16 = X.C51966G9m.A1K(r1, r8)
            X.6FX r13 = X.AnonymousClass6FX.A00
            r43 = 0
            int r7 = r0 >> 15
            r41 = r7 & 14
            r42 = 30
            r39 = r1
            r40 = r52
            X.2DO r12 = X.C304106Ce.A00(r39, r40, r41, r42, r43)
            X.5Qk r11 = androidx.compose.ui.Modifier.A00
            r7 = 1114636288(0x42700000, float:60.0)
            androidx.compose.ui.Modifier r8 = X.C287205Zk.A0D(r11, r7)
            androidx.compose.ui.Alignment r7 = X.C287215Zl.A0C
            androidx.compose.ui.Modifier r9 = X.C287205Zk.A02(r7, r8)
            r7 = -186444366(0xfffffffff4e315b2, float:-1.4393206E32)
            r1.ExS(r7)
            r7 = 29360128(0x1c00000, float:7.052966E-38)
            r8 = r0 & r7
            r7 = 8388608(0x800000, float:1.17549435E-38)
            boolean r7 = X.AnonymousClass7TF.A1S(r8, r7)
            java.lang.Object r8 = r1.ECw()
            if (r7 != 0) goto L_0x019d
            java.lang.Object r7 = X.AnonymousClass5XT.A00
            if (r8 != r7) goto L_0x01a5
        L_0x019d:
            r8 = 25
            r7 = r49
            X.IwM r8 = X.C58713IwM.A01(r1, r7, r8)
        L_0x01a5:
            androidx.compose.ui.Modifier r8 = X.G9w.A0C(r1, r5, r9, r8)
            r7 = 1099956224(0x41900000, float:18.0)
            androidx.compose.ui.Modifier r10 = X.C287205Zk.A0C(r8, r7)
            if (r63 == 0) goto L_0x01b6
            com.instagram.api.schemas.LineType r7 = com.instagram.api.schemas.LineType.NONE
            r9 = 1
            if (r15 != r7) goto L_0x01b7
        L_0x01b6:
            r9 = 0
        L_0x01b7:
            r8 = 1090519040(0x41000000, float:8.0)
            X.0qQ.A0B(r10, r6)
            if (r9 == 0) goto L_0x01c7
            com.instagram.barcelona.common.ui.threaddecoration.ThreadDecorationStartOverrideModifierElement r7 = new com.instagram.barcelona.common.ui.threaddecoration.ThreadDecorationStartOverrideModifierElement
            r7.<init>(r8)
            androidx.compose.ui.Modifier r10 = r10.Ezh(r7)
        L_0x01c7:
            long r7 = X.C51966G9m.A0F(r1)
            X.5ZQ r9 = X.AnonymousClass5ZN.A00
            androidx.compose.ui.Modifier r7 = X.C304816Fi.A03(r10, r9, r2, r7)
            androidx.compose.ui.Modifier r7 = X.AnonymousClass6FZ.A01(r7, r9)
            X.AnonymousClass6G3.A03(r1, r7, r12)
            X.5Z4 r8 = X.C51966G9m.A0h(r1)
            r7 = -186430748(0xfffffffff4e34ae4, float:-1.4406376E32)
            r1.ExS(r7)
            boolean r9 = X.C51974G9v.A1W(r0)
            boolean r7 = X.C51973G9u.A1K(r0)
            r9 = r9 | r7
            boolean r7 = X.C51973G9u.A1L(r0)
            boolean r9 = X.C51968G9o.A1U(r1, r8, r9, r7)
            java.lang.Object r7 = r1.ECw()
            if (r9 != 0) goto L_0x01fd
            java.lang.Object r9 = X.AnonymousClass5XT.A00
            if (r7 != r9) goto L_0x022c
        L_0x01fd:
            X.6Bd r10 = X.C51969G9p.A0b()
            X.5ZB r7 = r8.A02
            int r8 = r10.A00(r7)
            r7 = r51
            r10.A09(r7)     // Catch:{ all -> 0x034e }
            r10.A04(r8)
            java.lang.String r9 = " "
            r10.A09(r9)
            if (r66 == 0) goto L_0x0220
            java.lang.String r8 = "verified"
            java.lang.String r7 = "�"
            X.C52422GSa.A00(r10, r8, r7)
            r10.A09(r9)
        L_0x0220:
            r7 = r50
            r10.A09(r7)
            X.5Tq r7 = r10.A02()
            r1.FLL(r7)
        L_0x022c:
            X.5Tq r7 = (X.C286025Tq) r7
            X.C286565Wx.A0L(r5, r6)
            r8 = -186417477(0xfffffffff4e37ebb, float:-1.4419211E32)
            java.lang.Object r8 = X.C51967G9n.A0m(r1, r8)
            java.lang.Object r9 = X.AnonymousClass5XT.A00
            if (r8 != r9) goto L_0x025f
            r8 = 14
            long r30 = X.AnonymousClass5Z7.A01(r8)
            long r32 = X.AnonymousClass5Z7.A01(r8)
            X.GQa r8 = new X.GQa
            r29 = r8
            r34 = r14
            r29.<init>(r30, r32, r34)
            X.0sK r10 = X.C55313Hfg.A00
            X.GQb r9 = new X.GQb
            r9.<init>(r8, r10)
            java.lang.String r8 = "verified"
            java.util.Map r8 = X.AnonymousClass7TF.A0w(r8, r9)
            r1.FLL(r8)
        L_0x025f:
            java.util.Map r8 = (java.util.Map) r8
            X.C286565Wx.A0L(r5, r6)
            X.5Zp r9 = X.C287215Zl.A04
            androidx.compose.ui.Modifier r9 = r13.AB1(r9, r11)
            r38 = 2
            androidx.compose.ui.Modifier r9 = r13.A00(r9)
            X.5RD r12 = X.C51969G9p.A0Z(r1, r6)
            int r10 = X.C287425a7.A00(r1)
            X.5RM r13 = X.C286565Wx.A04(r5)
            androidx.compose.ui.Modifier r14 = X.C287435a8.A01(r1, r9)
            r9 = r20
            X.C51973G9u.A0z(r1, r5, r9)
            r9 = r19
            X.C287595aO.A00(r1, r12, r9)
            r9 = r18
            boolean r9 = X.C51965G9l.A1Y(r1, r5, r13, r9)
            if (r9 != 0) goto L_0x0298
            boolean r9 = X.C51972G9s.A1Q(r1, r10)
            if (r9 != 0) goto L_0x029d
        L_0x0298:
            r9 = r17
            X.C51971G9r.A13(r1, r9, r10)
        L_0x029d:
            r9 = r16
            X.C287595aO.A00(r1, r14, r9)
            r41 = 54
            r42 = 13310(0x33fe, float:1.8651E-41)
            r29 = r7
            r30 = r28
            r31 = r28
            r32 = r28
            r33 = r28
            r34 = r8
            r35 = r28
            r36 = r6
            r37 = r6
            r39 = r38
            r40 = r6
            r45 = r43
            r47 = r6
            r27 = r1
            X.AnonymousClass5ZZ.A02(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r45, r47)
            r6 = 1891599408(0x70bf8430, float:4.7417153E29)
            r1.ExS(r6)
            if (r58 == 0) goto L_0x02eb
            boolean r6 = X.00l.A0W(r25)
            if (r6 != 0) goto L_0x02eb
            r6 = 1082130432(0x40800000, float:4.0)
            androidx.compose.ui.Modifier r7 = X.C287195Zj.A0B(r11, r2, r6, r2, r2)
            long r11 = X.C51966G9m.A0D(r1)
            int r0 = r0 >> 27
            r0 = r0 & 14
            r9 = r0 | 48
            r10 = 32760(0x7ff8, float:4.5907E-41)
            r8 = r25
            r6 = r1
            X.AnonymousClass5ZZ.A0c(r6, r7, r8, r9, r10, r11)
        L_0x02eb:
            boolean r0 = X.C51973G9u.A1R(r1, r5)
            if (r0 == 0) goto L_0x00c3
            r0 = 2091044949(0x7ca2d055, float:6.7630205E36)
            X.0fL.A00(r0)
            goto L_0x00c3
        L_0x02f9:
            r2 = r61 & 6
            if (r2 != 0) goto L_0x0307
            r2 = r26
            int r2 = X.G9t.A0O(r1, r2)
            r8 = r61 | r2
            goto L_0x00ab
        L_0x0307:
            r8 = r48
            goto L_0x00ab
        L_0x030b:
            r2 = r3 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x0048
            r2 = r51
            int r2 = X.G9t.A0S(r1, r2)
            r0 = r0 | r2
            goto L_0x0048
        L_0x0318:
            r2 = r3 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0042
            r2 = r22
            int r2 = X.G9t.A0b(r1, r2)
            r0 = r0 | r2
            goto L_0x0042
        L_0x0325:
            r2 = r3 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x003a
            r2 = r23
            int r2 = X.G9t.A0a(r1, r2)
            r0 = r0 | r2
            goto L_0x003a
        L_0x0332:
            r2 = r60 & 48
            if (r2 != 0) goto L_0x0032
            r2 = r24
            int r2 = X.G9t.A0Z(r1, r2)
            r0 = r0 | r2
            goto L_0x0032
        L_0x033f:
            r0 = r60 & 6
            if (r0 != 0) goto L_0x034b
            int r0 = X.G9t.A0O(r1, r15)
            r0 = r0 | r60
            goto L_0x002a
        L_0x034b:
            r0 = r3
            goto L_0x002a
        L_0x034e:
            r0 = move-exception
            r10.A04(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54836HUs.A00(X.5Wy, androidx.compose.ui.Modifier, com.instagram.api.schemas.LineType, com.instagram.common.typedurl.ImageUrl, java.lang.String, java.lang.String, java.lang.String, X.0sa, int, int, int, boolean, boolean, boolean, boolean):void");
    }
}
