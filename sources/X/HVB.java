package X;

public abstract class HVB {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: X.JTe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: X.JTe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v4, resolved type: X.JTe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v5, resolved type: X.JTe} */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0186, code lost:
        if (X.182.A06(X.0Tu.A05, r14, 36325566374753332L) != false) goto L_0x0188;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01b3, code lost:
        if (r11 == X.AnonymousClass5XT.A00) goto L_0x01b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01ea, code lost:
        if (r12 == X.AnonymousClass5XT.A00) goto L_0x01ec;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02dc  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0127  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r47, androidx.compose.ui.Modifier r48, X.AnonymousClass6D9 r49, X.AnonymousClass6D8 r50, X.AnonymousClass3WR r51, java.lang.String r52, java.lang.String r53, X.C62320sa r54, float r55, int r56, int r57, int r58, int r59, boolean r60, boolean r61, boolean r62, boolean r63, boolean r64, boolean r65, boolean r66) {
        /*
            r24 = r53
            r20 = r66
            r23 = r56
            r22 = r63
            r17 = r64
            r21 = r65
            r18 = r48
            r1 = 0
            r44 = r51
            r46 = r49
            r2 = r46
            r0 = r44
            boolean r39 = X.AnonymousClass7TF.A1U(r1, r2, r0)
            r19 = 2
            r45 = r50
            r32 = r54
            r3 = r19
            r2 = r32
            r0 = r45
            X.AnonymousClass7TF.A1F(r0, r3, r2)
            r0 = -441221368(0xffffffffe5b37f08, float:-1.0595586E23)
            r5 = r47
            r5.ExV(r0)
            r2 = r59
            r0 = r59 & 1
            r4 = r57
            if (r0 == 0) goto L_0x034c
            r0 = r57 | 6
        L_0x003c:
            r3 = r59 & 2
            if (r3 == 0) goto L_0x033f
            r0 = r0 | 48
        L_0x0042:
            r3 = r59 & 4
            r10 = 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x0332
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r3 = r59 & 8
            r9 = 2048(0x800, float:2.87E-42)
            r33 = r55
            if (r3 == 0) goto L_0x0325
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x0054:
            r3 = r59 & 16
            r8 = 8192(0x2000, float:1.14794E-41)
            r43 = r60
            if (r3 == 0) goto L_0x0318
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x005e:
            r3 = r59 & 32
            r15 = 196608(0x30000, float:2.75506E-40)
            r42 = r61
            if (r3 == 0) goto L_0x030b
            r0 = r0 | r15
        L_0x0067:
            r6 = r59 & 64
            r3 = 1572864(0x180000, float:2.204052E-39)
            r25 = r52
            if (r6 != 0) goto L_0x0079
            r3 = r57 & r3
            if (r3 != 0) goto L_0x007a
            r3 = r25
            int r3 = X.G9t.A0U(r5, r3)
        L_0x0079:
            r0 = r0 | r3
        L_0x007a:
            r6 = r2 & 128(0x80, float:1.794E-43)
            r3 = 12582912(0xc00000, float:1.7632415E-38)
            r41 = r62
            if (r6 != 0) goto L_0x008c
            r3 = r3 & r57
            if (r3 != 0) goto L_0x008d
            r3 = r41
            int r3 = X.G9t.A0f(r5, r3)
        L_0x008c:
            r0 = r0 | r3
        L_0x008d:
            r6 = r2 & 256(0x100, float:3.59E-43)
            r3 = 100663296(0x6000000, float:2.4074124E-35)
            if (r6 != 0) goto L_0x009d
            r3 = r3 & r57
            if (r3 != 0) goto L_0x009e
            r3 = r32
            int r3 = X.G9t.A0M(r5, r3)
        L_0x009d:
            r0 = r0 | r3
        L_0x009e:
            r14 = r2 & 512(0x200, float:7.175E-43)
            r3 = 805306368(0x30000000, float:4.656613E-10)
            if (r14 != 0) goto L_0x00ae
            r3 = r57 & r3
            if (r3 != 0) goto L_0x00af
            r3 = r18
            int r3 = X.G9t.A0X(r5, r3)
        L_0x00ae:
            r0 = r0 | r3
        L_0x00af:
            r13 = r2 & 1024(0x400, float:1.435E-42)
            r3 = r58
            if (r13 == 0) goto L_0x02fa
            r6 = r58 | 6
        L_0x00b7:
            r12 = r2 & 2048(0x800, float:2.87E-42)
            if (r12 == 0) goto L_0x02ed
            r6 = r6 | 48
        L_0x00bd:
            r11 = r2 & 4096(0x1000, float:5.74E-42)
            if (r11 == 0) goto L_0x02dc
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x00c3:
            r10 = r2 & 8192(0x2000, float:1.14794E-41)
            if (r10 == 0) goto L_0x02cb
            r6 = r6 | 3072(0xc00, float:4.305E-42)
        L_0x00c9:
            r9 = r2 & 16384(0x4000, float:2.2959E-41)
            if (r9 == 0) goto L_0x02ba
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
        L_0x00cf:
            r7 = 32768(0x8000, float:4.5918E-41)
            r8 = r59 & r7
            if (r8 == 0) goto L_0x02ad
            r6 = r6 | r15
        L_0x00d7:
            r7 = 306783379(0x12492493, float:6.34695E-28)
            r15 = r0 & r7
            r7 = 306783378(0x12492492, float:6.3469493E-28)
            if (r15 != r7) goto L_0x0127
            r7 = 74899(0x12493, float:1.04956E-40)
            r7 = r7 & r6
            r15 = 74898(0x12492, float:1.04954E-40)
            if (r7 != r15) goto L_0x0127
            boolean r7 = r5.Bwn()
            if (r7 == 0) goto L_0x0127
            r5.Evl()
        L_0x00f3:
            X.5Xd r1 = r5.ASQ()
            if (r1 == 0) goto L_0x0126
            X.JDO r0 = new X.JDO
            r26 = r24
            r27 = r32
            r28 = r33
            r29 = r23
            r30 = r4
            r31 = r3
            r32 = r2
            r33 = r43
            r34 = r42
            r35 = r41
            r36 = r22
            r37 = r17
            r38 = r21
            r39 = r20
            r20 = r0
            r21 = r18
            r22 = r46
            r23 = r45
            r24 = r44
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            r1.A06 = r0
        L_0x0126:
            return
        L_0x0127:
            if (r14 == 0) goto L_0x012b
            X.5Qk r18 = androidx.compose.ui.Modifier.A00
        L_0x012b:
            if (r13 == 0) goto L_0x012f
            r24 = 0
        L_0x012f:
            if (r12 == 0) goto L_0x0133
            r23 = 0
        L_0x0133:
            r7 = r22
            boolean r22 = X.C51966G9m.A1Q(r11, r7)
            r7 = r17
            boolean r17 = X.C51966G9m.A1R(r10, r7)
            if (r9 == 0) goto L_0x0143
            r21 = 0
        L_0x0143:
            r7 = r20
            boolean r20 = X.C51966G9m.A1Q(r8, r7)
            boolean r7 = X.0fL.A02()
            if (r7 == 0) goto L_0x0157
            r8 = -850258715(0xffffffffcd5214e5, float:-2.20286544E8)
            java.lang.String r7 = "com.instagram.barcelona.feed.post.video.PostVideo (PostVideo.kt:57)"
            X.0fL.A01(r8, r7)
        L_0x0157:
            r7 = 1694066833(0x64f96891, float:3.6806193E22)
            r5.ExS(r7)
            if (r52 != 0) goto L_0x02a9
            r7 = 2131953703(0x7f130827, float:1.9543884E38)
            java.lang.String r31 = X.C288035bG.A00(r5, r7)
        L_0x0166:
            r7 = r5
            X.5Wx r7 = (X.C286565Wx) r7
            r8 = r22
            java.lang.Boolean r8 = X.C51967G9n.A0f(r7, r8)
            X.5Oz r8 = X.C287175Zh.A00(r5, r8)
            com.instagram.common.session.UserSession r14 = X.C51970G9q.A0f(r5)
            if (r20 != 0) goto L_0x0188
            X.0Tu r11 = X.0Tu.A05
            r9 = 36325566374753332(0x810de900083434, double:3.03577267448469E-306)
            boolean r9 = X.182.A06(r11, r14, r9)
            r34 = 0
            if (r9 == 0) goto L_0x018a
        L_0x0188:
            r34 = 1
        L_0x018a:
            X.0gF r10 = X.C60340gF.A00
            r9 = 1694078688(0x64f996e0, float:3.6832888E22)
            r5.ExS(r9)
            r9 = r0 & 896(0x380, float:1.256E-42)
            r11 = 256(0x100, float:3.59E-43)
            boolean r15 = X.AnonymousClass7TF.A1S(r9, r11)
            r11 = 57344(0xe000, float:8.0356E-41)
            r13 = r6 & r11
            boolean r12 = X.C51972G9s.A1K(r13)
            r12 = r12 | r15
            r16 = r0 & 14
            boolean r11 = X.C51972G9s.A1I(r16)
            r12 = r12 | r11
            java.lang.Object r11 = r5.ECw()
            if (r12 != 0) goto L_0x01b5
            java.lang.Object r12 = X.AnonymousClass5XT.A00
            if (r11 != r12) goto L_0x01c7
        L_0x01b5:
            r38 = 0
            X.JTe r11 = new X.JTe
            r35 = r11
            r36 = r45
            r37 = r46
            r40 = r21
            r35.<init>(r36, r37, r38, r39, r40)
            r5.FLL(r11)
        L_0x01c7:
            X.C51968G9o.A1E(r5, r7, r11, r10)
            r11 = 1694086739(0x64f9b653, float:3.6851017E22)
            r5.ExS(r11)
            r11 = 256(0x100, float:3.59E-43)
            r12 = 16384(0x4000, float:2.2959E-41)
            boolean r15 = X.AnonymousClass7TF.A1S(r9, r11)
            boolean r13 = X.AnonymousClass7TF.A1S(r13, r12)
            r13 = r13 | r15
            boolean r12 = X.C51972G9s.A1I(r16)
            r13 = r13 | r12
            java.lang.Object r12 = r5.ECw()
            if (r13 != 0) goto L_0x01ec
            java.lang.Object r13 = X.AnonymousClass5XT.A00
            if (r12 != r13) goto L_0x0200
        L_0x01ec:
            r38 = 0
            X.JTe r12 = new X.JTe
            r35 = r12
            r36 = r45
            r37 = r46
            r39 = r19
            r40 = r21
            r35.<init>(r36, r37, r38, r39, r40)
            r5.FLL(r12)
        L_0x0200:
            X.C51968G9o.A1E(r5, r7, r12, r10)
            r10 = 1694095196(0x64f9d75c, float:3.687006E22)
            r5.ExS(r10)
            if (r17 == 0) goto L_0x029f
            r10 = 1694098344(0x64f9e3a8, float:3.687715E22)
            boolean r9 = X.C51972G9s.A1R(r5, r10, r9, r11)
            java.lang.Object r10 = r5.ECw()
            if (r9 != 0) goto L_0x021c
            java.lang.Object r9 = X.AnonymousClass5XT.A00
            if (r10 != r9) goto L_0x0224
        L_0x021c:
            r10 = r19
            r9 = r45
            X.IwG r10 = X.C58707IwG.A00(r5, r9, r10)
        L_0x0224:
            X.0sa r11 = X.C51965G9l.A0y(r7, r10, r1)
            r9 = 1694110492(0x64fa131c, float:3.6904504E22)
            boolean r9 = X.C51967G9n.A1Y(r5, r8, r9)
            java.lang.Object r10 = r5.ECw()
            if (r9 != 0) goto L_0x0239
            java.lang.Object r9 = X.AnonymousClass5XT.A00
            if (r10 != r9) goto L_0x023e
        L_0x0239:
            r9 = 3
            X.IwG r10 = X.C58707IwG.A00(r5, r8, r9)
        L_0x023e:
            X.0sa r12 = X.C51965G9l.A0y(r7, r10, r1)
            int r8 = r0 >> 3
            r13 = r8 & 14
            int r8 = r0 << 9
            r8 = r8 & 7168(0x1c00, float:1.0045E-41)
            r13 = r13 | r8
            r8 = r5
            r9 = r46
            r10 = r44
            X.HVD.A00(r8, r9, r10, r11, r12, r13)
        L_0x0253:
            X.C286565Wx.A0L(r7, r1)
            X.JBy r8 = new X.JBy
            r26 = r8
            r27 = r46
            r28 = r45
            r29 = r14
            r30 = r44
            r35 = r17
            r36 = r43
            r37 = r41
            r38 = r42
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            r7 = -2078443973(0xffffffff841d763b, float:-1.850955E-36)
            X.5PJ r9 = X.AnonymousClass5PI.A01(r5, r8, r7)
            int r7 = r0 >> 6
            r7 = r7 & 14
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
            int r0 = r0 >> 24
            r0 = r0 & 112(0x70, float:1.57E-43)
            r7 = r7 | r0
            int r0 = r6 << 6
            int r11 = X.C51969G9p.A04(r0, r7)
            r6 = r18
            r7 = r45
            r8 = r24
            r10 = r23
            r12 = r1
            X.C56235Hv2.A01(r5, r6, r7, r8, r9, r10, r11, r12)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00f3
            r0 = 40018012(0x262a05c, float:1.6649879E-37)
            X.0fL.A00(r0)
            goto L_0x00f3
        L_0x029f:
            if (r34 != 0) goto L_0x0253
            r9 = r46
            r8 = r44
            r9.A01(r8)
            goto L_0x0253
        L_0x02a9:
            r31 = r25
            goto L_0x0166
        L_0x02ad:
            r7 = r58 & r15
            if (r7 != 0) goto L_0x00d7
            r7 = r20
            int r7 = X.G9t.A0d(r5, r7)
            r6 = r6 | r7
            goto L_0x00d7
        L_0x02ba:
            r7 = r3 & 24576(0x6000, float:3.4438E-41)
            if (r7 != 0) goto L_0x00cf
            r7 = r21
            boolean r7 = r5.AGv(r7)
            if (r7 == 0) goto L_0x02c8
            r8 = 16384(0x4000, float:2.2959E-41)
        L_0x02c8:
            r6 = r6 | r8
            goto L_0x00cf
        L_0x02cb:
            r7 = r3 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x00c9
            r7 = r17
            boolean r7 = r5.AGv(r7)
            if (r7 != 0) goto L_0x02d9
            r9 = 1024(0x400, float:1.435E-42)
        L_0x02d9:
            r6 = r6 | r9
            goto L_0x00c9
        L_0x02dc:
            r7 = r3 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x00c3
            r7 = r22
            boolean r7 = r5.AGv(r7)
            if (r7 == 0) goto L_0x02ea
            r10 = 256(0x100, float:3.59E-43)
        L_0x02ea:
            r6 = r6 | r10
            goto L_0x00c3
        L_0x02ed:
            r7 = r58 & 48
            if (r7 != 0) goto L_0x00bd
            r7 = r23
            int r7 = X.G9t.A06(r5, r7)
            r6 = r6 | r7
            goto L_0x00bd
        L_0x02fa:
            r6 = r58 & 6
            if (r6 != 0) goto L_0x0308
            r6 = r24
            int r6 = X.G9t.A0O(r5, r6)
            r6 = r58 | r6
            goto L_0x00b7
        L_0x0308:
            r6 = r3
            goto L_0x00b7
        L_0x030b:
            r3 = r57 & r15
            if (r3 != 0) goto L_0x0067
            r3 = r42
            int r3 = X.G9t.A0d(r5, r3)
            r0 = r0 | r3
            goto L_0x0067
        L_0x0318:
            r3 = r4 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x005e
            r3 = r43
            int r3 = X.G9t.A0c(r5, r3)
            r0 = r0 | r3
            goto L_0x005e
        L_0x0325:
            r3 = r4 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x0054
            r3 = r33
            int r3 = X.G9t.A02(r5, r3)
            r0 = r0 | r3
            goto L_0x0054
        L_0x0332:
            r3 = r4 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x004a
            r3 = r45
            int r3 = X.G9t.A0Q(r5, r3)
            r0 = r0 | r3
            goto L_0x004a
        L_0x033f:
            r3 = r57 & 48
            if (r3 != 0) goto L_0x0042
            r3 = r44
            int r3 = X.G9t.A0P(r5, r3)
            r0 = r0 | r3
            goto L_0x0042
        L_0x034c:
            r0 = r57 & 6
            if (r0 != 0) goto L_0x035a
            r0 = r46
            int r0 = X.G9t.A0O(r5, r0)
            r0 = r0 | r57
            goto L_0x003c
        L_0x035a:
            r0 = r4
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HVB.A00(X.5Wy, androidx.compose.ui.Modifier, X.6D9, X.6D8, X.3WR, java.lang.String, java.lang.String, X.0sa, float, int, int, int, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }
}
